/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("42bf3bfa-68c5-41a6-98db-cb751124ea3b")
    public static final String STEREOTYPE_NAME = "CamelList";

    /**
     * Tells whether a {@link CamelList proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << CamelList >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d8ca22ba-2af9-4c0a-add0-b79d6ea87c2c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelList.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << CamelList >> then instantiate a {@link CamelList} proxy.
     * 
     * @return a {@link CamelList} proxy on the created {@link DataType}.
     */
    @objid ("e6eb725a-511b-44d2-bc41-5135009d4954")
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
    @objid ("1ef701a3-6a49-4195-8cd4-3eeb8f5ed8d8")
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
    @objid ("bcc0acb5-f3a5-4767-8b20-c2a318723712")
    public static CamelList safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (CamelList.canInstantiate(obj))
            return new CamelList(obj);
        else
            throw new IllegalArgumentException("CamelList: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e0a941bd-b914-410a-9445-dfc64044e8a9")
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
    @objid ("8ae3b9b9-3535-4a2c-857a-92f755e6afab")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("fb02a6ca-a0c2-40e4-bbab-42278f43d407")
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

    @objid ("8bfbcdf3-323c-4ca9-8606-c85871ea5479")
    protected CamelList(final DataType elt) {
        super(elt);
    }

    @objid ("93dc7140-11bf-49e8-a555-177609936c7a")
    public static final class MdaTypes {
        @objid ("bd873e9c-556d-4012-9bb1-d79fd833d76b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9269b250-cd29-4be5-96cc-cdf742b896c8")
        private static Stereotype MDAASSOCDEP;

        @objid ("9eb63777-749e-48d0-b675-47f81eebd1f9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b05505c8-f62a-4220-b419-5bd5291e48a9")
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
