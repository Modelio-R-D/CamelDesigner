/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
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
    @objid ("ebc0b389-eda5-473d-880f-4520397a755e")
    public static final String STEREOTYPE_NAME = "EventInstance";

    @objid ("50f2d12c-63bd-4409-8869-0ac0e5e12c6c")
    public static final String LAYER_TAGTYPE = "layer";

    @objid ("7b08758e-5766-4fff-8bf2-6b7de7bc204f")
    public static final String STATUS_TAGTYPE = "status";

    @objid ("d70c9c59-7c74-41fb-836b-1b786245ae01")
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
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("e9d10d5f-2798-44b6-ab26-81d9353e71c9")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4ca6bca5-0f85-4a2f-b272-835c14ba15f1")
    public String getLayer() {
        return this.elt.getTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9b675a2c-8860-43d4-b77a-79cd37297976")
    public String getStatus() {
        return this.elt.getTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT);
    }

    @objid ("7d20943f-c827-42a3-9d39-7e941fb99aa0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("77c62886-35b7-45d6-91df-04fc743e0968")
    public void setLayer(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ecb1768e-7ab1-498f-870b-7ac6fa774a5a")
    public void setStatus(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT, value);
    }

    @objid ("71384d0e-d67a-49bd-92e1-3b7dd1414074")
    protected EventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("98e63d06-3db8-4a94-99e6-5c82f0f8ac06")
    public static final class MdaTypes {
        @objid ("fb368278-6051-414f-8d70-2a4c367e45e9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e4503cd-4d09-4ae0-9064-5321815dfc0a")
        public static TagType STATUS_TAGTYPE_ELT;

        @objid ("fafc6f16-537d-4c80-a654-ab7a49b4e9a7")
        public static TagType LAYER_TAGTYPE_ELT;

        @objid ("a0b2d28d-868c-475c-aefc-ede92cbf65bf")
        private static Stereotype MDAASSOCDEP;

        @objid ("51a31f97-2ee1-437d-9d9e-a33033237fdf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8c08f3ce-2acf-4947-afe6-566c73e85379")
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
