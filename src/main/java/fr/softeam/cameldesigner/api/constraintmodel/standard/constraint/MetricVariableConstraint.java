/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("4e0621e8-21c0-4b40-9552-1e332f8cef33")
    public static final String STEREOTYPE_NAME = "MetricVariableConstraint";

    /**
     * Tells whether a {@link MetricVariableConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << MetricVariableConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5ca80266-a8ce-4a44-a97f-4f839d7a37f9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricVariableConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << MetricVariableConstraint >> then instantiate a {@link MetricVariableConstraint} proxy.
     * 
     * @return a {@link MetricVariableConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("2a2175d2-e438-4d82-a2f8-d9030cc13bcb")
    public static MetricVariableConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricVariableConstraint.STEREOTYPE_NAME);
        return MetricVariableConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link MetricVariableConstraint} proxy from a {@link Constraint} stereotyped << MetricVariableConstraint >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Constraint
     * @return a {@link MetricVariableConstraint} proxy or <i>null</i>.
     */
    @objid ("2ce46125-5be2-4f33-b035-6d5aecfa7f9d")
    public static MetricVariableConstraint instantiate(final Constraint obj) {
        return MetricVariableConstraint.canInstantiate(obj) ? new MetricVariableConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricVariableConstraint} proxy from a {@link Constraint} stereotyped << MetricVariableConstraint >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Constraint}
     * @return a {@link MetricVariableConstraint} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e2cf379c-a1b4-4ef5-a525-608fb8722fbb")
    public static MetricVariableConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (MetricVariableConstraint.canInstantiate(obj))
            return new MetricVariableConstraint(obj);
        else
            throw new IllegalArgumentException("MetricVariableConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("02ee24ff-41e2-415a-b4ed-48104071a5d5")
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
     * 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("74dbbb0d-e7eb-4111-b05d-19e6e50834da")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Get the value to the 'metricVariable' role.<p>
     * Role description:
     * null
     */
    @objid ("7a3e9d36-04c9-4248-95b9-47ec7ecc2016")
    public MetricVariable getMetricVariable() {
        for (Class obj : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
         if (MetricVariable.canInstantiate(obj))
           return (MetricVariable)CamelDesignerProxyFactory.instantiate(obj, MetricVariable.STEREOTYPE_NAME);
        }
        return null;
    }

    @objid ("d39a38e0-ae4d-430d-b31c-e93a78e44848")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricVariable' role.<p>
     * Role description:
     * null
     */
    @objid ("7b877ddb-d116-4713-8a84-3dd08383a85a")
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

    @objid ("099750f7-06d8-49c2-b2e7-9ee33192852a")
    protected MetricVariableConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("8e6247ec-54b4-4782-a3c3-abf501857d20")
    public static final class MdaTypes {
        @objid ("b1edb85d-9e35-4328-9a4c-6ef9755c401e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5be387ac-6a4b-4a39-bdfc-3ac3757efce0")
        private static Stereotype MDAASSOCDEP;

        @objid ("01fa8f71-4d14-4ae1-bf50-0c4b6b7d9fc8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("52473939-1426-4b30-a291-89dcaca12c4c")
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
