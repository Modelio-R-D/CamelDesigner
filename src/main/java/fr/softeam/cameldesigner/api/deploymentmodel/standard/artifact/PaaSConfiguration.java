/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("cbf40009-3131-445d-8a09-8c8bf46481fe")
    public static final String STEREOTYPE_NAME = "PaaSConfiguration";

    @objid ("a3fcf977-aa58-42be-aa83-38d66b3d924f")
    public static final String API_TAGTYPE = "api";

    @objid ("a7e70e80-a612-43ba-8292-5d1b0585f1eb")
    public static final String DOWNLOADURL_TAGTYPE = "downloadURL";

    @objid ("b6baefe0-ce5c-4a65-8b7e-a06994c414f8")
    public static final String ENDPOINT_TAGTYPE = "endpoint";

    @objid ("592498e9-946c-4036-8d03-84d709ce901b")
    public static final String VERSION_TAGTYPE = "version";

    /**
     * Tells whether a {@link PaaSConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << PaaSConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("026882f7-c45a-4b86-82a1-ea4aca5600fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << PaaSConfiguration >> then instantiate a {@link PaaSConfiguration} proxy.
     * 
     * @return a {@link PaaSConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("e0d9895b-7641-43fd-88a9-5e4926af243b")
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
    @objid ("1505f9aa-c510-471d-800b-83d5c26df939")
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
    @objid ("55ad5732-0d0e-4c56-a0ea-b42b27f6804f")
    public static PaaSConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (PaaSConfiguration.canInstantiate(obj))
        	return new PaaSConfiguration(obj);
        else
        	throw new IllegalArgumentException("PaaSConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9f32ec82-06ed-497b-9762-e1b54c110211")
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
    @objid ("7c189055-f825-42ae-893d-6325b0dbd4ac")
    public String getApi() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.API_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5723491f-5f24-4cd1-b70d-c7af7d28bd09")
    public String getDownloadURL() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("b7252785-de23-4daa-8ccd-b0fd562d735c")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'endpoint'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0d665388-8db7-4e97-8cfc-db8bb94c6b4f")
    public String getEndpoint() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.ENDPOINT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("12601a32-ebda-4f2b-b98b-92f3a8b8c68b")
    public String getVersion() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.VERSION_TAGTYPE_ELT);
    }

    @objid ("5179ccb6-c6a7-4e90-b69d-42a47ed28163")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'api'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7f5fef84-970a-4fb2-b3f0-0b8b148e456a")
    public void setApi(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.API_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f6a16280-8ecf-442e-8444-f6c7cbfd2c95")
    public void setDownloadURL(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endpoint'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fdc0b30e-26f2-498b-a9da-32b38ee392e9")
    public void setEndpoint(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.ENDPOINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1b383bb8-c762-48a0-8466-73fd8e92626c")
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

    @objid ("dd73bd08-0877-45a0-8ff4-ea76d1bb62bc")
    protected PaaSConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("7782d259-fea0-4b7d-98db-5a791c033e34")
    public static final class MdaTypes {
        @objid ("515d65f6-3d97-4684-ad4d-21815d47f46c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("247b9328-fb9e-4443-b745-3a09bcb95116")
        public static TagType API_TAGTYPE_ELT;

        @objid ("2d0e4895-cf05-4541-af82-0512562021a6")
        public static TagType VERSION_TAGTYPE_ELT;

        @objid ("b8a5e830-ae8b-463c-9186-08ab3008415e")
        public static TagType ENDPOINT_TAGTYPE_ELT;

        @objid ("053a8222-c981-478a-b3f7-cf5c303c945d")
        public static TagType DOWNLOADURL_TAGTYPE_ELT;

        @objid ("a1d2ffd6-e8d6-471e-8cc7-bed7ba8f8dec")
        private static Stereotype MDAASSOCDEP;

        @objid ("f6277db5-5a36-40e8-9423-62ee6951c5a4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cbac4893-8b35-4495-b115-0811b1f8f7fb")
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
