/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
 * Proxy class to handle a {@link Class} with << CloudProvider >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fb9d9a88-d4a0-4e3f-a3de-0a99ce0662d5")
public class CloudProvider extends Organisation {
    @objid ("e6f8d2b6-33c2-44f7-8300-8ead060e940e")
    public static final String STEREOTYPE_NAME = "CloudProvider";

    @objid ("f2c08bc1-2c59-4b57-97fd-5869c0db0def")
    public static final String IAAS_TAGTYPE = "IaaS";

    @objid ("291b0663-623b-4bef-a40f-17b6f9058e67")
    public static final String PAAS_TAGTYPE = "PaaS";

    @objid ("23601800-f3a3-489e-9c8d-2c8031fd4884")
    public static final String SAAS_TAGTYPE = "SaaS";

    @objid ("0abf6927-11fa-4684-92d6-2d201035741c")
    public static final String PUBLIC_TAGTYPE = "public";

    /**
     * Tells whether a {@link CloudProvider proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudProvider >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a40f3471-b7f9-4f36-a411-79a882f65565")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudProvider >> then instantiate a {@link CloudProvider} proxy.
     * 
     * @return a {@link CloudProvider} proxy on the created {@link Class}.
     */
    @objid ("7d668f0b-9846-4bfe-82f7-c23bc449a202")
    public static CloudProvider create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME);
        return CloudProvider.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CloudProvider} proxy from a {@link Class} stereotyped << CloudProvider >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CloudProvider} proxy or <i>null</i>.
     */
    @objid ("b564b6c9-e89d-4ccb-ae06-e804b31a0839")
    public static CloudProvider instantiate(final Class obj) {
        return CloudProvider.canInstantiate(obj) ? new CloudProvider(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudProvider} proxy from a {@link Class} stereotyped << CloudProvider >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CloudProvider} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d724e550-b36e-4768-8a4d-65fdc42f886d")
    public static CloudProvider safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudProvider.canInstantiate(obj))
        	return new CloudProvider(obj);
        else
        	throw new IllegalArgumentException("CloudProvider: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a05165dd-a081-4344-8676-b990dae28a3a")
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
        CloudProvider other = (CloudProvider) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("21a964e9-87dc-4a68-a00c-95991f2444b7")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("ca5de207-5977-4f8b-aa2f-07a2722dd257")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b559242b-b9d5-4e4a-8a91-b9aaced6da62")
    public boolean isIaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("57042429-07a4-49fa-8540-6f30b976bf60")
    public boolean isPaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2d6e9918-4dc3-4910-8784-37454799fe87")
    public boolean isPublic() {
        return this.elt.isTagged(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("02dbc316-956b-41c1-ba72-d02e44a2431a")
    public boolean isSaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6ed32fea-918e-4194-9985-e437bd9685b6")
    public void setIaaS(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8dfd6d03-6d28-493b-8571-0307262a786c")
    public void setPaaS(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("94dfb34f-9210-47bc-bd75-4a41a5f01ead")
    public void setPublic(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9c9a1d64-f2dd-409e-bb08-de0ce63b44ca")
    public void setSaaS(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    @objid ("88addc4b-73d6-4a23-8191-8ea1c4a030ce")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("d8b81815-517e-4cfc-93a3-25faf4fbbce7")
    protected CloudProvider(final Class elt) {
        super(elt);
    }

    @objid ("3a9e1b7d-4edb-4361-aa5d-657d494731fb")
    public static final class MdaTypes {
        @objid ("f67035ea-789d-48e0-bab5-9c3e93fea63d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ae7a6224-b600-4e5a-858e-157fefb91765")
        public static TagType PUBLIC_TAGTYPE_ELT;

        @objid ("8bdf2021-c2df-4d80-81b5-2f0460299181")
        public static TagType SAAS_TAGTYPE_ELT;

        @objid ("23e63e61-5fb7-4edf-b4e0-c87a373cf765")
        public static TagType PAAS_TAGTYPE_ELT;

        @objid ("50519a91-3051-4f32-86d8-3a6639fb260d")
        public static TagType IAAS_TAGTYPE_ELT;

        @objid ("3c7e87d5-6b09-4399-8490-534002f48c8c")
        private static Stereotype MDAASSOCDEP;

        @objid ("801592f3-bb96-464a-b73f-2184bc58e70f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8244db4c-35be-4fd2-a71d-72218ca8de5a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eb3e5683-72bd-4e46-8bda-1ea07af0c09e");
            PUBLIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a7b7a414-a54a-45b1-a53e-3126883211b8");
            SAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f42c6540-bd96-497b-9689-075610b04eda");
            PAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d89c42d7-ad3d-49e1-a24d-46b82e7965ac");
            IAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e33192b2-ce6c-499c-98c5-167d63c32690");
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
