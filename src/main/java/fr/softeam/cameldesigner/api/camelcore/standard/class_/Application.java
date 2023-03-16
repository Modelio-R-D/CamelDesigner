/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("7d56b12b-04e7-4d86-983b-8d90ef8cc1d0")
    public static final String STEREOTYPE_NAME = "Application";

    @objid ("6ec78854-8941-4ad5-a48a-072c1dce0baa")
    public static final String VERSION_TAGTYPE = "version";

    /**
     * Tells whether a {@link Application proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Application >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7b5e03d6-01ae-4339-a7e6-d5404e0c1a52")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Application.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Application >> then instantiate a {@link Application} proxy.
     * 
     * @return a {@link Application} proxy on the created {@link Class}.
     */
    @objid ("82c9e1b8-2a9a-45a1-ad58-a75b25bc830c")
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
    @objid ("2e85ee59-6498-4e96-b7e5-bc2301c03a2b")
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
    @objid ("1e6d201e-9917-4776-8faf-daf7fc7ff13b")
    public static Application safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Application.canInstantiate(obj))
        	return new Application(obj);
        else
        	throw new IllegalArgumentException("Application: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("60d960f2-e05a-481c-899a-ecb5758a7305")
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
    @objid ("edf0393b-6a78-41a3-b099-9cae32746da7")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("67e8bba7-71ac-45f0-94f1-267b4b3fb312")
    public String getVersion() {
        return this.elt.getTagValue(Application.MdaTypes.VERSION_TAGTYPE_ELT);
    }

    @objid ("36abe92d-a3b5-4d12-86e0-d5545dc266ac")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("44ac946b-a7e9-4fa7-81f1-4e332f5db558")
    public void setVersion(final String value) {
        this.elt.putTagValue(Application.MdaTypes.VERSION_TAGTYPE_ELT, value);
    }

    @objid ("3f7b2e0b-6275-4d16-ac39-bd23efd5c53a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("b67c6a31-270e-4e9c-822d-d7b99be79724")
    protected Application(final Class elt) {
        super(elt);
    }

    @objid ("492bb2a5-5506-4a52-bc31-f5fb67155b50")
    public static final class MdaTypes {
        @objid ("6b744a31-519a-4bb4-b5ca-9c60ed7c2b93")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0f2b927e-cb84-4b3d-b702-f865e6723ba0")
        public static TagType VERSION_TAGTYPE_ELT;

        @objid ("9f9a30ef-d950-479d-8f89-55bdbde5b1a8")
        private static Stereotype MDAASSOCDEP;

        @objid ("2a612e9e-08e8-4c20-8317-a473ddbe99d6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f58295b0-ec37-4faa-b0ee-3ff1f34fdf63")
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
