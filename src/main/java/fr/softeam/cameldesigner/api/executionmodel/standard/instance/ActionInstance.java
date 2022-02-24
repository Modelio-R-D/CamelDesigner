/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("1c60018e-5911-468e-b980-8cb654797ba5")
    public static final String STEREOTYPE_NAME = "ActionInstance";

    @objid ("9789ca63-40cc-44a9-8d43-280dbc439dba")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("4982cab0-7f32-4d0c-b557-1f5fc53da02e")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("3afcd9db-3ef0-487a-b3a2-e8a6bcb84ec9")
    public static final String SUCCESSFUL_TAGTYPE = "successful";

    /**
     * Tells whether a {@link ActionInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ActionInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ab2ea45b-4bf3-4a34-ba45-d74b4d0cf8b7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ActionInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ActionInstance >> then instantiate a {@link ActionInstance} proxy.
     * 
     * @return a {@link ActionInstance} proxy on the created {@link Instance}.
     */
    @objid ("f7cd164e-9dc0-4ac8-93d9-4f8b80cb781b")
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
    @objid ("ceeb64a2-2846-4097-a612-91b07b7aa48c")
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
    @objid ("cf7a7fb5-5173-48ec-8c42-39a9058db041")
    public static ActionInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ActionInstance.canInstantiate(obj))
        	return new ActionInstance(obj);
        else
        	throw new IllegalArgumentException("ActionInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0a842a47-5d76-48b5-b0ad-a129956a5157")
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
    @objid ("4a2d7649-c88c-41b4-bac4-bcf17b6f656a")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5fbf39a9-0cb8-40cb-b1b1-80c0869bd239")
    public String getEndTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2a28a395-a114-492a-9b28-fe284b860bb3")
    public String getStartTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    @objid ("40056790-3eb0-438a-a641-7989a99dfd39")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("56f209cc-5ec0-4042-bcf1-5d31a35653ee")
    public boolean isSuccessful() {
        return this.elt.isTagged(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("09cb4117-5e6c-4539-aa4d-788265a01c93")
    public void setEndTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("75d05e52-0a20-4aa3-bea2-c611caa4195e")
    public void setStartTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("16831162-19c4-4d54-8a4a-780dc2080d41")
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

    @objid ("d4986906-7a83-4cc8-9ed2-9d6f56e64523")
    protected ActionInstance(final Instance elt) {
        super(elt);
    }

    @objid ("e6124144-40b2-4d8e-9200-f628fda5f4f2")
    public static final class MdaTypes {
        @objid ("1e8785a4-edd1-4894-8411-b5a3ace75e67")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("27c0cdca-ffcd-455e-8ebb-0eeebe3b6681")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("19dc8268-fdc2-4ae0-8d2f-71ce02dbbf44")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("2dab21be-d018-4c00-a98a-c9f9ad0a95a6")
        public static TagType SUCCESSFUL_TAGTYPE_ELT;

        @objid ("c72817f0-4fff-4efb-921f-8afef11e7da0")
        private static Stereotype MDAASSOCDEP;

        @objid ("b675c50d-a320-4f03-8f21-b714b50313e2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e62be0d2-4aee-4834-884f-763f235b99f8")
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
