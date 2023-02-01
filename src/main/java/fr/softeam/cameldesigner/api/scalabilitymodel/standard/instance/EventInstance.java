/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d7ec7c7b-1bce-47a9-8c38-5f8500d5e2b5")
    public static final String STEREOTYPE_NAME = "EventInstance";

    @objid ("b78517c6-fbb2-427a-9d8f-d57734243717")
    public static final String LAYER_TAGTYPE = "layer";

    @objid ("61564d04-82e5-4b9f-8b93-d9476e0db1a3")
=======
    @objid ("2b8f05a4-0997-4ba0-99c9-30109077d40d")
    public static final String STEREOTYPE_NAME = "EventInstance";

    @objid ("707fdea7-0093-4bb7-86db-3409bd612b39")
    public static final String LAYER_TAGTYPE = "layer";

    @objid ("244219b9-e1ca-4bc0-bcae-52031af10627")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STATUS_TAGTYPE = "status";

    /**
     * Tells whether a {@link EventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << EventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("99f34c53-09c5-46c8-938c-95622f72086f")
=======
    @objid ("36c111a7-9644-4527-b220-81799affbfa2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventInstance.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("ab5221d6-16ab-4016-a40e-0ef54ede8aba")
=======
    @objid ("2e3a6773-e02a-4c66-95a2-1af9705a07f9")
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
        EventInstance other = (EventInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("1c05dfbe-22b6-4cf3-9086-d49d9533d226")
=======
    @objid ("ae3c3f2f-f1f1-42e2-be4b-bdb4575cec47")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("06b2f8f1-8160-420b-bacd-a3384c3ed90c")
=======
    @objid ("1b6712bc-2758-43ea-a1d0-5a3d46b33dfc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getLayer() {
        return this.elt.getTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("0bfa7342-8250-4ccd-8ee9-bad570fa797d")
=======
    @objid ("1df33e57-8dea-41e0-8ac1-cb80c0af7641")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getStatus() {
        return this.elt.getTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("6a2fb808-6f18-4356-a2d9-0e6303ca92e1")
=======
    @objid ("e24f6439-d35c-46ba-9b5c-2edd7dc5753b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public Event getType() {
        return (Event)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), Event.STEREOTYPE_NAME);
    }

<<<<<<< HEAD
    @objid ("aa620a6c-ee18-4377-b8d0-4bed19005718")
=======
    @objid ("83bc1e1d-42d3-41eb-9d35-154bde99a7c4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("8759183b-ca35-44b6-9729-b7f9673d117f")
=======
    @objid ("70c17372-cf31-4077-ab4b-f803236413e6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setLayer(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("319a6aaa-015a-47cf-b48a-60bc9e064a8f")
=======
    @objid ("d1cb01ce-c5ee-4645-9263-8c8d3f1b6375")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setStatus(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("7eb2fd93-284d-42a6-9f8c-bf1b2e927bfe")
=======
    @objid ("ab5d2500-9f77-4e8e-81dc-edad7e2c22e3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("ca6ceeee-bcb6-4bbe-856d-069d50ef857a")
=======
    @objid ("59826c58-df25-4471-90ee-05c21a02c695")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected EventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("98e63d06-3db8-4a94-99e6-5c82f0f8ac06")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("d559a59a-2b96-41dd-bd50-8cc9fcc3ba37")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("59f53e9b-b263-4008-9d2c-42720c6b5bc6")
        public static TagType STATUS_TAGTYPE_ELT;

        @objid ("85fd556b-fd8b-4c4f-ab8d-3d166a5e6eca")
        public static TagType LAYER_TAGTYPE_ELT;

        @objid ("5de19872-5c35-4c19-907f-75571c66bc5a")
        private static Stereotype MDAASSOCDEP;

        @objid ("5d160f95-6941-4b7e-bda7-10937a591104")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3cf114a8-130a-48f2-a912-3da029229a04")
=======
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
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
