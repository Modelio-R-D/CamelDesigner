/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("a410ab3c-1bcf-4c49-ad97-23a96ef1e8d5")
    public static final String STEREOTYPE_NAME = "CamelAttribute";

    @objid ("25a1724f-3698-496b-af66-1cb7e9f9f9af")
    public static final String MAXINCLUSIVE_TAGTYPE = "maxInclusive";

    @objid ("157da5a3-2f8a-4a7a-bbb9-a2d0f9846583")
    public static final String MAXVALUE_TAGTYPE = "maxValue";

    @objid ("f52b4ba4-6032-4882-8459-367b9c76d154")
    public static final String MININCLUSIVE_TAGTYPE = "minInclusive";

    @objid ("c145129c-87bd-4b2b-b463-52aabdb5c64e")
    public static final String MINVALUE_TAGTYPE = "minValue";

    /**
     * Tells whether a {@link CamelAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CamelAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("68e55b18-f858-414a-bf3a-42c0ea10c9b3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelAttribute.STEREOTYPE_NAME));
    }

    @objid ("79a69203-ccae-4efa-a016-363ad7ce4559")
    public static CamelAttribute instantiate(final ModelElement obj) {
        return AttributeAttribute.canInstantiate(obj) ? AttributeAttribute.instantiate(obj) :
            AttributeClass.canInstantiate(obj) ? AttributeClass.instantiate(obj) : null;
    }

    @objid ("5742d02c-3358-4a40-8c61-e50652ec9618")
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
    @objid ("c6748aec-1ef2-47fa-a2e1-5fc702b6171b")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'maxValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bb56cceb-2c22-4e10-a270-70cae6193dc5")
    public String getMaxValue() {
        return this.elt.getTagValue(CamelAttribute.MdaTypes.MAXVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2ee30089-7b7b-48f8-8cb0-4f59e5c36c06")
    public String getMinValue() {
        return this.elt.getTagValue(CamelAttribute.MdaTypes.MINVALUE_TAGTYPE_ELT);
    }

    @objid ("5e4f989c-50af-4bca-a635-2ac9f0fa807d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'maxInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("981ed974-0bd8-43ad-b034-1f1b51e018fd")
    public boolean isMaxInclusive() {
        return this.elt.isTagged(CamelAttribute.MdaTypes.MAXINCLUSIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'minInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("996aa5bb-33a7-4d5a-bc5e-a7a12dd88b77")
    public boolean isMinInclusive() {
        return this.elt.isTagged(CamelAttribute.MdaTypes.MININCLUSIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'maxInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3311b29d-8393-4386-953d-552de7f09a9f")
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
    @objid ("a2ff2e96-f39e-4949-a955-3b2d89ba7ff1")
    public void setMaxValue(final String value) {
        this.elt.putTagValue(CamelAttribute.MdaTypes.MAXVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'minInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8589afcd-177b-4f53-96ca-6b3594684f91")
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
    @objid ("c59a118f-dd62-44b1-bef6-351352b14169")
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

    @objid ("9f947a4a-34a5-4dec-9d61-b374af161b28")
    protected CamelAttribute(final ModelElement elt) {
        super(elt);
    }

    @objid ("b2b5f006-86dd-4eba-8d2f-bb3d0fc4f4f7")
    public static final class MdaTypes {
        @objid ("7ff4441f-3959-409b-aaee-eefb04d9d361")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("81b707f6-bef7-4085-89fc-b5dac465f891")
        public static TagType MININCLUSIVE_TAGTYPE_ELT;

        @objid ("f818a2e5-2d1e-439a-a91f-5f14226e7960")
        public static TagType MAXINCLUSIVE_TAGTYPE_ELT;

        @objid ("13b20738-45b6-43c4-8bf1-ee6c68203317")
        public static TagType MINVALUE_TAGTYPE_ELT;

        @objid ("268391fd-fe98-4c4b-b034-415a1a0a2bbe")
        public static TagType MAXVALUE_TAGTYPE_ELT;

        @objid ("3d31ced0-3404-4ebb-a30b-758b7d4af4fe")
        private static Stereotype MDAASSOCDEP;

        @objid ("f58ed2c4-06c5-4510-b979-d8c997d115a4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("af94c40b-ecf1-4c3e-8fab-ca7035a62747")
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
