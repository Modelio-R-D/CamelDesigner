package fr.softeam.cameldesigner.exchange.exporter.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d3f288a8-ac25-4643-a0b9-644d86858822")
public class AttributeConstraintExporter<T extends AttributeConstraint> extends UnaryConstraintExporter<T> {
    @objid ("075c46ff-b7a4-48fa-a26e-798e284795a2")
    public AttributeConstraintExporter(T elt) {
        super(elt);
    }

    @objid ("2459ef05-62fa-4340-a89a-721a87851d7b")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("3b91dfe7-3f90-4328-afa6-6a4694042dc0")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.constraint.AttributeConstraint) {
            camel.constraint.AttributeConstraint attConst = (camel.constraint.AttributeConstraint) elt;
            setAttributeContext(attConst);
        }
    }

    @objid ("dc9504ab-5ae5-4d4f-99e3-96841b9b9687")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("29d8fa9b-f320-4ee3-a0dc-bca11a8b339e")
    private void setAttributeContext(camel.constraint.AttributeConstraint attConst) {
        CDOObject attContext =  this._process.getElement(this._element.getAttributeContext());
        if ((attContext != null) &&  (attContext instanceof camel.metric.AttributeContext))
            attConst.setAttributeContext((camel.metric.AttributeContext) attContext);
    }

}
