/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("3102fa3f-88e4-45e5-968e-9f462521c559")
    public static final String STEREOTYPE_NAME = "MetricVariableConstraint";

    /**
     * Tells whether a {@link MetricVariableConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << MetricVariableConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c5a4d908-9476-4cf4-aa8c-b813ee3089c7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricVariableConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << MetricVariableConstraint >> then instantiate a {@link MetricVariableConstraint} proxy.
     * 
     * @return a {@link MetricVariableConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("7cf6b97f-a4b4-4602-8b3d-0c453e3d5f95")
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
    @objid ("a86dbc4b-12a3-4f6e-8068-64e9251500ae")
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
    @objid ("98b65384-bf1f-4044-8925-bdf88c726c29")
    public static MetricVariableConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (MetricVariableConstraint.canInstantiate(obj))
            return new MetricVariableConstraint(obj);
        else
            throw new IllegalArgumentException("MetricVariableConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1cdb8cf1-40c9-4d69-9ed8-f4bf7fed09dc")
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
    @objid ("80c1558b-1602-4fe5-9011-a99c6890b789")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Get the value to the 'metricVariable' role.<p>
     * Role description:
     * null
     */
    @objid ("bcd1c10e-6aea-4f79-80c2-0b591c014fc1")
    public MetricVariable getMetricVariable() {
        for (Class obj : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
         if (MetricVariable.canInstantiate(obj))
           return (MetricVariable)CamelDesignerProxyFactory.instantiate(obj, MetricVariable.STEREOTYPE_NAME);
        }
        return null;
    }

    @objid ("18c4567d-d961-4130-867e-8296521572db")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricVariable' role.<p>
     * Role description:
     * null
     */
    @objid ("24d8ab15-b425-4147-99df-f0afa322a19c")
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

    @objid ("e43d409d-0fb3-4a90-8536-f6c265772a89")
    protected MetricVariableConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("8e6247ec-54b4-4782-a3c3-abf501857d20")
    public static final class MdaTypes {
        @objid ("6747f908-96ee-4620-a142-47141c0243eb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ae2d6105-1483-43c9-8a53-1d7fa352d8a1")
        private static Stereotype MDAASSOCDEP;

        @objid ("91d8c4af-98b7-46ea-9ab3-a1f94b854703")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("93c9a418-d4c3-4481-a9f0-2dd19d479b6a")
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
