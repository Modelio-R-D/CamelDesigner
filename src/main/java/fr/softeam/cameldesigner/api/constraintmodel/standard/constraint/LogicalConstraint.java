/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("87f90b08-3994-4ea3-9507-5cad19af6564")
    public static final String STEREOTYPE_NAME = "LogicalConstraint";

    @objid ("0b4c6aef-79f9-4440-b547-6197d2841e34")
    public static final String LOGICALOPERATOR_TAGTYPE = "logicalOperator";

    /**
     * Tells whether a {@link LogicalConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << LogicalConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("508c3402-4565-4913-a371-c9145f1c8e1b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LogicalConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << LogicalConstraint >> then instantiate a {@link LogicalConstraint} proxy.
     * 
     * @return a {@link LogicalConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("a4013796-a997-425e-bf52-ecfaf19d0fda")
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
    @objid ("9f3fc3d8-4315-4b30-b682-7101ae66a0e0")
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
    @objid ("2658f5fc-1015-4f52-bf57-6128764890e7")
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
    @objid ("fbe63f0e-68f7-4ba8-8bf2-3bd5ca50f0d8")
    public void addConstraints(final CamelConstraint obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LogicalConstraint.MdaTypes.MDAASSOCDEP);
            d.setName("constraints");
            d.putTagValue(LogicalConstraint.MdaTypes.MDAASSOCDEP_ROLE, "constraints");
        }
    }

    @objid ("7ce317b7-4f6d-455e-b786-98ddead1369a")
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
    @objid ("2f56b018-b102-4099-9c31-2b58fc05fe20")
    public List<CamelConstraint> getConstraints() {
        List<CamelConstraint> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(LogicalConstraint.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(LogicalConstraint.MdaTypes.MDAASSOCDEP_ROLE), "constraints")){
              if (MetricConstraint.canInstantiate(d.getDependsOn()))
                results.add((MetricConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
              if (AttributeConstraint.canInstantiate(d.getDependsOn()))
                results.add((AttributeConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
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
    @objid ("f924c30b-8f1d-4834-8046-4d395fa350fd")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'logicalOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("067f803a-b085-461a-ac70-0476675ca36c")
    public String getLogicalOperator() {
        return this.elt.getTagValue(LogicalConstraint.MdaTypes.LOGICALOPERATOR_TAGTYPE_ELT);
    }

    @objid ("1a2e653b-3d94-4448-9231-c326c11cea8c")
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
    @objid ("c371fff9-40b7-4ae0-acbb-b4829f4680ea")
    public boolean removeConstraints(final CamelConstraint obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(LogicalConstraint.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(LogicalConstraint.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
    @objid ("cd7cba7f-1cc8-481d-8d85-6b72ec72e48f")
    public void setLogicalOperator(final String value) {
        this.elt.putTagValue(LogicalConstraint.MdaTypes.LOGICALOPERATOR_TAGTYPE_ELT, value);
    }

    @objid ("cecf2787-76fc-4efb-8c6a-9365a22290d6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("1b2f5200-3948-48f2-8b61-db6e8a8a1db2")
    protected LogicalConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("f5630e18-22a2-424e-9cbf-865d8acd7362")
    public static final class MdaTypes {
        @objid ("623afd46-7e36-4cc3-a0ba-104ed907896e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4e901a20-dbaf-47ba-a1e4-fc7a6b665dce")
        public static TagType LOGICALOPERATOR_TAGTYPE_ELT;

        @objid ("17a23ded-d825-4d9f-be3f-a2cf29fdbcc4")
        private static Stereotype MDAASSOCDEP;

        @objid ("6d459d84-3484-4bc0-8fea-8cab02e80d99")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("11a3b0df-cff5-45ff-b66b-49d99e6979af")
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
