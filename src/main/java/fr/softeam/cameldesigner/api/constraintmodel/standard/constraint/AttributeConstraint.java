/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("edda5d68-5f4d-4b9f-87b8-53f4274d054a")
    public static final String STEREOTYPE_NAME = "AttributeConstraint";

    /**
     * Tells whether a {@link AttributeConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << AttributeConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("00c5cd02-5f23-41d8-a973-730b21e13b80")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << AttributeConstraint >> then instantiate a {@link AttributeConstraint} proxy.
     * 
     * @return a {@link AttributeConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("6a0fb2d0-8902-4dcd-b21b-18f7448644a0")
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
    @objid ("2b0f41c7-538d-4613-9437-32f7413278c5")
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
    @objid ("12136015-2ddc-4c30-8378-309d9b0cfd67")
    public static AttributeConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (AttributeConstraint.canInstantiate(obj))
        	return new AttributeConstraint(obj);
        else
        	throw new IllegalArgumentException("AttributeConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a790c9a0-3839-4681-b33d-99fb02620487")
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
    @objid ("73718081-d894-4a0d-8532-edda59c01220")
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
    @objid ("083f0b7c-2c11-4479-8a34-140306400894")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("26789866-640a-4fa7-b6f3-75b9557e31d2")
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
    @objid ("bcaa5b39-4911-4529-a276-55e552c52b72")
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

    @objid ("b523eae1-40f3-4013-be2f-8e2d092b309a")
    protected AttributeConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("d22fc638-bd9d-4514-a93a-6f08c279f3bd")
    public static final class MdaTypes {
        @objid ("e4e30ede-4ad6-4b7d-af2c-0719b8779085")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("309b213d-8419-4eff-a83b-80cb7ac9604f")
        private static Stereotype MDAASSOCDEP;

        @objid ("dd7c0d99-a87b-4018-a777-a90cb731b0b1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c75a5d3d-799b-4fd9-8600-f77e8f14acfa")
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
