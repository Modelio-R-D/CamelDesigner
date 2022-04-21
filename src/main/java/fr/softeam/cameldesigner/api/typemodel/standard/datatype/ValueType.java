/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
    @objid ("3429e821-926a-4d38-a83a-6825071f3d88")
    public static final String STEREOTYPE_NAME = "ValueType";

    @objid ("f2c9aca3-2e26-4d35-88d1-619abb90a921")
    public static final String PRIMITIVETYPE_TAGTYPE = "primitiveType";

    /**
     * Tells whether a {@link ValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << ValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e7dec0d0-5b65-4c84-814d-8d63cdf349e4")
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

    @objid ("9e8c3f04-de1e-4381-b6d1-60fb734d94e9")
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
    @objid ("973b5b18-cf42-4108-bf9f-abf19f1816f0")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'primitiveType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ce246570-3d28-4ed2-8091-a516930731b9")
    public String getPrimitiveType() {
        return this.elt.getTagValue(ValueType.MdaTypes.PRIMITIVETYPE_TAGTYPE_ELT);
    }

    @objid ("670f7ed3-d16f-4d38-bfed-6fed4accc344")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'primitiveType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a2dc9fa9-9eac-4177-b6b5-73ffe7d04a6c")
    public void setPrimitiveType(final String value) {
        this.elt.putTagValue(ValueType.MdaTypes.PRIMITIVETYPE_TAGTYPE_ELT, value);
    }

    @objid ("e034a09e-b677-4dd4-a626-a58ef6f05c4e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("49e98561-e39b-4abb-96a2-03af999ad7d2")
    protected ValueType(final DataType elt) {
        super(elt);
    }

    @objid ("efcfe0b2-71a4-471e-afbf-52a17a61448e")
    public static final class MdaTypes {
        @objid ("572befcb-5fc3-4169-8e7d-b2fdcd5c324e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("396ad06f-a763-4b7c-818a-54fa92b7ffce")
        public static TagType PRIMITIVETYPE_TAGTYPE_ELT;

        @objid ("b5da9715-fc0f-47e5-baf4-9c9dc35a06c7")
        private static Stereotype MDAASSOCDEP;

        @objid ("bfdf75fc-c34e-4426-b971-73f86ed897c0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7a22b8e6-4c8d-4540-b8d3-0cc823b172e6")
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
