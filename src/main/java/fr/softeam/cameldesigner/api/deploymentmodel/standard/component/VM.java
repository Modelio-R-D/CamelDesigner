/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("da7b5058-073c-47fd-97f7-c2e7299116e6")
    public static final String STEREOTYPE_NAME = "VM";

    /**
     * Tells whether a {@link VM proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << VM >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7a1c23c0-be36-48d2-b31b-baed985ecf3c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VM.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << VM >> then instantiate a {@link VM} proxy.
     * 
     * @return a {@link VM} proxy on the created {@link Component}.
     */
    @objid ("5acb9fbc-c2b7-4af8-a348-6fac7cc71bbc")
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
    @objid ("ca7bbd68-bc2a-4213-ab2e-d42ed93efe1e")
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
    @objid ("f679606c-0502-4d37-baee-f1dcb7518abc")
    public static VM safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (VM.canInstantiate(obj))
        	return new VM(obj);
        else
        	throw new IllegalArgumentException("VM: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d715af68-3ef2-43b3-9d0a-309f47df4779")
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
    @objid ("31007011-65aa-43ee-b254-9f074e576e72")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    @objid ("1a6a8c27-0692-473a-a5e0-9f914d39de29")
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

    @objid ("a86262e2-d7d8-4124-9e85-370b9138ee09")
    protected VM(final Component elt) {
        super(elt);
    }

    @objid ("b498c9c3-0245-4fb1-97a6-fbac3113e3fd")
    public static final class MdaTypes {
        @objid ("573cb30b-5184-44bd-b2d3-5a906caf7c15")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("51afc27d-ebe3-4fc5-9315-829cf32ff4cd")
        private static Stereotype MDAASSOCDEP;

        @objid ("c7ad13d2-ec35-4691-9572-f006534365cc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fabc20d1-8fd4-4361-b7a5-487d9b47b63a")
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
