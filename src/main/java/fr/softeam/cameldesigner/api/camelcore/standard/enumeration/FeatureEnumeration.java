/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("53eb0126-65a1-4f09-8ec6-75249109eb74")
    public static final String STEREOTYPE_NAME = "Feature_Enumeration";

    /**
     * Tells whether a {@link FeatureEnumeration proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Feature_Enumeration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7d7963b9-79ff-40c2-8ebb-b00c38312bf6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureEnumeration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << Feature_Enumeration >> then instantiate a {@link FeatureEnumeration} proxy.
     * 
     * @return a {@link FeatureEnumeration} proxy on the created {@link Enumeration}.
     */
    @objid ("5d0ef833-3b7d-4e2d-850e-59f3c1797dc7")
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
    @objid ("d4925630-b873-4204-97bb-89d6b1c34c08")
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
    @objid ("cfb9d1eb-92ee-485e-89ec-6a771ed629dd")
    public static FeatureEnumeration safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (FeatureEnumeration.canInstantiate(obj))
        	return new FeatureEnumeration(obj);
        else
        	throw new IllegalArgumentException("FeatureEnumeration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3fd673ba-541f-411e-abef-cd68f1f9d9e7")
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
    @objid ("bb59d25c-4ba1-4023-96fb-9b1e4103f453")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    @objid ("3bc338d5-bbf2-4f66-9e7f-669edd752086")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("509f1782-b11e-4205-9a47-218d33d591d5")
    protected FeatureEnumeration(final Enumeration elt) {
        super(elt);
    }

    @objid ("a269a5b3-0221-4ddb-b9f7-b45550b3f049")
    public static final class MdaTypes {
        @objid ("2ef8fdae-4728-4b70-adb3-7e44c2bd7b67")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7bcd19aa-81fc-443a-acff-b2d420f40d82")
        private static Stereotype MDAASSOCDEP;

        @objid ("cb3bb2c5-cbd7-4687-b37f-fda32dda2f79")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("61e04975-6b26-4890-969f-bb3d75d34748")
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
