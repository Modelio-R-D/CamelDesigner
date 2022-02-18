/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("c6c1478b-5d06-48f4-b7b7-b1fa7c6ea4da")
    public static final String STEREOTYPE_NAME = "SingleUnit";

    /**
     * Tells whether a {@link SingleUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << SingleUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("62746c50-efe8-4c33-b172-f065d629809e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SingleUnit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << SingleUnit >> then instantiate a {@link SingleUnit} proxy.
     * 
     * @return a {@link SingleUnit} proxy on the created {@link DataType}.
     */
    @objid ("9fba8cf4-c129-410c-a9f4-80d41a5ce47d")
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
    @objid ("141e0577-9290-4c92-9488-6371c6c8e3b2")
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
    @objid ("f40f8693-86df-4e94-be92-2a09b02eb452")
    public static SingleUnit safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (SingleUnit.canInstantiate(obj))
        	return new SingleUnit(obj);
        else
        	throw new IllegalArgumentException("SingleUnit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("351c4cda-87df-42a9-85b2-0c1fe8780bc1")
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
    @objid ("9b156e0d-a770-4493-95a6-1e163f432b39")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("068e042d-8e27-4057-a6b5-425a6c153f6a")
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

    @objid ("489240c5-92e5-4391-9f04-0935a474d51e")
    protected SingleUnit(final DataType elt) {
        super(elt);
    }

    @objid ("41eab5b5-d30f-43d2-9da2-943d64381732")
    public static final class MdaTypes {
        @objid ("ab26da3d-d8f3-493e-ac49-0cc3b423bcc4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0690cad1-019d-4ba9-93a7-a43b95ad4422")
        private static Stereotype MDAASSOCDEP;

        @objid ("f9d38177-b1a4-4d54-b594-8ea15d818e01")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("12f2d71d-ed7d-43ab-bdff-da913052740a")
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
