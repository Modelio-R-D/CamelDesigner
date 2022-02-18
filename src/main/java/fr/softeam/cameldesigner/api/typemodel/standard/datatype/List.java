/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
 * Proxy class to handle a {@link DataType} with << List >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("74dc4c59-0c01-4785-91ec-67fd63d087d4")
public class List extends ValueType {
    @objid ("d68ecdb7-736b-45ca-b879-2ff2c34b02af")
    public static final String STEREOTYPE_NAME = "List";

    /**
     * Tells whether a {@link List proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << List >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("acc0f5f3-6cfe-45aa-b0bb-979a9c806ac2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, List.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << List >> then instantiate a {@link List} proxy.
     * 
     * @return a {@link List} proxy on the created {@link DataType}.
     */
    @objid ("2c1c1c89-e2ca-4e56-9d2f-3a0a45f2c4b9")
    public static List create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, List.STEREOTYPE_NAME);
        return List.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link List} proxy from a {@link DataType} stereotyped << List >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link List} proxy or <i>null</i>.
     */
    @objid ("225c3e1e-d6f8-4862-b19c-957c251351c2")
    public static List instantiate(final DataType obj) {
        return List.canInstantiate(obj) ? new List(obj) : null;
    }

    /**
     * Tries to instantiate a {@link List} proxy from a {@link DataType} stereotyped << List >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link List} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ded2f807-f381-474c-a300-09eb09ef2e79")
    public static List safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (List.canInstantiate(obj))
        	return new List(obj);
        else
        	throw new IllegalArgumentException("List: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("caecfa74-1e18-41f6-b3dc-3655d95028cf")
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
        List other = (List) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("405c7982-c68d-4fac-8b17-b081bac29350")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("361af135-402f-4dbe-aa4e-05925de55699")
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

    @objid ("b9303d64-b6c3-44f1-8037-cf36185611ff")
    protected List(final DataType elt) {
        super(elt);
    }

    @objid ("93dc7140-11bf-49e8-a555-177609936c7a")
    public static final class MdaTypes {
        @objid ("7ec18500-1420-4ea6-b2ce-af6af3940668")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b781758f-adda-45c0-a922-2db72de56146")
        private static Stereotype MDAASSOCDEP;

        @objid ("3c850817-fec1-42d7-bd17-04e923b677f3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("60bae6fa-24a2-4fcd-9251-44adb02ec099")
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
