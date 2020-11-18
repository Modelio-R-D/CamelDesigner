package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import camel.constraint.ConstraintModel;
import camel.core.CamelModel;
import camel.data.DataModel;
import camel.data.DataTypeModel;
import camel.deployment.DeploymentModel;
import camel.deployment.DeploymentTypeModel;
import camel.execution.ExecutionModel;
import camel.location.LocationModel;
import camel.metric.MetricModel;
import camel.mms.MetaDataModel;
import camel.organisation.OrganisationModel;
import camel.requirement.RequirementModel;
import camel.scalability.ScalabilityModel;
import camel.security.SecurityModel;
import camel.type.TypeModel;
import camel.unit.UnitModel;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessDataType;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessDeploymentType;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessMetaData;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessMetricType;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessRequirement;

public class CamelWalker extends AbstractCamelWalker {
    public CamelWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        //if(resultedElement instanceof Package) {
        //Package packageOwner = (Package) resultedElement;
        if (processedElement instanceof CamelModel && resultedElement instanceof fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel) {
            CamelModel camelModel = (CamelModel) processedElement;
            fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel proxyResultedElement = (fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel)resultedElement;
            for(DeploymentModel deploymentModel : camelModel.getDeploymentModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(deploymentModel);
            }
            for(RequirementModel requirementModel : camelModel.getRequirementModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(requirementModel);
            }
            for(MetricModel metricModel : camelModel.getMetricModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(metricModel);
            }
            for(MetaDataModel metaDataModel : camelModel.getMetadataModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(metaDataModel);
            }
            for(ExecutionModel deploymentModel : camelModel.getExecutionModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(deploymentModel);
            }
            for(LocationModel locationModel : camelModel.getLocationModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(locationModel);
            }
            for(OrganisationModel organisationModel : camelModel.getOrganisationModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(organisationModel);
            }
            for(ScalabilityModel scalabilityModel : camelModel.getScalabilityModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(scalabilityModel);
            }
            for(SecurityModel securityModel : camelModel.getSecurityModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(securityModel);
            }
            for(TypeModel typeModel : camelModel.getTypeModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(typeModel);
            }
            for(UnitModel unitModel : camelModel.getUnitModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(unitModel);
            }
            for(ConstraintModel constraintModel : camelModel.getConstraintModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(constraintModel);
            }
            for(DataModel dataModel : camelModel.getDataModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(dataModel);
            }
        }
        else if (resultedElement instanceof fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel) {
            fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel proxyResultedElement = (fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel)resultedElement;
        
            if(processedElement instanceof DeploymentTypeModel ) {
        
                AbstractReverseProcess subModelProcess = new ReverseProcessDeploymentType(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new DeploymentTypeWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);
        
            } 
            else if(processedElement instanceof RequirementModel) {
                AbstractReverseProcess subModelProcess = new ReverseProcessRequirement(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new RequirementWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);
        
            } 
        
        
        
            else if(processedElement instanceof MetricModel ) {
                AbstractReverseProcess subModelProcess = new ReverseProcessMetricType(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new MetricTypeWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);
        
            } 
        
        
        
            else if(processedElement instanceof MetaDataModel ) {
                AbstractReverseProcess subModelProcess = new ReverseProcessMetaData(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new MetaDataWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);        
        
            } 
        
        
            //                    else if(processedElement instanceof ExecutionModel ) {
            //                IElementProcess subModelProcess = new ReverseProcessExecution(packageOwner, this.reverseProcess.getProcessedCamelElements() );
            //                AbstractWalker requirementWalker = new ExecutionWalker (subModelProcess);
            //                requirementWalker.walk(processedElement);
            //
            //            } else if(processedElement instanceof LocationModel ) {
            //                IElementProcess subModelProcess = new ReverseProcessLocation(packageOwner, this.reverseProcess.getProcessedCamelElements() );
            //                AbstractWalker requirementWalker = new LocationWalker (subModelProcess);
            //                requirementWalker.walk(processedElement);
            //
            //
            //            } else if(processedElement instanceof OrganisationModel ) {
            //                IElementProcess subModelProcess = new ReverseProcessOrganisation(packageOwner, this.reverseProcess.getProcessedCamelElements() );
            //                AbstractWalker requirementWalker = new OrganisationWalker (subModelProcess);
            //                requirementWalker.walk(processedElement);
            //
            //
            //            } else if(processedElement instanceof ScalabilityModel ) {
            //
            //                IElementProcess subModelProcess = new ReverseProcessScalability(packageOwner, this.reverseProcess.getProcessedCamelElements() );
            //                AbstractWalker requirementWalker = new ScalabilityWalker (subModelProcess);
            //                requirementWalker.walk(processedElement);
            //
            //            } else if(processedElement instanceof SecurityModel ) {
            //
            //
            //                IElementProcess subModelProcess = new ReverseProcessSecurity(packageOwner, this.reverseProcess.getProcessedCamelElements() );
            //                AbstractWalker requirementWalker = new SecurityWalker (subModelProcess);
            //                requirementWalker.walk(processedElement);
            //
            //            } else if(processedElement instanceof TypeModel ) {
            //
            //
            //                IElementProcess subModelProcess = new ReverseProcessType(packageOwner, this.reverseProcess.getProcessedCamelElements() );
            //                AbstractWalker requirementWalker = new TypeWalker (subModelProcess);
            //                requirementWalker.walk(processedElement);
            //
            //            } else if(processedElement instanceof UnitModel ) {
            //
            //
            //                IElementProcess subModelProcess = new ReverseProcessUnit(packageOwner, this.reverseProcess.getProcessedCamelElements() );
            //                AbstractWalker requirementWalker = new UnitWalker (subModelProcess);
            //                requirementWalker.walk(processedElement);
            //
            //            } else if(processedElement instanceof ConstraintModel ) {
            //
            //
            //                IElementProcess subModelProcess = new ReverseProcessConstraint(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
            //                AbstractWalker requirementWalker = new ConstraintWalker (subModelProcess);
            //                requirementWalker.walk(processedElement);
            //
            //                        } 
            else if(processedElement instanceof DataTypeModel ) {
                AbstractReverseProcess subModelProcess = new ReverseProcessDataType(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new DataTypeWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);        
        
        
            }
            //
            //            else if(processedElement instanceof DeploymentInstanceModel ) {
            //
            //                IElementProcess subModelProcess = new ReverseProcessDeploymentInstance(packageOwner, this.reverseProcess.getProcessedCamelElements() );
            //                AbstractWalker subModelWalker = new DeploymentInstanceWalker (subModelProcess);
            //                subModelWalker.walk(processedElement);
            //
            //            }
            //            else if(processedElement instanceof DataInstanceModel ) {
            //
            //                IElementProcess subModelProcess = new ReverseProcessDataInstance(packageOwner, this.reverseProcess.getProcessedCamelElements() );
            //                AbstractWalker subModelWalker = new DataInstanceWalker (subModelProcess);
            //                subModelWalker.walk(processedElement);
            //
            //            }
            //            else if(processedElement instanceof MetricInstanceModel ) {
            //
            //                IElementProcess subModelProcess = new ReverseProcessMetricInstance(packageOwner, this.reverseProcess.getProcessedCamelElements() );
            //                AbstractWalker subModelWalker = new MetricInstanceWalker (subModelProcess);
            //                subModelWalker.walk(processedElement);
            //
            //            }
        }
    }

}
