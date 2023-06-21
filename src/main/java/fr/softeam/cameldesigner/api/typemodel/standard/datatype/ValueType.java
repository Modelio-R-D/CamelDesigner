/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.datatype;

import java.util.ArrayList;
import java.util.List;
import camel.type.PrimitiveType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << ValueType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4afad244-096e-4660-b995-b2061cfa5947")
public abstract class ValueType extends ExpendableElement {
    @objid ("d13696e2-828e-4156-980e-5c2b28b12da4")
    public static final String STEREOTYPE_NAME = "ValueType";

    @objid ("16f3df6f-5b79-4f2d-ad38-7aab46fe73ed")
    public static final String PRIMITIVETYPE_TAGTYPE = "primitiveType";

    /**
     * Tells whether a {@link ValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << ValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5e96dad2-adb1-45b6-ac42-a80070c44c9c")
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

    @objid ("5beb9ea3-5f91-4b5c-8351-151d1abb565c")
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
     * 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("de852869-770d-42fa-b6dd-206f7e147896")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'primitiveType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f94d0b73-9234-45fa-a3d4-4331d18d6488")
    public String getPrimitiveType() {
        return this.elt.getTagValue(ValueType.MdaTypes.PRIMITIVETYPE_TAGTYPE_ELT);
    }

    @objid ("58a0d58f-04ca-4b4f-9f2f-e94755d0500e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'primitiveType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("126b877f-fbd8-484b-ab9e-db64f90f104f")
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

    @objid ("b005569a-95c0-4424-8593-ea0ded84a9dc")
    protected ValueType(final DataType elt) {
        super(elt);
    }

    @objid ("efcfe0b2-71a4-471e-afbf-52a17a61448e")
    public static final class MdaTypes {
        @objid ("3d830b3a-a9a6-441b-846a-4b2c8fe9e6f0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8da0e87f-599a-4f0b-b874-c57e62d7d460")
        public static TagType PRIMITIVETYPE_TAGTYPE_ELT;

        @objid ("c69d2e8e-615a-4505-a02c-59d522c398e4")
        private static Stereotype MDAASSOCDEP;

        @objid ("2b01122d-2ae9-4f59-be54-0a0786454792")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3da23230-2ede-453c-ae57-95c8708b93b5")
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
