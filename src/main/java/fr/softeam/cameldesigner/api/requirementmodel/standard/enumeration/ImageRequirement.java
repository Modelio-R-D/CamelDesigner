/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("3c203b7e-c723-4e8e-baf1-e7cee03ac23a")
    public static final String STEREOTYPE_NAME = "ImageRequirement";

    @objid ("6af24c38-f30f-409f-8329-5593843da2eb")
    public static final String IMAGES_TAGTYPE = "images";

    /**
     * Tells whether a {@link ImageRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << ImageRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("15e5d96d-72e1-45a2-af88-2c4c2e1f8c3c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ImageRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << ImageRequirement >> then instantiate a {@link ImageRequirement} proxy.
     * 
     * @return a {@link ImageRequirement} proxy on the created {@link Enumeration}.
     */
    @objid ("432fb9d8-853e-4921-8716-d1273745e7a5")
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
    @objid ("fb394190-c6e4-410c-aa72-78e9545961cb")
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
    @objid ("2ea30319-db58-4697-9719-b291847141d1")
    public static ImageRequirement safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (ImageRequirement.canInstantiate(obj))
        	return new ImageRequirement(obj);
        else
        	throw new IllegalArgumentException("ImageRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7c465e31-fb2c-41f9-9224-573c1e2a5cc1")
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
    @objid ("c6e31801-1fcf-43c5-bb2c-1c7591668bf2")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Getter for List<String> property 'images'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
    @objid ("3955baa7-57c7-444c-a8e4-9a48eb91030b")
    public List<String> getImages() {
        return this.elt.getTagValues(ImageRequirement.MdaTypes.IMAGES_TAGTYPE_ELT);
    }

    @objid ("e64714af-09b1-4a88-9691-90fbe76e8f64")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'images'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7e5bef17-b610-44c7-871d-b84222558645")
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

    @objid ("a5dc1c39-427b-45e1-a671-964361b7812a")
    protected ImageRequirement(final Enumeration elt) {
        super(elt);
    }

    @objid ("092ec222-61cf-4d33-995e-dfa1dcd4853f")
    public static final class MdaTypes {
        @objid ("1c28bce1-c1e4-4081-8450-38e18f1535fa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ee3eebd7-4393-461f-a69f-7105c08f36b7")
        public static TagType IMAGES_TAGTYPE_ELT;

        @objid ("8a2737f6-2944-4434-9ccd-e2a427f828f5")
        private static Stereotype MDAASSOCDEP;

        @objid ("63991afe-2810-4eb9-9dd8-c8d952748164")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9d45dc0a-7088-4c53-bfda-69892d117a93")
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
