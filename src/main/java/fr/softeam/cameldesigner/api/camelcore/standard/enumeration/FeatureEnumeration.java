/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("943986ec-cc2a-491a-9136-cbb5a9c59ab2")
    public static final String STEREOTYPE_NAME = "Feature_Enumeration";

    /**
     * Tells whether a {@link FeatureEnumeration proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Feature_Enumeration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9f8b8108-482f-43b8-8db0-17ca5ea6a105")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureEnumeration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << Feature_Enumeration >> then instantiate a {@link FeatureEnumeration} proxy.
     * 
     * @return a {@link FeatureEnumeration} proxy on the created {@link Enumeration}.
     */
    @objid ("25179470-0f2f-41af-9f80-b4171c171589")
    public static FeatureEnumeration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Enumeration");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureEnumeration.STEREOTYPE_NAME);
        return FeatureEnumeration.instantiate((Enumeration)e);
    }

    /**
     * Tries to instantiate a {@link FeatureEnumeration} proxy from a {@link Enumeration} stereotyped << Feature_Enumeration >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Enumeration
     * @return a {@link FeatureEnumeration} proxy or <i>null</i>.
     */
    @objid ("6499e8e2-88f8-423d-a63e-ee7fdcc9b2f4")
    public static FeatureEnumeration instantiate(final Enumeration obj) {
        return FeatureEnumeration.canInstantiate(obj) ? new FeatureEnumeration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureEnumeration} proxy from a {@link Enumeration} stereotyped << Feature_Enumeration >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Enumeration}
     * @return a {@link FeatureEnumeration} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5989423e-cfab-432d-9b25-0314f59daf21")
    public static FeatureEnumeration safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (FeatureEnumeration.canInstantiate(obj))
            return new FeatureEnumeration(obj);
        else
            throw new IllegalArgumentException("FeatureEnumeration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fbba21b6-f114-4aa9-b00f-da2f66ee20fa")
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
     * 
     * @return the Enumeration represented by this proxy, never null.
     */
    @objid ("0eb4dd05-9f07-498b-b0ca-51619007e078")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    @objid ("d9735f27-da0c-414f-9dcd-3102daf5597f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e8a70c8e-3319-4921-8c82-eca4cf9e3b59")
    protected FeatureEnumeration(final Enumeration elt) {
        super(elt);
    }

    @objid ("a269a5b3-0221-4ddb-b9f7-b45550b3f049")
    public static final class MdaTypes {
        @objid ("5d635659-839c-4f6a-a924-03799e79c9be")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0bd3854c-697f-46f9-8b1f-e3c40bdb520f")
        private static Stereotype MDAASSOCDEP;

        @objid ("743ff7bc-8e92-48b7-b878-bc3e234f9a33")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7ab21a95-f384-4964-b919-a89f2d5b289e")
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
