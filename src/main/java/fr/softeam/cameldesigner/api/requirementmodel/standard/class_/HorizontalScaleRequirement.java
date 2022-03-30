/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.ScaleRequirement;
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
 * Proxy class to handle a {@link Class} with << HorizontalScaleRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7499c817-68b2-4e38-ad40-e52b9b627761")
public class HorizontalScaleRequirement extends ScaleRequirement {
    @objid ("b9759182-3d81-4e81-9471-c7525da3db87")
    public static final String STEREOTYPE_NAME = "HorizontalScaleRequirement";

    @objid ("c360d52d-a33b-4141-b4f0-ae4288d468b7")
    public static final String MAXINSTANCES_TAGTYPE = "maxInstances";

    @objid ("370d9033-dbea-4c41-96ea-41bbbf4f1832")
    public static final String MININSTANCES_TAGTYPE = "minInstances";

    /**
     * Tells whether a {@link HorizontalScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HorizontalScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cf049861-5494-4eca-b8a5-6c58cfb9ee14")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScaleRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HorizontalScaleRequirement >> then instantiate a {@link HorizontalScaleRequirement} proxy.
     * 
     * @return a {@link HorizontalScaleRequirement} proxy on the created {@link Class}.
     */
    @objid ("c1335162-b1f8-4b46-b1f3-9017abeb1af1")
    public static HorizontalScaleRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScaleRequirement.STEREOTYPE_NAME);
        return HorizontalScaleRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link HorizontalScaleRequirement} proxy from a {@link Class} stereotyped << HorizontalScaleRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link HorizontalScaleRequirement} proxy or <i>null</i>.
     */
    @objid ("27736670-aa50-4a57-a34f-11da9132b31f")
    public static HorizontalScaleRequirement instantiate(final Class obj) {
        return HorizontalScaleRequirement.canInstantiate(obj) ? new HorizontalScaleRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HorizontalScaleRequirement} proxy from a {@link Class} stereotyped << HorizontalScaleRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link HorizontalScaleRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d42620e3-63bf-48af-aeca-4431cda40900")
    public static HorizontalScaleRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HorizontalScaleRequirement.canInstantiate(obj))
        	return new HorizontalScaleRequirement(obj);
        else
        	throw new IllegalArgumentException("HorizontalScaleRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7ce204d6-3187-4030-aad6-b039d5a49467")
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
        HorizontalScaleRequirement other = (HorizontalScaleRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("a62edb68-ba75-4276-8ed9-029a7b1cfffe")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("551339da-0c82-4ef9-acb9-d9c4c092bbd4")
    public String getMaxInstances() {
        return this.elt.getTagValue(HorizontalScaleRequirement.MdaTypes.MAXINSTANCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f24a1d7d-b7d3-469c-972f-3cf7edaf6575")
    public String getMinInstances() {
        return this.elt.getTagValue(HorizontalScaleRequirement.MdaTypes.MININSTANCES_TAGTYPE_ELT);
    }

    @objid ("45fae920-c76c-480e-8296-ddc11a793159")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e9ac6b54-15f0-4d60-82ea-4669a7415fbf")
    public void setMaxInstances(final String value) {
        this.elt.putTagValue(HorizontalScaleRequirement.MdaTypes.MAXINSTANCES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("29547f06-63f0-43bb-ae8c-8fba082c9a40")
    public void setMinInstances(final String value) {
        this.elt.putTagValue(HorizontalScaleRequirement.MdaTypes.MININSTANCES_TAGTYPE_ELT, value);
    }

    @objid ("4b18ffee-0b98-4076-9e91-68b60870cbfd")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("b2c36842-39da-4a4e-8448-a05c5830b01b")
    protected HorizontalScaleRequirement(final Class elt) {
        super(elt);
    }

    @objid ("d63fbe87-50ec-448d-8e36-aae6e8f56a3f")
    public static final class MdaTypes {
        @objid ("987ea514-8515-45e1-9f2d-f6c45ffbc760")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("06f5e9e8-8cca-45a7-a34f-962b3ecc4610")
        public static TagType MININSTANCES_TAGTYPE_ELT;

        @objid ("10ffe703-0dcb-4926-95ee-8781fa4bf360")
        public static TagType MAXINSTANCES_TAGTYPE_ELT;

        @objid ("acbd68fe-678e-46c4-8cc8-ff585dc69e2e")
        private static Stereotype MDAASSOCDEP;

        @objid ("fbde4fd1-2eda-434b-b8cf-965ae7715294")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e78a9a2e-12ae-47e7-938d-60955d7fa6a1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3f58cfed-b308-4059-99be-85d0b3e87e12");
            MININSTANCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c43f3c46-ad2f-4776-809a-94ad9affc593");
            MAXINSTANCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "980baa1c-368d-4fd9-a7a4-8b4741c06485");
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
