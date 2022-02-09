/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
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
 * Proxy class to handle a {@link Connector} with << Communication >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f5a1e8b4-c495-4efa-a525-7238dae641c0")
public class Communication extends ComponentRelation {
    @objid ("5f755a09-d866-4ab6-8132-88348a66b969")
    public static final String STEREOTYPE_NAME = "Communication";

    /**
     * Tells whether a {@link Communication proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Communication >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("204bd2ed-7552-41d6-9fe0-858bffea2ab8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Communication.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Communication >> then instantiate a {@link Communication} proxy.
     * 
     * @return a {@link Communication} proxy on the created {@link Connector}.
     */
    @objid ("aa7d4439-5d44-451d-bb57-e4573e093b98")
    public static Communication create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Communication.STEREOTYPE_NAME);
        return Communication.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link Communication} proxy from a {@link Connector} stereotyped << Communication >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link Communication} proxy or <i>null</i>.
     */
    @objid ("9c4ea29c-f6f7-43a5-a2b6-612848deb54e")
    public static Communication instantiate(final Connector obj) {
        return Communication.canInstantiate(obj) ? new Communication(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Communication} proxy from a {@link Connector} stereotyped << Communication >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link Communication} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8854d4c2-8c06-4668-94a2-a0521ff57a93")
    public static Communication safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (Communication.canInstantiate(obj))
        	return new Communication(obj);
        else
        	throw new IllegalArgumentException("Communication: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d206fead-d1c8-4e90-9840-cb115f911145")
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
        Communication other = (Communication) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("a311cfd0-649a-4e63-9b2f-406e39820a1e")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    /**
     * Get the value of the 'providedPortConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("69d31552-1dd8-4e3f-8c7f-6526e993aab8")
    public Configuration getProvidedPortConfiguration() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Communication.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE), "providedPortConfiguration")
                  && Configuration.canInstantiate(d.getDependsOn())) {
                     return (Configuration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Configuration.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'requiredPortConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4bc4252d-8f0f-4968-94f6-8e385dc8d50e")
    public Configuration getRequiredPortConfiguration() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Communication.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE), "requiredPortConfiguration")
                  && Configuration.canInstantiate(d.getDependsOn())) {
                     return (Configuration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Configuration.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("c00e6d3a-14ab-4f64-ae39-7b4a0412e4f9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'providedPortConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4740ba9c-5abc-4b59-ba5e-51072c175307")
    public void setProvidedPortConfiguration(final Configuration obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Communication.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE), "providedPortConfiguration")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Communication.MdaTypes.MDAASSOCDEP);
              dep.setName("providedPortConfiguration");      dep.putTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE, "providedPortConfiguration");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'requiredPortConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d76d1be0-4ade-4d1d-bec7-0f3b16b1af20")
    public void setRequiredPortConfiguration(final Configuration obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Communication.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE), "requiredPortConfiguration")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Communication.MdaTypes.MDAASSOCDEP);
              dep.setName("requiredPortConfiguration");      dep.putTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE, "requiredPortConfiguration");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("b1027746-ffa4-4f56-b841-2d8c99627cf0")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("4e2b9d70-de94-4b40-ba99-ae2767be9c03")
    protected Communication(final Connector elt) {
        super(elt);
    }

    @objid ("32a673a4-c270-4514-b3a4-c875b717ae42")
    public static final class MdaTypes {
        @objid ("33c05748-79a7-4797-8775-d6f36870ee04")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("193629f8-89b3-47fb-8121-cf1f70b3a9b4")
        private static Stereotype MDAASSOCDEP;

        @objid ("7e7af5a9-8156-4b64-9324-eeb47db16169")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ce43dba2-19f7-4c3f-991d-2c11b676a9cf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "141875d2-e648-4750-9fff-84c1b21e9b54");
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
