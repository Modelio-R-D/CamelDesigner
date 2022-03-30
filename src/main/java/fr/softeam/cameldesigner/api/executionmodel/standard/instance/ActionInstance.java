/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("6afcca07-db18-47b7-8b67-f85d8f653f3c")
    public static final String STEREOTYPE_NAME = "ActionInstance";

    @objid ("d4d48904-65d0-4a2f-861f-7bfe5e1616f8")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("d15f2287-4930-48e9-82df-7a772adf5f83")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("3ba11925-b0aa-48c3-b2de-e6165b5a9e4d")
    public static final String SUCCESSFUL_TAGTYPE = "successful";

    /**
     * Tells whether a {@link ActionInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ActionInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("08e0a330-1ba1-4a47-b43c-669213558d1a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ActionInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ActionInstance >> then instantiate a {@link ActionInstance} proxy.
     * 
     * @return a {@link ActionInstance} proxy on the created {@link Instance}.
     */
    @objid ("58a004b4-1e1e-4db7-81bc-f1cf2642662c")
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
    @objid ("57c25e65-9eb0-46a3-93db-6aeab4314131")
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
    @objid ("63a3ab4a-d270-4f36-b42a-902300f177b7")
    public static ActionInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ActionInstance.canInstantiate(obj))
        	return new ActionInstance(obj);
        else
        	throw new IllegalArgumentException("ActionInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2c6d786a-a8b5-410f-a738-13d2a1dbbbea")
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
    @objid ("41769632-08e1-4a65-9e08-e182b8a9cdf9")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("836828cf-6d24-4ad3-9414-227f3aba7691")
    public String getEndTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("731fd907-de58-4af4-8aba-61be7cc2cef6")
    public String getStartTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    @objid ("a69e7302-e85a-4f0a-8e90-89e5c1b1aa9a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("68ecec23-871d-41c4-8bbc-5d9087dfd92f")
    public boolean isSuccessful() {
        return this.elt.isTagged(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("80e64473-ec5f-469b-ab95-5fa98158aeb4")
    public void setEndTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("23b2767d-e1d0-41d1-855c-3fb1f9ac28fb")
    public void setStartTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9deb118c-7d3d-4c19-b549-7b86a1246469")
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

    @objid ("6193cd8b-8ae4-42b4-8aae-737c144cd6e2")
    protected ActionInstance(final Instance elt) {
        super(elt);
    }

    @objid ("e6124144-40b2-4d8e-9200-f628fda5f4f2")
    public static final class MdaTypes {
        @objid ("8b8086b6-c285-4abb-a5e9-60d84dd4734d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dd7f67b4-3fff-4336-85ec-724da0704e4a")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("d57696ab-22ba-47f2-998c-9c0b7be3ce9c")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("8d92a571-9b03-489a-af3f-df735c67487f")
        public static TagType SUCCESSFUL_TAGTYPE_ELT;

        @objid ("063fac1a-e4f5-40d7-9a3c-4436e2b3866b")
        private static Stereotype MDAASSOCDEP;

        @objid ("f1cb0f9f-cf2c-4c6e-931a-35a475344b71")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("91473167-433f-4537-8eb0-4cb0ba509287")
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
