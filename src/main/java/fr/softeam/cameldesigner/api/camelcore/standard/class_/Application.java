/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("a1432c65-ae10-47cd-9d84-777274160e13")
    public static final String STEREOTYPE_NAME = "Application";

    @objid ("fa6bbcb8-1838-4a5c-8fe9-5561b05a1571")
    public static final String VERSION_TAGTYPE = "version";

    /**
     * Tells whether a {@link Application proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Application >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("104405e1-e4aa-4f30-a3ed-9c4e8e2f84d1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Application.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Application >> then instantiate a {@link Application} proxy.
     * 
     * @return a {@link Application} proxy on the created {@link Class}.
     */
    @objid ("9e22cbbe-addc-4722-950d-03e4cdfe93a3")
    public static Application create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Application.STEREOTYPE_NAME);
        return Application.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Application} proxy from a {@link Class} stereotyped << Application >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link Application} proxy or <i>null</i>.
     */
    @objid ("11e2e3dc-3bad-401c-aed4-6e43acce52ce")
    public static Application instantiate(final Class obj) {
        return Application.canInstantiate(obj) ? new Application(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Application} proxy from a {@link Class} stereotyped << Application >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link Application} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("537c761c-19b1-483d-8453-38697848eadd")
    public static Application safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Application.canInstantiate(obj))
            return new Application(obj);
        else
            throw new IllegalArgumentException("Application: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("de019b1d-c005-4216-ab16-a3e7b9f6d3c1")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("42cd1590-a94e-4dc1-8abb-1e0258fcee45")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5095f056-305e-4a2d-b60f-5de1c053937f")
    public String getVersion() {
        return this.elt.getTagValue(Application.MdaTypes.VERSION_TAGTYPE_ELT);
    }

    @objid ("f2b63462-7a78-48de-9563-37b6f5863e7e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("15e9da95-ac85-4a10-939b-6bdd26a950c6")
    public void setVersion(final String value) {
        this.elt.putTagValue(Application.MdaTypes.VERSION_TAGTYPE_ELT, value);
    }

    @objid ("3f7b2e0b-6275-4d16-ac39-bd23efd5c53a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("75263c3e-4877-418a-b104-eb5cce00ebc1")
    protected Application(final Class elt) {
        super(elt);
    }

    @objid ("492bb2a5-5506-4a52-bc31-f5fb67155b50")
    public static final class MdaTypes {
        @objid ("9fa46aae-1386-4da8-b85c-a1490a6c7b72")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("11be9cfb-6bf6-4a9f-bee7-fa147efa914c")
        public static TagType VERSION_TAGTYPE_ELT;

        @objid ("cc3c6b70-6fef-4623-82a8-b42172d270af")
        private static Stereotype MDAASSOCDEP;

        @objid ("36b89e06-10f8-46ea-ae67-9929671d97ca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4c1ea63e-2c97-49e3-bf93-92a5dda6111b")
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
