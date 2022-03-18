package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("5d6c0e9e-f9b6-4661-9cd3-a1b237b381bc")
public class OSRequirementExporter<T extends OSRequirement> extends HardRequirementExporter<T> {
    @objid ("e252e97b-c6b3-4e6d-bc67-7f73fecf9a64")
    public OSRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("64698b38-3c56-4b26-9507-3e1b6d6fe8bf")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.requirement.OSRequirement) {
            camel.requirement.OSRequirement osr = (camel.requirement.OSRequirement) elt;
            setOS(osr);
            set64OS(osr);
        }
    }

    @objid ("d302ffb0-702f-4478-8828-d755b27ea8e8")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("4355df39-6d28-48c1-8737-dfc88b91c1b5")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createOSRequirement();
    }

    @objid ("738e60cc-3533-49ef-a57e-6e493bcbb4ec")
    private void set64OS(camel.requirement.OSRequirement osr) {
        osr.setIs64os(this._element.isIs64os());
    }

    @objid ("debb8da0-29f9-4766-9e6f-3b24c64dc498")
    private void setOS(camel.requirement.OSRequirement osr) {
        String content = this._element.getOs();
        if (content != null)
            osr.setOs(content);
    }

}
