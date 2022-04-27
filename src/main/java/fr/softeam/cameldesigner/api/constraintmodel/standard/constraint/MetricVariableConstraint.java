/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << MetricVariableConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("41d4f52d-cd09-4afb-ac80-64b41afa7a0c")
public class MetricVariableConstraint extends UnaryConstraint {
    @objid ("cb8ae001-0e90-4ef3-99e1-caede96e9630")
    public static final String STEREOTYPE_NAME = "MetricVariableConstraint";

    /**
     * Tells whether a {@link MetricVariableConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << MetricVariableConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e44aee59-de76-4b2e-a3ef-c1a7e288d06c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricVariableConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << MetricVariableConstraint >> then instantiate a {@link MetricVariableConstraint} proxy.
     * 
     * @return a {@link MetricVariableConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("5b4e0800-863f-4e27-85c6-6bdc243ac2bb")
    public static MetricVariableConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricVariableConstraint.STEREOTYPE_NAME);
        return MetricVariableConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link MetricVariableConstraint} proxy from a {@link Constraint} stereotyped << MetricVariableConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link MetricVariableConstraint} proxy or <i>null</i>.
     */
    @objid ("c19467f7-105a-483a-87b8-f5adb23243a6")
    public static MetricVariableConstraint instantiate(final Constraint obj) {
        return MetricVariableConstraint.canInstantiate(obj) ? new MetricVariableConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricVariableConstraint} proxy from a {@link Constraint} stereotyped << MetricVariableConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link MetricVariableConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6716961b-1996-4fa3-be3b-7fc1a052945b")
    public static MetricVariableConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (MetricVariableConstraint.canInstantiate(obj))
        	return new MetricVariableConstraint(obj);
        else
        	throw new IllegalArgumentException("MetricVariableConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fbac8a90-46c6-4044-b236-7ac1aa205633")
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
        MetricVariableConstraint other = (MetricVariableConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("a0ea2f82-a22c-4a54-849e-ed380b051b9d")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Get the value to the 'metricVariable' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b4ccc140-21e6-4385-870e-f6bb3c056605")
    public MetricVariable getMetricVariable() {
          for (Class obj : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
           if (MetricVariable.canInstantiate(obj))
             return (MetricVariable)CamelDesignerProxyFactory.instantiate(obj, MetricVariable.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("ee71c2e4-2d65-4401-b626-a4f8d85be802")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricVariable' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7e55bbbb-9954-4088-8517-58435d4b69b9")
    public void setMetricVariable(final MetricVariable obj) {
        // Remove existing MetricVariables
        for (Class e : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
           if (MetricVariable.canInstantiate(e)) {
               ((Constraint) this.elt).getConstrainedElement().remove(e);
           }
        }
        // Set the MetricVariable
        if (obj != null) {
            ((Constraint) this.elt).getConstrainedElement().add(obj.getElement());
        }
    }

    @objid ("9a834d65-a0a7-442e-93ea-ccd90fd97bae")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("87e7cb50-29a7-4016-a8db-14ea8564c092")
    protected MetricVariableConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("8e6247ec-54b4-4782-a3c3-abf501857d20")
    public static final class MdaTypes {
        @objid ("25bc6c08-58de-464e-a283-7a1c52ebb5f2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9c4333e9-a2c5-4318-8e4d-3e536ac77169")
        private static Stereotype MDAASSOCDEP;

        @objid ("0a4f7aeb-3c14-454d-baf8-9098f6b3ab16")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5e5e3411-96b3-4724-881e-ff1f069e40a1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "80ac8ced-a3d3-4519-b015-f0726e46e256");
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
