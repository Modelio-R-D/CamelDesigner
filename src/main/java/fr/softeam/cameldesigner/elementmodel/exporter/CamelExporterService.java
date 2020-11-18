package fr.softeam.cameldesigner.elementmodel.exporter;

import java.io.IOException;
import java.util.HashMap;
import camel.core.CamelModel;
import com.google.inject.Injector;
import fr.softeam.cameldesigner.conversion.CamelDslManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtext.resource.XtextResourceSet;

public class CamelExporterService extends AbstractExporterService {
    private static String CAMEL_EXTENSION = ".camel";

    public CamelExporterService() {
        super(new HashMap<String, Boolean>() , CAMEL_EXTENSION);
        
        this.options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
    }

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
