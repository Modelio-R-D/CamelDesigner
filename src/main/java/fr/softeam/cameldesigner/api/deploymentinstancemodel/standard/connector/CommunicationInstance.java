/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("6a86d08c-f05b-4976-832e-9707c9e5ce11")
    public static final String STEREOTYPE_NAME = "CommunicationInstance";

    /**
     * Tells whether a {@link CommunicationInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << CommunicationInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5d39d8ac-db75-4062-978b-1ac12fce75ab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << CommunicationInstance >> then instantiate a {@link CommunicationInstance} proxy.
     * 
     * @return a {@link CommunicationInstance} proxy on the created {@link Connector}.
     */
    @objid ("d6b0ef7e-bedc-4510-8fbf-9712c2b8c693")
    public static CommunicationInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationInstance.STEREOTYPE_NAME);
        return CommunicationInstance.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationInstance} proxy from a {@link Connector} stereotyped << CommunicationInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link CommunicationInstance} proxy or <i>null</i>.
     */
    @objid ("c498d253-0eeb-4016-9cce-06b4b5acb1c3")
    public static CommunicationInstance instantiate(final Connector obj) {
        return CommunicationInstance.canInstantiate(obj) ? new CommunicationInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationInstance} proxy from a {@link Connector} stereotyped << CommunicationInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link CommunicationInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("38cad69d-1c22-4bc7-a12e-a58ef40bb488")
    public static CommunicationInstance safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (CommunicationInstance.canInstantiate(obj))
        	return new CommunicationInstance(obj);
        else
        	throw new IllegalArgumentException("CommunicationInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7618e82e-aae0-4011-8703-9f63bbeac0e7")
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
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("b64996bd-4cb7-4633-a440-2b66d4a1c3ab")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    /**
     * Get the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6d85d9be-5e95-4dc6-a135-4c27e73facb8")
    public DeploymentInstanceModel getParent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE), "parent")){
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
    @objid ("49aaf39a-0774-48be-8717-0c1614238b49")
    public Communication getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE), "type")){
                  if (Communication.canInstantiate(d.getDependsOn()))
                     return (Communication)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Communication.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("d1901d9d-c2ca-4b8b-a8a5-6380e5f19fd7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1aa571f3-7792-40a3-b52c-c97e3d4bd2c0")
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
     * 
     */
    @objid ("6fb17f62-4c1b-4f0c-9745-29d26400b899")
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

    @objid ("a4d7cd20-9db0-420f-a3ff-34af08fba01b")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("98b0a7e6-0bf0-48ab-8b65-ea4126c53b55")
    protected CommunicationInstance(final Connector elt) {
        super(elt);
    }

    @objid ("cf21fdd9-ead8-4cfe-914e-4a923f9c983f")
    public static final class MdaTypes {
        @objid ("a870de18-0f86-449c-951e-3c9bad45cd2a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("206379e4-02a9-431d-bad1-a3811451e9b7")
        private static Stereotype MDAASSOCDEP;

        @objid ("b2daa78d-26d4-49b3-9f3b-5797665a7a31")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c0f0f88e-c6fe-4ead-8e25-9fc4f18527e0")
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
