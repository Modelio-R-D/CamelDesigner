/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
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
 * Proxy class to handle a {@link Class} with << ExternalIdentifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("facd10dc-f6ab-44d0-b526-c83be089740a")
public class ExternalIdentifier extends FeatureClass {
<<<<<<< HEAD
    @objid ("c2e5de20-9d61-4dd6-a176-0c661f307550")
    public static final String STEREOTYPE_NAME = "ExternalIdentifier";

    @objid ("7a9939cd-5c7b-465d-aefb-85e85b5294a1")
=======
    @objid ("243cf70a-e82e-4b11-b390-a347a0b71afa")
    public static final String STEREOTYPE_NAME = "ExternalIdentifier";

    @objid ("a5e3ac18-3638-461e-a4b1-8d7c200271eb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String IDENTIFIER_TAGTYPE = "identifier";

    /**
     * Tells whether a {@link ExternalIdentifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ExternalIdentifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d0eace9d-0c26-4de4-9b48-83a92d1c3709")
=======
    @objid ("0abc7fc6-69a6-4de7-9f9f-72e6c0354a5d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExternalIdentifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ExternalIdentifier >> then instantiate a {@link ExternalIdentifier} proxy.
     * 
     * @return a {@link ExternalIdentifier} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("e0831bc0-5895-4b41-97fc-a0b40cc4cdcb")
=======
    @objid ("2b133eb8-ea67-4cb1-a2c9-61dab7d30b54")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ExternalIdentifier create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ExternalIdentifier.STEREOTYPE_NAME);
        return ExternalIdentifier.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ExternalIdentifier} proxy from a {@link Class} stereotyped << ExternalIdentifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ExternalIdentifier} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("1631ca45-cd54-4441-828a-f18f9ab3956e")
=======
    @objid ("83570d24-dcb4-4145-96a7-6cc1cdae828e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ExternalIdentifier instantiate(final Class obj) {
        return ExternalIdentifier.canInstantiate(obj) ? new ExternalIdentifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExternalIdentifier} proxy from a {@link Class} stereotyped << ExternalIdentifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ExternalIdentifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("ad947371-78c3-4314-a6b1-6204350cf1f6")
=======
    @objid ("5d7acda9-0d23-45ee-8a7c-c978c51ae113")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ExternalIdentifier safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ExternalIdentifier.canInstantiate(obj))
        	return new ExternalIdentifier(obj);
        else
        	throw new IllegalArgumentException("ExternalIdentifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("6f3ea90f-f859-49a8-833a-4d839ab92f5e")
=======
    @objid ("0a8a16e4-797a-46dd-87a5-4a827844a728")
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
        ExternalIdentifier other = (ExternalIdentifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("150a7368-584f-48de-abef-e903805534e5")
=======
    @objid ("eb917e4e-f15b-4d0a-8534-bd979c606516")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'identifier'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("210ed828-d9b5-4ae3-9119-5d242f1a784b")
=======
    @objid ("4c4563fb-e24c-4807-8319-ef6b57b974e0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getIdentifier() {
        return this.elt.getTagValue(ExternalIdentifier.MdaTypes.IDENTIFIER_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("dd7ba4da-c2f4-49c4-9a5f-2b6ca4ffb272")
=======
    @objid ("da4048fa-10c5-4adb-888d-6c236f8f0292")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'identifier'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("0f8f2e76-2fb4-4763-a1e8-9f4edfd03c5e")
=======
    @objid ("008cd504-d75f-43e1-8eeb-aaf827cf1344")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setIdentifier(final String value) {
        this.elt.putTagValue(ExternalIdentifier.MdaTypes.IDENTIFIER_TAGTYPE_ELT, value);
    }

    @objid ("c294416b-d255-4cbe-a4d8-e075b9226e35")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("629f6e63-747e-4c44-ae0b-55b4fa90258e")
=======
    @objid ("d6680750-7841-4bb6-b763-29d704bafb80")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ExternalIdentifier(final Class elt) {
        super(elt);
    }

    @objid ("c29cec98-a116-4fff-9165-be962105e0ad")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("119470cc-3a05-4395-93f5-cb1629a0a138")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cfc111bc-cb67-4562-a880-f47a7df313b5")
        public static TagType IDENTIFIER_TAGTYPE_ELT;

        @objid ("5cf92d60-ceec-4d25-9388-49c4754d84b7")
        private static Stereotype MDAASSOCDEP;

        @objid ("01e1e4b7-5586-4321-bf9a-c4dea654844c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b60f367e-fafb-4abc-a838-384c3a770cc6")
=======
        @objid ("d5cc3aeb-c769-4274-821d-26b08176bb4e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("543c1451-5eeb-4d79-bd6e-8bd804c9b3ed")
        public static TagType IDENTIFIER_TAGTYPE_ELT;

        @objid ("e6ba4b04-5d90-4da3-a36c-7eb031322101")
        private static Stereotype MDAASSOCDEP;

        @objid ("daff4646-e13b-451a-bea0-9147dd1add35")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("12e53e15-785d-4d98-9d5a-dddc1e8a7d96")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9e9641f0-08c0-4453-a828-314b9d3e7682");
            IDENTIFIER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "79f66d2e-b870-4d06-81b9-8851077fb522");
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
