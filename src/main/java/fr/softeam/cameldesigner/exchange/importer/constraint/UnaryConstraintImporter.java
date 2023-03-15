package fr.softeam.cameldesigner.exchange.importer.constraint;

import java.util.Date;
import camel.constraint.ComparisonOperatorType;
import camel.constraint.UnaryConstraint;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("150f8dbd-6516-4c98-9f03-2781653055a5")
public abstract class UnaryConstraintImporter<T extends UnaryConstraint, V extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.UnaryConstraint> extends CamelConstraintImporter<T,V> {
    @objid ("f03af0f6-2281-4387-b552-f767a758e841")
    public UnaryConstraintImporter() {
    }

    @objid ("2da14eed-965d-436a-8e00-b930c3e5cb14")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitUnaryConstraint(this);
    }

    @objid ("dd412d04-a8ec-48a9-bcae-e1780ec6419f")
    public UnaryConstraintImporter(T elt) {
        super(elt);
    }

    @objid ("ce1311b4-b045-4084-bf1d-42a583b844f3")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setValidity(elt);
        setComparisonOperator(elt);
        setThreshold(elt);
    }

    @objid ("8315b108-1ecd-480d-9992-b6c7201fda93")
    private void setThreshold(V elt) {
        elt.setThreshold(String.valueOf(this._element.getThreshold()));
    }

    @objid ("ed2b904c-5230-4786-b031-0ae8429bca65")
    private void setComparisonOperator(V elt) {
        ComparisonOperatorType value = this._element.getComparisonOperator();
        if (value != null) {
            elt.setComparisonOperator(value.toString());
        }
    }

    @objid ("0dff364e-21c0-4c04-ba05-98c9003a7319")
    private void setValidity(V elt) {
        Date value = this._element.getValidity();
        if (value != null) {
            elt.setValidity(value.toString());
        }
    }

}
