/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << EventInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8005a96c-e013-4ff4-a74a-e35f726ef779")
public abstract class EventInstance extends Feature {
    @objid ("40fd2d24-7dbb-4175-85a1-dea170412492")
    public static final String STEREOTYPE_NAME = "EventInstance";

    @objid ("f9599551-f750-438d-9399-4a4aac2e2b37")
    public static final String LAYER_TAGTYPE = "layer";

    @objid ("9bdf47a0-b3ba-4406-8d19-8e37643d01aa")
    public static final String STATUS_TAGTYPE = "status";

    @objid ("466e01c3-fc38-4210-8e41-ad52e3227146")
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
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e6fb7dac-7c57-4b8a-8fdf-1049c77561d3")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d0a4af8a-5a58-42b2-97a7-ee1a7be9c917")
    public String getLayer() {
        return this.elt.getTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6eedba47-ae25-4e24-8866-e5fa731ff642")
    public String getStatus() {
        return this.elt.getTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT);
    }

    @objid ("8a837372-c6a6-4df3-ac03-05eb2b25de0b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1c343fc5-07cc-4e04-9bd3-cb4b2a482cab")
    public void setLayer(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0aaca4bd-0e98-4f4e-b7cf-780773d95571")
    public void setStatus(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT, value);
    }

    @objid ("e9fc8f9b-8a34-40fc-82f0-ecd547484532")
    protected EventInstance(final Class elt) {
        super(elt);
    }

    @objid ("ea2f154d-242a-4d56-9a56-444720203be8")
    public static final class MdaTypes {
        @objid ("ac33a902-115c-47cc-9a82-a52e9e269309")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a3d980f8-78eb-4868-ab9d-089db13dab85")
        public static TagType STATUS_TAGTYPE_ELT;

        @objid ("7ae6cb24-663f-4f63-b51e-0d346b656ac2")
        public static TagType LAYER_TAGTYPE_ELT;

        @objid ("2e189fa4-11e1-49e0-ab9c-3f2c39541c6e")
        private static Stereotype MDAASSOCDEP;

        @objid ("ff6cbc97-355d-48cb-af14-7c1b3384b7ed")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0aa1d714-2a14-456e-835c-219ce2024899")
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
