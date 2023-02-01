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
<<<<<<< HEAD
    @objid ("7950073e-f2cf-4066-b69f-b05d012e21bf")
=======
    @objid ("317fc95e-1998-4bf9-8578-221e332cb07b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "MetricConstraint";

    /**
     * Tells whether a {@link MetricConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << MetricConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("5d8b55c6-f5a8-49c5-af35-fae4264140c6")
=======
    @objid ("280a8a39-c94b-437b-a8c7-68041985178e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << MetricConstraint >> then instantiate a {@link MetricConstraint} proxy.
     * 
     * @return a {@link MetricConstraint} proxy on the created {@link Constraint}.
     */
<<<<<<< HEAD
    @objid ("66b597f7-0846-4157-a226-f84396237ab6")
=======
    @objid ("4c0eceeb-0771-4763-91cf-6c066c596555")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("9da65741-ba41-4a5a-9546-ceb9dedef3c4")
=======
    @objid ("ff27333c-ba72-4fbe-b5e9-7aafaf709cad")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5b5252a9-4c49-423a-8395-eedd20b91773")
=======
    @objid ("4a679efe-6450-4f6a-af13-136af8e27ac0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static MetricConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (MetricConstraint.canInstantiate(obj))
        	return new MetricConstraint(obj);
        else
        	throw new IllegalArgumentException("MetricConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("c2dde4ad-6db2-46a0-b583-3eb826e9a757")
=======
    @objid ("0fa8b9f0-fb85-40fe-b923-06c82d967d8d")
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
        MetricConstraint other = (MetricConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("bbe1e5a6-2289-489c-8422-eb75fda2faf7")
=======
    @objid ("80ecfe31-dba3-4bd7-a5da-627f169ec5da")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("aee537d6-7bc2-47d0-9ce6-f4812ab70e45")
=======
    @objid ("12c0ef9e-9cd0-4b94-a0f3-7272fb6c3424")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public MetricContext getMetricContext() {
          for (Class obj : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
           if (MetricContext.canInstantiate(obj))
             return (MetricContext)CamelDesignerProxyFactory.instantiate(obj, MetricContext.STEREOTYPE_NAME);
          }
          return null;
    }

<<<<<<< HEAD
    @objid ("c37d4e7e-f0ea-4d3a-84a7-387062befbef")
=======
    @objid ("bd1071cd-c5ca-41c1-9cec-81e347862a56")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("826aa630-78d6-4007-8a84-cfa1525aff0c")
=======
    @objid ("d4f0367e-3079-42e5-991d-0febd78bb3fa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("40808557-0f9b-4dd0-8d51-9a273caf59ef")
=======
    @objid ("7a08318a-8d13-4476-805f-490ae8690833")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MetricConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("e24cb852-9e38-49f6-aca0-f44360d81f1b")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("96837610-9e6e-4da4-bfd4-7e44a43375dc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("30488706-b1cc-4fc2-b34f-ae8059d1fc08")
        private static Stereotype MDAASSOCDEP;

        @objid ("0ec65a56-2e2a-4a3c-bb42-8c28cea6e45a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c41eb64a-c401-47e6-a659-216b90dfc674")
=======
        @objid ("1fbd1245-410a-4838-ae36-fc2bd3af3c2c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("479d625c-9d7e-484b-8316-e327be1d7d76")
        private static Stereotype MDAASSOCDEP;

        @objid ("53682d63-3768-47ab-9c9b-c14755a7c7d8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2771dea5-3ad6-41dd-b966-da52675e14ce")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
