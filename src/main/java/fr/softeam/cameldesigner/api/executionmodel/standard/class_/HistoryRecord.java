/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("f113ea7c-d956-4a75-9f13-db6ac32e410d")
    public static final String STEREOTYPE_NAME = "HistoryRecord";

    @objid ("9dd60238-9507-4635-831c-77cf269aa0ce")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("5d0a965a-dcc2-4743-b039-e925be77474f")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link HistoryRecord proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HistoryRecord >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("585e1273-b549-4091-af97-cfcf56ac9317")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HistoryRecord.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HistoryRecord >> then instantiate a {@link HistoryRecord} proxy.
     * 
     * @return a {@link HistoryRecord} proxy on the created {@link Class}.
     */
    @objid ("efa51681-db09-41b5-9b50-9a29c4dc2e01")
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
    @objid ("659f17c5-b24d-417a-a662-db07594442a8")
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
    @objid ("79a5d405-2a11-4967-8d1b-84936f4ad1f3")
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
    @objid ("0f39eb12-7279-4eda-81cb-f4b49bc1823d")
    public void addInfos(final HistoryInfo obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("88160c01-e412-4445-ae6b-428bfb29fbc3")
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
    @objid ("b9efdce3-0a24-494c-b8a9-c5f41825adeb")
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
    @objid ("4ac53a58-3dd9-4319-bf32-32e8c2266b0a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("df3c3cf3-ad07-4025-890c-e6624435c67b")
    public String getEndTime() {
        return this.elt.getTagValue(HistoryRecord.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'fromDataInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("09e279b0-623f-442c-ad97-e3332b80fff9")
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
    @objid ("d11706c1-d823-4f14-93a2-e5f050bb5068")
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
    @objid ("ffb77af4-8f99-4909-85b9-7fd9ac8a76ea")
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
    @objid ("49326085-ebfd-4217-8e1e-d2456295d608")
    public String getStartTime() {
        return this.elt.getTagValue(HistoryRecord.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'toDataInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8695e9f9-25d2-483b-aa6c-a209048af941")
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
    @objid ("25be86d3-63c3-43c7-b256-64f31e11aa71")
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
    @objid ("766cc6f4-69ea-45b6-b263-d0a54b57924b")
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

    @objid ("4bceee13-bb19-46b6-8c97-3addea86690d")
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
    @objid ("292862a6-2e74-4b8a-b3af-2fd4a3effdcd")
    public boolean removeInfos(final HistoryInfo obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'cause' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4f18b4bd-ef7d-4e0f-bb7c-f839c81bd23a")
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
    @objid ("0bb1f83c-374b-43ae-906f-777ed627798d")
    public void setEndTime(final String value) {
        this.elt.putTagValue(HistoryRecord.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'fromDataInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2a58f99b-2c67-420e-b1d3-ed5550e80e14")
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
    @objid ("5baaddba-8154-44b6-88c7-8e41c69ba61f")
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
    @objid ("c4e0dca0-8d46-4831-8a70-2fbfdc532df5")
    public void setStartTime(final String value) {
        this.elt.putTagValue(HistoryRecord.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'toDataInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("76daab24-b7e7-408f-8aa6-65934e4d583f")
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
    @objid ("dd7fdf4a-4365-476d-b5f6-42070816dcd4")
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
    @objid ("c155d581-f099-4601-9c17-b10111865bc6")
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

    @objid ("d04995fe-2685-4ddd-a6b3-8ee62aff8246")
    protected HistoryRecord(final Class elt) {
        super(elt);
    }

    @objid ("462585e9-30df-4f59-b5c8-ec375790a32b")
    public static final class MdaTypes {
        @objid ("424e8c36-82b0-442f-92c7-18f0fedc92d8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0badf272-0bce-4634-b9ce-577e6731a218")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("b19afc75-04ec-42d7-8911-27a7bbf2516b")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("aab8aaca-25e2-4872-ba2e-2e148efae4b0")
        private static Stereotype MDAASSOCDEP;

        @objid ("0ebfcdda-88be-43a8-8f9c-79b0ca39513b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("39c3effb-f7af-4a40-b5ae-4fed9856a7f6")
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
