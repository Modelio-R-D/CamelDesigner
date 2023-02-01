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
<<<<<<< HEAD
    @objid ("b80f0f96-a36d-432c-bad5-fbcf3f85d395")
    public static final String STEREOTYPE_NAME = "ScriptConfiguration";

    @objid ("15dbaebb-9591-4c47-a663-6bca93f1fbf1")
    public static final String DEVOPSTOOL_TAGTYPE = "devopsTool";

    @objid ("61e07714-32a4-4b75-8b3b-781be3c42d80")
    public static final String IMAGEID_TAGTYPE = "imageId";

    @objid ("b0f53735-eb6d-4c6b-911c-b28a4f61db09")
    public static final String OS_TAGTYPE = "os";

    @objid ("148a9928-7923-4e5d-bbbf-178acb38cc03")
    public static final String CONFIGURECOMMAND_NOTETYPE = "configureCommand";

    @objid ("8666b4d1-428d-40f3-a0bf-1523ad585c7d")
    public static final String DOWNLOADCOMMAND_NOTETYPE = "downloadCommand";

    @objid ("ffbdeb79-657c-4ee2-937e-12624702bfa5")
    public static final String INSTALLCOMMAND_NOTETYPE = "installCommand";

    @objid ("d002af6c-c269-4ad2-a4a4-1f44af6b06de")
    public static final String STARTCOMMAND_NOTETYPE = "startCommand";

    @objid ("a48a0fad-6f78-41c7-a2e1-b8b6fcc676e0")
    public static final String STOPCOMMAND_NOTETYPE = "stopCommand";

    @objid ("621ad865-d623-4660-aa54-12087e8bc295")
    public static final String UPDATECOMMAND_NOTETYPE = "updateCommand";

    @objid ("7554b70c-479f-438e-a495-745485c09435")
=======
    @objid ("ae142489-3d79-4135-b7a1-2467fb5bce9d")
    public static final String STEREOTYPE_NAME = "ScriptConfiguration";

    @objid ("2b9a67eb-56eb-4bc0-9fa0-58229a7cd26a")
    public static final String DEVOPSTOOL_TAGTYPE = "devopsTool";

    @objid ("e3bc2758-59ad-431a-b986-08d374bf6c5c")
    public static final String IMAGEID_TAGTYPE = "imageId";

    @objid ("2d58c5f9-8e2e-446a-b10f-a735e402d5dd")
    public static final String OS_TAGTYPE = "os";

    @objid ("7ce659d8-50a4-4b3b-85e3-54146a3cae11")
    public static final String CONFIGURECOMMAND_NOTETYPE = "configureCommand";

    @objid ("e960da93-0116-4ee2-9cfb-f6268ca5f2a4")
    public static final String DOWNLOADCOMMAND_NOTETYPE = "downloadCommand";

    @objid ("6bc6e001-6f61-4f11-9a25-59c92631ee8b")
    public static final String INSTALLCOMMAND_NOTETYPE = "installCommand";

    @objid ("2aaf8250-5aab-4263-956b-b8cd46830fd2")
    public static final String STARTCOMMAND_NOTETYPE = "startCommand";

    @objid ("3e98b96b-6971-4c57-a0a3-8be0d1a3aef1")
    public static final String STOPCOMMAND_NOTETYPE = "stopCommand";

    @objid ("a4df956e-0ca9-4992-bac1-0dee81b16fb9")
    public static final String UPDATECOMMAND_NOTETYPE = "updateCommand";

    @objid ("09937711-c2df-4537-a1f9-499f70bc22ba")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String UPLOADCOMMAND_NOTETYPE = "uploadCommand";

    /**
     * Tells whether a {@link ScriptConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ScriptConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d36a54f9-23c2-487b-97a7-643ba72735f3")
=======
    @objid ("21ea3828-bf6f-4dfa-9abb-a0e695f9f445")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScriptConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ScriptConfiguration >> then instantiate a {@link ScriptConfiguration} proxy.
     * 
     * @return a {@link ScriptConfiguration} proxy on the created {@link Artifact}.
     */
<<<<<<< HEAD
    @objid ("04458804-811e-4d55-8853-dcc8d22e382c")
=======
    @objid ("aad4b789-f346-4b43-a06a-9236528f0e43")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("482bbbb2-e8b7-449e-b4ca-130a40d23882")
=======
    @objid ("c62b0f67-ef01-42f9-8ba1-84825eaa8226")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("bb733899-a1f0-4e5b-9726-afd40fb95ad2")
=======
    @objid ("f186a352-ee40-4bdc-800c-b905a8550ac4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ScriptConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ScriptConfiguration.canInstantiate(obj))
        	return new ScriptConfiguration(obj);
        else
        	throw new IllegalArgumentException("ScriptConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("bef3b175-e950-47f9-a28f-455a70a2ad56")
=======
    @objid ("6b90f712-0b76-4105-9bce-1ac374f88d1c")
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
        ScriptConfiguration other = (ScriptConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for note 'configureCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("ee5401aa-fae8-46b7-ae2e-6dce81df6ba9")
=======
    @objid ("b4a36633-e2e5-4c41-be2f-aaa43208a7cd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getConfigureCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.CONFIGURECOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for string property 'devopsTool'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("c30a3090-cf8f-4047-8d7f-51be44160260")
=======
    @objid ("59d314a5-3bf7-45c5-9fc3-cf6a64b8a542")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getDevopsTool() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.DEVOPSTOOL_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'downloadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("55101c88-d73a-47ef-b6c3-f683cdc12f7e")
=======
    @objid ("1f178924-7c70-419d-b87b-f57f8f38911d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getDownloadCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.DOWNLOADCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("d912f955-6eed-4ca5-b23b-24e5789bf672")
=======
    @objid ("93e12bbb-642c-40e7-8410-15e89eb540d9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("d0edb024-193c-4936-a5fa-bcdfc15d6a8e")
=======
    @objid ("61b5181c-75dd-42be-b930-e3e2da6dcbc6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getImageId() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'installCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("fbf59554-fe8d-48fe-ac06-7d9216cf792b")
=======
    @objid ("c2b8c3f3-d48a-41ef-80e2-ddb0ff5a7898")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getInstallCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.INSTALLCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("f73e8b40-e64f-463f-9fdf-c801bcd380a0")
=======
    @objid ("9beb5285-53b3-4bf1-b540-6c1c0855d6f3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getOs() {
        return this.elt.getTagValue(ScriptConfiguration.MdaTypes.OS_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'startCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("39442b0e-db56-45b7-b8f2-11aa09bd69d5")
=======
    @objid ("dd20d07f-9acf-4b94-b4f8-4575de9af289")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getStartCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.STARTCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'stopCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("b441e1df-663f-424d-8a69-b3a6be7fd1b1")
=======
    @objid ("3a281802-45df-4733-8846-c950eff3fdd1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getStopCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.STOPCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'updateCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("79a77722-5553-440e-859c-dc61a8c82b4d")
=======
    @objid ("75e028ec-776f-4947-9f09-ce5c2c6c035b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getUpdateCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.UPDATECOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'uploadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("2f2e8e30-e6ac-45ff-892f-c31c32085bf3")
=======
    @objid ("3eb1daf9-36dd-4e42-990d-01433a78dd3f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getUploadCommandNote() {
        return this.elt.getNoteContent(ScriptConfiguration.MdaTypes.UPLOADCOMMAND_NOTETYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("d02a405f-7add-4a21-a87f-1c65384d3f37")
=======
    @objid ("87f45180-4f2c-413f-97cd-b50118e7ee0d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'configureCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("86a25cbd-c050-44d6-ac5c-125ea61a9f55")
=======
    @objid ("d1148395-8b39-41b3-a6f9-ab6762feaf75")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setConfigureCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.CONFIGURECOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'devopsTool'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("77c018b5-7d7f-4cfc-abcc-6d690065e89e")
=======
    @objid ("854cdcd1-17e4-4e43-b24e-ae0c1230c93e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setDevopsTool(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.DEVOPSTOOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'downloadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("f4c067db-3df5-416d-a64a-6d37a78e3087")
=======
    @objid ("2258faff-2843-47e0-850f-b92ec5e8d458")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setDownloadCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.DOWNLOADCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("b41af1e0-c444-45fa-b0ea-e97789ec3dc7")
=======
    @objid ("03921ab4-c541-457a-be03-505dcb8175ef")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setImageId(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'installCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("70da1d77-cde8-474b-bfe5-4866a271b396")
=======
    @objid ("c6493447-6646-494f-8e61-7a4733effb6a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setInstallCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.INSTALLCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("9604f096-8617-47ab-b74a-fa9149837d5f")
=======
    @objid ("b1363043-10b8-4ae2-8e9a-b0094b8ed37e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setOs(final String value) {
        this.elt.putTagValue(ScriptConfiguration.MdaTypes.OS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'startCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("40d54189-8b1a-40da-9191-002558f5d131")
=======
    @objid ("bfc1ebf0-7296-4d3f-8910-45e44feacdbe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setStartCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.STARTCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'stopCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("6895471e-8325-4e5e-bc22-ae2e4ea9fe7d")
=======
    @objid ("1fd64baa-6ca8-4108-8a6f-6fa8bd533d01")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setStopCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.STOPCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'updateCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("68a04bdf-e1b3-4923-ba9c-b83e102f9aac")
=======
    @objid ("f589fad9-7d2b-4ac9-bf26-d20ef838228f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setUpdateCommandNote(final String value) {
        this.elt.putNoteContent(ScriptConfiguration.MdaTypes.UPDATECOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'uploadCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("e1ccae78-4849-4621-84e7-68e86275805b")
=======
    @objid ("057c7a26-6d08-42ed-93e9-099196371c7d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("69cef1e2-e21f-4f30-b5e0-f90c863d030a")
=======
    @objid ("f48146c1-55f0-4e01-9dfd-3b3c83411949")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ScriptConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("00dd1668-d91f-4281-aae3-7ec4cef1c015")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("d05877ec-8c29-49d0-8262-bdff3349ac8f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7560832d-4b9f-4b9f-a3c5-27fb063bf89f")
        public static TagType DEVOPSTOOL_TAGTYPE_ELT;

        @objid ("f181e6c7-5874-409c-914c-026e44a240ac")
        public static TagType OS_TAGTYPE_ELT;

        @objid ("58ed3886-054d-4350-ad81-41a3efd8f446")
        public static TagType IMAGEID_TAGTYPE_ELT;

        @objid ("7e009934-61dc-40e4-b37b-fba6309115d7")
        public static NoteType UPLOADCOMMAND_NOTETYPE_ELT;

        @objid ("92f3e7ac-b171-4f5a-b91f-7e11025b32da")
        public static NoteType INSTALLCOMMAND_NOTETYPE_ELT;

        @objid ("54ff6db1-2af7-4a9b-a288-d26cd99a7636")
        public static NoteType STARTCOMMAND_NOTETYPE_ELT;

        @objid ("28e68c07-59c0-4155-925e-433247fcf8d9")
        public static NoteType STOPCOMMAND_NOTETYPE_ELT;

        @objid ("926d2fc0-5522-443c-9c25-d39f1f135b71")
        public static NoteType DOWNLOADCOMMAND_NOTETYPE_ELT;

        @objid ("25a3fe2c-a7d2-49f6-9608-c5d298542bc1")
        public static NoteType CONFIGURECOMMAND_NOTETYPE_ELT;

        @objid ("7426bd0b-bc42-40b6-a713-d9f706f53adb")
        public static NoteType UPDATECOMMAND_NOTETYPE_ELT;

        @objid ("93a2bf42-2e9f-4dd6-9c47-6ec51318e9b1")
        private static Stereotype MDAASSOCDEP;

        @objid ("042e7139-b3e0-4b2b-a49d-bc3b8bfc1331")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("df1a364e-57c0-4269-9fa6-edafd121c6af")
=======
        @objid ("777c69db-b14b-4ab5-b122-6aad2918901f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d481b9ad-b66c-4b29-bdfa-b39b5574e2db")
        public static TagType DEVOPSTOOL_TAGTYPE_ELT;

        @objid ("776e43ba-fe94-4dd8-a75b-5853ede7c4e4")
        public static TagType OS_TAGTYPE_ELT;

        @objid ("520790e6-4c07-412d-bc82-43422ca2abe8")
        public static TagType IMAGEID_TAGTYPE_ELT;

        @objid ("75236569-d927-411e-8c29-c9708d5c456f")
        public static NoteType UPLOADCOMMAND_NOTETYPE_ELT;

        @objid ("190f9a31-7482-4d3d-a50c-df6fde8b6111")
        public static NoteType INSTALLCOMMAND_NOTETYPE_ELT;

        @objid ("2e0ebb44-a251-437b-b4a1-28c46dd486b4")
        public static NoteType STARTCOMMAND_NOTETYPE_ELT;

        @objid ("b1f62069-2eef-46bc-bea4-8f5552627af4")
        public static NoteType STOPCOMMAND_NOTETYPE_ELT;

        @objid ("e9028a78-1da5-4e4a-871c-8ea3309d4905")
        public static NoteType DOWNLOADCOMMAND_NOTETYPE_ELT;

        @objid ("057f58f9-18a8-4140-a72b-e95f9a26ba4a")
        public static NoteType CONFIGURECOMMAND_NOTETYPE_ELT;

        @objid ("43d04732-e93f-4e62-8beb-7ee34bf8efb2")
        public static NoteType UPDATECOMMAND_NOTETYPE_ELT;

        @objid ("06ba2dd6-be21-4658-9bbf-e9788f599fc0")
        private static Stereotype MDAASSOCDEP;

        @objid ("0b4a0026-46fd-4e82-a736-f5923e81c3ed")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b6263598-b8c8-4aa3-9fb3-b646d947e12d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
