/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("b34a1f63-4987-4aa7-a4b8-2f52bc63982a")
    public static final String STEREOTYPE_NAME = "OSRequirement";

    @objid ("142c9374-5707-4726-907a-07b439ac607e")
    public static final String IS64OS_TAGTYPE = "is64os";

    @objid ("c1c9d5d0-c7cd-4572-b373-0d7a2c768e94")
    public static final String OS_TAGTYPE = "os";

    /**
     * Tells whether a {@link OSRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OSRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fe31e251-7351-491d-9cb2-27079ff5e8b4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OSRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OSRequirement >> then instantiate a {@link OSRequirement} proxy.
     * 
     * @return a {@link OSRequirement} proxy on the created {@link Class}.
     */
    @objid ("16e0096b-4144-42ec-9a97-c1b33bc0131d")
    public static OSRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, OSRequirement.STEREOTYPE_NAME);
        return OSRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link OSRequirement} proxy from a {@link Class} stereotyped << OSRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link OSRequirement} proxy or <i>null</i>.
     */
    @objid ("2cfc070b-255a-4645-9c8b-e5981ef2e10c")
    public static OSRequirement instantiate(final Class obj) {
        return OSRequirement.canInstantiate(obj) ? new OSRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OSRequirement} proxy from a {@link Class} stereotyped << OSRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link OSRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("327ef2f1-9ae2-432f-9cb5-264e09f6f0bb")
    public static OSRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OSRequirement.canInstantiate(obj))
        	return new OSRequirement(obj);
        else
        	throw new IllegalArgumentException("OSRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("844ea85a-404a-4ba0-bd94-3ce47e0624f4")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("6e156443-c0f4-457c-a020-38d6201bc62a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1272334a-ec8f-49eb-a75c-78c87903e061")
    public String getOs() {
        return this.elt.getTagValue(OSRequirement.MdaTypes.OS_TAGTYPE_ELT);
    }

    @objid ("bdbdb61b-4890-4b94-a3c7-5718ef7351a5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'is64os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c96418cd-2f0c-45e8-b8de-705918d8915e")
    public boolean isIs64os() {
        return this.elt.isTagged(OSRequirement.MdaTypes.IS64OS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'is64os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3c0a3dc1-c003-4002-ad1d-c439af2b3c39")
    public void setIs64os(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(OSRequirement.MdaTypes.IS64OS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(OSRequirement.MdaTypes.IS64OS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0fe03920-463d-4b4d-a984-ded0be386853")
    public void setOs(final String value) {
        this.elt.putTagValue(OSRequirement.MdaTypes.OS_TAGTYPE_ELT, value);
    }

    @objid ("3a4f1c36-3966-4a33-8e99-e3d9d6d97222")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("3fba361b-50f7-4282-9482-c7b386125602")
    protected OSRequirement(final Class elt) {
        super(elt);
    }

    @objid ("77ca2415-0693-4930-9e87-96b53b1278f7")
    public static final class MdaTypes {
        @objid ("a1418f8e-3d8e-47b1-8e2b-d7259c9ee6dc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c33e1ba1-5d54-4ece-82ef-05d3e26ad915")
        public static TagType OS_TAGTYPE_ELT;

        @objid ("d0bea6fe-71d9-4761-8012-560049d9091c")
        public static TagType IS64OS_TAGTYPE_ELT;

        @objid ("9110487c-58dc-4fb8-93da-fa513b2c2c80")
        private static Stereotype MDAASSOCDEP;

        @objid ("cfb1c61d-2678-4d79-b01d-9837f2aebe0f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("56631cd1-4681-48a6-b214-b597f0415e93")
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
