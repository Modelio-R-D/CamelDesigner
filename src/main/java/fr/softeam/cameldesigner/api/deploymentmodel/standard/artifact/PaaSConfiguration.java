/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

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
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << PaaSConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ce90fefb-5b15-4e21-9681-cb6da152b51c")
public class PaaSConfiguration extends Configuration {
    @objid ("c4258cd9-00e4-482b-b75b-8d72c47d05cf")
    public static final String STEREOTYPE_NAME = "PaaSConfiguration";

    @objid ("db054a71-4bf4-4c38-bf2a-99129a5055e0")
    public static final String API_TAGTYPE = "api";

    @objid ("a90147bc-dc60-4e19-ba17-4eaa849f397b")
    public static final String DOWNLOADURL_TAGTYPE = "downloadURL";

    @objid ("c32e8a65-ff5e-47b9-b899-c5de4a991ce8")
    public static final String ENDPOINT_TAGTYPE = "endpoint";

    @objid ("0bf7f683-d576-40c9-89e5-889b7aa10987")
    public static final String VERSION_TAGTYPE = "version";

    /**
     * Tells whether a {@link PaaSConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << PaaSConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("90f9cff7-4c09-4e1e-bbc3-42949e907991")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << PaaSConfiguration >> then instantiate a {@link PaaSConfiguration} proxy.
     * 
     * @return a {@link PaaSConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("61c7855a-cb3e-4a49-97fb-83d56aa21e91")
    public static PaaSConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaSConfiguration.STEREOTYPE_NAME);
        return PaaSConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link PaaSConfiguration} proxy from a {@link Artifact} stereotyped << PaaSConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link PaaSConfiguration} proxy or <i>null</i>.
     */
    @objid ("d17cc3b1-5898-4bc5-9b57-c765d3b38826")
    public static PaaSConfiguration instantiate(final Artifact obj) {
        return PaaSConfiguration.canInstantiate(obj) ? new PaaSConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaSConfiguration} proxy from a {@link Artifact} stereotyped << PaaSConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link PaaSConfiguration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2c471ffc-5cf4-4312-ac40-a7f8d920ae32")
    public static PaaSConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (PaaSConfiguration.canInstantiate(obj))
        	return new PaaSConfiguration(obj);
        else
        	throw new IllegalArgumentException("PaaSConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4fabd3ba-eb28-4db0-92de-55e24d1bc717")
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
        PaaSConfiguration other = (PaaSConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'api'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3244bafd-e872-48fd-adb4-bce5ba63eace")
    public String getApi() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.API_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b180f7c9-99a3-44c5-aea6-77d779b3cbe6")
    public String getDownloadURL() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("a7b6628f-e53c-4fc4-8d9c-66593832a2d7")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'endpoint'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b1fbec56-f515-463b-8045-224e4eec6b14")
    public String getEndpoint() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.ENDPOINT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9581b090-eb73-4476-9b0c-d18906d44c66")
    public String getVersion() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.VERSION_TAGTYPE_ELT);
    }

    @objid ("8681f5fc-ade6-4334-b7e7-14f6e40720b8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'api'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("86d0025a-d50b-4d16-a0ca-7c20f932cef2")
    public void setApi(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.API_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7a6346a6-09ad-4275-bed7-8558106eac13")
    public void setDownloadURL(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endpoint'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3eed60d6-facd-4738-9585-6572b70e5338")
    public void setEndpoint(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.ENDPOINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ba447592-009a-4910-864f-88b54bccb58f")
    public void setVersion(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.VERSION_TAGTYPE_ELT, value);
    }

    @objid ("e3e45324-6072-4b94-9fdd-b96b6b6c22ab")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("be33e84c-1735-49b3-a5a9-9ca2f89d777b")
    protected PaaSConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("7782d259-fea0-4b7d-98db-5a791c033e34")
    public static final class MdaTypes {
        @objid ("ee71ca19-7bce-4af9-b790-cfbeea5a7ec6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ae684321-8f91-4d2e-a652-11113cdb2060")
        public static TagType API_TAGTYPE_ELT;

        @objid ("24cc771d-9f49-40dd-98e8-ed536299c7e1")
        public static TagType VERSION_TAGTYPE_ELT;

        @objid ("2374e974-411a-4128-b923-36ddd917fe92")
        public static TagType ENDPOINT_TAGTYPE_ELT;

        @objid ("cac82f5e-9563-4eab-a4cc-fc9118fbe5c9")
        public static TagType DOWNLOADURL_TAGTYPE_ELT;

        @objid ("d0b35fb4-7b56-49d3-b8b6-891142ee4559")
        private static Stereotype MDAASSOCDEP;

        @objid ("adb2e06c-3371-44b7-86ad-ab32d789e387")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e49773bb-bab0-4d7d-a85f-dc4c59202715")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "708a5ac1-972a-428b-8eb9-2caa4bc35dbd");
            API_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f030f8ad-63ae-42c6-8eaf-af3bd34ffc29");
            VERSION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "714f9b40-e02b-4d11-9d33-c41aebe5fc2a");
            ENDPOINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b29d207b-7ea1-4215-98ec-ca376e600523");
            DOWNLOADURL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a187ac30-8cda-4e5a-bf97-c52a98987e17");
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
