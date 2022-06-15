/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.FeaturePackage;
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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Attribute_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6f9ce9fc-dd24-4913-b74c-5e47d6057bf1")
public class AttributeClass extends CamelAttribute {
    @objid ("1a966bb9-d4ad-45bc-95b2-a2594b1a9926")
    public static final String STEREOTYPE_NAME = "Attribute_Class";

    @objid ("97095fa6-594e-4cbd-a144-388dbfa4fd67")
    public static final String VALUE_TAGTYPE = "Value";

    /**
     * Tells whether a {@link AttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Attribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f910772d-97b8-4f10-9441-0483e91da8ab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Attribute_Class >> then instantiate a {@link AttributeClass} proxy.
     * 
     * @return a {@link AttributeClass} proxy on the created {@link Class}.
     */
    @objid ("baf288fb-11c9-4c17-817e-b86694aef118")
    public static AttributeClass create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, AttributeClass.STEREOTYPE_NAME);
        return AttributeClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link AttributeClass} proxy from a {@link Class} stereotyped << Attribute_Class >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link AttributeClass} proxy or <i>null</i>.
     */
    @objid ("58749f07-3f01-4950-b0c6-e6c2c8b47585")
    public static AttributeClass instantiate(final Class obj) {
        return AttributeClass.canInstantiate(obj) ? new AttributeClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AttributeClass} proxy from a {@link Class} stereotyped << Attribute_Class >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link AttributeClass} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("34842a44-dafd-4f09-a152-e0b5aca70b0b")
    public static AttributeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (AttributeClass.canInstantiate(obj))
            return new AttributeClass(obj);
        else
            throw new IllegalArgumentException("AttributeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f6f70581-1b88-4392-a70f-f90e3a7eed69")
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
        AttributeClass other = (AttributeClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("9bcef4ab-c7c8-4c39-a12a-9b01be43a4b7")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("fcb908ac-e18c-4268-982c-99d54f1d3044")
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     */
    @objid ("8e73f9e5-abbd-45b5-8f35-c33203cde311")
    public Unit getUnit() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(AttributeClass.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(AttributeClass.MdaTypes.MDAASSOCDEP_ROLE), "unit")){
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
     * Getter for string property 'Value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1fd185b5-4dd6-49f2-aab5-9941162e5db3")
    public String getValue() {
        return this.elt.getTagValue(AttributeClass.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'valueType' role.<p>
     * Role description:
     * null
     */
    @objid ("d52aad47-d66b-4af3-9173-e4ab2c907caa")
    public ValueType getValueType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(AttributeClass.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(AttributeClass.MdaTypes.MDAASSOCDEP_ROLE), "valueType")){
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

    @objid ("d0377728-8c8a-4042-bd9d-0e09e774d412")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("1db10af8-144c-456d-8396-4750913a3251")
    public void setParent(final FeaturePackage obj) {
        ((Class) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     */
    @objid ("3e4887e5-7cc9-46b5-8093-a0bc8ebe6775")
    public void setUnit(final Unit obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(AttributeClass.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(AttributeClass.MdaTypes.MDAASSOCDEP_ROLE), "unit")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), AttributeClass.MdaTypes.MDAASSOCDEP);
              dep.setName("unit");      dep.putTagValue(AttributeClass.MdaTypes.MDAASSOCDEP_ROLE, "unit");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'Value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("403bd99c-a9fd-4063-92da-811624e1abc2")
    public void setValue(final String value) {
        this.elt.putTagValue(AttributeClass.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'valueType' role.<p>
     * Role description:
     * null
     */
    @objid ("0e57e240-af8d-4fcd-8562-0946f76ef297")
    public void setValueType(final ValueType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(AttributeClass.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(AttributeClass.MdaTypes.MDAASSOCDEP_ROLE), "valueType")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), AttributeClass.MdaTypes.MDAASSOCDEP);
              dep.setName("valueType");      dep.putTagValue(AttributeClass.MdaTypes.MDAASSOCDEP_ROLE, "valueType");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("4c10ffd7-f1e0-4537-a680-97f101eee2a6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("7d295d7c-5053-4c4f-ab38-5eb9a2c15440")
    public DataType getPrimitiveType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
            if (d.isStereotyped(AttributeClass.MdaTypes.MDAASSOCDEP)
                    && Objects.equals(d.getTagValue(AttributeClass.MdaTypes.MDAASSOCDEP_ROLE), "valueType")){
                ModelElement dependsOn = d.getDependsOn();
                if (dependsOn instanceof DataType) {
                    return (DataType) dependsOn;
                }
            }
        }
        return null;
    }

    @objid ("ae1c7809-d89a-4ec3-9025-af9ea03b2d29")
    public void setPrimitiveType(final DataType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
            if (d.isStereotyped(AttributeClass.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(AttributeClass.MdaTypes.MDAASSOCDEP_ROLE), "valueType")) {
                dep = d;
                break;
            }
        if (obj == null) {
            if(dep != null) dep.delete();
        } else {
            if (dep == null) {
                IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
                dep = session.getModel().createDependency(this.elt, obj, AttributeClass.MdaTypes.MDAASSOCDEP);
                dep.setName("valueType");
                dep.putTagValue(AttributeClass.MdaTypes.MDAASSOCDEP_ROLE, "valueType");
            }
            dep.setDependsOn(obj);
        }
    }

    @objid ("21cb7bde-54c4-45ac-b892-48c4df680dfa")
    protected AttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("2e6d4ec3-39e4-419d-8e8c-ec5e59d6a3cb")
    public static final class MdaTypes {
        @objid ("cd8a24ca-0c27-4051-b656-80121e66d153")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("460c876f-23ea-4ec9-a5a2-59d07ed18c9a")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("0958ccd8-59b2-4433-9a35-cf82a4853607")
        private static Stereotype MDAASSOCDEP;

        @objid ("b5757919-c180-4841-b5ad-d4c8b34cf489")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0ed7a704-f2f8-4ab5-9b24-cedcaf795671")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b062f4ef-e492-4b34-9caa-bdd63d717cb9");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3cee445-f1e5-4752-ad1b-6ffb45d35a89");
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
