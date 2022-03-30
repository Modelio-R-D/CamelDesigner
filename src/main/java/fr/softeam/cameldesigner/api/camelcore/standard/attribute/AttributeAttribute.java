/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("0fc7cb50-bfcd-4dad-a901-f5e8350a0767")
    public static final String STEREOTYPE_NAME = "Attribute_Attribute";

    /**
     * Tells whether a {@link AttributeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Attribute_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("579f399a-8bb8-4d9a-b8ff-606b79cbd6c6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Attribute_Attribute >> then instantiate a {@link AttributeAttribute} proxy.
     * 
     * @return a {@link AttributeAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("cf78ef07-1fbf-4f47-9ea9-a89428d4f990")
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
    @objid ("4ad17186-fe01-4afa-af97-b1dc4064f64f")
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
    @objid ("315b1e3c-9f84-4cec-840d-cb3095d8c3ea")
    public static AttributeAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (AttributeAttribute.canInstantiate(obj))
        	return new AttributeAttribute(obj);
        else
        	throw new IllegalArgumentException("AttributeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("eb1c33ea-fe2f-4e7a-9122-dc5e79742808")
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
    @objid ("f2dfb889-1ee4-48af-8edb-fbbd6bf596aa")
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
    @objid ("08752ad9-8921-4982-99c7-0b98ae731792")
    public FeatureClassifier getParent() {
        return (FeatureClassifier)CamelDesignerProxyFactory.instantiate(((Attribute) this.elt).getOwner(), FeatureClassifier.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3171103b-8642-4d21-bda5-a8ed32717364")
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
    @objid ("f550ee8c-78bf-4190-be2d-04dc5b93b492")
    public ValueType getValueType() {
        return (ValueType)CamelDesignerProxyFactory.instantiate(((Attribute) this.elt).getType(), ValueType.STEREOTYPE_NAME);
    }

    @objid ("a3984c60-ee2e-458e-be69-5dc7252c0c0e")
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
    @objid ("d6b2fcb8-4c08-400f-9cbb-b99f8456741b")
    public void setParent(final FeatureClassifier obj) {
        ((Attribute) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("41696db2-6060-42e6-99c1-23887388de30")
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
    @objid ("21ed8c64-4418-452d-b1b1-418319228a91")
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

    @objid ("8ea07a68-558b-4e84-a8cb-14c721f63c8b")
    protected AttributeAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("f558a895-629e-4294-9127-c70f14d14fce")
    public static final class MdaTypes {
        @objid ("380efd6d-592d-42a8-8d6d-d0a463446eae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("865e71df-01e7-4ea6-b77a-7a9b607c9774")
        private static Stereotype MDAASSOCDEP;

        @objid ("b8252e30-87b1-4820-94c3-41c5c4bf5f00")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("84563d56-4df1-4bd5-8b26-955f5e5f3ebc")
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
