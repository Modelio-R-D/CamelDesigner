/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link Class} with << BooleanValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("189044d4-f590-4d4b-94d6-f2503fd76c82")
public class BooleanValue extends Value {
    @objid ("5ece6360-9696-4c27-b427-31960f8d6010")
    public static final String STEREOTYPE_NAME = "BooleanValue";

    @objid ("7bfd41f4-fe17-4b91-abf3-d854f17cc40a")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link BooleanValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << BooleanValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("51b10c03-d5ae-4821-a823-0b1ce428b708")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BooleanValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << BooleanValue >> then instantiate a {@link BooleanValue} proxy.
     * 
     * @return a {@link BooleanValue} proxy on the created {@link Class}.
     */
    @objid ("a058a21b-33e8-4262-bbb1-b44f5d1bddc7")
    public static BooleanValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, BooleanValue.STEREOTYPE_NAME);
        return BooleanValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link BooleanValue} proxy from a {@link Class} stereotyped << BooleanValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link BooleanValue} proxy or <i>null</i>.
     */
    @objid ("cf3d22a0-5fee-416b-87ec-1c21b93c6248")
    public static BooleanValue instantiate(final Class obj) {
        return BooleanValue.canInstantiate(obj) ? new BooleanValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BooleanValue} proxy from a {@link Class} stereotyped << BooleanValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link BooleanValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b66a365c-e07e-4c77-958f-b6c8787e79a8")
    public static BooleanValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (BooleanValue.canInstantiate(obj))
        	return new BooleanValue(obj);
        else
        	throw new IllegalArgumentException("BooleanValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("40835ac1-172c-4478-b8dc-6b5518121da0")
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
        BooleanValue other = (BooleanValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("7f7eca48-f79a-4988-86b7-b4b3dcdede93")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("d1d19953-098d-4e52-8da6-3e54b2f30781")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0f4a75a1-60cd-4307-8a08-5b55bfe05127")
    public boolean isValue() {
        return this.elt.isTagged(BooleanValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("70cd098f-e109-48a9-9869-c1cfaf502a25")
    public void setValue(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(BooleanValue.MdaTypes.VALUE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(BooleanValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("898f398d-5478-4457-8917-f1efe7659241")
    protected BooleanValue(final Class elt) {
        super(elt);
    }

    @objid ("2d228821-481c-49eb-a387-abae42f72daf")
    public static final class MdaTypes {
        @objid ("44990a72-bcca-4ae1-91a6-60da5ac6fd90")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("613b7d74-8660-4fbd-b54e-c6b2b9112122")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("6792e102-7159-4f1c-a65f-9d3755aa09f3")
        private static Stereotype MDAASSOCDEP;

        @objid ("76c675e2-2939-4d1c-b179-78a77a925a49")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("34f3e65c-388c-4521-aff6-070ab38896c0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b4355a7e-9eca-4a9e-8c4c-d49344a0c9a5");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2fabd851-ad25-472c-927a-770ef9217dd9");
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
