/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("bb167e0c-957d-4dd4-89b6-7e0a73a27d80")
    public static final String STEREOTYPE_NAME = "MetricVariableConstraint";

    /**
     * Tells whether a {@link MetricVariableConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << MetricVariableConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bbe81fc8-edaf-4559-b94f-34257ad97638")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricVariableConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << MetricVariableConstraint >> then instantiate a {@link MetricVariableConstraint} proxy.
     * 
     * @return a {@link MetricVariableConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("7050306d-374b-46a0-bda9-66036d39e977")
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
    @objid ("8dd1df34-d954-444c-8d2b-ecd01e5b7345")
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
    @objid ("1c8efed6-6308-46e9-9ede-96a000f8339d")
    public static MetricVariableConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (MetricVariableConstraint.canInstantiate(obj))
            return new MetricVariableConstraint(obj);
        else
            throw new IllegalArgumentException("MetricVariableConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("28cd095b-9801-4c60-b2da-29ec65a63962")
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
    @objid ("03e05839-ebb6-4f26-9a36-2095825849cb")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Get the value to the 'metricVariable' role.<p>
     * Role description:
     * null
     */
    @objid ("723cbb87-8851-49e0-95e4-891d26e3fc35")
    public MetricVariable getMetricVariable() {
        for (Class obj : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
         if (MetricVariable.canInstantiate(obj))
           return (MetricVariable)CamelDesignerProxyFactory.instantiate(obj, MetricVariable.STEREOTYPE_NAME);
        }
        return null;
    }

    @objid ("114d39e2-be1d-4a86-8668-5cf86ca9651b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricVariable' role.<p>
     * Role description:
     * null
     */
    @objid ("c315affe-e79d-4147-bcbb-8ff5a2db2e5b")
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

    @objid ("9adc26c8-4925-4796-b3cd-206d53ae983e")
    protected MetricVariableConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("8e6247ec-54b4-4782-a3c3-abf501857d20")
    public static final class MdaTypes {
        @objid ("e27abdbe-d1d2-4c57-b059-1b7b7f777f9f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cb40b34e-9394-4a74-b06a-0262d88532f1")
        private static Stereotype MDAASSOCDEP;

        @objid ("4dddd84f-8518-427c-837e-561ca58ffaf4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5b018b87-b02f-4ae6-a14f-eed9dabb4d4c")
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
