package fr.softeam.cameldesigner.exchange.exporter.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.ScaleRequirement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f823b6ec-d581-42e7-931e-112fc141beec")
public abstract class ScaleRequirementExporter<T extends ScaleRequirement> extends RequirementExporter<T> {
    @objid ("2b507546-520f-4204-938b-f9320374b796")
    public ScaleRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("27f47d4c-dc48-444d-ae3a-6ed997eb7b91")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("f98d37ef-3aa7-4bc3-bbc0-2328b1b7f229")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("86bf061d-4a72-49aa-818f-e58ea325026b")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
