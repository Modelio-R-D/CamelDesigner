package fr.softeam.cameldesigner.elementmodel.walker.umlwalker;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.generate.AbstractGenerateProcess;
import fr.softeam.cameldesigner.elementmodel.walker.IWalker;

public class UmlWalker implements IWalker<CamelElement> {


    private AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement, CDOObject> generateProcess;

    public UmlWalker(AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement,CDOObject> generateProcess) {
        this.generateProcess = generateProcess;
    }

    @Override
    public void walk(CamelElement element) {
        CDOObject camelElement = this.generateProcess.process(element);
        if(camelElement != null) {
            walkChildren(element, camelElement);
        }
    }

    protected void walkChildren(CamelElement processedElement, CDOObject resultedElement) {

        //        ModelElement modelElement = processedElement.getElement();

        //        if(! modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                SubModel.STEREOTYPE_NAME)) {
        //        if (processedElement instanceof SubModel) {

        for (CamelElement child : processedElement.getChilds()) {
            this.generateProcess.setCamelElementParent(resultedElement);
            walk(child);
        }
        //
        //        } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                DeploymentTypeModel.STEREOTYPE_NAME)) {
        //
        //            if (this.generateProcess instanceof GenerateProcess) {
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessDeploymentType(resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent(resultedElement);
        //                    walk(child);
        //                }
        //            }
        //
        //
        //        } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                DeploymentInstanceModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessDeploymentInstance((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        } else if (modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                RequirementModel.STEREOTYPE_NAME)) {
        //
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessRequirement((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                MetricTypeModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessMetricType((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                MetricInstanceModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessMetricInstance((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //
        //        } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                MetaDataModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessMetaData((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                ConstraintModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessConstraint((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                DataTypeModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessDataType((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                DataInstanceModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessDataInstance((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                ExecutionModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessExecution((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                LocationModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessLocation((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                OrganisationModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessOrganisation((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        } else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                ScalabilityModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessScalability((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        }else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                SecurityModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessSecurity((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        }else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                TypeModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessType((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        }else if(modelElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                UnitModel.STEREOTYPE_NAME)) {
        //            if (this.generateProcess instanceof GenerateProcess) {
        //
        //                AbstractGenerateProcess subModelProcess = new GenerateProcessUnit((CDOObject) resultedElement, this.generateProcess.getProcessedUmlElements() );
        //                UmlWalker subModelWalker = new UmlWalker (subModelProcess);
        //                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
        //                subModelWalker.walkChildren(processedElement, resultedElement);
        //            } else {
        //                for (MObject child : modelElement.getCompositionChildren()) {
        //                    this.generateProcess.setCamelElementParent((CDOObject) resultedElement);
        //                    walk(child);
        //                }
        //            }
        //        }
    }


}
