/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("6d51c541-4681-4e19-9484-b8c9fe0e2ca1")
    public static final String STEREOTYPE_NAME = "LogicalConstraint";

    @objid ("66655f50-d567-49b2-acb7-64b4d027da0a")
    public static final String LOGICALOPERATOR_TAGTYPE = "logicalOperator";

    /**
     * Tells whether a {@link LogicalConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << LogicalConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("94a2f45a-d090-4fd7-862f-432a48e98907")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LogicalConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << LogicalConstraint >> then instantiate a {@link LogicalConstraint} proxy.
     * 
     * @return a {@link LogicalConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("e0c5d828-ef06-4868-8d85-5dda67b9f27c")
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
    @objid ("cf3ba0f5-dda0-4e27-a8d7-86df3bab3b92")
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
    @objid ("1af7f059-05c4-43ef-aa43-2134eaf4c3b8")
    public static LogicalConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (LogicalConstraint.canInstantiate(obj))
        	return new LogicalConstraint(obj);
        else
        	throw new IllegalArgumentException("LogicalConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("84e3a515-aa90-422c-b83c-48269d7eff65")
    public void addConstraints(final CamelConstraint obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LogicalConstraint.MdaTypes.MDAASSOCDEP);
            d.setName("constraints");
            d.putTagValue(LogicalConstraint.MdaTypes.MDAASSOCDEP_ROLE, "constraints");
        }
    }

    @objid ("c3241e77-f7e6-4e04-ae0b-b91f6dc9e6ca")
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
     * Get the values of the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("724bfe83-e9c9-4718-994f-53ffe2860ed4")
    public List<CamelConstraint> getConstraints() {
        List<CamelConstraint> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(LogicalConstraint.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(LogicalConstraint.MdaTypes.MDAASSOCDEP_ROLE), "constraints")){
              if (MetricConstraint.canInstantiate(d.getDependsOn()))
                results.add((MetricConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
              if (MetricVariableConstraint.canInstantiate(d.getDependsOn()))
                results.add((MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricVariableConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
              if (IfThenConstraint.canInstantiate(d.getDependsOn()))
                results.add((IfThenConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), IfThenConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
              if (LogicalConstraint.canInstantiate(d.getDependsOn()))
                results.add((LogicalConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LogicalConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("e124b2f6-ade3-4a90-a91c-73cf08cb8f74")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'logicalOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fb6e4e75-4290-4312-8c89-0d4edbd047a1")
    public String getLogicalOperator() {
        return this.elt.getTagValue(LogicalConstraint.MdaTypes.LOGICALOPERATOR_TAGTYPE_ELT);
    }

    @objid ("fc99d2ce-6d72-4754-9fc9-ed6f7a04441c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1cb53372-d871-4fb1-be84-16ccae432a70")
    public boolean removeConstraints(final CamelConstraint obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(LogicalConstraint.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(LogicalConstraint.MdaTypes.MDAASSOCDEP_ROLE), "constraints")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'logicalOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3b0731f3-599e-46b2-b078-7ddce8e70a07")
    public void setLogicalOperator(final String value) {
        this.elt.putTagValue(LogicalConstraint.MdaTypes.LOGICALOPERATOR_TAGTYPE_ELT, value);
    }

    @objid ("cecf2787-76fc-4efb-8c6a-9365a22290d6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("ffdc2d65-6ef9-486e-8105-d3d4803ae3c7")
    protected LogicalConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("f5630e18-22a2-424e-9cbf-865d8acd7362")
    public static final class MdaTypes {
        @objid ("25a8e2fd-e0d6-401d-8d09-e3d3a6b149e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("97c94c5a-3bc4-436d-a3ea-44025d0d3d7c")
        public static TagType LOGICALOPERATOR_TAGTYPE_ELT;

        @objid ("2a185d61-9c81-46c2-bbec-2ab45e2710d1")
        private static Stereotype MDAASSOCDEP;

        @objid ("d5732ed5-6ffb-4b05-8059-1154bf9838d3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5c23496b-c8e3-409c-a4bd-12e056920bc9")
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
