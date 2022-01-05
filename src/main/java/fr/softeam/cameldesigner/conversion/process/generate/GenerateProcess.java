package fr.softeam.cameldesigner.conversion.process.generate;

import camel.core.CamelModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;

@objid ("73d91623-84b7-4ac4-b17f-f478ca4f7ada")
public class GenerateProcess extends AbstractGenerateProcess {
    @objid ("3fdbdd47-04a9-4119-a96a-e20dd6ddf771")
    public GenerateProcess(CDOObject camelElementParent) {
        super(camelElementParent);
    }

    @objid ("e6f31ba8-d0fd-4a9a-a30e-a2ab9339263a")
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

    @objid ("9d068bfd-5dc9-4f10-975a-1e192c690eb5")
    private CDOObject generate(UnitModel unitModelProxy) {
        camel.unit.UnitModel unitModel = camel.unit.UnitFactory.eINSTANCE.createUnitModel();
        unitModel.setName(unitModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getUnitModels().add(unitModel);
        return unitModel;
    }

    @objid ("4d1d8f35-d837-4b1c-b1a1-9b2d61f1b069")
    private CDOObject generate(TypeModel typeModelProxy) {
        camel.type.TypeModel typeModel = camel.type.TypeFactory.eINSTANCE.createTypeModel();
        typeModel.setName(typeModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getTypeModels().add(typeModel);
        return typeModel;
    }

    @objid ("1baa2ef7-d48f-45f4-8116-648834f24caa")
    private CDOObject generate(SecurityModel securityModelProxy) {
        camel.security.SecurityModel securityModel = camel.security.SecurityFactory.eINSTANCE.createSecurityModel();
        securityModel.setName(securityModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getSecurityModels().add(securityModel);
        return securityModel;
    }

    @objid ("90efe67d-ed03-4037-b9da-34a5dc9c304d")
    private CDOObject generate(ScalabilityModel scalabilityModelProxy) {
        camel.scalability.ScalabilityModel scalabilityModel = camel.scalability.ScalabilityFactory.eINSTANCE.createScalabilityModel();
        scalabilityModel.setName(scalabilityModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getScalabilityModels().add(scalabilityModel);
        return scalabilityModel;
    }

    @objid ("5e8e07f4-317f-4e98-978e-d41912ac1109")
    private CDOObject generate(OrganisationModel organisationModelProxy) {
        camel.organisation.OrganisationModel organisationModel = camel.organisation.OrganisationFactory.eINSTANCE.createOrganisationModel();
        organisationModel.setName(organisationModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getOrganisationModels().add(organisationModel);
        return organisationModel;
    }

    @objid ("9ea76e2f-1063-4eae-8efd-cfa85aeb2bec")
    private CDOObject generate(LocationModel locationModelProxy) {
        camel.location.LocationModel locationModel = camel.location.LocationFactory.eINSTANCE.createLocationModel();
        locationModel.setName(locationModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getLocationModels().add(locationModel);
        return locationModel;
    }

    @objid ("65f7bc2d-7bfb-454f-94c6-89c9d3a6529d")
    private CDOObject generate(ExecutionModel executionModelProxy) {
        camel.execution.ExecutionModel executionModel = camel.execution.ExecutionFactory.eINSTANCE.createExecutionModel();
        executionModel.setName(executionModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getExecutionModels().add(executionModel);
        return executionModel;
    }

    @objid ("aa3313ee-ec81-4b4c-94a9-bc2aefa0cf9a")
    private CDOObject generate(DataInstanceModel dataInstanceModelProxy) {
        camel.data.DataInstanceModel dataInstanceModel = camel.data.DataFactory.eINSTANCE.createDataInstanceModel();
        dataInstanceModel.setName(dataInstanceModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getDataModels().add(dataInstanceModel);
        return dataInstanceModel;
    }

    @objid ("539945ba-0abf-45f7-b64b-ea1216501e3d")
    private CDOObject generate(DataTypeModel dataTypeModelProxy) {
        camel.data.DataTypeModel dataTypeModel = camel.data.DataFactory.eINSTANCE.createDataTypeModel();
        dataTypeModel.setName(dataTypeModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getDataModels().add(dataTypeModel);
        return dataTypeModel;
    }

    @objid ("ddc52f4b-f458-4f73-b881-c3a431a181cc")
    private CDOObject generate(ConstraintModel constraintModelProxy) {
        camel.constraint.ConstraintModel constraintModel = camel.constraint.ConstraintFactory.eINSTANCE.createConstraintModel();
        constraintModel.setName(constraintModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getConstraintModels().add(constraintModel);
        return constraintModel;
    }

    @objid ("e67e99a2-d016-40fc-835d-6cbfb70a70f3")
    private CDOObject generate(MetaDataModel metaDataModelProxy) {
        camel.mms.MetaDataModel metaDataModel = camel.mms.MmsFactory.eINSTANCE.createMetaDataModel();
        metaDataModel.setName(metaDataModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getMetadataModels().add(metaDataModel);
        return metaDataModel;
    }

    @objid ("0bb81532-b9de-4c64-ae30-ef6d592fe4ce")
    private CDOObject generate(MetricInstanceModel metricInstanceModelProxy) {
        camel.metric.MetricInstanceModel metricInstanceModel = camel.metric.MetricFactory.eINSTANCE.createMetricInstanceModel();
        metricInstanceModel.setName(metricInstanceModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getMetricModels().add(metricInstanceModel);
        return metricInstanceModel;
    }

    @objid ("fc73eaf3-bf75-4681-9eda-43fc4ce8a440")
    private CDOObject generate(MetricTypeModel metricTypeModelProxy) {
        camel.metric.MetricTypeModel metricTypeModel = camel.metric.MetricFactory.eINSTANCE.createMetricTypeModel();
        metricTypeModel.setName(metricTypeModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getMetricModels().add(metricTypeModel);
        return metricTypeModel;
    }

    @objid ("e2dbfe77-8285-412c-9e79-1e7dad58841f")
    private CDOObject generate(RequirementModel requirementModelProxy) {
        camel.requirement.RequirementModel requirementModel = camel.requirement.RequirementFactory.eINSTANCE.createRequirementModel();
        requirementModel.setName(requirementModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getRequirementModels().add(requirementModel);
        return requirementModel;
    }

    @objid ("23c3bc01-cb66-4d09-9da9-42df1d3db7ff")
    private CDOObject generate(DeploymentInstanceModel deploymentInstanceModelProxy) {
        camel.deployment.DeploymentInstanceModel deploymentInstanceModel = camel.deployment.DeploymentFactory.eINSTANCE.createDeploymentInstanceModel();
        deploymentInstanceModel.setName(deploymentInstanceModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getDeploymentModels().add(deploymentInstanceModel);
        return deploymentInstanceModel;
    }

    @objid ("204158d3-d951-46a7-ace6-9a91c472a576")
    private CDOObject generate(DeploymentTypeModel deploymentTypeModelProxy) {
        camel.deployment.DeploymentTypeModel deploymentTypeModel = camel.deployment.DeploymentFactory.eINSTANCE.createDeploymentTypeModel();
        deploymentTypeModel.setName(deploymentTypeModelProxy.getElement().getName());
        CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        camelModelParent.getDeploymentModels().add(deploymentTypeModel);
        return deploymentTypeModel;
    }

    @objid ("6d9a44ea-85f3-400d-9e2c-ee6a16a58abd")
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
