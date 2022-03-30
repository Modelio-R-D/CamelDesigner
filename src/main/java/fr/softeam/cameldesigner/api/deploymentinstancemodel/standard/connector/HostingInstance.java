/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("d76d0d12-8505-4960-a483-fe05c1066a7f")
    public static final String STEREOTYPE_NAME = "HostingInstance";

    /**
     * Tells whether a {@link HostingInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << HostingInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9c3bf855-e993-49e9-aa84-ec26096dd6ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << HostingInstance >> then instantiate a {@link HostingInstance} proxy.
     * 
     * @return a {@link HostingInstance} proxy on the created {@link Connector}.
     */
    @objid ("bb829acb-dc8f-4aea-a71e-bc7b2772018d")
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
    @objid ("7a2db8ed-4803-4881-83ba-fc602f1cfbcd")
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
    @objid ("2bd1a0aa-08c9-44d8-83b9-1cfbeaf706f0")
    public static HostingInstance safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (HostingInstance.canInstantiate(obj))
        	return new HostingInstance(obj);
        else
        	throw new IllegalArgumentException("HostingInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3bbba166-9eda-4cfd-a769-78812e6dd327")
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
    @objid ("83866da2-429b-46b8-85fe-76a834acb273")
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
    @objid ("214bcd76-77a5-40d4-a20c-495e9697372a")
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

    @objid ("ed2c3f83-d929-4af9-97e9-0e74b34815f4")
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
    @objid ("7e1910f2-c52b-4bdf-968d-6ee3b19347bb")
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

    @objid ("65f98232-8365-41f7-879c-ff2dc0c222c3")
    protected HostingInstance(final Connector elt) {
        super(elt);
    }

    @objid ("0a6f0d2c-ffcc-47ac-a073-417c46822aff")
    public static final class MdaTypes {
        @objid ("d7a252e2-a63a-4ecb-91e7-6b877c840a5c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3d480452-dcf0-44dd-8580-94ce4b2b9a07")
        private static Stereotype MDAASSOCDEP;

        @objid ("93ccbc48-5be0-425b-863c-36825b5de625")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6296d285-b98e-4466-a028-621f91c0e3dc")
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
