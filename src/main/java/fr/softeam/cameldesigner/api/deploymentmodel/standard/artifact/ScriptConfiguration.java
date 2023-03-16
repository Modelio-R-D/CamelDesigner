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
    @objid ("7289d3e7-76ed-478a-bf9a-2c3e3b436ccd")
    public static final String STEREOTYPE_NAME = "ScriptConfiguration";

    @objid ("e0fae529-956e-4f10-aada-fb15d51948c4")
    public static final String DEVOPSTOOL_TAGTYPE = "devopsTool";

    @objid ("b2ef8d75-0b3e-4ca7-88fa-1c42dcda2312")
    public static final String IMAGEID_TAGTYPE = "imageId";

    @objid ("375b7087-8132-4ed2-90ab-d26e30d847f9")
    public static final String OS_TAGTYPE = "os";

    @objid ("85e716c3-afe2-4316-af09-5233e438c7ee")
    public static final String CONFIGURECOMMAND_NOTETYPE = "configureCommand";

    @objid ("98a493f6-74ff-4743-872a-9c8b19fc58f0")
    public static final String DOWNLOADCOMMAND_NOTETYPE = "downloadCommand";

    @objid ("a7c8d5cf-3220-4014-ad9f-8eb129a75d36")
    public static final String INSTALLCOMMAND_NOTETYPE = "installCommand";

    @objid ("80c6f109-a43e-4b7d-a139-bf2610cb2389")
    public static final String STARTCOMMAND_NOTETYPE = "startCommand";

    @objid ("30bfd5b7-b2d8-4215-b1fd-5a850139c1dc")
    public static final String STOPCOMMAND_NOTETYPE = "stopCommand";

    @objid ("93ea3614-13a7-4d81-8972-4d13f07ab11e")
    public static final String UPDATECOMMAND_NOTETYPE = "updateCommand";

    @objid ("aa6e5e4c-87d8-4736-afc5-f7557403a846")
    public static final String UPLOADCOMMAND_NOTETYPE = "uploadCommand";

    /**
     * Tells whether a {@link ScriptConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ScriptConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("78830038-5168-4816-87f2-309597c72859")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScriptConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ScriptConfiguration >> then instantiate a {@link ScriptConfiguration} proxy.
     * 
     * @return a {@link ScriptConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("e82a295e-a1a8-47fd-aded-3d8b0aa10af8")
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
    @objid ("c5a39eaa-68c9-4eb6-924c-b6fc8e43fa5d")
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
    @objid ("0b16e48b-e23f-46f0-98fc-ed92026c9d86")
    public static ScriptConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ScriptConfiguration.canInstantiate(obj))
        	return new ScriptConfiguration(obj);
        else
        	throw new IllegalArgumentException("ScriptConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5f33c193-c9b4-4029-9c09-6c9dced72216")
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
    @objid ("8cdb6034-d610-4df2-94bd-f696bdabbc0a")
    public String getConfigureCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.CONFIGURECOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for string property 'devopsTool'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0c65ed3b-8829-4346-be94-d41eed1f8f0b")
    public String getDevopsTool() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.DEVOPSTOOL_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'downloadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("663f9b8d-6f4d-470d-b62c-95b2e97b6d63")
    public String getDownloadCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.DOWNLOADCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("71c3939a-4f01-484d-9020-bfad37caffe3")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0a3d4941-f625-4796-90a8-28d9428b6e33")
    public String getImageId() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'installCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("e8cb609d-a85b-49c2-a276-f826ebc71a5e")
    public String getInstallCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.INSTALLCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c0750961-ce4b-4dca-8caa-be58c72dab28")
    public String getOs() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.OS_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'startCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("fef68840-5c1e-419e-ade9-ae33fc922868")
    public String getStartCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.STARTCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'stopCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("32ff7365-0e2a-45a3-9774-7ed482ebfa9a")
    public String getStopCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.STOPCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'updateCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("a9764cc6-a27a-4d9b-a4fe-9635b8455067")
    public String getUpdateCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.UPDATECOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'uploadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("5f4e2f32-5ecd-4dd3-a387-ed47b26af657")
    public String getUploadCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.UPLOADCOMMAND_NOTETYPE_ELT);
    }

    @objid ("fda20b48-dd76-40fe-b6ac-4c86ed10fca3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'configureCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("873c07b4-ded9-4ab9-844b-8ff0af551226")
    public void setConfigureCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.CONFIGURECOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'devopsTool'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("239acae3-d87c-42a7-b119-bb02e5df3473")
    public void setDevopsTool(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.DEVOPSTOOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'downloadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("4948be7e-2b29-4493-8d6c-6b7539d5b05e")
    public void setDownloadCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.DOWNLOADCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5b11de42-3df9-4eb7-aba1-fc29603e6fab")
    public void setImageId(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'installCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("9e08928f-c932-4fd7-97fd-578c9e345e42")
    public void setInstallCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.INSTALLCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c0cd2277-119d-4178-bb9e-6f83f212a97d")
    public void setOs(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.OS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'startCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("5cb17e89-8bc6-4a0b-b461-3caa2bd0e179")
    public void setStartCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.STARTCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'stopCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("d693c5fb-5f82-4cce-b8d0-874ef9bc7a7d")
    public void setStopCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.STOPCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'updateCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("c490dee5-e1e4-4456-b1c9-f5226fc50339")
    public void setUpdateCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.UPDATECOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'uploadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("65a73c59-7542-4746-bc81-a554e97b028d")
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

    @objid ("92f962f4-1a47-4819-a802-985817988427")
    protected ScriptConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("00dd1668-d91f-4281-aae3-7ec4cef1c015")
    public static final class MdaTypes {
        @objid ("6fe3dac0-83ef-4eb4-b963-04ad70f8bade")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cb1b3706-790b-41f0-a299-015b49b1c611")
        public static TagType DEVOPSTOOL_TAGTYPE_ELT;

        @objid ("ace30de2-ed55-4c12-8425-c6ec6d73a468")
        public static TagType OS_TAGTYPE_ELT;

        @objid ("bfebebd0-78e9-4a40-88e2-d4235aa93075")
        public static TagType IMAGEID_TAGTYPE_ELT;

        @objid ("0a4d32cf-760c-46c4-9ee7-132df9419f1b")
        public static NoteType UPLOADCOMMAND_NOTETYPE_ELT;

        @objid ("3976841f-3071-47ec-a988-6d8efa933668")
        public static NoteType INSTALLCOMMAND_NOTETYPE_ELT;

        @objid ("e9d712a5-4b83-4f81-a7cb-2e8458c60af6")
        public static NoteType STARTCOMMAND_NOTETYPE_ELT;

        @objid ("99008626-5bce-44c2-89bd-04215aef09ee")
        public static NoteType STOPCOMMAND_NOTETYPE_ELT;

        @objid ("bb9e043f-1ae3-4ff7-9503-d329d80b3ea2")
        public static NoteType DOWNLOADCOMMAND_NOTETYPE_ELT;

        @objid ("6e846ef9-3feb-4ebc-8fa6-14bfb95face7")
        public static NoteType CONFIGURECOMMAND_NOTETYPE_ELT;

        @objid ("abbf3e8f-3123-4424-97c7-45bc7f788497")
        public static NoteType UPDATECOMMAND_NOTETYPE_ELT;

        @objid ("72aec68f-0a33-4c9f-ab8f-e5a9e583488b")
        private static Stereotype MDAASSOCDEP;

        @objid ("dd832047-cce7-48e2-83e0-8b4f0ade376d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("600e5f7f-3fe7-432d-baa3-4738e3270cb7")
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
