/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("5233204b-eedd-4e74-9b8d-31fda99e1ba0")
    public static final String STEREOTYPE_NAME = "ActionInstance";

    @objid ("985c8823-c5ae-4773-8eec-e4e4e7d5c4e5")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("b8fb1a1c-876b-4ddd-843b-5352ba2fe622")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("6d21b7bf-885a-4929-924f-f6fc2e2450ef")
    public static final String SUCCESSFUL_TAGTYPE = "successful";

    /**
     * Tells whether a {@link ActionInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ActionInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("014e3a94-9c5e-4a95-a8e9-413506ddc941")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ActionInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ActionInstance >> then instantiate a {@link ActionInstance} proxy.
     * 
     * @return a {@link ActionInstance} proxy on the created {@link Instance}.
     */
    @objid ("465590b8-ce31-4481-afeb-408a1a52ee1e")
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
    @objid ("3fa8d5ae-cae2-487c-b23b-4ed5d4a3f55b")
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
    @objid ("58b8621f-d50f-4cc8-8625-685e14ad8df9")
    public static ActionInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ActionInstance.canInstantiate(obj))
        	return new ActionInstance(obj);
        else
        	throw new IllegalArgumentException("ActionInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5fdc7cf3-b646-4b0f-b6ed-fa134af80cf9")
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
    @objid ("922bc139-abab-4a5a-af39-f84fd8d70383")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("43ab0dba-7764-42ea-9325-c64a9397c1ed")
    public String getEndTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e84f7aab-ae39-4055-afa3-ff7fcb0c17eb")
    public String getStartTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0abc0553-0527-4452-9c9f-9eb6ce245c13")
    public String getSuccessful() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT);
    }

    @objid ("61ab4140-094e-4052-906d-b656ed1c1904")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("30ed1927-9ff3-400b-b26d-1145c2cfb2ce")
    public void setEndTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4522a540-772b-47c6-9c76-4a027d8d47bb")
    public void setStartTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1b54e315-4b3b-478c-a759-2af46f28d201")
    public void setSuccessful(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT, value);
    }

    @objid ("38d1894e-755a-4ba7-bc30-c59e11f8dcd7")
    public Action getAction() {
        return Action.safeInstantiate(getElement().getBase());
    }

    @objid ("962e40b9-4a8c-4a85-9df3-765b8a3c2fec")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("fa97ebdb-f847-44a8-abff-d35d48ba630c")
    public void setAction(final Action value) {
        getElement().setBase(value.getElement());
    }

    @objid ("d6d23af7-da37-4675-ad4e-bbe271dd05eb")
    protected ActionInstance(final Instance elt) {
        super(elt);
    }

    @objid ("e6124144-40b2-4d8e-9200-f628fda5f4f2")
    public static final class MdaTypes {
        @objid ("a18428bc-5239-485e-b8a2-edeac47f8d09")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4825405e-6faf-43f2-9ac4-1fe4d59a5825")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("cb85a454-7471-44bc-8248-f1d1fa4026ea")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("5cec124f-c71f-40d0-8efb-de9b7a24950f")
        public static TagType SUCCESSFUL_TAGTYPE_ELT;

        @objid ("6bd30de3-3395-4f46-b4e1-ca1c2b4dd951")
        private static Stereotype MDAASSOCDEP;

        @objid ("bb54188e-4b74-48c0-95b5-355b5dccb2ad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cceccd78-901e-4fc8-96cc-bfa9c2eb61de")
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
