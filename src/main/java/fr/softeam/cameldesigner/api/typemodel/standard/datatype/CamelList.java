/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link DataType} with << CamelList >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("74dc4c59-0c01-4785-91ec-67fd63d087d4")
public class CamelList extends ValueType {
    @objid ("4e2b58f0-21af-405c-b2aa-5950bf0d5e72")
    public static final String STEREOTYPE_NAME = "CamelList";

    /**
     * Tells whether a {@link CamelList proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << CamelList >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("94182e9e-4f09-41ae-a866-a0ed591179c2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelList.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << CamelList >> then instantiate a {@link CamelList} proxy.
     * 
     * @return a {@link CamelList} proxy on the created {@link DataType}.
     */
    @objid ("9d46659d-00cb-4936-915c-1e116c299ff0")
    public static CamelList create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelList.STEREOTYPE_NAME);
        return CamelList.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link CamelList} proxy from a {@link DataType} stereotyped << CamelList >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link CamelList} proxy or <i>null</i>.
     */
    @objid ("e6550c89-4dfc-4da8-b44d-920ec399364d")
    public static CamelList instantiate(final DataType obj) {
        return CamelList.canInstantiate(obj) ? new CamelList(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CamelList} proxy from a {@link DataType} stereotyped << CamelList >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link CamelList} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("aa2005ae-f9a7-42ac-80a0-fa6d93897dd5")
    public static CamelList safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (CamelList.canInstantiate(obj))
        	return new CamelList(obj);
        else
        	throw new IllegalArgumentException("CamelList: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1015ec6c-8bdf-4248-b800-f7e814354c3c")
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
        CamelList other = (CamelList) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("e851b5c6-9124-496f-8b79-778cb42f09d3")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("9ee26395-ccba-486c-a6c1-dd2395913ce9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c5ece7a6-1b8e-4cf7-b1b5-a51f32f64ddb")
    @Override
    public java.util.List<CamelElement> getChilds() {
        java.util.List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("f6c1ff99-76ad-414b-988b-df2036273747")
    protected CamelList(final DataType elt) {
        super(elt);
    }

    @objid ("93dc7140-11bf-49e8-a555-177609936c7a")
    public static final class MdaTypes {
        @objid ("4982bbec-b8a3-43a9-b59f-d939810f5e1b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("824782b0-5d2a-40b7-97bc-3b5ff281d8ef")
        private static Stereotype MDAASSOCDEP;

        @objid ("310f8b6f-6c03-4bab-9a49-d97a64f3fe04")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dd7c2e27-4326-4613-98a9-28ea5be1b46a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "789c3b87-cb58-4659-a04c-7f948aae0e2e");
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
