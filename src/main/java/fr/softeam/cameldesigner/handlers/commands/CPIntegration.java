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
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
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

    @objid ("c5c5d3d2-6014-467b-a003-4f10ea7e6be1")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        SoftwareComponent sc = SoftwareComponent.instantiate(((Component)selectedElements.get(0)));
        
        if (sc != null) {
        
            IModuleUserConfiguration configuration = module.getModuleContext().getConfiguration();
            this._URL = "http://" + configuration.getParameterValue(CamelDesignerParameters.IPADRESSE) + ":" + configuration.getParameterValue(CamelDesignerParameters.PORT);
        
            ProvidingInfo info = new ProvidingInfo();
            info.setComponentName(sc.getName());
            info.getCategories().add(Category.GPU);
            info.setLanguage("Java");
            info.setRepository("https://github.com/Supervisor/supervisor");
        
        
            String code = pushAnalyse(info);
        
            if (code != null) {
                getResponseAnalyse(code);
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
    public void getResponseAnalyse(String code) {
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
        
                //                //Using the JSON simple library parse the string into a json object
                //                JSONParser parse = new JSONParser();
                //                JSONObject data_obj = (JSONObject) parse.parse(inline);
                //
                //                //Get the required object from the above created object
                //                JSONObject obj = (JSONObject) data_obj.get("Global");
                //
                //                //Get the required data using its key
                //                System.out.println(obj.get("TotalRecovered"));
                //
                //                JSONArray arr = (JSONArray) data_obj.get("Countries");
                //
                //                for (int i = 0; i < arr.size(); i++) {
                //
                //                    JSONObject new_obj = (JSONObject) arr.get(i);
                //
                //                    if (new_obj.get("Slug").equals("albania")) {
                //                        System.out.println("Total Recovered: " + new_obj.get("TotalRecovered"));
                //                        break;
                //                    }
                //                }
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @objid ("fa22bf0f-e5c5-4d61-8ded-73df768d3d47")
    public String pushAnalyse(ProvidingInfo info) {
        String result = null;
        URL url;
        
        try {
            url = new URL(_URL + "/analyse");
        
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
            }
        
        
            stream.close();
            http.disconnect();
        } catch (Exception e) {
           return null;
        }
        return result;
    }

}
