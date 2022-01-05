package fr.softeam.cameldesigner.elementmodel.exporter;

import java.util.HashMap;
import camel.core.CamelModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
<<<<<<< HEAD
import fr.softeam.cameldesigner.exchange.exporter.AbstractExporterService;
=======
import fr.softeam.cameldesigner.exchange.AbstractExporterService;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

@objid ("504592bf-d124-4fc3-b1e5-22a8f3b10c40")
public class XMIExporterService extends AbstractExporterService {
    @objid ("1886e041-449a-4f7e-9cb0-7a014c631cfb")
    private static String XMI_EXTENSION = ".xmi";

    @objid ("196441a9-1ad3-421d-b0f3-fb45fcbda098")
    public XMIExporterService() {
        super(new HashMap<String, Boolean>() , XMI_EXTENSION);
        
        this.options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
    }

    @objid ("670ec2b6-b27d-4c8e-b0ba-5af8fbe4c5e1")
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
