/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("361a0a84-b4bb-48aa-901c-687b7f04605e")
    public static final String STEREOTYPE_NAME = "ScriptConfiguration";

    @objid ("06fd91e0-6bdc-4196-a439-ab7c9f88e65d")
    public static final String DEVOPSTOOL_TAGTYPE = "devopsTool";

    @objid ("9d377f8d-5231-4d5a-ac1b-232348d4709b")
    public static final String IMAGEID_TAGTYPE = "imageId";

    @objid ("354e3c7e-724a-4607-bd68-4e118b41a871")
    public static final String OS_TAGTYPE = "os";

    @objid ("453f0ec8-1eeb-421b-9de4-1a31a90cf65c")
    public static final String CONFIGURECOMMAND_NOTETYPE = "configureCommand";

    @objid ("7098a6de-8b31-477a-8a86-89fea438f7fe")
    public static final String DOWNLOADCOMMAND_NOTETYPE = "downloadCommand";

    @objid ("07c42c5e-b905-4a54-b5b8-ac03b144d334")
    public static final String INSTALLCOMMAND_NOTETYPE = "installCommand";

    @objid ("5f0578cb-12e2-4be3-9db7-decb16d0a548")
    public static final String STARTCOMMAND_NOTETYPE = "startCommand";

    @objid ("e629bd0d-a078-44ab-87e1-55af8b33c46a")
    public static final String STOPCOMMAND_NOTETYPE = "stopCommand";

    @objid ("60957787-f94c-4c4c-a430-e6f7d2830bf9")
    public static final String UPDATECOMMAND_NOTETYPE = "updateCommand";

    @objid ("dc56d18f-7ebb-4831-bd88-e59744d3ade1")
    public static final String UPLOADCOMMAND_NOTETYPE = "uploadCommand";

    /**
     * Tells whether a {@link ScriptConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ScriptConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("caa88803-b749-49c3-b3c8-6a288c679c13")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScriptConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ScriptConfiguration >> then instantiate a {@link ScriptConfiguration} proxy.
     * 
     * @return a {@link ScriptConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("e2a405a6-cd1b-49ec-95b6-e0a545115835")
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
    @objid ("1ebcc197-b119-41e4-97b0-4f0c6eee21c0")
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
    @objid ("d5baba22-6eb8-4978-a863-5e76b57f2a5c")
    public static ScriptConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ScriptConfiguration.canInstantiate(obj))
        	return new ScriptConfiguration(obj);
        else
        	throw new IllegalArgumentException("ScriptConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8b60edf0-c86f-407a-bc13-4809fb7aba1e")
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
    @objid ("98688aaf-f00a-49bb-950a-5a62830c478d")
    public String getConfigureCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.CONFIGURECOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for string property 'devopsTool'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("238794c9-a6ee-40b5-9aa5-6f1c3b66c6f9")
    public String getDevopsTool() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.DEVOPSTOOL_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'downloadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("530cf653-1bb8-4767-8ee9-709454591eb8")
    public String getDownloadCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.DOWNLOADCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("ef9b2079-3fec-45c6-a73d-28dd3329a2ef")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4aceb4e6-ee70-406e-812d-b957eb963756")
    public String getImageId() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'installCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("4252a0df-db23-44d2-b380-6bdd681e42cd")
    public String getInstallCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.INSTALLCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("983ac0fb-f034-4232-8a61-27c76b49293b")
    public String getOs() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.OS_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'startCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("57d480bc-2c64-46e7-a0e1-5521bdf5ed64")
    public String getStartCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.STARTCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'stopCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("730ecf51-4c05-4559-a3ea-a90e01378b09")
    public String getStopCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.STOPCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'updateCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("aa6cb8be-3ccf-4ef8-b74a-b6db70c101ad")
    public String getUpdateCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.UPDATECOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'uploadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("d1e25918-c644-4e1d-b92e-f50a1d86fea6")
    public String getUploadCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.UPLOADCOMMAND_NOTETYPE_ELT);
    }

    @objid ("ef9cc35a-7815-45ae-ba40-97591e322954")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'configureCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("ff25673d-1ef8-4c36-957c-d66326f68f25")
    public void setConfigureCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.CONFIGURECOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'devopsTool'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("97117c34-6500-49b6-881b-2d422f8929f8")
    public void setDevopsTool(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.DEVOPSTOOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'downloadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("38eaa3a2-c0f2-4a97-b0b8-581fb4e53937")
    public void setDownloadCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.DOWNLOADCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f9cbd723-0893-4e24-80b7-c5e5ba02465b")
    public void setImageId(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'installCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("fe6d0570-c6f5-42e0-95c0-66e441abbaa4")
    public void setInstallCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.INSTALLCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0cb711d6-d0c4-4105-9e48-84c0700ddbe1")
    public void setOs(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.OS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'startCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("298e6f46-9431-4fab-809f-168e10ab5f8b")
    public void setStartCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.STARTCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'stopCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("8753492b-9bbc-4258-aa29-d2ab08abd814")
    public void setStopCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.STOPCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'updateCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("04ca520f-6b46-48a5-b2f6-e14f92d160ad")
    public void setUpdateCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.UPDATECOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'uploadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("c61475f9-fb75-4300-9c4c-03267ab73a5a")
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

    @objid ("09ad206d-eb92-4be9-84b0-4c04d7c23ef8")
    protected ScriptConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("00dd1668-d91f-4281-aae3-7ec4cef1c015")
    public static final class MdaTypes {
        @objid ("9f8fefa3-ce95-40cb-942e-31a84d70ec07")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b30ca14b-d037-42ec-af21-bee2c66dc053")
        public static TagType DEVOPSTOOL_TAGTYPE_ELT;

        @objid ("ddd922ee-ee62-4681-a19a-2171c7353588")
        public static TagType OS_TAGTYPE_ELT;

        @objid ("46b6f145-cbdd-4ca6-b0fa-d06dd444425d")
        public static TagType IMAGEID_TAGTYPE_ELT;

        @objid ("1381bc6b-2c17-4446-a3b4-40758dbf80ea")
        public static NoteType UPLOADCOMMAND_NOTETYPE_ELT;

        @objid ("5e9e8e94-ed7f-4c04-8d05-4c56286fd628")
        public static NoteType INSTALLCOMMAND_NOTETYPE_ELT;

        @objid ("5a25956b-3418-452c-927f-e3989b177175")
        public static NoteType STARTCOMMAND_NOTETYPE_ELT;

        @objid ("76769ca3-f064-4e76-88fb-4f5972fe25ae")
        public static NoteType STOPCOMMAND_NOTETYPE_ELT;

        @objid ("08f380f7-3415-4383-9481-66543f26a7f4")
        public static NoteType DOWNLOADCOMMAND_NOTETYPE_ELT;

        @objid ("45334d86-856b-4e43-8025-1216e8708ca9")
        public static NoteType CONFIGURECOMMAND_NOTETYPE_ELT;

        @objid ("319b841f-8b8d-4604-bc32-046e2b17732c")
        public static NoteType UPDATECOMMAND_NOTETYPE_ELT;

        @objid ("ec211748-7567-41eb-8d88-f06586cbaaf4")
        private static Stereotype MDAASSOCDEP;

        @objid ("5f5d5072-ea67-4899-a482-81f5fe902d80")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7ea3cc5c-706b-4be8-8ab4-8a82280432cf")
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
