/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6b8e0d2a-6d81-409e-926e-83bda8f2ec10")
    public static final String STEREOTYPE_NAME = "HorizontalScaleRequirement";

    @objid ("74dfec67-0fce-4de6-b0e9-641a612c345a")
    public static final String MAXINSTANCES_TAGTYPE = "maxInstances";

    @objid ("b1301dee-4294-43c6-b86e-0625af4ca8fb")
=======
    @objid ("101aefc0-8e4e-4f64-94fc-9b77cd5cb774")
    public static final String STEREOTYPE_NAME = "HorizontalScaleRequirement";

    @objid ("884128f5-89e1-4f0a-bc70-15da976e3b76")
    public static final String MAXINSTANCES_TAGTYPE = "maxInstances";

    @objid ("7f1010a2-a475-4f97-ad0d-837fbbaaa40a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String MININSTANCES_TAGTYPE = "minInstances";

    /**
     * Tells whether a {@link HorizontalScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HorizontalScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("5abee475-bad9-4db6-97e7-9a8928371f54")
=======
    @objid ("c6905b2a-6b01-4c93-a309-3584f165d266")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScaleRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HorizontalScaleRequirement >> then instantiate a {@link HorizontalScaleRequirement} proxy.
     * 
     * @return a {@link HorizontalScaleRequirement} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("e3683a29-cc06-4695-ae78-25d3a12e830f")
=======
    @objid ("cb4062c7-41a5-4b43-9800-a8827a4c7f46")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d4ca76aa-81f7-4863-b44d-d4ce41d3971f")
=======
    @objid ("3ca96f0c-e1c2-41c6-a7a0-2cadee1a9d5f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f6102655-b466-4aad-ba05-d6df58ea1f05")
=======
    @objid ("2d381c06-bd80-477c-9708-c0d01e38a571")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HorizontalScaleRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HorizontalScaleRequirement.canInstantiate(obj))
        	return new HorizontalScaleRequirement(obj);
        else
        	throw new IllegalArgumentException("HorizontalScaleRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("a20074b2-5198-482d-8c2a-62d7feb13e7e")
=======
    @objid ("1131cbae-8d75-43a0-9f7b-36661f521978")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("71b0b2b9-3cb8-4190-93ce-40e6ebfe7e13")
=======
    @objid ("e8271384-e205-430e-a8b4-28d04169476d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("16016da3-67b7-47b7-80a3-b02857af79b0")
=======
    @objid ("0b8a72a9-481a-4441-a6b4-6787a6df5b41")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getMaxInstances() {
        return this.elt.getTagValue(HorizontalScaleRequirement.MdaTypes.MAXINSTANCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("610cd0e6-fea9-4c6c-b271-7b5cedc84e1e")
=======
    @objid ("06ec8df6-c821-45bd-92e1-4fa64af8eb86")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getMinInstances() {
        return this.elt.getTagValue(HorizontalScaleRequirement.MdaTypes.MININSTANCES_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("9fba9782-0370-47bd-8914-1a62402a09db")
=======
    @objid ("0b873242-22dc-4b26-9dc7-49199880a1d2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("a09a2afc-7d62-42dc-ab1b-96160ec39119")
=======
    @objid ("89486375-d574-46cb-afbf-4de1d3a2f2bc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setMaxInstances(final String value) {
        this.elt.putTagValue(HorizontalScaleRequirement.MdaTypes.MAXINSTANCES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("588104ae-178a-43d8-ac41-829cf2067896")
=======
    @objid ("6e52eb84-9af8-409b-92de-187dce38a92f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("92390eb4-5c98-456f-95de-0764fc421843")
=======
    @objid ("c0c759f1-d363-4baa-8126-4144f702c056")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected HorizontalScaleRequirement(final Class elt) {
        super(elt);
    }

    @objid ("d63fbe87-50ec-448d-8e36-aae6e8f56a3f")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("10074a06-7833-4c1e-b178-c1cc27923426")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f16daf13-e28e-4972-8b61-ac43bc5dbc1f")
        public static TagType MININSTANCES_TAGTYPE_ELT;

        @objid ("adb8dd1a-9bdc-4954-b767-5fcdcd1daddc")
        public static TagType MAXINSTANCES_TAGTYPE_ELT;

        @objid ("9f639f8f-1a9e-4c97-97e6-779ab7f25fb5")
        private static Stereotype MDAASSOCDEP;

        @objid ("a86fcac0-8206-4c9f-a810-d52cd1f7a6e8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e22cc15a-3357-4daa-997e-5b2a27c4d4d9")
=======
        @objid ("2c21d92b-97d9-4422-acc8-ae249bc42201")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7d1b2b60-4231-4631-a8e9-de53d1adef07")
        public static TagType MININSTANCES_TAGTYPE_ELT;

        @objid ("d0c2b1f8-e4e5-44e9-a2f2-c3f3658d5c8b")
        public static TagType MAXINSTANCES_TAGTYPE_ELT;

        @objid ("bc1f85dd-ff74-4904-bb4d-846f59a6dde0")
        private static Stereotype MDAASSOCDEP;

        @objid ("4768469b-9298-42dc-b9e6-71b094922e53")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f2c4192b-5e33-4808-8749-6ba0e7eb1b15")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
