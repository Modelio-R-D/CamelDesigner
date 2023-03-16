/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.MeasurableAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.QualityAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.AttributeInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.MeasurableAttributeInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.QualityAttributeInstance;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
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
    @objid ("d1c515b3-ef05-4cf4-ad8f-d2e9e5f760f3")
    public static final String STEREOTYPE_NAME = "AttributeContext";

    /**
     * Tells whether a {@link AttributeContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << AttributeContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ca293438-1f47-433b-bce8-6d35a87b78c0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << AttributeContext >> then instantiate a {@link AttributeContext} proxy.
     * 
     * @return a {@link AttributeContext} proxy on the created {@link Class}.
     */
    @objid ("ce19dc3f-28f1-42b3-a42b-3d2da189d21a")
    public static AttributeContext create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, AttributeContext.STEREOTYPE_NAME);
        return AttributeContext.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link AttributeContext} proxy from a {@link Class} stereotyped << AttributeContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link AttributeContext} proxy or <i>null</i>.
     */
    @objid ("dbc135b1-c272-4f37-8e11-8392d02f677f")
    public static AttributeContext instantiate(final Class obj) {
        return AttributeContext.canInstantiate(obj) ? new AttributeContext(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AttributeContext} proxy from a {@link Class} stereotyped << AttributeContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link AttributeContext} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("09b10535-4989-48ac-b72a-c11626bb5c20")
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
     * 
     */
    @objid ("f9aa0b35-3af1-4862-bf92-8d023dbc4c39")
    public void addAttributeConstraint(final AttributeConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("542ede2a-d277-40ac-a878-7e33cdb6987a")
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
     * Get the value of the 'attribute' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e9df1d84-c039-43fb-827e-9df4773c84ff")
    public CamelAttribute getAttribute() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(AttributeContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(AttributeContext.MdaTypes.MDAASSOCDEP_ROLE), "attribute")){
                  if (MeasurableAttributeAttribute.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (QualityAttributeAttribute.canInstantiate(d.getDependsOn()))
                     return (QualityAttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), QualityAttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeAttribute.canInstantiate(d.getDependsOn()))
                     return (AttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MeasurableAttributeClass.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttributeClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Certifiable.canInstantiate(d.getDependsOn()))
                     return (Certifiable)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Certifiable.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SecurityAttribute.canInstantiate(d.getDependsOn()))
                     return (SecurityAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (QualityAttributeClass.canInstantiate(d.getDependsOn()))
                     return (QualityAttributeClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), QualityAttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeClass.canInstantiate(d.getDependsOn()))
                     return (AttributeClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MeasurableAttributeInstance.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttributeInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttributeInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (QualityAttributeInstance.canInstantiate(d.getDependsOn()))
                     return (QualityAttributeInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), QualityAttributeInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeInstance.canInstantiate(d.getDependsOn()))
                     return (AttributeInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'attributeConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a094e471-7cfe-48e0-a150-1a3972c153fa")
    public List<AttributeConstraint> getAttributeConstraint() {
        List<AttributeConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Class) this.elt).getConstraintDefinition()){
        	if (AttributeConstraint.canInstantiate(mObj))
        			results.add((AttributeConstraint)CamelDesignerProxyFactory.instantiate(mObj, AttributeConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("c31939c4-acb4-4706-88cf-625ecf25dfcf")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'objectContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("62fa62fb-9bd6-4e99-97a3-9d14aee4d848")
    public ObjectContext getObjectContext() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(AttributeContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(AttributeContext.MdaTypes.MDAASSOCDEP_ROLE), "objectContext")){
                  if (ObjectContext.canInstantiate(d.getDependsOn()))
                     return (ObjectContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ObjectContext.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("0168599b-087b-4129-b2c2-bf9f5c5b7448")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'attributeConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5e6b0f74-4d82-4132-9ab2-d10bb92f273c")
    public boolean removeAttributeConstraint(final AttributeConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'attribute' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("17200500-a1ad-413c-9de7-094c32349094")
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

    /**
     * Set the value of the 'objectContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f99f01ab-78a4-430f-a41e-116b1ee6406c")
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
    public CamelAttribute getAttributeOld() {
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

    @objid ("e2e06800-488f-4a71-be13-8a2df5c70770")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getAttributeConstraint());
        return result;
    }

    @objid ("2dd3ee5f-296e-43ef-b904-efc6279bca5a")
    protected AttributeContext(final Class elt) {
        super(elt);
    }

    @objid ("898481e6-a467-4f70-8be0-666ac6fd56ed")
    public static final class MdaTypes {
        @objid ("1b1ddede-9810-401f-813e-7cfe5111aa4b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c1d250e-7bcf-4247-ba18-78d04b5487bd")
        private static Stereotype MDAASSOCDEP;

        @objid ("d76574ae-d062-4589-a7d9-1e1431ef88ba")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("35539cd5-22fd-400a-99e8-7b763a3c7928")
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
