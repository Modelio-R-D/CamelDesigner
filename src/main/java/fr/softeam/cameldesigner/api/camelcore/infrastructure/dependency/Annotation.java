/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("5d50a83e-7945-4b96-a34a-3bb1567fa67c")
    public static final String STEREOTYPE_NAME = "Annotation";

    /**
     * Tells whether a {@link Annotation proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << Annotation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c0eb5ce7-9be9-49e1-8727-7aff2ccc77d7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Annotation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << Annotation >> then instantiate a {@link Annotation} proxy.
     * 
     * @return a {@link Annotation} proxy on the created {@link Dependency}.
     */
    @objid ("f98db010-00fa-4029-8b7e-760690f38fd4")
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
    @objid ("f11a1fd6-df07-4766-ac37-d399eec45fb9")
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
    @objid ("a6671ac2-d1ca-424d-94da-4dfea842aa7e")
    public static Annotation safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (Annotation.canInstantiate(obj))
        	return new Annotation(obj);
        else
        	throw new IllegalArgumentException("Annotation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("75c0ed3f-b58d-4fdd-9c6d-4aaeea3061bd")
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
    @objid ("a12f8fb1-1570-4700-ac7e-697729ff9e32")
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    @objid ("362570ea-8f59-4a0e-b7a8-457fb8c998b0")
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

    @objid ("fd67951e-1433-4cc5-92c5-989bfc3bc50a")
    protected Annotation(final Dependency elt) {
        super(elt);
    }

    @objid ("e1806156-f5a9-4d39-9bb7-739c08fa2b43")
    public static final class MdaTypes {
        @objid ("5a33b1f2-3a94-4cdb-bef4-0d31fe41e679")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("804ad9d2-9262-4c3b-9cbe-9fe44a8bb3e2")
        private static Stereotype MDAASSOCDEP;

        @objid ("83e2d09e-f067-433d-8ad2-f709eab45ca8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d6afe0fd-241b-4c78-95ab-a2558bdcbbe0")
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
