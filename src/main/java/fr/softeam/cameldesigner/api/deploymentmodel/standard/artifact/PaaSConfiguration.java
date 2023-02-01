/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("38b666ba-e49e-48cd-8341-8df615d263f6")
    public static final String STEREOTYPE_NAME = "PaaSConfiguration";

    @objid ("5634297f-5f9e-4e10-a364-446b92fc0a6b")
    public static final String API_TAGTYPE = "api";

    @objid ("4ad840f3-4864-47d5-adc1-db7ad584d7d1")
    public static final String DOWNLOADURL_TAGTYPE = "downloadURL";

    @objid ("c5f03cb6-c24f-47b8-9ac6-d281f93d5e1a")
    public static final String ENDPOINT_TAGTYPE = "endpoint";

    @objid ("8ac02b26-dad7-4e08-b1cd-4d4287d06896")
=======
    @objid ("65cac2d6-cbc7-4cf6-87b7-82c07069e715")
    public static final String STEREOTYPE_NAME = "PaaSConfiguration";

    @objid ("aefd1a84-86f7-4860-a7af-32d15ce822f9")
    public static final String API_TAGTYPE = "api";

    @objid ("e96cf02c-eb17-4f5e-8bc2-b424ce21b410")
    public static final String DOWNLOADURL_TAGTYPE = "downloadURL";

    @objid ("4ffdf5c3-6e1a-4e22-afbd-7ca9c8cf53ec")
    public static final String ENDPOINT_TAGTYPE = "endpoint";

    @objid ("f8c82717-a0fb-41c1-8b18-991bd049acf4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String VERSION_TAGTYPE = "version";

    /**
     * Tells whether a {@link PaaSConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << PaaSConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("8ff2d5b1-370d-4fdb-87c1-df4c7022da46")
=======
    @objid ("981b2d10-843d-4a25-9946-1073b47dfb64")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << PaaSConfiguration >> then instantiate a {@link PaaSConfiguration} proxy.
     * 
     * @return a {@link PaaSConfiguration} proxy on the created {@link Artifact}.
     */
<<<<<<< HEAD
    @objid ("22baef20-890e-4cc4-bd49-f19ecf2c037a")
=======
    @objid ("2066582e-44d2-4e04-b943-2ea4d014c550")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("296af10c-94f4-41a8-9c15-9eab4eaf5cbc")
=======
    @objid ("15fd8b37-da31-4d8c-b8d1-afae0e6eaa42")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b7782826-cac9-45e8-bc8b-8a320f67ecbc")
=======
    @objid ("76c52c07-f44a-4821-a12d-63362ce6cba2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PaaSConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (PaaSConfiguration.canInstantiate(obj))
        	return new PaaSConfiguration(obj);
        else
        	throw new IllegalArgumentException("PaaSConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("ebaea2cf-f2cf-4035-a4e9-de76ff8dc041")
=======
    @objid ("eec104be-5665-48c1-9db3-210211cb367a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("cb68044d-7355-451a-a29a-61568d3a64e1")
=======
    @objid ("3abf9691-c5f5-4843-b064-a22337f71aff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getApi() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.API_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("5db6136b-5be9-4a42-bf87-ec7c01ff0954")
=======
    @objid ("065ec5c4-339b-4842-9204-e81e8a1fb1be")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getDownloadURL() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("9f83bfec-6b22-4f3b-8317-0c1f9d60d97f")
=======
    @objid ("a58d673e-6e99-4f39-b482-ce49d5cca43c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'endpoint'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("cd5599c2-9edd-46e5-b465-db0f0dd2fd47")
=======
    @objid ("4f652dc3-dc3c-4a3e-bfca-0c0f4060f9b4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getEndpoint() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.ENDPOINT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("529a68d1-bc0e-4d3a-a0e3-a7d043ef5470")
=======
    @objid ("3385bf2e-e2ac-44f0-956b-9c0ec9e9a96a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getVersion() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.VERSION_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("b0a135d7-08a5-4973-b138-269b106f3b40")
=======
    @objid ("52619138-8e11-4b69-89a8-ff6fbec0dad9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'api'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("c8f5b6db-4549-4b9d-97ee-bf59e9ec673c")
=======
    @objid ("44c3bc0d-5264-4e05-b33c-54d1d5a06149")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setApi(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.API_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("a3aa9dde-98f5-4255-a0db-33d3cc733533")
=======
    @objid ("33bc0643-e3ed-4ecc-bc1e-9a7f1379f617")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setDownloadURL(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endpoint'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("5a82ce84-88cf-466e-9a84-d647cc1961ae")
=======
    @objid ("bdae8626-c395-4b18-9d44-d57aef1152f7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setEndpoint(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.ENDPOINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("ade0106d-369e-44d4-bc51-de55090d3658")
=======
    @objid ("24bf95ec-c366-43fd-b102-e33de326bcce")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("57a03aea-117f-45df-949b-d089ccb0f0d6")
=======
    @objid ("b20931bd-5b0f-4d85-b3dc-7462df80892a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected PaaSConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("7782d259-fea0-4b7d-98db-5a791c033e34")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("1a812725-a2d2-4ae7-a1a1-ff3f5194ac94")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ac8f14d5-706b-4fef-9637-0e2d29533996")
        public static TagType API_TAGTYPE_ELT;

        @objid ("b37bc8ac-3290-4fa6-84af-6ff860f30664")
        public static TagType VERSION_TAGTYPE_ELT;

        @objid ("1871b74b-eb2e-402f-9285-8177e849a5fb")
        public static TagType ENDPOINT_TAGTYPE_ELT;

        @objid ("7bfec417-b49e-411c-8b8a-10441b3b742d")
        public static TagType DOWNLOADURL_TAGTYPE_ELT;

        @objid ("7bf782f6-61eb-4eca-9bbb-81a766979f20")
        private static Stereotype MDAASSOCDEP;

        @objid ("9d6e6e5c-b84a-4e83-bf4c-90dcb754d0bd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("72fc842a-7b37-449c-b109-cb36eae08e7c")
=======
        @objid ("773c7180-47b8-4824-827d-0deff5726731")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("13a9ec03-b8cc-42de-97f0-7f3f013e3f1d")
        public static TagType API_TAGTYPE_ELT;

        @objid ("aacb6334-6606-4fbc-9497-62874a7d577a")
        public static TagType VERSION_TAGTYPE_ELT;

        @objid ("4d39bc8e-9537-4271-afa8-11424e36d748")
        public static TagType ENDPOINT_TAGTYPE_ELT;

        @objid ("46356e39-cb96-42bb-9bb6-25bd97e2b8be")
        public static TagType DOWNLOADURL_TAGTYPE_ELT;

        @objid ("20d39155-c081-47c7-8e70-4834954e6948")
        private static Stereotype MDAASSOCDEP;

        @objid ("c9efa1d3-7c17-4640-8108-e9a530c00b8b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("31ca5315-eda6-40c1-900d-d1d0a070d2a3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
