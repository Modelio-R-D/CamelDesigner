/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("32af5926-3cb7-415b-8f5e-784b57a9a4dc")
=======
    @objid ("93973f75-1d9f-4051-a737-b3b14f250510")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Attribute_Attribute";

    /**
     * Tells whether a {@link AttributeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Attribute_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("370deae6-659e-4d76-8fe5-504049568c01")
=======
    @objid ("28fd1d9c-6b87-4ca0-9688-57030c54c8fa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Attribute_Attribute >> then instantiate a {@link AttributeAttribute} proxy.
     * 
     * @return a {@link AttributeAttribute} proxy on the created {@link Attribute}.
     */
<<<<<<< HEAD
    @objid ("acabcd3e-b991-46af-9a20-2394bee2a64f")
=======
    @objid ("d523537d-cbf7-4441-9780-bced9011cc40")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f4e4b6ff-8050-4ac2-9ac7-78d2171201f1")
=======
    @objid ("e979b5d4-48ed-4c2e-b9b5-b78211fdfd01")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b05d341a-e152-43a2-a747-a87495e2a289")
=======
    @objid ("64b5082c-a682-441e-bcbb-27b8aa7562e3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static AttributeAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (AttributeAttribute.canInstantiate(obj))
        	return new AttributeAttribute(obj);
        else
        	throw new IllegalArgumentException("AttributeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("cd6977d4-5caf-4349-991b-0a24db2d6a07")
=======
    @objid ("8b3df76c-a56e-42c9-b214-b427f623f331")
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
        AttributeAttribute other = (AttributeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("485daea2-59b1-4efe-9ae0-80baef5018ee")
=======
    @objid ("feffc74c-7472-48f3-bb83-771075b22bca")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1e22c0ac-1083-4c9c-9e77-52016dfaeb6f")
=======
    @objid ("4129126b-7e8e-409f-91ec-bd42c60b282b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public FeatureClassifier getParent() {
        return (FeatureClassifier)CamelDesignerProxyFactory.instantiate(((Attribute) this.elt).getOwner(), FeatureClassifier.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("21843ef5-e304-4ee6-94c8-9b3add1cca59")
=======
    @objid ("95f380f7-4fea-46e8-a9b9-9b575aafa80a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1698241d-ea5c-46fe-8193-058161adbb27")
=======
    @objid ("ae079b4e-bac5-4077-ab09-3a6dc818e0d6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public ValueType getValueType() {
        return (ValueType)CamelDesignerProxyFactory.instantiate(((Attribute) this.elt).getType(), ValueType.STEREOTYPE_NAME);
    }

<<<<<<< HEAD
    @objid ("f23a90a4-6a59-4922-94ca-e8d1be733500")
=======
    @objid ("dffde36f-b832-4e76-a939-89c23c64a1c0")
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
    @objid ("aad5e9d4-b8ab-4586-9e0e-7b6a10b50188")
=======
    @objid ("392912c4-62e9-40b1-9f12-188f74b82fb8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setParent(final FeatureClassifier obj) {
        ((Attribute) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("2efd1a74-a74d-4940-b387-4c50da0e26f1")
=======
    @objid ("0a6d6b09-aada-49bd-80ed-b0695fd99fc8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a03f823f-d088-4281-b9f4-581a06bf83dc")
=======
    @objid ("6c83c2a1-b39e-4a4b-8c5c-77dc4f2e76bb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("ebd5e152-1bde-4df3-a8e0-c58a3c7a1000")
=======
    @objid ("67398529-2b7c-4f7c-bafa-64923897958d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected AttributeAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("f558a895-629e-4294-9127-c70f14d14fce")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("0fd0eab6-16df-43df-9219-99fecc200b91")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bfb07eba-07ed-4567-874d-8bd835ec6625")
        private static Stereotype MDAASSOCDEP;

        @objid ("01249cf8-a9f0-4d04-b9d4-70e2a57b1884")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4ede5811-8a06-4994-8907-8355b4971498")
=======
        @objid ("b980de07-2136-4873-8704-c85fd51fff13")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ba65381a-cdb0-4780-9c07-81de3d499a4e")
        private static Stereotype MDAASSOCDEP;

        @objid ("b0454b7e-1009-4d72-956e-b15698ece251")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f9212216-0234-4092-9198-58330fa664e1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
