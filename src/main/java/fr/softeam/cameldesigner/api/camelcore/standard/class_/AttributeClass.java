/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("3b426a7d-0486-421c-bb28-9cba0b1f0ce5")
    public static final String STEREOTYPE_NAME = "Attribute_Class";

    @objid ("eade0625-9fd7-4ca4-b79d-5ca233e44da7")
    public static final String VALUE_TAGTYPE = "Value";

    /**
     * Tells whether a {@link AttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Attribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a8be1841-8d1d-4120-82bc-cd5d6d828f94")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Attribute_Class >> then instantiate a {@link AttributeClass} proxy.
     * 
     * @return a {@link AttributeClass} proxy on the created {@link Class}.
     */
    @objid ("9c302da1-6aa9-4883-9c1f-31866b360e47")
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
    @objid ("67810d25-7620-417d-bc8a-f1eca7073850")
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
    @objid ("8af8e38a-a26d-46ab-b7c3-e27238ed03b1")
    public static AttributeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (AttributeClass.canInstantiate(obj))
            return new AttributeClass(obj);
        else
            throw new IllegalArgumentException("AttributeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("300fbde7-6cef-4735-a096-5e2a3ee96448")
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
    @objid ("8e0fcbf8-58d5-4fdb-8a45-258b0d5c4fa6")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("9fc52f22-77da-4e5a-b7f9-3a1389d05f2e")
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     */
    @objid ("0a6ebfbf-1e45-49ed-a7c2-c7977d78ce23")
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
    @objid ("725fafdc-4f52-42ca-b3d9-25696c33e398")
    public String getValue() {
        return this.elt.getTagValue(AttributeClass.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'valueType' role.<p>
     * Role description:
     * null
     */
    @objid ("716ee129-c98e-437a-a1a2-b5862f31726f")
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

    @objid ("8bd144f9-7e02-44ca-8dbe-4bc3c5da2f3b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("0a231f4d-323a-40c9-8e30-eb98e3498a76")
    public void setParent(final FeaturePackage obj) {
        ((Class) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     */
    @objid ("61c6adba-436c-4d15-aad1-d1b849be7479")
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
    @objid ("2fa36814-2e2a-4021-b771-1dd1b5823092")
    public void setValue(final String value) {
        this.elt.putTagValue(AttributeClass.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'valueType' role.<p>
     * Role description:
     * null
     */
    @objid ("b692f3f1-e918-4fd3-99aa-929136793740")
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

    @objid ("d8e66836-be05-4197-baa0-8464d046aca6")
    protected AttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("2e6d4ec3-39e4-419d-8e8c-ec5e59d6a3cb")
    public static final class MdaTypes {
        @objid ("9bafb256-30c5-4ab4-b763-a82eddeaac21")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("48e668fe-276f-4708-8b98-6219913327b3")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("2807de50-ca7b-4038-ad16-fd86cc97732c")
        private static Stereotype MDAASSOCDEP;

        @objid ("2839f6f4-4a7e-447e-8c74-34b8891106f1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("09990337-5143-472e-9f9b-d80f104d1410")
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
