/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("605f5a9b-0855-47e4-8ffa-e0256b780ec8")
    public static final String STEREOTYPE_NAME = "EventInstance";

    @objid ("629de141-b063-45cf-8621-d60aaeef1cc6")
    public static final String LAYER_TAGTYPE = "layer";

    @objid ("785b449e-dac4-441f-91e0-4288773f6e22")
    public static final String STATUS_TAGTYPE = "status";

    /**
     * Tells whether a {@link EventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << EventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("74650d5b-618c-4310-8b9a-bbabe2f50b33")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventInstance.STEREOTYPE_NAME));
    }

    @objid ("a79e7594-4300-4400-a157-a0c9b44e0f2a")
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
    @objid ("d456f184-e415-42c1-b198-316f5ed3cd50")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("22135b93-64a7-486c-97e0-779acd5c75dd")
    public String getLayer() {
        return this.elt.getTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5054d4b3-510d-4775-aad6-916e18164832")
    public String getStatus() {
        return this.elt.getTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ccd45453-c279-467c-92de-2ec69983d106")
    public Event getType() {
        return (Event)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), Event.STEREOTYPE_NAME);
    }

    @objid ("481261e1-ba6a-47e4-8727-d1083ad4349a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2bd4ff82-a5b1-4ab0-9208-9018e2c7a0c9")
    public void setLayer(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ee4b08a9-6168-419c-b4ac-5d156c167573")
    public void setStatus(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d0057f6a-e181-46c9-a582-0bd2cbc639fa")
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

    @objid ("93592c5c-fcbf-4dcb-a285-8f42973e8c14")
    protected EventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("98e63d06-3db8-4a94-99e6-5c82f0f8ac06")
    public static final class MdaTypes {
        @objid ("15d742ff-1a6f-42ea-99b2-99dfe0e2000f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("de5097e8-c727-4112-978f-7f9eb8ec3158")
        public static TagType STATUS_TAGTYPE_ELT;

        @objid ("a0164fd4-5902-4fd3-8e5d-9814ce9df138")
        public static TagType LAYER_TAGTYPE_ELT;

        @objid ("285f15d8-c035-4808-813b-773ac6e3dd92")
        private static Stereotype MDAASSOCDEP;

        @objid ("e5968dbb-45e4-4db9-9d7d-be548d68cd1f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e5eb8500-4553-42e5-a4c2-54f4752e2237")
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
