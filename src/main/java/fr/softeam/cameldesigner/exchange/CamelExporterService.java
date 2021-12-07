package fr.softeam.cameldesigner.exchange;

import java.io.IOException;
import java.util.HashMap;
import camel.core.CamelModel;
import com.google.inject.Injector;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.conversion.CamelDslManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtext.resource.XtextResourceSet;

@objid ("e62ad0fc-2af1-48d8-9bb4-efeaceae6cf6")
public class CamelExporterService extends AbstractExporterService {
    @objid ("a3a86c0f-ac16-4000-98cd-3f0174be4958")
    private static final String CAMEL_EXTENSION = ".camel";

    @objid ("edc811ac-db21-49e1-a86c-128b5e5bef7e")
    public CamelExporterService() {
        super(new HashMap<String, Boolean>() , CAMEL_EXTENSION);
        this.options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
    }

    @objid ("8e76981a-0d93-4e9e-b4a2-7741f682cc2f")
    @Override
    protected void exportCamel(CamelModel camelModel, String filePath) {
        Injector injector = CamelDslManager.getInstance().getInjector();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        
        Resource resource = resourceSet.createResource(URI.createFileURI(filePath));
        
        resource.getContents().add(camelModel);
        
        try {
            resource.save(this.options);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
