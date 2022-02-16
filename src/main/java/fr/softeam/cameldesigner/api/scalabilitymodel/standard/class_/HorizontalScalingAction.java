/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("4eacc432-03c6-4ac9-aed6-574abb8ae417")
    public static final String STEREOTYPE_NAME = "HorizontalScalingAction";

    @objid ("0d86732c-e043-471b-80b2-f63ee0ff9950")
    public static final String COUNT_TAGTYPE = "count";

    /**
     * Tells whether a {@link HorizontalScalingAction proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HorizontalScalingAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5f6d60f3-1cf5-402f-9e59-bfd306a595a8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScalingAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HorizontalScalingAction >> then instantiate a {@link HorizontalScalingAction} proxy.
     * 
     * @return a {@link HorizontalScalingAction} proxy on the created {@link Class}.
     */
    @objid ("b0e7556a-e6ef-436d-bf66-a5531f14c189")
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
    @objid ("2ba00976-9f50-4ce3-80ab-af8072be5317")
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
    @objid ("55b00e1c-9fd2-4e7f-9c2e-e5d08ad0fc3f")
    public static HorizontalScalingAction safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HorizontalScalingAction.canInstantiate(obj))
        	return new HorizontalScalingAction(obj);
        else
        	throw new IllegalArgumentException("HorizontalScalingAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f162da93-401f-4ea7-97a8-b653eef55d2e")
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
    @objid ("167338eb-cac3-41c4-8836-190a74f64204")
    public String getCount() {
        return this.elt.getTagValue(HorizontalScalingAction.MdaTypes.COUNT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("be17d712-d66d-451a-b1a8-37bc066ddc57")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("a8f6700c-d3e8-4bf6-bf0d-f5f91bf43844")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'count'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("91920e1f-d3da-4e98-8254-4297ed32538d")
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

    @objid ("e80ba629-6a27-4509-8408-85006503bd9c")
    protected HorizontalScalingAction(final Class elt) {
        super(elt);
    }

    @objid ("903e4b65-68e5-46fa-8af6-f2905c82423f")
    public static final class MdaTypes {
        @objid ("7d017e0f-6f99-484a-ac07-cd314fbd6bdc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1268f558-8d51-4259-a168-a3a1152df99e")
        public static TagType COUNT_TAGTYPE_ELT;

        @objid ("fa9a9188-d4b3-484a-bb63-15ac4f6b259f")
        private static Stereotype MDAASSOCDEP;

        @objid ("89d49e11-4bd7-4ee2-997d-88c3da21b7e5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("02d03281-2d97-4c7f-a3fd-705adde21d8c")
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
