/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("9693582c-9ce6-4197-87a6-f465129ad814")
    public static final String STEREOTYPE_NAME = "ExecutionModel";

    @objid ("873f8b07-6d16-40c8-bd79-ce30a421ba34")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("692bc91a-486b-47bf-9144-93cd09ff334d")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("c7e7a553-eed3-4c1e-afe4-af410c6379b0")
    public static final String TOTALCOST_TAGTYPE = "totalCost";

    /**
     * Tells whether a {@link ExecutionModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ExecutionModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d16920e0-ce69-424e-be6a-101d9bd17b37")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ExecutionModel >> then instantiate a {@link ExecutionModel} proxy.
     * 
     * @return a {@link ExecutionModel} proxy on the created {@link Package}.
     */
    @objid ("420fa473-e302-4680-93e3-37ed63180ca4")
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
    @objid ("3a8863ed-602f-4bdd-bcbc-4d4b9475950c")
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
    @objid ("85d009be-f4f0-470a-a99b-168c5e908fad")
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
    @objid ("64e5b217-55d4-4b62-8d7d-37aceea278f8")
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
    @objid ("4c63e609-5e8e-4c44-bff7-502f6aece46e")
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
    @objid ("f41e6f4e-ad30-440d-a16b-eae380deb41d")
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
    @objid ("ba4c371e-4249-4d45-9752-32cd25774562")
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
    @objid ("234643f0-34ce-4fb4-b99a-13eb7cf15898")
    public void addSloViolations(final SLOViolation obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("cb77ae12-67b1-4dcd-b44f-e63987a895f1")
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
    @objid ("1271d3f4-cbbf-4e7d-a2e5-dd2a2b7760ea")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'costUnit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("25440ef8-f641-46ff-b84f-fb5526bb723b")
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
    @objid ("c593cfa6-b34c-43e6-8fb5-dfc71ab1c4d4")
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
    @objid ("293d72a5-3dca-4877-986c-739abcaadd53")
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
    @objid ("eadd9793-44fb-4d32-8cc0-3f7011a9223a")
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
    @objid ("1e6e6963-de0c-44f6-933e-ebec60297b2e")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c0892b87-6328-4ab8-83fd-d96e63507ce4")
    public String getEndTime() {
        return this.elt.getTagValue(ExecutionModel.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'historyRecords' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("838e1a58-7579-46b8-8f9e-60d821431d48")
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
    @objid ("e4f44624-2dda-4991-979b-15267bcff375")
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
    @objid ("dd1bc2d5-b2b1-4875-a3c5-06c590cde0b8")
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
    @objid ("38ecb58e-95c4-4943-ab61-40c70e46f645")
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
    @objid ("6e3438d2-6bc1-4857-ac78-d650dfab6b59")
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
    @objid ("ecedaadc-9911-40ad-a5ad-ba266b98d37e")
    public String getStartTime() {
        return this.elt.getTagValue(ExecutionModel.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'totalCost'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0b0a113d-be18-4346-8702-925f8fb9afb9")
    public String getTotalCost() {
        return this.elt.getTagValue(ExecutionModel.MdaTypes.TOTALCOST_TAGTYPE_ELT);
    }

    @objid ("c8dc9403-34a3-4b99-86cf-d6086e0c34d8")
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
    @objid ("cf79e069-9843-41f2-9241-c0f698a2d957")
    public boolean removeDiagram(final ExecutionModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'historyRecords' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a98a43d4-c6e5-45ca-84f2-3c7ce9c73e79")
    public boolean removeHistoryRecords(final HistoryRecord obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'measurements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ed1c8494-bf11-4d01-85ab-eac314ca0138")
    public boolean removeMeasurements(final Measurement obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'ruleTriggers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5e487e29-b872-46ee-a3ba-3723599e5383")
    public boolean removeRuleTriggers(final RuleTrigger obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'sloViolations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0cf3abc4-b3c3-4d0f-9e69-106c26330c17")
    public boolean removeSloViolations(final SLOViolation obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8a40b3eb-da77-49fb-9276-2a1413ba1195")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'costUnit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e0cec0dd-6847-44e0-b6fc-eb9cd0fcd2a3")
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
    @objid ("1f2b9692-ee91-458c-bd12-e4ae9328f644")
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
    @objid ("b4118b69-0dbc-49f7-a47c-2c9205c8669d")
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
    @objid ("5ce3c518-52d9-40fb-8f98-c47ddadc0666")
    public void setEndTime(final String value) {
        this.elt.putTagValue(ExecutionModel.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'requirementModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("82bd0679-c673-4459-b703-ad790389f7fa")
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
    @objid ("471eefe8-f2ff-4ef2-8dec-9fc66ab36e03")
    public void setStartTime(final String value) {
        this.elt.putTagValue(ExecutionModel.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'totalCost'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("59936b52-4f01-4896-9e2f-d4bb69e43787")
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

    @objid ("5983ccd8-9c22-4fb6-9b60-6fc86bfdca87")
    protected ExecutionModel(final Package elt) {
        super(elt);
    }

    @objid ("717cbe7b-f67e-4b04-8825-65ff42b77f09")
    public static final class MdaTypes {
        @objid ("385a40c6-cde1-4721-9f8e-95c4483a6da0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ea0ed273-14c6-437a-a700-7ab27af5e659")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("1cf185a7-7fce-4ae2-9d30-f76363a7b647")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("7ee37162-0356-4b0f-9cee-0da580374c80")
        public static TagType TOTALCOST_TAGTYPE_ELT;

        @objid ("95920f98-259e-4a96-96c1-e29ddf51c173")
        private static Stereotype MDAASSOCDEP;

        @objid ("f1d7a026-e07f-461d-8cd0-ed0d204125ea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d2b75457-37fb-400b-b534-b4ac48cc308c")
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
