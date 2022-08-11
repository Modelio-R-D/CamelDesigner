/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("ff3b6f00-4fa6-4a97-891d-857738662a7f")
    public static final String STEREOTYPE_NAME = "BuildConfiguration";

    @objid ("6a345de7-c571-458a-be24-c9eeff405378")
    public static final String ARTIFACTID_TAGTYPE = "artifactId";

    @objid ("d5eba39f-c5c8-4ec8-84b8-fc57bc48eced")
    public static final String BUILDFRAMEWORK_TAGTYPE = "buildFramework";

    @objid ("dc4f890e-6862-4ee1-9d09-68c3391840b1")
    public static final String EXCLUDE_TAGTYPE = "exclude";

    @objid ("d4e2006b-febd-4443-bd79-079cc881ce51")
    public static final String INCLUDE_TAGTYPE = "include";

    @objid ("b8c5386e-95ee-4661-ae74-35d2bf67bcaa")
    public static final String SOURCECODEURL_TAGTYPE = "sourceCodeURL";

    /**
     * Tells whether a {@link BuildConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << BuildConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ad40d1f3-2bd5-476c-8f1d-da19ff5d9121")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BuildConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << BuildConfiguration >> then instantiate a {@link BuildConfiguration} proxy.
     * 
     * @return a {@link BuildConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("b3c683c6-d660-466d-ab90-ce6f8b8acd91")
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
    @objid ("373f4a95-e065-40be-83d3-dcdeb4ea2cf9")
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
    @objid ("92f443ac-c2a3-447d-91b8-a83fe68de17c")
    public static BuildConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (BuildConfiguration.canInstantiate(obj))
            return new BuildConfiguration(obj);
        else
            throw new IllegalArgumentException("BuildConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6a865aef-1af4-497f-9a2a-23cf1901e466")
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
    @objid ("fad44bf1-c835-4630-a7d7-a4f7a41f7927")
    public String getArtifactId() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.ARTIFACTID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'buildFramework'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("85ba7d49-f6c8-49a7-a1bf-910f9f44e42c")
    public String getBuildFramework() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.BUILDFRAMEWORK_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}.
     * 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("9b23f817-a6c7-4073-a852-d03624ed4759")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("43c1d176-1b71-4e0b-b555-b6569abdb598")
    public String getExclude() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.EXCLUDE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d1467fe2-02a9-4347-9fe7-691994b0748e")
    public String getInclude() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.INCLUDE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'sourceCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cfa5e020-4c32-4cce-acd1-55ec195431b6")
    public String getSourceCodeURL() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.SOURCECODEURL_TAGTYPE_ELT);
    }

    @objid ("dce1e4c8-4bc9-485d-9b12-14432664cac0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'artifactId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c5bec907-deab-421c-9294-324969ac1fbe")
    public void setArtifactId(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.ARTIFACTID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'buildFramework'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ae2e59d7-f8b2-41b2-9d0d-9f071262656a")
    public void setBuildFramework(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.BUILDFRAMEWORK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("26235b4f-1036-43c1-a0c3-ac0ce446b59c")
    public void setExclude(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.EXCLUDE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("65a7d3c8-feb2-4f10-a906-d535c3407d5d")
    public void setInclude(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.INCLUDE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'sourceCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c1447542-1419-4f28-a60a-d445a3a06a54")
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

    @objid ("29b738c0-b529-4e03-a5bf-060cbe4a104b")
    protected BuildConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("5c80b392-068d-47de-a15f-f92421a05377")
    public static final class MdaTypes {
        @objid ("f2cd7ac4-a9a6-4549-a955-69fc360caa99")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("08c9a198-9654-4932-af3b-df7653f22401")
        public static TagType ARTIFACTID_TAGTYPE_ELT;

        @objid ("6a70aed4-943f-4e0e-9279-4b014e42894b")
        public static TagType BUILDFRAMEWORK_TAGTYPE_ELT;

        @objid ("9f31aa43-96c2-4581-9647-e78e08b55302")
        public static TagType SOURCECODEURL_TAGTYPE_ELT;

        @objid ("daa38a15-436a-4f00-bb8c-f8ec50051d22")
        public static TagType INCLUDE_TAGTYPE_ELT;

        @objid ("51d4ff8c-705c-43f3-8b13-1235876985f5")
        public static TagType EXCLUDE_TAGTYPE_ELT;

        @objid ("70a1e7e4-d439-414a-a120-9dbbbe0694d9")
        private static Stereotype MDAASSOCDEP;

        @objid ("0e70fa55-3378-443e-8a06-97c54dc4ed87")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1a7317e0-9c04-47e8-aeb1-c0ab03a5f179")
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
