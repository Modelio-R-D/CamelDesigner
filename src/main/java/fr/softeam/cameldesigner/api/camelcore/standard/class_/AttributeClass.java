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
    @objid ("f57f4474-b683-4655-a550-44653f10726a")
    public static final String STEREOTYPE_NAME = "Attribute_Class";

    @objid ("a7c802b4-d9f3-4147-a5df-d143eac21770")
    public static final String VALUE_TAGTYPE = "Value";

    /**
     * Tells whether a {@link AttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Attribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d191cd5a-316d-42c6-a9e2-b768afa20ae8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Attribute_Class >> then instantiate a {@link AttributeClass} proxy.
     * 
     * @return a {@link AttributeClass} proxy on the created {@link Class}.
     */
    @objid ("61e9ce39-10bc-425a-88e4-ca3e2205ed55")
    public static AttributeClass create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, AttributeClass.STEREOTYPE_NAME);
        return AttributeClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link AttributeClass} proxy from a {@link Class} stereotyped << Attribute_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link AttributeClass} proxy or <i>null</i>.
     */
    @objid ("d37105c1-c985-4318-8bc6-9d597e628df0")
    public static AttributeClass instantiate(final Class obj) {
        return AttributeClass.canInstantiate(obj) ? new AttributeClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AttributeClass} proxy from a {@link Class} stereotyped << Attribute_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link AttributeClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9d5c94ae-0922-40e3-837c-ed42fbe138a5")
    public static AttributeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (AttributeClass.canInstantiate(obj))
        	return new AttributeClass(obj);
        else
        	throw new IllegalArgumentException("AttributeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1566fe04-6169-4b7a-b20c-69931acf1d13")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b53a9511-6bc7-40bb-a8a4-f00fb01c7fd2")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fc670c90-59cc-4aeb-9041-40d1e5032f34")
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("da216bfc-d5b4-4f81-893d-4d81a9cae936")
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
    @objid ("b57d5046-62d8-43dd-a6c9-8ef1fc8bab2c")
    public String getValue() {
        return this.elt.getTagValue(AttributeClass.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b97ca1de-485d-4715-98a8-2cd008d3df2c")
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

    @objid ("faf1be73-a830-4f80-b5c2-7be4d3e99a8d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0b1399e7-df78-4295-bcff-23ac2eb5eac4")
    public void setParent(final FeaturePackage obj) {
        ((Class) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("00e99167-0216-4525-90a2-f0a4c2ddefbc")
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
    @objid ("a3fd7fab-a39c-45de-8447-a3f9775b9900")
    public void setValue(final String value) {
        this.elt.putTagValue(AttributeClass.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0f284e58-3f0a-4e19-b60a-fdc2f2513bb7")
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

    @objid ("1f4766f6-0d90-4073-a327-a570c30073ac")
    protected AttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("2e6d4ec3-39e4-419d-8e8c-ec5e59d6a3cb")
    public static final class MdaTypes {
        @objid ("7bf4f6c8-efc5-4c55-8c11-26a91daf6b6a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("13643cf7-dfdc-4b82-b676-6bbb811749df")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("8477e48e-b377-4eca-ba1e-146ee12c4cc2")
        private static Stereotype MDAASSOCDEP;

        @objid ("4f7cce42-3ad2-4388-b5c6-53c3a37060fc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c09dc58f-12aa-43d9-91be-8971913b3511")
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
