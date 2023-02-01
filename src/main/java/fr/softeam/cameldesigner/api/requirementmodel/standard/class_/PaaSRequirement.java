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
 * Proxy class to handle a {@link Class} with << PaaSRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f5103c3d-e058-41f9-b48b-a3555f8f176c")
public class PaaSRequirement extends HardRequirement {
<<<<<<< HEAD
    @objid ("d3c97268-f825-49a6-95ab-f7554479725b")
=======
    @objid ("5b946a90-0ae3-4f01-9632-4ea57bd0d1b1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "PaaSRequirement";

    /**
     * Tells whether a {@link PaaSRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PaaSRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("696d8963-2f2e-4f42-b92a-69b3d7c14ad1")
=======
    @objid ("0c181c59-758b-4fdd-87d4-5c1a354da001")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PaaSRequirement >> then instantiate a {@link PaaSRequirement} proxy.
     * 
     * @return a {@link PaaSRequirement} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("299f15ab-5431-4b93-999a-8aba1632c52b")
=======
    @objid ("0469ed87-01ce-4228-bc99-e5bece00a8ad")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PaaSRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaSRequirement.STEREOTYPE_NAME);
        return PaaSRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PaaSRequirement} proxy from a {@link Class} stereotyped << PaaSRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link PaaSRequirement} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("e7adc4e7-9d9f-4898-9d51-71f2268a3649")
=======
    @objid ("00b628d0-bfd7-4bd5-887f-c2de8239ffe1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PaaSRequirement instantiate(final Class obj) {
        return PaaSRequirement.canInstantiate(obj) ? new PaaSRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaSRequirement} proxy from a {@link Class} stereotyped << PaaSRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link PaaSRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("12cbe575-8014-4927-af06-7b5111ed36b6")
=======
    @objid ("74de5038-02b9-4f1e-8f04-4fd3c46250d9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PaaSRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PaaSRequirement.canInstantiate(obj))
        	return new PaaSRequirement(obj);
        else
        	throw new IllegalArgumentException("PaaSRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("b6ece7ec-ae6d-443f-996c-20682d9e92aa")
=======
    @objid ("7c35bd7a-6720-4cd6-950d-213ad38543cf")
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
        PaaSRequirement other = (PaaSRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("fbe5d84b-8bdc-47ea-ba31-add6283e1011")
=======
    @objid ("1bab2778-a22b-493f-bc64-f0abe15de852")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("7fae0a67-af62-4e66-8eff-5f193351f4a3")
=======
    @objid ("96267354-bb35-4744-9247-395d99e4df52")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("030e0731-9e44-4472-baad-c615462b1d25")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("e52201f5-62d2-4d28-af87-ad60895d773f")
=======
    @objid ("047502ed-a309-440a-94b0-16a735c7aabc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected PaaSRequirement(final Class elt) {
        super(elt);
    }

    @objid ("f1ab105f-3a9a-4d24-8c32-5dd406174ad0")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("dc122e6a-4542-4172-8a80-be970b3972f0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9f773fad-0e86-49c3-87d3-e8af08f76f2f")
        private static Stereotype MDAASSOCDEP;

        @objid ("bc2b8979-78e8-4e32-8991-5e62b8ca6e2c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f02dae11-6ced-4f5b-a4de-9c394d42911e")
=======
        @objid ("9aa32227-432e-41db-b04e-95a37de161c7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("54508480-b9f8-49af-ab64-2c99b8314881")
        private static Stereotype MDAASSOCDEP;

        @objid ("e0ac27ec-e7fa-4316-93ee-5d9f197868dc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cffb279b-d90c-4dd6-bc7e-efec24adfde1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1b4b9489-ad62-4a1b-be52-900e21e7f441");
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
