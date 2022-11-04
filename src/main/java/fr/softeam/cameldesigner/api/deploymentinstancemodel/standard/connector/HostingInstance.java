/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
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
 * Proxy class to handle a {@link Connector} with << HostingInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f2d290ed-f247-45bf-9ad2-1b3defc04755")
public class HostingInstance extends ComponentRelationInstance {
    @objid ("6bdfcd02-9020-4469-b024-4980ae316088")
    public static final String STEREOTYPE_NAME = "HostingInstance";

    /**
     * Tells whether a {@link HostingInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << HostingInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5404b282-8735-4fe1-8cb2-d7aad5215d20")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << HostingInstance >> then instantiate a {@link HostingInstance} proxy.
     * 
     * @return a {@link HostingInstance} proxy on the created {@link Connector}.
     */
    @objid ("84cee469-9318-4eca-92db-587601fc27e0")
    public static HostingInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HostingInstance.STEREOTYPE_NAME);
        return HostingInstance.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link HostingInstance} proxy from a {@link Connector} stereotyped << HostingInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link HostingInstance} proxy or <i>null</i>.
     */
    @objid ("e10d9a88-9f14-4d96-8914-f7148b3d50dd")
    public static HostingInstance instantiate(final Connector obj) {
        return HostingInstance.canInstantiate(obj) ? new HostingInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HostingInstance} proxy from a {@link Connector} stereotyped << HostingInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link HostingInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("397f8250-2bb5-495c-97a9-3019fed37227")
    public static HostingInstance safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (HostingInstance.canInstantiate(obj))
        	return new HostingInstance(obj);
        else
        	throw new IllegalArgumentException("HostingInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d8c2636e-d0f5-419c-bfdf-cbaf0b8cafbe")
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
        HostingInstance other = (HostingInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("115599ea-dd14-42e1-8b98-3571addc69b8")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8a121d2c-b51f-4de0-851e-c6394f22d920")
    public Hosting getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HostingInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HostingInstance.MdaTypes.MDAASSOCDEP_ROLE), "type")){
                  if (Hosting.canInstantiate(d.getDependsOn()))
                     return (Hosting)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Hosting.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("0ad33127-1e00-41c4-b904-06fc6c6de8d2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b00884e6-7c47-47af-b997-07506d149331")
    public void setType(final Hosting obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HostingInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HostingInstance.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HostingInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(HostingInstance.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("4bc643a9-88a3-40e9-9640-c8b5c44e90fb")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("43408468-5359-43d7-be89-eed5e4867580")
    protected HostingInstance(final Connector elt) {
        super(elt);
    }

    @objid ("0a6f0d2c-ffcc-47ac-a073-417c46822aff")
    public static final class MdaTypes {
        @objid ("a4300427-b7e6-4a63-b772-d23807613513")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("abe4b333-46fc-48f6-8077-9d5a103868a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("8bac3959-30b2-488e-bc32-3d2a283b211b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("662b1a3a-c9f3-44d4-87c4-efa19e32c689")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "db62c499-d8f1-45e2-a427-4649858fbf35");
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
