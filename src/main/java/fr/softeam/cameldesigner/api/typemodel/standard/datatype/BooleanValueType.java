/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
 * Proxy class to handle a {@link DataType} with << BooleanValueType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a2b62642-fe21-4f7c-a8c8-129bb3a99fab")
public class BooleanValueType extends ValueType {
    @objid ("c4689b9a-2c17-464d-9b9a-aa05c6f0c6e3")
    public static final String STEREOTYPE_NAME = "BooleanValueType";

    /**
     * Tells whether a {@link BooleanValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << BooleanValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f522be80-8622-4736-82a0-8cbde5c28b2f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BooleanValueType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << BooleanValueType >> then instantiate a {@link BooleanValueType} proxy.
     * 
     * @return a {@link BooleanValueType} proxy on the created {@link DataType}.
     */
    @objid ("ee149e89-4a90-4301-8e3e-e2a1569f1702")
    public static BooleanValueType create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, BooleanValueType.STEREOTYPE_NAME);
        return BooleanValueType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link BooleanValueType} proxy from a {@link DataType} stereotyped << BooleanValueType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link BooleanValueType} proxy or <i>null</i>.
     */
    @objid ("4fbae4ce-88a1-487d-9022-635ccfce090c")
    public static BooleanValueType instantiate(final DataType obj) {
        return BooleanValueType.canInstantiate(obj) ? new BooleanValueType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BooleanValueType} proxy from a {@link DataType} stereotyped << BooleanValueType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link BooleanValueType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("eb5fd884-ba09-4cf4-8509-41f6a07d029f")
    public static BooleanValueType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (BooleanValueType.canInstantiate(obj))
        	return new BooleanValueType(obj);
        else
        	throw new IllegalArgumentException("BooleanValueType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("56ae3073-6e21-43b6-9cbf-e05c1a77c40a")
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
        BooleanValueType other = (BooleanValueType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("36dcfce4-9b83-4ff5-b00a-cb6f05f404f1")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("f94380ba-9116-4aee-9227-c179f7332d48")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("53a5e15e-b9c3-4095-9110-b259351cdea6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c4570abe-a49e-4fe8-b27d-eba7026ad551")
    protected BooleanValueType(final DataType elt) {
        super(elt);
    }

    @objid ("df669cbd-dad5-4a9c-8f92-4f6b6714af23")
    public static final class MdaTypes {
        @objid ("e33da68a-7b08-4af8-8761-f2695865268b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c6b1317e-30fe-4658-9a8b-3805d3b28a46")
        private static Stereotype MDAASSOCDEP;

        @objid ("19ce6fec-5671-47a8-b0bf-25a2b428431e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("835de7aa-d403-4079-87d1-29327ddc7827")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "34356c14-6f57-4377-8b6d-5f7e5d8b4929");
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
