/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("4212b0ef-7e68-4934-b002-950776135906")
    public static final String STEREOTYPE_NAME = "Attribute_Instance";

    /**
     * Tells whether a {@link AttributeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Attribute_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("75f6a697-b1d3-4382-b194-1f2796fe64a7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Attribute_Instance >> then instantiate a {@link AttributeInstance} proxy.
     * 
     * @return a {@link AttributeInstance} proxy on the created {@link Instance}.
     */
    @objid ("b805b3be-51f2-4450-9547-3c0b4f81cd86")
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
    @objid ("c1664a7b-1e35-4998-8082-6969125a7eed")
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
    @objid ("d07f6687-eb48-4ef1-8d50-de00d1ef1ad3")
    public static AttributeInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (AttributeInstance.canInstantiate(obj))
        	return new AttributeInstance(obj);
        else
        	throw new IllegalArgumentException("AttributeInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("748a9d8d-b720-4145-a6e3-154f036ade55")
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
    @objid ("b0d9f4a9-ced5-412d-ac06-af8962671e38")
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
    @objid ("4d8bd0c8-75e2-408f-897c-cbe0e8637c53")
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("13a554fd-a000-4f9a-8c17-61c67baf9556")
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
    @objid ("c4820b46-ece7-4fc5-b604-8e4547f78c88")
    public ValueType getValueType() {
        return (ValueType)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), ValueType.STEREOTYPE_NAME);
    }

    @objid ("12ed1124-ea25-4e56-9360-727b86e8ea02")
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
    @objid ("0e8d286d-cb6c-4719-9962-96f85d283fdd")
    public void setParent(final FeaturePackage obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8522eac8-9c9a-4e81-8e9f-81397ca39a9c")
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
    @objid ("903effb8-a2f7-403f-a5e0-51dfd06c349a")
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

    @objid ("92518dcc-953f-4945-905f-b3dc213e5f54")
    protected AttributeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("ab0f3844-7b49-4767-a9ca-792c3b59bd02")
    public static final class MdaTypes {
        @objid ("ff455773-d12d-4aaa-80ff-3ca259851a36")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3a6c8eb0-a1c8-4958-a229-f24a1caff80a")
        private static Stereotype MDAASSOCDEP;

        @objid ("2b3bb11f-05a2-43e0-adda-c5a721a4bdae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b71c63c0-b9e8-4d21-81d2-32eba072c374")
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
