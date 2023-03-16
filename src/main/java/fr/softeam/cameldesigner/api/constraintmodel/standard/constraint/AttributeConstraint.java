/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("d39d9b22-206d-4107-befd-535f8a2fd32d")
    public static final String STEREOTYPE_NAME = "AttributeConstraint";

    /**
     * Tells whether a {@link AttributeConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << AttributeConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("57146b3e-de0f-44cc-b76e-b1037bc2f10a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << AttributeConstraint >> then instantiate a {@link AttributeConstraint} proxy.
     * 
     * @return a {@link AttributeConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("3a7fefe6-4f53-4bff-a97b-761bdedc073c")
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
    @objid ("9b156f46-ecf7-429f-8326-af93f31507a6")
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
    @objid ("6041799f-8eeb-4aa0-a2cf-584030e9d1a2")
    public static AttributeConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (AttributeConstraint.canInstantiate(obj))
        	return new AttributeConstraint(obj);
        else
        	throw new IllegalArgumentException("AttributeConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("40bd07ed-f18c-4f9c-9f0c-ff23495ba64f")
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
    @objid ("bb74fc40-5bb8-4809-ba06-7c691ae4aa5c")
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
    @objid ("e49f7712-76ec-4fff-9dc4-3762b5f21546")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("cdfb8fcf-58b7-4d97-b444-2d83ef0b6a85")
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
    @objid ("605ed9b4-79af-45aa-a1ab-7e716d065586")
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

    @objid ("00b1b551-dc35-4572-91ce-603ac966c111")
    protected AttributeConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("d22fc638-bd9d-4514-a93a-6f08c279f3bd")
    public static final class MdaTypes {
        @objid ("3dc296f3-32d6-472d-9e1e-9027263de476")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("82491f3b-9dbc-442b-b450-3700b4cf9d1c")
        private static Stereotype MDAASSOCDEP;

        @objid ("d70d3d60-3b32-4cd9-886b-1d4cf5295793")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aeb6c049-6fa3-4d3b-9a81-136ae1547e3e")
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
