/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.camelcore.standard.class_;

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
 * Proxy class to handle a {@link Class} with << Application >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("97e6f375-0f57-43fd-9ece-52aadc88d164")
public class Application extends FeatureClass {
<<<<<<< HEAD
    @objid ("265343c0-e953-4824-a3d1-253387980818")
    public static final String STEREOTYPE_NAME = "Application";

    @objid ("c5496c9c-ee07-480e-b57d-99ba71095e20")
=======
    @objid ("1e865ee5-7527-4c42-9466-80490f9694c0")
    public static final String STEREOTYPE_NAME = "Application";

    @objid ("dabafb20-ee2c-4d78-9cb2-41ec7b297ec1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String VERSION_TAGTYPE = "version";

    /**
     * Tells whether a {@link Application proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Application >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("46de42d7-4fd1-4a2f-9a0e-b1256f999292")
=======
    @objid ("3b991656-a5af-4e5f-a22c-79056f298906")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Application.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Application >> then instantiate a {@link Application} proxy.
     * 
     * @return a {@link Application} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("a13c444a-22c4-404a-9012-53e52860cb01")
=======
    @objid ("5d2982b1-d74f-4c69-bb8a-303072e81420")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Application create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Application.STEREOTYPE_NAME);
        return Application.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Application} proxy from a {@link Class} stereotyped << Application >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Application} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("1d78ba11-d6cc-4b71-a716-15f1a3ecba3b")
=======
    @objid ("162ee345-b6b4-4e6f-b5ed-7f2421536dd9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Application instantiate(final Class obj) {
        return Application.canInstantiate(obj) ? new Application(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Application} proxy from a {@link Class} stereotyped << Application >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Application} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("0436d267-2d9c-4092-8a46-57d44e5451a7")
=======
    @objid ("5c5761f0-54b8-443d-8920-5e7485c9f16c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Application safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Application.canInstantiate(obj))
        	return new Application(obj);
        else
        	throw new IllegalArgumentException("Application: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("0e17b5d4-6ee2-4649-9635-781d2b833737")
=======
    @objid ("5671c14e-ae0b-4aee-ad0b-4e91cfa4abd5")
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
        Application other = (Application) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("7052b9fc-77db-44b1-897e-57e9f592f33d")
=======
    @objid ("6ece769b-d5cf-439a-aad7-c6539134f151")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("1a1faca0-b669-4ada-9fbe-6fa373fba85b")
=======
    @objid ("93e3dc08-51c6-4b02-b841-46a5013a11fa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getVersion() {
        return this.elt.getTagValue(Application.MdaTypes.VERSION_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("eb629452-bd33-469f-b603-06932614cb3f")
=======
    @objid ("c0715bb2-e780-45e5-8f8a-6a5cced83f33")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("32622a0c-b5f0-472f-b488-5019fedb4577")
=======
    @objid ("1ccd9992-27c1-4884-881a-3ebb28cb09b7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setVersion(final String value) {
        this.elt.putTagValue(Application.MdaTypes.VERSION_TAGTYPE_ELT, value);
    }

    @objid ("3f7b2e0b-6275-4d16-ac39-bd23efd5c53a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("70f45a41-3608-47bc-b3e8-9d9a1ba11d41")
=======
    @objid ("5fa966a4-a018-4e08-adbc-0cbff9b89921")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Application(final Class elt) {
        super(elt);
    }

    @objid ("492bb2a5-5506-4a52-bc31-f5fb67155b50")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("6f65ea1a-3350-4acd-b63a-4bee722c23d3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("027dbc76-937d-4e76-84b3-483b54210642")
        public static TagType VERSION_TAGTYPE_ELT;

        @objid ("b895e2f2-0706-4010-b482-d2f0321dcd6b")
        private static Stereotype MDAASSOCDEP;

        @objid ("9f942d5f-295e-43bb-a38b-0449b85241a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("056a3e23-df03-4342-ae49-a4f89563fb3d")
=======
        @objid ("0bf8bfe1-8666-4574-9448-6877f68a4f53")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ac34bdb2-1896-4b16-bbea-8fa33fdfe3cd")
        public static TagType VERSION_TAGTYPE_ELT;

        @objid ("1cbea5da-3f2d-41c5-963a-23f8de6c581e")
        private static Stereotype MDAASSOCDEP;

        @objid ("42afdfe9-cb6b-461c-ad73-28ce2264c380")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("13ee5c2a-61bf-4bc0-a607-b5b18302f0fe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "46979e9e-2d44-4099-afdf-62d13a0b1d25");
            VERSION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a33973d1-0249-418d-b3fd-1ccbbe910d72");
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
