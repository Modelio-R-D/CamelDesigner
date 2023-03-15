package fr.softeam.cameldesigner.exchange.exporter.unit;

import camel.unit.UnitFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("040710ef-dcad-48b5-9676-f360ce3a71d5")
public class UnitModelExporter<T extends UnitModel> extends SubModelExporter<T> {
    @objid ("2905dfaa-9e19-454e-9f78-b378c0ab630e")
    public UnitModelExporter(T elt) {
        super(elt);
    }

    @objid ("ecf8ab8f-6d86-4703-8ee7-df98e6fff8af")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return UnitFactory.eINSTANCE.createUnitModel();
    }

    @objid ("647efdb6-e9ad-4b37-a724-a4e12420afcc")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("a8e2b5fa-4777-4bd5-810d-c35f0dc7a332")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.core.CamelModel) && (elt instanceof camel.unit.UnitModel)) {
            ((camel.core.CamelModel) context).getUnitModels().add((camel.unit.UnitModel) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
