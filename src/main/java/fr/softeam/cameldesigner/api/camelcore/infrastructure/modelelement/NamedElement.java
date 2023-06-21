/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("5644227a-83bc-4147-9b68-818ed8f7669d")
    public static final String STEREOTYPE_NAME = "NamedElement";

    /**
     * Tells whether a {@link NamedElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NamedElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3cabdf21-f0a4-42dd-b131-3fe50c9c61e5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NamedElement.STEREOTYPE_NAME));
    }

    @objid ("dbc227b4-8e84-4cd6-983e-f6df69840d5c")
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
    @objid ("4e865941-c941-42e3-a47a-24fd4709d41e")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("f396b8a8-820e-4721-a618-85aae1392ef6")
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

    @objid ("cac683e6-23ae-4e2e-95be-2dd42176b2bd")
    protected NamedElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("490342a7-e413-4d5b-a428-220d5a2d09ea")
    public static final class MdaTypes {
        @objid ("4b176839-c416-443a-a4c5-28440d6467b2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dc931549-02f4-4ee2-8c42-78719ab2ab1e")
        private static Stereotype MDAASSOCDEP;

        @objid ("e839a52c-7b68-4dff-8dfd-ecca64b92bef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a5daf93f-e216-4469-a0af-5d4c1ee24da3")
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
