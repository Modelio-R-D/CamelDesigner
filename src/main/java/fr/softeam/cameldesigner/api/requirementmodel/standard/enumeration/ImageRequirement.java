/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
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
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Enumeration} with << ImageRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c80e5eab-6c61-4c19-bf8f-86c5aa2a419d")
public class ImageRequirement extends HardRequirement {
<<<<<<< HEAD
    @objid ("89527bc1-4a06-428b-9bba-a8f2b1ce61a2")
    public static final String STEREOTYPE_NAME = "ImageRequirement";

    @objid ("3c192bcb-7ef8-4825-92b0-dab1b3290e39")
=======
    @objid ("0210d6d7-357c-4670-bdd2-e3380abf5da6")
    public static final String STEREOTYPE_NAME = "ImageRequirement";

    @objid ("829aba81-0269-4ffb-8d0c-2aa4095ff606")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String IMAGES_TAGTYPE = "images";

    /**
     * Tells whether a {@link ImageRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << ImageRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("c30df20e-375e-4984-82a9-ae51432f22b6")
=======
    @objid ("150b52f8-3350-4e3f-8887-a45c3c8a44c8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ImageRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << ImageRequirement >> then instantiate a {@link ImageRequirement} proxy.
     * 
     * @return a {@link ImageRequirement} proxy on the created {@link Enumeration}.
     */
<<<<<<< HEAD
    @objid ("9724d66b-c916-4f6a-a74b-7fe99006285f")
=======
    @objid ("2c0899f9-b30f-41f1-8698-9139aa30901c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ImageRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Enumeration");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ImageRequirement.STEREOTYPE_NAME);
        return ImageRequirement.instantiate((Enumeration)e);
    }

    /**
     * Tries to instantiate a {@link ImageRequirement} proxy from a {@link Enumeration} stereotyped << ImageRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Enumeration
     * @return a {@link ImageRequirement} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("54332ff0-724a-4b18-a07d-70ca925bdfb3")
=======
    @objid ("f9ae3835-0cd8-4325-a641-c15e4c894166")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ImageRequirement instantiate(final Enumeration obj) {
        return ImageRequirement.canInstantiate(obj) ? new ImageRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ImageRequirement} proxy from a {@link Enumeration} stereotyped << ImageRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Enumeration}
     * @return a {@link ImageRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("18315a68-fbcb-455a-92f5-3b6c758a79a9")
=======
    @objid ("71567f1c-c074-4de1-87a9-9437a1f8adad")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ImageRequirement safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (ImageRequirement.canInstantiate(obj))
        	return new ImageRequirement(obj);
        else
        	throw new IllegalArgumentException("ImageRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("2a1beade-4b9a-4e03-a7ad-e78d40664487")
=======
    @objid ("5d40e6b0-d218-4210-9d91-46553e625908")
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
        ImageRequirement other = (ImageRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Enumeration}. 
     * @return the Enumeration represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("334f77bf-ba75-4ac8-bf76-88eb11796315")
=======
    @objid ("83339ff9-0384-4970-b146-d9698d73e95d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Getter for List<String> property 'images'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("a690a20f-1454-4815-b853-6a600c475a1d")
=======
    @objid ("79acca8d-a6fd-4768-8ede-82ca4227f94c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<String> getImages() {
        return this.elt.getTagValues(ImageRequirement.MdaTypes.IMAGES_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("2345dbda-6ca5-4328-abd3-7bbdca7a156a")
=======
    @objid ("9da34121-47bb-45d3-bdbc-0c57a69853ac")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'images'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("e070e202-8450-48cb-8f75-fb40219225aa")
=======
    @objid ("19ef9357-13cb-4c4f-88f1-0e86ccac06b4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setImages(final List<String> values) {
        this.elt.putTagValues(ImageRequirement.MdaTypes.IMAGES_TAGTYPE_ELT, values);
    }

    @objid ("b296ed0a-80e7-4136-8cec-94258ea30c5a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("912ab484-a97a-4ee9-925a-5dc89ddae00a")
=======
    @objid ("380445e4-c779-4187-ad11-17738dcba8f3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ImageRequirement(final Enumeration elt) {
        super(elt);
    }

    @objid ("092ec222-61cf-4d33-995e-dfa1dcd4853f")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("6349293a-c4d7-4df3-ba9e-2061b2e61998")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0990f5d9-2dd4-403d-bac2-191fbd59a06c")
        public static TagType IMAGES_TAGTYPE_ELT;

        @objid ("1853993b-47a0-49e9-adf0-3da2849d8b1f")
        private static Stereotype MDAASSOCDEP;

        @objid ("9f578609-3061-4312-9704-d684b241ca5f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2cc667ab-1d70-4f1d-8886-5c986eb22121")
=======
        @objid ("ac34a862-f24e-4ad7-b29c-39d9d0677b86")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("45341e5b-338b-4b23-b504-ade810267d33")
        public static TagType IMAGES_TAGTYPE_ELT;

        @objid ("9251a157-cca2-4640-9bdd-dffb873cc611")
        private static Stereotype MDAASSOCDEP;

        @objid ("0686dd2b-879e-441e-9b41-c1811fb83aec")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c253931-91c9-4851-ad73-e38d7848172f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aed9a95b-2f53-42b5-ad97-3a39f0ee4d60");
            IMAGES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "15d9a370-393a-428c-8331-c15664b99f13");
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
