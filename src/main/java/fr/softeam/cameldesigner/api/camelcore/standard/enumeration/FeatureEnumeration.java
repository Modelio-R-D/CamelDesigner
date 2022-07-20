/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.classifier.FeatureClassifier;
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
public class FeatureEnumeration extends FeatureClassifier {
    @objid ("368dc2fb-f569-4ad8-9b99-1ac69c0cf2ac")
    public static final String STEREOTYPE_NAME = "Feature_Enumeration";

    /**
     * Tells whether a {@link FeatureEnumeration proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Feature_Enumeration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a205331a-6e02-4441-a4a8-fe4f49352c6b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureEnumeration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << Feature_Enumeration >> then instantiate a {@link FeatureEnumeration} proxy.
     * 
     * @return a {@link FeatureEnumeration} proxy on the created {@link Enumeration}.
     */
    @objid ("2d069363-b2de-450a-8110-56f54d17b8f9")
    public static FeatureEnumeration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Enumeration");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureEnumeration.STEREOTYPE_NAME);
        return FeatureEnumeration.instantiate((Enumeration)e);
    }

    /**
     * Tries to instantiate a {@link FeatureEnumeration} proxy from a {@link Enumeration} stereotyped << Feature_Enumeration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Enumeration
     * @return a {@link FeatureEnumeration} proxy or <i>null</i>.
     */
    @objid ("4ef30d70-a9eb-4b5a-8838-7ab4f821d406")
    public static FeatureEnumeration instantiate(final Enumeration obj) {
        return FeatureEnumeration.canInstantiate(obj) ? new FeatureEnumeration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureEnumeration} proxy from a {@link Enumeration} stereotyped << Feature_Enumeration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Enumeration}
     * @return a {@link FeatureEnumeration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8439522b-fcda-4df3-9c58-f856effc30a8")
    public static FeatureEnumeration safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (FeatureEnumeration.canInstantiate(obj))
        	return new FeatureEnumeration(obj);
        else
        	throw new IllegalArgumentException("FeatureEnumeration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b53366ef-8ea5-4fec-88b8-10ed803d14f1")
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
    @objid ("9926a697-35c3-429f-94eb-85523db1a4d5")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    @objid ("76a7550f-9079-43b0-b899-3271d54d6e63")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2319e542-1fdc-4ae4-93a6-7756752c4f17")
    protected FeatureEnumeration(final Enumeration elt) {
        super(elt);
    }

    @objid ("a269a5b3-0221-4ddb-b9f7-b45550b3f049")
    public static final class MdaTypes {
        @objid ("82ecfafc-4523-4fe4-accb-f5f0ef701721")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b16c61d0-4904-4d78-ab65-de33592c081c")
        private static Stereotype MDAASSOCDEP;

        @objid ("ca00336f-2af7-4a8d-abcf-5e84fc01c23c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d164beb4-8844-4714-ad93-21b0aaf94d16")
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
