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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
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
 * Proxy class to handle a {@link Constraint} with << AttributeConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ad18d989-4bc1-47c9-9b74-61ab5b5e050f")
public class AttributeConstraint extends UnaryConstraint {
    @objid ("94e25f3a-8c09-48bb-a827-f4e0be661cb4")
    public static final String STEREOTYPE_NAME = "AttributeConstraint";

    /**
     * Tells whether a {@link AttributeConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << AttributeConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("913e2fed-3434-4b91-bbcd-cd90d6cef07a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << AttributeConstraint >> then instantiate a {@link AttributeConstraint} proxy.
     * 
     * @return a {@link AttributeConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("a2af4d83-ebda-48a9-8336-5450dc9fdcaf")
    public static AttributeConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, AttributeConstraint.STEREOTYPE_NAME);
        return AttributeConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link AttributeConstraint} proxy from a {@link Constraint} stereotyped << AttributeConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link AttributeConstraint} proxy or <i>null</i>.
     */
    @objid ("f5e747b2-7092-4607-9bcf-2055383b2e5f")
    public static AttributeConstraint instantiate(final Constraint obj) {
        return AttributeConstraint.canInstantiate(obj) ? new AttributeConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AttributeConstraint} proxy from a {@link Constraint} stereotyped << AttributeConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link AttributeConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b81104c0-635e-43b9-875b-70e87f1362ac")
    public static AttributeConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (AttributeConstraint.canInstantiate(obj))
        	return new AttributeConstraint(obj);
        else
        	throw new IllegalArgumentException("AttributeConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("625e7b95-1325-4119-a550-e26458ae0799")
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
        AttributeConstraint other = (AttributeConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'attributeContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3285f806-185d-47c6-8a8a-1fcba497a92f")
    public AttributeContext getAttributeContext() {
          for (Class obj : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
           if (AttributeContext.canInstantiate(obj))
             return (AttributeContext)CamelDesignerProxyFactory.instantiate(obj, AttributeContext.STEREOTYPE_NAME);
          }
          return null;
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("8a95a860-23e5-4b44-9de5-22de790bfee2")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("b498177a-ea86-463c-9c9e-188075700a3e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'attributeContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("33da5d1f-6484-4855-8419-ba3b13a6c9b3")
    public void setAttributeContext(final AttributeContext obj) {
        // Remove existing AttributeContexts
        for (Class e : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
           if (AttributeContext.canInstantiate(e)) {
               ((Constraint) this.elt).getConstrainedElement().remove(e);
           }
        }
        // Set the AttributeContext
        if (obj != null) {
            ((Constraint) this.elt).getConstrainedElement().add(obj.getElement());
        }
    }

    @objid ("9af91a7e-e9b8-4b58-913e-778a9a16ec86")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("3792c59e-2fcc-4d78-b718-02fe6d268a3d")
    protected AttributeConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("d22fc638-bd9d-4514-a93a-6f08c279f3bd")
    public static final class MdaTypes {
        @objid ("3ba481a0-1c0a-4d8d-979e-ea9e8ba557ad")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cbd11d8c-ee86-4dd1-9305-1a0d3cce78b7")
        private static Stereotype MDAASSOCDEP;

        @objid ("7a94ad4f-ce3e-4b0a-9fcb-248bee6a25f0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("09eed1ec-7bae-43e8-91ec-6668f4edbbbc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "310d656e-d693-4ec1-b186-66894464b4b3");
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
