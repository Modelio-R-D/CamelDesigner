/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttribute;
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
    @objid ("0361220c-454e-4b7b-a943-5419f1720608")
    public static final String STEREOTYPE_NAME = "AttributeContext";

    /**
     * Tells whether a {@link AttributeContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << AttributeContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6e644ac8-adb6-4098-b789-4583540421a1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << AttributeContext >> then instantiate a {@link AttributeContext} proxy.
     * 
     * @return a {@link AttributeContext} proxy on the created {@link Class}.
     */
    @objid ("4b6ae681-144d-4632-b214-d8973c830296")
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
    @objid ("90d85502-aa4b-461f-84ed-da99a0948d37")
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
    @objid ("2aeed362-f588-4c10-8995-0d14f2a51853")
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
    @objid ("c04341cc-6a00-44dc-afda-882acbdd02b8")
    public void addAttributeConstraint(final AttributeConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("c84fb2c1-d2ea-43c7-b857-9220ec5145a3")
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
    @objid ("54188963-c8b3-4c37-a30f-020bfdd7d755")
    public CamelAttribute getAttribute() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(AttributeContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(AttributeContext.MdaTypes.MDAASSOCDEP_ROLE), "attribute")){
                  if (AttributeAttribute.canInstantiate(d.getDependsOn()))
                     return (AttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MeasurableAttribute.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Certifiable.canInstantiate(d.getDependsOn()))
                     return (Certifiable)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Certifiable.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SecurityAttribute.canInstantiate(d.getDependsOn()))
                     return (SecurityAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (QualityAttribute.canInstantiate(d.getDependsOn()))
                     return (QualityAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), QualityAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeClass.canInstantiate(d.getDependsOn()))
                     return (AttributeClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
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
    @objid ("930bd25e-5e64-48d9-b751-0705f5f5a86c")
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
    @objid ("762c69b4-b7c2-4b14-a8cf-e6b4e0283ee6")
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
    @objid ("eb542f2c-4774-45d3-b83c-3665945e3b21")
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

    @objid ("c067ff85-1bb8-48dc-9836-8c4fe81eddc8")
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
    @objid ("790286e1-7288-4a9e-9bfd-9634945224a1")
    public boolean removeAttributeConstraint(final AttributeConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'attribute' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("82b522f0-f97a-4dcf-b4f4-4c66d77cabbc")
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
    @objid ("8d943701-a4c6-43dc-8542-d0e0a0cd2489")
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
        return result;
    }

    @objid ("a91e9cc4-89d2-4a94-a2e9-0c44e6595c79")
    protected AttributeContext(final Class elt) {
        super(elt);
    }

    @objid ("898481e6-a467-4f70-8be0-666ac6fd56ed")
    public static final class MdaTypes {
        @objid ("815aa479-fd03-4635-9a39-16a546a8ac4a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("16914dad-d924-43e7-a959-794f3fc10436")
        private static Stereotype MDAASSOCDEP;

        @objid ("9a72177f-872e-40cd-b55f-db1c7bfe41cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8247224b-08f4-4466-ba39-4a18639d3507")
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
