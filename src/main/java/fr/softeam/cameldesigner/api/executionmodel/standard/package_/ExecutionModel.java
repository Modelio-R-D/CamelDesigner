/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("e64d7da8-bdf8-4f0a-a725-12890b05e160")
    public static final String STEREOTYPE_NAME = "ExecutionModel";

    @objid ("9345f54f-408c-4f59-b0cc-86b46e3b8f93")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("e1b1bb9f-b56e-4f68-ba9e-2f4ec6936521")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("70552092-77f7-4866-8251-3bde26185e86")
    public static final String TOTALCOST_TAGTYPE = "totalCost";

    /**
     * Tells whether a {@link ExecutionModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ExecutionModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("acea92ba-63b3-4605-beb8-0261ef0cacd0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ExecutionModel >> then instantiate a {@link ExecutionModel} proxy.
     * 
     * @return a {@link ExecutionModel} proxy on the created {@link Package}.
     */
    @objid ("b8c2bdf7-cb23-4f33-8b6b-4cac6e56a3a2")
    public static ExecutionModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModel.STEREOTYPE_NAME);
        return ExecutionModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ExecutionModel} proxy from a {@link Package} stereotyped << ExecutionModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link ExecutionModel} proxy or <i>null</i>.
     */
    @objid ("4c63e355-265a-4d48-890a-1fdd27b95b9f")
    public static ExecutionModel instantiate(final Package obj) {
        return ExecutionModel.canInstantiate(obj) ? new ExecutionModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExecutionModel} proxy from a {@link Package} stereotyped << ExecutionModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link ExecutionModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7b9c97c2-690b-4c38-be97-eb666f26600c")
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
     */
    @objid ("57dd56c5-5002-4882-b195-69f327b79316")
    public void addDiagram(final ExecutionModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'historyRecords' role.<p>
     * Role description:
     * null
     */
    @objid ("ca98f38f-1c8d-489d-b581-1da156181519")
    public void addHistoryRecords(final HistoryRecord obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'measurements' role.<p>
     * Role description:
     * null
     */
    @objid ("d450a887-a8a9-4a53-b34c-085d797d3350")
    public void addMeasurements(final Measurement obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'ruleTriggers' role.<p>
     * Role description:
     * null
     */
    @objid ("6911e341-b5fc-46c3-a81d-cdc7045c160c")
    public void addRuleTriggers(final RuleTrigger obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'sloViolations' role.<p>
     * Role description:
     * null
     */
    @objid ("66ad076f-eb04-49b1-af8f-cee1933f9e60")
    public void addSloViolations(final SLOViolation obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("e0832479-a06f-4aec-95e8-ca8d89d1e72e")
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
     */
    @objid ("396ab50d-cf30-4fff-a774-7eb7149c24fe")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'costUnit' role.<p>
     * Role description:
     * null
     */
    @objid ("a9cb5ebe-ed50-4a29-afef-83b7186838c0")
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
     */
    @objid ("29164e43-d2f1-49cd-8e08-ec31f7dcc2a1")
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
     */
    @objid ("f5523f93-bd08-4fc1-a627-2e384db6c086")
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
     */
    @objid ("c5760ec4-9e93-4b46-b3eb-5f8a12decf54")
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
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("0d09cddb-9f64-4901-8bda-5f69bba353f4")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5465c539-1080-423f-a4a4-60cff9e49217")
    public String getEndTime() {
        return this.elt.getTagValue(ExecutionModel.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'historyRecords' role.<p>
     * Role description:
     * null
     */
    @objid ("eaece330-ca3d-4136-9fe6-09a6b19b66fd")
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
     */
    @objid ("53fd3cf2-1e39-4216-8475-f98d32e635a3")
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
     */
    @objid ("13118f8a-25f9-49fa-a64d-80b443bf5f7e")
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
     */
    @objid ("766f0b38-b787-4255-9347-d5405a27d406")
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
     */
    @objid ("829c3297-e87b-4b58-b8cf-275ff15dada4")
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
    @objid ("ff07adeb-261c-497b-b0f6-70226b5fe3cb")
    public String getStartTime() {
        return this.elt.getTagValue(ExecutionModel.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'totalCost'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a2599256-e6e1-4253-a9b9-923d75c06717")
    public String getTotalCost() {
        return this.elt.getTagValue(ExecutionModel.MdaTypes.TOTALCOST_TAGTYPE_ELT);
    }

    @objid ("4b5a00c0-8417-4ed6-90e3-09bceb8c2bef")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'Diagram' role.<p>
     * Role description:
     * null
     */
    @objid ("ebded3df-7ee4-4d5a-98ff-13f16dee9c30")
    public boolean removeDiagram(final ExecutionModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'historyRecords' role.<p>
     * Role description:
     * null
     */
    @objid ("a365340d-55b0-4c08-9be1-b0587772d0f2")
    public boolean removeHistoryRecords(final HistoryRecord obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'measurements' role.<p>
     * Role description:
     * null
     */
    @objid ("d9f0e51e-7dc0-4e56-ae2f-8c36e6ecf65a")
    public boolean removeMeasurements(final Measurement obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'ruleTriggers' role.<p>
     * Role description:
     * null
     */
    @objid ("6d8ca45c-4724-4ce7-ba72-e811e1584e4a")
    public boolean removeRuleTriggers(final RuleTrigger obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'sloViolations' role.<p>
     * Role description:
     * null
     */
    @objid ("c1220cd0-9ff5-43ec-9aba-783efe895aa3")
    public boolean removeSloViolations(final SLOViolation obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("a90d70d9-3b4c-44c8-9eaf-a1fede257bff")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'costUnit' role.<p>
     * Role description:
     * null
     */
    @objid ("6ec4c99b-8c0d-4bba-89ba-a7b20c69b117")
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
     */
    @objid ("dccea9ff-894a-4831-aef0-085063e0ca34")
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
     */
    @objid ("a9ae4bde-93fa-4d2d-9770-6bcfa39d0c5d")
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
    @objid ("a1f02289-f2c4-43ec-acc6-36f62a0476fa")
    public void setEndTime(final String value) {
        this.elt.putTagValue(ExecutionModel.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'requirementModel' role.<p>
     * Role description:
     * null
     */
    @objid ("021d3709-4099-4db3-afc6-395c1dc5e8ca")
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
    @objid ("2ff156f6-bdbf-42b3-a735-5102ec4a1980")
    public void setStartTime(final String value) {
        this.elt.putTagValue(ExecutionModel.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'totalCost'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9136f9f9-5348-47f1-ae37-939b621a66c6")
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

    @objid ("23193f52-ba24-44e4-8e35-0ee5f6476efa")
    protected ExecutionModel(final Package elt) {
        super(elt);
    }

    @objid ("717cbe7b-f67e-4b04-8825-65ff42b77f09")
    public static final class MdaTypes {
        @objid ("7a37e522-3595-4d8c-aa9f-a778c4c3d3f2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c45c4e1d-dbee-4409-bc8e-20f1941409d7")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("d6442155-f17f-40e8-8654-f050863a80d8")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("066670f0-a655-4bac-a2cc-f4ce33e98b51")
        public static TagType TOTALCOST_TAGTYPE_ELT;

        @objid ("efbc36ea-58e2-4a32-80c0-9add08aa9c65")
        private static Stereotype MDAASSOCDEP;

        @objid ("27aafe1b-a63e-4c1f-85a3-961391f4fd1f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a45521ec-c8f4-4813-a6e5-17aafcf5a283")
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
