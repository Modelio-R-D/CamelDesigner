/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("83f3009b-b0e8-49b6-b4b3-067ac8f45602")
    public static final String STEREOTYPE_NAME = "MetricConstraint";

    /**
     * Tells whether a {@link MetricConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << MetricConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("99e915f0-1e68-4584-afa2-d1da8e633fce")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << MetricConstraint >> then instantiate a {@link MetricConstraint} proxy.
     * 
     * @return a {@link MetricConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("48e0a9af-df1c-4543-b688-95cb0d72ece0")
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
    @objid ("a8741318-dfbc-4d0d-b6ae-2043a7918fb4")
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
    @objid ("0fa8d47d-b765-4fec-b12f-8511b87f2d0c")
    public static MetricConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (MetricConstraint.canInstantiate(obj))
        	return new MetricConstraint(obj);
        else
        	throw new IllegalArgumentException("MetricConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b022403e-e447-4417-9645-5af06f3106c7")
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
    @objid ("98ca580a-a159-48bc-a19a-868b8914e387")
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
    @objid ("9d32d071-d575-49b1-88dc-0f0f2fdae065")
    public MetricContext getMetricContext() {
          for (Class obj : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
           if (MetricContext.canInstantiate(obj))
             return (MetricContext)CamelDesignerProxyFactory.instantiate(obj, MetricContext.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("de7053ed-ea97-40b4-8a12-c05a536e0fea")
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
    @objid ("07bd382f-b9af-4879-8c38-4cf4d13e02d8")
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

    @objid ("979aeadd-8261-4c40-b0ad-a08ab5bbe465")
    protected MetricConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("e24cb852-9e38-49f6-aca0-f44360d81f1b")
    public static final class MdaTypes {
        @objid ("5fa2230a-def9-4804-967c-679bb27f153b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ef92a2b0-19be-4c13-b00f-b318a7fbd9fe")
        private static Stereotype MDAASSOCDEP;

        @objid ("d88aa6b9-6477-40d3-b698-eddd369ee43a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3f7af9ff-f2ec-40c9-9ce5-fd0b7402a542")
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
