package fr.softeam.cameldesigner.exchange.exporter.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("e4bf5d5e-1230-4424-85d1-5bbba2276245")
public abstract class HardRequirementExporter<T extends HardRequirement> extends RequirementExporter<T> {
    @objid ("6058eb6c-8dc4-4384-a31b-82be42a9d7c7")
    public HardRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("91685785-fb84-43fc-aabe-292099911d21")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("cf736d5a-1660-4035-bcdb-4ff2959b0aa2")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("93309815-8409-4e69-998e-74bec89039e1")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
