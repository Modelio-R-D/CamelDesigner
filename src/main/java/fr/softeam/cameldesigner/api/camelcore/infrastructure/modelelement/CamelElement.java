/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("b648bf09-6934-40e8-a2e0-2c19c9d791e9")
    public static final String STEREOTYPE_NAME = "CamelElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("0f9237cc-3b99-4e76-b233-c0a41566f82c")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CamelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CamelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0ea06c89-3d02-4e35-bbd4-9441575d2b06")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelElement.STEREOTYPE_NAME));
    }

    @objid ("a4e4903c-fa45-457b-abd6-85a6ac790ea3")
    public static CamelElement instantiate(final ModelElement obj) {
        return NamedElement.canInstantiate(obj) ? NamedElement.instantiate(obj) :
            PropertyDependency.canInstantiate(obj) ? PropertyDependency.instantiate((Dependency)obj) :
                Annotation.canInstantiate(obj) ? Annotation.instantiate((Dependency)obj) : null;
    }

    @objid ("43c69035-03cb-43a9-988c-9cdcecab3179")
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
    @objid ("04e2bede-fd7d-409f-a0a4-9f43873c5d57")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("681027f5-8999-4d06-88cc-8147f981f1c0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("030a2c20-cdf9-4226-a2af-5a26b172d361")
    public List<CamelElement> getChilds() {
        return new ArrayList<>();
    }

    @objid ("29050444-621f-42f4-8dd5-140db12e9018")
    protected CamelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1755d7a2-ba56-47fd-b0d2-652ed674f106")
    public static final class MdaTypes {
        @objid ("a76f5ce6-1a78-4b45-8521-24f89e4ffb04")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("48d859d2-b7d7-40ae-b157-25547f262f5e")
        private static Stereotype MDAASSOCDEP;

        @objid ("2405ee2b-add9-453d-8d85-24469df76879")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6856f37e-64fd-4140-b37e-99b4164f5fac")
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
