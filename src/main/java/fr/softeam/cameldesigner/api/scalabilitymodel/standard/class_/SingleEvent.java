/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << SingleEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b740d58f-0acd-4aba-bdc8-6394a8467e6c")
public abstract class SingleEvent extends Event {
    @objid ("780f278c-ffc9-4f69-80f2-51d1bb1e2c47")
    public static final String STEREOTYPE_NAME = "SingleEvent";

    /**
     * Tells whether a {@link SingleEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SingleEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("907b5bdf-6e50-4cc4-9146-5cbc44ba9cf3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SingleEvent.STEREOTYPE_NAME));
    }

    @objid ("ece4e9a2-ee25-41c2-9891-193a33b5078d")
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
        SingleEvent other = (SingleEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("bd4cec1c-65de-4815-a52a-b5ef5acd62b7")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("52b3af58-d519-44c2-953d-ffa8d15b76de")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3d554f2b-0199-4de0-8fad-bb0325273c1f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c8127f3a-c17e-41a3-b3c0-fab5e15633e1")
    protected SingleEvent(final Class elt) {
        super(elt);
    }

    @objid ("4e5c23d4-7cb6-45fd-804e-c2745676a29b")
    public static final class MdaTypes {
        @objid ("731ff7c0-aea9-48a5-b855-2b382e0ebabf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("86769e5c-01b6-4a88-b942-660cd7573a4d")
        private static Stereotype MDAASSOCDEP;

        @objid ("e427ce76-6dad-450a-9b6b-db32d4c06225")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cd51b7a9-ddfa-47b6-b551-aa808ce190cb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "40acd9bb-daad-41f6-96cd-d9267430eabf");
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
