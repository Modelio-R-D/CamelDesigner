/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("f3c69f5b-4011-4c01-b2c5-d6f60a0acf63")
    public static final String STEREOTYPE_NAME = "Annotation";

    /**
     * Tells whether a {@link Annotation proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << Annotation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d56017fe-1377-441d-9e9b-cdbeba4b42bc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Annotation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << Annotation >> then instantiate a {@link Annotation} proxy.
     * 
     * @return a {@link Annotation} proxy on the created {@link Dependency}.
     */
    @objid ("9d160b29-9fb5-47b9-8129-5b7d9f3aea73")
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
    @objid ("51d83a22-dde7-414f-8c0a-6f467c951950")
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
    @objid ("a43a8007-7afb-452f-9a40-13dab47d9214")
    public static Annotation safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (Annotation.canInstantiate(obj))
        	return new Annotation(obj);
        else
        	throw new IllegalArgumentException("Annotation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("440c0e2b-0f49-4e93-87a3-d8226b214514")
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
    @objid ("d0707394-16f7-415c-94f4-c74d505857fe")
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    @objid ("22875286-0e3a-4a4e-a9db-2b97f6aef3ce")
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

    @objid ("624f11ee-9a3d-42ab-b0fb-e68a90fcd478")
    protected Annotation(final Dependency elt) {
        super(elt);
    }

    @objid ("e1806156-f5a9-4d39-9bb7-739c08fa2b43")
    public static final class MdaTypes {
        @objid ("bf2b56e4-b8f5-470b-b54a-054c5e46723d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9430e65f-2487-473d-b70f-0137bb2b143b")
        private static Stereotype MDAASSOCDEP;

        @objid ("7be77fd4-adcc-492a-8eeb-c398d0051cac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0dbfdc15-6014-4dc0-8987-59c2354c530d")
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
