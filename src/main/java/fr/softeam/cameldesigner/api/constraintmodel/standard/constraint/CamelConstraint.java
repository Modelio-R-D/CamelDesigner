/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("d9ccf024-47f1-43c0-9eca-ab2eb31ede10")
    public static final String STEREOTYPE_NAME = "CamelConstraint";

    /**
     * Tells whether a {@link CamelConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << CamelConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1f5bba79-c7e5-454d-8e7d-0c6ef89e60ec")
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
    @objid ("7045dc98-9383-44a3-a787-746a9743dbba")
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
    @objid ("63eb5428-7a11-4d8b-a34a-74f946292d57")
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
    @objid ("1f45a8b5-c13b-44e4-9064-f82b0ad8e251")
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
    @objid ("d47775b4-b055-4046-981c-797dd3f47c5d")
    public void addThenConstraint(final IfThenConstraint obj) {
        if (obj!=null)
          ((Constraint) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("7ff47f4d-2ae0-4d72-ae00-6fba1ce7dca8")
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
    @objid ("dd851a01-ff20-400f-b2c6-690a12383ad9")
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
    @objid ("9ac65809-852f-49b6-951d-55806caa9791")
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
    @objid ("3780fa6a-0b06-4add-9d76-540efa7bdacd")
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
    @objid ("02f30ba2-1255-49ce-8fb1-c102744e3ecb")
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
    @objid ("b307b101-4b7e-4499-bd81-497145e4c723")
    public List<IfThenConstraint> getThenConstraint() {
        List<IfThenConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Constraint) this.elt).getConstraintDefinition()){
        	if (IfThenConstraint.canInstantiate(mObj))
        			results.add((IfThenConstraint)CamelDesignerProxyFactory.instantiate(mObj, IfThenConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("323615ba-8973-4964-b421-fe099f26a031")
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
    @objid ("2278c2bf-cb69-45f3-9adf-b9e5b4c2bde0")
    public boolean removeElseConstraint(final IfThenConstraint obj) {
        return (obj!=null)? ((Constraint) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'ifConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("be4329d0-eb84-418d-804e-3375a16ec051")
    public boolean removeIfConstraint(final IfThenConstraint obj) {
        return (obj!=null)? ((Constraint) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'logicalConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c3426ce6-8739-457e-a7a6-2451dd0cb825")
    public boolean removeLogicalConstraint(final LogicalConstraint obj) {
        return (obj!=null)? ((Constraint) this.elt).getConstrainedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'thenConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("da540efd-60f1-4b7c-9ef3-9c577077323f")
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

    @objid ("c4f864f6-b135-42ad-8642-af1fd6e4ba7e")
    protected CamelConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("c2b5b585-3d59-484d-8c6a-ed96326a9e5e")
    public static final class MdaTypes {
        @objid ("26b38ba7-dedb-4313-a1e3-deaf5e33479a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1d5defc9-d514-43a0-9b01-5be75680d7b9")
        private static Stereotype MDAASSOCDEP;

        @objid ("429c19cd-5ce2-41ff-a36f-2fef95759b82")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a4e253ff-8a65-4150-bf7d-d70d6f9c87f5")
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
