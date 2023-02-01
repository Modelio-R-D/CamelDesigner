/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << ExecutionModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c96f7eac-9b70-45a9-8082-1890dc328f78")
public class ExecutionModel extends SubModel {
<<<<<<< HEAD
    @objid ("7442a06a-8b42-425b-aa18-3d62302be554")
    public static final String STEREOTYPE_NAME = "ExecutionModel";

    @objid ("b8ea0c01-7573-4df4-89d4-e7fa330a0f5f")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("9653bd2e-e339-4c84-b063-ecbcacd98af6")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("934e6b68-05a5-4e5a-a4d4-efea43053ead")
=======
    @objid ("a48f06af-044e-4205-86f7-89c819e6f1e1")
    public static final String STEREOTYPE_NAME = "ExecutionModel";

    @objid ("1072c8eb-8fdf-4f6d-8a65-555ab669687b")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("a48d49c3-f24b-4de5-9270-a0ef627d3b3d")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("c5efe623-6f91-4926-9caa-ba525d5aaef6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String TOTALCOST_TAGTYPE = "totalCost";

    /**
     * Tells whether a {@link ExecutionModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ExecutionModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("50134406-9d75-44a5-8839-e0edbb0a4ea4")
=======
    @objid ("aa8bd79e-28da-49bd-9bea-f169b118d14e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ExecutionModel >> then instantiate a {@link ExecutionModel} proxy.
     * 
     * @return a {@link ExecutionModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("1b30e1c2-7122-40ce-873b-5e520d5cde22")
=======
    @objid ("0c16f0ad-c19f-424b-a597-15235a6ceadd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ExecutionModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModel.STEREOTYPE_NAME);
        return ExecutionModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ExecutionModel} proxy from a {@link Package} stereotyped << ExecutionModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link ExecutionModel} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("1ab23fa7-5445-4daf-9a15-4f3224daa30f")
=======
    @objid ("d06081dc-3d06-4133-a3b4-b6e4d6c534bf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ExecutionModel instantiate(final Package obj) {
        return ExecutionModel.canInstantiate(obj) ? new ExecutionModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExecutionModel} proxy from a {@link Package} stereotyped << ExecutionModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link ExecutionModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("275a5c39-a3b7-410f-83d9-26b8dde783b5")
=======
    @objid ("708ccbc3-f87b-4733-b0df-d8ace622751c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ExecutionModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ExecutionModel.canInstantiate(obj))
        	return new ExecutionModel(obj);
        else
        	throw new IllegalArgumentException("ExecutionModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f395fdd3-d90f-470c-8487-64f81eb42f2a")
=======
    @objid ("cec3efc2-2780-4c9a-b5d2-c7c624e849f5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final ExecutionModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'historyRecords' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8cd7fe5e-a41d-4981-b8a6-fc1ec24a7e4f")
=======
    @objid ("95fdcab8-4051-4ee8-a397-367ad2391a7c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addHistoryRecords(final HistoryRecord obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'measurements' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("35a302be-2eb7-4140-ab8c-a32405606028")
=======
    @objid ("5c08ec3c-e47f-4b7a-bf89-f1f448958483")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addMeasurements(final Measurement obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'ruleTriggers' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("c21a0df7-757a-465f-906c-4875c5f1e310")
=======
    @objid ("0ce69389-d27e-45c5-8b8f-0cfb239223ef")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addRuleTriggers(final RuleTrigger obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'sloViolations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("fb7b1fe7-24bd-4968-9832-bc859621efa5")
=======
    @objid ("2c868a26-3173-41d4-9d15-5456fa2a5c56")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSloViolations(final SLOViolation obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("85025601-1437-4956-935e-249ea467b334")
=======
    @objid ("32f51b0f-d694-49f1-a8e7-0efe0e3a48bb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ExecutionModel other = (ExecutionModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b289ea7d-063b-41f1-9959-281a372cef09")
=======
    @objid ("43132ddf-1a84-4687-a6df-adfaa87b1b25")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'costUnit' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b59dc59f-fabf-449e-aae5-9de50c4cfa04")
=======
    @objid ("8c77ab70-c040-4522-ba04-75c447a25f7d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public Unit getCostUnit() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ExecutionModel.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ExecutionModel.MdaTypes.MDAASSOCDEP_ROLE), "costUnit")){
                  if (SingleUnit.canInstantiate(d.getDependsOn()))
                     return (SingleUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SingleUnit.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CompositeUnit.canInstantiate(d.getDependsOn()))
                     return (CompositeUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeUnit.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Dimensionless.canInstantiate(d.getDependsOn()))
                     return (Dimensionless)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Dimensionless.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'dataTypeModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("c2667a83-4a11-4ed1-afdd-b68f43dfefb6")
=======
    @objid ("af70f452-b145-417e-9b54-2e279139eadf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DataTypeModel getDataTypeModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ExecutionModel.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ExecutionModel.MdaTypes.MDAASSOCDEP_ROLE), "dataTypeModel")){
                  if (DataTypeModel.canInstantiate(d.getDependsOn()))
                     return (DataTypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataTypeModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'deploymentTypeModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("23431f65-efd7-42ae-95eb-90d7ab4a2e4b")
=======
    @objid ("90a9ef87-2021-4d55-8a42-58284ed12e78")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DeploymentTypeModel getDeploymentTypeModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ExecutionModel.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ExecutionModel.MdaTypes.MDAASSOCDEP_ROLE), "deploymentTypeModel")){
                  if (DeploymentTypeModel.canInstantiate(d.getDependsOn()))
                     return (DeploymentTypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentTypeModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("aa04ff8f-8b1d-40b2-ac5f-52c89b0e59f1")
=======
    @objid ("b25378aa-29af-4485-b21d-2c63cf2c7fbd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<ExecutionModelDiagram> getDiagrams() {
        List<ExecutionModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (ExecutionModelDiagram.canInstantiate(mObj))
        			results.add((ExecutionModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, ExecutionModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("66d09a0f-5731-412b-8a0d-c0afa5803a4e")
=======
    @objid ("9b182a57-e944-47d8-a87d-80fa4feb8b29")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("7a96f03c-c0e8-43c6-9451-6fd4c18779f5")
=======
    @objid ("0f932ef8-b03a-4044-b640-d140992536e2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getEndTime() {
        return this.elt.getTagValue(ExecutionModel.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'historyRecords' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("997fe18c-b23a-4a91-824d-4b75a1834f1b")
=======
    @objid ("217e96dc-f6f5-4769-97f3-d1cbe7bedd3b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<HistoryRecord> getHistoryRecords() {
        List<HistoryRecord> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (HistoryRecord.canInstantiate(mObj))
        			results.add((HistoryRecord)CamelDesignerProxyFactory.instantiate(mObj, HistoryRecord.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'measurements' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("cf44f304-bb68-4561-9644-2e98e6ab6262")
=======
    @objid ("bb6dc06f-7f3c-4f45-b830-6d01a7517f3b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<Measurement> getMeasurements() {
        List<Measurement> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (ApplicationMeasurement.canInstantiate(mObj))
        			results.add((ApplicationMeasurement)CamelDesignerProxyFactory.instantiate(mObj, ApplicationMeasurement.STEREOTYPE_NAME));
        	if (CommunicationMeasurement.canInstantiate(mObj))
        			results.add((CommunicationMeasurement)CamelDesignerProxyFactory.instantiate(mObj, CommunicationMeasurement.STEREOTYPE_NAME));
        	if (ContainerMeasurement.canInstantiate(mObj))
        			results.add((ContainerMeasurement)CamelDesignerProxyFactory.instantiate(mObj, ContainerMeasurement.STEREOTYPE_NAME));
        	if (DataMeasurement.canInstantiate(mObj))
        			results.add((DataMeasurement)CamelDesignerProxyFactory.instantiate(mObj, DataMeasurement.STEREOTYPE_NAME));
        	if (PaaSMeasurement.canInstantiate(mObj))
        			results.add((PaaSMeasurement)CamelDesignerProxyFactory.instantiate(mObj, PaaSMeasurement.STEREOTYPE_NAME));
        	if (SoftwareComponentMeasurement.canInstantiate(mObj))
        			results.add((SoftwareComponentMeasurement)CamelDesignerProxyFactory.instantiate(mObj, SoftwareComponentMeasurement.STEREOTYPE_NAME));
        	if (VMMeasurement.canInstantiate(mObj))
        			results.add((VMMeasurement)CamelDesignerProxyFactory.instantiate(mObj, VMMeasurement.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'requirementModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("1894b772-19d0-4c2c-a672-3e8b2f61543e")
=======
    @objid ("91f0ba03-785b-41b0-a574-0b15796ee731")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public RequirementModel getRequirementModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ExecutionModel.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ExecutionModel.MdaTypes.MDAASSOCDEP_ROLE), "requirementModel")){
                  if (RequirementModel.canInstantiate(d.getDependsOn()))
                     return (RequirementModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RequirementModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'ruleTriggers' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("5ad47260-8338-4cd2-92c7-a715076d3101")
=======
    @objid ("8a99c0c8-aec5-4bed-967e-2bf013240691")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<RuleTrigger> getRuleTriggers() {
        List<RuleTrigger> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (RuleTrigger.canInstantiate(mObj))
        			results.add((RuleTrigger)CamelDesignerProxyFactory.instantiate(mObj, RuleTrigger.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'sloViolations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9dc535f7-2996-4d16-a8c5-8f9f56425309")
=======
    @objid ("11b84cab-542f-4623-89c3-e696084fc24a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<SLOViolation> getSloViolations() {
        List<SLOViolation> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SLOViolation.canInstantiate(mObj))
        			results.add((SLOViolation)CamelDesignerProxyFactory.instantiate(mObj, SLOViolation.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("2b6ed215-cda1-471f-b486-be8ed7c21921")
=======
    @objid ("f7f8cd35-4750-4a94-88d4-56c9234dab64")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getStartTime() {
        return this.elt.getTagValue(ExecutionModel.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'totalCost'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("17e2fea0-0a97-483b-bd95-1e6b0fb75151")
=======
    @objid ("cf9008ce-3818-4373-a778-7a7d867e0f7e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getTotalCost() {
        return this.elt.getTagValue(ExecutionModel.MdaTypes.TOTALCOST_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("6316d469-06f7-477f-95f1-cef3742a7e44")
=======
    @objid ("1324f357-6a0b-424f-8c34-2d5da4c197aa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("fe3e91ba-23b5-46d3-b8a9-353e82e9308c")
=======
    @objid ("5ca71e78-cb3f-4a23-ac38-6cfc9060e1ef")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final ExecutionModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'historyRecords' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8828c3c5-96c6-4ab1-be40-a28076aebe56")
=======
    @objid ("160939f1-ba9d-4b5e-85f9-8868f025389d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeHistoryRecords(final HistoryRecord obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'measurements' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("4248f073-bdb7-4656-8f18-ce0a8236a6e1")
=======
    @objid ("d12c71cc-c8d0-4ebf-b303-144d8c49befb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeMeasurements(final Measurement obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'ruleTriggers' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("94995ee3-bf9f-41fc-a45f-8774c34e3a89")
=======
    @objid ("75daf0c9-2d7f-480e-aa9a-dd6669facf10")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRuleTriggers(final RuleTrigger obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'sloViolations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9c875f7a-3317-4392-aad2-27d61c9c2746")
=======
    @objid ("909012e6-5664-4805-82fb-b95459d012b7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSloViolations(final SLOViolation obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("e0eade78-aa3e-44ec-a77a-da1f85c9a08e")
=======
    @objid ("9c7b0978-2326-464b-8049-ad50b9fb7147")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'costUnit' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("633adb70-74c0-4c92-af6f-d0f051e54098")
=======
    @objid ("3f5ade49-d769-4f06-bdb2-85868713d70a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setCostUnit(final Unit obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ExecutionModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ExecutionModel.MdaTypes.MDAASSOCDEP_ROLE), "costUnit")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ExecutionModel.MdaTypes.MDAASSOCDEP);
              dep.setName("costUnit");      dep.putTagValue(ExecutionModel.MdaTypes.MDAASSOCDEP_ROLE, "costUnit");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'dataTypeModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("bb688411-d432-47e2-8e29-7433b4e0c22a")
=======
    @objid ("3596df7b-18ac-4e73-ae9d-f17397717e92")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setDataTypeModel(final DataTypeModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ExecutionModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ExecutionModel.MdaTypes.MDAASSOCDEP_ROLE), "dataTypeModel")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ExecutionModel.MdaTypes.MDAASSOCDEP);
              dep.setName("dataTypeModel");      dep.putTagValue(ExecutionModel.MdaTypes.MDAASSOCDEP_ROLE, "dataTypeModel");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'deploymentTypeModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9d5d4d36-f906-4f2a-871c-dd969db499ba")
=======
    @objid ("bd86d858-ec7a-45f0-8440-a686d059befc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setDeploymentTypeModel(final DeploymentTypeModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ExecutionModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ExecutionModel.MdaTypes.MDAASSOCDEP_ROLE), "deploymentTypeModel")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ExecutionModel.MdaTypes.MDAASSOCDEP);
              dep.setName("deploymentTypeModel");      dep.putTagValue(ExecutionModel.MdaTypes.MDAASSOCDEP_ROLE, "deploymentTypeModel");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("023039b8-06ff-4688-83c9-9b7a56cc5d0b")
=======
    @objid ("1f166814-6304-4dc1-9d55-0cee173c794e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setEndTime(final String value) {
        this.elt.putTagValue(ExecutionModel.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'requirementModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("58cc3734-d259-409d-a5ac-480d4de5c6f8")
=======
    @objid ("e8def2e9-e51f-4db1-986b-045628f07b1b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setRequirementModel(final RequirementModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ExecutionModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ExecutionModel.MdaTypes.MDAASSOCDEP_ROLE), "requirementModel")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ExecutionModel.MdaTypes.MDAASSOCDEP);
              dep.setName("requirementModel");      dep.putTagValue(ExecutionModel.MdaTypes.MDAASSOCDEP_ROLE, "requirementModel");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("8eaae49f-312c-4341-9ca5-d9315b3b626b")
=======
    @objid ("c1d243c2-2b63-49c4-838f-28db2a3fc6c2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setStartTime(final String value) {
        this.elt.putTagValue(ExecutionModel.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'totalCost'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("d80919e6-aecd-4b07-b9f4-bf17c2a5d3df")
=======
    @objid ("8dcb5f0c-59b8-4036-8e7a-c5cf1acea71e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setTotalCost(final String value) {
        this.elt.putTagValue(ExecutionModel.MdaTypes.TOTALCOST_TAGTYPE_ELT, value);
    }

    @objid ("cdb26101-dc83-44fa-9477-08fed60483bd")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getMeasurements());
        result.addAll(getSloViolations());
        result.addAll(getRuleTriggers());
        result.addAll(getHistoryRecords());
        return result;
    }

<<<<<<< HEAD
    @objid ("7dbada1e-14a0-4c51-a0b4-68e3085ce2c1")
=======
    @objid ("28b8986c-c294-4bd7-8bc0-2ba3535e2e1d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ExecutionModel(final Package elt) {
        super(elt);
    }

    @objid ("717cbe7b-f67e-4b04-8825-65ff42b77f09")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("0844d927-31c0-49ff-8947-c9cda4b319d4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e46d29ce-bca0-49c6-9618-309799b98c23")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("4b3b621d-8dd8-4388-8f07-f8d3bf6ee575")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("aed86da5-8058-4ce1-bbf6-26bfa9a65557")
        public static TagType TOTALCOST_TAGTYPE_ELT;

        @objid ("907b609c-90de-41eb-97da-e9f74de3e377")
        private static Stereotype MDAASSOCDEP;

        @objid ("f3ef0f4d-d4d0-472b-bf7a-0f2499c57625")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9ba6b6d3-464b-45b5-9080-aaebd8ada007")
=======
        @objid ("874cd00d-4c03-4036-be42-01c185baa663")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0d3aaf03-fa19-4694-bdfa-24ec419879e2")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("866371eb-e754-4c7c-87be-3ae6a6e656ba")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("13275ec0-455c-459b-8b4e-2a3bf2a1c24f")
        public static TagType TOTALCOST_TAGTYPE_ELT;

        @objid ("223ca96e-a308-46cc-a61d-1ca7d9cf17b7")
        private static Stereotype MDAASSOCDEP;

        @objid ("65a3c37c-0232-4d4e-84d7-7c54b323e380")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7adf6025-ecc7-4f28-a39f-93c83c6cb435")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e68f7e04-ff66-47dd-af65-5c017645cb8d");
            STARTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8a1a55fb-6fdd-41a1-8b7f-0402a36c1c5a");
            ENDTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9eaffab4-ecb8-4197-8a10-fa6efdbce7f0");
            TOTALCOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "897470a5-3fb6-46aa-b4cc-d3aefb9903a1");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
