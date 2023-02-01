/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ac7fff31-391e-4db6-82f2-4dadd9183b9d")
=======
    @objid ("9dbd933d-827a-4cb0-9643-ec0356155343")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "VerticalScalingAction";

    /**
     * Tells whether a {@link VerticalScalingAction proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VerticalScalingAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("062d59f2-d3d7-450c-bd47-36e79a313100")
=======
    @objid ("2e868663-531a-44a8-9520-6ad8a826e493")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VerticalScalingAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VerticalScalingAction >> then instantiate a {@link VerticalScalingAction} proxy.
     * 
     * @return a {@link VerticalScalingAction} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("94998cb9-b3d2-4783-b75d-ad4601cc726f")
=======
    @objid ("fb1146a8-2577-4b76-b0b1-95719ac58562")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a140ae70-ce70-48e9-bbe5-74bcb9c0f01c")
=======
    @objid ("eb8025f6-d519-4825-bd21-7e12b3fca7f7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7cca0f87-fbc3-4c03-9db1-3715046eec9b")
=======
    @objid ("dd87c78d-f2a1-41ea-b313-b4119cf2b594")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static VerticalScalingAction safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VerticalScalingAction.canInstantiate(obj))
        	return new VerticalScalingAction(obj);
        else
        	throw new IllegalArgumentException("VerticalScalingAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("3a6547f3-1c56-4162-a365-36924d13c654")
=======
    @objid ("f1224e00-c951-45d2-b66e-6e27de4c5643")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6aa0ce53-952e-4f62-9fe1-7a2f4c4fba46")
=======
    @objid ("ad31a1a8-e30b-44d4-b61b-3580b109cee8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("bfccf3e6-2783-4e30-9d64-9d868244ed30")
=======
    @objid ("567509e0-2bbc-4ffa-898d-afa14e26027c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("b911a401-ba5e-46a7-b0d3-7563a3da4946")
=======
    @objid ("60680b5f-cabc-4f5f-9c4d-f60f57501a19")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected VerticalScalingAction(final Class elt) {
        super(elt);
    }

    @objid ("9d977d3c-b012-4964-81d8-a352196858d6")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("e1fbabbc-4552-4a4b-aa06-2e7bfe327bb9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c933aa8f-5b7b-4ce1-b6f9-c8830456e129")
        private static Stereotype MDAASSOCDEP;

        @objid ("9acb3fad-0b9f-48e0-8671-71f1bc0db859")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e4f5f523-3806-476f-9161-366bfefa7437")
=======
        @objid ("dddd68e7-5834-4f25-b412-bf4aeffa84ba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d576f85-2075-4565-8f6a-15a2169d22d4")
        private static Stereotype MDAASSOCDEP;

        @objid ("62d9e872-6575-4450-b66f-394f3d75eebd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4b1cee2a-5994-42d6-967b-db91b18da37a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
