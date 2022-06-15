/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("84002464-191a-49c6-acaa-0aebd60cca46")
    public static final String STEREOTYPE_NAME = "ExpendableElement";

    /**
     * Tells whether a {@link ExpendableElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ExpendableElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c9de39ab-d18f-49f8-8a52-2e9f1c45c119")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExpendableElement.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'annotations' role.<p>
     * Role description:
     * null
     */
    @objid ("ebedd58c-4784-451d-ba35-0572d76bf606")
    public void addAnnotations(final MmsObject obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ExpendableElement.MdaTypes.MDAASSOCDEP);
            d.setName("annotations");
            d.putTagValue(ExpendableElement.MdaTypes.MDAASSOCDEP_ROLE, "annotations");
        }
    }

    @objid ("5adb0bb5-26e0-49e3-96d2-c0b6c60eedf2")
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
    @objid ("893d38be-6aa1-4cbb-9c25-3ec46ae8a483")
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
    @objid ("fdcc72e5-dc75-427d-a62a-f0600094e153")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("99a6a664-6a8f-41bd-a952-0b710e8b4fe8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'annotations' role.<p>
     * Role description:
     * null
     */
    @objid ("480711a9-5558-4c25-86b6-bf7f21a948a6")
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

    @objid ("1f20c2ae-549e-46bc-9480-df351f11fb8a")
    protected ExpendableElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("cbcfe587-f4d9-4299-85a2-20ec2c0d6d7f")
    public static final class MdaTypes {
        @objid ("ac2d515b-174b-40b0-8a93-409d4d889a37")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("236de19e-e6b8-4df6-aed2-0cd01d1c1804")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ae76754-7d56-408f-a442-1415e3488831")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a2714e2c-b652-407e-9e19-0168b72c23ca")
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
