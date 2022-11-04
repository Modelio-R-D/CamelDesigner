/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.FeaturePackage;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << Attribute_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6e127b99-d9dd-4eda-8542-a1a4a387427e")
public class AttributeInstance extends CamelAttribute {
    @objid ("b1384005-ba4f-4b79-8e4f-d134767ed0ee")
    public static final String STEREOTYPE_NAME = "Attribute_Instance";

    /**
     * Tells whether a {@link AttributeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Attribute_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("926dd0fa-51a1-4f5a-ac2d-fecb59f52a3c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Attribute_Instance >> then instantiate a {@link AttributeInstance} proxy.
     * 
     * @return a {@link AttributeInstance} proxy on the created {@link Instance}.
     */
    @objid ("cb706404-db3d-4193-917b-97dbbe689c5b")
    public static AttributeInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, AttributeInstance.STEREOTYPE_NAME);
        return AttributeInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link AttributeInstance} proxy from a {@link Instance} stereotyped << Attribute_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link AttributeInstance} proxy or <i>null</i>.
     */
    @objid ("47fa8d6d-4200-4d6a-bb05-43920f278c5b")
    public static AttributeInstance instantiate(final Instance obj) {
        return AttributeInstance.canInstantiate(obj) ? new AttributeInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AttributeInstance} proxy from a {@link Instance} stereotyped << Attribute_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link AttributeInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2172da76-228b-40c2-8432-ae02a9f84c8c")
    public static AttributeInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (AttributeInstance.canInstantiate(obj))
        	return new AttributeInstance(obj);
        else
        	throw new IllegalArgumentException("AttributeInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0d10c9fb-e3ef-4ee2-afd6-7453a45d80da")
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
        AttributeInstance other = (AttributeInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("244f8f0c-62b6-4b24-8ba3-a4a09de11b9e")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8cb8069c-558e-4180-9164-0114c65651fe")
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7f523212-7cce-477d-aeda-6f007e291663")
    public Unit getUnit() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(AttributeInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(AttributeInstance.MdaTypes.MDAASSOCDEP_ROLE), "unit")){
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
     * Get the value to the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7f867ba5-cb76-48f2-b435-656dadfcdda8")
    public ValueType getValueType() {
        return (ValueType)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), ValueType.STEREOTYPE_NAME);
    }

    @objid ("53832e3e-0d98-4133-b089-d7c9b6f89f2f")
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
    @objid ("e9b8f637-91b4-462d-93a5-a57ff6de92ac")
    public void setParent(final FeaturePackage obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4eba6328-a222-42aa-8c0b-31158cd1f8c1")
    public void setUnit(final Unit obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(AttributeInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(AttributeInstance.MdaTypes.MDAASSOCDEP_ROLE), "unit")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), AttributeInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("unit");      dep.putTagValue(AttributeInstance.MdaTypes.MDAASSOCDEP_ROLE, "unit");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'valueType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("93443554-0940-4c30-b4fa-3aef7dd414d9")
    public void setValueType(final ValueType obj) {
        ((Instance) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    @objid ("41929712-ca3f-4efb-9343-db05ea093131")
    @Override
    public String getValue() {
        return this.getElement().getValue();
    }

    @objid ("edc9b2e2-5004-4747-8ad4-7ae31a045a6f")
    @Override
    public void setValue(String value) {
        this.getElement().setValue(value);
    }

    @objid ("7d03d0ec-afa6-40a3-841a-740a41c4e6a2")
    protected AttributeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("ab0f3844-7b49-4767-a9ca-792c3b59bd02")
    public static final class MdaTypes {
        @objid ("aa4e907a-78bf-4302-8ef4-362c73789d42")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0bc8f7ae-02d5-4e37-bca0-79d4076fc00c")
        private static Stereotype MDAASSOCDEP;

        @objid ("3b6f2c8c-4bbe-478f-8856-2b8cd39acda5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("29356f63-ca48-44d6-b5a2-1c0ff3c6c326")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8b30d8e4-9ef1-4826-aa89-3e656546300b");
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
