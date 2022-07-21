/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("e59743c3-fdc3-4d41-95b8-adced2837cb5")
    public static final String STEREOTYPE_NAME = "VM";

    /**
     * Tells whether a {@link VM proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << VM >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("63e3e633-2d44-4744-827d-dd4a15b32ca9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VM.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << VM >> then instantiate a {@link VM} proxy.
     * 
     * @return a {@link VM} proxy on the created {@link Component}.
     */
    @objid ("8e977c9c-9de4-405a-ad9e-5a4338fefa18")
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
    @objid ("807ea57d-ae30-4e56-acc6-78ad9a4fc9c7")
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
    @objid ("2981cdd0-7ed7-49cb-a134-2e8bb420fa4d")
    public static VM safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (VM.canInstantiate(obj))
        	return new VM(obj);
        else
        	throw new IllegalArgumentException("VM: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("19d685ea-7beb-4f80-9f5c-f3318b5a97d3")
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
    @objid ("cf561619-12b2-4eda-a16e-9d8114def9bf")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    @objid ("a87fa3a9-0741-4e91-b734-7458881be074")
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

    @objid ("91fb6e5c-f777-4d07-a946-caee15e23fef")
    protected VM(final Component elt) {
        super(elt);
    }

    @objid ("b498c9c3-0245-4fb1-97a6-fbac3113e3fd")
    public static final class MdaTypes {
        @objid ("88ad9f1f-dffb-459c-927b-48b23b8eeb4d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b4d86f56-d375-4ff2-abd6-54b56f7d03b2")
        private static Stereotype MDAASSOCDEP;

        @objid ("d06ac185-4bb0-4bbf-a220-0c3189ed0e9e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("435463a3-81af-4295-94b8-343b1ff19fe6")
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
