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
import fr.softeam.cameldesigner.api.camelcore.standard.artifact.FeatureArtifact;
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
 * Proxy class to handle a {@link Artifact} with << BuildConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("31fa8681-d65e-4083-b411-1e6026f8e582")
public class BuildConfiguration extends FeatureArtifact {
    @objid ("60afe3bb-3039-4768-a83d-47d12757e957")
    public static final String STEREOTYPE_NAME = "BuildConfiguration";

    @objid ("dcc463c1-cffe-497f-a249-6591e5a22b47")
    public static final String ARTIFACTID_TAGTYPE = "artifactId";

    @objid ("25111386-9751-4d21-80b5-91ffcdc9cef3")
    public static final String BUILDFRAMEWORK_TAGTYPE = "buildFramework";

    @objid ("83cf2f4b-9d43-4278-867d-ee72ede582b9")
    public static final String EXCLUDE_TAGTYPE = "exclude";

    @objid ("608f77e0-f8ef-4e65-9a73-0b7f120fbcef")
    public static final String INCLUDE_TAGTYPE = "include";

    @objid ("c1010909-1c53-43ec-92bb-7be69b826a8f")
    public static final String SOURCECODEURL_TAGTYPE = "sourceCodeURL";

    /**
     * Tells whether a {@link BuildConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << BuildConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8c50e0f0-9cc4-48c7-9953-43e521113e43")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BuildConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << BuildConfiguration >> then instantiate a {@link BuildConfiguration} proxy.
     * 
     * @return a {@link BuildConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("d115fd0c-c7d7-4154-9725-dae9110317ca")
    public static BuildConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, BuildConfiguration.STEREOTYPE_NAME);
        return BuildConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link BuildConfiguration} proxy from a {@link Artifact} stereotyped << BuildConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link BuildConfiguration} proxy or <i>null</i>.
     */
    @objid ("679182ce-e285-4f38-8d75-aabb4f6af79f")
    public static BuildConfiguration instantiate(final Artifact obj) {
        return BuildConfiguration.canInstantiate(obj) ? new BuildConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BuildConfiguration} proxy from a {@link Artifact} stereotyped << BuildConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link BuildConfiguration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a2ccd999-4420-42cf-8655-99ab86eca2c3")
    public static BuildConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (BuildConfiguration.canInstantiate(obj))
        	return new BuildConfiguration(obj);
        else
        	throw new IllegalArgumentException("BuildConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b7faaf65-d755-497c-be4d-edc111f9def1")
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
        BuildConfiguration other = (BuildConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'artifactId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("169d5335-b229-4897-b766-91812d00f4ae")
    public String getArtifactId() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.ARTIFACTID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'buildFramework'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6ea7efd4-1813-4766-adf2-e42056d753aa")
    public String getBuildFramework() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.BUILDFRAMEWORK_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("12066275-1ff9-4f85-8356-397fdaf51d01")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2558920d-6777-470a-92b3-bc5baf6f4af7")
    public String getExclude() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.EXCLUDE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("78cb8448-ea43-4019-bdab-c9639afbe4e3")
    public String getInclude() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.INCLUDE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'sourceCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("70b496d7-838c-4f56-a7f6-3971208f6c01")
    public String getSourceCodeURL() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.SOURCECODEURL_TAGTYPE_ELT);
    }

    @objid ("e7251113-8edf-4d66-a467-4d43ece76f62")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'artifactId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fed9485f-11c8-4a51-a42e-1cc89be8b8cc")
    public void setArtifactId(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.ARTIFACTID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'buildFramework'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("89e24ee1-4f1b-4524-b747-0e6c639d3fc7")
    public void setBuildFramework(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.BUILDFRAMEWORK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c79f94a7-5261-4706-b737-c056a9813810")
    public void setExclude(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.EXCLUDE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("66f620a1-4796-4d82-8869-61bf83d9ad64")
    public void setInclude(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.INCLUDE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'sourceCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9f208d82-eae6-49fa-8e22-5700cd3228a3")
    public void setSourceCodeURL(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.SOURCECODEURL_TAGTYPE_ELT, value);
    }

    @objid ("b672896b-3227-4356-9987-a4da9e0a7dde")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("67ecba18-922a-4665-9c55-c16abbb9addb")
    protected BuildConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("5c80b392-068d-47de-a15f-f92421a05377")
    public static final class MdaTypes {
        @objid ("f37347e7-d284-4eab-ba5f-3481a075a444")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("16409910-c732-4c9e-be8b-8c4d4c2617f2")
        public static TagType ARTIFACTID_TAGTYPE_ELT;

        @objid ("5387831e-1f92-458f-8b61-46b118f85b34")
        public static TagType BUILDFRAMEWORK_TAGTYPE_ELT;

        @objid ("fc71e8c0-c61f-49de-8545-188b4ef5b445")
        public static TagType SOURCECODEURL_TAGTYPE_ELT;

        @objid ("f57df706-10c6-4534-a358-679b01087d38")
        public static TagType INCLUDE_TAGTYPE_ELT;

        @objid ("a9c1a683-cce4-40ad-81c2-58796b3239e5")
        public static TagType EXCLUDE_TAGTYPE_ELT;

        @objid ("3de82aae-c732-4e67-9d09-0c82c9beccfc")
        private static Stereotype MDAASSOCDEP;

        @objid ("c2e641e7-9176-4c9e-b520-1cdbdc35d268")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7428df18-3367-40d6-9891-5f73ab9e5299")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "72bbf7a5-04d3-40d1-8b20-3489ec93b45a");
            ARTIFACTID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "95dcdeef-f3a8-4b72-8658-7469cc386bd1");
            BUILDFRAMEWORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a7f87bab-5a8f-4554-a8c7-ce21e172ce96");
            SOURCECODEURL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8bf57c83-b62d-4d66-b368-95557d32e7d8");
            INCLUDE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97e74456-ac43-4bcf-9226-fbd06b5aaf8b");
            EXCLUDE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3625030-f18b-4e0d-a94f-238b134a7f67");
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
