/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("ba2d1039-e60b-4d5f-bb63-ea0bf5f6893f")
    public static final String STEREOTYPE_NAME = "ExecutionModel";

    @objid ("9160bdfb-3465-49cc-80cf-29273b3e0945")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("c0297909-cbae-491c-a9d8-961b60455288")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("15b5585d-1412-491c-8ed0-925699410169")
    public static final String TOTALCOST_TAGTYPE = "totalCost";

    /**
     * Tells whether a {@link ExecutionModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ExecutionModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ac82158a-2d4e-46e4-a98f-6ab8d7f6da80")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ExecutionModel >> then instantiate a {@link ExecutionModel} proxy.
     * 
     * @return a {@link ExecutionModel} proxy on the created {@link Package}.
     */
    @objid ("a83d471a-b4a9-4d13-8258-3d2aa3f27aaf")
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
    @objid ("4c804f77-3adc-46a9-91c2-698def009347")
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
    @objid ("475490b1-f379-4c96-b36f-4d8313de7d30")
    public static ExecutionModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ExecutionModel.canInstantiate(obj))
        	return new ExecutionModel(obj);
        else
        	throw new IllegalArgumentException("ExecutionModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'Diagram' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0ad0f47f-8137-4ea5-8324-df982e1ca8e7")
    public void addDiagram(final ExecutionModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'historyRecords' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3172d2c6-d066-465e-b334-27467a872a8f")
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
    @objid ("5afeb856-2269-4e65-96ec-6d5b7f9d3392")
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
    @objid ("46bcb1c8-0ec4-4727-86df-b2e7aecc6e94")
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
    @objid ("cd08dfd0-1931-4f57-af3d-5925b675bb5c")
    public void addSloViolations(final SLOViolation obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("69e9be99-15d0-412c-812c-d61f1ad9e178")
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
    @objid ("0a42b571-c107-47ce-a092-137baf94069d")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'costUnit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6a3aa0ab-b591-4a34-94a6-a9e6502ef086")
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
    @objid ("97f459c3-49df-418a-9dfe-d4574f22f37d")
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
    @objid ("2db5bc89-03ff-44fd-912f-eb900f9de221")
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
     * Get the values of the 'Diagram' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b5e1ede5-7140-4c40-97c5-bdc202967a33")
    public List<ExecutionModelDiagram> getDiagram() {
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
    @objid ("f7ad9498-6592-41a9-a825-82ea42536848")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d9d99b34-44b2-4ffa-a32e-1c31453536dc")
    public String getEndTime() {
        return this.elt.getTagValue(ExecutionModel.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'historyRecords' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("61750251-b735-4b82-934c-76bb56a92d19")
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
    @objid ("1b4c1050-473e-4553-940d-fbea84332ea4")
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
    @objid ("736313e6-ba60-4a6e-8b65-8c8df6a811c9")
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
    @objid ("4dd4f8bd-cf40-4862-b411-091d565ff8aa")
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
    @objid ("80b1ba92-c9b3-48ab-b695-3f633b845e3f")
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
    @objid ("902a15d5-be5e-4008-a187-c0c1b051b20c")
    public String getStartTime() {
        return this.elt.getTagValue(ExecutionModel.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'totalCost'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eb6d742a-efed-48c1-afb8-6c3f90aa973d")
    public String getTotalCost() {
        return this.elt.getTagValue(ExecutionModel.MdaTypes.TOTALCOST_TAGTYPE_ELT);
    }

    @objid ("c017d217-9ace-4526-ac70-43bdae1b7ae7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'Diagram' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4ad34726-af3e-447a-9975-053758571811")
    public boolean removeDiagram(final ExecutionModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'historyRecords' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5fcc0896-6128-4b00-a371-6f5d558722e1")
    public boolean removeHistoryRecords(final HistoryRecord obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'measurements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ea0039d3-1bd9-4f3b-bb4a-e638986257fd")
    public boolean removeMeasurements(final Measurement obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'ruleTriggers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e284e010-b941-4422-bbd5-107d4d324894")
    public boolean removeRuleTriggers(final RuleTrigger obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'sloViolations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c0a993d2-0d55-4ea4-aa5e-0a438a2c42cb")
    public boolean removeSloViolations(final SLOViolation obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f7e545d5-f718-426f-8a70-a190d1063b79")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'costUnit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3398a40f-8b27-4f9d-ac11-789e36d6b795")
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
    @objid ("e6131a7d-619e-462b-8a04-79722695eb0b")
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
    @objid ("d9e4f825-d8f0-4711-bcd2-fa835115fdd0")
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
    @objid ("1ac251e4-4074-4b76-9722-344078906f16")
    public void setEndTime(final String value) {
        this.elt.putTagValue(ExecutionModel.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'requirementModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0f435b8a-a3c3-4581-aee6-b9fce6d5a0b6")
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
    @objid ("c5a1ac20-92d1-4d41-a84f-e18394b07323")
    public void setStartTime(final String value) {
        this.elt.putTagValue(ExecutionModel.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'totalCost'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9be88b18-5db3-4024-9db8-2f23593f4d26")
    public void setTotalCost(final String value) {
        this.elt.putTagValue(ExecutionModel.MdaTypes.TOTALCOST_TAGTYPE_ELT, value);
    }

    @objid ("cdb26101-dc83-44fa-9477-08fed60483bd")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("13cd4955-fd7c-4c7e-86de-f3b4615547d4")
    protected ExecutionModel(final Package elt) {
        super(elt);
    }

    @objid ("717cbe7b-f67e-4b04-8825-65ff42b77f09")
    public static final class MdaTypes {
        @objid ("081b9576-8987-45ed-9972-352c0c526531")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("226584e1-fdc7-4518-a97a-87f5478acd15")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("7b6dc01d-43c1-4de5-b039-e15a11302f82")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("6af279ce-5f1e-4f93-ac48-8880bd3f88f6")
        public static TagType TOTALCOST_TAGTYPE_ELT;

        @objid ("93a1bab4-f41b-40b4-ab59-71fde2960bb9")
        private static Stereotype MDAASSOCDEP;

        @objid ("d95258f4-c526-4497-9833-e93006d1cde1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aae8b3a0-874a-4425-a074-6f34978cc930")
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
