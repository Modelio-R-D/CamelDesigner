package fr.softeam.cameldesigner.elementmodel.walker.umlwalker;

import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
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
import fr.softeam.cameldesigner.conversion.process.generate.AbstractGenerateProcess;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcess;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessConstraint;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessDataInstance;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessDataType;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessDeploymentInstance;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessDeploymentType;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessExecution;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessLocation;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessMetaData;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessMetricInstance;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessMetricType;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessOrganisation;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessRequirement;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessScalability;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessSecurity;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessType;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcessUnit;
import fr.softeam.cameldesigner.elementmodel.walker.IWalker;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

public class UmlWalker implements IWalker {
    private AbstractGenerateProcess generateProcess;

    public UmlWalker(AbstractGenerateProcess generateProcess) {
        this.generateProcess = generateProcess;
    }

    @Override
    public void walk(Object element) {
        Object camelElement = this.generateProcess.process(element);
        if(camelElement != null) {
            walkChildren(element, camelElement);
        }
    }

    protected void walkChildren(Object processedElement, Object resultedElement) {
        if(processedElement instanceof ModelElement) {
            ModelElement modelElement = (ModelElement) processedElement;
        
        
        
            if(! modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    SubModel.STEREOTYPE_NAME)) {
        
                for (MObject child : modelElement.getCompositionChildren()) {
                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                    walk(child);
                }
        
            } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    DeploymentTypeModel.STEREOTYPE_NAME)) {
        
                if (this.generateProcess instanceof GenerateProcess) {
                    AbstractGenerateProcess subModelProcess = new GenerateProcessDeploymentType((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
        
        
        
        
            } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    DeploymentInstanceModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessDeploymentInstance((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            } else if (modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    RequirementModel.STEREOTYPE_NAME)) {
        
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessRequirement((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    subModelWalker.walkChildren(processedElement, resultedElement);
        
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    MetricTypeModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessMetricType((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
        
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    MetricInstanceModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessMetricInstance((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
        
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
        
            } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    MetaDataModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessMetaData((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    ConstraintModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessConstraint((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    DataTypeModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessDataType((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    DataInstanceModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessDataInstance((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    ExecutionModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessExecution((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    LocationModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessLocation((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    OrganisationModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessOrganisation((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    ScalabilityModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessScalability((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            }else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    SecurityModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessSecurity((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            }else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    TypeModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessType((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            }else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    UnitModel.STEREOTYPE_NAME)) {
                if (this.generateProcess instanceof GenerateProcess) {
        
                    AbstractGenerateProcess subModelProcess = new GenerateProcessUnit((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
                    UmlWalker subModelWalker = new UmlWalker (subModelProcess);
                    //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                    subModelWalker.walkChildren(processedElement, resultedElement);
                } else {
                    for (MObject child : modelElement.getCompositionChildren()) {
                        this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
                        walk(child);
                    }
                }
            }
        }
    }

}
