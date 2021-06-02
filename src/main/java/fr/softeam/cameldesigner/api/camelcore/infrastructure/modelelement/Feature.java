/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.03

 * This file was generated on 3/29/21 4:01 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

/**
 * Proxy class to handle a {@link ModelElement} with << Feature >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a5eb4aa4-b3c3-4bce-b713-24ce0ac2b84e")
public abstract class Feature extends NamedElement {
    @objid ("d6559e79-ace4-4fa2-90bc-e890c3a6b451")
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

    @objid ("1a5763fc-1f1d-443b-9c2f-80365e2157b5")
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
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("16c8f4a2-779e-4b96-930b-e0c1e49f74fe")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("c6b02815-6645-4b70-8fdf-b6c541852793")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("bea9467e-86bb-41a3-9896-9ee4a9c4a666")
    protected Feature(final ModelElement elt) {
        super(elt);
    }

    @objid ("0cb56ef2-b57c-49c0-afb4-c4b5f234e49b")
    public static final class MdaTypes {
        @objid ("df51bcea-e0c0-4b7f-8b61-503283814d6e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f55438ab-32a1-4b97-8b15-1fcf606c0b51")
        private static Stereotype MDAASSOCDEP;

        @objid ("0176ed82-bce1-4d1e-bbb9-29301a8d2d65")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fdf8aeb9-fde1-4987-88b9-caa41f97cada")
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
