package fr.softeam.cameldesigner.exchange.exporter.organisation;

import java.util.ArrayList;
import java.util.List;
import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("fea0ec12-2e76-49a4-b094-74ff7cbf8331")
public class SoftwareComponentResourceFilterExporter<T extends SoftwareComponentResourceFilter> extends ResourceFilterExporter<T> {
    @objid ("d4737229-a7c6-43f1-a7f5-2c05a0f3d78b")
    public SoftwareComponentResourceFilterExporter(T elt) {
        super(elt);
    }

    @objid ("3bb91668-8cfd-49c0-814a-33488eb4532e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createSoftwareComponentResourceFilter();
    }

    @objid ("8f385d7e-a6f2-4947-ab99-b3a1e525f621")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.organisation.SoftwareComponentResourceFilter) {
            camel.organisation.SoftwareComponentResourceFilter scrf = (camel.organisation.SoftwareComponentResourceFilter) elt;
            setEveryComponent(scrf);
            setSoftwareComponent(scrf);
        }
    }

    @objid ("0874e6dd-b7f9-4538-81f2-66b1ff304c3f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("9bf102ae-8c31-4552-8530-76788bb17a85")
    private void setEveryComponent(camel.organisation.SoftwareComponentResourceFilter scrf) {
        scrf.setEveryComponent(this._element.isEveryComponent());
    }

    @objid ("6550a3a4-9f97-4763-86ed-86110dbe5e00")
    private void setSoftwareComponent(camel.organisation.SoftwareComponentResourceFilter scrf) {
        List<camel.deployment.SoftwareComponent> comps = new ArrayList<>();
        for (SoftwareComponent comp : this._element.getSoftwareComponents()) {
            CDOObject camelComp = this._process.getElement(comp);
            if ((camelComp != null) &&  (camelComp instanceof camel.deployment.SoftwareComponent))
                comps.add((camel.deployment.SoftwareComponent) camelComp);
        }
        
        scrf.getSoftwareComponents().addAll(comps);
    }

}
