/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("dd4a5529-8c54-4a91-90fc-22625dbf8e2f")
    public static final String STEREOTYPE_NAME = "EventInstance";

    @objid ("c3de28fc-44c9-46fe-9327-db96c519cb8f")
    public static final String LAYER_TAGTYPE = "layer";

    @objid ("8b8855ce-03c7-44ad-8548-48df86e2a8bb")
    public static final String STATUS_TAGTYPE = "status";

    /**
     * Tells whether a {@link EventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << EventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b8965208-e09d-46ae-8809-3430143611c9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventInstance.STEREOTYPE_NAME));
    }

    @objid ("ed57725d-b276-4e02-ab48-17aad9747b15")
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
    @objid ("0186918d-86c0-4f50-bd75-30e504cb464e")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b061687e-69f2-4788-b42c-5ae55408b3fe")
    public String getLayer() {
        return this.elt.getTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7a28ba4f-a2ce-438d-bb86-0908144abfa6")
    public String getStatus() {
        return this.elt.getTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8530d7ca-689a-4e91-89bc-455928a5406d")
    public Event getType() {
        return (Event)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), Event.STEREOTYPE_NAME);
    }

    @objid ("a9ec9f68-2996-46de-bea0-59412669a6af")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f2b93c3c-ea12-481f-8d54-4589172ed630")
    public void setLayer(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f1d5867d-8944-4f19-a8c9-2a1d78477155")
    public void setStatus(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1f37206d-2ca5-4306-ac89-bebfa1cecde5")
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

    @objid ("b553ab21-3c9e-4105-8f5a-bfd754722b5c")
    protected EventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("98e63d06-3db8-4a94-99e6-5c82f0f8ac06")
    public static final class MdaTypes {
        @objid ("2e248d9a-e6b9-48e2-8888-136e22b4f6af")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1128583f-3e07-4350-a961-e4d0bb3fc6ad")
        public static TagType STATUS_TAGTYPE_ELT;

        @objid ("cc21cd0c-5a01-40c4-bd7d-b9ec8886ad46")
        public static TagType LAYER_TAGTYPE_ELT;

        @objid ("f16e0435-23b6-4d08-916d-fc2769662c02")
        private static Stereotype MDAASSOCDEP;

        @objid ("99a2a834-9081-476c-aca5-9e2ca419896b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f144f777-8324-4fec-8eb2-785e7537203b")
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
