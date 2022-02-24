/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("4c832737-1bb5-47fb-aaaf-4b2312572ee2")
    public static final String STEREOTYPE_NAME = "HorizontalScaleRequirement";

    @objid ("6d6ff3ff-342a-463a-9a37-e2f242bf6341")
    public static final String MAXINSTANCES_TAGTYPE = "maxInstances";

    @objid ("fabf65d7-d6ac-4f60-a9e6-ad0a5d3d7241")
    public static final String MININSTANCES_TAGTYPE = "minInstances";

    /**
     * Tells whether a {@link HorizontalScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HorizontalScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7e8367f0-de19-49d3-83c8-af29b70768a1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScaleRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HorizontalScaleRequirement >> then instantiate a {@link HorizontalScaleRequirement} proxy.
     * 
     * @return a {@link HorizontalScaleRequirement} proxy on the created {@link Class}.
     */
    @objid ("84e200eb-83d2-44d9-8181-791261b20c54")
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
    @objid ("2ea8dc08-b69a-433b-8fd3-4eb901f37105")
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
    @objid ("a2d33a20-200c-4ab8-8579-e67fa6479d46")
    public static HorizontalScaleRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HorizontalScaleRequirement.canInstantiate(obj))
        	return new HorizontalScaleRequirement(obj);
        else
        	throw new IllegalArgumentException("HorizontalScaleRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2a006668-3e79-48d9-8b02-ca464df3649f")
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
    @objid ("870adb27-a843-4465-9451-6e7b70065a67")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("84da0490-a1c5-4cc9-b961-caaef12fd36c")
    public String getMaxInstances() {
        return this.elt.getTagValue(HorizontalScaleRequirement.MdaTypes.MAXINSTANCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ee4fd01f-ffcd-4fb8-9ecc-d432264cf9d4")
    public String getMinInstances() {
        return this.elt.getTagValue(HorizontalScaleRequirement.MdaTypes.MININSTANCES_TAGTYPE_ELT);
    }

    @objid ("85239a01-7754-4207-bd35-e792ffec7f22")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4b99ecc4-4b56-45e1-b321-5e15840e6467")
    public void setMaxInstances(final String value) {
        this.elt.putTagValue(HorizontalScaleRequirement.MdaTypes.MAXINSTANCES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("35bca104-9093-4d79-b50a-4878b5587bb2")
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

    @objid ("e8f43f30-a25a-4f65-89fc-55adc9bbac87")
    protected HorizontalScaleRequirement(final Class elt) {
        super(elt);
    }

    @objid ("d63fbe87-50ec-448d-8e36-aae6e8f56a3f")
    public static final class MdaTypes {
        @objid ("0fe8980b-0f1c-4dc7-812d-8df48ebeddc8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("218c26d7-3e8d-4e7b-881c-0aa57bec9249")
        public static TagType MININSTANCES_TAGTYPE_ELT;

        @objid ("e9160c11-07c8-49d6-8406-0d57c5976c3e")
        public static TagType MAXINSTANCES_TAGTYPE_ELT;

        @objid ("95b5f100-ac9b-48e4-96dc-c87aa02550df")
        private static Stereotype MDAASSOCDEP;

        @objid ("724b1269-2340-4fa2-923f-3cc3a4851df9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d8393162-1f53-41ea-b2ef-42b8f0101889")
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
