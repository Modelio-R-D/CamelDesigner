/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("06c81b94-57b1-48c9-bfde-d76d1ad22d12")
    public static final String STEREOTYPE_NAME = "CloudProvider";

    @objid ("ecd64a21-d50f-4861-bf42-5838873c450b")
    public static final String IAAS_TAGTYPE = "IaaS";

    @objid ("e2c04a7b-17e7-45d0-9ca8-f4b8c536b79a")
    public static final String PAAS_TAGTYPE = "PaaS";

    @objid ("5b7b5531-9bc0-4518-9180-556576343b66")
    public static final String SAAS_TAGTYPE = "SaaS";

    @objid ("e3456182-da80-495a-9c10-17c126867879")
    public static final String PUBLIC_TAGTYPE = "public";

    /**
     * Tells whether a {@link CloudProvider proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudProvider >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f149d706-7c7a-4e3e-b2e2-e0519bb8e478")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudProvider >> then instantiate a {@link CloudProvider} proxy.
     * 
     * @return a {@link CloudProvider} proxy on the created {@link Class}.
     */
    @objid ("5d0e5672-848a-480e-9cd8-36625b198556")
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
    @objid ("af0b85fa-302a-4df2-8eaf-fbe40a76d1c8")
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
    @objid ("6dbe8689-17eb-4cb2-bda7-e5640a98c790")
    public static CloudProvider safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudProvider.canInstantiate(obj))
        	return new CloudProvider(obj);
        else
        	throw new IllegalArgumentException("CloudProvider: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("54ee63cf-b2a9-4f88-8134-98fad7708297")
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
    @objid ("21e83819-7ed3-46df-97e3-d91f978d8628")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e693f024-6d2f-4763-9ace-ec15d79f21ac")
    public String getIaaS() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9fe6323b-d3b0-4d8b-b5fd-ddc3d60f7952")
    public String getPaaS() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("85f0b87a-a444-4f36-a61b-81e8839950a6")
    public String getPublic() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3ce1becd-edac-4dfa-88cf-71c994944c7a")
    public String getSaaS() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    @objid ("b3a14be5-aa04-4c84-a6a2-0938831f700a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("92448c08-ad2a-4359-a9c9-012ac3e95207")
    public void setIaaS(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4515441d-cb86-4c3a-a0a7-f8820a0c9239")
    public void setPaaS(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b60fb24e-029d-4a90-a44b-f0423f096983")
    public void setPublic(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5797ac14-29fe-4696-a585-93ebbffcc01c")
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

    @objid ("1f503052-88cc-4eba-b343-31b081e757b7")
    protected CloudProvider(final Class elt) {
        super(elt);
    }

    @objid ("3a9e1b7d-4edb-4361-aa5d-657d494731fb")
    public static final class MdaTypes {
        @objid ("d3b07c10-e410-4a7c-9821-c8e0121ff70a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("30401f98-dd3e-4cc4-ae4e-14e6cb75baa6")
        public static TagType PUBLIC_TAGTYPE_ELT;

        @objid ("632fefdc-f66b-4241-b102-add78ee0faca")
        public static TagType SAAS_TAGTYPE_ELT;

        @objid ("e7868393-973f-45de-9c0b-152f3ddc1d83")
        public static TagType PAAS_TAGTYPE_ELT;

        @objid ("f3a1d87a-82cb-4165-b52f-58f796aebdfa")
        public static TagType IAAS_TAGTYPE_ELT;

        @objid ("6ca61fe5-a493-4bd4-ac62-7d887c115791")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ab4511f-23cc-4769-834a-3546cf7ca781")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("609aec7c-aba9-426d-8dd1-8b70b4e355a7")
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
