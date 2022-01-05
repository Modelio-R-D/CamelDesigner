/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("82e9e825-7190-4c72-9f4d-d336ad285843")
    public static final String STEREOTYPE_NAME = "List";

    /**
     * Tells whether a {@link List proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << List >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f0650855-2e83-4cc1-b578-5f703a5a3dd1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, List.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << List >> then instantiate a {@link List} proxy.
     * 
     * @return a {@link List} proxy on the created {@link DataType}.
     */
    @objid ("9fe9a793-3a54-4b72-ab86-0b5f7fb02d9f")
    public static List create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, List.STEREOTYPE_NAME);
        return List.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link List} proxy from a {@link DataType} stereotyped << List >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a DataType
     * @return a {@link List} proxy or <i>null</i>.
     */
    @objid ("72ac152b-6c91-45dc-8e78-6b96a7b979f9")
    public static List instantiate(final DataType obj) {
        return List.canInstantiate(obj) ? new List(obj) : null;
    }

    /**
     * Tries to instantiate a {@link List} proxy from a {@link DataType} stereotyped << List >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link DataType}
     * @return a {@link List} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("52f88f8e-bd0a-4268-8bf6-7705335dd20f")
    public static List safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (List.canInstantiate(obj))
            return new List(obj);
        else
            throw new IllegalArgumentException("List: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("33069ce0-4d7f-459f-bb0a-f652f54e302e")
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
     * 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("bc1418a8-80f9-4add-aa8a-0e7d56a2c6b3")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("85fb07fd-7158-463b-ae83-91027d84881f")
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

    @objid ("6e50fcc9-ee74-445e-9593-14805fcfa7a2")
    protected List(final DataType elt) {
        super(elt);
    }

    @objid ("93dc7140-11bf-49e8-a555-177609936c7a")
    public static final class MdaTypes {
        @objid ("ab193838-962b-4378-8c70-b0088cafeeaf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dba2c2b0-ad6e-4766-a596-007462ca6cf6")
        private static Stereotype MDAASSOCDEP;

        @objid ("afdb9b56-8b23-4626-ab1d-bf61b920557b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7406999e-5914-4c43-8a1b-2af2277c9cb9")
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
