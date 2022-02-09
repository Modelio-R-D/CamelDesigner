/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << NamedElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f252b432-5dfa-429d-a585-2ea4461bf1ad")
public abstract class NamedElement extends CamelElement {
    @objid ("b7d5fa38-8338-462c-8514-fed22bc91862")
    public static final String STEREOTYPE_NAME = "NamedElement";

    /**
     * Tells whether a {@link NamedElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NamedElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3aeafeee-bb28-49a6-99d4-deac27b53fad")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NamedElement.STEREOTYPE_NAME));
    }

    @objid ("0442d0cb-8661-4972-be77-04af55b310bd")
    public static NamedElement instantiate(final ModelElement obj) {
        return CamelAttribute.canInstantiate(obj) ? CamelAttribute.instantiate(obj) :
            CamelModel.canInstantiate(obj) ? CamelModel.instantiate((Package) obj) :
                Feature.canInstantiate(obj) ? Feature.instantiate(obj) :
                    SubModel.canInstantiate(obj) ? SubModel.instantiate((Package)obj) :
                        CamelConstraint.canInstantiate(obj) ? CamelConstraint.instantiate((Constraint)obj) :
                            MmsObject.canInstantiate(obj) ? MmsObject.instantiate(obj) :
                                ValueType.canInstantiate(obj) ? ValueType.instantiate((DataType)obj) : null;
    }

    /**
     * Add a value to the 'annotations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8132070e-a49d-451e-99c6-b41ede6256ef")
    public void addAnnotations(final MmsObject obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), NamedElement.MdaTypes.MDAASSOCDEP);
            d.setName("annotations");
            d.putTagValue(NamedElement.MdaTypes.MDAASSOCDEP_ROLE, "annotations");
        }
    }

    @objid ("782a9d1c-b861-49f3-96a7-deaf8042c227")
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
     * Get the values of the 'annotations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("10371aa9-b4b2-4903-baaf-f57b97e086a6")
    public List<MmsObject> getAnnotations() {
        List<MmsObject> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(NamedElement.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(NamedElement.MdaTypes.MDAASSOCDEP_ROLE), "annotations")
              && MmsObject.canInstantiate(d.getDependsOn()))
                results.add((MmsObject)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsObject.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("23e59f44-4f80-458e-a5b5-fa346a60b310")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("53ac3341-40d6-4cb0-927a-bfbf92d446c6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'annotations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1b12c5ab-a70e-40e7-8bee-96c90c9be130")
    public boolean removeAnnotations(final MmsObject obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(NamedElement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(NamedElement.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("2ea30db8-9ee9-4817-8cb5-84ded6ad9cfb")
    public String getDescription() {
        IModelingSession modelingSession = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        NoteType type = modelingSession.getMetamodelExtensions().getNoteType("description", "ModelerModule", this.elt.getMClass());
        return this.elt.getNoteContent(type);
    }

    @objid ("fb596180-74b4-42d9-8e57-0a0be73daa8f")
    public String getName() {
        return this.elt.getName();
    }

    @objid ("6b020e98-e815-4690-96a5-9d274fadd578")
    public void setDefaultName(String name) {
        CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(this.elt, name);
    }

    @objid ("946ad3ad-fe1c-4a6c-b334-8ee84f108a01")
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

    @objid ("d4ecddc3-f8d0-4470-8d5d-75d4cd314a33")
    public void setName(String name) {
        this.elt.setName(name);
    }

    @objid ("61f168d2-f222-4058-af7c-2f3ce2b06283")
    protected NamedElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("cb71b83e-c94e-44b8-b058-a4c207482cb0")
    public static final class MdaTypes {
        @objid ("69e7e511-ee9d-43dd-b697-658572b0b1d4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d52f747a-e9bd-4cec-8761-b49fc564e660")
        private static Stereotype MDAASSOCDEP;

        @objid ("7ce68998-5e9b-4c6b-9ee4-cb8d04a4b8c6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8ac558ea-7c0e-409c-8c5f-2f7e6e605598")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f81fdaa1-17e1-49a4-bf1f-60c18563c100");
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
