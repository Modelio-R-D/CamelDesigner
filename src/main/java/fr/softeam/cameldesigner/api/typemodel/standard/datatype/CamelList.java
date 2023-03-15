/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
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
    @objid ("02e31aae-9e19-4045-b37a-5a69d8926493")
    public static final String STEREOTYPE_NAME = "CamelList";

    /**
     * Tells whether a {@link CamelList proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << CamelList >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1378f040-b782-45a9-86f2-d3ac87f90ef7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelList.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << CamelList >> then instantiate a {@link CamelList} proxy.
     * 
     * @return a {@link CamelList} proxy on the created {@link DataType}.
     */
    @objid ("5eb30884-ddb7-4397-8ff4-7287fe5537c9")
    public static CamelList create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelList.STEREOTYPE_NAME);
        return CamelList.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link CamelList} proxy from a {@link DataType} stereotyped << CamelList >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a DataType
     * @return a {@link CamelList} proxy or <i>null</i>.
     */
    @objid ("c7e5d4ba-8e2b-46cf-991b-d9bbf53bd5e1")
    public static CamelList instantiate(final DataType obj) {
        return CamelList.canInstantiate(obj) ? new CamelList(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CamelList} proxy from a {@link DataType} stereotyped << CamelList >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link DataType}
     * @return a {@link CamelList} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a1e0095e-e020-4eb3-9ea5-88a672756208")
    public static CamelList safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (CamelList.canInstantiate(obj))
            return new CamelList(obj);
        else
            throw new IllegalArgumentException("CamelList: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d2fcca89-fd5e-4098-8e6d-c89902cad498")
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
     * 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("3b08200f-1478-4b2a-85f6-50b7893408ec")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("8ed76554-ad01-4465-bf4a-9ec9c46a3eb5")
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

    @objid ("bc33ed15-5a6f-4420-8423-41a299900769")
    protected CamelList(final DataType elt) {
        super(elt);
    }

    @objid ("93dc7140-11bf-49e8-a555-177609936c7a")
    public static final class MdaTypes {
        @objid ("2b8950c8-ef90-4cc2-ba82-50314a613e98")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("36df112d-5fde-4f50-bff1-e7771abf7ab6")
        private static Stereotype MDAASSOCDEP;

        @objid ("d2193e4a-233c-4331-aa89-24a592631f2a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7faae372-1686-45d8-98db-44b5f51d89a7")
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
