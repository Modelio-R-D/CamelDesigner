/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("2eb02448-5acb-4283-8a91-999123856891")
    public static final String STEREOTYPE_NAME = "HistoryRecord";

    @objid ("de82017f-0d2e-4c93-bc40-dcf218736ab3")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("f3870126-72d4-415d-9791-892175ed277f")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link HistoryRecord proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HistoryRecord >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("373a7d2f-d99c-4b3f-a0ab-6c4449fa71c1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HistoryRecord.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HistoryRecord >> then instantiate a {@link HistoryRecord} proxy.
     * 
     * @return a {@link HistoryRecord} proxy on the created {@link Class}.
     */
    @objid ("c0063a5a-094c-431c-9530-2fdff8325b5d")
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
    @objid ("1694a630-bf0c-4d5c-bf65-c64d5a553c08")
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
    @objid ("4ab3c85b-b702-4bae-9711-ea4506384ee8")
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
    @objid ("eb1ea3e7-ed03-4f65-ad5f-c50fbfd8a023")
    public void addInfos(final HistoryInfo obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
            d.setName("infos");
            d.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "infos");
        }
    }

    @objid ("810a3779-67c2-4641-b41e-7cffe45fbb6c")
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
    @objid ("4466e3ac-ee2b-4e02-8854-f8dc2e658c2f")
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
    @objid ("fcada2a5-ac0d-4350-9c9b-324816a1e3b5")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2ac1c2e7-c539-4bc5-9dbd-b1ff4656a730")
    public String getEndTime() {
        return this.elt.getTagValue(HistoryRecord.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'fromDataInstanceModel' role.<p>
     * Role description:
     * null
     */
    @objid ("1e5bfc10-1f35-4892-8978-1823c62c4ef2")
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
    @objid ("7cd25698-756b-49fc-ada9-5462dc1e42c5")
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
    @objid ("760f7d1d-7602-4c76-a15e-677bb5572a4d")
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
    @objid ("2ef6818e-f8ce-4510-aae5-f8a0bf1152ef")
    public String getStartTime() {
        return this.elt.getTagValue(HistoryRecord.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'toDataInstanceModel' role.<p>
     * Role description:
     * null
     */
    @objid ("f63d7c75-9830-4db4-84ba-c18cd3e65a51")
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
    @objid ("7eac4fcd-481b-415f-9e0f-e5931410ef85")
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
    @objid ("06cfc1e6-d76e-4216-8fa3-87f7528a27dd")
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

    @objid ("c8920143-7364-40ff-90ac-b611d1983a4c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'infos' role.<p>
     * Role description:
     * null
     */
    @objid ("eba82042-bbe9-42e6-8b6d-1b6d9b44afa9")
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
    @objid ("8661de82-3528-418f-8ccc-9965d7fe90ea")
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
    @objid ("e29e0429-d98f-4240-8b2a-52a6d82c092d")
    public void setEndTime(final String value) {
        this.elt.putTagValue(HistoryRecord.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'fromDataInstanceModel' role.<p>
     * Role description:
     * null
     */
    @objid ("06eddd50-0ee3-4047-8010-d8deb9fe180e")
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
    @objid ("e37fcab7-73aa-4614-a5ca-fd77c4e3a6b7")
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
    @objid ("e8cac1df-689c-4b16-869b-e5b241150068")
    public void setStartTime(final String value) {
        this.elt.putTagValue(HistoryRecord.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'toDataInstanceModel' role.<p>
     * Role description:
     * null
     */
    @objid ("6f538a5b-e315-4ee5-a283-8cbae07914ca")
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
    @objid ("2a404624-fa90-4c32-a537-52917fa41654")
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
    @objid ("f5628079-f917-4e23-8d12-1fc0c379b043")
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

    @objid ("6da2a491-10d1-48f2-9669-9a06142e85a0")
    protected HistoryRecord(final Class elt) {
        super(elt);
    }

    @objid ("e24b3488-ded8-4979-93ff-a32b3197e75e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("462585e9-30df-4f59-b5c8-ec375790a32b")
    public static final class MdaTypes {
        @objid ("510f9692-5867-431c-9c9f-22a477f57e03")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("20b5dc86-9a2b-4483-a63a-d490e63e86b0")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("5f777256-13f9-4178-9f33-d90e1bde1b31")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("3a0ec53f-3e1b-4f75-bbef-c378c2e4d33a")
        private static Stereotype MDAASSOCDEP;

        @objid ("4a9c01fc-0678-46ea-9534-53819886f584")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("420d693c-44a2-435c-9e33-271e1942a1e7")
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
