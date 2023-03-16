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
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint;
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
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << LogicalConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("53b9a5c1-0a76-403f-aa18-f79a25ba62a5")
public class LogicalConstraint extends CompositeConstraint {
    @objid ("8cd93a3c-6d20-465b-906c-84b0955ddd8a")
    public static final String STEREOTYPE_NAME = "LogicalConstraint";

    @objid ("5a63d179-493b-4a4d-bb40-0b034984a2df")
    public static final String LOGICALOPERATOR_TAGTYPE = "logicalOperator";

    /**
     * Tells whether a {@link LogicalConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << LogicalConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a2fdd11e-0e24-400e-9fe9-bc42750a40b1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LogicalConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << LogicalConstraint >> then instantiate a {@link LogicalConstraint} proxy.
     * 
     * @return a {@link LogicalConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("ae49b383-3430-49af-9779-6242f49fcb79")
    public static LogicalConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, LogicalConstraint.STEREOTYPE_NAME);
        return LogicalConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link LogicalConstraint} proxy from a {@link Constraint} stereotyped << LogicalConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link LogicalConstraint} proxy or <i>null</i>.
     */
    @objid ("cbd72e41-6966-4e37-92be-23455e57b915")
    public static LogicalConstraint instantiate(final Constraint obj) {
        return LogicalConstraint.canInstantiate(obj) ? new LogicalConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LogicalConstraint} proxy from a {@link Constraint} stereotyped << LogicalConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link LogicalConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("81d7aace-9297-4620-8469-843cb0f92985")
    public static LogicalConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (LogicalConstraint.canInstantiate(obj))
        	return new LogicalConstraint(obj);
        else
        	throw new IllegalArgumentException("LogicalConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'constrained' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c9182e3f-fb68-4e27-8932-4dc5b9296940")
    public void addConstrained(final CamelConstraint obj) {
        if (obj!=null)
          ((Constraint) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("eab256fb-d1fc-4f1c-a25a-4ab28d9bb668")
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
        LogicalConstraint other = (LogicalConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'constrained' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5dd6c694-17e7-4e25-b224-9e0647dd04c3")
    public List<CamelConstraint> getConstrained() {
        List<CamelConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Constraint) this.elt).getConstraintDefinition()){
        	if (MetricConstraint.canInstantiate(mObj))
        			results.add((MetricConstraint)CamelDesignerProxyFactory.instantiate(mObj, MetricConstraint.STEREOTYPE_NAME));
        	if (AttributeConstraint.canInstantiate(mObj))
        			results.add((AttributeConstraint)CamelDesignerProxyFactory.instantiate(mObj, AttributeConstraint.STEREOTYPE_NAME));
        	if (MetricVariableConstraint.canInstantiate(mObj))
        			results.add((MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(mObj, MetricVariableConstraint.STEREOTYPE_NAME));
        	if (IfThenConstraint.canInstantiate(mObj))
        			results.add((IfThenConstraint)CamelDesignerProxyFactory.instantiate(mObj, IfThenConstraint.STEREOTYPE_NAME));
        	if (LogicalConstraint.canInstantiate(mObj))
        			results.add((LogicalConstraint)CamelDesignerProxyFactory.instantiate(mObj, LogicalConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("f785735c-dac5-4b20-b384-acfd0f24c21f")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'logicalOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3ed86d92-0cbc-4f7a-a0ac-16038a23dc47")
    public String getLogicalOperator() {
        return this.elt.getTagValue(LogicalConstraint.MdaTypes.LOGICALOPERATOR_TAGTYPE_ELT);
    }

    @objid ("8093771f-27e7-40b7-a93f-99bd379f6d6a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'constrained' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("dff312df-18eb-4c3b-b85c-118eb1f51ffc")
    public boolean removeConstrained(final CamelConstraint obj) {
        return (obj!=null)? ((Constraint) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'logicalOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("89a5e152-2777-4f3d-8507-a61a1393a11f")
    public void setLogicalOperator(final String value) {
        this.elt.putTagValue(LogicalConstraint.MdaTypes.LOGICALOPERATOR_TAGTYPE_ELT, value);
    }

    @objid ("cecf2787-76fc-4efb-8c6a-9365a22290d6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("4eb88efc-f99a-4ed7-83af-43b7caa8c0bd")
    protected LogicalConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("f5630e18-22a2-424e-9cbf-865d8acd7362")
    public static final class MdaTypes {
        @objid ("05ddfa9b-a453-44a7-8201-7268bb3b1a70")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5b65ec60-413e-4c96-9653-9388b2a5cc7b")
        public static TagType LOGICALOPERATOR_TAGTYPE_ELT;

        @objid ("3183ed0d-1c30-45d0-b840-b197e257d472")
        private static Stereotype MDAASSOCDEP;

        @objid ("6c7e5eeb-f577-47c2-8e8c-4c5f9a39fad9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("59746302-6013-4622-b208-c76127ddeae2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a266bdba-acc2-4ce2-81a0-4b2f404f7db7");
            LOGICALOPERATOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "eb2e6178-406b-46d5-80d2-5453be9fce45");
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
