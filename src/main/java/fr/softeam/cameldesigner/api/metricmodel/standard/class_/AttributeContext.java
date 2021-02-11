/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.06

 * This file was generated on 11/30/20 8:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << AttributeContext >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class AttributeContext extends Feature {
    public static final String STEREOTYPE_NAME = "AttributeContext";

    /**
     * Tells whether a {@link AttributeContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << AttributeContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << AttributeContext >> then instantiate a {@link AttributeContext} proxy.
     * 
     * @return a {@link AttributeContext} proxy on the created {@link Class}.
     */
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
    public static AttributeContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (AttributeContext.canInstantiate(obj))
            return new AttributeContext(obj);
        else
            throw new IllegalArgumentException("AttributeContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'objectContext' role.<p>
     * Role description:
     * null
     */
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

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'objectContext' role.<p>
     * Role description:
     * null
     */
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

    protected AttributeContext(final Class elt) {
        super(elt);
    }

    /**
     * Set the value of the 'attribute' role.<p>
     * Role description:
     * null
     */
    public void setAttribute(final CamelAttribute obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(AttributeContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(AttributeContext.MdaTypes.MDAASSOCDEP_ROLE), "attribute")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), AttributeContext.MdaTypes.MDAASSOCDEP);
              dep.setName("attribute");      dep.putTagValue(AttributeContext.MdaTypes.MDAASSOCDEP_ROLE, "attribute");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
