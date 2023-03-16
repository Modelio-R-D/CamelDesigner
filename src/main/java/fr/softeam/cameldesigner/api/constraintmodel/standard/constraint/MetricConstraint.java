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
    @objid ("5eb209cb-73c4-4706-b31b-6213e92e4363")
    public static final String STEREOTYPE_NAME = "MetricConstraint";

    /**
     * Tells whether a {@link MetricConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << MetricConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d5c3a12a-3f91-4167-b8a6-c585c3bf2f5d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << MetricConstraint >> then instantiate a {@link MetricConstraint} proxy.
     * 
     * @return a {@link MetricConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("2540e679-834a-4ecf-9d5a-ca2597b7ccd1")
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
    @objid ("7293153c-1078-4b42-9141-e5887a1ef682")
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
    @objid ("ba712dc3-22e9-45c9-b584-6d23941d044b")
    public static MetricConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (MetricConstraint.canInstantiate(obj))
        	return new MetricConstraint(obj);
        else
        	throw new IllegalArgumentException("MetricConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6878f02e-766d-4722-980f-52466e0ec8a3")
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
    @objid ("f23e7275-2d5f-43e9-93ea-19b97558e4da")
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
    @objid ("ba47602d-d16b-457a-b7e9-1e399d3e1076")
    public MetricContext getMetricContext() {
          for (Class obj : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
           if (MetricContext.canInstantiate(obj))
             return (MetricContext)CamelDesignerProxyFactory.instantiate(obj, MetricContext.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("298dd893-bc09-464c-9d03-5311f2b00cca")
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
    @objid ("aa0df450-27fa-401f-a1e3-25c99f159a94")
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

    @objid ("1611c472-9916-474e-becb-bba92e43bac7")
    protected MetricConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("e24cb852-9e38-49f6-aca0-f44360d81f1b")
    public static final class MdaTypes {
        @objid ("2651bfb3-def9-440a-8af7-334f4df50bea")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("56e57cb0-026c-4f61-a4b2-74ce54ef9b1e")
        private static Stereotype MDAASSOCDEP;

        @objid ("e1ff5b1b-f5bf-4f6c-bb5b-d81afd48e1b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("009e5429-f474-4dce-b919-f4eba4b54991")
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
