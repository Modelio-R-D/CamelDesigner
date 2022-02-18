/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
 * Proxy class to handle a {@link DataType} with << StringValueType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d4a116b7-cd26-400c-b04d-1c342f5d5ece")
public class StringValueType extends ValueType {
    @objid ("5e74a52f-c64b-4f44-9edc-0e648e9e6607")
    public static final String STEREOTYPE_NAME = "StringValueType";

    /**
     * Tells whether a {@link StringValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << StringValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7aa039ac-1b7e-4e60-9bba-9d298bbd1dbf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, StringValueType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << StringValueType >> then instantiate a {@link StringValueType} proxy.
     * 
     * @return a {@link StringValueType} proxy on the created {@link DataType}.
     */
    @objid ("b84b2195-5cdf-40c5-b4e7-f8825f673341")
    public static StringValueType create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, StringValueType.STEREOTYPE_NAME);
        return StringValueType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link StringValueType} proxy from a {@link DataType} stereotyped << StringValueType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link StringValueType} proxy or <i>null</i>.
     */
    @objid ("15780715-9c43-407f-8dea-bdaaf5a35ce7")
    public static StringValueType instantiate(final DataType obj) {
        return StringValueType.canInstantiate(obj) ? new StringValueType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StringValueType} proxy from a {@link DataType} stereotyped << StringValueType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link StringValueType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3fe61495-0689-43e9-9f57-15278d3794e0")
    public static StringValueType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (StringValueType.canInstantiate(obj))
        	return new StringValueType(obj);
        else
        	throw new IllegalArgumentException("StringValueType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5d08092e-0fcf-4e9d-9acb-e86052bda8f6")
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
        StringValueType other = (StringValueType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("5d5413d2-de7d-402b-a38a-84743e3b1e7e")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("25953220-65fe-4121-a091-8b6776692864")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("417f82d6-6bb2-4286-b0d2-8b32d70fe465")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("7cb1771d-6efc-4ff0-98dc-7f9496ac8b84")
    protected StringValueType(final DataType elt) {
        super(elt);
    }

    @objid ("a89d3bdc-f18a-481f-8114-f08ae25840a6")
    public static final class MdaTypes {
        @objid ("c797d4be-d845-40d8-84b5-4b304ea3e016")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0855591d-fcb7-4ca2-8569-ee77c4defbfd")
        private static Stereotype MDAASSOCDEP;

        @objid ("6ad2d630-7a86-4363-9242-fb585ff5290f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3205ef30-51d8-4c08-be0e-16c0a1fcfc9e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c8a2299c-93cc-47ca-82f3-53c1866d2c5b");
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
