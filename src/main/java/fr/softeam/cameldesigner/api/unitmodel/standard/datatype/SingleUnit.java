/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("8ccc54a4-8d03-4fe5-851b-9d07b3ecc17f")
    public static final String STEREOTYPE_NAME = "SingleUnit";

    /**
     * Tells whether a {@link SingleUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << SingleUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c47ad55b-e236-443f-bda1-df24fc32d221")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SingleUnit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << SingleUnit >> then instantiate a {@link SingleUnit} proxy.
     * 
     * @return a {@link SingleUnit} proxy on the created {@link DataType}.
     */
    @objid ("cfdc634e-5fc9-4863-a93c-5c855641a283")
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
    @objid ("8103639b-834f-4acb-a9c6-5a903c11361c")
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
    @objid ("0df2c749-0c60-4de2-b6c4-89c6c52affe9")
    public static SingleUnit safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (SingleUnit.canInstantiate(obj))
        	return new SingleUnit(obj);
        else
        	throw new IllegalArgumentException("SingleUnit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d1189c68-8e90-4f1b-9437-dfd5bca931af")
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
    @objid ("8081bc0c-4f9e-42d0-9a9b-db29af1ba911")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("22b99b6d-f970-44f1-9e77-e8b1e3fa1823")
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

    @objid ("5b677783-9779-4029-9eda-bb95aebb6517")
    protected SingleUnit(final DataType elt) {
        super(elt);
    }

    @objid ("41eab5b5-d30f-43d2-9da2-943d64381732")
    public static final class MdaTypes {
        @objid ("c577aa78-5802-4960-a384-e12c818de5b9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("60b33073-e675-4b43-beec-8a5c68383c48")
        private static Stereotype MDAASSOCDEP;

        @objid ("023cec29-abdd-4da7-8b18-b0aa1ded3997")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3a6e4b11-d732-4687-9b0f-03cd86aa6943")
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
