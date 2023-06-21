/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("bf5bcef0-180c-4f86-b27c-f905acce9e62")
    public static final String STEREOTYPE_NAME = "CamelAttribute";

    @objid ("d689ab2e-2923-4e92-bb06-2e2ad7def01f")
    public static final String MAXINCLUSIVE_TAGTYPE = "maxInclusive";

    @objid ("659ac3d1-9484-4a4f-a2ca-f0294237917d")
    public static final String MAXVALUE_TAGTYPE = "maxValue";

    @objid ("e1e1e36c-d6fc-4416-a728-53023f7a082c")
    public static final String MININCLUSIVE_TAGTYPE = "minInclusive";

    @objid ("1c3a8a53-e535-4b97-a3c1-3cc9877cfc93")
    public static final String MINVALUE_TAGTYPE = "minValue";

    /**
     * Tells whether a {@link CamelAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CamelAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("653c151c-a917-4966-9179-cc667c9b5364")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelAttribute.STEREOTYPE_NAME));
    }

    @objid ("79a69203-ccae-4efa-a016-363ad7ce4559")
    public static CamelAttribute instantiate(final ModelElement obj) {
        return AttributeAttribute.canInstantiate(obj) ? AttributeAttribute.instantiate(obj) :
            AttributeClass.canInstantiate(obj) ? AttributeClass.instantiate(obj) : null;
    }

    @objid ("08c7ba29-7f84-43b4-a5d9-1ae3ca46dc8f")
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
    @objid ("1cdd03ff-4c2c-4708-bd81-a7b00cb0f16e")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'maxValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("13399333-5b36-4e48-b9d6-6e694561e097")
    public String getMaxValue() {
        return this.elt.getTagValue(CamelAttribute.MdaTypes.MAXVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7bb02d3a-25c6-4edb-8f00-f6c0ebd55a2d")
    public String getMinValue() {
        return this.elt.getTagValue(CamelAttribute.MdaTypes.MINVALUE_TAGTYPE_ELT);
    }

    @objid ("b8ee0559-fb13-4981-a1ab-c46519cfea4c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'maxInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5eee08c0-5988-4899-bee3-e114ec4abdc1")
    public boolean isMaxInclusive() {
        return this.elt.isTagged(CamelAttribute.MdaTypes.MAXINCLUSIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'minInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("70656ca8-7760-4b38-aae1-9a61e85bfa29")
    public boolean isMinInclusive() {
        return this.elt.isTagged(CamelAttribute.MdaTypes.MININCLUSIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'maxInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a9228541-43a2-427a-bbb7-32dc83d85e90")
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
    @objid ("7dcff4a4-32ad-4bf1-ad3f-b97e619712e3")
    public void setMaxValue(final String value) {
        this.elt.putTagValue(CamelAttribute.MdaTypes.MAXVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'minInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2e58804d-1ae6-4ca3-9eb5-a6a43be8effb")
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
    @objid ("ac8a8a3b-3e58-44ce-84df-7dba8254cc18")
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

    @objid ("f7bc913a-cdbd-4f15-8c1e-43cfe8e94556")
    protected CamelAttribute(final ModelElement elt) {
        super(elt);
    }

    @objid ("b2b5f006-86dd-4eba-8d2f-bb3d0fc4f4f7")
    public static final class MdaTypes {
        @objid ("19896082-0e79-4630-bbba-77453b041cea")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e2829192-c14b-4b7e-ba0c-a8e0f67efd40")
        public static TagType MININCLUSIVE_TAGTYPE_ELT;

        @objid ("16c9151d-f579-4427-9037-c2cd1ef691c0")
        public static TagType MAXINCLUSIVE_TAGTYPE_ELT;

        @objid ("8103a23d-5ea6-43d2-b68d-03dbc7ed84b6")
        public static TagType MINVALUE_TAGTYPE_ELT;

        @objid ("c6f6ac70-16c6-43d7-a514-662a03103ba9")
        public static TagType MAXVALUE_TAGTYPE_ELT;

        @objid ("8b55f834-f3da-45dc-9a31-9cd2de677a01")
        private static Stereotype MDAASSOCDEP;

        @objid ("f8304b8e-51f7-40c2-856d-020bf3739490")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8575538f-c501-4e55-b096-296ecd433ee2")
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
