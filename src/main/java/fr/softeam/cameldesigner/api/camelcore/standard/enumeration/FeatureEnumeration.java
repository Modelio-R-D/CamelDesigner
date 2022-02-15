/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Enumeration} with << Feature_Enumeration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f9e34d12-f1b6-4c81-9391-96850b3d19c2")
public abstract class FeatureEnumeration extends Feature {
    @objid ("7b1e876a-c122-466f-bb51-8e9b113b7c87")
    public static final String STEREOTYPE_NAME = "Feature_Enumeration";

    /**
     * Tells whether a {@link FeatureEnumeration proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Feature_Enumeration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9f7d6adb-2d57-454a-994e-1b41834d2778")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureEnumeration.STEREOTYPE_NAME));
    }

    @objid ("1e49aef9-fe8e-415f-8b16-8f859d6ff662")
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
        FeatureEnumeration other = (FeatureEnumeration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Enumeration}. 
     * @return the Enumeration represented by this proxy, never null.
     */
    @objid ("c495773e-e91b-4445-9a2d-8719818c9aaa")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    @objid ("a35735b6-81d8-4fdb-bb24-75801ac020e0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2a5b6281-c5ab-4b36-ade3-450cd9187f1e")
    protected FeatureEnumeration(final Enumeration elt) {
        super(elt);
    }

    @objid ("a269a5b3-0221-4ddb-b9f7-b45550b3f049")
    public static final class MdaTypes {
        @objid ("0d1eb281-35e4-400c-a176-bfb94b37805c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("530c4ed6-c550-45c4-b699-e6edbc594245")
        private static Stereotype MDAASSOCDEP;

        @objid ("c0ce8870-ac03-4d75-9b44-83379d97a98b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("57ebf588-2006-46f7-a1be-1fae10e9a933")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "56eb7780-c162-400f-8e4b-0a5178cef153");
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
