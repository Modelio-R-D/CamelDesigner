/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.namespace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction;
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
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link NameSpace} with << Action >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("061096ce-1ee0-43f7-8df5-38b8fc736e2f")
public abstract class Action extends Feature {
    @objid ("1ac0e6ad-1023-4275-986f-c3f32ffa43b3")
    public static final String STEREOTYPE_NAME = "Action";

    @objid ("281e8cdb-d8df-49d5-bd5b-7a8ece840271")
    public static Action safeInstantiate(NameSpace obj) {
        if (ScalingAction.canInstantiate(obj)) {
            return ScalingAction.safeInstantiate(obj);
        }else
            throw new IllegalArgumentException("Action: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8df895fd-56d2-40a2-9553-691547d4870f")
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
        Action other = (Action) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link NameSpace}.
     * 
     * @return the NameSpace represented by this proxy, never null.
     */
    @objid ("d87291a4-60a7-4ccd-a170-db3e9c32e91d")
    @Override
    public NameSpace getElement() {
        return (NameSpace)super.getElement();
    }

    @objid ("1c273cac-ca9e-4fbc-8781-8dde841b179e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fffff4d0-3136-4fb0-9015-b1ab34c48c43")
    protected Action(final NameSpace elt) {
        super(elt);
    }

    @objid ("c5dc4266-14c2-4368-9374-34e0d3602383")
    public static final class MdaTypes {
        @objid ("516f79fd-3d55-4fbd-ac1f-0e5db9564533")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d14a4e13-dbc1-4850-b80b-1f8b7f904d42")
        private static Stereotype MDAASSOCDEP;

        @objid ("97c7946f-f0c0-4c92-b0c6-42ce61125b6c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("507a5a93-08c4-495b-ac37-c66db348714a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b23cd4a9-cc6d-43b4-b5fc-fbab5abf866b");
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
