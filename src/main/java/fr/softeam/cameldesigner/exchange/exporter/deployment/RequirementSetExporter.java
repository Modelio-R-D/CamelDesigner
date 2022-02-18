package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureClassExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8d02a0b1-1c56-4dc4-b79d-8bb2ec0dac1d")
public class RequirementSetExporter<T extends RequirementSet> extends FeatureClassExporter<T> {
    @objid ("2072bc9f-d873-451f-b629-cc46fc0e8df5")
    public RequirementSetExporter(T elt) {
        super(elt);
    }

    @objid ("8e4c3e11-4897-47e7-a7db-7e4a41f558cc")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createRequirementSet();
    }

    @objid ("ce9483e4-f81e-4ae8-918c-ee966163bb11")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.RequirementSet) {
            camel.deployment.RequirementSet rs = (camel.deployment.RequirementSet) elt;
            setResourceRequirement(rs);
            setPaasRequirement(rs);
            setLocationRequirement(rs);
            setProviderRequirement(rs);
            setVerticalScaleRequirement(rs);
            setHorizontalScaleRequirement(rs);
            setSecurityRequirement(rs);
            setOsRequirement(rs);
            setImageRequirement(rs);
        }
    }

    @objid ("3d212279-37a3-42d0-9baf-85430e6ab94b")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentTypeModel) && (elt instanceof camel.deployment.RequirementSet)) {
            ((camel.deployment.DeploymentTypeModel) context).getRequirementSets().add((camel.deployment.RequirementSet) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("559f4bbb-975d-4a15-aefa-bedf394bbc25")
    private void setImageRequirement(camel.deployment.RequirementSet rs) {
        CDOObject ir = this._process.getElement(this._element.getImageRequirement());
        if ((ir != null) &&  (ir instanceof camel.requirement.ImageRequirement))
            rs.setImageRequirement((camel.requirement.ImageRequirement) ir);
    }

    @objid ("1b52a148-7505-4130-a6d6-aa811ce8ad6b")
    private void setOsRequirement(camel.deployment.RequirementSet rs) {
        CDOObject os = this._process.getElement(this._element.getOsRequirement());
        if ((os != null) &&  (os instanceof camel.requirement.OSRequirement))
            rs.setOsRequirement((camel.requirement.OSRequirement) os);
    }

    @objid ("2367c86f-ab24-47e2-b516-f6f5f95d5afe")
    private void setSecurityRequirement(camel.deployment.RequirementSet rs) {
        CDOObject sr = this._process.getElement(this._element.getSecurityRequirement());
        if ((sr != null) &&  (sr instanceof camel.requirement.SecurityRequirement))
            rs.setSecurityRequirement((camel.requirement.SecurityRequirement) sr);
    }

    @objid ("9518ecdd-187a-4d57-9392-b8bf46f42a75")
    private void setHorizontalScaleRequirement(camel.deployment.RequirementSet rs) {
        CDOObject hsr = this._process.getElement(this._element.getHorizontalScaleRequirement());
        if ((hsr != null) &&  (hsr instanceof camel.requirement.HorizontalScaleRequirement))
            rs.setHorizontalScaleRequirement((camel.requirement.HorizontalScaleRequirement) hsr);
    }

    @objid ("4abf443a-6883-4d2a-a6b4-ed052cca5d23")
    private void setVerticalScaleRequirement(camel.deployment.RequirementSet rs) {
        CDOObject vsr = this._process.getElement(this._element.getVerticalScaleRequirement());
        if ((vsr != null) &&  (vsr instanceof camel.requirement.VerticalScaleRequirement))
            rs.setVerticalScaleRequirement((camel.requirement.VerticalScaleRequirement) vsr);
    }

    @objid ("4f84e74e-6342-4462-9305-a349c2e0e618")
    private void setProviderRequirement(camel.deployment.RequirementSet rs) {
        CDOObject pr = this._process.getElement(this._element.getProviderRequirement());
        if ((pr != null) &&  (pr instanceof camel.requirement.ProviderRequirement))
            rs.setProviderRequirement((camel.requirement.ProviderRequirement) pr);
    }

    @objid ("5c2b73e7-4eac-44ad-b5f2-2450915ca34a")
    private void setLocationRequirement(camel.deployment.RequirementSet rs) {
        CDOObject lr = this._process.getElement(this._element.getLocationRequirement());
        if ((lr != null) &&  (lr instanceof camel.requirement.LocationRequirement))
            rs.setLocationRequirement((camel.requirement.LocationRequirement) lr);
    }

    @objid ("69e547e7-b0cb-4716-b486-20412c05f6ca")
    private void setPaasRequirement(camel.deployment.RequirementSet rs) {
        CDOObject pr = this._process.getElement(this._element.getPaasRequirement());
        if ((pr != null) &&  (pr instanceof camel.requirement.PaaSRequirement))
            rs.setPaasRequirement((camel.requirement.PaaSRequirement) pr);
    }

    @objid ("c1627d61-52a2-477b-be71-79b5b791b36f")
    private void setResourceRequirement(camel.deployment.RequirementSet rs) {
        CDOObject rr = this._process.getElement(this._element.getResourceRequirement());
        if ((rr != null) &&  (rr instanceof camel.requirement.ResourceRequirement))
            rs.setResourceRequirement((camel.requirement.ResourceRequirement) rr);
    }

}
