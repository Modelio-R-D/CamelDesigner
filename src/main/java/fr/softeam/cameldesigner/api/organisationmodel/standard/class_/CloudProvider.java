/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("6e2a36db-90fb-43d7-bdfc-651fc91c949e")
    public static final String STEREOTYPE_NAME = "CloudProvider";

    @objid ("39dc1641-932b-461d-a8d2-9688bab5eedc")
    public static final String IAAS_TAGTYPE = "IaaS";

    @objid ("cd2f816d-7464-4c06-9e19-13749820a635")
    public static final String PAAS_TAGTYPE = "PaaS";

    @objid ("1d271aae-196f-47c4-98f1-f38e962d3b90")
    public static final String SAAS_TAGTYPE = "SaaS";

    @objid ("d7d8f496-81cf-40fe-a2c3-6ea46e5b84c5")
    public static final String PUBLIC_TAGTYPE = "public";

    /**
     * Tells whether a {@link CloudProvider proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudProvider >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("369d1ffc-a0e2-43fe-8f3c-0cb1b06e3347")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudProvider >> then instantiate a {@link CloudProvider} proxy.
     * 
     * @return a {@link CloudProvider} proxy on the created {@link Class}.
     */
    @objid ("612f6048-ec3b-4c88-8287-046c1975b976")
    public static CloudProvider create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME);
        return CloudProvider.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CloudProvider} proxy from a {@link Class} stereotyped << CloudProvider >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link CloudProvider} proxy or <i>null</i>.
     */
    @objid ("1d8d84ff-2642-4589-b02b-8eef75449565")
    public static CloudProvider instantiate(final Class obj) {
        return CloudProvider.canInstantiate(obj) ? new CloudProvider(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudProvider} proxy from a {@link Class} stereotyped << CloudProvider >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link CloudProvider} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("049b5294-2349-4f7f-a4cb-3e1f1747b83e")
    public static CloudProvider safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudProvider.canInstantiate(obj))
            return new CloudProvider(obj);
        else
            throw new IllegalArgumentException("CloudProvider: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("11ec4189-9aa4-4383-92d4-ffcba3cfc146")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b3e8e716-f8f9-424a-87b4-407b2ba50e36")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("14f8e6ce-306d-44db-b6f7-25e3992a8056")
    public String getIaaS() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9db9928b-c282-40ae-ab45-dd195a705419")
    public String getPaaS() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("061b24e6-a122-4db5-8093-776e9090df4d")
    public String getPublic() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8703185f-3721-4ad7-a493-b8a5c1d1eb4a")
    public String getSaaS() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    @objid ("787d38f3-2b37-4dfa-b2e4-432bf77abb95")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d9baf07e-052b-4e60-aa9c-f00eb56c73ca")
    public void setIaaS(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("463d60dd-0ca9-4dc5-9022-38f3c4626286")
    public void setPaaS(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c28bc0e0-808f-4289-a464-89c82ccbe7e8")
    public void setPublic(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6b75eda6-ce27-455a-98db-84c0610f98c7")
    public void setSaaS(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT, value);
    }

    @objid ("f998cc35-7837-4d00-b38e-db6a171f026f")
    protected CloudProvider(final Class elt) {
        super(elt);
    }

    @objid ("88addc4b-73d6-4a23-8191-8ea1c4a030ce")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("3a9e1b7d-4edb-4361-aa5d-657d494731fb")
    public static final class MdaTypes {
        @objid ("44c0d0d8-ddc6-4337-9fa6-5d16e439fbd7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1b47273d-4107-465a-8bad-ffddf3a67fdd")
        public static TagType PUBLIC_TAGTYPE_ELT;

        @objid ("60611157-bc8c-4eb4-bce9-74d280e44e65")
        public static TagType SAAS_TAGTYPE_ELT;

        @objid ("16f13f63-deca-44fc-9de6-d90d70e6f5d8")
        public static TagType PAAS_TAGTYPE_ELT;

        @objid ("0ca2e344-0897-4ff1-833e-735a8142ada6")
        public static TagType IAAS_TAGTYPE_ELT;

        @objid ("12540617-a8eb-4c57-90be-9544032171b2")
        private static Stereotype MDAASSOCDEP;

        @objid ("d9a763e3-4618-491a-97a2-780e1a9e5940")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("15e2cf36-5c11-43c0-a03b-bef5cffe28d1")
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
