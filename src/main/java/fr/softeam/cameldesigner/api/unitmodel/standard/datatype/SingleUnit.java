/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.datatype;

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
 * Proxy class to handle a {@link DataType} with << SingleUnit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7dfc6119-7128-437f-995f-47f0c2960c89")
public class SingleUnit extends DimensionedUnit {
    @objid ("7e9c80ec-f85d-467f-821b-f5ebf7bf41e9")
    public static final String STEREOTYPE_NAME = "SingleUnit";

    /**
     * Tells whether a {@link SingleUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << SingleUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c0b9b850-8968-410e-99b2-4d6a41c726ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SingleUnit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << SingleUnit >> then instantiate a {@link SingleUnit} proxy.
     * 
     * @return a {@link SingleUnit} proxy on the created {@link DataType}.
     */
    @objid ("ba517cc9-565d-4614-a1e8-3ea853002932")
    public static SingleUnit create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SingleUnit.STEREOTYPE_NAME);
        return SingleUnit.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link SingleUnit} proxy from a {@link DataType} stereotyped << SingleUnit >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link SingleUnit} proxy or <i>null</i>.
     */
    @objid ("40fa7ff7-f33b-4eda-b542-0cd45230fd90")
    public static SingleUnit instantiate(final DataType obj) {
        return SingleUnit.canInstantiate(obj) ? new SingleUnit(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SingleUnit} proxy from a {@link DataType} stereotyped << SingleUnit >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link SingleUnit} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7228ab0c-b2d9-4cf2-b510-56e97c2faa49")
    public static SingleUnit safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (SingleUnit.canInstantiate(obj))
        	return new SingleUnit(obj);
        else
        	throw new IllegalArgumentException("SingleUnit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a0a4b65c-5c86-4950-a729-930981baa644")
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
        SingleUnit other = (SingleUnit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("2a0d5328-8711-494c-9736-1e29d4cf9eee")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("9ed179f0-e773-4b22-ab32-e97316cedac3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d4eddff9-2c8e-44f5-a3b8-4b8052eb067a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("0387bc53-1a00-4a9d-8bca-de786b5da1a1")
    protected SingleUnit(final DataType elt) {
        super(elt);
    }

    @objid ("41eab5b5-d30f-43d2-9da2-943d64381732")
    public static final class MdaTypes {
        @objid ("7e4bf064-54f3-416a-aebc-23154b4f700d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a79dc089-8927-48d1-a002-8c6584148580")
        private static Stereotype MDAASSOCDEP;

        @objid ("49e063ba-65bc-4fde-9898-595b2e195e1d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d7a390ca-65ba-4bd8-bb55-d2efee16b4cb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5f6c0584-c6dd-44e5-a1ad-cd4785dccb03");
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
