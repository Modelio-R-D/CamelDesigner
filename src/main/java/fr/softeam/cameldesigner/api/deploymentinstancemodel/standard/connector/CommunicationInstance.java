/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
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
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Connector} with << CommunicationInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("355d42b2-d4dd-49ae-bfd1-58fbf281ecd1")
public class CommunicationInstance extends ComponentRelationInstance {
    @objid ("37fc543d-943c-4bd0-8718-c7bf1e24efa5")
    public static final String STEREOTYPE_NAME = "CommunicationInstance";

    /**
     * Tells whether a {@link CommunicationInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << CommunicationInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d3c937e2-9496-4f6e-a289-65415160ef8f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << CommunicationInstance >> then instantiate a {@link CommunicationInstance} proxy.
     * 
     * @return a {@link CommunicationInstance} proxy on the created {@link Connector}.
     */
    @objid ("debf6ff8-06a0-4c6a-b0af-30833da9924f")
    public static CommunicationInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationInstance.STEREOTYPE_NAME);
        return CommunicationInstance.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationInstance} proxy from a {@link Connector} stereotyped << CommunicationInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Connector
     * @return a {@link CommunicationInstance} proxy or <i>null</i>.
     */
    @objid ("1b123520-0248-4440-96ee-3b5fe3a25ae0")
    public static CommunicationInstance instantiate(final Connector obj) {
        return CommunicationInstance.canInstantiate(obj) ? new CommunicationInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationInstance} proxy from a {@link Connector} stereotyped << CommunicationInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Connector}
     * @return a {@link CommunicationInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("357165b8-1d09-45d8-bc80-939981809a52")
    public static CommunicationInstance safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (CommunicationInstance.canInstantiate(obj))
            return new CommunicationInstance(obj);
        else
            throw new IllegalArgumentException("CommunicationInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("634597c8-6940-4eb3-a37b-3ce216c61573")
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
        CommunicationInstance other = (CommunicationInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}.
     * 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("f6f57852-d317-4ea3-b8e0-70030c55fcac")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    /**
     * Get the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("6cc8b113-5c3a-4ae9-b7fc-0c5a15dc329b")
    public DeploymentInstanceModel getParent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE), "parent")
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
    @objid ("8c6285bf-bc54-4936-9faa-ffbd73c7d48f")
    public Communication getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE), "type")
                  && Communication.canInstantiate(d.getDependsOn())) {
                     return (Communication)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Communication.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("82bc0b28-3d0c-4627-b4e0-015b24b3a299")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("7dc2d178-21ce-4edd-b2de-8c2aa06001ce")
    public void setParent(final DeploymentInstanceModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CommunicationInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE), "parent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CommunicationInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("parent");      dep.putTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE, "parent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("80fbec3d-dc4f-43b2-b508-9aa7c66d9eee")
    public void setType(final Communication obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CommunicationInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CommunicationInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("a888d2bc-6aa8-4b5b-95e6-d9340991f54f")
    protected CommunicationInstance(final Connector elt) {
        super(elt);
    }

    @objid ("a4d7cd20-9db0-420f-a3ff-34af08fba01b")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("cf21fdd9-ead8-4cfe-914e-4a923f9c983f")
    public static final class MdaTypes {
        @objid ("0cf22d91-cd7a-4c02-a3bf-7661ca031977")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("52b83d41-4910-46aa-8ba0-46f44f9db44c")
        private static Stereotype MDAASSOCDEP;

        @objid ("292eb439-4a67-413e-a007-092deb2303e5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4e5d4a32-aa6f-43aa-b91e-03ca4e8acec9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "479fff80-8075-4f90-b7f8-e148699ee433");
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
