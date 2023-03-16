/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << ImageConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("82c11738-5187-43e6-abdf-7b4bb3893339")
public class ImageConfiguration extends Configuration {
    @objid ("c66739e8-262e-4eab-91ef-4ad6595ff51b")
    public static final String STEREOTYPE_NAME = "ImageConfiguration";

    @objid ("09638067-bb8d-42d4-8287-931fb4df9a4f")
    public static final String IMAGEID_TAGTYPE = "imageId";

    /**
     * Tells whether a {@link ImageConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ImageConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("63f4db60-ad48-45d7-8c84-6fd11f0f17fa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ImageConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ImageConfiguration >> then instantiate a {@link ImageConfiguration} proxy.
     * 
     * @return a {@link ImageConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("beab43b2-de36-41a8-aed5-f7b2be21ea60")
    public static ImageConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ImageConfiguration.STEREOTYPE_NAME);
        return ImageConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link ImageConfiguration} proxy from a {@link Artifact} stereotyped << ImageConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link ImageConfiguration} proxy or <i>null</i>.
     */
    @objid ("0a22e8ed-1e8e-4689-b6cc-47039b0cd2ab")
    public static ImageConfiguration instantiate(final Artifact obj) {
        return ImageConfiguration.canInstantiate(obj) ? new ImageConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ImageConfiguration} proxy from a {@link Artifact} stereotyped << ImageConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link ImageConfiguration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("100a6a91-91ca-41ef-ac12-6ebaa8c594ca")
    public static ImageConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ImageConfiguration.canInstantiate(obj))
        	return new ImageConfiguration(obj);
        else
        	throw new IllegalArgumentException("ImageConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("67fecb55-6393-4808-b5b2-229dbbb53984")
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
        ImageConfiguration other = (ImageConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("bf8a3f95-fc2f-4303-a85c-5ee9f99591c3")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aeffd204-f662-4e47-9d1b-1bab246e4d47")
    public String getImageId() {
        return this.elt.getTagValue(ImageConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT);
    }

    @objid ("b78e3e91-6cbb-4e56-90da-015512a9c962")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("37445dd0-5d91-46a8-a0fb-374115fc39e9")
    public void setImageId(final String value) {
        this.elt.putTagValue(ImageConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT, value);
    }

    @objid ("ff978c21-acae-46a9-81d9-1ced58771971")
    protected ImageConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("5ad67535-b375-43df-a0cf-c68e9322dfbb")
    public static final class MdaTypes {
        @objid ("98e650cf-bfb8-4b63-bde8-8b04834711fe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("afb3bcd6-9b25-4fcb-a7e5-35b9070bc5bf")
        public static TagType IMAGEID_TAGTYPE_ELT;

        @objid ("936db0c6-f786-494b-bd35-78c8cb98e5a4")
        private static Stereotype MDAASSOCDEP;

        @objid ("9e41d464-3965-4b80-b2c2-dcfdde3f03d5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0bbbb58b-27c8-4cba-956b-68e1f290e236")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9d1d3479-da13-4330-b60e-b43e96415c48");
            IMAGEID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "62b358eb-ce0c-4c71-9a18-d959cb6840b6");
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
