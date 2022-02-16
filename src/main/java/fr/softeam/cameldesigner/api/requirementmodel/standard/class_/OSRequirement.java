/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("d3ad52a0-1338-4a7f-9dce-3c2d988e69bf")
    public static final String STEREOTYPE_NAME = "OSRequirement";

    @objid ("eb277c34-acac-4418-9c22-cbc81d6dfc5b")
    public static final String IS64OS_TAGTYPE = "is64os";

    @objid ("87781120-a88a-47eb-a675-c71de96df4bb")
    public static final String OS_TAGTYPE = "os";

    /**
     * Tells whether a {@link OSRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OSRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ffb4f19a-bc86-4495-a329-db2719adc121")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OSRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OSRequirement >> then instantiate a {@link OSRequirement} proxy.
     * 
     * @return a {@link OSRequirement} proxy on the created {@link Class}.
     */
    @objid ("b9079c80-8bad-49e4-b04d-638c16634fcb")
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
    @objid ("c79ffdbb-616d-47d7-85da-0adbab9d7b2b")
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
    @objid ("72e587c9-21a9-448e-85cf-0353d3d68175")
    public static OSRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OSRequirement.canInstantiate(obj))
        	return new OSRequirement(obj);
        else
        	throw new IllegalArgumentException("OSRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9b844e36-0d17-4857-9dcb-c78b10e393bd")
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
    @objid ("f8fa3e9a-cb6f-4577-88cb-d334922788c8")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'is64os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2f8ea33d-7e9f-46fd-86cb-a0a3ebfc72af")
    public String getIs64os() {
        return this.elt.getTagValue(OSRequirement.MdaTypes.IS64OS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9af686dd-48a5-4245-ad89-f7e831be7c25")
    public String getOs() {
        return this.elt.getTagValue(OSRequirement.MdaTypes.OS_TAGTYPE_ELT);
    }

    @objid ("379f7f8f-d342-47ef-be83-c4dd60b2c657")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'is64os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("648b452c-5527-4a75-b73c-0d2221b04b5b")
    public void setIs64os(final String value) {
        this.elt.putTagValue(OSRequirement.MdaTypes.IS64OS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7cc51369-4dc4-483b-a472-3ca2a90451b1")
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

    @objid ("f2b6bc2d-08ac-4422-ae3f-2c3f26159978")
    protected OSRequirement(final Class elt) {
        super(elt);
    }

    @objid ("77ca2415-0693-4930-9e87-96b53b1278f7")
    public static final class MdaTypes {
        @objid ("8568a6d9-41bc-4fda-bae5-8abd7e0f3a97")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("45f976bb-7834-4042-a07d-ec758be4d61a")
        public static TagType OS_TAGTYPE_ELT;

        @objid ("ca52692e-a96f-488c-8e09-85a2cf42200a")
        public static TagType IS64OS_TAGTYPE_ELT;

        @objid ("2b1edd2a-607f-45f6-b389-a2b445c00ff2")
        private static Stereotype MDAASSOCDEP;

        @objid ("164d736d-ce7a-4a4e-929b-5e3442ff8a67")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("79300ad3-4477-401e-9cc9-35f9d6d97332")
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
