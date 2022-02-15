package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8ac5b9ff-e7b4-4179-8918-cad2c82958c5")
public class RequirementModelExporter<T extends RequirementModel> extends SubModelExporter<T> {
    @objid ("ab5fc3c3-2b2a-4176-a4cd-b6ee03f272f0")
    public RequirementModelExporter(T elt) {
        super(elt);
    }

    @objid ("a940a1a3-7a33-46da-aa16-c9b94f9cbe5c")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createRequirementModel();
    }

    @objid ("bbffcbec-36c6-4af8-80c3-f5c64e79a408")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("f7428997-5c75-4a91-bb9d-2e6716c639f5")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.core.CamelModel) && (elt instanceof camel.requirement.RequirementModel)) {
            ((camel.core.CamelModel) context).getRequirementModels().add((camel.requirement.RequirementModel) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
