package fr.softeam.cameldesigner.exchange.exporter.type;

import camel.type.TypeFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f57aac87-8a86-47f2-8c4a-026394330d5c")
public class RangeExporter<T extends Range> extends ValueTypeExporter<T> {
    @objid ("c136f186-1a9c-4b2a-a319-28ee8ae53977")
    public RangeExporter(T elt) {
        super(elt);
    }

    @objid ("09701327-6fa9-4f5d-8d14-ae8615f0bafb")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createRange();
    }

    @objid ("ef377ee6-481c-4ee6-b208-5c55e3fbac79")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("22ee8ad9-d281-459d-ab08-d4b4edde428f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.type.TypeModel) && (elt instanceof camel.type.ValueType)) {
            ((camel.type.TypeModel) context).getValueTypes().add((camel.type.ValueType) elt);
        }
    }

}
