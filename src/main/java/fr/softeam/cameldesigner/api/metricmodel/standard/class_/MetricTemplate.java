/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("c2e3b72c-80e3-4f04-a801-fc4e10d419c7")
    public static final String STEREOTYPE_NAME = "MetricTemplate";

    @objid ("c809fe25-fd2f-4569-ba05-789968df8c5e")
    public static final String VALUEDIRECTION_TAGTYPE = "valueDirection";

    /**
     * Tells whether a {@link MetricTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a5f1630e-0e3a-4eab-ab83-a60028bbee84")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTemplate.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricTemplate >> then instantiate a {@link MetricTemplate} proxy.
     * 
     * @return a {@link MetricTemplate} proxy on the created {@link Class}.
     */
    @objid ("5606e051-00be-459f-b4da-5b009b3ab425")
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
    @objid ("45e1a642-7d42-4eab-beec-2f8bf319aece")
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
    @objid ("b9e3e255-b69e-4551-a5e8-47332275f580")
    public static MetricTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MetricTemplate.canInstantiate(obj))
        	return new MetricTemplate(obj);
        else
        	throw new IllegalArgumentException("MetricTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("32ee4cce-a97f-4878-9cfe-bf01db4afe2c")
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
    @objid ("168e9c2b-083d-4ed5-8ca4-6a0ef1d1a774")
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
    @objid ("0b957f3d-78b1-46ac-abc8-9bd37cbfb26e")
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
    @objid ("8d344ec9-7fae-49a6-a350-bfc93ddff60d")
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
    @objid ("cf78c037-2eaf-4242-b75f-d9098a1b3083")
    public String getValueDirection() {
        return this.elt.getTagValue(MetricTemplate.MdaTypes.VALUEDIRECTION_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a4020e5c-e189-45b1-82f8-5b2372b40416")
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

    @objid ("d4b4a6da-1279-43af-beb8-e32d7c4d1615")
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
    @objid ("ec899a73-b02b-49d6-b39f-dced686b7d78")
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
    @objid ("e35d5730-f2cb-4146-a9dd-b0c56768a1a5")
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
    @objid ("cc90c1d3-f45c-4648-a17d-94a920a5e26f")
    public void setValueDirection(final String value) {
        this.elt.putTagValue(MetricTemplate.MdaTypes.VALUEDIRECTION_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("84ecf551-2ab6-4681-a6de-a6c3219886fb")
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

    @objid ("95f44215-5313-4cf2-8448-ea4b314101ff")
    protected MetricTemplate(final Class elt) {
        super(elt);
    }

    @objid ("167b1a3c-171c-4d03-b995-511599eb3e3e")
    public static final class MdaTypes {
        @objid ("cf56491b-f9fb-4b37-a693-717110d57e21")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0884a7cb-bf14-4126-a36a-2514988a9b9b")
        public static TagType VALUEDIRECTION_TAGTYPE_ELT;

        @objid ("9dae0dab-fa18-4e79-bb70-a063dd577f8f")
        private static Stereotype MDAASSOCDEP;

        @objid ("e668bf94-bf17-4c36-92e0-e0c22d3f8832")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9af5fdc8-5aad-4ebb-884e-ffb39ffea713")
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
