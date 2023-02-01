/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.typemodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import camel.type.PrimitiveType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement;
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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << ValueType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4afad244-096e-4660-b995-b2061cfa5947")
public abstract class ValueType extends ExpendableElement {
<<<<<<< HEAD
    @objid ("13ba5ea0-e035-4eca-92c4-3e059cdc1ac2")
    public static final String STEREOTYPE_NAME = "ValueType";

    @objid ("c710f445-fc73-407c-bb2c-62932f0d0a82")
=======
    @objid ("93a4e48d-9001-471e-8a3b-63cc1f41aef6")
    public static final String STEREOTYPE_NAME = "ValueType";

    @objid ("4df0c086-c2cd-4e65-92df-4ef73001bfe3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String PRIMITIVETYPE_TAGTYPE = "primitiveType";

    /**
     * Tells whether a {@link ValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << ValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("b2ef268c-86bd-42a0-86dc-e781fe53c6da")
=======
    @objid ("938ce76e-9f3b-4399-9a65-6bfdfbe5567c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ValueType.STEREOTYPE_NAME));
    }

    @objid ("eb34ccfc-6ed7-43f8-88ba-85ea48990c64")
    public static ValueType instantiate(final DataType obj) {
        return StringValueType.canInstantiate(obj) ? new StringValueType(obj) :
            BooleanValueType.canInstantiate(obj) ? new BooleanValueType(obj) :
                Range.canInstantiate(obj) ? new Range(obj) :
                    StringValueType.canInstantiate(obj) ? new StringValueType(obj) :
                        CamelList.canInstantiate(obj) ? new CamelList(obj) :
                            RangeUnion.canInstantiate(obj) ? new RangeUnion(obj) : null;
    }

<<<<<<< HEAD
    @objid ("e4e226de-ced9-4191-9736-607d458cf189")
=======
    @objid ("d9e71d2f-83d5-41fd-acf1-1fd938de0952")
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
        ValueType other = (ValueType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("5601d7fb-7be8-4f59-ac71-56c08e4a4901")
=======
    @objid ("d4b94bbb-b3d3-472a-8812-bf646de1c187")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'primitiveType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("f13cc6ed-ec6b-4244-bd82-9edf20b1a27b")
=======
    @objid ("315dbe6a-a596-465f-a854-11decdedced4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getPrimitiveType() {
        return this.elt.getTagValue(ValueType.MdaTypes.PRIMITIVETYPE_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("e28d3a02-07e4-4655-8386-612a4ce44fc6")
=======
    @objid ("ee832a74-65be-46cc-b8cc-7dad32fc7862")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'primitiveType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("cd067814-a231-4225-8e61-551390c614fa")
=======
    @objid ("0aabf819-c9d8-4310-8419-cdb916e7837f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setPrimitiveType(final String value) {
        this.elt.putTagValue(ValueType.MdaTypes.PRIMITIVETYPE_TAGTYPE_ELT, value);
    }

    /**
     * Getter for 'primitiveType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dd0d2fea-b47a-462a-b375-40067d8ae28c")
    public PrimitiveType getCamelPrimitiveType() {
        return PrimitiveType.valueOf(this.elt.getTagValue(ValueType.MdaTypes.PRIMITIVETYPE_TAGTYPE_ELT));
    }

    @objid ("e034a09e-b677-4dd4-a626-a58ef6f05c4e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    /**
     * Setter for string property 'primitiveType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("da849c99-8495-4ab7-9715-7ee632e760ad")
    public void setCamelPrimitiveType(final PrimitiveType value) {
        this.elt.putTagValue(ValueType.MdaTypes.PRIMITIVETYPE_TAGTYPE_ELT, value.toString());
    }

<<<<<<< HEAD
    @objid ("140f4223-4d02-4846-8fe8-37d9a8404a1d")
=======
    @objid ("4687d86c-2754-4c66-8f19-bc7c47164fff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ValueType(final DataType elt) {
        super(elt);
    }

    @objid ("efcfe0b2-71a4-471e-afbf-52a17a61448e")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("b18aea35-64e0-4a1e-a4ff-a45306aac9b9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3094e973-8ddf-4a59-86d9-400180d3ee94")
        public static TagType PRIMITIVETYPE_TAGTYPE_ELT;

        @objid ("59271fe4-66c3-4a31-9600-f265c30a4a8a")
        private static Stereotype MDAASSOCDEP;

        @objid ("468cc809-213d-4f66-a753-3954f14eafd0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2fbcd4aa-1ed1-4b51-875c-29188cf26e6f")
=======
        @objid ("9fa329eb-358a-4312-a7ee-cf0a74eaa627")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("aa6a1616-0fbf-4c30-9013-da23068862df")
        public static TagType PRIMITIVETYPE_TAGTYPE_ELT;

        @objid ("d554ddab-6ecd-4ace-8eda-ca1d83f18c03")
        private static Stereotype MDAASSOCDEP;

        @objid ("2744d36b-5576-4af3-a234-f7f970658c76")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6e86f74d-5904-44ff-a1d8-33dd1ed9ddbe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4fa7ea19-f563-4658-8d2a-755724d85061");
            PRIMITIVETYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "23bfa9f4-034d-4dcf-9837-9cdd4bd55ba2");
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
