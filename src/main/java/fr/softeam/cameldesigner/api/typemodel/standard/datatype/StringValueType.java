/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("96781a3a-0420-463e-b3c1-e93b4fe9eb4d")
    public static final String STEREOTYPE_NAME = "StringValueType";

    /**
     * Tells whether a {@link StringValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << StringValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d2f7631b-c4e4-496f-9ac8-dbd21879b318")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, StringValueType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << StringValueType >> then instantiate a {@link StringValueType} proxy.
     * 
     * @return a {@link StringValueType} proxy on the created {@link DataType}.
     */
    @objid ("903aa8b3-819d-4149-b969-411e15975e1c")
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
    @objid ("17b1c4e2-2e12-4985-b641-996b01365ba3")
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
    @objid ("573606e3-0742-4c60-a1d0-d243a43f5e81")
    public static StringValueType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (StringValueType.canInstantiate(obj))
        	return new StringValueType(obj);
        else
        	throw new IllegalArgumentException("StringValueType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("91b2c121-f358-43dd-8f49-9aaeddc033ac")
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
    @objid ("9e70b5ef-ab0d-4719-8a94-25f693b3da54")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("91c6db68-6be5-44d6-a996-22a6812669ea")
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

    @objid ("b24beb2a-4ff1-4a0b-9e52-9e315ea43c89")
    protected StringValueType(final DataType elt) {
        super(elt);
    }

    @objid ("a89d3bdc-f18a-481f-8114-f08ae25840a6")
    public static final class MdaTypes {
        @objid ("4b5d2bbf-2c40-47db-b94a-2c68bf1aa34a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f1d0a511-369d-4047-b64e-7d41cc3bf86b")
        private static Stereotype MDAASSOCDEP;

        @objid ("94106c02-7c16-4743-857c-e6e4b4f57b57")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9c5856f0-6c4d-4e5b-a5e1-38fc180b556c")
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
