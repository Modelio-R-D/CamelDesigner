/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("e98e585d-f571-419f-8b9a-6f2ac00c53a3")
    public static final String STEREOTYPE_NAME = "ScriptConfiguration";

    @objid ("8ed15c2c-f897-41cb-b820-c75c953eca30")
    public static final String DEVOPSTOOL_TAGTYPE = "devopsTool";

    @objid ("443d350a-dfb9-4c94-82b0-348394f46c34")
    public static final String IMAGEID_TAGTYPE = "imageId";

    @objid ("31a6376d-d69e-4658-b87a-a6b3c0310fb6")
    public static final String OS_TAGTYPE = "os";

    @objid ("e96fdc6b-b61a-4c8d-aeeb-9e073c4662ca")
    public static final String CONFIGURECOMMAND_NOTETYPE = "configureCommand";

    @objid ("da6e3978-e599-45e4-8ecf-05ba3ac181fd")
    public static final String DOWNLOADCOMMAND_NOTETYPE = "downloadCommand";

    @objid ("0f46486e-109f-4446-bcea-2c8faffa5280")
    public static final String INSTALLCOMMAND_NOTETYPE = "installCommand";

    @objid ("1e524787-c0c1-43ba-91f5-4d5b5edd8447")
    public static final String STARTCOMMAND_NOTETYPE = "startCommand";

    @objid ("093819da-d0ff-42a5-b47d-ea994cad7265")
    public static final String STOPCOMMAND_NOTETYPE = "stopCommand";

    @objid ("c00b1980-e616-42c8-a7cd-115cc51be1a3")
    public static final String UPDATECOMMAND_NOTETYPE = "updateCommand";

    @objid ("6a879981-61b9-4caf-a63d-794be8744b36")
    public static final String UPLOADCOMMAND_NOTETYPE = "uploadCommand";

    /**
     * Tells whether a {@link ScriptConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ScriptConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("357e0cb4-27f8-4fef-b9fb-286b2d2ea444")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScriptConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ScriptConfiguration >> then instantiate a {@link ScriptConfiguration} proxy.
     * 
     * @return a {@link ScriptConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("32aea06a-1d8b-4060-b610-ab781a705ebb")
    public static ScriptConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ScriptConfiguration.STEREOTYPE_NAME);
        return ScriptConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link ScriptConfiguration} proxy from a {@link Artifact} stereotyped << ScriptConfiguration >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Artifact
     * @return a {@link ScriptConfiguration} proxy or <i>null</i>.
     */
    @objid ("20226142-ddce-40a5-a7c2-acaf2a202c56")
    public static ScriptConfiguration instantiate(final Artifact obj) {
        return ScriptConfiguration.canInstantiate(obj) ? new ScriptConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ScriptConfiguration} proxy from a {@link Artifact} stereotyped << ScriptConfiguration >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Artifact}
     * @return a {@link ScriptConfiguration} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f066d3eb-6122-4a3f-893c-f85b5248597d")
    public static ScriptConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ScriptConfiguration.canInstantiate(obj))
            return new ScriptConfiguration(obj);
        else
            throw new IllegalArgumentException("ScriptConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("28b1155c-db61-466b-9040-63ea9ac8e081")
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
    @objid ("d41b8c48-890c-47d3-be6e-d553fb9a1f6a")
    public String getConfigureCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.CONFIGURECOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for string property 'devopsTool'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3bd8c83e-2696-4000-aa73-dbcc59c2d661")
    public String getDevopsTool() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.DEVOPSTOOL_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'downloadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("7e179e17-0237-4d3a-9c4a-61585f4ef093")
    public String getDownloadCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.DOWNLOADCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}.
     * 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("4d81464f-dec9-4a2a-8447-1e568aec6f7f")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e971ee0d-5d87-4037-b9e8-89dc27ff138f")
    public String getImageId() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'installCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("4e33a567-59ff-46d8-ba08-8ee1f516780d")
    public String getInstallCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.INSTALLCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("97147c2f-78cd-4a32-bc1a-215b9d693dd2")
    public String getOs() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.OS_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'startCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("c2cfc4e6-f25b-4747-9c0d-abe303a55817")
    public String getStartCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.STARTCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'stopCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("04e15608-f076-49ee-8c63-0d3433769899")
    public String getStopCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.STOPCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'updateCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("d29d0ca8-ce90-45cd-8ac7-d67f1b198dbb")
    public String getUpdateCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.UPDATECOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'uploadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("2a2c3129-95a3-46b2-84d5-9cfeb59e2ab5")
    public String getUploadCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.UPLOADCOMMAND_NOTETYPE_ELT);
    }

    @objid ("dd6109a8-3d8e-4d7d-b072-a7d558d0f8c2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'configureCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("3a3f14be-9761-4d03-a1af-55b9c4632a69")
    public void setConfigureCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.CONFIGURECOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'devopsTool'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cdb642b3-3d3f-479d-99c8-b9cacaf1a3f7")
    public void setDevopsTool(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.DEVOPSTOOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'downloadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("eb791534-b03c-48df-9c1c-7f7e1c944c7f")
    public void setDownloadCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.DOWNLOADCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3e061f13-f94d-4ea6-8676-76048c4a1d46")
    public void setImageId(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'installCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("2498e2a5-f06c-4d57-ade4-ba6bfd783948")
    public void setInstallCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.INSTALLCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7ef78037-9a55-48ce-9629-68f62a095409")
    public void setOs(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.OS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'startCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("5890f0ac-d383-4f79-a9b7-29f1a51c0ef7")
    public void setStartCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.STARTCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'stopCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("ccade006-9678-418a-ab0f-2215029c3a85")
    public void setStopCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.STOPCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'updateCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("ea1b5601-8c6a-41eb-8184-0c01a8d68ab2")
    public void setUpdateCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.UPDATECOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'uploadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("b7f58266-9dc8-4bb8-bb9f-65405e9d7799")
    public void setUploadCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.UPLOADCOMMAND_NOTETYPE_ELT, value);
    }

    @objid ("8c39507c-fd47-4f02-a5b9-05313811e55e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("a5677dd0-def5-4708-86f0-4fa7eaeb9ff3")
    protected ScriptConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("00dd1668-d91f-4281-aae3-7ec4cef1c015")
    public static final class MdaTypes {
        @objid ("a4b05c1a-7937-4d50-8d2d-a41d47c1f12e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("64714444-2781-46a9-8547-0f09f73bf2dc")
        public static TagType DEVOPSTOOL_TAGTYPE_ELT;

        @objid ("c7b3d395-abc1-4d05-9f73-e018bb4b7066")
        public static TagType OS_TAGTYPE_ELT;

        @objid ("836a1521-197a-4aba-8c55-d67db9ae41dd")
        public static TagType IMAGEID_TAGTYPE_ELT;

        @objid ("94c2b7bc-83cd-40ec-82a3-b5186049bb4c")
        public static NoteType UPLOADCOMMAND_NOTETYPE_ELT;

        @objid ("acffc256-7f9a-41ca-93a7-e866cf1db17e")
        public static NoteType INSTALLCOMMAND_NOTETYPE_ELT;

        @objid ("93384636-7b5b-47ef-a783-45c266bdc07b")
        public static NoteType STARTCOMMAND_NOTETYPE_ELT;

        @objid ("f4c2b3af-2765-4b67-bc22-94e5eeb68907")
        public static NoteType STOPCOMMAND_NOTETYPE_ELT;

        @objid ("13499c85-4cb6-4a42-bc43-6206305f2fc2")
        public static NoteType DOWNLOADCOMMAND_NOTETYPE_ELT;

        @objid ("03e4a6ff-2e10-457b-8525-d766b2e6a0f1")
        public static NoteType CONFIGURECOMMAND_NOTETYPE_ELT;

        @objid ("6667f0ea-fb46-42b4-9b31-cd20c79863bd")
        public static NoteType UPDATECOMMAND_NOTETYPE_ELT;

        @objid ("3d0a9339-b870-4b77-9d4f-587e8991e7e2")
        private static Stereotype MDAASSOCDEP;

        @objid ("8a96c601-70d6-437a-b4b7-dea35a756053")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c0b321be-b514-4ae5-a2e4-6956c15c10dc")
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
