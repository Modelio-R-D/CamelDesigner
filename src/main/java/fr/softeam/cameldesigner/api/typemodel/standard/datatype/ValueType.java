/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("f94cf535-7420-42f4-8677-9b01c7f08caa")
    public static final String STEREOTYPE_NAME = "ValueType";

    @objid ("84d91472-c4be-46ff-9db8-a6b02cf8652a")
    public static final String PRIMITIVETYPE_TAGTYPE = "primitiveType";

    /**
     * Tells whether a {@link ValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << ValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("eaa72108-19e5-46cb-8c17-a56ebb962b20")
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

    @objid ("785cb5f4-86fe-4f3e-a4d7-a5081036322c")
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
    @objid ("77beaffc-29b1-402e-9c72-c97528774fe8")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'primitiveType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("33967947-5fe0-440e-be00-650d3d20200c")
    public String getPrimitiveType() {
        return this.elt.getTagValue(ValueType.MdaTypes.PRIMITIVETYPE_TAGTYPE_ELT);
    }

    @objid ("d0f203c7-d749-4975-90f4-64f93e24f6ec")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'primitiveType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3b634b38-7a0a-4cc2-8fd6-5076a0514798")
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

    @objid ("84258998-494c-42f3-a3c2-bc3f99b76e84")
    protected ValueType(final DataType elt) {
        super(elt);
    }

    @objid ("efcfe0b2-71a4-471e-afbf-52a17a61448e")
    public static final class MdaTypes {
        @objid ("c5619f33-b97c-4056-a2cd-f1430e24b0b1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a32f465d-0d71-4b04-aee3-0e707fdae74d")
        public static TagType PRIMITIVETYPE_TAGTYPE_ELT;

        @objid ("330fc9f7-942c-4160-b13a-bbade2e71188")
        private static Stereotype MDAASSOCDEP;

        @objid ("3cfac91a-48da-4492-bdf1-90b5deb50bdf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dfa399f2-81a0-4d4b-9b33-9e8eb681b1da")
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
