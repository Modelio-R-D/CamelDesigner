/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("ff5472f4-6b15-458e-ac01-4e5a34544e26")
    public static final String STEREOTYPE_NAME = "CamelConstraint";

    /**
     * Tells whether a {@link CamelConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << CamelConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bdfd1909-3431-4d95-beb1-c741788cdb44")
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
    @objid ("cc6a126c-25e2-4879-9bc4-9a0267770a01")
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
    @objid ("e69ab89c-5c5a-4ff3-aec1-ab74e81fc620")
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
    @objid ("00a07f69-1f9e-4985-94d5-47a83fbee492")
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
    @objid ("94aa4297-0ba9-4fbf-88fd-db81519a5195")
    public void addThenConstraint(final IfThenConstraint obj) {
        if (obj!=null)
          ((Constraint) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("6698130a-9e87-451a-8b0d-56cee220c507")
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
    @objid ("72dba7ee-cfde-487a-897f-4a352a201204")
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
    @objid ("e8656542-b56a-49d9-bb64-352ac96bdc7e")
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
    @objid ("de4e1d44-34d1-4f53-bc37-04282f9565ef")
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
    @objid ("6e296b2b-e3f5-4a74-8e4c-4895182cfcf3")
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
    @objid ("12698870-07ce-472b-b102-891b4323cd40")
    public List<IfThenConstraint> getThenConstraint() {
        List<IfThenConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Constraint) this.elt).getConstraintDefinition()){
        	if (IfThenConstraint.canInstantiate(mObj))
        			results.add((IfThenConstraint)CamelDesignerProxyFactory.instantiate(mObj, IfThenConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("629bcbcd-9821-47b4-8abd-3c19af262ef4")
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
    @objid ("652fa9c2-e453-4aef-847c-397c890f5984")
    public boolean removeElseConstraint(final IfThenConstraint obj) {
        return (obj!=null)? ((Constraint) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'ifConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("55401297-a9a0-4461-a15a-0d3cb51d7982")
    public boolean removeIfConstraint(final IfThenConstraint obj) {
        return (obj!=null)? ((Constraint) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'logicalConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8795b6dd-423a-4894-aaa9-34b685b528cf")
    public boolean removeLogicalConstraint(final LogicalConstraint obj) {
        return (obj!=null)? ((Constraint) this.elt).getConstrainedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'thenConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("637cef20-5e3c-49f1-8665-2c1321f061d6")
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

    @objid ("cc482441-d9a7-45c3-b463-85696497da7e")
    protected CamelConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("c2b5b585-3d59-484d-8c6a-ed96326a9e5e")
    public static final class MdaTypes {
        @objid ("f7aca5ff-1bfe-4351-9db2-64a453cea8b7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("87ce73a8-a3ef-456b-bdbc-60e87cb6abf4")
        private static Stereotype MDAASSOCDEP;

        @objid ("85435e30-c247-4950-a2d6-793b774e8af6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0d57551d-5ecb-4427-93fc-e19b4bf15e75")
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
