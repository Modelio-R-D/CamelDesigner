package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.requirement.OSRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("0bd9d50c-6ce9-43a1-a14f-b0e853ec3f95")
public class OSRequirementImporter<T extends OSRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement> extends HardRequirementImporter<T,V> {
    @objid ("8b307d3f-8da3-4de5-8144-8a35560c79f5")
    public OSRequirementImporter() {
    }

    @objid ("1cf44985-f4e2-4a16-a7f1-7bef38dac750")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitOSRequirement(this);
    }

    @objid ("27d97a7f-bcaf-4a6e-af15-8c7ebc51f997")
    public OSRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("67094dbd-a496-4303-bc83-a6896440108d")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement.create();
    }

    @objid ("bf561c6a-449c-4aac-a3db-f66067cb94b8")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel)
            ((RequirementModel)context).addRequirements(elt);
        else
            super.attach(elt, context);
    }

    @objid ("ba4b4a75-2b79-40fe-a8c4-af2af321a8b3")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setOs(elt);
        setIs64os(elt);
    }

    @objid ("891970cc-de9a-41a0-aaf0-cf7a5eb5f15f")
    private void setOs(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getOs();
        if (value != null) {
            elt.setOs(value);
        }
    }

    @objid ("ef5ccf24-478a-40f8-ad34-a6e6f997b44e")
    private void setIs64os(V elt) {
        // TODO Auto-generated method stub
        Boolean value = this._element.isIs64os();
        if (value != null) {
            elt.setIs64os(value);
        }
    }

}
