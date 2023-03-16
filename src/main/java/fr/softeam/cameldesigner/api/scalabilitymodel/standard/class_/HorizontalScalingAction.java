/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << HorizontalScalingAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9043ebaf-e900-49af-8abc-87dbea13b475")
public class HorizontalScalingAction extends ScalingAction {
    @objid ("1f2fc8b7-039e-41f5-bd17-4b23fedcdb6b")
    public static final String STEREOTYPE_NAME = "HorizontalScalingAction";

    @objid ("6d2970ff-92eb-4180-86a3-08ef92558ed7")
    public static final String COUNT_TAGTYPE = "count";

    /**
     * Tells whether a {@link HorizontalScalingAction proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HorizontalScalingAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e75c2ed4-ad0c-4fb7-9396-fe879dface9a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScalingAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HorizontalScalingAction >> then instantiate a {@link HorizontalScalingAction} proxy.
     * 
     * @return a {@link HorizontalScalingAction} proxy on the created {@link Class}.
     */
    @objid ("601e700f-b83b-4975-b752-cfd8a40b9431")
    public static HorizontalScalingAction create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScalingAction.STEREOTYPE_NAME);
        return HorizontalScalingAction.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link HorizontalScalingAction} proxy from a {@link Class} stereotyped << HorizontalScalingAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link HorizontalScalingAction} proxy or <i>null</i>.
     */
    @objid ("4bbe4d37-3d42-4c8b-b7a3-73ef184a3b0a")
    public static HorizontalScalingAction instantiate(final Class obj) {
        return HorizontalScalingAction.canInstantiate(obj) ? new HorizontalScalingAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HorizontalScalingAction} proxy from a {@link Class} stereotyped << HorizontalScalingAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link HorizontalScalingAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("73ae00ed-de66-4762-b268-6c38af0864e1")
    public static HorizontalScalingAction safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HorizontalScalingAction.canInstantiate(obj))
        	return new HorizontalScalingAction(obj);
        else
        	throw new IllegalArgumentException("HorizontalScalingAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("85128241-6538-4cce-afa6-318251db929b")
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
        HorizontalScalingAction other = (HorizontalScalingAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'count'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b63e1b0b-6b10-4916-89f9-1846372e73a2")
    public String getCount() {
        return this.elt.getTagValue(HorizontalScalingAction.MdaTypes.COUNT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b34869b5-82bd-4c78-a20c-237f52378f7b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("4966b9c3-2481-4547-ad96-d9f6a6afcbf6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'count'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("83ef3e62-00f3-4893-84f4-1c50edaa95b4")
    public void setCount(final String value) {
        this.elt.putTagValue(HorizontalScalingAction.MdaTypes.COUNT_TAGTYPE_ELT, value);
    }

    @objid ("6dc98a86-5601-487a-8855-ca9e418fc552")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("53f3542f-4f07-479b-96bd-bd8586f65ec0")
    protected HorizontalScalingAction(final Class elt) {
        super(elt);
    }

    @objid ("903e4b65-68e5-46fa-8af6-f2905c82423f")
    public static final class MdaTypes {
        @objid ("722dc559-204f-4dc1-bcf8-6fa0bdc3af43")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fc06f11b-f894-485e-a635-b2519edfec3f")
        public static TagType COUNT_TAGTYPE_ELT;

        @objid ("0a4af253-a70e-41ab-b5eb-58acf3f35674")
        private static Stereotype MDAASSOCDEP;

        @objid ("dc318aa4-6ac9-40f3-abf7-6e1acd8d4597")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d43127e-006c-4e2e-a351-df74a0674c5b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "99008d6c-2622-4467-8283-6059df42c240");
            COUNT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d52b6541-1841-4607-96a8-591ad329e65f");
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
