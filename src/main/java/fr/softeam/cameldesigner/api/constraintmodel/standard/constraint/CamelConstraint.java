/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << CamelConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fee51019-906e-4485-9a50-f01a00d74979")
public abstract class CamelConstraint extends ExpendableElement {
    @objid ("2c86e1fc-698e-4d21-ad06-80f447204b5e")
    public static final String STEREOTYPE_NAME = "CamelConstraint";

    /**
     * Tells whether a {@link CamelConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << CamelConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f19ff7b8-cc88-459b-b9c0-44ede9b568b2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelConstraint.STEREOTYPE_NAME));
    }

    @objid ("ef8959b5-9ea2-40f7-9175-ba14fdf708fc")
    public static CamelConstraint instantiate(final Constraint obj) {
        return UnaryConstraint.canInstantiate(obj) ? UnaryConstraint.instantiate(obj) :
            CompositeConstraint.canInstantiate(obj) ? CompositeConstraint.instantiate(obj) : null;
    }

    @objid ("095061f4-7e3c-4596-a7dc-191e2a2675a2")
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
        CamelConstraint other = (CamelConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("8cb35eca-7f69-4c74-89bf-200468f11103")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("b064e31c-47d1-4659-8ab0-e7afeeea66b9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("60dd4aa9-c377-4696-a56b-ff5c718d4b9e")
    protected CamelConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("c2b5b585-3d59-484d-8c6a-ed96326a9e5e")
    public static final class MdaTypes {
        @objid ("2f7b1fe2-7e07-432d-920c-7e73302a82d3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6f10a750-73ba-4edf-9517-ce2f53a4bc4a")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb616c8e-6e86-42df-8362-e7d8027b2aef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d12eddc-ca78-4779-b551-82eb3d167271")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4afa0df7-c748-4db8-b9a7-a082a8419c00");
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
