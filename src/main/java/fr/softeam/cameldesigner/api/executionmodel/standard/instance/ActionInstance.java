/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << ActionInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a76b8220-83aa-410e-a6dc-9369e64f59e2")
public class ActionInstance extends FeatureInstance {
<<<<<<< HEAD
    @objid ("de901a7d-12e5-4f3f-9290-f902a85e8463")
    public static final String STEREOTYPE_NAME = "ActionInstance";

    @objid ("819a1e43-836a-4fb7-9aaa-dd9c7ddaa30a")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("292c2f70-9b81-419c-abae-b44ac8ba37a8")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("507356ba-be3b-4f39-9b5c-cd20cca56e0b")
=======
    @objid ("a890852d-0311-48a0-a722-ccb4e4e733ae")
    public static final String STEREOTYPE_NAME = "ActionInstance";

    @objid ("394e6a42-5c53-49a5-98f4-544822ca2c37")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("bcdcacd3-289e-4691-b250-3befde7bb255")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("e3f75859-9a0e-4522-aa89-c72ce66c2c64")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String SUCCESSFUL_TAGTYPE = "successful";

    /**
     * Tells whether a {@link ActionInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ActionInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("be7751b2-2c9e-4842-bed3-40684d3b9c11")
=======
    @objid ("d1ab5031-547d-4056-bf12-4fb50cd850a9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ActionInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ActionInstance >> then instantiate a {@link ActionInstance} proxy.
     * 
     * @return a {@link ActionInstance} proxy on the created {@link Instance}.
     */
<<<<<<< HEAD
    @objid ("7c38324d-eb9b-4b67-89d7-9509b4f21076")
=======
    @objid ("f6d41a97-a3a6-41cb-8d58-1a2f10d77c04")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ActionInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ActionInstance.STEREOTYPE_NAME);
        return ActionInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ActionInstance} proxy from a {@link Instance} stereotyped << ActionInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ActionInstance} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("99e9423a-808f-4037-8a48-3e874c6d7f39")
=======
    @objid ("cea80aac-cd28-49a7-8571-aa3eee8f08b8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ActionInstance instantiate(final Instance obj) {
        return ActionInstance.canInstantiate(obj) ? new ActionInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ActionInstance} proxy from a {@link Instance} stereotyped << ActionInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link ActionInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("e5b49722-c48c-4c4d-b3fb-b16d2853ec1b")
=======
    @objid ("a19427ba-b427-4ca6-b46a-2d644c3254e9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ActionInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ActionInstance.canInstantiate(obj))
        	return new ActionInstance(obj);
        else
        	throw new IllegalArgumentException("ActionInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("61188132-556b-4784-a01b-8b24374fbdbe")
=======
    @objid ("ca1649a0-f845-4c64-9d31-2a0599d207e1")
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
        ActionInstance other = (ActionInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("938e847e-b42d-4acd-88f7-ee75ba0b74ed")
=======
    @objid ("535634c1-d007-4190-b13b-c7f6c964bc26")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("f89747f6-964d-4171-b127-ef8925cceb8f")
=======
    @objid ("bac25c58-051f-4467-88c5-4edf7d30d003")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getEndTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("71fc3a56-1fa7-4cb5-acac-58a8b77de3a7")
=======
    @objid ("688826fa-5c42-48b1-9b8f-ffa9f302fc87")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getStartTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("4ef420ed-d590-4d61-8372-940e5aa64a29")
=======
    @objid ("1bc7c1cd-273d-4cd0-9f1f-cb624660cc51")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("f51a584b-ec37-46e1-9a63-e4b8450cf5fd")
=======
    @objid ("b5993b19-f128-4072-8119-79d5c542f061")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isSuccessful() {
        return this.elt.isTagged(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("82604603-7ac8-4e2e-aa8e-dbbf7b85d8a8")
=======
    @objid ("f9f1b899-a56f-4171-bb48-a63ba7efaded")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setEndTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("a9791ffd-cb20-4f56-8ad7-e90139be5871")
=======
    @objid ("01ceb012-d85c-4349-b016-c94993ec7f43")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setStartTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("6022de94-5073-4890-bb4c-23be8646363b")
=======
    @objid ("499e75df-44d6-4cc1-97fd-5c8ff10c6384")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setSuccessful(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT);
    }

    @objid ("38d1894e-755a-4ba7-bc30-c59e11f8dcd7")
    public Action getAction() {
        return Action.safeInstantiate(getElement().getBase());
    }

    @objid ("e2d7b9ff-c84b-41d8-8a5c-75d2a01e74b4")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("fa97ebdb-f847-44a8-abff-d35d48ba630c")
    public void setAction(final Action value) {
        getElement().setBase(value.getElement());
    }

<<<<<<< HEAD
    @objid ("1f8b1c8c-a37a-4d0e-9b35-3a704aa1ec71")
=======
    @objid ("15261517-5d67-4b0c-ae37-40c15b870dc7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ActionInstance(final Instance elt) {
        super(elt);
    }

    @objid ("e6124144-40b2-4d8e-9200-f628fda5f4f2")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("ea0af20f-f6c9-437d-a69f-4a879028b5d8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7d0540dd-cf59-42ea-9d6b-c5339ae5a8f1")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("96e7a17a-1bdf-41ff-b895-8aeae3c27167")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("8ff3c6fd-e1f5-45ae-8717-68db3a14e7a0")
        public static TagType SUCCESSFUL_TAGTYPE_ELT;

        @objid ("66b53f5e-2747-4ec5-aa71-2335328f300d")
        private static Stereotype MDAASSOCDEP;

        @objid ("e6322e2b-4b9a-4ea8-a3c3-87d9000a42cc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d90b24be-df33-4e5c-b4f7-ae0611a966a6")
=======
        @objid ("a8cc901b-6e8c-48fb-b768-f5482aeb4e98")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("092980f0-0d07-43fe-ba96-3d26fed4fa8f")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("d531cdaa-a5e9-4fad-a8bf-fa971bbccff9")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("d2aae039-dde6-4aa9-98e3-14375c02c672")
        public static TagType SUCCESSFUL_TAGTYPE_ELT;

        @objid ("95fccdc7-56fa-41c0-b725-878e5c60e8c9")
        private static Stereotype MDAASSOCDEP;

        @objid ("42d8c7a0-1a76-4ddc-bad3-daf326c2f242")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("42258002-9105-4c28-adc1-ff8d45423e5f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe6343f1-1474-4d9e-a80f-e88b019c9e46");
            STARTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b0fbf0b8-55e7-49bd-8638-48285c121023");
            ENDTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b0d29654-1e13-4705-af26-e7bcf590850e");
            SUCCESSFUL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "652d15c6-5261-493e-a968-b981d7bee54a");
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
