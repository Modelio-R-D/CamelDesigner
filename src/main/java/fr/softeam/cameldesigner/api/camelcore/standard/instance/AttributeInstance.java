/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
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
    @objid ("fbf03665-3343-4d41-adac-19cdf5933ff0")
    public static final String STEREOTYPE_NAME = "Attribute_Instance";

    /**
     * Tells whether a {@link AttributeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Attribute_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("25393063-ae70-4392-8101-a52a051ed688")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Attribute_Instance >> then instantiate a {@link AttributeInstance} proxy.
     * 
     * @return a {@link AttributeInstance} proxy on the created {@link Instance}.
     */
    @objid ("8cc065ce-4af6-4229-9abc-e7d1738709e5")
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
    @objid ("ef08a7a2-776e-4cb6-8a64-897c1cdcb75b")
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
    @objid ("f944622c-8b6e-4ff2-97aa-29000ca2292e")
    public static AttributeInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (AttributeInstance.canInstantiate(obj))
        	return new AttributeInstance(obj);
        else
        	throw new IllegalArgumentException("AttributeInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4d2c0b60-63a8-492c-b4d7-453b9b0843fc")
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
    @objid ("d3cbc8fd-b8cb-4936-815e-c2b2cf344f94")
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
    @objid ("19c9ba4c-4519-4900-b01d-eca4914c2344")
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("dd460722-381a-4008-b6ef-64bbaecd54a0")
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
    @objid ("4d1e2475-94bd-4d42-b369-12db3fb28360")
    public ValueType getValueType() {
        return (ValueType)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), ValueType.STEREOTYPE_NAME);
    }

    @objid ("da41fe99-73ed-430b-9b5e-009b83cd4cfb")
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
    @objid ("275306c0-80bc-4c92-9f56-50d6c5c579d3")
    public void setParent(final FeaturePackage obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9b8058c9-4733-4e57-b2ee-1ddf7d780fb2")
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
    @objid ("3cf5c414-21e2-49ab-90de-c51540705025")
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

    @objid ("cb49ba32-15dd-403f-82e4-4092e201a3f3")
    protected AttributeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("ab0f3844-7b49-4767-a9ca-792c3b59bd02")
    public static final class MdaTypes {
        @objid ("00a01aa9-2907-4999-bc24-b974d8b1583f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("88cff68e-fa5b-4ec8-9312-7e83d7ada004")
        private static Stereotype MDAASSOCDEP;

        @objid ("0c9499b4-cd74-4fda-824a-a3f525d405e2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bdc4e7ee-4b52-4c3c-b15a-f4a7e556f705")
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
