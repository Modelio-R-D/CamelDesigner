package fr.softeam.cameldesigner.conversion.process.generate;

import java.util.Map;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import camel.core.CamelModel;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;

public class GenerateProcess extends AbstractGenerateProcess {
    public GenerateProcess(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        super(camelElementParent, processedUmlElements);
    }

    @Override
    protected CDOObject switchGenerate(fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement camelElement) {

        ModelElement element = camelElement.getElement();

        if (element instanceof Package) {
            Package umlPackage = (Package) element;

            if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    DeploymentTypeModel.STEREOTYPE_NAME)) {
                return generate((DeploymentTypeModel.instantiate(umlPackage)));

            } else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    DeploymentInstanceModel.STEREOTYPE_NAME)) {
                return generate((DeploymentInstanceModel.instantiate(umlPackage)));

            } else if (umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    RequirementModel.STEREOTYPE_NAME)) {
                return generate((RequirementModel.instantiate(umlPackage)));

            } else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    MetricTypeModel.STEREOTYPE_NAME)) {
                return generate((MetricTypeModel.instantiate(umlPackage)));

            } else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    MetricInstanceModel.STEREOTYPE_NAME)) {
                return generate((MetricInstanceModel.instantiate(umlPackage)));

            } else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    MetaDataModel.STEREOTYPE_NAME)) {
                return generate((MetaDataModel.instantiate(umlPackage)));

            } else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    ConstraintModel.STEREOTYPE_NAME)) {
                return generate((ConstraintModel.instantiate(umlPackage)));

            } else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    DataTypeModel.STEREOTYPE_NAME)) {
                return generate((DataTypeModel.instantiate(umlPackage)));

            } else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    DataInstanceModel.STEREOTYPE_NAME)) {
                return generate((DataInstanceModel.instantiate(umlPackage)));

            } else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    ExecutionModel.STEREOTYPE_NAME)) {
                return generate((ExecutionModel.instantiate(umlPackage)));

            } else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    LocationModel.STEREOTYPE_NAME)) {
                return generate((LocationModel.instantiate(umlPackage)));

            } else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    OrganisationModel.STEREOTYPE_NAME)) {
                return generate((OrganisationModel.instantiate(umlPackage)));

            } else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    ScalabilityModel.STEREOTYPE_NAME)) {
                return generate((ScalabilityModel.instantiate(umlPackage)));

            }else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    SecurityModel.STEREOTYPE_NAME)) {
                return generate((SecurityModel.instantiate(umlPackage)));

            }else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    TypeModel.STEREOTYPE_NAME)) {
                return generate((TypeModel.instantiate(umlPackage)));

            }else if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    UnitModel.STEREOTYPE_NAME)) {
                return generate((UnitModel.instantiate(umlPackage)));

            }
        }
        return null;
    }

    private CDOObject generate(UnitModel unitModelProxy) {
        camel.unit.UnitModel unitModel = camel.unit.UnitFactory.eINSTANCE.createUnitModel();
        unitModel.setName(unitModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getUnitModels().add(unitModel);
        return unitModel;
    }

    private CDOObject generate(TypeModel typeModelProxy) {
        camel.type.TypeModel typeModel = camel.type.TypeFactory.eINSTANCE.createTypeModel();
        typeModel.setName(typeModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getTypeModels().add(typeModel);
        return typeModel;
    }

    private CDOObject generate(SecurityModel securityModelProxy) {
        camel.security.SecurityModel securityModel = camel.security.SecurityFactory.eINSTANCE.createSecurityModel();
        securityModel.setName(securityModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getSecurityModels().add(securityModel);
        return securityModel;
    }

    private CDOObject generate(ScalabilityModel scalabilityModelProxy) {
        camel.scalability.ScalabilityModel scalabilityModel = camel.scalability.ScalabilityFactory.eINSTANCE.createScalabilityModel();
        scalabilityModel.setName(scalabilityModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getScalabilityModels().add(scalabilityModel);
        return scalabilityModel;
    }

    private CDOObject generate(OrganisationModel organisationModelProxy) {
        camel.organisation.OrganisationModel organisationModel = camel.organisation.OrganisationFactory.eINSTANCE.createOrganisationModel();
        organisationModel.setName(organisationModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getOrganisationModels().add(organisationModel);
        return organisationModel;
    }

    private CDOObject generate(LocationModel locationModelProxy) {
        camel.location.LocationModel locationModel = camel.location.LocationFactory.eINSTANCE.createLocationModel();
        locationModel.setName(locationModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getLocationModels().add(locationModel);
        return locationModel;
    }

    private CDOObject generate(ExecutionModel executionModelProxy) {
        camel.execution.ExecutionModel executionModel = camel.execution.ExecutionFactory.eINSTANCE.createExecutionModel();
        executionModel.setName(executionModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getExecutionModels().add(executionModel);
        return executionModel;
    }

    private CDOObject generate(DataInstanceModel dataInstanceModelProxy) {
        camel.data.DataInstanceModel dataInstanceModel = camel.data.DataFactory.eINSTANCE.createDataInstanceModel();
        dataInstanceModel.setName(dataInstanceModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getDataModels().add(dataInstanceModel);
        return dataInstanceModel;
    }

    private CDOObject generate(DataTypeModel dataTypeModelProxy) {
        camel.data.DataTypeModel dataTypeModel = camel.data.DataFactory.eINSTANCE.createDataTypeModel();
        dataTypeModel.setName(dataTypeModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getDataModels().add(dataTypeModel);
        return dataTypeModel;
    }

    private CDOObject generate(ConstraintModel constraintModelProxy) {
        camel.constraint.ConstraintModel constraintModel = camel.constraint.ConstraintFactory.eINSTANCE.createConstraintModel();
        constraintModel.setName(constraintModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getConstraintModels().add(constraintModel);
        return constraintModel;
    }

    private CDOObject generate(MetaDataModel metaDataModelProxy) {
        camel.mms.MetaDataModel metaDataModel = camel.mms.MmsFactory.eINSTANCE.createMetaDataModel();
        metaDataModel.setName(metaDataModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getMetadataModels().add(metaDataModel);
        return metaDataModel;
    }

    private CDOObject generate(MetricInstanceModel metricInstanceModelProxy) {
        camel.metric.MetricInstanceModel metricInstanceModel = camel.metric.MetricFactory.eINSTANCE.createMetricInstanceModel();
        metricInstanceModel.setName(metricInstanceModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getMetricModels().add(metricInstanceModel);
        return metricInstanceModel;
    }

    private CDOObject generate(MetricTypeModel metricTypeModelProxy) {
        camel.metric.MetricTypeModel metricTypeModel = camel.metric.MetricFactory.eINSTANCE.createMetricTypeModel();
        metricTypeModel.setName(metricTypeModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getMetricModels().add(metricTypeModel);
        return metricTypeModel;
    }

    private CDOObject generate(RequirementModel requirementModelProxy) {
        camel.requirement.RequirementModel requirementModel = camel.requirement.RequirementFactory.eINSTANCE.createRequirementModel();
        requirementModel.setName(requirementModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getRequirementModels().add(requirementModel);
        return requirementModel;
    }

    private CDOObject generate(DeploymentInstanceModel deploymentInstanceModelProxy) {
        camel.deployment.DeploymentInstanceModel deploymentInstanceModel = camel.deployment.DeploymentFactory.eINSTANCE.createDeploymentInstanceModel();
        deploymentInstanceModel.setName(deploymentInstanceModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getDeploymentModels().add(deploymentInstanceModel);
        return deploymentInstanceModel;
    }

    private CDOObject generate(DeploymentTypeModel deploymentTypeModelProxy) {
        camel.deployment.DeploymentTypeModel deploymentTypeModel = camel.deployment.DeploymentFactory.eINSTANCE.createDeploymentTypeModel();
        deploymentTypeModel.setName(deploymentTypeModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getDeploymentModels().add(deploymentTypeModel);
        return deploymentTypeModel;
    }

    @Override
    protected void updateParent(CDOObject processedElement) {
        if(this.getCamelElementParent() instanceof camel.core.CamelModel) {
            CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
            if(processedElement instanceof camel.deployment.DeploymentTypeModel) {
                camelModelParent.getDeploymentModels().add((camel.deployment.DeploymentTypeModel)processedElement);
            } else if(processedElement instanceof camel.deployment.DeploymentInstanceModel) {
                camelModelParent.getDeploymentModels().add((camel.deployment.DeploymentInstanceModel)processedElement);
            } else if(processedElement instanceof camel.requirement.RequirementModel) {
                camelModelParent.getRequirementModels().add((camel.requirement.RequirementModel)processedElement);
            } else if(processedElement instanceof camel.metric.MetricTypeModel) {
                camelModelParent.getMetricModels().add((camel.metric.MetricTypeModel)processedElement);
            } else if(processedElement instanceof camel.metric.MetricInstanceModel) {
                camelModelParent.getMetricModels().add((camel.metric.MetricInstanceModel)processedElement);
            } else if(processedElement instanceof camel.mms.MetaDataModel) {
                camelModelParent.getMetadataModels().add((camel.mms.MetaDataModel)processedElement);
            } else if(processedElement instanceof camel.constraint.ConstraintModel) {
                camelModelParent.getConstraintModels().add((camel.constraint.ConstraintModel)processedElement);
            } else if(processedElement instanceof camel.data.DataTypeModel) {
                camelModelParent.getDataModels().add((camel.data.DataTypeModel)processedElement);
            } else if(processedElement instanceof camel.data.DataInstanceModel) {
                camelModelParent.getDataModels().add((camel.data.DataInstanceModel)processedElement);
            } else if(processedElement instanceof camel.execution.ExecutionModel) {
                camelModelParent.getExecutionModels().add((camel.execution.ExecutionModel)processedElement);
            } else if(processedElement instanceof camel.location.LocationModel) {
                camelModelParent.getLocationModels().add((camel.location.LocationModel)processedElement);
            } else if(processedElement instanceof camel.organisation.OrganisationModel) {
                camelModelParent.getOrganisationModels().add((camel.organisation.OrganisationModel)processedElement);
            } else if(processedElement instanceof camel.scalability.ScalabilityModel) {
                camelModelParent.getScalabilityModels().add((camel.scalability.ScalabilityModel)processedElement);
            } else if(processedElement instanceof camel.security.SecurityModel) {
                camelModelParent.getSecurityModels().add((camel.security.SecurityModel)processedElement);
            } else if(processedElement instanceof camel.type.TypeModel) {
                camelModelParent.getTypeModels().add((camel.type.TypeModel)processedElement);
            } else if(processedElement instanceof camel.unit.UnitModel) {
                camelModelParent.getUnitModels().add((camel.unit.UnitModel)processedElement);
            }
        }
    }

}
