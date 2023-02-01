/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << NamedElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d32a3675-6e63-4a88-8cb1-f425a1273f04")
public abstract class NamedElement extends CamelElement {
<<<<<<< HEAD
    @objid ("95423391-16ac-4a26-9479-50093f2f68f1")
=======
    @objid ("0ab13108-a7fc-4daf-b13c-557fc0d54607")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "NamedElement";

    /**
     * Tells whether a {@link NamedElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NamedElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("1e917eb8-1275-4e94-9456-2ac1e61b26fe")
=======
    @objid ("0a9a98b5-6563-4c35-ac7f-d2e6310f7178")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NamedElement.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("42443477-5022-4469-825b-68b1d0a37243")
=======
    @objid ("9bacff38-286b-4f55-9cb3-c1b2e0129279")
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
        NamedElement other = (NamedElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("96006ee8-a289-4392-8687-8df185361fc1")
=======
    @objid ("906ea662-f554-4c4a-86fa-a497a4325673")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

<<<<<<< HEAD
    @objid ("cc216757-3152-4260-9e9d-62a912216b01")
=======
    @objid ("c0f0436e-221e-4613-86c7-90384fd41fb2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4b270d67-3335-486d-ab07-7cd127a451c6")
    public String getDescription() {
        IModelingSession modelingSession = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        NoteType type = modelingSession.getMetamodelExtensions().getNoteType("ModelerModule", "description", this.elt.getMClass());
        return this.elt.getNoteContent(type);
    }

    @objid ("d5284a74-65a4-460a-a604-4bd58ffa2de8")
    public String getName() {
        return this.elt.getName();
    }

    @objid ("085a4c3a-4de4-4b28-9de1-78311cf27bae")
    public void setDefaultName(String name) {
        CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(this.elt, name);
    }

    @objid ("6705931b-967e-43e7-aa01-4c9d8c5f1bdc")
    public void setDescription(String description) {
        IModelingSession modelingSession = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        NoteType type = modelingSession.getMetamodelExtensions().getNoteType("ModelerModule", "description", this.elt.getMClass());
        Note note = this.elt.getNote(type);
        if (note == null) {
            note = modelingSession.getModel().createNote(type, this.elt, description);
        }else {
            note.setContent(description);
        }
    }

    @objid ("c752b649-afb2-40cf-af1a-3c669786c2b6")
    public void setName(String name) {
        this.elt.setName(name);
    }

<<<<<<< HEAD
    @objid ("7f0ae8ae-0e8d-4f41-9176-dbd7986658e6")
=======
    @objid ("580f68a2-7075-4346-86f8-7f77b5283f2f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected NamedElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("490342a7-e413-4d5b-a428-220d5a2d09ea")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("be041580-3137-48af-84ad-23e83bf8df3e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("78c4c702-ff00-4fa3-b57d-769f86b45a15")
        private static Stereotype MDAASSOCDEP;

        @objid ("9e2f0ff5-b896-453c-960d-6249ca65e3fc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5971321c-528f-42b6-9d41-7380e4ce5a86")
=======
        @objid ("79759077-c44e-45f4-bab2-2996aa6d8f96")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9d4697a9-dbd4-4865-9aae-aa5fc4ac5245")
        private static Stereotype MDAASSOCDEP;

        @objid ("751ec35c-6972-4d11-9c8d-846f09790127")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fa6b1616-794e-49dd-97d7-88e6573448af")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0fcc7434-c82f-4c57-a814-8a9233fdc9b0");
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
