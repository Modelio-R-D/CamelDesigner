/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.UmlModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << CamelConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fee51019-906e-4485-9a50-f01a00d74979")
public abstract class CamelConstraint extends ExpendableElement {
    @objid ("b0ce5528-260c-46f9-8515-464c8e37a6f4")
    public static final String STEREOTYPE_NAME = "CamelConstraint";

    /**
     * Tells whether a {@link CamelConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << CamelConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7248e247-a93d-463c-84ad-68405fd98cba")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelConstraint.STEREOTYPE_NAME));
    }

    @objid ("395afa24-a150-43ea-934e-0ca230c1dbec")
    public static CamelConstraint instantiate(final Constraint obj) {
        return UnaryConstraint.canInstantiate(obj) ? UnaryConstraint.instantiate(obj) :
            CompositeConstraint.canInstantiate(obj) ? CompositeConstraint.instantiate(obj) : null;
    }

    /**
     * Add a value to the 'elseConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f488d7ca-634c-4dd7-aa69-66c7852b1fc8")
    public void addElseConstraint(final IfThenConstraint obj) {
        if (obj!=null)
          ((Constraint) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    /**
     * Add a value to the 'ifConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1584c1c8-35bb-49e8-9cda-f307f9e00b44")
    public void addIfConstraint(final IfThenConstraint obj) {
        if (obj!=null)
          ((Constraint) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    /**
     * Add a value to the 'logicalConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3fdaac50-572a-411f-a4e8-e60583bc25c9")
    public void addLogicalConstraint(final LogicalConstraint obj) {
        if (obj!=null)
          ((Constraint) this.elt).getConstrainedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'thenConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("577468b9-657a-4c6b-96ad-c0f2216e62ec")
    public void addThenConstraint(final IfThenConstraint obj) {
        if (obj!=null)
          ((Constraint) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("bf0ca029-2deb-494d-a74e-1742c2beee1f")
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
        CamelConstraint other = (CamelConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("62f27f28-3271-419b-bcc7-b780d4fdf2af")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Get the values of the 'elseConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a69182dc-9932-4b7d-a36b-8e0f580323bc")
    public List<IfThenConstraint> getElseConstraint() {
        List<IfThenConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Constraint) this.elt).getConstraintDefinition()){
        	if (IfThenConstraint.canInstantiate(mObj))
        			results.add((IfThenConstraint)CamelDesignerProxyFactory.instantiate(mObj, IfThenConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'ifConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("74fbbb37-3d6d-4857-8919-3b4f1c0798f2")
    public List<IfThenConstraint> getIfConstraint() {
        List<IfThenConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Constraint) this.elt).getConstraintDefinition()){
        	if (IfThenConstraint.canInstantiate(mObj))
        			results.add((IfThenConstraint)CamelDesignerProxyFactory.instantiate(mObj, IfThenConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'logicalConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3c822573-6184-4575-98bf-31f07a4bf2dc")
    public List<LogicalConstraint> getLogicalConstraint() {
        List<LogicalConstraint> results = new ArrayList<>();
        for (UmlModelElement mObj : ((Constraint) this.elt).getConstrainedElement()){
        	if (LogicalConstraint.canInstantiate(mObj))
        			results.add((LogicalConstraint)CamelDesignerProxyFactory.instantiate(mObj, LogicalConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'thenConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("70dbc850-90d6-47dc-b1ea-e4bb9ae5479e")
    public List<IfThenConstraint> getThenConstraint() {
        List<IfThenConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Constraint) this.elt).getConstraintDefinition()){
        	if (IfThenConstraint.canInstantiate(mObj))
        			results.add((IfThenConstraint)CamelDesignerProxyFactory.instantiate(mObj, IfThenConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("7f87027d-d7db-4cc1-9d8f-5d89be85bfee")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'elseConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a070fd36-b868-4f40-8ea4-c26cee663fc7")
    public boolean removeElseConstraint(final IfThenConstraint obj) {
        return (obj!=null)? ((Constraint) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'ifConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("eb05d323-10e8-40af-bb99-0e317bb3f6d1")
    public boolean removeIfConstraint(final IfThenConstraint obj) {
        return (obj!=null)? ((Constraint) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'logicalConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("68cf98c2-7bdf-4587-8c4d-a687842c628b")
    public boolean removeLogicalConstraint(final LogicalConstraint obj) {
        return (obj!=null)? ((Constraint) this.elt).getConstrainedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'thenConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("69071018-2c1e-4c81-b94c-60982a0042d9")
    public boolean removeThenConstraint(final IfThenConstraint obj) {
        return (obj!=null)? ((Constraint) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    @objid ("2a76f9d8-d8a0-4bf2-ba45-1b7733e422b6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("7a8abe7e-ec60-4ab2-b1f8-e93909dbf18f")
    protected CamelConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("c2b5b585-3d59-484d-8c6a-ed96326a9e5e")
    public static final class MdaTypes {
        @objid ("f78e746f-10ce-46eb-bd6f-a8e7aabe3a9c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2d081264-1326-4655-a868-d202b7e1a87f")
        private static Stereotype MDAASSOCDEP;

        @objid ("5fda5a82-1add-4be3-9f18-33173abe72ec")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ce9b041-602d-436e-b842-80bf610b3318")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4afa0df7-c748-4db8-b9a7-a082a8419c00");
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
