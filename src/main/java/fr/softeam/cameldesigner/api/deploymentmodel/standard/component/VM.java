/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << VM >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7ab7afe3-013e-4c06-af79-866889291e60")
public class VM extends CamelComponent {
    @objid ("4f57cdf6-1dcd-4fcb-87b5-e4e39cac48c4")
    public static final String STEREOTYPE_NAME = "VM";

    /**
     * Tells whether a {@link VM proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << VM >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("599da6f2-5c88-4fe8-9567-83c8876d06cb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VM.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << VM >> then instantiate a {@link VM} proxy.
     * 
     * @return a {@link VM} proxy on the created {@link Component}.
     */
    @objid ("afe37f2d-509e-4871-8989-0647f596dd8e")
    public static VM create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Component");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VM.STEREOTYPE_NAME);
        return VM.instantiate((Component)e);
    }

    /**
     * Tries to instantiate a {@link VM} proxy from a {@link Component} stereotyped << VM >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Component
     * @return a {@link VM} proxy or <i>null</i>.
     */
    @objid ("4bc410c4-8c50-4252-a5ed-d88561444f7e")
    public static VM instantiate(final Component obj) {
        return VM.canInstantiate(obj) ? new VM(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VM} proxy from a {@link Component} stereotyped << VM >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Component}
     * @return a {@link VM} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("17c22ce0-72ce-4aa5-9d18-cb2a15678d8d")
    public static VM safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (VM.canInstantiate(obj))
        	return new VM(obj);
        else
        	throw new IllegalArgumentException("VM: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("814877cf-67b9-4965-afbf-e1feba7de156")
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
        VM other = (VM) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("39f9d12a-c1b2-4ec3-b237-14c22d3a129a")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    @objid ("82f0d569-be47-4e2c-a50d-ecb74f82be1d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ea65bd8d-d54f-4550-94b4-a0c91a2ea081")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("ac252ad5-8530-43dd-95ca-a6f84b3d9b99")
    protected VM(final Component elt) {
        super(elt);
    }

    @objid ("b498c9c3-0245-4fb1-97a6-fbac3113e3fd")
    public static final class MdaTypes {
        @objid ("a28f0eee-6369-4dd4-be97-d422e5500ecb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("61423de0-7f31-4d2f-a193-f626846f1471")
        private static Stereotype MDAASSOCDEP;

        @objid ("bba8345a-b59a-4dab-8d1a-fae1703fa135")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3e05c901-6848-4e8a-91a3-53df9ca07c12")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8bd1ea8d-6714-4a3b-9da9-c914064d8440");
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
