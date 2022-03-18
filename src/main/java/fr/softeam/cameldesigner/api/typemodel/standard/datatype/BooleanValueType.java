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
    @objid ("75773a7e-d2c2-43b2-a152-c1f549f8cb20")
    public static final String STEREOTYPE_NAME = "BooleanValueType";

    /**
     * Tells whether a {@link BooleanValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << BooleanValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dee4ef61-6a35-4c24-a09c-bda819f1fa07")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BooleanValueType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << BooleanValueType >> then instantiate a {@link BooleanValueType} proxy.
     * 
     * @return a {@link BooleanValueType} proxy on the created {@link DataType}.
     */
    @objid ("163074a2-8128-49ce-9a7a-07df9e722978")
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
    @objid ("e5301ab0-842a-49e4-8720-ada07ce9a3b5")
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
    @objid ("458295f1-49a7-45a4-a5cb-08d302b24e4d")
    public static BooleanValueType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (BooleanValueType.canInstantiate(obj))
        	return new BooleanValueType(obj);
        else
        	throw new IllegalArgumentException("BooleanValueType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("67ff467b-e535-488f-a694-f919f242a953")
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
    @objid ("c844caf4-b496-41dd-8061-b88a71c5653c")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("c18ea90c-5896-4364-9a2e-9a37e265e519")
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

    @objid ("0b5e6f80-007f-4111-ba50-9dfc95207820")
    protected BooleanValueType(final DataType elt) {
        super(elt);
    }

    @objid ("df669cbd-dad5-4a9c-8f92-4f6b6714af23")
    public static final class MdaTypes {
        @objid ("3b91f8cb-23cb-4cb4-850f-a317264affee")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d62b4b01-6a53-4faa-a881-7d3e8e0224e5")
        private static Stereotype MDAASSOCDEP;

        @objid ("17161947-239f-41b0-bb4e-cc9e7f32577e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6793ddb2-6a47-41cc-b0a4-e3877a9751e2")
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
