/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("8fd82eaf-ce06-4e1d-8993-9b1a340b4709")
    public static final String STEREOTYPE_NAME = "List";

    /**
     * Tells whether a {@link List proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << List >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8079e043-04c7-47f1-983a-260cfab50d17")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, List.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << List >> then instantiate a {@link List} proxy.
     * 
     * @return a {@link List} proxy on the created {@link DataType}.
     */
    @objid ("b2bc427e-c83a-4086-8ee8-2a5c8ca2ce9b")
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
    @objid ("eba65669-0c0c-40db-a99d-fbacd68c8252")
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
    @objid ("0df7cd37-8cc4-4ca8-97e2-3868fe04401b")
    public static List safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (List.canInstantiate(obj))
        	return new List(obj);
        else
        	throw new IllegalArgumentException("List: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d20f15b2-cb5f-4d6c-ac2d-96176504f518")
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
    @objid ("807465b4-11e0-4ae4-af20-24eb79dec173")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("82eb6a37-054e-465e-b298-630aed7b19a1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6afd1acf-6d0a-4ccb-84cd-be007b9b297e")
    @Override
    public java.util.List<CamelElement> getChilds() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("c9a6a4c2-a5c2-479c-94ac-0fc3bad3e68d")
    protected List(final DataType elt) {
        super(elt);
    }

    @objid ("93dc7140-11bf-49e8-a555-177609936c7a")
    public static final class MdaTypes {
        @objid ("4cb3cd42-231e-45d9-9180-5f70b83904c2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b510e505-b399-40eb-9ba5-948deb4a3f7e")
        private static Stereotype MDAASSOCDEP;

        @objid ("b3c66d8f-38e6-4519-9830-66cb34ed7215")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("36576221-80c4-4443-9ef5-41a17bef08c9")
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
