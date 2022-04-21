/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("e55eee24-f46e-4a89-861b-d22284998773")
    public static final String STEREOTYPE_NAME = "AttributeConstraint";

    /**
     * Tells whether a {@link AttributeConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << AttributeConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6c10288b-195a-4c27-99c6-4aaf4ed78733")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << AttributeConstraint >> then instantiate a {@link AttributeConstraint} proxy.
     * 
     * @return a {@link AttributeConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("30076312-c72c-4035-a24f-96277b299e4e")
    public static AttributeConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, AttributeConstraint.STEREOTYPE_NAME);
        return AttributeConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link AttributeConstraint} proxy from a {@link Constraint} stereotyped << AttributeConstraint >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Constraint
     * @return a {@link AttributeConstraint} proxy or <i>null</i>.
     */
    @objid ("f8c675ec-7f8d-4990-a5c7-bc52ad9b0b34")
    public static AttributeConstraint instantiate(final Constraint obj) {
        return AttributeConstraint.canInstantiate(obj) ? new AttributeConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AttributeConstraint} proxy from a {@link Constraint} stereotyped << AttributeConstraint >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Constraint}
     * @return a {@link AttributeConstraint} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4b7725a7-fd07-4249-9ea4-ac7310442599")
    public static AttributeConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (AttributeConstraint.canInstantiate(obj))
            return new AttributeConstraint(obj);
        else
            throw new IllegalArgumentException("AttributeConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("93c9ba9e-9aa5-40f7-9fa6-9f22f9be4440")
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
     */
    @objid ("cb7edb08-0c0c-488c-a8ae-a3c8c5a48344")
    public AttributeContext getAttributeContext() {
        for (Class obj : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
         if (AttributeContext.canInstantiate(obj))
           return (AttributeContext)CamelDesignerProxyFactory.instantiate(obj, AttributeContext.STEREOTYPE_NAME);
        }
        return null;
    }

    /**
     * Get the underlying {@link Constraint}.
     * 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("54ad1096-abf0-4a69-8af2-094d6adc3785")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("daf1dced-77fc-4b96-9738-9383a749de72")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'attributeContext' role.<p>
     * Role description:
     * null
     */
    @objid ("56604416-76d5-4b82-9c32-d2e6837c4e7a")
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

    @objid ("12d0a25c-72b0-4347-91f0-397d8e9d6b3a")
    protected AttributeConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("d22fc638-bd9d-4514-a93a-6f08c279f3bd")
    public static final class MdaTypes {
        @objid ("56f77d89-bb17-4dd5-9384-ddba4c4005e3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4a9a6f5c-2331-46ca-b510-fe9ab3dac9bf")
        private static Stereotype MDAASSOCDEP;

        @objid ("25a0331c-676c-4bdb-b037-0cd8b09f6f38")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1791a26b-c406-42b8-880f-7f4e57a29b6c")
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
