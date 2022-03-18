/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("1aeb07a1-bcb4-4a1a-8774-5c5683b23a4b")
    public static final String STEREOTYPE_NAME = "Feature_Enumeration";

    /**
     * Tells whether a {@link FeatureEnumeration proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Feature_Enumeration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("535c386f-1fb3-4159-9dc4-5cc55bd26982")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureEnumeration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << Feature_Enumeration >> then instantiate a {@link FeatureEnumeration} proxy.
     * 
     * @return a {@link FeatureEnumeration} proxy on the created {@link Enumeration}.
     */
    @objid ("d2328767-d75d-4de2-a9a6-4e9e2f5a89ab")
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
    @objid ("4b4d5d6d-2b17-4a3d-97ab-79c746a0ed02")
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
    @objid ("db4528f6-44d7-4742-8777-aa959e952a46")
    public static FeatureEnumeration safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (FeatureEnumeration.canInstantiate(obj))
        	return new FeatureEnumeration(obj);
        else
        	throw new IllegalArgumentException("FeatureEnumeration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8cbf56aa-d6c7-4dc0-b492-892d4661e08b")
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
    @objid ("81ddd346-b36f-4d83-b622-7798cdc809c4")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    @objid ("f7c8d47e-22fd-4761-8658-7a8dd5246762")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cbc92f82-be32-4c49-97fe-dff2cc494679")
    protected FeatureEnumeration(final Enumeration elt) {
        super(elt);
    }

    @objid ("a269a5b3-0221-4ddb-b9f7-b45550b3f049")
    public static final class MdaTypes {
        @objid ("abea697c-8687-4fa2-b577-161ec011182f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bb91cb0e-2bee-4ccd-8333-5a982ed8a5d2")
        private static Stereotype MDAASSOCDEP;

        @objid ("e2649f15-bdc8-432f-8c7e-6d35a71c9e9d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("174bd513-038b-4a34-bfb9-bf8affbfbe02")
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
