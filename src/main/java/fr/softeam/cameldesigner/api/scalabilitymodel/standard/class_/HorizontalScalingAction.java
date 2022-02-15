/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
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
    @objid ("4b381062-ef2c-4263-8838-06273166c3b3")
    public static final String STEREOTYPE_NAME = "HorizontalScalingAction";

    @objid ("43556fd1-7af8-4468-98f0-31d9f634494c")
    public static final String COUNT_TAGTYPE = "count";

    /**
     * Tells whether a {@link HorizontalScalingAction proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HorizontalScalingAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e089b186-7e80-4544-b6d1-bfb3c2394fb1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScalingAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HorizontalScalingAction >> then instantiate a {@link HorizontalScalingAction} proxy.
     * 
     * @return a {@link HorizontalScalingAction} proxy on the created {@link Class}.
     */
    @objid ("83687ce2-a958-4695-adf9-01a1f889371e")
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
    @objid ("0a19379b-6b98-47ae-93a7-930ccaac4fac")
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
    @objid ("29b95ce7-302b-454b-aa50-e00dbf7e51c7")
    public static HorizontalScalingAction safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HorizontalScalingAction.canInstantiate(obj))
        	return new HorizontalScalingAction(obj);
        else
        	throw new IllegalArgumentException("HorizontalScalingAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("26b8a462-665b-4654-a9ac-72aa6a115c67")
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
    @objid ("2f14e64b-6b4a-4d09-8771-05e699ea9d5b")
    public String getCount() {
        return this.elt.getTagValue(HorizontalScalingAction.MdaTypes.COUNT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("3cc6c757-a257-41a4-8bde-fd27c068b54a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("51195cf1-85d6-4805-ba3c-8ffc7b57a726")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'count'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0799ea06-b615-46bb-bf61-0d94100effb8")
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

    @objid ("f5ac3c8c-6805-47b5-b5c4-1bc7f1b5661f")
    protected HorizontalScalingAction(final Class elt) {
        super(elt);
    }

    @objid ("903e4b65-68e5-46fa-8af6-f2905c82423f")
    public static final class MdaTypes {
        @objid ("b2ccf268-5457-403a-99d8-f9e7b5300116")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("09b72e30-04bd-4207-a290-2b137dbe0dd0")
        public static TagType COUNT_TAGTYPE_ELT;

        @objid ("4a7e542b-6b3f-4cef-b236-5a2d0fcd7d13")
        private static Stereotype MDAASSOCDEP;

        @objid ("e10437ca-5644-4483-b7e9-33d8d152e44f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("77911a24-43dd-45c5-8c86-110442861233")
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
