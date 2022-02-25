/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.CamelList;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << MetricTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9fda9bc1-f8e9-4e34-86e6-3b44d86b5703")
public class MetricTemplate extends FeatureClass {
    @objid ("0b43a2ea-6d26-4e30-95a1-1b76f65585ba")
    public static final String STEREOTYPE_NAME = "MetricTemplate";

    @objid ("1aeb4295-b48f-4ec4-9cba-f757925bae81")
    public static final String VALUEDIRECTION_TAGTYPE = "valueDirection";

    /**
     * Tells whether a {@link MetricTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("39aa472b-5f5b-45bb-bdc4-7163baa4653c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTemplate.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricTemplate >> then instantiate a {@link MetricTemplate} proxy.
     * 
     * @return a {@link MetricTemplate} proxy on the created {@link Class}.
     */
    @objid ("6831c39b-588b-43c1-8653-6a2355bfc61e")
    public static MetricTemplate create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricTemplate.STEREOTYPE_NAME);
        return MetricTemplate.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MetricTemplate} proxy from a {@link Class} stereotyped << MetricTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link MetricTemplate} proxy or <i>null</i>.
     */
    @objid ("1c3d3e4c-2a4a-4bdb-b20c-5d9a25d3e53d")
    public static MetricTemplate instantiate(final Class obj) {
        return MetricTemplate.canInstantiate(obj) ? new MetricTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricTemplate} proxy from a {@link Class} stereotyped << MetricTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link MetricTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4ae028e8-8231-4f4d-a7c3-ad822e8baed9")
    public static MetricTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MetricTemplate.canInstantiate(obj))
        	return new MetricTemplate(obj);
        else
        	throw new IllegalArgumentException("MetricTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f8eae6b1-2970-4708-aa30-c101d4560743")
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
        MetricTemplate other = (MetricTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'attribute' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fe2b6f34-8959-4fac-8ce6-f927a042cffb")
    public MeasurableAttribute getAttribute() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE), "attribute")){
                  if (MeasurableAttribute.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttribute.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("38b46182-be31-4b93-a038-e2d0b3e7c36d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ba0e90cb-96ec-42d4-bb3d-f1fff8600412")
    public Unit getUnit() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE), "unit")){
                  if (SingleUnit.canInstantiate(d.getDependsOn()))
                     return (SingleUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SingleUnit.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CompositeUnit.canInstantiate(d.getDependsOn()))
                     return (CompositeUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeUnit.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Dimensionless.canInstantiate(d.getDependsOn()))
                     return (Dimensionless)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Dimensionless.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'valueDirection'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3b49a839-ecf9-423a-88b2-1331ff155eaa")
    public String getValueDirection() {
        return this.elt.getTagValue(MetricTemplate.MdaTypes.VALUEDIRECTION_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("43b948cd-fe5e-442e-948d-e200b35caa12")
    public ValueType getValueType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE), "valueType")){
                  if (CamelList.canInstantiate(d.getDependsOn()))
                     return (CamelList)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelList.MdaTypes.STEREOTYPE_ELT.getName());
                  if (BooleanValueType.canInstantiate(d.getDependsOn()))
                     return (BooleanValueType)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), BooleanValueType.MdaTypes.STEREOTYPE_ELT.getName());
                  if (StringValueType.canInstantiate(d.getDependsOn()))
                     return (StringValueType)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), StringValueType.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RangeUnion.canInstantiate(d.getDependsOn()))
                     return (RangeUnion)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RangeUnion.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Range.canInstantiate(d.getDependsOn()))
                     return (Range)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Range.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("fd0e2b66-0884-422a-a0b4-c3d5df7e0807")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'attribute' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cb862767-b947-4fe0-8eff-fc237c2c9a91")
    public void setAttribute(final MeasurableAttribute obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE), "attribute")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("attribute");      dep.putTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE, "attribute");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("147e414c-ebf7-4b35-8b74-b2754a5e6bd7")
    public void setUnit(final Unit obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE), "unit")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("unit");      dep.putTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE, "unit");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'valueDirection'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("02acc2e0-4b7c-438e-b3da-fa93bc4dc129")
    public void setValueDirection(final String value) {
        this.elt.putTagValue(MetricTemplate.MdaTypes.VALUEDIRECTION_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("993fe5b9-dcce-4ecc-8561-e3a6b4682575")
    public void setValueType(final ValueType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE), "valueType")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("valueType");      dep.putTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE, "valueType");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Get the value of the 'attribute' role.<p>
     * Role description:
     * null
     */
    @objid ("641351c2-f9a0-4ae1-8e05-45449c26c6df")
    public MeasurableAttribute getAttributeOld() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
            if (d.isStereotyped(MetricTemplate.MdaTypes.MDAASSOCDEP)
                    && Objects.equals(d.getTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE), "attribute")
                    && MeasurableAttribute.canInstantiate(d.getDependsOn())) {
                return (MeasurableAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttribute.MdaTypes.STEREOTYPE_ELT.getName());
            }
        }
        return null;
    }

    @objid ("58e9c5eb-3561-4205-9936-61b5e2a6ceed")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    /**
     * Get the value of the 'valueType' role.<p>
     * Role description:
     * null
     */
    @objid ("0567c385-6cc1-4154-bc42-b108af3f5200")
    public ValueType getValueTypeOld() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
            if (d.isStereotyped(MetricTemplate.MdaTypes.MDAASSOCDEP)
                    && Objects.equals(d.getTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE), "valueType")
                    && d.getDependsOn().isStereotyped(ValueType.MdaTypes.STEREOTYPE_ELT)) {
                ModelElement attribut = d.getDependsOn();
        
                //BooleanValueType
                if (BooleanValueType.canInstantiate(attribut))
                    return (ValueType)CamelDesignerProxyFactory.instantiate(attribut, BooleanValueType.MdaTypes.STEREOTYPE_ELT.getName());
        
                //List
                if (CamelList.canInstantiate(attribut))
                    return (ValueType)CamelDesignerProxyFactory.instantiate(attribut, CamelList.MdaTypes.STEREOTYPE_ELT.getName());
        
                //Range
                if (Range.canInstantiate(attribut))
                    return (ValueType)CamelDesignerProxyFactory.instantiate(attribut, Range.MdaTypes.STEREOTYPE_ELT.getName());
        
                //RangeUnion
                if (RangeUnion.canInstantiate(attribut))
                    return (ValueType)CamelDesignerProxyFactory.instantiate(attribut, RangeUnion.MdaTypes.STEREOTYPE_ELT.getName());
        
                //StringValueType
                if (StringValueType.canInstantiate(attribut))
                    return (ValueType)CamelDesignerProxyFactory.instantiate(attribut, StringValueType.MdaTypes.STEREOTYPE_ELT.getName());
            }
        }
        return null;
    }

    /**
     * Set the value of the 'attribute' role.<p>
     * Role description:
     * null
     */
    @objid ("8fa522e2-fd86-4d33-ae0d-81f142f34a80")
    public void setAttributeOld(final MeasurableAttribute obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE), "attribute")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("attribute");      dep.putTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE, "attribute");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'valueType' role.<p>
     * Role description:
     * null
     */
    @objid ("217e7deb-253d-438a-8559-b403f97f30ec")
    public void setValueTypeOld(final ValueType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE), "valueType")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("valueType");      dep.putTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE, "valueType");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("61c7fa26-a317-456f-bbcb-a7a61ba01ae1")
    protected MetricTemplate(final Class elt) {
        super(elt);
    }

    @objid ("167b1a3c-171c-4d03-b995-511599eb3e3e")
    public static final class MdaTypes {
        @objid ("a1351f4a-208d-43ed-bdb5-a196e8f79776")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4660668f-9c31-4bf6-bd5a-620870b0bb78")
        public static TagType VALUEDIRECTION_TAGTYPE_ELT;

        @objid ("b6173f81-9b56-4f41-99f3-94f5ae14be01")
        private static Stereotype MDAASSOCDEP;

        @objid ("e7019069-9be0-47fe-ae51-216d29c5b588")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e3cbf827-ae2e-4c52-8687-a911a3aab57a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9f394e40-1b72-4bd0-a2e6-b02a67cf87fd");
            VALUEDIRECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "537c84fa-0460-4eae-bc55-104097f503c9");
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
