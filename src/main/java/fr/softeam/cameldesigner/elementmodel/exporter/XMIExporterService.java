package fr.softeam.cameldesigner.elementmodel.exporter;

import java.util.HashMap;
import camel.core.CamelModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class XMIExporterService extends AbstractExporterService {
    private static String XMI_EXTENSION = ".xmi";

    public XMIExporterService() {
        super(new HashMap<String, Boolean>() , XMI_EXTENSION);
        
        this.options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
    }

    @Override
    protected void exportCamel(CamelModel camelModel, String filePath) {
        final XMIResourceImpl xmires = new XMIResourceImpl(URI.createFileURI(filePath));
        xmires.getContents().add(camelModel);
        try {
            xmires.save(this.options);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
