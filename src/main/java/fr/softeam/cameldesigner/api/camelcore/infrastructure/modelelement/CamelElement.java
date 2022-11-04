/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.Annotation;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.PropertyDependency;
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
 * Proxy class to handle a {@link ModelElement} with << CamelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e19016d0-0edb-4a41-bbf9-7506c03fcd5e")
public abstract class CamelElement {
    @objid ("3e628ae0-751b-42f3-9e36-bf62032a83e9")
    public static final String STEREOTYPE_NAME = "CamelElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("2c1968b7-4db5-49ae-8d92-c5782ab6f08e")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CamelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CamelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("edd63273-c74d-47b6-8453-b3b055cedb5a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelElement.STEREOTYPE_NAME));
    }

    @objid ("a4e4903c-fa45-457b-abd6-85a6ac790ea3")
    public static CamelElement instantiate(final ModelElement obj) {
        return NamedElement.canInstantiate(obj) ? NamedElement.instantiate(obj) :
            PropertyDependency.canInstantiate(obj) ? PropertyDependency.instantiate((Dependency)obj) :
                Annotation.canInstantiate(obj) ? Annotation.instantiate((Dependency)obj) : null;
    }

    @objid ("aa359e8d-e92b-4bab-8787-1aa04ffafba1")
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
        CamelElement other = (CamelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("29cc6954-e09a-4364-8e1b-a3472c94e394")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("97a4be69-1d53-4659-92fd-e3bd89e8e2dd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("030a2c20-cdf9-4226-a2af-5a26b172d361")
    public List<CamelElement> getChilds() {
        return new ArrayList<>();
    }

    @objid ("13132bfe-6323-4be4-86c4-4b970674df63")
    protected CamelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1755d7a2-ba56-47fd-b0d2-652ed674f106")
    public static final class MdaTypes {
        @objid ("7387b814-5e02-47af-9f2f-eca086f22795")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("111f48fc-dc7d-4baf-a2d7-56509d699fb0")
        private static Stereotype MDAASSOCDEP;

        @objid ("9c68b1b9-33a1-4bf6-8ca0-773538d3244c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e1299823-e92c-4f6d-810a-af829a7a9641")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9aef4bd8-fa92-4231-9295-3eb5a619ceab");
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
