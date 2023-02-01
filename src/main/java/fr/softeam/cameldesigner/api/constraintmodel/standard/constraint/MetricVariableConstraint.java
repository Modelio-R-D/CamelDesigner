/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("87c5b31e-b09d-485a-ba65-3bc429ffb87b")
=======
    @objid ("016468a9-d35a-4297-940d-f1ea76e3703f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "MetricVariableConstraint";

    /**
     * Tells whether a {@link MetricVariableConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << MetricVariableConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("23964a8a-6e1d-4655-86ae-d00a946f905a")
=======
    @objid ("b09c10c2-dd07-4266-a18f-d331aa983767")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricVariableConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << MetricVariableConstraint >> then instantiate a {@link MetricVariableConstraint} proxy.
     * 
     * @return a {@link MetricVariableConstraint} proxy on the created {@link Constraint}.
     */
<<<<<<< HEAD
    @objid ("70e6b90d-a6b3-46cb-95fe-68a7d92088a5")
=======
    @objid ("e9dea7a9-0d2f-4010-83d0-9385a6e79c4f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("daba37b8-935a-4e97-965a-43eafc830f95")
=======
    @objid ("3904668c-6627-413b-b0fe-8a4cdd0a39f7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3962ce36-6c2a-4864-972e-493132f1f400")
=======
    @objid ("0ea7870c-a021-4348-af26-490cef965711")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static MetricVariableConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (MetricVariableConstraint.canInstantiate(obj))
        	return new MetricVariableConstraint(obj);
        else
        	throw new IllegalArgumentException("MetricVariableConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("38ff51b6-f0f1-4341-a09b-4fa411b3c509")
=======
    @objid ("abdd3aa9-14b6-48d1-93af-a1ed757c269f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0a48b720-297f-4baf-ba0f-accacdd3cc5c")
=======
    @objid ("ebb44c79-d1e9-4900-96ab-0d8fdfcc58a8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("9d348c9c-a51f-4712-b2f3-cef477bbb499")
=======
    @objid ("77a8f1d8-9481-4eab-97d3-e69d42914cff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public MetricVariable getMetricVariable() {
          for (Class obj : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
           if (MetricVariable.canInstantiate(obj))
             return (MetricVariable)CamelDesignerProxyFactory.instantiate(obj, MetricVariable.STEREOTYPE_NAME);
          }
          return null;
    }

<<<<<<< HEAD
    @objid ("40f8b6c0-7fbf-4085-ba43-7fb63da38c83")
=======
    @objid ("66009d37-3ae4-4e0d-bfa7-6a9f2874a16c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5fb8c262-531a-4d90-a040-587275e44d97")
=======
    @objid ("8d413b57-7409-470c-bf72-bb01a97a15cc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("6c10154b-15a2-4dbe-940b-0b1af9fe8808")
=======
    @objid ("74285911-df48-441b-842a-e584ab86b5aa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MetricVariableConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("8e6247ec-54b4-4782-a3c3-abf501857d20")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("6e382a04-4f8a-48ae-9208-890e90c55b9d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d8b51847-29ab-496a-b6b6-3fd01495c09f")
        private static Stereotype MDAASSOCDEP;

        @objid ("731e992e-f556-4d4b-bdda-2cc0f923bdca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d1c8369b-1288-44d9-aecc-631d0c70ce4c")
=======
        @objid ("a256fb1d-8937-4c37-9418-e581f3a1ccca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d835e7cd-f180-44bb-b697-dd4175e6b521")
        private static Stereotype MDAASSOCDEP;

        @objid ("4cce6593-62db-4e5d-baf4-768d90371b5a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1053a8b5-65be-4150-8e10-d77f7da2d18b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
