/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.classifier.FeatureClassifier;
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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << Attribute_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c17a90da-4027-4328-abbc-1c1e75b596e7")
public class AttributeAttribute extends CamelAttribute {
    @objid ("2c675037-2bcb-4edf-8a68-93f1d6a598ff")
    public static final String STEREOTYPE_NAME = "Attribute_Attribute";

    /**
     * Tells whether a {@link AttributeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Attribute_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("313df66c-e8a6-460a-839d-7d8fe6ee7179")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Attribute_Attribute >> then instantiate a {@link AttributeAttribute} proxy.
     * 
     * @return a {@link AttributeAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("3bc63f12-0161-4789-acb3-30331e72c0a8")
    public static AttributeAttribute create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, AttributeAttribute.STEREOTYPE_NAME);
        return AttributeAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link AttributeAttribute} proxy from a {@link Attribute} stereotyped << Attribute_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link AttributeAttribute} proxy or <i>null</i>.
     */
    @objid ("b5a92344-2e8f-4101-b88e-d9b5ebedbb24")
    public static AttributeAttribute instantiate(final Attribute obj) {
        return AttributeAttribute.canInstantiate(obj) ? new AttributeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AttributeAttribute} proxy from a {@link Attribute} stereotyped << Attribute_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link AttributeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d9526644-a654-4ca5-84bd-9d3e26cbdc62")
    public static AttributeAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (AttributeAttribute.canInstantiate(obj))
        	return new AttributeAttribute(obj);
        else
        	throw new IllegalArgumentException("AttributeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7b4486ef-cc79-4dce-9030-ed1e4313de1a")
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
        AttributeAttribute other = (AttributeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("e8118802-5402-426e-84a3-756aff94ab98")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("242c79fe-1df0-46de-b744-9d5f445f72b7")
    public FeatureClassifier getParent() {
        return (FeatureClassifier)CamelDesignerProxyFactory.instantiate(((Attribute) this.elt).getOwner(), FeatureClassifier.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fb8c402f-aca9-498a-af95-7a21e3773344")
    public Unit getUnit() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(AttributeAttribute.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(AttributeAttribute.MdaTypes.MDAASSOCDEP_ROLE), "unit")){
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
    @objid ("758b9850-b7c5-4f8c-9df8-04822a71cf5c")
    public ValueType getValueType() {
        return (ValueType)CamelDesignerProxyFactory.instantiate(((Attribute) this.elt).getType(), ValueType.STEREOTYPE_NAME);
    }

    @objid ("7fc9fb43-a649-4915-9f31-6acb2d6ae08c")
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
    @objid ("d085a8f6-2447-4556-856c-72da6e80a843")
    public void setParent(final FeatureClassifier obj) {
        ((Attribute) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a34a69c8-d18e-40b1-8023-5369587ce7d5")
    public void setUnit(final Unit obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(AttributeAttribute.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(AttributeAttribute.MdaTypes.MDAASSOCDEP_ROLE), "unit")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), AttributeAttribute.MdaTypes.MDAASSOCDEP);
              dep.setName("unit");      dep.putTagValue(AttributeAttribute.MdaTypes.MDAASSOCDEP_ROLE, "unit");
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
    @objid ("940e3c9e-70cd-4732-9d23-1a63d6d28ac9")
    public void setValueType(final ValueType obj) {
        ((Attribute) this.elt).setType((obj != null) ? obj.getElement() : null);
    }

    @objid ("d4352f29-8cd2-4305-8e91-d3f6b9165362")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("7dd09d66-22ef-4372-b93e-6e20586ec01c")
    @Override
    public String getValue() {
        return this.getElement().getValue();
    }

    @objid ("1bc0a62e-8ebc-443c-94c3-8e4b4f6bc184")
    @Override
    public void setValue(String value) {
        this.getElement().setValue(value);
    }

    @objid ("8082ebbd-fe00-4b02-890c-a28cbcb72552")
    protected AttributeAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("f558a895-629e-4294-9127-c70f14d14fce")
    public static final class MdaTypes {
        @objid ("71d956ed-d75c-497b-ac67-86fce02c77f6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("acc45813-ae5f-4f5e-ab57-879ab2edf558")
        private static Stereotype MDAASSOCDEP;

        @objid ("924ec674-9987-4293-8f8a-82043dbbcf34")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d9e84d4-d893-4707-819c-36169ad2cfbf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02d333e9-0603-47b3-87bb-b2a311cc65dd");
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
