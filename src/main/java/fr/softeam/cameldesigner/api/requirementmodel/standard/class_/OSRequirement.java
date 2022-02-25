/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("a9911b2c-dff9-4301-b02f-d7cdfed560b8")
    public static final String STEREOTYPE_NAME = "OSRequirement";

    @objid ("933255b2-c53d-4f0b-ad26-7f747fe86730")
    public static final String IS64OS_TAGTYPE = "is64os";

    @objid ("f5c11b27-d132-4277-a885-ab9a4bc81a40")
    public static final String OS_TAGTYPE = "os";

    /**
     * Tells whether a {@link OSRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OSRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("029b7211-71f6-4274-92f4-9ba5fdff485f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OSRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OSRequirement >> then instantiate a {@link OSRequirement} proxy.
     * 
     * @return a {@link OSRequirement} proxy on the created {@link Class}.
     */
    @objid ("11f21562-7d15-41bc-babe-8418648f3f7f")
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
    @objid ("fad028e0-33b7-4c0c-9ea6-a636ab9e469e")
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
    @objid ("f89acba4-d677-4a4a-bb69-f79c38ba95f4")
    public static OSRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OSRequirement.canInstantiate(obj))
        	return new OSRequirement(obj);
        else
        	throw new IllegalArgumentException("OSRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dba69626-bc7b-4569-8237-b757dbb3cb0a")
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
    @objid ("ba2591b8-35c4-4a84-8a1d-0922dcd5ccd0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'is64os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a9d9ab02-e134-4b18-90cd-b72a622d62de")
    public String getIs64os() {
        return this.elt.getTagValue(OSRequirement.MdaTypes.IS64OS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5561dc04-34fc-4102-8a34-c6c65c1fc4c8")
    public String getOs() {
        return this.elt.getTagValue(OSRequirement.MdaTypes.OS_TAGTYPE_ELT);
    }

    @objid ("f13aeb08-a53d-4673-871c-2f64164f9d1e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'is64os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a6e8e7df-f821-4343-815c-87a0e1f20845")
    public void setIs64os(final String value) {
        this.elt.putTagValue(OSRequirement.MdaTypes.IS64OS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0391a916-28c7-4e21-8393-3fd373506b0d")
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

    @objid ("106ae4ca-b2a6-4121-a651-d3c73e93fbcd")
    protected OSRequirement(final Class elt) {
        super(elt);
    }

    @objid ("77ca2415-0693-4930-9e87-96b53b1278f7")
    public static final class MdaTypes {
        @objid ("cf1b7f99-b606-4828-8c9c-7f480491ed76")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c3eb0c5b-8318-40f3-8047-7048cb6a065c")
        public static TagType OS_TAGTYPE_ELT;

        @objid ("332ec62d-f12d-4137-bc54-44843d77c87d")
        public static TagType IS64OS_TAGTYPE_ELT;

        @objid ("dbcba686-5c85-491b-8836-f21b51d884da")
        private static Stereotype MDAASSOCDEP;

        @objid ("fd009219-67a6-4824-b0ab-b78edf8e4ac2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("db3b1c4b-e339-4ae9-a7f8-6d947f27212b")
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
