/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << IntValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("55226fdb-80c7-4d63-9159-946742bab14b")
public class IntValue extends NumericValue {
    @objid ("1d42a74b-fa9a-411e-8240-5b30455962eb")
    public static final String STEREOTYPE_NAME = "IntValue";

    @objid ("d93e55c2-d446-41fc-ba1a-e57aa41d0514")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link IntValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << IntValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("68d3a89f-50f0-4517-83e3-2135284bf577")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IntValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << IntValue >> then instantiate a {@link IntValue} proxy.
     * 
     * @return a {@link IntValue} proxy on the created {@link Class}.
     */
    @objid ("34eb0f6a-92af-4e53-a72d-06352eddf3a9")
    public static IntValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, IntValue.STEREOTYPE_NAME);
        return IntValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link IntValue} proxy from a {@link Class} stereotyped << IntValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link IntValue} proxy or <i>null</i>.
     */
    @objid ("dc268ab0-9946-46f4-9a6b-e68d473ff450")
    public static IntValue instantiate(final Class obj) {
        return IntValue.canInstantiate(obj) ? new IntValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link IntValue} proxy from a {@link Class} stereotyped << IntValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link IntValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("73204bc2-69bc-4db4-8e01-14316431796a")
    public static IntValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (IntValue.canInstantiate(obj))
        	return new IntValue(obj);
        else
        	throw new IllegalArgumentException("IntValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("44e81b48-3ec9-49a9-ae71-67d1dae45f8f")
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
        IntValue other = (IntValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("0c43fe37-0061-40e2-8d48-9ae2e17cbfc8")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("30c9dbc9-3e19-403d-aa38-a2e1afa8a397")
    public String getValue() {
        return this.elt.getTagValue(IntValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("3ba88e51-91e2-4e4d-ade1-d81103ddeaca")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("212d31e2-c90e-4cd4-9446-7a1ca46b213a")
    public void setValue(final String value) {
        this.elt.putTagValue(IntValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("710a4b9c-da4d-4385-9c7e-44cc190e981b")
    protected IntValue(final Class elt) {
        super(elt);
    }

    @objid ("86784b93-598c-48c0-99d5-5e6867c51898")
    public static final class MdaTypes {
        @objid ("fa71aa0c-88dd-4239-9c66-afcfc8ccef4e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5fdc974b-f9c9-4746-befe-30437b645d67")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("5528b047-911a-46f6-aae1-bda4f794be86")
        private static Stereotype MDAASSOCDEP;

        @objid ("03f8bf3f-b6c5-42dd-b1d1-50b317212562")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e30c4398-3de6-4032-811f-28b71dc81a9c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "84b646d6-4b3e-4375-b9e3-8e6d650114b3");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8c63edd5-c470-41cc-a9bf-8eb948e832ba");
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
