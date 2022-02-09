/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("4f5ac6a6-3d0b-402a-ab3f-659ef42c8264")
    public static final String STEREOTYPE_NAME = "Action";

    /**
     * Tells whether a {@link Action proxy} can be instantiated from a {@link MObject} checking it is a {@link NameSpace} stereotyped << Action >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e670d000-5189-4c16-a4eb-bcccd42a086e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof NameSpace) && ((NameSpace) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Action.STEREOTYPE_NAME));
    }

    @objid ("281e8cdb-d8df-49d5-bd5b-7a8ece840271")
    public static Action safeInstantiate(NameSpace obj) {
        if (ScalingAction.canInstantiate(obj)) {
            return ScalingAction.safeInstantiate(obj);
        }else
            throw new IllegalArgumentException("Action: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fa537f86-f58d-40c3-b2e3-366e3b1edf0c")
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
     * @return the NameSpace represented by this proxy, never null.
     */
    @objid ("5ba1c38e-6b49-426d-a2c9-ce9cb7bb550a")
    @Override
    public NameSpace getElement() {
        return (NameSpace)super.getElement();
    }

    @objid ("ce147cd8-1fa9-480a-85b1-682140a6add6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c43f1953-0c1d-4b6e-995f-c6e5ea43cf9b")
    protected Action(final NameSpace elt) {
        super(elt);
    }

    @objid ("c5dc4266-14c2-4368-9374-34e0d3602383")
    public static final class MdaTypes {
        @objid ("5c41bd80-2b9e-4a90-a92c-992e1557b306")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bfe913fe-a27b-4f83-bc26-54e5d6f98a9f")
        private static Stereotype MDAASSOCDEP;

        @objid ("477178f8-8e27-44c9-a6cf-c803913dbcfd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("63536a05-2930-40e4-a696-0e0ea52e9414")
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
