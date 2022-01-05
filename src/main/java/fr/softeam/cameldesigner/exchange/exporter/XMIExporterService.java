package fr.softeam.cameldesigner.exchange.exporter;

import java.util.HashMap;
import camel.core.CamelModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

@objid ("5f03f39d-263a-40ff-83b9-961b06f9d2cc")
public class XMIExporterService extends AbstractExporterService {
    @objid ("4a443ff2-4e9a-4ac0-8a6b-4cc8f93e0cc2")
    private static final String XMI_EXTENSION = ".xmi";

    @objid ("b2729d57-cc08-4f8a-9b66-77434f527e8b")
    public XMIExporterService() {
        super(new HashMap<String, Boolean>() , XMI_EXTENSION);
        this.options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
    }

    @objid ("52a4ed8e-bd88-4400-89af-1f32e9f77b86")
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
