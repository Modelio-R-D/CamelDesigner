/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
@objid ("cdca4c86-c0ef-4910-a37e-df9c087b8f69")
public abstract class NamedElement extends CamelElement {
    @objid ("988996cd-17a4-405e-aa4e-db536816389d")
    public static final String STEREOTYPE_NAME = "NamedElement";

    /**
     * Tells whether a {@link NamedElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NamedElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2fec61ea-22d1-4c68-a7ab-baa1dbe75341")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NamedElement.STEREOTYPE_NAME));
    }

    @objid ("7b1c2561-9964-48c1-b025-40b2eb23c331")
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
    @objid ("d9c507a2-c12c-4c0b-a493-bf31bc14b96a")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("4a553932-af18-4446-b303-85f9183930bc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f7a8d572-7c33-48e1-8e89-829fe583a68c")
    public String getDescription() {
        IModelingSession modelingSession = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        NoteType type = modelingSession.getMetamodelExtensions().getNoteType("description", "ModelerModule", this.elt.getMClass());
        return this.elt.getNoteContent(type);
    }

    @objid ("dcb0caaa-126c-433d-98ae-c8f166a6eab0")
    public String getName() {
        return this.elt.getName();
    }

    @objid ("6c9c3eeb-cf62-4f76-a5b6-ef179f59de05")
    public void setDefaultName(String name) {
        CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(this.elt, name);
    }

    @objid ("02122458-214d-4b6d-bf06-5afed5a24b1d")
    public void setDescription(String description) {
        IModelingSession modelingSession = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        NoteType type = modelingSession.getMetamodelExtensions().getNoteType("description", "ModelerModule", this.elt.getMClass());
        Note note = this.elt.getNote(type);
        if (note == null) {
            note = modelingSession.getModel().createNote(type, this.elt, description);
        }else {
            note.setContent(description);
        }
    }

    @objid ("9f92ce98-f8b1-46e0-a68a-a320cb75a013")
    public void setName(String name) {
        this.elt.setName(name);
    }

    @objid ("911b7f48-b9bc-44f3-aa6c-2a3c440cdd9e")
    protected NamedElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("246df9d9-a77b-433f-b4f3-69cc11ca5913")
    public static final class MdaTypes {
        @objid ("ceb31850-563f-4646-8510-071aad5361e9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e0899c47-265c-46ae-972e-577c50d45202")
        private static Stereotype MDAASSOCDEP;

        @objid ("a2c1fe22-0b93-4c4d-a35b-8da7a902ac60")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fb158d76-682e-4d8c-865d-c9cf1536ff23")
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
