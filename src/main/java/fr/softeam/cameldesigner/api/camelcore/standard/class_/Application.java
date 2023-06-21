/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("7c213169-5779-43d3-86d4-781a89cb9394")
    public static final String STEREOTYPE_NAME = "Application";

    @objid ("a4efdbe4-60c5-453a-874e-083efa8464d9")
    public static final String VERSION_TAGTYPE = "version";

    /**
     * Tells whether a {@link Application proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Application >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d84cfbbc-fa57-416a-96ab-0fe2a042c507")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Application.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Application >> then instantiate a {@link Application} proxy.
     * 
     * @return a {@link Application} proxy on the created {@link Class}.
     */
    @objid ("ff3b110d-f8e6-4d77-9cdc-0e4e4eb3d6d1")
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
    @objid ("09f5b853-b03d-4ac5-a60b-e9c6b1631d7d")
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
    @objid ("397d7dc2-1f00-4488-b60d-ccdd1a3c32ea")
    public static Application safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Application.canInstantiate(obj))
        	return new Application(obj);
        else
        	throw new IllegalArgumentException("Application: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("806754d2-37cf-4c98-98e1-4ce2efef0468")
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
    @objid ("98a443ac-6eb5-4d03-bbdf-4124b7ba25a2")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("956e7728-786e-49d6-946f-afb314acc2ae")
    public String getVersion() {
        return this.elt.getTagValue(Application.MdaTypes.VERSION_TAGTYPE_ELT);
    }

    @objid ("22817a5f-f94d-4400-8acd-eb1b7bc62f41")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("12d44529-e6ae-47ff-9dc4-52cb1d15858c")
    public void setVersion(final String value) {
        this.elt.putTagValue(Application.MdaTypes.VERSION_TAGTYPE_ELT, value);
    }

    @objid ("3f7b2e0b-6275-4d16-ac39-bd23efd5c53a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("ff268861-0f72-4774-bee6-93ea1b0542fe")
    protected Application(final Class elt) {
        super(elt);
    }

    @objid ("492bb2a5-5506-4a52-bc31-f5fb67155b50")
    public static final class MdaTypes {
        @objid ("0c3f8e9d-4ab1-4053-96b9-fabd8c6ccc00")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b736b090-4c10-4779-b298-fe898f3efa8e")
        public static TagType VERSION_TAGTYPE_ELT;

        @objid ("20889be7-1bf9-4ae3-bc07-663badb1a776")
        private static Stereotype MDAASSOCDEP;

        @objid ("32dd9616-94fa-4f5c-b0cd-db466664d513")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dead4905-edf1-4621-88ed-25e4b288f18c")
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
