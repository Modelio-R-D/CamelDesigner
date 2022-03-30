package fr.softeam.cameldesigner.exchange.exporter.unit;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureDataTypeExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("7f76c9b0-58cd-4121-ac7e-345119a3521a")
public abstract class UnitDimensionExporter<T extends UnitDimension> extends FeatureDataTypeExporter<FeatureDataType> {
    @objid ("47ef0429-cf4c-4f4d-a975-4b03c261e7f8")
    public UnitDimensionExporter(T elt) {
        super(elt);
    }

    @objid ("8d0453a8-242e-4e6e-a5a1-abeeb51cdfbc")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("1edd0a7b-fe48-461a-b797-5e5f87148def")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("8563226c-e673-45a3-b181-dbfdc74b083b")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.unit.UnitModel) && (elt instanceof camel.unit.UnitDimension)) {
            ((camel.unit.UnitModel) context).getDimensions().add((camel.unit.UnitDimension) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
