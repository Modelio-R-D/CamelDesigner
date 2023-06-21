/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("285ae226-534d-400c-b2fc-bc315dce2877")
    public static final String STEREOTYPE_NAME = "ImageConfiguration";

    @objid ("a9d959a7-bdb5-4fc5-af7d-5391c12158bb")
    public static final String IMAGEID_TAGTYPE = "imageId";

    /**
     * Tells whether a {@link ImageConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ImageConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("525065ed-dd18-4e0a-926f-cd60065dad30")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ImageConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ImageConfiguration >> then instantiate a {@link ImageConfiguration} proxy.
     * 
     * @return a {@link ImageConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("f923543f-1532-4f48-9106-9ac7b98e4bf5")
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
    @objid ("ccd189d7-a25d-42de-96b5-95b29735b788")
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
    @objid ("2e4e1992-c602-4544-87ff-6fe520e730ac")
    public static ImageConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ImageConfiguration.canInstantiate(obj))
        	return new ImageConfiguration(obj);
        else
        	throw new IllegalArgumentException("ImageConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("49f1553a-2028-4a74-95c8-7b5a2c953fc6")
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
    @objid ("286225cf-ad8a-4731-b790-60fc3f088f8d")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3b0fc295-d2f3-47bb-866d-d446fda1714c")
    public String getImageId() {
        return this.elt.getTagValue(ImageConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT);
    }

    @objid ("efa014e9-8069-41c8-b9f2-098cd8088efd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("46a968e7-10b8-40a9-af10-ebbafa8ddc99")
    public void setImageId(final String value) {
        this.elt.putTagValue(ImageConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT, value);
    }

    @objid ("79601c62-12ec-410b-bef2-b310c022c578")
    protected ImageConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("5ad67535-b375-43df-a0cf-c68e9322dfbb")
    public static final class MdaTypes {
        @objid ("691b6ef6-a0d3-46b2-9698-c77e5de6f8b6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c87af2eb-2f87-469a-9b2a-66a30f5cfbb2")
        public static TagType IMAGEID_TAGTYPE_ELT;

        @objid ("e0dbef1f-2289-46da-a83f-c925ed4bd17d")
        private static Stereotype MDAASSOCDEP;

        @objid ("3c154d99-cef3-4ced-bafa-8be021d31c93")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fc8e10ca-612f-4684-bd5b-e6f19f0eb9fe")
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
