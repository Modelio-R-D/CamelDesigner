package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8177f8dc-af29-4754-84a9-5d77be30b41c")
public class SecurityRequirementExporter<T extends SecurityRequirement> extends HardRequirementExporter<T> {
    @objid ("6079e213-c1fe-4bd0-9122-df65304a58a8")
    public SecurityRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("8c0b28c6-597d-4560-b6c1-1f1d2340f6ac")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createSecurityRequirement();
    }

    @objid ("8fdef02c-1995-4c47-befd-8f0902b796bd")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("1a52af56-c5ab-486f-ab93-94c85131d2c1")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
