/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
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
    @objid ("fba9e13d-a4ac-49b8-b4ea-6033ad4dbe23")
    public static final String STEREOTYPE_NAME = "MetricTemplate";

    @objid ("5ea8dbcd-f275-4882-8e09-9454741ca234")
    public static final String VALUEDIRECTION_TAGTYPE = "valueDirection";

    /**
     * Tells whether a {@link MetricTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("aa905aed-4fed-4be8-92bf-caa232fd98f7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTemplate.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricTemplate >> then instantiate a {@link MetricTemplate} proxy.
     * 
     * @return a {@link MetricTemplate} proxy on the created {@link Class}.
     */
    @objid ("28ad5165-203b-491a-aca6-7ba837600432")
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
    @objid ("9f8bc3ed-c8a7-443e-9244-ad2aa525a815")
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
    @objid ("f042569e-dc2c-4e97-978e-7b732921fd9e")
    public static MetricTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MetricTemplate.canInstantiate(obj))
        	return new MetricTemplate(obj);
        else
        	throw new IllegalArgumentException("MetricTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c52e4a10-314c-4467-a29b-bef554bd2627")
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
    @objid ("aa4211ef-3c2f-426f-81a3-9f927a41efc2")
    public MeasurableAttributeClass getAttribute() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricTemplate.MdaTypes.MDAASSOCDEP_ROLE), "attribute")){
                  if (MeasurableAttributeClass.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttributeClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("29381500-674b-4e03-aa88-0ed522c358ce")
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
    @objid ("6f10921b-a0a5-4096-85e4-ffdeb675fe99")
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
    @objid ("06f377be-b2bd-4daa-aa35-625321ab99ac")
    public String getValueDirection() {
        return this.elt.getTagValue(MetricTemplate.MdaTypes.VALUEDIRECTION_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("04da530d-ed98-40d3-8199-ce84dda7f023")
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

    @objid ("9d976999-2acc-4d78-bf47-295f74dd7d0d")
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
    @objid ("745d42ee-6283-4202-a613-328f1bc1bf7a")
    public void setAttribute(final MeasurableAttributeClass obj) {
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
    @objid ("67db94b4-65a3-40ee-8822-003142a0be3c")
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
    @objid ("295e63df-1811-498b-a9a6-5e545b27a476")
    public void setValueDirection(final String value) {
        this.elt.putTagValue(MetricTemplate.MdaTypes.VALUEDIRECTION_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e4984d4e-c26f-4805-8c25-e69d652af648")
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

    @objid ("58e9c5eb-3561-4205-9936-61b5e2a6ceed")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("68a39164-970f-47b1-8473-e39c9f8ff04f")
    protected MetricTemplate(final Class elt) {
        super(elt);
    }

    @objid ("167b1a3c-171c-4d03-b995-511599eb3e3e")
    public static final class MdaTypes {
        @objid ("9622667c-61c9-4440-806e-f91e9f01b76c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f8e4a114-bc79-4d91-b484-7db20e092609")
        public static TagType VALUEDIRECTION_TAGTYPE_ELT;

        @objid ("e8db42f2-6326-4c3f-8a88-7fa820a76ee6")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e9f80fc-0204-4c5b-b2a7-13567d4a4979")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c0d0ac62-9c43-4985-a6a1-1a568643d0f6")
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
