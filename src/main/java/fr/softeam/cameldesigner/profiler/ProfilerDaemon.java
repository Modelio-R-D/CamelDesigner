package fr.softeam.cameldesigner.profiler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.TimerTask;
import java.util.stream.Collectors;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerParameters;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.profiler.standard.component.ProfilerComponent;
import org.eclipse.emf.common.util.EList;
import org.modelio.api.module.IModule;
import org.modelio.api.module.context.configuration.IModuleUserConfiguration;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Component;

@objid ("235c2785-ceff-4111-a446-d85afdacf1a3")
public class ProfilerDaemon extends TimerTask {
    @objid ("73ddaa77-e3ab-4117-8ab3-38a883677744")
    private String _URL = "";

    @objid ("a77baedd-1722-425c-a40a-bbfd28f084c9")
    private final String _catAnnotationName = "categorie";

    @objid ("71544be6-0d63-4fcf-a69f-afd27ee8a947")
    private IModule _module = null;

    @objid ("6fb130d5-732d-461d-bd6c-4e2781e84900")
    @Override
    public void run() {
        EList<ModelElement> _comps = ProfilerComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        
        for (ModelElement comp : _comps) {
            ProfilerComponent pc = ProfilerComponent.instantiate((Component) comp);
            String code = pc.getCode();
            if (!(code.equals(""))) {
                String response = getResponseAnalyse(code);
                if (response.contains("suggested_categories")) {
                    List<String> sugCategories = Arrays.stream(response.split("[")[1].split("]")[0].replace("\"", "").split(",")).collect(Collectors.toList());
        
                    //remove existing categories
                    for (AttributeAttribute attribut : pc.getAttributes()) {
                        for(MmsObject annotation : attribut.getAnnotations()) {
                            if (annotation.getName().equals(this._catAnnotationName)){
                                sugCategories.remove(attribut.getElement().getValue());
                            }
                        }
                    }
        
                    //add missing ones
                    MmsObject annotation = null;
                    for (ModelElement mmsObject : MmsObject.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                        if (mmsObject.getName().equals(_catAnnotationName))
                            annotation = MmsObject.instantiate(mmsObject);
                    }
        
                    for (String cat : sugCategories) {
                        AttributeAttribute sugAtt = AttributeAttribute.create();
                        sugAtt.setParent(pc);
                        sugAtt.getElement().setValue(cat);
                        sugAtt.getAnnotations().add(annotation);
                    }
        
                }
            }
        }
    }

    @objid ("85e9b04b-f6ba-41a2-b72d-7cb140b64c96")
    public void setModule(final IModule module) {
        this._module = module;
    }

    @objid ("436b58f3-76b5-4816-ab5c-c2b7f8d0fb43")
    private String getResponseAnalyse(String code) {
        String result = "";
        try {
        
            System.out.println("collection of data");
            IModuleUserConfiguration configuration = this._module.getModuleContext().getConfiguration();
            this._URL = "http://" + configuration.getParameterValue(CamelDesignerParameters.IPADRESSE) + ":" + configuration.getParameterValue(CamelDesignerParameters.PORT);
            URL url = new URL(this._URL + "/collect?code=" + code );
        
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
        
            //Getting the response code
            int status = conn.getResponseCode();
        
            switch (status) {
            case 200:
            case 201:
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line+"\n");
                }
                br.close();
                System.out.println(sb.toString());
                result = sb.toString();
            }
        
        
            conn.disconnect();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
