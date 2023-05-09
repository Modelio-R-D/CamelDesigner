/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << NumericValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3ba92fa8-b783-47f9-9069-045fba14f562")
public abstract class NumericValue extends Value {
    @objid ("7f5fc9aa-00ec-4d1b-8ea3-3ae250e1819a")
    public static final String STEREOTYPE_NAME = "NumericValue";

    /**
     * Tells whether a {@link NumericValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << NumericValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2f1b13cc-9959-4573-a3b2-904123b339ef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NumericValue.STEREOTYPE_NAME));
    }

    @objid ("776cb916-f875-4c0e-97ac-750bc8beffb1")
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
        NumericValue other = (NumericValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("a54d5cdf-2fb5-4c2c-bb77-7dc3006f64c9")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("cae23884-3891-4378-8e95-c2c4bc02e100")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fabca01e-1d6b-476a-8e34-f5cf55378451")
    protected NumericValue(final Class elt) {
        super(elt);
    }

    @objid ("06397469-0f26-401c-adeb-30da7a165128")
    public static final class MdaTypes {
        @objid ("9a82abdd-6c82-4aba-9d2e-4f2113d2f5fa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e512bae1-4880-4082-a798-eda8f06409e0")
        private static Stereotype MDAASSOCDEP;

        @objid ("cd28c71e-b515-4948-81e9-4780fe3ac955")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("340fb35f-1518-4e0f-bba7-b8c26899f8db")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a8d40881-b0b9-4426-a68a-cba902a74a5e");
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
