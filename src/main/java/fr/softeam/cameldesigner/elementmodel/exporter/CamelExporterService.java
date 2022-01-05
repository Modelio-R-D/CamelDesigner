package fr.softeam.cameldesigner.elementmodel.exporter;

import java.io.IOException;
import java.util.HashMap;
import camel.core.CamelModel;
import com.google.inject.Injector;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.conversion.CamelDslManager;
<<<<<<< HEAD
import fr.softeam.cameldesigner.exchange.exporter.AbstractExporterService;
=======
import fr.softeam.cameldesigner.exchange.AbstractExporterService;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtext.resource.XtextResourceSet;

@objid ("54c69664-e3ea-4815-a56a-f44aff9ecbb1")
public class CamelExporterService extends AbstractExporterService {
    @objid ("5c15c3af-00dd-4356-926e-8a3f9d33d276")
    private static String CAMEL_EXTENSION = ".camel";

    @objid ("752cb947-fcaf-4b12-af3e-9327bd0b5fa2")
    public CamelExporterService() {
        super(new HashMap<String, Boolean>() , CAMEL_EXTENSION);
        
        this.options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
    }

    @objid ("685188e1-9da5-40f6-bf9f-5072178cf765")
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
