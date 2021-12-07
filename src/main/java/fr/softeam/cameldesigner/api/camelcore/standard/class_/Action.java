/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
 * Proxy class to handle a {@link Class} with << Action >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ce551708-df87-4937-8987-79c155fed24b")
public abstract class Action extends Feature {
    @objid ("7ac2ea48-e16f-42c8-96c8-c8baced8d863")
    public static final String STEREOTYPE_NAME = "Action";

    @objid ("6fb29e41-3a6c-4909-9e31-fbe41429fbda")
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
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b5639078-fa14-44f2-a3dd-4ca3f3a37ed4")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("3516b619-9062-4cf0-9744-8c5d924970e9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7d12e469-cfeb-4c5a-bbeb-5fa38e3b3b0e")
    protected Action(final Class elt) {
        super(elt);
    }

    @objid ("447ac35a-dbf6-407d-86b8-cb6af2540864")
    public static final class MdaTypes {
        @objid ("54a5432a-68f6-4905-b906-0ddfe6438f88")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a7a61c17-07e6-42fe-982b-fde8e8cd913f")
        private static Stereotype MDAASSOCDEP;

        @objid ("58a36a8d-b6f4-4cb2-a91b-825b503ea031")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9f00bf57-9807-4cea-b6ad-d5a3dde68a5c")
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
