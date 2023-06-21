/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("7a0584bd-4734-4005-85ac-1a65f7607da0")
    public static final String STEREOTYPE_NAME = "HostingInstance";

    /**
     * Tells whether a {@link HostingInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << HostingInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("06902a7d-c652-47cf-9976-f822cfc04be4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << HostingInstance >> then instantiate a {@link HostingInstance} proxy.
     * 
     * @return a {@link HostingInstance} proxy on the created {@link Connector}.
     */
    @objid ("0a9e44e4-b374-434e-8284-9ebd33d440a7")
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
    @objid ("8503e7db-6f36-4f8c-a4d0-2f1b88b8372b")
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
    @objid ("59a57b4c-3477-43bf-8661-834b468a0270")
    public static HostingInstance safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (HostingInstance.canInstantiate(obj))
        	return new HostingInstance(obj);
        else
        	throw new IllegalArgumentException("HostingInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5f6c558e-9430-46b5-ba9d-f4bd7188d68a")
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
    @objid ("7b5c0cd6-b08c-4f94-afc4-d919be118625")
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
    @objid ("465547e5-5bab-4155-abae-800b7312f329")
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

    @objid ("1b37f98c-d971-4efc-81c9-88cb0603ce3d")
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
    @objid ("f8b43cc9-7b5f-457b-9ec6-4f5d7502f9b6")
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

    @objid ("13a30af3-bc24-469b-b525-5794c4907005")
    protected HostingInstance(final Connector elt) {
        super(elt);
    }

    @objid ("0a6f0d2c-ffcc-47ac-a073-417c46822aff")
    public static final class MdaTypes {
        @objid ("36c8db85-8235-41dc-bd88-9a22ce63516b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a855451d-3dec-4d0c-856e-2737db5f3c78")
        private static Stereotype MDAASSOCDEP;

        @objid ("a57798d4-3194-42c5-8f0c-7ca95b1de1cd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fe082a62-947a-4b56-9c89-836bc531a8c3")
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
