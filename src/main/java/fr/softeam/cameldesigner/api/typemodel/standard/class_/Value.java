/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << Value >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b2107801-5ebd-4fed-a10f-94070aefa145")
public abstract class Value {
    @objid ("70fa4af4-9eb1-4904-98a1-212cf60d7d8c")
    public static final String STEREOTYPE_NAME = "Value";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("6d73522f-a8d2-433f-88fe-6c350b0ef9c4")
    protected final Class elt;

    /**
     * Tells whether a {@link Value proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Value >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("49eab9d5-2197-4358-a009-3026a6cdf1c1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Value.STEREOTYPE_NAME));
    }

    @objid ("e38bf878-5e13-4a27-92b9-c6c94bfd6cb2")
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
        Value other = (Value) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("881888d3-adb0-42dd-956b-9ffa7cd38224")
    public Class getElement() {
        return this.elt;
    }

    @objid ("2beea47e-ebe3-4415-beeb-493fc3dbdada")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("08743da5-bc49-479e-a645-880e32ea32a7")
    protected Value(final Class elt) {
        this.elt = elt;
    }

    @objid ("98e6e882-3baf-4b4c-b3c1-9b995cb33b84")
    public static final class MdaTypes {
        @objid ("d0bc33c9-5bb4-4fdf-92e1-228c8bd3051e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("05878792-155f-4e29-9bb4-4e4edba600d5")
        private static Stereotype MDAASSOCDEP;

        @objid ("908279fd-8826-49a7-a0a3-fc5a19ec1196")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e9ba747b-cdad-42f5-8d14-65317da06e25")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b7cec495-c026-4fde-b42d-496bbcda924b");
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
