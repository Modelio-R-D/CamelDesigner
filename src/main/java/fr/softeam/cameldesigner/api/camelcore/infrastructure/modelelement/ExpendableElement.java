/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("ef30b236-67fd-4b89-862c-f754a3c9210f")
    public static final String STEREOTYPE_NAME = "ExpendableElement";

    /**
     * Tells whether a {@link ExpendableElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ExpendableElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ff12156d-4007-497d-aee5-6402799f28b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExpendableElement.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'annotations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1111f4ab-640c-4e29-810f-d80e5b394f4f")
    public void addAnnotations(final MmsObject obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ExpendableElement.MdaTypes.MDAASSOCDEP);
            d.setName("annotations");
            d.putTagValue(ExpendableElement.MdaTypes.MDAASSOCDEP_ROLE, "annotations");
        }
    }

    @objid ("9ce1574b-fc1d-4df1-89c0-62b4645ad85e")
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
     * 
     */
    @objid ("f87556a8-335c-493e-9347-41a777d79096")
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
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("bed08903-4883-4475-8b63-052ccb536b1d")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("3adf5683-3306-4cb8-8354-ff3b4f73267c")
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
    @objid ("46c49b2f-a52f-4bdf-b808-44dadcb382e9")
    public boolean removeAnnotations(final MmsObject obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ExpendableElement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ExpendableElement.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("32b0fd74-de5f-49e0-b6a9-045fa85ccaa9")
    protected ExpendableElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("cbcfe587-f4d9-4299-85a2-20ec2c0d6d7f")
    public static final class MdaTypes {
        @objid ("e6f93c2b-05aa-486a-87d8-68b823d78925")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c1606a1d-47ab-4bcd-9848-db92fba8a9f0")
        private static Stereotype MDAASSOCDEP;

        @objid ("ea13ab68-c47e-47ad-918d-2b3303f0aec9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7baee1bb-fcb5-4786-94a9-96c918bfb413")
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
