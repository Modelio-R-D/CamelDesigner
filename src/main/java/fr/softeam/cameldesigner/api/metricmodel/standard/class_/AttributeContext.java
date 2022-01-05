/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint;
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
 * Proxy class to handle a {@link Class} with << AttributeContext >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1b575b5c-1104-4a3c-9f42-515ee181bb91")
public class AttributeContext extends FeatureClass {
    @objid ("bd9a2856-c976-4e31-8bc8-f3a0077613ec")
    public static final String STEREOTYPE_NAME = "AttributeContext";

    /**
     * Tells whether a {@link AttributeContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << AttributeContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("65a769ff-0d4c-498e-a05e-bd92f10f0092")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << AttributeContext >> then instantiate a {@link AttributeContext} proxy.
     * 
     * @return a {@link AttributeContext} proxy on the created {@link Class}.
     */
    @objid ("f8f48bae-6e69-439f-ae6e-7f1dd1b938e6")
    public static AttributeContext create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, AttributeContext.STEREOTYPE_NAME);
        return AttributeContext.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link AttributeContext} proxy from a {@link Class} stereotyped << AttributeContext >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link AttributeContext} proxy or <i>null</i>.
     */
    @objid ("d61e1a12-43ea-49c0-8fb8-0ee2a1ce5bfa")
    public static AttributeContext instantiate(final Class obj) {
        return AttributeContext.canInstantiate(obj) ? new AttributeContext(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AttributeContext} proxy from a {@link Class} stereotyped << AttributeContext >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link AttributeContext} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6f332c04-839b-4ab4-9636-add846a0839c")
    public static AttributeContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (AttributeContext.canInstantiate(obj))
            return new AttributeContext(obj);
        else
            throw new IllegalArgumentException("AttributeContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'attributeConstraint' role.<p>
     * Role description:
     * null
     */
    @objid ("a5a33bbf-bb1e-4fa3-b206-37cd6a626e0b")
    public void addAttributeConstraint(final AttributeConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("832fe31d-637d-4688-b62c-ef094f708aba")
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
        AttributeContext other = (AttributeContext) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'attributeConstraint' role.<p>
     * Role description:
     * null
     */
    @objid ("2ca948d6-f3d1-44d1-a5b3-b90cbe825ed2")
    public List<AttributeConstraint> getAttributeConstraint() {
        List<AttributeConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Class) this.elt).getConstraintDefinition())
            if (AttributeConstraint.canInstantiate(mObj))
                    results.add((AttributeConstraint)CamelDesignerProxyFactory.instantiate(mObj, AttributeConstraint.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("eaa1e683-c542-410f-8c8b-132b6f2dd739")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'objectContext' role.<p>
     * Role description:
     * null
     */
    @objid ("99e5076f-e4bb-49a8-a1d2-2d3438ad9fb4")
    public ObjectContext getObjectContext() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(AttributeContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(AttributeContext.MdaTypes.MDAASSOCDEP_ROLE), "objectContext")
                  && ObjectContext.canInstantiate(d.getDependsOn())) {
                     return (ObjectContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ObjectContext.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("c3628543-d85d-4714-bf15-fa53c9657fae")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'attributeConstraint' role.<p>
     * Role description:
     * null
     */
    @objid ("edb8ce91-779b-4d1f-9345-47bc4b6ed35a")
    public boolean removeAttributeConstraint(final AttributeConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'objectContext' role.<p>
     * Role description:
     * null
     */
    @objid ("c19d3d94-98e8-413e-8c7a-947dd9e6445e")
    public void setObjectContext(final ObjectContext obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(AttributeContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(AttributeContext.MdaTypes.MDAASSOCDEP_ROLE), "objectContext")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), AttributeContext.MdaTypes.MDAASSOCDEP);
              dep.setName("objectContext");      dep.putTagValue(AttributeContext.MdaTypes.MDAASSOCDEP_ROLE, "objectContext");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Get the value of the 'attribute' role.<p>
     * Role description:
     * null
     */
    @objid ("416e1898-37e0-4f50-9b2d-bdc788f8de3d")
    public CamelAttribute getAttribute() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(AttributeContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(AttributeContext.MdaTypes.MDAASSOCDEP_ROLE), "attribute")
                  && d.getDependsOn().isStereotyped(CamelAttribute.MdaTypes.STEREOTYPE_ELT)) {
                  ModelElement attribut = d.getDependsOn();
        
                  //AttributeAttribute
                  if (AttributeAttribute.canInstantiate(attribut))
                     return (CamelAttribute)CamelDesignerProxyFactory.instantiate(attribut, AttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName());
        
                  //AttributeClass
                  if (AttributeClass.canInstantiate(attribut))
                      return (CamelAttribute)CamelDesignerProxyFactory.instantiate(attribut, AttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("4c07e136-c6f8-4ffc-bbed-fba31295c42a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("34419b3a-7e61-4386-a4d3-240cf06ffe57")
    protected AttributeContext(final Class elt) {
        super(elt);
    }

    @objid ("898481e6-a467-4f70-8be0-666ac6fd56ed")
    public static final class MdaTypes {
        @objid ("4efc67d3-d770-42be-84c4-5af8005a5cb3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8c63329a-cbe6-4724-b53c-7295cb0d0ae3")
        private static Stereotype MDAASSOCDEP;

        @objid ("9ce47582-99cb-419b-952f-11b9aa22ba0f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ffe3363b-1aa7-466e-a1af-4b7134dbf6ac")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "817ee7bc-b7e6-432e-af4a-bbc95f4162be");
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
