/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
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
    @objid ("1b2ca407-b86f-4a04-9e29-75df97c8f80f")
    public static final String STEREOTYPE_NAME = "HistoryRecord";

    @objid ("7d5a6b9f-8e3a-40f8-aedc-7cfc5a0f3dbb")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("df80aedd-32e9-43f9-ac2b-67ce883ac0b3")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link HistoryRecord proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HistoryRecord >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("335698e6-0bbf-487d-95b5-ae87d6da98e1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HistoryRecord.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HistoryRecord >> then instantiate a {@link HistoryRecord} proxy.
     * 
     * @return a {@link HistoryRecord} proxy on the created {@link Class}.
     */
    @objid ("7a6b6a3f-357d-4790-bff0-999f501acdae")
    public static HistoryRecord create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HistoryRecord.STEREOTYPE_NAME);
        return HistoryRecord.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link HistoryRecord} proxy from a {@link Class} stereotyped << HistoryRecord >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link HistoryRecord} proxy or <i>null</i>.
     */
    @objid ("d826a53a-5ecf-4bf0-940a-a7c77f84012f")
    public static HistoryRecord instantiate(final Class obj) {
        return HistoryRecord.canInstantiate(obj) ? new HistoryRecord(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HistoryRecord} proxy from a {@link Class} stereotyped << HistoryRecord >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link HistoryRecord} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0a214245-a668-4a27-aeed-b3f2c405842d")
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
     */
    @objid ("de6efa4a-f74d-4612-a8f1-a3399688948c")
    public void addInfos(final HistoryInfo obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
            d.setName("infos");
            d.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "infos");
        }
    }

    @objid ("da1fbf93-d572-4394-b265-7749228ad6ce")
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
     */
    @objid ("0432d672-bb99-4f10-b25d-f0fda432101b")
    public Cause getCause() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "cause")
                  && Cause.canInstantiate(d.getDependsOn())) {
                     return (Cause)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Cause.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("34d6ffce-1391-4ccb-9dbd-bc7cce8a8bf6")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bb65169f-6bfd-4860-be15-67bc03ff9523")
    public String getEndTime() {
        return this.elt.getTagValue(HistoryRecord.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'fromDataInstanceModel' role.<p>
     * Role description:
     * null
     */
    @objid ("276add36-edad-4e8a-9aae-6309f3379c8b")
    public DataInstanceModel getFromDataInstanceModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "fromDataInstanceModel")
                  && DataInstanceModel.canInstantiate(d.getDependsOn())) {
                     return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'fromDeploymentInstanceModel' role.<p>
     * Role description:
     * null
     */
    @objid ("58917d33-cd72-46c0-b743-10d81d490eee")
    public DeploymentInstanceModel getFromDeploymentInstanceModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "fromDeploymentInstanceModel")
                  && DeploymentInstanceModel.canInstantiate(d.getDependsOn())) {
                     return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'infos' role.<p>
     * Role description:
     * null
     */
    @objid ("71019333-a9da-4df9-b2ab-4eb2491f36b7")
    public List<HistoryInfo> getInfos() {
        List<HistoryInfo> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "infos")
              && HistoryInfo.canInstantiate(d.getDependsOn()))
                results.add((HistoryInfo)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HistoryInfo.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("57fe3be3-64a2-4bd7-b698-e092bb0b1f94")
    public String getStartTime() {
        return this.elt.getTagValue(HistoryRecord.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'toDataInstanceModel' role.<p>
     * Role description:
     * null
     */
    @objid ("f294a878-e2eb-4233-b221-1439f07b6b96")
    public DataInstanceModel getToDataInstanceModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "toDataInstanceModel")
                  && DataInstanceModel.canInstantiate(d.getDependsOn())) {
                     return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'toDeploymentInstanceModel' role.<p>
     * Role description:
     * null
     */
    @objid ("d908ee96-efb5-4d10-b3f4-cffabd074ce4")
    public DeploymentInstanceModel getToDeploymentInstanceModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "toDeploymentInstanceModel")
                  && DeploymentInstanceModel.canInstantiate(d.getDependsOn())) {
                     return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("1dedc265-1210-415c-88a1-11e20bd649aa")
    public MmsObject getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "type")
                  && MmsObject.canInstantiate(d.getDependsOn())) {
                     return (MmsObject)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsObject.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("62e558a8-d3a6-436f-a022-e713a31bc613")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'infos' role.<p>
     * Role description:
     * null
     */
    @objid ("3c891f4c-729b-4d4d-8567-09be8e77f0b2")
    public boolean removeInfos(final HistoryInfo obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'cause' role.<p>
     * Role description:
     * null
     */
    @objid ("20dab0ac-efe1-4757-bee3-29666d94c8b3")
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
    @objid ("31f4ea21-b584-441b-ad40-fe6cc32194d3")
    public void setEndTime(final String value) {
        this.elt.putTagValue(HistoryRecord.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'fromDataInstanceModel' role.<p>
     * Role description:
     * null
     */
    @objid ("c321bd6f-f3b1-41ef-a15a-3b44d17728dd")
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
     */
    @objid ("8c1abfd2-9b12-4908-be9a-ab0772aea520")
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
    @objid ("87c5393c-5202-4901-b86d-618aa4b96bfa")
    public void setStartTime(final String value) {
        this.elt.putTagValue(HistoryRecord.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'toDataInstanceModel' role.<p>
     * Role description:
     * null
     */
    @objid ("585d5c21-656a-4a29-b3f8-1e6747eb26b4")
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
     */
    @objid ("009f5c48-158b-4db6-b712-9679c8d0f9c5")
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
     */
    @objid ("9f9bbfef-2978-4c34-b6e0-f148af42d39e")
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

    @objid ("e6c8727e-1f0c-4e9f-879b-271bb77c5af0")
    protected HistoryRecord(final Class elt) {
        super(elt);
    }

    @objid ("462585e9-30df-4f59-b5c8-ec375790a32b")
    public static final class MdaTypes {
        @objid ("7f89aac2-98f8-4dc0-b0e1-924819b8adf6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c8e9eefd-6762-4286-94fe-ccfff05f17e3")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("69d141d9-9aa7-469d-84ed-205a992e2a70")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("caf30610-36e0-429f-afc6-f705c49876cd")
        private static Stereotype MDAASSOCDEP;

        @objid ("46f46867-ec7f-40a6-b901-4f8c771bbc49")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ab05f4aa-6484-4e86-92c0-a39a893092c9")
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
