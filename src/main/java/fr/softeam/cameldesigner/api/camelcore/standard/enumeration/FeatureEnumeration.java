/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("3aeb35a0-4492-405a-a194-1db154130659")
    public static final String STEREOTYPE_NAME = "Feature_Enumeration";

    /**
     * Tells whether a {@link FeatureEnumeration proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Feature_Enumeration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ea4c977b-95f2-46ca-97ed-50c12ea17eb1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureEnumeration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << Feature_Enumeration >> then instantiate a {@link FeatureEnumeration} proxy.
     * 
     * @return a {@link FeatureEnumeration} proxy on the created {@link Enumeration}.
     */
    @objid ("e8f95bc4-66c9-47ad-b22c-828a91a72a62")
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
    @objid ("4cc318ab-ac8d-454f-88b5-458f8bd7d41d")
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
    @objid ("e2e12cf1-d7f2-4abf-ae1f-68d74991cf38")
    public static FeatureEnumeration safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (FeatureEnumeration.canInstantiate(obj))
        	return new FeatureEnumeration(obj);
        else
        	throw new IllegalArgumentException("FeatureEnumeration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cb479302-cb0f-4a72-bca9-719978763784")
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
    @objid ("eaff0166-03bf-4e2e-9071-673023466ed7")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    @objid ("a34bd9ad-016a-4045-b1ed-8edf7aa9bc90")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f5acbf31-ce2d-48d3-85e0-1e51b7ee0d9d")
    protected FeatureEnumeration(final Enumeration elt) {
        super(elt);
    }

    @objid ("a269a5b3-0221-4ddb-b9f7-b45550b3f049")
    public static final class MdaTypes {
        @objid ("a5d25a17-9fc2-404e-a03c-7ce43885c1cc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7ba297f7-ab9a-41d0-93f8-2d12d0531a4c")
        private static Stereotype MDAASSOCDEP;

        @objid ("c88b093c-a144-40ef-99b8-b4e8870405a0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e491535c-a557-42f2-b009-9808c83ff307")
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
