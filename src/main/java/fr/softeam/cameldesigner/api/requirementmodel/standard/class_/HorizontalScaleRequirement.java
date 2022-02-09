/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("39ab5d9a-e39f-4cea-aad6-139b0a517438")
    public static final String STEREOTYPE_NAME = "HorizontalScaleRequirement";

    @objid ("0f7ff7c9-b09e-4d22-a674-462cec1d6f8f")
    public static final String MAXINSTANCES_TAGTYPE = "maxInstances";

    @objid ("b0fd4652-23d0-453a-bb9d-7c325f0bce5f")
    public static final String MININSTANCES_TAGTYPE = "minInstances";

    /**
     * Tells whether a {@link HorizontalScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HorizontalScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("195a6f2e-95a7-4b1f-8c43-0ccc9b549c2e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScaleRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HorizontalScaleRequirement >> then instantiate a {@link HorizontalScaleRequirement} proxy.
     * 
     * @return a {@link HorizontalScaleRequirement} proxy on the created {@link Class}.
     */
    @objid ("330d16f7-a9cd-40a8-88d4-9368d50a84c1")
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
    @objid ("62d68341-5d24-4e12-b7ad-bba932e10e21")
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
    @objid ("4b3c221d-5d57-48ed-8770-12373fd1e821")
    public static HorizontalScaleRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HorizontalScaleRequirement.canInstantiate(obj))
        	return new HorizontalScaleRequirement(obj);
        else
        	throw new IllegalArgumentException("HorizontalScaleRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("05553770-6cea-4dda-89ba-b4fc32abbf64")
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
    @objid ("d8af56c8-43ff-48e5-a921-123e7d931b14")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("961a72cb-804b-4d39-b99c-8dfc9ca39723")
    public String getMaxInstances() {
        return this.elt.getTagValue(HorizontalScaleRequirement.MdaTypes.MAXINSTANCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6ce92614-befc-4bec-a4fc-9f4a726ec0da")
    public String getMinInstances() {
        return this.elt.getTagValue(HorizontalScaleRequirement.MdaTypes.MININSTANCES_TAGTYPE_ELT);
    }

    @objid ("6234f3ba-9bd3-4296-a316-d62e746557e9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("10331a59-5782-43b9-8b97-366a35c874a7")
    public void setMaxInstances(final String value) {
        this.elt.putTagValue(HorizontalScaleRequirement.MdaTypes.MAXINSTANCES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dd9ea922-fd22-4b36-b8f8-05c8754efb12")
    public void setMinInstances(final String value) {
        this.elt.putTagValue(HorizontalScaleRequirement.MdaTypes.MININSTANCES_TAGTYPE_ELT, value);
    }

    @objid ("de6611c4-7248-40e0-ad3b-98eb36c56401")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("d2690a7b-9bde-4d05-a4ce-ed639098d508")
    protected HorizontalScaleRequirement(final Class elt) {
        super(elt);
    }

    @objid ("d63fbe87-50ec-448d-8e36-aae6e8f56a3f")
    public static final class MdaTypes {
        @objid ("bbb749a1-eda9-488b-b52d-00d600b0a72d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1085693c-9f4e-4033-b223-f3c7c8cecc94")
        public static TagType MININSTANCES_TAGTYPE_ELT;

        @objid ("23ee5656-7f41-4f79-aa9c-bd607e67d49f")
        public static TagType MAXINSTANCES_TAGTYPE_ELT;

        @objid ("bf776791-e7bc-4bbf-8cca-70f0e82e94a7")
        private static Stereotype MDAASSOCDEP;

        @objid ("e3dd992f-6ae0-4c2d-9c43-eceea9c1768e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9a1781f2-755b-4e52-b75e-7c94823690ea")
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
