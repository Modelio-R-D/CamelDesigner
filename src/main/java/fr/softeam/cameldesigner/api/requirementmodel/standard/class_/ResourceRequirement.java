/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
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
 * Proxy class to handle a {@link Class} with << ResourceRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a2fe5307-a14d-44f3-b715-fa81339f2064")
public class ResourceRequirement extends HardRequirement {
<<<<<<< HEAD
    @objid ("d4a4c5d1-9640-4b66-aac9-2c8be09e634a")
=======
    @objid ("4e4f6e88-c41f-4e84-a8e2-14ae9fe6033b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "ResourceRequirement";

    /**
     * Tells whether a {@link ResourceRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ResourceRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("5d828236-f3ee-4cae-b336-706ac72b123b")
=======
    @objid ("0a6b2758-cc40-415b-abc6-e279ef64c30d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ResourceRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ResourceRequirement >> then instantiate a {@link ResourceRequirement} proxy.
     * 
     * @return a {@link ResourceRequirement} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("7bcd15b6-2f58-42c4-a1bc-b3f131c00ee0")
=======
    @objid ("22809068-a878-47ae-b96b-43435bf94c54")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ResourceRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ResourceRequirement.STEREOTYPE_NAME);
        return ResourceRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ResourceRequirement} proxy from a {@link Class} stereotyped << ResourceRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ResourceRequirement} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("d3f2ae6b-aa26-4b6a-939d-34604e91929c")
=======
    @objid ("c6569516-7bfc-41fc-844a-eb2f4b031dcd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ResourceRequirement instantiate(final Class obj) {
        return ResourceRequirement.canInstantiate(obj) ? new ResourceRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceRequirement} proxy from a {@link Class} stereotyped << ResourceRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ResourceRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("c4077497-e1a2-4d3c-9e3b-51ffc8e3e65e")
=======
    @objid ("45fb7c15-d761-493a-a5a8-fe492cbe233b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ResourceRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ResourceRequirement.canInstantiate(obj))
        	return new ResourceRequirement(obj);
        else
        	throw new IllegalArgumentException("ResourceRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("6175345c-deab-4f8f-aa0b-f0adf33db59c")
=======
    @objid ("81981655-a757-4f36-b27d-e1e20b02ee2a")
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
        ResourceRequirement other = (ResourceRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("94dddec3-1d7f-496c-a756-a98a7e3d5f0a")
=======
    @objid ("c444f6bc-f3ac-47a6-a0e3-41ed81195fec")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("62eb62aa-67de-421b-997d-af17536c3e10")
=======
    @objid ("2ab5f7db-4081-4f01-bb02-a2195fd66874")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a38759c2-2c60-427c-9c58-7cb7f087b663")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("4fa7ef14-7852-481c-90cb-3bbd0f0748f1")
=======
    @objid ("d17bc966-559e-4d02-b5d5-c7d11587b1f2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ResourceRequirement(final Class elt) {
        super(elt);
    }

    @objid ("c4f4ed2f-02b0-404f-90a5-c2cd9dcca0a9")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("4a18c555-17c5-4581-8d09-9b25928a1400")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0bc73c9c-77b1-4340-9ad4-1ce360616934")
        private static Stereotype MDAASSOCDEP;

        @objid ("208c55f7-7e0e-44e1-a2a6-e8fd5926521c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c3f5af2e-6d52-4505-a243-4ee91ccdd605")
=======
        @objid ("b7eacec0-176c-4496-99a0-7344b3e33f9f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("166e7d6f-8df3-434f-bd50-b026b714361d")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb3363f7-d110-4cbf-9487-cde6d01f9b4e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ee0b8018-27ce-483b-8a59-db6b5e4a4f6e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4e76597a-e007-4596-abfe-591ce920815d");
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
