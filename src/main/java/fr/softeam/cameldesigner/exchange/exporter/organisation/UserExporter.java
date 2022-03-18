package fr.softeam.cameldesigner.exchange.exporter.organisation;

import java.util.ArrayList;
import java.util.List;
import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d8b47108-f9c8-4b81-b7db-bf88a531ccd5")
public class UserExporter<T extends User> extends EntityExporter<T> {
    @objid ("976b195c-06ee-4379-85c3-798fda02481e")
    public UserExporter(T elt) {
        super(elt);
    }

    @objid ("a2e4a89a-bb9a-44e8-b0ca-6c9feb75aeac")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createUser();
    }

    @objid ("1416d602-e7ca-47ab-91ea-0b013d83130e")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.organisation.User) {
            camel.organisation.User user = (camel.organisation.User) elt;
            setWWW(user);
            setEmail(user);
            setFirstName(user);
            setLastName(user);
            setRequirementModels(user);
            setDeploymentModels(user);
            setMetricModels(user);
        }
    }

    @objid ("86a87eed-3e9b-4d73-a5d3-e0bbdebac755")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.organisation.OrganisationModel) && (elt instanceof camel.organisation.User)) {
            ((camel.organisation.OrganisationModel) context).getUsers().add((camel.organisation.User) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("2fe8fe07-fada-4493-88f2-01f95fa1a021")
    private void setWWW(camel.organisation.User user) {
        String content = this._element.getWww();
        if (content != null)
            user.setWww(content);
    }

    @objid ("887ad71b-4383-4ece-837d-6ee5ffeaae73")
    private void setFirstName(camel.organisation.User user) {
        String content = this._element.getFirstName();
        if (content != null)
            user.setFirstName(content);
    }

    @objid ("bf876d61-7e1a-46ab-808c-90e1ee774436")
    private void setLastName(camel.organisation.User user) {
        String content = this._element.getLastName();
        if (content != null)
            user.setLastName(content);
    }

    @objid ("ace31dc8-0b3a-4bca-8241-80efddf61aad")
    private void setEmail(camel.organisation.User user) {
        String content = this._element.getEmail();
        if (content != null)
            user.setEmail(content);
    }

    @objid ("75190528-ef5c-4e35-a78b-b8e94bbc9a7c")
    private void setRequirementModels(camel.organisation.User user) {
        List<camel.requirement.RequirementModel> reqModels = new ArrayList<>();
        for (RequirementModel reqModel : this._element.getRequirementModels()) {
            CDOObject camelReqModel = this._process.getElement(reqModel);
            if ((camelReqModel != null) &&  (camelReqModel instanceof camel.requirement.RequirementModel))
                reqModels.add((camel.requirement.RequirementModel) camelReqModel);
        }
        
        user.getRequirementModels().addAll(reqModels);
    }

    @objid ("b44a5acd-3e04-4da3-a3bf-4a8d38efaf04")
    private void setDeploymentModels(camel.organisation.User user) {
        List<camel.deployment.DeploymentModel> depModels = new ArrayList<>();
        for (DeploymentModel depModel : this._element.getDeploymentModels()) {
            CDOObject camelDepModel = this._process.getElement(depModel);
            if ((camelDepModel != null) &&  (camelDepModel instanceof camel.deployment.DeploymentModel))
                depModels.add((camel.deployment.DeploymentModel) camelDepModel);
        }
        
        user.getDeploymentModels().addAll(depModels);
    }

    @objid ("8ae87ac6-099e-4050-87c5-a6534085492e")
    private void setMetricModels(camel.organisation.User user) {
        List<camel.metric.MetricModel> metModels = new ArrayList<>();
        for (MetricModel metModel : this._element.getMetricModels()) {
            CDOObject camelMetModel = this._process.getElement(metModel);
            if ((camelMetModel != null) &&  (camelMetModel instanceof camel.metric.MetricModel))
                metModels.add((camel.metric.MetricModel) camelMetModel);
        }
        
        user.getMetricModels().addAll(metModels);
    }

    @objid ("edbe3a25-b961-483c-9fe9-8e9d1cb853e2")
    private void setScalabiltyModels(camel.organisation.User user) {
        List<camel.scalability.ScalabilityModel> scaModels = new ArrayList<>();
        for (ScalabilityModel scaModel : this._element.getScalabilityModels()) {
            CDOObject camelScaModel = this._process.getElement(scaModel);
            if ((camelScaModel != null) &&  (camelScaModel instanceof camel.scalability.ScalabilityModel))
                scaModels.add((camel.scalability.ScalabilityModel) camelScaModel);
        }
        
        user.getScalabilityModels().addAll(scaModels);
    }

}
