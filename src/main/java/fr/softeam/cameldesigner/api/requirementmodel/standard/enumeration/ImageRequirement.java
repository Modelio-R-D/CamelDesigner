/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("777ae80f-2a54-41f8-894e-cf477165fdd8")
    public static final String STEREOTYPE_NAME = "ImageRequirement";

    @objid ("a7b8f067-60cd-485f-9a7f-c755e5e3be11")
    public static final String IMAGES_TAGTYPE = "images";

    /**
     * Tells whether a {@link ImageRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << ImageRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("df9ce933-fe79-4501-96be-ec9bb32e8d84")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ImageRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << ImageRequirement >> then instantiate a {@link ImageRequirement} proxy.
     * 
     * @return a {@link ImageRequirement} proxy on the created {@link Enumeration}.
     */
    @objid ("37423e86-6a37-40fd-a309-b4a56ff7eb4b")
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
    @objid ("6559b685-8bdb-4ff5-8774-d2d40cb71e6c")
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
    @objid ("ba845c40-1b7d-4fca-8a70-13daaec37a8f")
    public static ImageRequirement safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (ImageRequirement.canInstantiate(obj))
        	return new ImageRequirement(obj);
        else
        	throw new IllegalArgumentException("ImageRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7efbc528-e9e2-4d9b-af77-38e6180565b7")
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
    @objid ("13ec5d0e-b35f-46d7-933e-8071bf7d8793")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Getter for List<String> property 'images'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
    @objid ("f95397ad-33ac-4e3c-9d32-27c77d791fcb")
    public List<String> getImages() {
        return this.elt.getTagValues(ImageRequirement.MdaTypes.IMAGES_TAGTYPE_ELT);
    }

    @objid ("801c3b27-e932-45df-aef5-188c465cce97")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'images'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8d1da08e-dee5-426e-8535-1e096f6c5ca5")
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

    @objid ("210d9b57-8c4b-4257-8029-f29da6791cd5")
    protected ImageRequirement(final Enumeration elt) {
        super(elt);
    }

    @objid ("092ec222-61cf-4d33-995e-dfa1dcd4853f")
    public static final class MdaTypes {
        @objid ("3d4fbd72-5209-4162-bd25-6236926f9444")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("377762c7-676f-4519-8ddd-93db5a03d59a")
        public static TagType IMAGES_TAGTYPE_ELT;

        @objid ("2924dc78-de72-4ca0-a706-c1bb89d54543")
        private static Stereotype MDAASSOCDEP;

        @objid ("ea7499d1-025f-410b-9572-eb5c8b0491ea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c20cb2f7-f773-4fd0-ab55-1eee75f08f16")
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
