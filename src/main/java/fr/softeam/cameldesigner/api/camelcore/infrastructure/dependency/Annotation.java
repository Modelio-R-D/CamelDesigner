/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency;

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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << Annotation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7031d203-af8d-4031-b372-b418d6e60fbd")
public class Annotation extends CamelElement {
    @objid ("9af9c7e2-5f35-47de-940f-ab0754d52bfe")
    public static final String STEREOTYPE_NAME = "Annotation";

    /**
     * Tells whether a {@link Annotation proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << Annotation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("59f0a5e6-c72f-4691-9cf6-e7f18471e114")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Annotation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << Annotation >> then instantiate a {@link Annotation} proxy.
     * 
     * @return a {@link Annotation} proxy on the created {@link Dependency}.
     */
    @objid ("ad471993-298c-4698-8242-36cee8ccbc61")
    public static Annotation create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Annotation.STEREOTYPE_NAME);
        return Annotation.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link Annotation} proxy from a {@link Dependency} stereotyped << Annotation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link Annotation} proxy or <i>null</i>.
     */
    @objid ("ff3f0164-b45a-45eb-8c65-1cfff67302c4")
    public static Annotation instantiate(final Dependency obj) {
        return Annotation.canInstantiate(obj) ? new Annotation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Annotation} proxy from a {@link Dependency} stereotyped << Annotation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link Annotation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("092607fe-4d12-41ed-bd20-26706df4468b")
    public static Annotation safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (Annotation.canInstantiate(obj))
        	return new Annotation(obj);
        else
        	throw new IllegalArgumentException("Annotation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d5cdcb30-caff-4552-8f11-b65f1d462cca")
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
        Annotation other = (Annotation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("667568f8-8522-49ff-bacc-e33197f10a06")
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    @objid ("de0edddf-419b-452d-826f-d9b7a9be74e5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ce3e9a88-6dd5-4dcb-bc53-7158f2ed587d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("18c1b5f0-6ded-4354-9bbd-9a2a9f86ff9b")
    protected Annotation(final Dependency elt) {
        super(elt);
    }

    @objid ("e1806156-f5a9-4d39-9bb7-739c08fa2b43")
    public static final class MdaTypes {
        @objid ("e90d6337-6104-4b24-8c08-480d22f45957")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("30469e32-044b-4249-8fb9-256ffbd32864")
        private static Stereotype MDAASSOCDEP;

        @objid ("7604e799-f20e-45f6-a13a-14e917b86885")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("53318495-88f1-455d-aee6-7eb86ccd88ad")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6ac7f831-f2b4-447b-ba9e-e58f7834bcf7");
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
