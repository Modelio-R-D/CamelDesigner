/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("9b0b9de0-d30a-4826-a7b9-42a1c7994a5c")
    public static final String STEREOTYPE_NAME = "MetricTemplate";

    @objid ("78a4b6b7-d5b8-42bd-bc8e-817e84a8a97c")
    public static final String VALUEDIRECTION_TAGTYPE = "valueDirection";

    /**
     * Tells whether a {@link MetricTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a25000b9-92c3-496b-89da-40ef4e7fa2d7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTemplate.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricTemplate >> then instantiate a {@link MetricTemplate} proxy.
     * 
     * @return a {@link MetricTemplate} proxy on the created {@link Class}.
     */
    @objid ("d8907c88-38c6-4a12-bcb7-5e278ca74632")
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
    @objid ("8df86c0e-c7b7-408b-8474-b48a91df7cf8")
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
    @objid ("b3ee7fcc-c32e-424c-bc2e-170dbae2cc06")
    public static MetricTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MetricTemplate.canInstantiate(obj))
        	return new MetricTemplate(obj);
        else
        	throw new IllegalArgumentException("MetricTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d9a8d52d-40f5-479c-8a6e-28729d0e613f")
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
    @objid ("b448f0f0-107d-47ca-9a38-2aabc411c9ff")
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
    @objid ("f6506581-6c0c-4615-b542-a98436d183d3")
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
    @objid ("6c7fa907-5a60-4617-b470-d8c4a17a074d")
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
    @objid ("73cf7343-3973-4d4f-813a-13766f899d0d")
    public String getValueDirection() {
        return this.elt.getTagValue(MetricTemplate.MdaTypes.VALUEDIRECTION_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1bd1082c-14e4-403b-862f-f5cda6f011a7")
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

    @objid ("0b1172cf-94d8-40f5-81ea-b629800fe6f1")
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
    @objid ("399cbcf2-ce7d-43ce-adcc-17193dbc5371")
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
    @objid ("52694e0b-a615-455c-91e7-7c190774d8c4")
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
    @objid ("48949fe4-1aec-4cb6-90c5-9c3673ff8e84")
    public void setValueDirection(final String value) {
        this.elt.putTagValue(MetricTemplate.MdaTypes.VALUEDIRECTION_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ad2881b9-cf98-46b2-ba98-3d108f781b92")
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

    @objid ("ce2f2ad3-7cff-4f6b-846c-140cc307d1ee")
    protected MetricTemplate(final Class elt) {
        super(elt);
    }

    @objid ("167b1a3c-171c-4d03-b995-511599eb3e3e")
    public static final class MdaTypes {
        @objid ("5bd590df-a2f6-493b-aa79-0cdafe9ca96e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("22f3db1d-397b-484d-8899-d5e2ad34dc18")
        public static TagType VALUEDIRECTION_TAGTYPE_ELT;

        @objid ("3f540112-3d71-4fb3-b80b-fd4869bc4d84")
        private static Stereotype MDAASSOCDEP;

        @objid ("ab4b8393-06cb-46cd-b2f1-09c151d74ed4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d448f9b0-7579-4cf0-81bb-b03d5eabd5fe")
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
