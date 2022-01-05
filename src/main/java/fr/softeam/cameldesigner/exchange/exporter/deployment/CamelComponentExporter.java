package fr.softeam.cameldesigner.exchange.exporter.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("96db4239-5f7a-4cd1-a9d8-8345188c5255")
public abstract class CamelComponentExporter<T extends CamelComponent> extends FeatureExporter<T> {
    @objid ("1dda8931-2c02-465b-9612-c3401d4186e9")
    public CamelComponentExporter(T elt) {
        super(elt);
    }

    @objid ("ee20b053-f9eb-4ad5-a41d-2a15725758f8")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("696d40be-fc0b-4e51-9a39-da221b07bc5f")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
