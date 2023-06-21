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
 * Proxy class to handle a {@link DataType} with << BooleanValueType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a2b62642-fe21-4f7c-a8c8-129bb3a99fab")
public class BooleanValueType extends ValueType {
    @objid ("2942092e-41ee-458e-8fb1-2f7840fa49ed")
    public static final String STEREOTYPE_NAME = "BooleanValueType";

    /**
     * Tells whether a {@link BooleanValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << BooleanValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("78115c91-2b89-4644-8797-17b4fd462c25")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BooleanValueType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << BooleanValueType >> then instantiate a {@link BooleanValueType} proxy.
     * 
     * @return a {@link BooleanValueType} proxy on the created {@link DataType}.
     */
    @objid ("0326a8b1-c838-4222-aa73-8ff5267db15e")
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
    @objid ("83baa7a4-71ef-4177-be67-4d60575a36df")
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
    @objid ("15cc708f-2079-4a2f-a965-13c075dfb88b")
    public static BooleanValueType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (BooleanValueType.canInstantiate(obj))
        	return new BooleanValueType(obj);
        else
        	throw new IllegalArgumentException("BooleanValueType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a35eb5b3-485a-4fe5-9b4d-05035b5f873e")
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
    @objid ("d6ae46fe-04e1-4330-8817-6c35cc82f3b9")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("ffedd4ef-9e75-422b-857c-196f25a7a942")
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

    @objid ("d9f1bf92-ee7d-4fd4-b068-c07abe6c668f")
    protected BooleanValueType(final DataType elt) {
        super(elt);
    }

    @objid ("df669cbd-dad5-4a9c-8f92-4f6b6714af23")
    public static final class MdaTypes {
        @objid ("01cd7cc8-67a7-4815-a940-f49da180e2c6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("abd38d25-baba-4f55-8139-fb74518fdb68")
        private static Stereotype MDAASSOCDEP;

        @objid ("054917ad-2f1e-4980-9ae7-c25d271e7c08")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("da611720-c859-4c0e-894d-53353a30a52e")
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
