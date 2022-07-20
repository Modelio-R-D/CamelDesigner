/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("c877b02a-e83f-4c37-a388-ed5e5d12bba5")
    public static final String STEREOTYPE_NAME = "CloudProvider";

    @objid ("59f760d6-c9e1-4dbf-97ad-a186572f7d3c")
    public static final String IAAS_TAGTYPE = "IaaS";

    @objid ("1127e474-c9af-417f-bbfe-aa1d5866b3a3")
    public static final String PAAS_TAGTYPE = "PaaS";

    @objid ("187f0a02-3a57-4bb6-b90c-aa551523ddbb")
    public static final String SAAS_TAGTYPE = "SaaS";

    @objid ("201b53c3-3463-4778-9261-015eea11a1bc")
    public static final String PUBLIC_TAGTYPE = "public";

    /**
     * Tells whether a {@link CloudProvider proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudProvider >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9b331465-1ddc-427d-add3-90a5f62ffed0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudProvider >> then instantiate a {@link CloudProvider} proxy.
     * 
     * @return a {@link CloudProvider} proxy on the created {@link Class}.
     */
    @objid ("dd4d38c5-9044-4e2e-aaa1-f7fb551d2938")
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
    @objid ("55fa3c2e-412f-4a91-8d97-1c86dba84fc7")
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
    @objid ("a6867401-3e9d-4705-8528-728d4cefd40d")
    public static CloudProvider safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudProvider.canInstantiate(obj))
        	return new CloudProvider(obj);
        else
        	throw new IllegalArgumentException("CloudProvider: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("75aed39a-8281-4248-88bf-fd2259f789ab")
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
    @objid ("6d683aae-7fba-41c6-b431-e8ac838f8716")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("5f782cf3-7c2a-427c-9f27-840bf18febe9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("966928fa-a1ad-4f46-aaca-068652b3b5c4")
    public boolean isIaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7699b915-5441-406c-ac38-94cc8ff17770")
    public boolean isPaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("79b7f5e4-b560-48d8-bc09-2f15424ff9a0")
    public boolean isPublic() {
        return this.elt.isTagged(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c3ae1d7e-23d3-4d85-b176-731c3ca71f2e")
    public boolean isSaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7a6efd9a-7d4a-4d4d-a6cb-cb5a53fd718e")
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
    @objid ("c38eb1ad-5099-48ff-9c51-8b7542f7a4c5")
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
    @objid ("cddb33bb-389a-425e-ab1d-dbe40c0c7f38")
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
    @objid ("56b2216a-70a5-4be7-83eb-341ce28ba1b2")
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

    @objid ("5845d0dc-6ccb-436d-bd46-25d4dadaf301")
    protected CloudProvider(final Class elt) {
        super(elt);
    }

    @objid ("3a9e1b7d-4edb-4361-aa5d-657d494731fb")
    public static final class MdaTypes {
        @objid ("dc9ad108-baa5-45d5-af2c-47b72805709b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2a184157-f5b4-4e3e-8307-4f41f0c7477e")
        public static TagType PUBLIC_TAGTYPE_ELT;

        @objid ("24f6da02-cb83-4e44-ada1-8eb87c35547b")
        public static TagType SAAS_TAGTYPE_ELT;

        @objid ("c7ccae97-6314-4d15-a086-672eebf50953")
        public static TagType PAAS_TAGTYPE_ELT;

        @objid ("4ae817d0-8125-4456-ae8e-52de34b4f0a9")
        public static TagType IAAS_TAGTYPE_ELT;

        @objid ("8a275cf4-4ea2-4d6e-aba0-ebd24ee5c87d")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e332d3f-c1b2-4179-8067-e789a97cc4b0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4bdbd013-b69b-4fc2-bbdd-9a8eea5cd1b6")
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
