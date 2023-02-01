/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("516cc7d7-f7a0-43d0-8fee-1931ec30683b")
=======
    @objid ("beb2952f-aca1-4195-a1f5-b35c2e66c222")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Action";

    /**
     * Tells whether a {@link Action proxy} can be instantiated from a {@link MObject} checking it is a {@link NameSpace} stereotyped << Action >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("b4f9e25a-e295-458e-a877-1adb3bad3d7a")
=======
    @objid ("34c0c865-2e6e-4383-9e32-fed11d563a13")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("3d4d7865-de0f-4b5d-8332-40d720b34844")
=======
    @objid ("5af76b18-000a-419d-a92c-616a30ba7037")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("205c5e0b-3f76-4bc0-98e9-7c2a31062b09")
=======
    @objid ("067d70c6-d8ff-4594-a365-58cb2bd668a3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public NameSpace getElement() {
        return (NameSpace)super.getElement();
    }

<<<<<<< HEAD
    @objid ("67200159-f76e-4a36-9a16-06ed183d5e0e")
=======
    @objid ("680d18ef-c01c-473a-9743-18fb2bba861b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

<<<<<<< HEAD
    @objid ("a07302b6-0dfe-40bd-8753-01c25f292d18")
=======
    @objid ("90447489-64a2-4cc8-b344-7ae24fcde128")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Action(final NameSpace elt) {
        super(elt);
    }

    @objid ("c5dc4266-14c2-4368-9374-34e0d3602383")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("39cc87b3-a2dc-4753-9fd0-870a76737cad")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("196e5ab9-8cb4-446a-a49d-1ff20fbd6e98")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb520c41-5c11-40ab-a911-6419f4a7b0c9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("451f2d46-ed87-470d-9575-52242ee11879")
=======
        @objid ("2b864db4-a9a6-47cb-a03f-54c12201eb95")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("74882a6f-fb6f-4f5d-b8fd-e79ceb22c8b6")
        private static Stereotype MDAASSOCDEP;

        @objid ("4d507159-0133-46c0-8eae-3f0f49372180")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f7328c61-4f6c-43d2-ad2a-33c60f9e90bd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
