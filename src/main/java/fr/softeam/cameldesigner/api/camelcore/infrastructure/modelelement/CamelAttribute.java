/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << CamelAttribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("95142f12-2b2c-454b-909a-53110f0aaecc")
public abstract class CamelAttribute extends ExpendableElement {
    @objid ("b6076f35-5522-4516-9e06-6389e5517e07")
    public static final String STEREOTYPE_NAME = "CamelAttribute";

    @objid ("9e575dcc-a956-4627-a421-aacb826b2a77")
    public static final String MAXINCLUSIVE_TAGTYPE = "maxInclusive";

    @objid ("1d573731-317a-4243-9962-b066adc48dc5")
    public static final String MAXVALUE_TAGTYPE = "maxValue";

    @objid ("62180919-73f6-40ea-bdda-9c91798aa073")
    public static final String MININCLUSIVE_TAGTYPE = "minInclusive";

    @objid ("81169dac-017d-42ff-9bc3-8e9c6f8e0cc7")
    public static final String MINVALUE_TAGTYPE = "minValue";

    /**
     * Tells whether a {@link CamelAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CamelAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c64e47b0-506c-4a01-a3fa-33a8bca43776")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelAttribute.STEREOTYPE_NAME));
    }

    @objid ("79a69203-ccae-4efa-a016-363ad7ce4559")
    public static CamelAttribute instantiate(final ModelElement obj) {
        return AttributeAttribute.canInstantiate(obj) ? AttributeAttribute.instantiate(obj) :
            AttributeClass.canInstantiate(obj) ? AttributeClass.instantiate(obj) : null;
    }

    @objid ("3fb3b19b-44ed-4a41-a853-8393c3f0c0d8")
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
        CamelAttribute other = (CamelAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("67a111de-3d6e-471a-974b-8c2c05b219df")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'maxValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dcdd5e0f-46d3-4260-b916-e6b7c7ac64ce")
    public String getMaxValue() {
        return this.elt.getTagValue(CamelAttribute.MdaTypes.MAXVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("749370ce-3cf0-487b-80d6-2cf75ac5d840")
    public String getMinValue() {
        return this.elt.getTagValue(CamelAttribute.MdaTypes.MINVALUE_TAGTYPE_ELT);
    }

    @objid ("b34c27e2-0185-4876-b168-7baf177b368c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'maxInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("20586f65-1999-4b72-8ea1-1bce76f65731")
    public boolean isMaxInclusive() {
        return this.elt.isTagged(CamelAttribute.MdaTypes.MAXINCLUSIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'minInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9a5f62b4-5fc1-45f7-9585-6e9ca4f78cb1")
    public boolean isMinInclusive() {
        return this.elt.isTagged(CamelAttribute.MdaTypes.MININCLUSIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'maxInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2a3b1edf-cb64-4683-b02d-752834f4156d")
    public void setMaxInclusive(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CamelAttribute.MdaTypes.MAXINCLUSIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CamelAttribute.MdaTypes.MAXINCLUSIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'maxValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6560a0be-9e1c-4e0b-be9f-9bda1b1d0832")
    public void setMaxValue(final String value) {
        this.elt.putTagValue(CamelAttribute.MdaTypes.MAXVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'minInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e27b3c2e-0776-4ebd-92b4-2465f1275548")
    public void setMinInclusive(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CamelAttribute.MdaTypes.MININCLUSIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CamelAttribute.MdaTypes.MININCLUSIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'minValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("243fe9d4-1801-4d45-96bd-ec5a7d6c2c33")
    public void setMinValue(final String value) {
        this.elt.putTagValue(CamelAttribute.MdaTypes.MINVALUE_TAGTYPE_ELT, value);
    }

    @objid ("ce91264e-0001-44d2-981f-3ee1e7494632")
    public abstract Unit getUnit();

    @objid ("48faeeba-82b2-40f8-9227-3a1bb692c423")
    public abstract String getValue();

    @objid ("bf17342a-96ff-4a4d-9982-96223e013ee4")
    public abstract ValueType getValueType();

    @objid ("b0fec14f-55aa-434b-9921-fe5a98c03666")
    public abstract void setUnit(final Unit obj);

    @objid ("87ad5a8c-d7ef-4404-8a08-b2e760da4e61")
    public abstract void setValue(String value);

    @objid ("dfa12e10-a0f9-4768-872b-ef51ea1a5db9")
    public abstract void setValueType(final ValueType obj);

    @objid ("5df1fa4d-92ef-49de-9a31-d6cef036fbda")
    protected CamelAttribute(final ModelElement elt) {
        super(elt);
    }

    @objid ("b2b5f006-86dd-4eba-8d2f-bb3d0fc4f4f7")
    public static final class MdaTypes {
        @objid ("59621b23-458f-4bf4-b4f4-665f159526bd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("66ffe0ee-b088-463d-8e1e-3a92407b6785")
        public static TagType MININCLUSIVE_TAGTYPE_ELT;

        @objid ("9b164e1e-695c-4e8f-b7e0-c76e5c79c7b4")
        public static TagType MAXINCLUSIVE_TAGTYPE_ELT;

        @objid ("6968289e-1c7d-449c-bfe2-7bd7ffabf2eb")
        public static TagType MINVALUE_TAGTYPE_ELT;

        @objid ("b6403258-a9c2-4e20-8eea-8ff3a7a1b5f5")
        public static TagType MAXVALUE_TAGTYPE_ELT;

        @objid ("ca6d5c71-8d15-498a-8c3b-fae0173d0c95")
        private static Stereotype MDAASSOCDEP;

        @objid ("0c3cbe7a-bf2e-40ea-8ee1-0a26e2f44853")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9e2baf8a-4e80-4e5f-9b1e-abb422ed66af")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "342512a5-ad9b-48b8-a454-5fd44237b8f2");
            MININCLUSIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1468f9d7-f3e5-4acf-b1a7-610abfa949e5");
            MAXINCLUSIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "13121425-325d-402f-8500-92cdcf8ced03");
            MINVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a603f3b2-3c32-4fe8-bcb5-275d9e614457");
            MAXVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce381974-5a02-459d-8bbd-192804629d19");
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
