/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import camel.core.LayerType;
import camel.scalability.StatusType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
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
 * Proxy class to handle a {@link Instance} with << EventInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("73801d4a-bc99-45e4-9e2d-04f8cfc021bf")
public abstract class EventInstance extends FeatureInstance {
    @objid ("2b8f05a4-0997-4ba0-99c9-30109077d40d")
    public static final String STEREOTYPE_NAME = "EventInstance";

    @objid ("707fdea7-0093-4bb7-86db-3409bd612b39")
    public static final String LAYER_TAGTYPE = "layer";

    @objid ("244219b9-e1ca-4bc0-bcae-52031af10627")
    public static final String STATUS_TAGTYPE = "status";

    /**
     * Tells whether a {@link EventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << EventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("36c111a7-9644-4527-b220-81799affbfa2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventInstance.STEREOTYPE_NAME));
    }

    @objid ("2e3a6773-e02a-4c66-95a2-1af9705a07f9")
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
        EventInstance other = (EventInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("ae3c3f2f-f1f1-42e2-be4b-bdb4575cec47")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1b6712bc-2758-43ea-a1d0-5a3d46b33dfc")
    public String getLayer() {
        return this.elt.getTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1df33e57-8dea-41e0-8ac1-cb80c0af7641")
    public String getStatus() {
        return this.elt.getTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e24f6439-d35c-46ba-9b5c-2edd7dc5753b")
    public Event getType() {
        return (Event)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), Event.STEREOTYPE_NAME);
    }

    @objid ("83bc1e1d-42d3-41eb-9d35-154bde99a7c4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("70c17372-cf31-4077-ab4b-f803236413e6")
    public void setLayer(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d1cb01ce-c5ee-4645-9263-8c8d3f1b6375")
    public void setStatus(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ab5d2500-9f77-4e8e-81dc-edad7e2c22e3")
    public void setType(final Event obj) {
        ((Instance) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    @objid ("866e61d4-468c-4a22-9aa6-a61c360dd6f5")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    /**
     * Getter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0a5bd02a-0ed8-40b6-bf57-3a2d12428cdf")
    public LayerType getLayerType() {
        String value =  this.elt.getTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT);
        if ((value != null) && (!(value.equals("")))) {
            try {
                return LayerType.valueOf(value);
            }catch (Exception e) {
                CamelDesignerModule.logService.error(e);
            }
        }
        return LayerType.SAA_S;
    }

    /**
     * Getter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9356765e-52d0-46dc-99d1-86683efe3e92")
    public StatusType getStatusType() {
        String value =  this.elt.getTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT);
        if ((value != null) && (!(value.equals("")))) {
            try {
                return StatusType.valueOf(value);
            }catch (Exception e) {
                CamelDesignerModule.logService.error(e);
            }
        }
        return StatusType.CRITICAL;
    }

    /**
     * Setter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("050ef954-0861-4cee-bc9a-e72f9d97cafd")
    public void setLayer(final LayerType value) {
        this.elt.putTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT, value.toString());
    }

    /**
     * Setter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2290af3b-1b6e-47cf-b17f-6d0df457b4b7")
    public void setStatus(final StatusType value) {
        this.elt.putTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT, value.toString());
    }

    @objid ("59826c58-df25-4471-90ee-05c21a02c695")
    protected EventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("98e63d06-3db8-4a94-99e6-5c82f0f8ac06")
    public static final class MdaTypes {
        @objid ("d63ec3cb-ecdd-430e-a41d-c0539596be6d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ac89b5dd-c66f-444e-8580-cfa3fa89453a")
        public static TagType STATUS_TAGTYPE_ELT;

        @objid ("d9f89fd5-5fe1-4aaa-9db0-2c61cdf1febb")
        public static TagType LAYER_TAGTYPE_ELT;

        @objid ("bdc44ea2-10a4-4ae8-be7b-7617a12111f4")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ccce536-5d41-4de3-9e21-162c167b813b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f4fabd6c-f273-435c-83d9-8a571ef374d3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7cddc4dd-ed72-4a04-85c5-54fe85e4ef38");
            STATUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4747fc7f-ba00-4b26-b582-d03b1ba48082");
            LAYER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cb82d86d-41ee-47ee-b272-0c8093a8fadf");
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
