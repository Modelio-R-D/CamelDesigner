/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << HistoryRecord >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b33e67d3-9fd0-4004-abdd-b08e7227aa1d")
public class HistoryRecord extends FeatureClass {
    @objid ("9224c5eb-1357-430f-92fe-270c5d5c0e05")
    public static final String STEREOTYPE_NAME = "HistoryRecord";

    @objid ("8c046e1a-4fa2-422e-88cb-85b4fb323fbb")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("7e6aad5e-35f4-48cd-8755-e5775fc761d6")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link HistoryRecord proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HistoryRecord >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("92bb2634-be7a-4df5-abcc-56b9deba3b92")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HistoryRecord.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HistoryRecord >> then instantiate a {@link HistoryRecord} proxy.
     * 
     * @return a {@link HistoryRecord} proxy on the created {@link Class}.
     */
    @objid ("e4631b0d-54da-4446-9677-6088b5e30bdf")
    public static HistoryRecord create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HistoryRecord.STEREOTYPE_NAME);
        return HistoryRecord.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link HistoryRecord} proxy from a {@link Class} stereotyped << HistoryRecord >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link HistoryRecord} proxy or <i>null</i>.
     */
    @objid ("2dc20657-ce34-4431-baac-bfbb0e18b3f4")
    public static HistoryRecord instantiate(final Class obj) {
        return HistoryRecord.canInstantiate(obj) ? new HistoryRecord(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HistoryRecord} proxy from a {@link Class} stereotyped << HistoryRecord >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link HistoryRecord} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("be3c44da-23b0-46bd-994c-0a3140c02190")
    public static HistoryRecord safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HistoryRecord.canInstantiate(obj))
        	return new HistoryRecord(obj);
        else
        	throw new IllegalArgumentException("HistoryRecord: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'infos' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a845fecd-ecc2-4c98-b09e-e48f3377b33f")
    public void addInfos(final HistoryInfo obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("78a02ce8-ced2-457f-b23c-83c848fbf88f")
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
        HistoryRecord other = (HistoryRecord) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'cause' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("25d4ca6d-a4f4-4177-b84e-78c36266879f")
    public Cause getCause() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "cause")){
                  if (RuleTrigger.canInstantiate(d.getDependsOn()))
                     return (RuleTrigger)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RuleTrigger.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SLOViolation.canInstantiate(d.getDependsOn()))
                     return (SLOViolation)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SLOViolation.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Cause.canInstantiate(d.getDependsOn()))
                     return (Cause)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Cause.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("a026db64-4fab-4f92-a0ab-a6ec69c6dd1b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a0a2a1c2-e951-418b-b0cf-162197a7701f")
    public String getEndTime() {
        return this.elt.getTagValue(HistoryRecord.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'fromDataInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("61a1b228-e101-4a3b-9ac4-5bf26cd0d35e")
    public DataInstanceModel getFromDataInstanceModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "fromDataInstanceModel")){
                  if (DataInstanceModel.canInstantiate(d.getDependsOn()))
                     return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'fromDeploymentInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c4999252-ad90-41d0-be9a-a5ddf8eb3552")
    public DeploymentInstanceModel getFromDeploymentInstanceModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "fromDeploymentInstanceModel")){
                  if (DeploymentInstanceModel.canInstantiate(d.getDependsOn()))
                     return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'infos' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("51f6a87a-0bef-42cd-922c-e3b091791a49")
    public List<HistoryInfo> getInfos() {
        List<HistoryInfo> results = new ArrayList<>();
        for (ModelTree mObj : ((Class) this.elt).getOwnedElement()){
        	if (HistoryInfo.canInstantiate(mObj))
        			results.add((HistoryInfo)CamelDesignerProxyFactory.instantiate(mObj, HistoryInfo.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dca0b13f-1307-433d-b918-fc8dae467777")
    public String getStartTime() {
        return this.elt.getTagValue(HistoryRecord.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'toDataInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b90b4e57-9039-4146-a19b-fb05bc1e377f")
    public DataInstanceModel getToDataInstanceModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "toDataInstanceModel")){
                  if (DataInstanceModel.canInstantiate(d.getDependsOn()))
                     return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'toDeploymentInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("12e82296-5b1d-488a-b92f-a0754247ae90")
    public DeploymentInstanceModel getToDeploymentInstanceModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "toDeploymentInstanceModel")){
                  if (DeploymentInstanceModel.canInstantiate(d.getDependsOn()))
                     return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("38a0b594-9e29-4585-beac-7921fca6de91")
    public MmsObject getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "type")){
                  if (MmsConcept.canInstantiate(d.getDependsOn()))
                     return (MmsConcept)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConcept.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsConceptInstance.canInstantiate(d.getDependsOn()))
                     return (MmsConceptInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsProperty.canInstantiate(d.getDependsOn()))
                     return (MmsProperty)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsProperty.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsPropertyInstance.canInstantiate(d.getDependsOn()))
                     return (MmsPropertyInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsPropertyInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("42d01fed-d602-4486-ab07-e98dd429720e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'infos' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a80b5b7a-7ff3-4f37-946d-8cc232ece8ad")
    public boolean removeInfos(final HistoryInfo obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'cause' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cad03a0f-27ba-4751-a2d3-28ecb53c82d5")
    public void setCause(final Cause obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "cause")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
              dep.setName("cause");      dep.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "cause");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("453ef5d9-f4ba-4c07-a013-fc851dddbee7")
    public void setEndTime(final String value) {
        this.elt.putTagValue(HistoryRecord.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'fromDataInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a1623a06-e355-400f-97cf-15b0fe4f59cb")
    public void setFromDataInstanceModel(final DataInstanceModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "fromDataInstanceModel")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
              dep.setName("fromDataInstanceModel");      dep.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "fromDataInstanceModel");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'fromDeploymentInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("80fb3163-6176-4bb7-96e8-e642c916166e")
    public void setFromDeploymentInstanceModel(final DeploymentInstanceModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "fromDeploymentInstanceModel")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
              dep.setName("fromDeploymentInstanceModel");      dep.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "fromDeploymentInstanceModel");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("56662b83-cdf9-48af-a801-02317582da4b")
    public void setStartTime(final String value) {
        this.elt.putTagValue(HistoryRecord.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'toDataInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a1939b50-8b4e-4045-8b19-e9ef0c7f1bc6")
    public void setToDataInstanceModel(final DataInstanceModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "toDataInstanceModel")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
              dep.setName("toDataInstanceModel");      dep.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "toDataInstanceModel");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'toDeploymentInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cf4fcec6-1ffc-42c1-9605-f478cc90fef3")
    public void setToDeploymentInstanceModel(final DeploymentInstanceModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "toDeploymentInstanceModel")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
              dep.setName("toDeploymentInstanceModel");      dep.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "toDeploymentInstanceModel");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("21b07dc7-9c7f-4fe2-b684-372fa0234dba")
    public void setType(final MmsObject obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("e24b3488-ded8-4979-93ff-a32b3197e75e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("1572058c-575b-4177-b635-e9951c54b9ca")
    protected HistoryRecord(final Class elt) {
        super(elt);
    }

    @objid ("462585e9-30df-4f59-b5c8-ec375790a32b")
    public static final class MdaTypes {
        @objid ("8e3b7313-e85f-4881-9468-ce36a63f2873")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5115a79f-d895-41a0-9be9-f17074185594")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("822fed12-2203-4dad-8c7b-cba9a6ba677b")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("50690706-d6c5-4dbf-8fba-e39cdd81133b")
        private static Stereotype MDAASSOCDEP;

        @objid ("9d498fcc-6e60-4cd8-bb5e-93e0b00c5fa1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7b56ebad-0005-45fc-b9ff-9f2d2c5f1e06")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe3e6072-933d-456c-bd5a-77cd25aeb183");
            STARTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d4316e17-4ce7-49fa-8ef0-c2743e111a0b");
            ENDTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bb514f2c-6871-49ad-a376-0f3411c9acca");
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
