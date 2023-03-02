/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
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
    @objid ("d14f5841-cd31-4f20-9d0d-131d604248c1")
    public static final String STEREOTYPE_NAME = "CamelAttribute";

    @objid ("700af6aa-a398-4336-98db-17a652a334cd")
    public static final String MAXINCLUSIVE_TAGTYPE = "maxInclusive";

    @objid ("419af08c-3c85-4653-89e6-2995aa379635")
    public static final String MAXVALUE_TAGTYPE = "maxValue";

    @objid ("17d52411-005b-4140-9825-8e86355164aa")
    public static final String MININCLUSIVE_TAGTYPE = "minInclusive";

    @objid ("df7afca9-1be5-4d6a-beb6-8a1e6dd95747")
    public static final String MINVALUE_TAGTYPE = "minValue";

    /**
     * Tells whether a {@link CamelAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CamelAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("90620703-3bcf-4d96-a2bf-f5cd4f454b4e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelAttribute.STEREOTYPE_NAME));
    }

    @objid ("79a69203-ccae-4efa-a016-363ad7ce4559")
    public static CamelAttribute instantiate(final ModelElement obj) {
        return AttributeAttribute.canInstantiate(obj) ? AttributeAttribute.instantiate(obj) :
            AttributeClass.canInstantiate(obj) ? AttributeClass.instantiate(obj) : null;
    }

    @objid ("1b3dca77-1bbf-4e08-84b5-8d8f88c6adc6")
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
    @objid ("1828b41d-216a-470a-940f-d7828af2d6ee")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'maxValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a4ad747d-b7d8-4961-abcd-63f812b05b39")
    public String getMaxValue() {
        return this.elt.getTagValue(CamelAttribute.MdaTypes.MAXVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fc1bb451-c719-410c-b67c-231c5879adc6")
    public String getMinValue() {
        return this.elt.getTagValue(CamelAttribute.MdaTypes.MINVALUE_TAGTYPE_ELT);
    }

    @objid ("00c722d2-41ea-4522-932e-742f5b36b888")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'maxInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("266a208a-6753-4848-8acf-a993bde24f26")
    public boolean isMaxInclusive() {
        return this.elt.isTagged(CamelAttribute.MdaTypes.MAXINCLUSIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'minInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("36624294-865c-4c41-8472-e447c705c44b")
    public boolean isMinInclusive() {
        return this.elt.isTagged(CamelAttribute.MdaTypes.MININCLUSIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'maxInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3078e28c-f14d-4c10-9b2a-32b9937d41da")
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
    @objid ("cbf2e142-cc92-4262-94ae-184bd2a5029e")
    public void setMaxValue(final String value) {
        this.elt.putTagValue(CamelAttribute.MdaTypes.MAXVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'minInclusive'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7db344b1-8b0d-426e-8c07-e43e89063ad9")
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
    @objid ("ac57e52f-2966-4c38-b0aa-018c7141216a")
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

    @objid ("86c4bcf9-04de-4790-8aa9-f8e9f4f46793")
    protected CamelAttribute(final ModelElement elt) {
        super(elt);
    }

    @objid ("b2b5f006-86dd-4eba-8d2f-bb3d0fc4f4f7")
    public static final class MdaTypes {
        @objid ("2dcee710-6bfb-42b9-ad85-bc9145a916ad")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4271782d-faa0-4f91-a9c8-1d92caa46c46")
        public static TagType MININCLUSIVE_TAGTYPE_ELT;

        @objid ("27777198-ff3e-4ad0-95ea-c9586b311bec")
        public static TagType MAXINCLUSIVE_TAGTYPE_ELT;

        @objid ("4c2a0356-d885-42af-944e-5d3c29926290")
        public static TagType MINVALUE_TAGTYPE_ELT;

        @objid ("d9a612de-8722-459e-83ed-fe9d67d5291a")
        public static TagType MAXVALUE_TAGTYPE_ELT;

        @objid ("7e003f56-0681-4aca-97d6-aa2ef15738bf")
        private static Stereotype MDAASSOCDEP;

        @objid ("abd30a7d-0ef2-43ab-ab6e-6b3d5b77d9d6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e8e7aa85-538e-46c1-a0d3-b51fa8b2679e")
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
