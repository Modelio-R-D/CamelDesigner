/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("f48c36ad-abad-44bc-95a1-26ded975433d")
    public static final String STEREOTYPE_NAME = "CamelElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("a4518216-a7ab-42e7-afda-b7687620642f")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CamelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CamelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("62a0cba3-9b28-4db8-8e21-6f7a31775791")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelElement.STEREOTYPE_NAME));
    }

    @objid ("a4e4903c-fa45-457b-abd6-85a6ac790ea3")
    public static CamelElement instantiate(final ModelElement obj) {
        return NamedElement.canInstantiate(obj) ? NamedElement.instantiate(obj) :
            PropertyDependency.canInstantiate(obj) ? PropertyDependency.instantiate((Dependency)obj) :
                Annotation.canInstantiate(obj) ? Annotation.instantiate((Dependency)obj) : null;
    }

    @objid ("715bf47f-d66b-472d-a44d-8c98c01a5bce")
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
    @objid ("36d06ca9-dafc-43ba-a31f-7d18a96138ee")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("70e536f3-f2ab-498f-aca3-91d50eb9e3bb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("030a2c20-cdf9-4226-a2af-5a26b172d361")
    public List<CamelElement> getChilds() {
        return new ArrayList<>();
    }

    @objid ("8cb124b1-6d07-4628-9835-a46e13b3a4f7")
    protected CamelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1755d7a2-ba56-47fd-b0d2-652ed674f106")
    public static final class MdaTypes {
        @objid ("af9bab4b-70d5-40bd-804a-a570594bfeb7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("17d98f17-e415-4397-87dc-194ff7675e80")
        private static Stereotype MDAASSOCDEP;

        @objid ("5daac2d7-f91a-466b-af85-733a2c82d8b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b85f726a-3496-4374-9d00-92853c9dffae")
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
