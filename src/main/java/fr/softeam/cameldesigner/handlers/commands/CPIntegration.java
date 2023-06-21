package fr.softeam.cameldesigner.handlers.commands;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerParameters;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.profiler.standard.component.ProfilerComponent;
import fr.softeam.cameldesigner.profiler.data.Category;
import fr.softeam.cameldesigner.profiler.data.ProvidingInfo;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.configuration.IModuleUserConfiguration;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("b47433b3-b298-484f-86b0-ecc324cea686")
public class CPIntegration extends DefaultModuleCommandHandler {
    @objid ("d9362e0a-9c2c-494c-bc41-7a353321f32f")
    private String _URL = null;

    @objid ("cf50ed43-5f68-4315-ba53-2a8e6cbffdb3")
    private final String _catAnnotationName = "categorie";

    @objid ("d6a4c751-7f33-44fb-b51a-7f2fb775f7dd")
    private final String _langAnnotationName = "language";

    @objid ("cb640dc2-d650-4975-8e71-fb725fc488cf")
    private final String _repAnnotationName = "repository";

    @objid ("c5c5d3d2-6014-467b-a003-4f10ea7e6be1")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        SoftwareComponent sc = SoftwareComponent.instantiate(((Component) selectedElements.get(0)));
        
        if (sc != null) {
        
            IModuleUserConfiguration configuration = module.getModuleContext().getConfiguration();
            this._URL = "http://" + configuration.getParameterValue(CamelDesignerParameters.IPADRESSE) + ":" + configuration.getParameterValue(CamelDesignerParameters.PORT);
        
            ProvidingInfo info = getInfos(sc);
        
            String response = pushAnalyse(info);
        
            if (response != null) {
                setCode(response, sc);
            }
        }
    }

    @objid ("190e22d0-fa2c-4b4f-ae34-07fe0834082b")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        // Generated call to the super method will check the scope conditions defined in Studio.
        // DO NOT REMOVE this call unless you need to take full control on the checks to be carried out.
        // However you can safely extends the checked conditions by adding custom code.
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        return true;
    }

    @objid ("c6cbe72f-e9ed-4355-bd32-98961b548a26")
    private void getResponseAnalyse(String code) {
        try {
        
            URL url = new URL(_URL + "/collect?code=" + code );
        
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
        
            //Getting the response code
            int responsecode = conn.getResponseCode();
        
            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {
        
                String inline = "";
                Scanner scanner = new Scanner(url.openStream());
        
                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
        
                //Close the scanner
                scanner.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @objid ("fa22bf0f-e5c5-4d61-8ded-73df768d3d47")
    private String pushAnalyse(ProvidingInfo info) {
        String result = null;
        URL url;
        
        try {
            url = new URL(this._URL + "/analyse");
        
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            http.setRequestMethod("POST");
            http.setDoOutput(true);
            http.setRequestProperty("Accept", "application/json");
            http.setRequestProperty("Content-Type", "application/json");
        
            String data = "[{\"component_name\": \"" + info.getComponentName() +
                    "\", \"categories\": [\""+ info.getCategories().get(0).toString().toLowerCase() +
                    "\"], \"repository\": \""+ info.getRepository()  +
                    "\", \"language\": \""+ info.getLanguage() + "\"}]";
        
        
            byte[] out = data.getBytes(StandardCharsets.UTF_8);
        
            OutputStream stream = http.getOutputStream();
            stream.write(out);
        
            System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        
            int status = http.getResponseCode();
        
            switch (status) {
            case 200:
            case 201:
                BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line+"\n");
                }
                br.close();
                System.out.println(sb.toString());
                result = sb.toString();
            }
        
        
            stream.close();
            http.disconnect();
        } catch (Exception e) {
            return null;
        }
        return result;
    }

    @objid ("44e33ca3-062e-40e8-9a78-6b1db733931b")
    private ProvidingInfo getInfos(SoftwareComponent sc) {
        ProvidingInfo info = new ProvidingInfo();
        
        info.setComponentName(sc.getName());
        
        for (AttributeAttribute attribut : sc.getAttributes()) {
        
            for(MmsObject annotation : attribut.getAnnotations()) {
        
                if (annotation.getName().equals(this._catAnnotationName)){
                    info.getCategories().add(Category.valueOf(attribut.getElement().getValue()));
                } else if (annotation.getName().equals(this._langAnnotationName)){
                    info.setLanguage(attribut.getElement().getValue());
                } else if (annotation.getName().equals(this._repAnnotationName)){
                    info.setRepository(attribut.getElement().getValue());
                }
            }
        
        }
        return info;
    }

    @objid ("02b496a5-75b8-4332-b471-7bb4e97fd9b2")
    private void setCode(String response, SoftwareComponent sc) {
        String[] splt = response.split("code");
        if (splt.length == 2) {
            String temp = splt[1];
            temp.replaceFirst("\"", "");
            String code = temp.split("\"")[0];
            Component comp = sc.getElement();
            comp.getExtension().add(ProfilerComponent.MdaTypes.STEREOTYPE_ELT);
            ProfilerComponent pc = ProfilerComponent.instantiate(comp);
            pc.setCode(code);
        }
    }

}
