/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << ScriptConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e807108a-a1a4-47d3-95f5-bf80391e7656")
public class ScriptConfiguration extends Configuration {
    @objid ("ebdfbbf6-33e4-4083-83a0-c888574a5d45")
    public static final String STEREOTYPE_NAME = "ScriptConfiguration";

    @objid ("38cd31eb-8886-4baa-a525-a719dffc8eeb")
    public static final String DEVOPSTOOL_TAGTYPE = "devopsTool";

    @objid ("87ae0b37-1581-4f4a-9e99-e73d48228a3b")
    public static final String IMAGEID_TAGTYPE = "imageId";

    @objid ("63fa1504-dbaf-44cd-b565-2e3bef915e26")
    public static final String OS_TAGTYPE = "os";

    @objid ("b25b5b05-a968-4f8f-af29-1da02d413260")
    public static final String CONFIGURECOMMAND_NOTETYPE = "configureCommand";

    @objid ("b9983db0-cc2f-49dc-9237-05e3e2f9ed0d")
    public static final String DOWNLOADCOMMAND_NOTETYPE = "downloadCommand";

    @objid ("c036f556-3c5a-4310-8967-2e533b60c162")
    public static final String INSTALLCOMMAND_NOTETYPE = "installCommand";

    @objid ("201c30e4-cb23-4411-93fc-e99e165db71f")
    public static final String STARTCOMMAND_NOTETYPE = "startCommand";

    @objid ("77266b26-2889-4749-84a5-555581f5fe5d")
    public static final String STOPCOMMAND_NOTETYPE = "stopCommand";

    @objid ("a4d31d63-179b-4aa1-ab9f-e74352793f6e")
    public static final String UPDATECOMMAND_NOTETYPE = "updateCommand";

    @objid ("0d4bd2a9-f92b-42fe-b671-7f69f1d8529c")
    public static final String UPLOADCOMMAND_NOTETYPE = "uploadCommand";

    /**
     * Tells whether a {@link ScriptConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ScriptConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bf8fb18d-4230-4244-be20-770d4386664b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScriptConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ScriptConfiguration >> then instantiate a {@link ScriptConfiguration} proxy.
     * 
     * @return a {@link ScriptConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("24389f61-dbdd-4067-a7b3-c46d657c6a94")
    public static ScriptConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ScriptConfiguration.STEREOTYPE_NAME);
        return ScriptConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link ScriptConfiguration} proxy from a {@link Artifact} stereotyped << ScriptConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link ScriptConfiguration} proxy or <i>null</i>.
     */
    @objid ("904e3b59-fbe1-4485-9d5c-40a7c7373731")
    public static ScriptConfiguration instantiate(final Artifact obj) {
        return ScriptConfiguration.canInstantiate(obj) ? new ScriptConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ScriptConfiguration} proxy from a {@link Artifact} stereotyped << ScriptConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link ScriptConfiguration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("389857a9-a44c-4952-ab07-debc5bb617e9")
    public static ScriptConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ScriptConfiguration.canInstantiate(obj))
        	return new ScriptConfiguration(obj);
        else
        	throw new IllegalArgumentException("ScriptConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("db06e10e-f15d-4b04-8fd3-fb8ccd0a8174")
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
        ScriptConfiguration other = (ScriptConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for note 'configureCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("1c41a783-cbae-4a91-90a5-ca91b04fe777")
    public String getConfigureCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.CONFIGURECOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for string property 'devopsTool'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("57748ec5-32e4-4b18-ac20-bc12e9a8c4eb")
    public String getDevopsTool() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.DEVOPSTOOL_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'downloadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("7effb6d2-7f28-49dc-be8a-781dc921c9b9")
    public String getDownloadCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.DOWNLOADCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("02071f0b-8f15-47bc-b7cb-9ccc1fce82e0")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("225b8e51-7cbc-47b4-aaf2-7411ee0b732f")
    public String getImageId() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'installCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("d892fb8e-6586-46be-927c-11567c9eaff9")
    public String getInstallCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.INSTALLCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("875877ad-740b-4956-b67c-87fa7e236655")
    public String getOs() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.OS_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'startCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("864ec28c-9122-4aa1-a114-bfea194a0ec6")
    public String getStartCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.STARTCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'stopCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("88ab4116-3c4f-4d90-990f-2e839324497f")
    public String getStopCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.STOPCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'updateCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("5786790c-ed21-4191-9e8e-36c82086f1b7")
    public String getUpdateCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.UPDATECOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'uploadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("38a3a6a5-0583-4af5-ad28-eebb7efa899c")
    public String getUploadCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.UPLOADCOMMAND_NOTETYPE_ELT);
    }

    @objid ("ee8a33cd-7b12-472d-aad3-201ea887d07b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'configureCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("be97d483-038a-42bc-b2b5-2395dba7b61e")
    public void setConfigureCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.CONFIGURECOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'devopsTool'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("32f83755-30df-40e4-b322-7e972ffcb3c6")
    public void setDevopsTool(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.DEVOPSTOOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'downloadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("0e4e9975-79b8-4b2b-b876-a52b31fcc88c")
    public void setDownloadCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.DOWNLOADCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("00ed1ff6-9dd7-46c3-953a-1ed9c31ee75e")
    public void setImageId(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'installCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("81b5b7c5-811b-4f78-ae8f-69811066485e")
    public void setInstallCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.INSTALLCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d88dc7d5-08df-4047-a958-b220687b2450")
    public void setOs(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.OS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'startCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("6a438caf-2090-489e-8084-b16eee62b10d")
    public void setStartCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.STARTCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'stopCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("91bef357-5082-4395-96c7-20ffb6a61b15")
    public void setStopCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.STOPCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'updateCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("e4c91b1c-6ad1-4bae-8506-cbeca870fc54")
    public void setUpdateCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.UPDATECOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'uploadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("05efc836-65e6-45a3-8e87-249e99f6bcd1")
    public void setUploadCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.UPLOADCOMMAND_NOTETYPE_ELT, value);
    }

    @objid ("6ac477ca-5246-4191-ac72-4c2befbb4a98")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("98abbb3d-68f1-4b93-ab33-9771e1b610e2")
    protected ScriptConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("00dd1668-d91f-4281-aae3-7ec4cef1c015")
    public static final class MdaTypes {
        @objid ("074aa113-5175-42e7-84dd-b1875d822f14")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("234a05f6-bb33-4494-ace2-9b73513cfe50")
        public static TagType DEVOPSTOOL_TAGTYPE_ELT;

        @objid ("017eec60-8c4f-47e4-ac22-51555e2c016d")
        public static TagType OS_TAGTYPE_ELT;

        @objid ("f6024536-6b33-47d2-93e8-e2b94e51058c")
        public static TagType IMAGEID_TAGTYPE_ELT;

        @objid ("2b70a05d-ab6e-4913-b19a-168aaf706f78")
        public static NoteType UPLOADCOMMAND_NOTETYPE_ELT;

        @objid ("19cf59b7-d514-4373-aa59-9647ff2a908e")
        public static NoteType INSTALLCOMMAND_NOTETYPE_ELT;

        @objid ("a72372ca-a64e-44ff-999d-249b488c73b4")
        public static NoteType STARTCOMMAND_NOTETYPE_ELT;

        @objid ("4635ff14-2654-4eb1-9a82-8fd113991a23")
        public static NoteType STOPCOMMAND_NOTETYPE_ELT;

        @objid ("67b016f0-a05e-4344-97c0-716144707bc9")
        public static NoteType DOWNLOADCOMMAND_NOTETYPE_ELT;

        @objid ("4a76a566-d505-48a3-8eb8-930f2ff51b79")
        public static NoteType CONFIGURECOMMAND_NOTETYPE_ELT;

        @objid ("7fb01bdb-7ec5-4f71-bda4-9caf4c9e43c3")
        public static NoteType UPDATECOMMAND_NOTETYPE_ELT;

        @objid ("16c122b1-4f0d-40a6-83ea-9539a31c77e3")
        private static Stereotype MDAASSOCDEP;

        @objid ("23ac29cf-880e-4871-bb6e-9ed4a46b314c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("174697dd-a690-4710-ad0a-17fa69e54da0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "451f4ee3-f056-4311-b405-23e7eae6d020");
            DEVOPSTOOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a60944a6-52f0-4a9f-9a40-7d31930f312b");
            OS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "14b18b2b-5fc1-4734-964d-befd9717830a");
            IMAGEID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8b33bb29-84d4-439a-9b16-00e186c50ae5");
            UPLOADCOMMAND_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "1b2eab67-c6b7-4a6b-adef-3911d66d879b");
            INSTALLCOMMAND_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "1910005c-4153-4df7-917e-e963fdc1f729");
            STARTCOMMAND_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "945d0ab8-e3f5-4aab-854d-213c66993c00");
            STOPCOMMAND_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "7ab65049-6e99-414f-8340-ab492bdfbc83");
            DOWNLOADCOMMAND_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "3392b397-0425-4bab-be0f-57fd42e01799");
            CONFIGURECOMMAND_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "25f32468-57fd-4df0-93d7-14cb8a055517");
            UPDATECOMMAND_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "3a9b0e27-e638-4558-ab02-a618fc09199f");
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
