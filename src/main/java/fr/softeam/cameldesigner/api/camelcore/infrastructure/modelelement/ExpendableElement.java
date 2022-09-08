/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << ExpendableElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0839abd9-e1c0-4f4c-877c-67000617ef5e")
public abstract class ExpendableElement extends NamedElement {
    @objid ("8e99c7fa-57e7-4254-991c-dae85b94af1d")
    public static final String STEREOTYPE_NAME = "ExpendableElement";

    /**
     * Tells whether a {@link ExpendableElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ExpendableElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("911a9cf0-bb62-4843-977e-cc1318b1ee99")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExpendableElement.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'annotations' role.<p>
     * Role description:
     * null
     */
    @objid ("fe2dd483-3577-4904-a905-9c1899b813ee")
    public void addAnnotations(final MmsObject obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ExpendableElement.MdaTypes.MDAASSOCDEP);
            d.setName("annotations");
            d.putTagValue(ExpendableElement.MdaTypes.MDAASSOCDEP_ROLE, "annotations");
        }
    }

    @objid ("8d2faf79-f929-487d-8ae3-189c21352e6b")
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
        ExpendableElement other = (ExpendableElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'annotations' role.<p>
     * Role description:
     * null
     */
    @objid ("5e4f76f9-726a-4e1a-a9b8-ab0c9a958d0d")
    public List<MmsObject> getAnnotations() {
        List<MmsObject> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(ExpendableElement.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ExpendableElement.MdaTypes.MDAASSOCDEP_ROLE), "annotations")){
              if (MmsConcept.canInstantiate(d.getDependsOn()))
                results.add((MmsConcept)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConcept.MdaTypes.STEREOTYPE_ELT.getName()));
              if (MmsConceptInstance.canInstantiate(d.getDependsOn()))
                results.add((MmsConceptInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getName()));
              if (MmsProperty.canInstantiate(d.getDependsOn()))
                results.add((MmsProperty)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsProperty.MdaTypes.STEREOTYPE_ELT.getName()));
              if (MmsPropertyInstance.canInstantiate(d.getDependsOn()))
                results.add((MmsPropertyInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsPropertyInstance.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link ModelElement}.
     * 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("16225f55-46e7-4497-afb8-8a0ba32ea6ba")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("9fb4ff71-f150-4d62-a1af-845e176b792d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'annotations' role.<p>
     * Role description:
     * null
     */
    @objid ("cf1edacb-04ca-419c-b96f-ab6ddb15243c")
    public boolean removeAnnotations(final MmsObject obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ExpendableElement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ExpendableElement.MdaTypes.MDAASSOCDEP_ROLE), "annotations")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("c4771a87-5ed6-462d-9e3c-17309aa32d89")
    protected ExpendableElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("cbcfe587-f4d9-4299-85a2-20ec2c0d6d7f")
    public static final class MdaTypes {
        @objid ("0e3920db-bb9d-4d6a-aa16-f6d74128afb3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8807faf6-d78f-40a1-bf00-b0369376a646")
        private static Stereotype MDAASSOCDEP;

        @objid ("0837d616-2d12-4702-a9c7-8a176ffa6cf4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f0a925ed-dbf9-48d5-a188-a99101bdc10b")
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
