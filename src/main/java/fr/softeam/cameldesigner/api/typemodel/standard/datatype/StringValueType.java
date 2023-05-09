/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("417868e9-da86-420c-ae4f-92e285ac15e0")
    public static final String STEREOTYPE_NAME = "StringValueType";

    /**
     * Tells whether a {@link StringValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << StringValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("40895434-7c49-478c-a09e-ef7d8e3dc3d3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, StringValueType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << StringValueType >> then instantiate a {@link StringValueType} proxy.
     * 
     * @return a {@link StringValueType} proxy on the created {@link DataType}.
     */
    @objid ("fcbc28f5-2dee-4b45-953e-07413b0588f4")
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
    @objid ("0abda74f-bead-45e8-9dc7-2ce588d3ccae")
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
    @objid ("0bf1b7d5-4ce6-4973-bf15-9d0e8f7c604d")
    public static StringValueType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (StringValueType.canInstantiate(obj))
        	return new StringValueType(obj);
        else
        	throw new IllegalArgumentException("StringValueType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("66e02ed7-e61b-4902-8b1a-ff8a4ce874d2")
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
    @objid ("bb0a2d3a-a4f8-483a-91af-702b8c2738f3")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("3ebae356-975c-4b81-8d52-72aa8ad21887")
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

    @objid ("5fef4890-5a21-4fcf-bd2b-38d8a5b3cb4c")
    protected StringValueType(final DataType elt) {
        super(elt);
    }

    @objid ("a89d3bdc-f18a-481f-8114-f08ae25840a6")
    public static final class MdaTypes {
        @objid ("ed2ed966-7e1e-4e2a-b44c-f66741ab99d5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2c37c8a4-d96c-4d33-80ac-e38297a418f0")
        private static Stereotype MDAASSOCDEP;

        @objid ("dc98c5f2-ce0a-4931-8845-1bf0f1f0bfd9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c7fe6735-dcd0-4538-8ddf-713eac928e97")
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
