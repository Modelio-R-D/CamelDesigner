/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("5f87cfc8-d1f3-417a-9a8d-58802e823b85")
    public static final String STEREOTYPE_NAME = "ImageRequirement";

    @objid ("3daf1a6c-697c-4734-ae3a-ebc5cd183c5d")
    public static final String IMAGES_TAGTYPE = "images";

    /**
     * Tells whether a {@link ImageRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << ImageRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2f7d4dfd-98fa-4b29-b9f4-4a2ae5f3f9c5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ImageRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << ImageRequirement >> then instantiate a {@link ImageRequirement} proxy.
     * 
     * @return a {@link ImageRequirement} proxy on the created {@link Enumeration}.
     */
    @objid ("d8e50caa-d5da-47d8-9073-d815b0d47034")
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
    @objid ("97bc06a7-51c6-4f67-b433-2586c23e2821")
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
    @objid ("edaa7942-127b-48f9-9143-62ac57733dba")
    public static ImageRequirement safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (ImageRequirement.canInstantiate(obj))
        	return new ImageRequirement(obj);
        else
        	throw new IllegalArgumentException("ImageRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2ecd43d0-fc13-4d1d-bbd1-1956fc84c327")
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
    @objid ("c4e90702-c2e1-4828-ac8e-d081435a0b6c")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Getter for List<String> property 'images'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
    @objid ("f7aefb39-c142-4dbb-85af-a2e68f5f7f14")
    public List<String> getImages() {
        return this.elt.getTagValues(ImageRequirement.MdaTypes.IMAGES_TAGTYPE_ELT);
    }

    @objid ("49d51120-1814-404f-a59c-83b361b2dc92")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'images'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2c5c15b1-ef2b-4214-aed6-2b3d9c25357b")
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

    @objid ("a4cacdbd-2414-4169-87ee-a46acc60c06c")
    protected ImageRequirement(final Enumeration elt) {
        super(elt);
    }

    @objid ("092ec222-61cf-4d33-995e-dfa1dcd4853f")
    public static final class MdaTypes {
        @objid ("f5080440-bfe8-4de3-bbda-345093258974")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ac098a1d-4bee-4c35-8ce4-5a11a5593c90")
        public static TagType IMAGES_TAGTYPE_ELT;

        @objid ("f31cf337-9072-4b1f-bbf1-2f214b2e3e43")
        private static Stereotype MDAASSOCDEP;

        @objid ("e2336e2f-7dd8-44ad-99f9-1d635b6617c9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d522909-0dac-4cce-86da-cd7ec7b912a8")
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
