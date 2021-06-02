/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.03

 * This file was generated on 3/29/21 4:01 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.AbstractCamelDiagram;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

/**
 * Proxy class to handle a {@link ModelElement} with << NamedElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f252b432-5dfa-429d-a585-2ea4461bf1ad")
public abstract class NamedElement extends CamelElement {
    @objid ("6fd738e0-110b-41ee-aa70-2184d7143c06")
    public static final String STEREOTYPE_NAME = "NamedElement";

    /**
     * Add a value to the 'product' role.<p>
     * Role description:
     * null
     *
     */
    @objid ("e438ae92-f9d1-450d-91e4-88e907f7c919")
    public void addProduct(final AbstractCamelDiagram obj) {
        if (obj!=null)
          ((ModelElement) this.elt).getProduct().add(obj.getElement());
    }

    @objid ("87b59549-25c8-4acc-9d4b-957758081dfa")
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
    @objid ("779d93c5-bb64-4d6d-bdda-a42e8f4f082d")
    @Override
    public ModelElement getElement() {
        return (ModelElement) super.getElement();
    }


    @objid ("f76a10b0-16e0-4d50-b0a6-8090e0ac8649")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'product' role.<p>
     * Role description:
     * null
     *
     */
    @objid ("05af83bd-c752-44e9-8d4b-8c437823408c")
    public boolean removeProduct(final AbstractCamelDiagram obj) {
        return (obj!=null)? ((ModelElement) this.elt).getProduct().remove(obj.getElement()) : false;
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

    @objid ("721fe7a5-cb0d-4a03-a412-502a66ae337d")
    protected NamedElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("cb71b83e-c94e-44b8-b058-a4c207482cb0")
    public static final class MdaTypes {
        @objid ("d9297149-fc68-4b50-9e00-b9df390044e8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6094deab-bd01-44c7-bc9c-02a992e859c2")
        private static Stereotype MDAASSOCDEP;

        @objid ("60f926d9-bb20-48d7-a29c-17e6fd9d47f3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dca2fe81-0403-46a4-a0ff-83cc9dffeb01")
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
