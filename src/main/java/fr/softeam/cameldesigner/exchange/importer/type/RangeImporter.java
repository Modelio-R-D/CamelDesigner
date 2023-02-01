package fr.softeam.cameldesigner.exchange.importer.type;

import camel.type.Limit;
import camel.type.Range;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.utils.PrimitiveTypeUtils;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8fea8dba-42d0-494b-a6c9-bc28c611951a")
public class RangeImporter<T extends Range, V extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range> extends ValueTypeImporter<T,V> {
    @objid ("72d9476a-4c9c-45b9-aade-58c1f8a17245")
    public RangeImporter() {
    }

    @objid ("4972efdf-c6e9-4470-a483-7ab3adb5a4d3")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRange(this);
    }

    @objid ("45316610-f072-4365-a780-892d5aedc141")
    public RangeImporter(T elt) {
        super(elt);
    }

    @objid ("7a21c986-d331-43ad-8f46-374fb61a12b0")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("3bc32a1d-80b0-459a-87ec-87446c597928")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range.create();
    }

    @objid ("ced7cb84-b4f9-4a44-b08f-f3f223ff70d7")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setLowerLimit(elt);
        setUpperLimit(elt);
    }

    @objid ("5d222403-9272-4a1b-a4a1-c27136c207a7")
    private void setLowerLimit(V elt) {
        Limit ll = this._element.getLowerLimit();
        if (ll != null) {
            elt.setLowerLimit(PrimitiveTypeUtils.getValue(ll.getValue()));
            elt.setIsLowerLimitIncluded(ll.isIncluded());
        }
    }

    @objid ("7a6b1a06-dd23-4521-82f5-9071e4375719")
    private void setUpperLimit(V elt) {
        Limit ul = this._element.getLowerLimit();
        if (ul != null) {
            elt.setUpperLimit(PrimitiveTypeUtils.getValue(ul.getValue()));
            elt.setIsUpperLimitIncluded(ul.isIncluded());
        }
    }

}
