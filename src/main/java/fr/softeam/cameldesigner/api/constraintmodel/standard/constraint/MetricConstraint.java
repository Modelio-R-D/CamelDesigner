/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
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
 * Proxy class to handle a {@link Constraint} with << MetricConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("39dc4a56-9d42-4441-8973-22fc28c57bb9")
public class MetricConstraint extends UnaryConstraint {
    @objid ("88316324-2c4b-4b05-917f-ad1caf679ef1")
    public static final String STEREOTYPE_NAME = "MetricConstraint";

    /**
     * Tells whether a {@link MetricConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << MetricConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("379550ed-bf23-4af5-96cb-5fde146ebad7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << MetricConstraint >> then instantiate a {@link MetricConstraint} proxy.
     * 
     * @return a {@link MetricConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("832feeec-4297-472a-887b-63e53bd716bc")
    public static MetricConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricConstraint.STEREOTYPE_NAME);
        return MetricConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link MetricConstraint} proxy from a {@link Constraint} stereotyped << MetricConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link MetricConstraint} proxy or <i>null</i>.
     */
    @objid ("fbf57aa5-393f-42e8-9867-a5accd2acad8")
    public static MetricConstraint instantiate(final Constraint obj) {
        return MetricConstraint.canInstantiate(obj) ? new MetricConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricConstraint} proxy from a {@link Constraint} stereotyped << MetricConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link MetricConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a09d57a4-b6ad-44eb-8a79-e7f5c6340488")
    public static MetricConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (MetricConstraint.canInstantiate(obj))
        	return new MetricConstraint(obj);
        else
        	throw new IllegalArgumentException("MetricConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("29da4b42-2e6a-4c78-899b-23949189a7aa")
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
        MetricConstraint other = (MetricConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("492f89c5-56d5-4dd6-ab2b-f805fd1047ef")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Get the value to the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ec202719-47ef-4ed6-9f4e-908693d0d6df")
    public MetricContext getMetricContext() {
          for (Class obj : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
           if (MetricContext.canInstantiate(obj))
             return (MetricContext)CamelDesignerProxyFactory.instantiate(obj, MetricContext.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("e2c87641-13d1-47f3-b314-51e5d69262fc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4a23537b-aafe-426c-b6cc-9cae7ad0f902")
    public void setMetricContext(final MetricContext obj) {
        // Remove existing MetricContexts
        for (Class e : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
           if (MetricContext.canInstantiate(e)) {
               ((Constraint) this.elt).getConstrainedElement().remove(e);
           }
        }
        // Set the MetricContext
        if (obj != null) {
            ((Constraint) this.elt).getConstrainedElement().add(obj.getElement());
        }
    }

    @objid ("6993fd49-8aab-46fb-84fd-1ee26792965f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("639107ae-e395-4751-9c77-7af5d3ec805c")
    protected MetricConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("e24cb852-9e38-49f6-aca0-f44360d81f1b")
    public static final class MdaTypes {
        @objid ("3bea1713-e807-424e-97b3-940ce017265d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("70083205-92d4-4f68-aedd-db885ddfce07")
        private static Stereotype MDAASSOCDEP;

        @objid ("ad68c61e-63c0-4d60-a5e0-69c9f3cd9e34")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d0e23473-1ce5-4440-93e3-3a154179e958")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "713a32d2-c7ee-4caa-9f5d-94fcb7820b94");
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
