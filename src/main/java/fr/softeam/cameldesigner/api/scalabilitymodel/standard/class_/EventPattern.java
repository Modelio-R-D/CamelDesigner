/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

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
 * Proxy class to handle a {@link Class} with << EventPattern >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1376376d-c30d-492b-b270-8ae507dd5d21")
public abstract class EventPattern extends Event {
    @objid ("8cc807b1-6184-43bc-be31-c0ca0527793e")
    public static final String STEREOTYPE_NAME = "EventPattern";

    @objid ("a93327eb-0217-40db-acd1-085b01b1672d")
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
        EventPattern other = (EventPattern) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("6eec496d-ff25-4242-a034-5275ef0f14b1")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("a067a689-f79a-49cc-a93b-cdb51138c087")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6f347e41-f25e-48d5-90c8-feb94dace095")
    protected EventPattern(final Class elt) {
        super(elt);
    }

    @objid ("dd1011e3-255f-4c6a-a51e-162a33438d4c")
    public static final class MdaTypes {
        @objid ("a67f1ba1-373f-4c7d-b29f-fe764af135cd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6a6e73dc-b2c7-4411-a294-6c7ea60e68cb")
        private static Stereotype MDAASSOCDEP;

        @objid ("9c443ff5-41b7-4c8c-99b1-53f6c45a2a54")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b81b4982-1157-4b71-ab9d-275978ebaa3e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "46e221ca-8a8f-458b-8018-009a273cc009");
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
