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
<<<<<<< HEAD
    @objid ("24c99089-cf31-4d3b-90c4-ad9d3230825b")
=======
    @objid ("4524c8d4-6138-4ca0-9980-c4c34a3f481f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "ExpendableElement";

    /**
     * Tells whether a {@link ExpendableElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ExpendableElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("5cce6a1a-d4f6-464d-aebf-3e597e9eaf5f")
=======
    @objid ("342db10d-1742-40ef-ab85-dfa25c32fd33")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExpendableElement.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'annotations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("07432c71-df68-43ba-b0a1-525984cb4833")
=======
    @objid ("2a814211-0455-4f60-ab7f-5bf049c2d07e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addAnnotations(final MmsObject obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ExpendableElement.MdaTypes.MDAASSOCDEP);
            d.setName("annotations");
            d.putTagValue(ExpendableElement.MdaTypes.MDAASSOCDEP_ROLE, "annotations");
        }
    }

<<<<<<< HEAD
    @objid ("fe2cfe5e-3750-48f1-bbcb-940cc99fdbe0")
=======
    @objid ("64ce08d5-a0d8-42cd-b5a5-72f3a6c079bb")
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
        ExpendableElement other = (ExpendableElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'annotations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("745b540a-c166-4c8f-82a8-e27203eee736")
=======
    @objid ("63fbaa10-6559-410b-9141-92493120b9ce")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("8323bb64-feca-4689-b047-3413f6e42f10")
=======
    @objid ("e496d813-0c71-45d5-8367-56fd6f50cef1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

<<<<<<< HEAD
    @objid ("0a1d9c98-bddb-4f8e-a1a2-38f78750b119")
=======
    @objid ("84df5669-3192-4b49-aea7-c72f1ec09ab9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("10f50d86-69a0-4c76-ad84-8ecb04cd1803")
=======
    @objid ("73cf0b45-6af4-4075-bf8a-1c0de60c789a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("f12b74b3-f012-4d95-a553-fbf3c1fb2a42")
=======
    @objid ("5096f5e9-0be9-453e-8bc7-06b6b0f9d903")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ExpendableElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("cbcfe587-f4d9-4299-85a2-20ec2c0d6d7f")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("10529804-8d19-4a85-a9ca-fd7dfc32d145")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ef3390c5-d573-477b-bd89-a299d5d1f078")
        private static Stereotype MDAASSOCDEP;

        @objid ("89c22f51-22d3-405a-a708-7067fe03e9aa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8874023d-ce93-465a-bf1d-d49874939941")
=======
        @objid ("552e6bd7-289d-40da-ae1a-cb56703397bb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b1d1765e-fd71-4aad-ab6e-5e4c14a02b13")
        private static Stereotype MDAASSOCDEP;

        @objid ("6a433385-bfd9-4298-a858-9fd3668dc541")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d77f48d-2d01-4321-83ff-4522cce7a986")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
