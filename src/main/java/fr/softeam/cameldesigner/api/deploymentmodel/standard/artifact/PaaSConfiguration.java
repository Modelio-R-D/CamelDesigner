/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

import java.util.ArrayList;
import java.util.List;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

/**
 * Proxy class to handle a {@link Artifact} with << PaaSConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class PaaSConfiguration extends Configuration {
    public static final String STEREOTYPE_NAME = "PaaSConfiguration";

    public static final String API_TAGTYPE = "api";

    public static final String DOWNLOADURL_TAGTYPE = "downloadURL";

    public static final String ENDPOINT_TAGTYPE = "endpoint";

    public static final String VERSION_TAGTYPE = "version";

    /**
     * Tells whether a {@link PaaSConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << PaaSConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     *
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << PaaSConfiguration >> then instantiate a {@link PaaSConfiguration} proxy.
     *
     * @return a {@link PaaSConfiguration} proxy on the created {@link Artifact}.
     */
    public static PaaSConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaSConfiguration.STEREOTYPE_NAME);
        return PaaSConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link PaaSConfiguration} proxy from a {@link Artifact} stereotyped << PaaSConfiguration >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     *
     * @param obj a Artifact
     * @return a {@link PaaSConfiguration} proxy or <i>null</i>.
     */
    public static PaaSConfiguration instantiate(final Artifact obj) {
        return PaaSConfiguration.canInstantiate(obj) ? new PaaSConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaSConfiguration} proxy from a {@link Artifact} stereotyped << PaaSConfiguration >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     *
     * @param obj a {@link Artifact}
     * @return a {@link PaaSConfiguration} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static PaaSConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (PaaSConfiguration.canInstantiate(obj))
            return new PaaSConfiguration(obj);
        else
            throw new IllegalArgumentException("PaaSConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public String getApi() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.API_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getDownloadURL() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}.
     *
     * @return the Artifact represented by this proxy, never null.
     */
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'endpoint'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getEndpoint() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.ENDPOINT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getVersion() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.VERSION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'api'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setApi(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.API_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setDownloadURL(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endpoint'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setEndpoint(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.ENDPOINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setVersion(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.VERSION_TAGTYPE_ELT, value);
    }

    protected PaaSConfiguration(final Artifact elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType API_TAGTYPE_ELT;

        public static TagType VERSION_TAGTYPE_ELT;

        public static TagType ENDPOINT_TAGTYPE_ELT;

        public static TagType DOWNLOADURL_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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

    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

}
