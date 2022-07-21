/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("4b517781-0e62-4c52-aa1f-4b58e61b77ca")
    public static final String STEREOTYPE_NAME = "Action";

    /**
     * Tells whether a {@link Action proxy} can be instantiated from a {@link MObject} checking it is a {@link NameSpace} stereotyped << Action >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a038802f-1eb8-400d-90c9-23eab43f14af")
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

    @objid ("7b783bd1-e4ec-408e-8a95-6eaf748333a0")
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
    @objid ("db5a2823-20cd-4822-becb-20b3a392a695")
    @Override
    public NameSpace getElement() {
        return (NameSpace)super.getElement();
    }

    @objid ("0a23b858-2aba-44fd-a789-34263089e321")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c0821be9-3253-4668-b919-d65d9618ce25")
    protected Action(final NameSpace elt) {
        super(elt);
    }

    @objid ("c5dc4266-14c2-4368-9374-34e0d3602383")
    public static final class MdaTypes {
        @objid ("f1248ef7-5429-41a0-93f2-2fc45f934a16")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2145af32-7d23-42bf-bb09-16b12b19ca56")
        private static Stereotype MDAASSOCDEP;

        @objid ("e6e3a7b8-b67e-4b1f-9019-2955ba91b1fc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c76d3e1f-f3ce-492c-9a93-045578b64797")
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
