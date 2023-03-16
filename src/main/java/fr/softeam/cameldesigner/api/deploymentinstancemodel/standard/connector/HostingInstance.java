/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("1126d8f0-e0ae-43c2-854b-094901ce8b92")
    public static final String STEREOTYPE_NAME = "HostingInstance";

    /**
     * Tells whether a {@link HostingInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << HostingInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2d053b68-835c-419b-a741-309b496fc138")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << HostingInstance >> then instantiate a {@link HostingInstance} proxy.
     * 
     * @return a {@link HostingInstance} proxy on the created {@link Connector}.
     */
    @objid ("eea61473-bb68-43d3-9653-a5b6086956d8")
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
    @objid ("ff592667-d42c-4bb5-9b96-cbbcfb421e44")
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
    @objid ("d7fa3f2d-3c74-4af7-8c6e-8de4a51f94cd")
    public static HostingInstance safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (HostingInstance.canInstantiate(obj))
        	return new HostingInstance(obj);
        else
        	throw new IllegalArgumentException("HostingInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ef1bcb4e-0f44-437f-bfc8-2104609deac8")
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
    @objid ("1865f257-30be-41fe-8865-8dcb2776da23")
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
    @objid ("7cdf5b67-62ba-4bfb-8911-0160669afe63")
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

    @objid ("80b9a2fb-e5ea-4472-8caa-947911410df6")
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
    @objid ("919fc9d5-790b-4909-8317-9e536606c429")
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

    @objid ("0d5685df-9af8-4999-ae82-8848921e6c5c")
    protected HostingInstance(final Connector elt) {
        super(elt);
    }

    @objid ("0a6f0d2c-ffcc-47ac-a073-417c46822aff")
    public static final class MdaTypes {
        @objid ("d4692f03-37fd-4369-a417-f8d55f89386d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b40f870e-d5b4-4b3f-a7ec-368d2aab7f74")
        private static Stereotype MDAASSOCDEP;

        @objid ("fa0ea3bc-dba3-4aa9-9171-609302360102")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6cd70859-e5b2-47d7-89be-2d0bc2140d7d")
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
