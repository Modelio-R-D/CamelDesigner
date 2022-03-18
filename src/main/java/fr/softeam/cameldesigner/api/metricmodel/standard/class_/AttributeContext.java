/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("3fd7e163-0de4-40fa-9bd2-4bd29cfe1a02")
    public static final String STEREOTYPE_NAME = "AttributeContext";

    /**
     * Tells whether a {@link AttributeContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << AttributeContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a6e1ad4f-968d-4f06-abad-2977bd09edf0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << AttributeContext >> then instantiate a {@link AttributeContext} proxy.
     * 
     * @return a {@link AttributeContext} proxy on the created {@link Class}.
     */
    @objid ("e6bf7b50-c5d9-469c-ad09-4b13429ed0a1")
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
    @objid ("dff353e2-0f39-4346-94b6-5d24cc9e9260")
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
    @objid ("8457174e-2dea-4600-b6b8-6febcb438c6a")
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
    @objid ("850896d3-0610-459a-b5ba-a844dbccafce")
    public void addAttributeConstraint(final AttributeConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("fc6816a2-d430-4424-9519-a2467800826f")
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
    @objid ("f40fb60e-3adf-40ab-92d8-4f8928b9370a")
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
    @objid ("15fdd007-c8e6-4113-9581-bb13907ffd80")
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
    @objid ("0cb312f5-6b74-42e2-a1b3-b8b1e517da6b")
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
    @objid ("f5d1cb41-dcc1-4481-bd24-b9a4317c4ae1")
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

    @objid ("1a69a1b1-547a-40a0-baa9-7636b0a986a5")
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
    @objid ("60c83bd2-17e2-4716-bc89-049e8477a336")
    public boolean removeAttributeConstraint(final AttributeConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'attribute' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("42aece8e-b5c2-4899-8d90-11d0babdae01")
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
    @objid ("53448037-9cca-4cb0-a2db-e386d3721c20")
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

    @objid ("49c3d74f-f3f1-4058-a0f2-9763c9792c23")
    protected AttributeContext(final Class elt) {
        super(elt);
    }

    @objid ("898481e6-a467-4f70-8be0-666ac6fd56ed")
    public static final class MdaTypes {
        @objid ("a4a47790-69e0-444e-af9a-c61ddea26d41")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eede3eef-f601-49fb-9b5e-eab8885c165b")
        private static Stereotype MDAASSOCDEP;

        @objid ("2185fa77-ceba-441c-919e-9b6b8a1be33f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("214ed1b0-0feb-4d6b-90ee-2e7d95dc465b")
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
