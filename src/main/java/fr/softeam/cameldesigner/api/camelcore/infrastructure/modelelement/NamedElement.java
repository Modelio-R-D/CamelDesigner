/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
<<<<<<< HEAD
=======
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
<<<<<<< HEAD
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Package;
=======
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213

/**
 * Proxy class to handle a {@link ModelElement} with << NamedElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f252b432-5dfa-429d-a585-2ea4461bf1ad")
public abstract class NamedElement extends CamelElement {
    @objid ("d1ba2503-8184-445d-920b-0ac737506104")
    public static final String STEREOTYPE_NAME = "NamedElement";

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

    @objid ("75dbd481-e110-4c67-bd00-171b6c0b08b9")
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
     * 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("82bbaeda-46b4-40a0-968c-aa3926d5f459")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("f7b1bb4f-d1ff-4cc8-9888-e1376291cfdf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Add a value to the 'annotations' role.<p>
     * Role description:
     * null
     */
    @objid ("12205ea5-2855-4122-96ae-48effc5fd76f")
    public void addAnnotations(final MmsObject obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), NamedElement.MdaTypes.MDAASSOCDEP);
            d.setName("annotations");
            d.putTagValue(NamedElement.MdaTypes.MDAASSOCDEP_ROLE, "annotations");
        }
    }

    /**
     * Get the values of the 'annotations' role.<p>
     * Role description:
     * null
     */
    @objid ("292f27c9-6361-4f56-8975-304b63081276")
    public List<MmsObject> getAnnotations() {
        List<MmsObject> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
            if ((d.isStereotyped(NamedElement.MdaTypes.MDAASSOCDEP)
                    && Objects.equals(d.getTagValue(NamedElement.MdaTypes.MDAASSOCDEP_ROLE), "annotations")
                    && d.getDependsOn().isStereotyped(MmsObject.MdaTypes.STEREOTYPE_ELT))) {
        
                ModelElement mObj = d.getDependsOn();
                if (MmsConceptInstance.canInstantiate(mObj))
                    results.add((MmsConceptInstance)CamelDesignerProxyFactory.instantiate(mObj, MmsConceptInstance.STEREOTYPE_NAME));
        
                if (MmsConcept.canInstantiate(mObj))
                    results.add((MmsConcept)CamelDesignerProxyFactory.instantiate(mObj, MmsConcept.STEREOTYPE_NAME));
        
                if (MmsProperty.canInstantiate(mObj))
                    results.add((MmsProperty)CamelDesignerProxyFactory.instantiate(mObj, MmsProperty.STEREOTYPE_NAME));
        
                if (MmsPropertyInstance.canInstantiate(mObj))
                    results.add((MmsPropertyInstance)CamelDesignerProxyFactory.instantiate(mObj, MmsPropertyInstance.STEREOTYPE_NAME));
        
            }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fb596180-74b4-42d9-8e57-0a0be73daa8f")
    public String getName() {
        return this.elt.getName();
    }

    /**
     * Remove a value from the 'annotations' role.<p>
     * Role description:
     * null
     */
    @objid ("4009961b-6702-40c0-941e-56e36f356607")
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

    @objid ("6b020e98-e815-4690-96a5-9d274fadd578")
    public void setDefaultName(String name) {
        CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(this.elt, name);
    }

    @objid ("d4ecddc3-f8d0-4470-8d5d-75d4cd314a33")
    public void setName(String name) {
        this.elt.setName(name);
    }

    @objid ("c0061f4d-c0d9-4cd1-9ff4-5d8f99893515")
    protected NamedElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("e4cf1239-9588-402a-af81-a78563e98124")
    @Override
    public List<CamelElement> getChilds() {
        return super.getChilds();
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

    @objid ("537a5766-13fd-48a8-98c1-0c395e999698")
    public String getDescription() {
        NoteType type = CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().getNoteType("description", "ModelerModule", this.elt.getMClass());
        return this.elt.getNoteContent(type);
    }

    @objid ("cb71b83e-c94e-44b8-b058-a4c207482cb0")
    public static final class MdaTypes {
        @objid ("7f05437e-19dc-461b-bf7b-38f6ce8bba71")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ed209b36-081e-48af-853f-93660ec32598")
        private static Stereotype MDAASSOCDEP;

        @objid ("f6e38bd4-741e-4487-a76b-b86fb3ce59e6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("46d22a90-9516-4a88-b032-5e66c54bc5a5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f81fdaa1-17e1-49a4-bf1f-60c18563c100");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
<<<<<<< HEAD
            if(CamelDesignerModule.getInstance() != null) {
                init(CamelDesignerModule.getInstance().getModuleContext());
            }
        }
=======
        if(CamelDesignerModule.getInstance() != null) {
            init(CamelDesignerModule.getInstance().getModuleContext());
        }
    }
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
    }

}
