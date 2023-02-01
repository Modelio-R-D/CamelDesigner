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
<<<<<<< HEAD
    @objid ("3fece705-46a9-4ef0-a60e-39b0bf26b703")
    public static final String STEREOTYPE_NAME = "BuildConfiguration";

    @objid ("6e1fd371-4539-4897-9650-863f068f0705")
    public static final String ARTIFACTID_TAGTYPE = "artifactId";

    @objid ("85d44150-2de0-4bee-b03a-8d47b63282fa")
    public static final String BUILDFRAMEWORK_TAGTYPE = "buildFramework";

    @objid ("a351941d-7981-413d-bae0-5ad16e2f509e")
    public static final String EXCLUDE_TAGTYPE = "exclude";

    @objid ("c3978d00-7ca7-42b6-83e3-a8f9748684cb")
    public static final String INCLUDE_TAGTYPE = "include";

    @objid ("884cc604-53f2-4a93-96e9-5b4fde4cef8e")
=======
    @objid ("9971c1fa-6cfd-4a3e-b876-47603c468c81")
    public static final String STEREOTYPE_NAME = "BuildConfiguration";

    @objid ("ecedb2f5-e270-4a1d-baa5-386ed46c8974")
    public static final String ARTIFACTID_TAGTYPE = "artifactId";

    @objid ("ff1e63d8-5250-410b-9f8d-2a05c6f7a3c5")
    public static final String BUILDFRAMEWORK_TAGTYPE = "buildFramework";

    @objid ("141a80f3-a514-4744-a7e6-0207ac4624e1")
    public static final String EXCLUDE_TAGTYPE = "exclude";

    @objid ("90737dd9-0624-472d-b4e1-b422da317e40")
    public static final String INCLUDE_TAGTYPE = "include";

    @objid ("24d70292-f04c-4395-a9ed-e71ea993298d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String SOURCECODEURL_TAGTYPE = "sourceCodeURL";

    /**
     * Tells whether a {@link BuildConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << BuildConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("c340da40-5fc2-4eb1-bb1c-cc8150a44324")
=======
    @objid ("2cdb6223-887f-4bef-aaef-4c20313448b3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BuildConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << BuildConfiguration >> then instantiate a {@link BuildConfiguration} proxy.
     * 
     * @return a {@link BuildConfiguration} proxy on the created {@link Artifact}.
     */
<<<<<<< HEAD
    @objid ("a4f9b014-8c7a-4cf2-a1da-8865142f4b92")
=======
    @objid ("f67f2ace-1684-48f8-b702-950159ab0881")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ed79c9d8-9174-4303-b553-eb2908315228")
=======
    @objid ("0886dab2-a351-4c50-86e0-34570ca1c4ab")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5da2b00e-64c8-4568-b57b-e589d4d8a1f2")
=======
    @objid ("7e11a719-788e-4ac4-bb09-1376d3550421")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static BuildConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (BuildConfiguration.canInstantiate(obj))
        	return new BuildConfiguration(obj);
        else
        	throw new IllegalArgumentException("BuildConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("93dfb6e3-d54b-4457-a039-36a110a4e064")
=======
    @objid ("2a4c498a-172d-492e-9e6c-52d46812779d")
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
        BuildConfiguration other = (BuildConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'artifactId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("97c5318e-f5ea-4371-a209-b4bcf3c83a42")
=======
    @objid ("3d6b0df5-48fb-499c-a4d8-279ef46dd439")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getArtifactId() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.ARTIFACTID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'buildFramework'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("fbe7be71-f007-4047-976c-6bdd1a291360")
=======
    @objid ("5dade94f-f8cf-4a77-b3e4-7b3c003de576")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getBuildFramework() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.BUILDFRAMEWORK_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("0424dea7-bd9a-486d-9f01-d7722d52817e")
=======
    @objid ("149e0210-9d24-4d13-bf1c-a2ec7051f077")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("4555f939-e3d8-4e7c-b1e3-ce792e1b8687")
=======
    @objid ("1a907425-2176-4c75-9417-e1ca9b4045f8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getExclude() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.EXCLUDE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("de6c7979-4692-477a-a180-3ae1fa5c322e")
=======
    @objid ("c3854e7b-cc5d-4825-bdc9-d85423332fc0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getInclude() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.INCLUDE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'sourceCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("aa2dc55c-1cda-4fb0-9070-7954adc50a32")
=======
    @objid ("5105a4a6-9c82-4810-b4e2-50884608421b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getSourceCodeURL() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.SOURCECODEURL_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("b27ecc22-a66a-453f-bf8f-ccd29f9d7c0a")
=======
    @objid ("e531f3e1-e1b6-487d-8ed7-f6e0b3eda4f6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'artifactId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("07628091-ec0d-4c7d-9791-320fcf847b01")
=======
    @objid ("ce265b0c-2621-499b-ab3c-bd0c8a37283a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setArtifactId(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.ARTIFACTID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'buildFramework'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("fa1bc09a-369e-4954-957e-1e33d5551460")
=======
    @objid ("aab53816-6ce9-474b-b2cb-a467e33250ff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setBuildFramework(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.BUILDFRAMEWORK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("63795f6c-050c-4bef-95cd-4abd8f8e7f36")
=======
    @objid ("2ae33583-db97-4c58-b32d-a9507f4c346b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setExclude(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.EXCLUDE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("8d24bff3-4ba5-4d59-b337-9592cf2af64c")
=======
    @objid ("0d1fc43a-42af-41b7-8b68-6703c694f04d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setInclude(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.INCLUDE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'sourceCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("84dd7a7a-72d3-40e4-9202-2d14ebdaf73a")
=======
    @objid ("1c49e3f7-7145-406b-9d63-c975f0fd816a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("a984898b-433f-4fac-9feb-e6f5c1eb3dfb")
=======
    @objid ("c47a886c-20a5-422a-a8f4-75570ea64a72")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected BuildConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("5c80b392-068d-47de-a15f-f92421a05377")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("9f2ed065-8cf3-473c-9b96-a93b4e615944")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5055ff44-ff11-4417-bf78-ef2bfd724691")
        public static TagType ARTIFACTID_TAGTYPE_ELT;

        @objid ("36b94a83-25d2-486f-94e5-899f779131c2")
        public static TagType BUILDFRAMEWORK_TAGTYPE_ELT;

        @objid ("00e76def-62cb-4515-aa7e-dae546215301")
        public static TagType SOURCECODEURL_TAGTYPE_ELT;

        @objid ("076865ad-b0b4-4502-90bb-c702fc6f4fae")
        public static TagType INCLUDE_TAGTYPE_ELT;

        @objid ("d83939fd-4835-4a58-b811-2d13c9c217bb")
        public static TagType EXCLUDE_TAGTYPE_ELT;

        @objid ("d3bbf458-d134-4128-9581-2529019d7e2f")
        private static Stereotype MDAASSOCDEP;

        @objid ("6f253e03-e7de-45a7-92ac-cad3cf898399")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("736d7e5b-0608-4b33-a409-def266b827c9")
=======
        @objid ("fdc5c969-9d6f-467b-9289-8158bbc53eac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d51d4eb3-53fa-48f8-a24a-f6d6148ad6ee")
        public static TagType ARTIFACTID_TAGTYPE_ELT;

        @objid ("f3cc560e-426d-4335-a325-cbabb1f84d24")
        public static TagType BUILDFRAMEWORK_TAGTYPE_ELT;

        @objid ("3c17935e-5666-4a8c-980e-c3e962be352b")
        public static TagType SOURCECODEURL_TAGTYPE_ELT;

        @objid ("895ec43c-0311-481f-a068-119d05050dd8")
        public static TagType INCLUDE_TAGTYPE_ELT;

        @objid ("f4bba64d-b287-409c-b68e-1df7eed697a0")
        public static TagType EXCLUDE_TAGTYPE_ELT;

        @objid ("63ad6625-ffee-44ee-97a3-58288a4bc100")
        private static Stereotype MDAASSOCDEP;

        @objid ("1581c431-6e16-44ca-ba22-2f0d373bd9f9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1a0f395a-ce37-4425-b124-ce5366312535")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
