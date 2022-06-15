/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("cce821ae-a9d6-4df9-a2ed-9e1ae1781fef")
    public static final String STEREOTYPE_NAME = "BuildConfiguration";

    @objid ("eec8e331-18b7-44d8-bf34-b73e8ea58454")
    public static final String ARTIFACTID_TAGTYPE = "artifactId";

    @objid ("8a716aba-f08f-4861-aa7f-9086bd852c2f")
    public static final String BUILDFRAMEWORK_TAGTYPE = "buildFramework";

    @objid ("cbcf3bc7-4a2d-423f-9c4a-92cc96b28a03")
    public static final String EXCLUDE_TAGTYPE = "exclude";

    @objid ("5838cdd5-dc02-4d80-9539-b0137f0bbbd1")
    public static final String INCLUDE_TAGTYPE = "include";

    @objid ("d1eb7560-5549-4111-a8c3-d794cbe3b6b3")
    public static final String SOURCECODEURL_TAGTYPE = "sourceCodeURL";

    /**
     * Tells whether a {@link BuildConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << BuildConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f1c98990-4ab8-4536-9831-dd50e1509384")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BuildConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << BuildConfiguration >> then instantiate a {@link BuildConfiguration} proxy.
     * 
     * @return a {@link BuildConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("f9764d26-31bc-47b0-992e-07dd419158bb")
    public static BuildConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, BuildConfiguration.STEREOTYPE_NAME);
        return BuildConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link BuildConfiguration} proxy from a {@link Artifact} stereotyped << BuildConfiguration >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Artifact
     * @return a {@link BuildConfiguration} proxy or <i>null</i>.
     */
    @objid ("ef2bb6c5-496a-4708-9405-ab842e7468dd")
    public static BuildConfiguration instantiate(final Artifact obj) {
        return BuildConfiguration.canInstantiate(obj) ? new BuildConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BuildConfiguration} proxy from a {@link Artifact} stereotyped << BuildConfiguration >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Artifact}
     * @return a {@link BuildConfiguration} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("24ea4e6e-10b0-433b-a776-290fa1714a1b")
    public static BuildConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (BuildConfiguration.canInstantiate(obj))
            return new BuildConfiguration(obj);
        else
            throw new IllegalArgumentException("BuildConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d6287b6f-d1a9-4df2-8975-6c4646eb662a")
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
    @objid ("2d0997fe-997e-4e10-aebe-7e01c9b01ea0")
    public String getArtifactId() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.ARTIFACTID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'buildFramework'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a4ac1dce-6c0d-4f10-88d4-8c3018d64e68")
    public String getBuildFramework() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.BUILDFRAMEWORK_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}.
     * 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("f3cf6948-3ed7-4e5b-84a5-1c79d9a84812")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("93dd7bdc-7479-4f88-a6b7-d9b948af0aa3")
    public String getExclude() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.EXCLUDE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5feeec53-95b3-425f-95a8-af22e19ff872")
    public String getInclude() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.INCLUDE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'sourceCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4537c7ab-eee4-41b8-b8f2-fc97742e160d")
    public String getSourceCodeURL() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.SOURCECODEURL_TAGTYPE_ELT);
    }

    @objid ("68b116cf-c33f-4c89-b944-c64d6d4328db")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'artifactId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7d00ff55-cd1d-4439-9fe0-2a8c3f541870")
    public void setArtifactId(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.ARTIFACTID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'buildFramework'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0bea7d02-85bc-4354-a463-781e8bcb305e")
    public void setBuildFramework(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.BUILDFRAMEWORK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("57af9f0c-1b70-4fc2-94f7-ff037e79adb2")
    public void setExclude(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.EXCLUDE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3e5a0c3a-d0fe-49a4-bbd6-cbfd7d665272")
    public void setInclude(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.INCLUDE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'sourceCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3d7069cf-4267-4be2-afc6-d4f1a9721806")
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

    @objid ("6aa55067-887b-4f1d-a053-c4e050ca82d8")
    protected BuildConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("5c80b392-068d-47de-a15f-f92421a05377")
    public static final class MdaTypes {
        @objid ("1840be94-81eb-489e-b2ab-d6726bb08178")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("97417f9d-f224-4361-b4d6-d3bb1f394443")
        public static TagType ARTIFACTID_TAGTYPE_ELT;

        @objid ("4a55fd43-e2e6-4f65-bf9d-d340d92d7e91")
        public static TagType BUILDFRAMEWORK_TAGTYPE_ELT;

        @objid ("c4f3777b-5636-481d-acba-d0ab39a6b610")
        public static TagType SOURCECODEURL_TAGTYPE_ELT;

        @objid ("fb7008f2-72c2-462e-9d0b-76e0d3e1968d")
        public static TagType INCLUDE_TAGTYPE_ELT;

        @objid ("f6423603-80ca-4715-b24e-78ba942f3c31")
        public static TagType EXCLUDE_TAGTYPE_ELT;

        @objid ("5306d06c-89f3-4d77-a856-aeecde333be2")
        private static Stereotype MDAASSOCDEP;

        @objid ("deaf83c0-87b2-4221-baff-77b8ae2d90eb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7c01dd56-270b-4c38-a4fc-ce52b357a03c")
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
