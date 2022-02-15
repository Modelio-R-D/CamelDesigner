/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
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
    @objid ("3009d8b9-3c32-4a63-a4cc-67f2baebb54a")
    public static final String STEREOTYPE_NAME = "HorizontalScaleRequirement";

    @objid ("d9e538ef-b293-4da1-833a-5c329ef3bbfb")
    public static final String MAXINSTANCES_TAGTYPE = "maxInstances";

    @objid ("eca7d96a-9644-4a9f-af3e-626c14060046")
    public static final String MININSTANCES_TAGTYPE = "minInstances";

    /**
     * Tells whether a {@link HorizontalScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HorizontalScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d4088f68-949e-45d7-9b25-b14861959230")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScaleRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HorizontalScaleRequirement >> then instantiate a {@link HorizontalScaleRequirement} proxy.
     * 
     * @return a {@link HorizontalScaleRequirement} proxy on the created {@link Class}.
     */
    @objid ("876e729f-92eb-4bbe-a41e-e4b7e36f79cd")
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
    @objid ("8c188f96-70d8-41b6-8687-289dc26a1067")
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
    @objid ("b78e1caa-d484-49ef-82dd-f33207a0eeae")
    public static HorizontalScaleRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HorizontalScaleRequirement.canInstantiate(obj))
        	return new HorizontalScaleRequirement(obj);
        else
        	throw new IllegalArgumentException("HorizontalScaleRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cc7a1a2a-a7f8-4e45-9096-4e07613fca80")
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
    @objid ("fd102443-f498-4085-8690-3406fa3c44d0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("54fff29c-0836-46c8-8db6-d422d244755d")
    public String getMaxInstances() {
        return this.elt.getTagValue(HorizontalScaleRequirement.MdaTypes.MAXINSTANCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9a6f6825-089d-46c1-ad3b-8ee45aca5f98")
    public String getMinInstances() {
        return this.elt.getTagValue(HorizontalScaleRequirement.MdaTypes.MININSTANCES_TAGTYPE_ELT);
    }

    @objid ("ffc5f929-1647-4754-bb63-784474b38805")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1f5120d2-8d8f-47c3-a90e-25d5f0aa4a13")
    public void setMaxInstances(final String value) {
        this.elt.putTagValue(HorizontalScaleRequirement.MdaTypes.MAXINSTANCES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aaeff43c-39e6-4914-b46e-e63f03f79f46")
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

    @objid ("72e4b1dd-9539-45a2-b6cf-2ccd7cf85482")
    protected HorizontalScaleRequirement(final Class elt) {
        super(elt);
    }

    @objid ("d63fbe87-50ec-448d-8e36-aae6e8f56a3f")
    public static final class MdaTypes {
        @objid ("57b43990-0cfc-4ac1-8306-85f7521e9599")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9ab8356b-96b0-49ac-8869-0be78fe9b14f")
        public static TagType MININSTANCES_TAGTYPE_ELT;

        @objid ("9244ebd6-39b1-4277-8f8c-48b3d6a74802")
        public static TagType MAXINSTANCES_TAGTYPE_ELT;

        @objid ("331633ce-f267-48e9-8c99-fe10fd701425")
        private static Stereotype MDAASSOCDEP;

        @objid ("c1322f4d-d504-407f-ac7a-7f10e2fca2a8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ae943eba-1afb-41b8-9661-dfb802a05f6f")
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
