/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << OSRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cfd6a586-d35c-49a8-9f96-d97400dd7a8d")
public class OSRequirement extends HardRequirement {
    @objid ("4ede91c8-c563-44b5-a36d-422caf23b9bd")
    public static final String STEREOTYPE_NAME = "OSRequirement";

    @objid ("11fc471b-1544-42e0-9a35-25dea129de2a")
    public static final String IS64OS_TAGTYPE = "is64os";

    @objid ("9168935e-eae3-450b-81cf-a0d31699627c")
    public static final String OS_TAGTYPE = "os";

    /**
     * Tells whether a {@link OSRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OSRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("62f9f771-2ee4-4ce4-8eb5-fd68c8b657d4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OSRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OSRequirement >> then instantiate a {@link OSRequirement} proxy.
     * 
     * @return a {@link OSRequirement} proxy on the created {@link Class}.
     */
    @objid ("cca262e1-c059-478b-8712-62db036334ca")
    public static OSRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, OSRequirement.STEREOTYPE_NAME);
        return OSRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link OSRequirement} proxy from a {@link Class} stereotyped << OSRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link OSRequirement} proxy or <i>null</i>.
     */
    @objid ("afb0c81d-67b1-429e-aa96-553fbb748ff0")
    public static OSRequirement instantiate(final Class obj) {
        return OSRequirement.canInstantiate(obj) ? new OSRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OSRequirement} proxy from a {@link Class} stereotyped << OSRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link OSRequirement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b89051c6-dd39-493a-8c37-da60e6dc4df5")
    public static OSRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OSRequirement.canInstantiate(obj))
            return new OSRequirement(obj);
        else
            throw new IllegalArgumentException("OSRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4b9ed069-a0b2-4972-a5ea-5a0905cb7e73")
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
        OSRequirement other = (OSRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("4c79548e-d2bf-49ed-89c5-a6c2d665d671")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'is64os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1a5562f3-62d6-412c-8eae-ced2de72e1be")
    public String getIs64os() {
        return this.elt.getTagValue(OSRequirement.MdaTypes.IS64OS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("14bc88a0-acd3-4f3e-b1bc-16112f60b560")
    public String getOs() {
        return this.elt.getTagValue(OSRequirement.MdaTypes.OS_TAGTYPE_ELT);
    }

    @objid ("81a5dfbf-583a-4990-82e2-2c36c186173e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'is64os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0f8f63c7-dbf6-48dd-a4a8-43616386c39d")
    public void setIs64os(final String value) {
        this.elt.putTagValue(OSRequirement.MdaTypes.IS64OS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a3ef4639-3e15-44b1-b98e-8717a2ac97b9")
    public void setOs(final String value) {
        this.elt.putTagValue(OSRequirement.MdaTypes.OS_TAGTYPE_ELT, value);
    }

    @objid ("2e193bb6-46b9-4f94-abf1-ffe1d509fd94")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("337d4d8e-677a-4913-a448-eb7da9da8cde")
    protected OSRequirement(final Class elt) {
        super(elt);
    }

    @objid ("77ca2415-0693-4930-9e87-96b53b1278f7")
    public static final class MdaTypes {
        @objid ("9249d92e-74a0-4a5c-8e2e-ebb8cc231395")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0b5d9b5d-e809-40a1-b37a-64ce6963e858")
        public static TagType OS_TAGTYPE_ELT;

        @objid ("fe6db99f-042e-4e95-a411-a7af5c8682f2")
        public static TagType IS64OS_TAGTYPE_ELT;

        @objid ("63c4efe7-c0ba-473d-8641-6b27a01fb562")
        private static Stereotype MDAASSOCDEP;

        @objid ("a4fd3c10-f45f-49b3-b513-9313005caa8a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c5ffda7-2d2f-48e3-9418-825f38cf90b0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "64f95ec3-043c-4955-bfcb-9aabe91d54fe");
            OS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49d0562e-ffa2-4b4a-868d-9912389113a8");
            IS64OS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1fd5f98d-5994-42d1-8b1f-e0de7d51fb9b");
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
