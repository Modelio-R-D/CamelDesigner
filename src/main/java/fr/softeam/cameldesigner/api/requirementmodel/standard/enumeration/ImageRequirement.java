/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("2062c341-c916-4f1d-8f23-a634dd98d00a")
    public static final String STEREOTYPE_NAME = "ImageRequirement";

    @objid ("2a29148d-003f-4212-af33-1ceac4330349")
    public static final String IMAGES_TAGTYPE = "images";

    /**
     * Tells whether a {@link ImageRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << ImageRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e7c08d42-b0af-4989-8a40-60e692f8f9f6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ImageRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << ImageRequirement >> then instantiate a {@link ImageRequirement} proxy.
     * 
     * @return a {@link ImageRequirement} proxy on the created {@link Enumeration}.
     */
    @objid ("23192345-bf56-4efb-a431-f74a319bc1a6")
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
    @objid ("2669b7ef-1226-4f98-a68e-8f4827e3e7af")
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
    @objid ("6d4b8791-a34a-41eb-8cfe-3af7c4f03337")
    public static ImageRequirement safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (ImageRequirement.canInstantiate(obj))
        	return new ImageRequirement(obj);
        else
        	throw new IllegalArgumentException("ImageRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("afe365d7-c8e6-4bab-9f04-5724f8c6953b")
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
    @objid ("42439df8-6f76-49f9-8e1e-e49d27b4706a")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Getter for List<String> property 'images'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
    @objid ("3d627c62-41ad-4918-a1a7-0da5374710c3")
    public List<String> getImages() {
        return this.elt.getTagValues(ImageRequirement.MdaTypes.IMAGES_TAGTYPE_ELT);
    }

    @objid ("8dea2d4c-4316-439b-84a0-fe7b5031451d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'images'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2f06f442-c42a-4e25-b847-bad27d4adf7e")
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

    @objid ("c923b129-e459-4843-b86e-49e9e4b87a58")
    protected ImageRequirement(final Enumeration elt) {
        super(elt);
    }

    @objid ("092ec222-61cf-4d33-995e-dfa1dcd4853f")
    public static final class MdaTypes {
        @objid ("ae210905-c1f1-4f08-b71d-3c7e5d97e112")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1aee4db8-cbd3-436f-a590-6a85f10981a6")
        public static TagType IMAGES_TAGTYPE_ELT;

        @objid ("b680d7ed-5ddc-44c6-a8c3-dc889d7456dc")
        private static Stereotype MDAASSOCDEP;

        @objid ("554360a5-d5a0-4354-ab18-9e43145320ee")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e7fdde22-3349-4396-9f94-b24b55c5e70b")
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
