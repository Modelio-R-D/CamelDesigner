/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << VerticalScalingAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4b6ca116-e08c-4a63-a9f4-e79ab6d83774")
public class VerticalScalingAction extends ScalingAction {
    @objid ("516af28c-5c42-4dd1-aa38-34a0d2006586")
    public static final String STEREOTYPE_NAME = "VerticalScalingAction";

    /**
     * Tells whether a {@link VerticalScalingAction proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VerticalScalingAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ee093839-bd5e-4aff-86f9-1713e24ed75d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VerticalScalingAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VerticalScalingAction >> then instantiate a {@link VerticalScalingAction} proxy.
     * 
     * @return a {@link VerticalScalingAction} proxy on the created {@link Class}.
     */
    @objid ("a67dbbd0-8a58-4f83-b576-e69b8de89ad1")
    public static VerticalScalingAction create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VerticalScalingAction.STEREOTYPE_NAME);
        return VerticalScalingAction.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link VerticalScalingAction} proxy from a {@link Class} stereotyped << VerticalScalingAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link VerticalScalingAction} proxy or <i>null</i>.
     */
    @objid ("a32d9ad3-fb15-42ff-89c9-33c93cd081d9")
    public static VerticalScalingAction instantiate(final Class obj) {
        return VerticalScalingAction.canInstantiate(obj) ? new VerticalScalingAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VerticalScalingAction} proxy from a {@link Class} stereotyped << VerticalScalingAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link VerticalScalingAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6623a49c-8089-41f6-9beb-a40b391c4a89")
    public static VerticalScalingAction safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VerticalScalingAction.canInstantiate(obj))
        	return new VerticalScalingAction(obj);
        else
        	throw new IllegalArgumentException("VerticalScalingAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3cf89d2d-abd3-4fab-8c06-6778034d6a56")
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
        VerticalScalingAction other = (VerticalScalingAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("cf3a511e-70cf-4aa4-8647-282c82e2e052")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("115a0184-51bb-48a2-b6e7-b4c695439170")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("89dffc50-1039-4dc5-8120-2e2b3678034d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("f59174a5-cd7d-41c5-b492-7f3b5abf8501")
    protected VerticalScalingAction(final Class elt) {
        super(elt);
    }

    @objid ("9d977d3c-b012-4964-81d8-a352196858d6")
    public static final class MdaTypes {
        @objid ("72db303e-51df-47f6-9981-3de4fa3afb8f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("521a7319-0118-46d0-8ee9-08be143dd9e6")
        private static Stereotype MDAASSOCDEP;

        @objid ("2a58536d-2b91-4c1e-b1ad-ff00b27f98a8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("143f2624-4c6b-4202-88e4-df88ee5f71b3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "725de5f4-a090-41c9-b326-f573c1d3b15d");
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
