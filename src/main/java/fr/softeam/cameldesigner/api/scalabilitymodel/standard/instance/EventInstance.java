/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
    @objid ("064f457c-6b5f-4191-8c16-7b2090624014")
    public static final String STEREOTYPE_NAME = "EventInstance";

    @objid ("495211e3-c829-4d39-a3d7-7a9628154547")
    public static final String LAYER_TAGTYPE = "layer";

    @objid ("7459bfd6-8fd1-4433-9f81-5e3895326ed7")
    public static final String STATUS_TAGTYPE = "status";

    /**
     * Tells whether a {@link EventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << EventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("07a58da7-e8b2-470f-9c19-5bf1bdcf4a9f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventInstance.STEREOTYPE_NAME));
    }

    @objid ("5429de44-ae76-46c5-a90d-9ac341b3cd18")
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
    @objid ("e3e54fcd-3d02-4888-9ae4-fda15bb0f6a1")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("021e59df-eaa0-4ae1-934a-868ee92fb742")
    public String getLayer() {
        return this.elt.getTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fdc5a8dc-88b2-4e63-a4d0-bf888a4fa3df")
    public String getStatus() {
        return this.elt.getTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0a227a01-4b64-423e-8fbf-14076c2c273c")
    public Event getType() {
        return (Event)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), Event.STEREOTYPE_NAME);
    }

    @objid ("d076aca9-0dc8-4d79-b7e5-48318169ebff")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("64b169fe-dbc4-47b4-a457-028f7a6f2ec7")
    public void setLayer(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4994d216-3c31-41ae-ad60-bdf1c58638a1")
    public void setStatus(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2bd36408-b970-49d0-b2cf-16f75da8a705")
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

    @objid ("ec4ac283-3a92-4cf5-a87c-09ebfb65f113")
    protected EventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("98e63d06-3db8-4a94-99e6-5c82f0f8ac06")
    public static final class MdaTypes {
        @objid ("78dcd110-36eb-4dfa-a4bf-49c4c92008c5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6c9206fa-6591-4c88-9d20-0af44bcb8991")
        public static TagType STATUS_TAGTYPE_ELT;

        @objid ("d78f8247-3dea-4ac6-9ea5-7a04dcbad4e2")
        public static TagType LAYER_TAGTYPE_ELT;

        @objid ("e28b1d00-d15b-44b4-8aa3-da15dca0529d")
        private static Stereotype MDAASSOCDEP;

        @objid ("e9868be3-d834-43fb-956d-3eed74c1c143")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e8ec8b6d-64d1-4314-9419-1e18afac0723")
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
