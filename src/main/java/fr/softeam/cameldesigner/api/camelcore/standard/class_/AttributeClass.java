/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d1ca657f-c2e6-447b-8782-950cfd596f6d")
    public static final String STEREOTYPE_NAME = "Attribute_Class";

    @objid ("399e8751-cfaa-479f-bb4a-b06ac016e61f")
=======
    @objid ("5f77794e-badc-4ed5-bdd2-693d7baa62b0")
    public static final String STEREOTYPE_NAME = "Attribute_Class";

    @objid ("57bb5917-a176-442a-9f4e-914c58f728b9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String VALUE_TAGTYPE = "Value";

    /**
     * Tells whether a {@link AttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Attribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("2b99bd51-13fe-4615-b153-cdd667bb5130")
=======
    @objid ("a154cc85-5b41-485d-a540-dad1ef8f845b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Attribute_Class >> then instantiate a {@link AttributeClass} proxy.
     * 
     * @return a {@link AttributeClass} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("2bb70c8b-39ff-4a6b-9e23-9b1842e60715")
=======
    @objid ("e93fbffc-8fe2-4366-8c50-fc51bf48f36d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("820caa4b-d488-4540-8bfb-c14d2a2d4320")
=======
    @objid ("0bcd17e3-5d2e-4c6a-841e-a274f47bde91")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("236305d7-0162-4c56-a0e5-5a7249ef75d2")
=======
    @objid ("6efae11b-d359-4383-a697-f9a8f0f4046e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static AttributeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (AttributeClass.canInstantiate(obj))
        	return new AttributeClass(obj);
        else
        	throw new IllegalArgumentException("AttributeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("30b6915e-014c-4f07-96dd-b21d1d33d501")
=======
    @objid ("f3fcc806-653e-4d26-b99e-d50ac6e2b382")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1d629bb7-da5b-4245-a600-bf7a6a3c05d7")
=======
    @objid ("58b92e29-e426-4784-aae6-6ef8ec340aae")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("47219fd3-ccbf-413a-a4e2-20d120807c17")
=======
    @objid ("a46ec43e-ddd4-4c69-b422-5618b0a42787")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8498b71f-7d46-41e1-9f1d-895d9667349f")
=======
    @objid ("e84e8807-9831-462d-98d6-a21e719174ef")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("17709929-2415-4317-a7e6-2409a664955d")
=======
    @objid ("3ad398b4-a49f-4b0b-9242-f7045a761fcc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getValue() {
        return this.elt.getTagValue(AttributeClass.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("2eddae89-f665-41a9-95d9-89eeae1a10ce")
=======
    @objid ("27bb6178-99c5-4c38-af9d-905e09b1d95c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("bf98f229-4344-4c8e-8a42-1b9ece399c9a")
=======
    @objid ("c18ee21e-c989-46be-8fe4-b6fd4a957e8a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2098785d-26fc-420b-8796-a2fd6b1fbbb5")
=======
    @objid ("61266b81-0e9f-4d63-8a09-35b73f656753")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setParent(final FeaturePackage obj) {
        ((Class) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("88ea36c4-3581-4e92-8cda-a47074bc3473")
=======
    @objid ("aeba0d5b-e479-4293-9b33-0490068524f8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("627a117c-5ff7-46d8-b430-dbefc10d698c")
=======
    @objid ("5ffc1628-3360-498e-b0f7-fd11770d9200")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setValue(final String value) {
        this.elt.putTagValue(AttributeClass.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f618cbc1-9f07-4345-a6e3-58505b049e72")
=======
    @objid ("e21f5306-6037-4e36-b859-ddd84059f79d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("c35de09d-ac62-43a1-b7a1-0d8780a228ee")
=======
    @objid ("fa6746b8-84ec-4ec6-9595-ee5b43739301")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected AttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("2e6d4ec3-39e4-419d-8e8c-ec5e59d6a3cb")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("022aea5a-ddf5-4b5d-b011-ac5c32cd53d3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("33a9363a-5682-46e5-b56d-3ed965333f9a")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("c6628723-f238-42af-9908-b80387d70806")
        private static Stereotype MDAASSOCDEP;

        @objid ("75344e08-450b-4c25-91c5-d90cc71b7390")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6f7a224a-1a7d-4144-93e7-6d21ea0c918b")
=======
        @objid ("fdc7db02-b647-4beb-b93e-14a74b968508")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b9cf19ab-c2e2-4475-949d-7585d8fe544a")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("4f1d5a38-60a2-4c04-b6d3-c9489e24ece9")
        private static Stereotype MDAASSOCDEP;

        @objid ("404a7e98-20c6-460d-b644-873548799e81")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3d0b6c83-ef05-49af-88b5-33c740f6313a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
