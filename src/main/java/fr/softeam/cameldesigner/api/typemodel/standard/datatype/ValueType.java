/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("667c3e78-1563-4155-83ea-8475468fd6dc")
    public static final String STEREOTYPE_NAME = "ValueType";

    @objid ("9cba2196-d58a-43ef-9ad7-5e15a8e5c811")
    public static final String PRIMITIVETYPE_TAGTYPE = "primitiveType";

    /**
     * Tells whether a {@link ValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << ValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d21de960-332e-4961-b67a-2d995a66fd61")
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

    @objid ("5be446bf-46bf-4a00-98fb-e072ac168c0c")
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
    @objid ("2e7a99b4-7884-424a-a51f-a869589fff11")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'primitiveType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ffd3a120-e7c8-43c4-bdf4-90345a636403")
    public String getPrimitiveType() {
        return this.elt.getTagValue(ValueType.MdaTypes.PRIMITIVETYPE_TAGTYPE_ELT);
    }

    @objid ("a897011e-f192-4dee-9aa5-53daeeb3826b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'primitiveType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9e397e5e-e367-4b24-8579-da524265c5f2")
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

    @objid ("fdf44bdd-f1c0-486c-b87a-8b69bd9f6a34")
    protected ValueType(final DataType elt) {
        super(elt);
    }

    @objid ("efcfe0b2-71a4-471e-afbf-52a17a61448e")
    public static final class MdaTypes {
        @objid ("998e106f-f039-4f83-a101-0cc239bd141f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ea7d92a3-9166-44cf-9a1d-09e3e1f59512")
        public static TagType PRIMITIVETYPE_TAGTYPE_ELT;

        @objid ("84dab0ac-33da-46c0-96de-0ff402d358ed")
        private static Stereotype MDAASSOCDEP;

        @objid ("15678285-6f4a-48a3-942a-c2d32cc2d4d3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f0f338fb-1fd1-4fb4-b9f0-60e189aa51d7")
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
