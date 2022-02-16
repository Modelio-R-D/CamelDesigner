/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("ca107e56-e818-44d4-84e5-c562b41d2f7d")
    public static final String STEREOTYPE_NAME = "VerticalScalingAction";

    /**
     * Tells whether a {@link VerticalScalingAction proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VerticalScalingAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f1b9a340-9f79-4811-92e2-fd374df1e63a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VerticalScalingAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VerticalScalingAction >> then instantiate a {@link VerticalScalingAction} proxy.
     * 
     * @return a {@link VerticalScalingAction} proxy on the created {@link Class}.
     */
    @objid ("6b7202c9-f7c7-44b9-b651-f3f66c77abb4")
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
    @objid ("768e88b4-9105-42f7-aad7-40cf9754627b")
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
    @objid ("5d0c587f-7638-460b-8495-33d13dd5e9e8")
    public static VerticalScalingAction safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VerticalScalingAction.canInstantiate(obj))
        	return new VerticalScalingAction(obj);
        else
        	throw new IllegalArgumentException("VerticalScalingAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3b053c0b-76e1-46b8-8795-625f88d28dac")
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
    @objid ("3226c141-3b0e-4111-9f10-f853aaa472a0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("50dd91d7-a5bb-43a3-997a-7ae33c1bef8e")
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

    @objid ("1d039c4b-b5db-48e4-be2f-cf4240cfa42b")
    protected VerticalScalingAction(final Class elt) {
        super(elt);
    }

    @objid ("9d977d3c-b012-4964-81d8-a352196858d6")
    public static final class MdaTypes {
        @objid ("823dde6d-3af3-4b57-ae61-10fb4d07961f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e2405f6-8cba-4223-a49e-4d58feae81af")
        private static Stereotype MDAASSOCDEP;

        @objid ("09b7421b-9d28-474e-8f42-63926870aee3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("615c984d-d8fd-4088-acbf-061c54cd25ae")
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
