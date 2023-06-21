/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("e0ad7fd0-d263-43c9-bea1-e4678531575f")
    public static final String STEREOTYPE_NAME = "ActionInstance";

    @objid ("a73185d3-19b0-411c-ae84-b32470787445")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("c8b16cc4-83fd-42bc-bda9-e3a67fbb9aad")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("05069fba-9958-4ec9-865e-92f4e48ef368")
    public static final String SUCCESSFUL_TAGTYPE = "successful";

    /**
     * Tells whether a {@link ActionInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ActionInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2bf08e2b-0b5e-4dc2-a64b-4b458f8a2635")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ActionInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ActionInstance >> then instantiate a {@link ActionInstance} proxy.
     * 
     * @return a {@link ActionInstance} proxy on the created {@link Instance}.
     */
    @objid ("d5fc57cc-d3fa-4281-ab17-0510e9f1738a")
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
    @objid ("a84adc45-f645-4e5a-84c5-fa133fa9dd4c")
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
    @objid ("a3461ca6-273d-4e2d-ba47-c757b9778cd5")
    public static ActionInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ActionInstance.canInstantiate(obj))
        	return new ActionInstance(obj);
        else
        	throw new IllegalArgumentException("ActionInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("700b2332-de4d-4910-8775-19da33b1756e")
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
    @objid ("163f8f47-5011-43c1-a6f0-987e0bc36e87")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5cd98edb-6ea7-48e1-9c32-1a0cf9abfcc9")
    public String getEndTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1a61bbab-23cb-4730-a5af-263a35e78192")
    public String getStartTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    @objid ("01f7e3a9-b915-4cac-a1f4-503befec4e6b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f8be5b85-03a2-4714-857e-d1a96088fa38")
    public boolean isSuccessful() {
        return this.elt.isTagged(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("63b6fc90-5720-4e12-b872-edf5c0e0befb")
    public void setEndTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2123d70c-96d0-49df-80ca-ae5af70d86eb")
    public void setStartTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f04cfa70-5724-4909-b9c7-6e1720714871")
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

    @objid ("ac69c116-0ae8-41ce-8c02-306435e44a2b")
    protected ActionInstance(final Instance elt) {
        super(elt);
    }

    @objid ("e6124144-40b2-4d8e-9200-f628fda5f4f2")
    public static final class MdaTypes {
        @objid ("85f9906e-db62-4bdc-8275-f1e4654b3e04")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("df657500-45ec-4a36-b8d3-0b065688d66b")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("1d69e400-497a-4185-8333-82fb3f03abe2")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("73e7436c-c534-41c8-91a4-4548c0a431af")
        public static TagType SUCCESSFUL_TAGTYPE_ELT;

        @objid ("a84c2a4f-b0a6-452c-a947-59a08f796205")
        private static Stereotype MDAASSOCDEP;

        @objid ("f4f5b3c9-a51e-4e81-8cfd-6f890bd84bb7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5840ef5c-6e4a-4800-9263-4af43159db45")
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
