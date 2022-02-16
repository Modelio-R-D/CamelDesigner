/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("a31ba7c4-3774-4c37-84f8-53e8f26ad889")
    public static final String STEREOTYPE_NAME = "CloudProvider";

    @objid ("d0f214d2-6d04-4281-a958-e9554e1faf5c")
    public static final String IAAS_TAGTYPE = "IaaS";

    @objid ("511552ae-1348-4b85-83fe-5b9e5e3930af")
    public static final String PAAS_TAGTYPE = "PaaS";

    @objid ("04c2eeb8-3107-4543-97aa-c35276b8cb43")
    public static final String SAAS_TAGTYPE = "SaaS";

    @objid ("094693b2-9fe0-4359-af8c-965d271ea7a4")
    public static final String PUBLIC_TAGTYPE = "public";

    /**
     * Tells whether a {@link CloudProvider proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudProvider >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6052fbe3-c64b-4be0-a269-17a338201378")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudProvider >> then instantiate a {@link CloudProvider} proxy.
     * 
     * @return a {@link CloudProvider} proxy on the created {@link Class}.
     */
    @objid ("8f0dc432-92ac-40b6-8ecc-bc182a427bb6")
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
    @objid ("ae3389e0-5a9a-4b22-be08-77f5e6a3bb36")
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
    @objid ("af16e49a-2e97-4825-a056-f77f3bae3189")
    public static CloudProvider safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudProvider.canInstantiate(obj))
        	return new CloudProvider(obj);
        else
        	throw new IllegalArgumentException("CloudProvider: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("880f7266-afb9-414f-a736-c21e001a8d18")
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
    @objid ("9753eb80-1f07-4ac0-ad71-c6d216ea01a3")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("52ac0967-39ff-4e55-b3c3-609ea307d436")
    public String getIaaS() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f0854cfd-37ea-41b9-a630-f0d6b2c0e1d1")
    public String getPaaS() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("023e0c91-b204-46fa-99d8-a4252436fa86")
    public String getPublic() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("85f87caa-20b7-45a2-8762-82b3d878a8c3")
    public String getSaaS() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    @objid ("3b2d1b25-efa8-4c7b-8856-b51952106ad4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4f321914-56d9-4f5b-9c41-08dbb606f9bf")
    public void setIaaS(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f6101974-68e3-4de9-8995-6beacec45458")
    public void setPaaS(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("35d34cda-5c62-43f0-b377-f79839274066")
    public void setPublic(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7d67e2e0-2bc9-4044-8071-493a0063fb10")
    public void setSaaS(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT, value);
    }

    @objid ("88addc4b-73d6-4a23-8191-8ea1c4a030ce")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("32d0288a-a119-46e0-a5e1-c4ec4bd1244f")
    protected CloudProvider(final Class elt) {
        super(elt);
    }

    @objid ("3a9e1b7d-4edb-4361-aa5d-657d494731fb")
    public static final class MdaTypes {
        @objid ("f37060af-1993-4d62-8b43-190b52c1c012")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f66fc7e8-025d-473d-a41c-ad4e7210ec2e")
        public static TagType PUBLIC_TAGTYPE_ELT;

        @objid ("5ba2be6a-fadd-473d-a3e5-2afa40d3cbb8")
        public static TagType SAAS_TAGTYPE_ELT;

        @objid ("e3603d15-bc14-4e05-9968-1ba5777a9522")
        public static TagType PAAS_TAGTYPE_ELT;

        @objid ("f7b0acfe-4429-422f-bfd4-219a8674b645")
        public static TagType IAAS_TAGTYPE_ELT;

        @objid ("f0f8f39e-94de-4893-9a47-c8815d85cae6")
        private static Stereotype MDAASSOCDEP;

        @objid ("476730ef-4a01-4be8-8660-eb6cf39ff8c7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("30eb9171-af68-4b2d-b370-a29f12cee0ed")
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
