package fr.softeam.cameldesigner.exchange.exporter.requirement;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.requirement.RequirementFactory;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;

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
        if (elt instanceof camel.requirement.SecurityRequirement) {
            setSecurityControls((camel.requirement.SecurityRequirement) elt);
        }
    }

    @objid ("1a52af56-c5ab-486f-ab93-94c85131d2c1")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.security.SecurityModel) && (elt instanceof camel.requirement.SecurityRequirement)) {
            ((camel.security.SecurityModel) context).getSecurityRequirements().add((camel.requirement.SecurityRequirement) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("8ee43a1f-2d4e-478a-b2b5-975cd8d45393")
    private void setSecurityControls(camel.requirement.SecurityRequirement sr) {
        List<camel.security.SecurityControl> controls = new ArrayList<>();
        for (SecurityControl sc : this._element.getSecurityControls()) {
            CDOObject camelSc = this._process.getElement(sc);
            if ((camelSc != null) &&  (camelSc instanceof camel.security.SecurityControl))
                controls.add((camel.security.SecurityControl) camelSc);
        }

        sr.getSecurityControls().addAll(controls);
    }

}
