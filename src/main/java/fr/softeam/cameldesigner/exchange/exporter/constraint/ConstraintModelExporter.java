package fr.softeam.cameldesigner.exchange.exporter.constraint;

import camel.constraint.ConstraintFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f2ea9466-a381-42e9-8512-232cb1eaa7db")
public class ConstraintModelExporter<T extends ConstraintModel> extends SubModelExporter<T> {
    @objid ("37b8bced-af15-47f4-a099-77b41437a456")
    public ConstraintModelExporter(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("8122b882-5b28-4ab2-a8c2-4c0118b9ede6")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ConstraintFactory.eINSTANCE.createConstraintModel();
    }

    @objid ("772ba942-6590-46c3-b290-36c828e1e2a8")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("d5d12a58-d34a-4156-a7ad-add190f63b12")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.core.CamelModel) && (elt instanceof camel.constraint.ConstraintModel)) {
            ((camel.core.CamelModel) context).getConstraintModels().add((camel.constraint.ConstraintModel) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
