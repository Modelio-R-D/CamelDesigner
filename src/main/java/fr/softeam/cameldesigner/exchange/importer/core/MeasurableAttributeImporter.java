package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.MeasurableAttribute;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.MeasurableAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.statik.Package;

@objid ("140dee83-8c43-420a-9d7c-64075ff03fc9")
public class MeasurableAttributeImporter<T extends MeasurableAttribute, V extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute> extends QualityAttributeImporter<T,V> {
    @objid ("8eefc56f-aa35-4e1c-b641-2e6ed436f24b")
    public MeasurableAttributeImporter() {
    }

    @objid ("3e11cda3-f303-4dfc-b4ea-e81a534b1694")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMeasurableAttribute(this);
    }

    @objid ("4538d7c2-d164-4e3d-9e55-eff834462f47")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

    @objid ("0d5f4286-44ea-40ab-8844-9ee213424671")
    @Override
    public void attach(V elt, CamelElement context) {
        if ((context instanceof MetricTypeModel) && (elt instanceof AttributeClass)) {
            ((MetricTypeModel) context).addAttributes((AttributeClass) elt);
        }
    }

    @objid ("3a82108e-9985-43ab-997d-6d34c05739af")
    public MeasurableAttributeImporter(T elt) {
        super(elt);
    }

    @objid ("3314abcb-df01-4214-9cf6-4bfed700c96f")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        CamelElement camOwner = this._process.getElement(owner);
        
        if (camOwner != null) {
            if (camOwner.getElement() instanceof Package) {
                    return MeasurableAttributeClass.create();
            }else {
                return MeasurableAttributeAttribute.create();
            }
        }
        return null;
    }

}
