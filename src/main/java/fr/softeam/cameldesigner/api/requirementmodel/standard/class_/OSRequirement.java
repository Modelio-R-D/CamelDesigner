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
 * Proxy class to handle a {@link Class} with << OSRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cfd6a586-d35c-49a8-9f96-d97400dd7a8d")
public class OSRequirement extends HardRequirement {
<<<<<<< HEAD
    @objid ("64b4c655-50ad-45ad-8831-ac9ad88a4514")
    public static final String STEREOTYPE_NAME = "OSRequirement";

    @objid ("fb96c3ef-fa2c-488a-ade9-d8016c5feb91")
    public static final String IS64OS_TAGTYPE = "is64os";

    @objid ("c37f279f-9170-4e99-95bb-c904f32006c2")
=======
    @objid ("e4ecc466-d160-48da-8cc7-ff19999fe5ee")
    public static final String STEREOTYPE_NAME = "OSRequirement";

    @objid ("c7f7eabb-414b-42fa-8975-50fd1f40f8e9")
    public static final String IS64OS_TAGTYPE = "is64os";

    @objid ("c8e728e0-dd0b-4663-969a-24260dc9ccae")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String OS_TAGTYPE = "os";

    /**
     * Tells whether a {@link OSRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OSRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d4870ff4-500f-4c62-aae5-af4b65b01b52")
=======
    @objid ("f6323231-855a-45ea-8d4e-32b534953ac9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OSRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OSRequirement >> then instantiate a {@link OSRequirement} proxy.
     * 
     * @return a {@link OSRequirement} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("bdc74b53-4bab-46c8-8bad-dc674d331e5a")
=======
    @objid ("0e1a42c1-a02b-459b-824f-03db908ce804")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b1f61475-cc14-43f7-aa76-8105312814c8")
=======
    @objid ("4b542401-a5bf-45d1-84bc-b5d44e75ca17")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("85c7ef9a-a7f4-4876-8d2f-3dcbd6f3c1e7")
=======
    @objid ("67ab1aab-841e-4a21-8106-ee9719f0853a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static OSRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OSRequirement.canInstantiate(obj))
        	return new OSRequirement(obj);
        else
        	throw new IllegalArgumentException("OSRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("67ad0ccc-23b1-4f23-87d0-c01721479e08")
=======
    @objid ("8dabdb16-cdde-4917-a4a0-537bd9eb60a7")
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
        OSRequirement other = (OSRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("a4198854-f97d-445f-9d96-e75aaa41cbf4")
=======
    @objid ("d1883519-111d-4056-acc9-d1d65ee830a4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("b2eab491-9b73-450a-82dd-5f1b41dd24ba")
=======
    @objid ("00351d11-e33a-4813-8cf2-dd0100b27160")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getOs() {
        return this.elt.getTagValue(OSRequirement.MdaTypes.OS_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("29f7afd0-2acd-4de3-b077-2c15089cf862")
=======
    @objid ("fc8b9bcc-350e-4b55-a91a-96f354ae746c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'is64os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("4e122846-1322-4713-9853-023f8188bd27")
=======
    @objid ("a0d9527c-cb38-45e4-853f-7f7da78b5575")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isIs64os() {
        return this.elt.isTagged(OSRequirement.MdaTypes.IS64OS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'is64os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("60d0bf2a-560c-4dc8-b40c-784721af46f3")
=======
    @objid ("ec3c5146-b664-42ee-af6d-ea72e12bfacb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3110fe9a-8b3d-4ce3-8fdd-041cbe78b48c")
=======
    @objid ("ecad436b-34d9-4cad-b19a-56ccfbf1092a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("a3d75c5d-1f7f-45ed-a59e-78160af57022")
=======
    @objid ("1500c730-a31b-4ef8-a5a9-1495df93194a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected OSRequirement(final Class elt) {
        super(elt);
    }

    @objid ("77ca2415-0693-4930-9e87-96b53b1278f7")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("261e5c68-2b91-46c0-b545-fac1d448a1fb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c1b13ac6-b28e-4365-8fc7-87e59b78b4b7")
        public static TagType OS_TAGTYPE_ELT;

        @objid ("c866414b-3303-4e39-9d5e-18525cc5c337")
        public static TagType IS64OS_TAGTYPE_ELT;

        @objid ("a5dde183-20de-454e-8b43-61715c3427ad")
        private static Stereotype MDAASSOCDEP;

        @objid ("329eb2ee-0218-46fb-bad3-d543817ed40b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b24a1912-2430-4d69-89ec-cb62ac54bb62")
=======
        @objid ("1f235c51-6ebd-4135-9abe-5ae6a4dd2eae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("755a8c7a-442c-489c-bc6a-56a70d8d6a8e")
        public static TagType OS_TAGTYPE_ELT;

        @objid ("5c0933a5-dee5-48a5-9383-f2671ac71059")
        public static TagType IS64OS_TAGTYPE_ELT;

        @objid ("a004dad5-87dc-4fd5-968a-fb8f79008373")
        private static Stereotype MDAASSOCDEP;

        @objid ("a3238d34-d2cc-4261-a112-5a97a1fdc2b5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b872610b-c94c-4e1f-85e1-271f75867f88")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
