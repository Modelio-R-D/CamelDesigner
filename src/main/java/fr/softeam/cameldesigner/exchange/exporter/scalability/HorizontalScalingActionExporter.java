package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.ScalabilityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8e0d0a50-cc4d-4d4f-b36b-54a199d1cf08")
public class HorizontalScalingActionExporter<T extends HorizontalScalingAction> extends FeatureExporter<T> {
    @objid ("e987c2d2-3f2e-40ab-84c8-576711ecacdc")
    public HorizontalScalingActionExporter(T elt) {
        super(elt);
    }

    @objid ("ab998e98-da1b-4382-811d-1f26eec6a62b")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createHorizontalScalingAction();
    }

    @objid ("94dff995-8c8d-4b30-b9aa-190a913190be")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("ec49c2f8-8478-42c7-83fe-3f60036c40a7")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
