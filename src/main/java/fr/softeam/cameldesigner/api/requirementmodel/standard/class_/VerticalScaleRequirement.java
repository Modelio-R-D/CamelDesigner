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
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.ScaleRequirement;
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
 * Proxy class to handle a {@link Class} with << VerticalScaleRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b293b21a-97ae-47e2-95a3-32cbf8990a9b")
public class VerticalScaleRequirement extends ScaleRequirement {
<<<<<<< HEAD
    @objid ("89f22d0b-6174-4487-a414-4990a89bb15e")
=======
    @objid ("c2d9dcb5-3c2a-42f1-b31d-0f3f3b289f5c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "VerticalScaleRequirement";

    /**
     * Tells whether a {@link VerticalScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VerticalScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("3e06da54-0a04-401c-8bfb-79a2376d0d6a")
=======
    @objid ("655bae2c-1af5-45f5-af38-f484d82fadbf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VerticalScaleRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VerticalScaleRequirement >> then instantiate a {@link VerticalScaleRequirement} proxy.
     * 
     * @return a {@link VerticalScaleRequirement} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("5e31d275-27fb-401d-a466-bc09d8b6154c")
=======
    @objid ("425e0fd1-8a57-47a5-9db5-21a1237591d9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static VerticalScaleRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VerticalScaleRequirement.STEREOTYPE_NAME);
        return VerticalScaleRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link VerticalScaleRequirement} proxy from a {@link Class} stereotyped << VerticalScaleRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link VerticalScaleRequirement} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("44989020-43a8-4880-afdd-5f2b54148e7f")
=======
    @objid ("5ea18250-4e47-4d7b-9c4d-d83827f69e77")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static VerticalScaleRequirement instantiate(final Class obj) {
        return VerticalScaleRequirement.canInstantiate(obj) ? new VerticalScaleRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VerticalScaleRequirement} proxy from a {@link Class} stereotyped << VerticalScaleRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link VerticalScaleRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("20ed7f7d-eb9d-4b9b-bb62-71a995bd4f5e")
=======
    @objid ("fb5c4b5a-98b1-4ae8-b314-be89ce5166d4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static VerticalScaleRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VerticalScaleRequirement.canInstantiate(obj))
        	return new VerticalScaleRequirement(obj);
        else
        	throw new IllegalArgumentException("VerticalScaleRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("8d139648-ce3e-4a2d-95ad-5067a81ca480")
=======
    @objid ("582473f1-bcab-46a6-a39f-9feceed60b34")
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
        VerticalScaleRequirement other = (VerticalScaleRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("bb401d04-282c-4dbf-aefb-99c237145030")
=======
    @objid ("adf4f5ad-22a4-40c1-8fde-c1d76e169eeb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("d9cebfcf-62b6-40b5-b3b1-5385e669cceb")
=======
    @objid ("e3155a0c-0954-45b1-9179-30bcdce4b78c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("dd9eacf5-4749-4841-b5f5-96cb0b941062")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("44ba616d-8902-4d41-b979-caf30f14b22e")
=======
    @objid ("a5336e25-3d1f-4484-82b3-022f8ebf9674")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected VerticalScaleRequirement(final Class elt) {
        super(elt);
    }

    @objid ("b9142a65-96fb-46c9-ae04-0835babb830d")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("eaa03a39-fecc-4309-a042-004a2b2cddec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d9d8a7c0-38a6-4e29-aed3-a469f77f545e")
        private static Stereotype MDAASSOCDEP;

        @objid ("9ce8b8be-b87b-4a77-89b7-a5e15625f221")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3011baca-2ede-4d11-8b39-ff1388d28793")
=======
        @objid ("eb878644-6360-421c-b248-834c2e4c11f5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("450e03cd-9363-48e4-8b72-0b2ee9ddb897")
        private static Stereotype MDAASSOCDEP;

        @objid ("55deebfd-eb18-4326-b1fa-119e04dadeaf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0ce43f90-d1b8-468a-8e07-22f99b647aa5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1090f8fc-a713-4641-89db-bd23c8a82ab1");
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
