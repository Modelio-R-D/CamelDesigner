/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("88195c94-dcf2-4aaa-a270-ddc89b4087b1")
    public static final String STEREOTYPE_NAME = "CamelList";

    /**
     * Tells whether a {@link CamelList proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << CamelList >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4b60f616-1411-4804-b2dc-622972879217")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelList.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << CamelList >> then instantiate a {@link CamelList} proxy.
     * 
     * @return a {@link CamelList} proxy on the created {@link DataType}.
     */
    @objid ("6ee88d68-d230-4134-9571-918e254531ce")
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
    @objid ("2db88fb3-ac23-4289-a0d2-bfb35d518413")
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
    @objid ("08bbf5a5-3445-48ef-93b2-99169a7d478a")
    public static CamelList safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (CamelList.canInstantiate(obj))
            return new CamelList(obj);
        else
            throw new IllegalArgumentException("CamelList: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8f98b609-6a69-41c3-9247-84b59ca3dc86")
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
    @objid ("c88e0dfa-5e64-4b1c-a271-3aba8ea10e05")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("46af15d6-463b-4377-b74d-b0fa2a5ee149")
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

    @objid ("647940b2-86e2-4b6d-814e-444d7ed40fdb")
    protected CamelList(final DataType elt) {
        super(elt);
    }

    @objid ("93dc7140-11bf-49e8-a555-177609936c7a")
    public static final class MdaTypes {
        @objid ("8c3b2e46-2a6e-465c-9ad4-98cf6af9450c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("294aeef0-3c4e-4cbf-91c4-a96bc3ce3f0a")
        private static Stereotype MDAASSOCDEP;

        @objid ("49f7341e-55c7-43e9-813a-399e957967e3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8ec13d5b-e53e-4e74-a22e-6f60caf19412")
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
