/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
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
 * Proxy class to handle a {@link ModelElement} with << Feature >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a5eb4aa4-b3c3-4bce-b713-24ce0ac2b84e")
public abstract class Feature extends NamedElement {
    @objid ("1f0026ed-2dc7-41e8-b06a-48a67ab045df")
    public static final String STEREOTYPE_NAME = "Feature";

    /**
     * Tells whether a {@link Feature proxy} can be instantiated from a {@link MObject} checking it is a {@link } stereotyped << Feature>>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5fa7120c-f2b5-427c-a563-f6dc050bc107")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (
                ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureClass.STEREOTYPE_NAME) ||
                ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureInstance.STEREOTYPE_NAME) ||
                ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeaturePort.STEREOTYPE_NAME) ));
    }

    /**
     * Tries to instantiate a {@link Feature} proxy from a {@link Class} stereotyped << Feature_Class >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link FeatureClass} proxy or <i>null</i>.
     */
    @objid ("3833b4f3-fe19-4d28-b47b-a536bc8aae03")
    public static Feature instantiate(final ModelElement obj) {
        if (FeatureClass.canInstantiate(obj)) {
            return FeatureClass.instantiate(obj);
        }else if (FeatureInstance.canInstantiate(obj)) {
            return FeatureInstance.instantiate(obj);
        }else if (FeaturePort.canInstantiate(obj)) {
            return FeaturePort.instantiate(obj);
        }
        return null;
    }

    /**
     * Tries to instantiate a {@link Feature} proxy from a {@link Class} stereotyped << Feature_Class >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link FeatureClass} proxy or <i>null</i>.
     */
    @objid ("1a3fd495-5268-407f-a439-a619cc00e495")
    public static Feature safeinstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (FeatureClass.canInstantiate(obj)) {
            return FeatureClass.instantiate(obj);
        }else if (FeatureInstance.canInstantiate(obj)) {
            return FeatureInstance.instantiate(obj);
        }else if (FeaturePort.canInstantiate(obj)) {
            return FeaturePort.instantiate(obj);
        }
        throw new IllegalArgumentException("Feature: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4a01e2eb-68d0-4d94-85f8-5e32d8cab9b7")
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
        Feature other = (Feature) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("3a7ede2f-4efa-49d1-bb14-136f3afbc810")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("7a9bca30-b6f2-4b31-9f9d-bcc6efd2247c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d54a84fc-0388-41ba-b554-ad8ba2c9ef99")
    protected Feature(final ModelElement elt) {
        super(elt);
    }

    @objid ("0cb56ef2-b57c-49c0-afb4-c4b5f234e49b")
    public static final class MdaTypes {
        @objid ("58047e81-4d2b-4661-892a-896844ab5aff")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a50c3762-b783-4797-81df-d7695cd2549f")
        private static Stereotype MDAASSOCDEP;

        @objid ("d36cb641-791a-428a-9fe8-dcd10c8f984c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aae8f25f-1847-42e9-89d1-3e9543a6c2ad")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1ff10997-aa56-4f9b-b413-f32fadcc29bb");
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
