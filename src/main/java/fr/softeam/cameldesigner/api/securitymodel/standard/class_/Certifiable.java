/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Certifiable >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5a184b7e-9e85-4c9f-a879-89cb31cbcc76")
public class Certifiable extends SecurityAttribute {
<<<<<<< HEAD
    @objid ("4c3922f6-6a47-4f36-aa59-f5b418427320")
=======
    @objid ("ab9173e5-1d29-4289-8dca-53dcbf5db456")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Certifiable";

    /**
     * Tells whether a {@link Certifiable proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Certifiable >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("aa3ff9b5-12e9-44ef-987e-81bfc34d556c")
=======
    @objid ("9cf6db88-a899-48d3-b8fb-31d44771ace7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Certifiable.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Certifiable >> then instantiate a {@link Certifiable} proxy.
     * 
     * @return a {@link Certifiable} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("8ef4db54-ea38-46ab-93be-f646a0fe3a35")
=======
    @objid ("b6ad7707-b065-4ead-aa39-016f051b5868")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Certifiable create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Certifiable.STEREOTYPE_NAME);
        return Certifiable.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Certifiable} proxy from a {@link Class} stereotyped << Certifiable >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Certifiable} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("df7d72f8-4180-497d-bb26-d358749a2209")
=======
    @objid ("4fb69328-fb5d-479f-bd29-6f8677207016")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Certifiable instantiate(final Class obj) {
        return Certifiable.canInstantiate(obj) ? new Certifiable(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Certifiable} proxy from a {@link Class} stereotyped << Certifiable >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Certifiable} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("570b359a-acc5-4681-aee8-dff6614bf073")
=======
    @objid ("3401a7ca-1b64-445f-b721-03faf47b6751")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Certifiable safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Certifiable.canInstantiate(obj))
        	return new Certifiable(obj);
        else
        	throw new IllegalArgumentException("Certifiable: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("3764a298-1702-4c88-b357-b230318d7721")
=======
    @objid ("3b8cf9b7-cf5c-431c-8a39-4c835fff0eba")
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
        Certifiable other = (Certifiable) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("14055a5f-b8fa-456b-a5e4-de45b8961660")
=======
    @objid ("597b3f2c-26a1-4765-bfce-bb6be4631eb6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("53741542-56f8-47d1-9236-45555ad18c5a")
=======
    @objid ("36a2cc30-ff35-4e16-b651-7ca5d580cd3a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9b31088a-26b0-4575-bd51-87fd613a1c1f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("888a3f0c-dfac-42b3-a62b-d330524e034e")
=======
    @objid ("4f9bd04d-5133-4805-ad72-5a0ce73c50dc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Certifiable(final Class elt) {
        super(elt);
    }

    @objid ("aee63aa1-1b38-46c1-b417-2240fa886307")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("dbe8001f-5dbc-47b2-a7df-f79e371fac0e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ac1d8125-4896-4f7a-a660-2048ec5b2b13")
        private static Stereotype MDAASSOCDEP;

        @objid ("74f4fdf3-a6da-4be1-a427-b238f8ccff90")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e1ef338f-5ef4-405f-9607-0ef1512b7db0")
=======
        @objid ("648be54c-faf2-4c06-9c5b-0a3f5fc6b503")
        private static Stereotype MDAASSOCDEP;

        @objid ("ba3092fc-b3a8-47c4-b3e5-d263b227f3c2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1786d9b4-2b3b-497a-b9ae-7c344f82feda")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a998beab-9a56-4ba9-a647-455ade76363e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2ded821f-dd6d-4a25-82d8-46091a835fa0");
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
