/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("6df5427d-a120-4572-9edc-9a2ec1406bc3")
    public static final String STEREOTYPE_NAME = "Attribute_Instance";

    /**
     * Tells whether a {@link AttributeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Attribute_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a7661aed-9b57-46ab-97cf-3e5a7e01ac73")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Attribute_Instance >> then instantiate a {@link AttributeInstance} proxy.
     * 
     * @return a {@link AttributeInstance} proxy on the created {@link Instance}.
     */
    @objid ("855a9bf4-6c88-41a0-96c5-c22bcf628218")
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
    @objid ("dccc3029-b7d8-4105-b681-360308478747")
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
    @objid ("a2876bfd-2c31-4b56-9f96-cee8ede87733")
    public static AttributeInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (AttributeInstance.canInstantiate(obj))
        	return new AttributeInstance(obj);
        else
        	throw new IllegalArgumentException("AttributeInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4f40cc95-15ff-4c36-9f9f-56fe3892e115")
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
    @objid ("a4bdca8b-df28-47a5-a20a-2cb300d27351")
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
    @objid ("28e7d3d4-aa3a-4ea1-9e62-b09c63cab6ea")
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ff0aa4e8-62d3-49fa-9e51-be1f8576e568")
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
    @objid ("0282df83-d2c3-4a5b-8ffd-fea24a7184ad")
    public ValueType getValueType() {
        return (ValueType)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), ValueType.STEREOTYPE_NAME);
    }

    @objid ("6eddbaf9-913e-4781-b000-48bd99e01e4f")
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
    @objid ("3e9ca0de-f182-4a05-bf99-a2d7741a2a96")
    public void setParent(final FeaturePackage obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a9207e80-a7e1-4db5-907c-a960693b1dc4")
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
    @objid ("67dc0b56-5093-4250-be55-21d9ef8d0b0e")
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

    @objid ("b5ea53ff-feb9-4e82-a70f-e4006fe3a2ba")
    protected AttributeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("ab0f3844-7b49-4767-a9ca-792c3b59bd02")
    public static final class MdaTypes {
        @objid ("b9e8bb82-8255-4b0b-a58f-0f24e690c0ca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2efefc64-3c75-479a-8526-6fb8fbb178fe")
        private static Stereotype MDAASSOCDEP;

        @objid ("06a85457-215b-42b9-a572-1bb1cd5fcb84")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c628910-dfb6-49ad-9bd3-96f7d0ca6bc9")
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
