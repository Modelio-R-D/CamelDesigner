/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("ee0edf8a-903a-4ebb-ba60-1c41f706c144")
    public static final String STEREOTYPE_NAME = "ImageConfiguration";

    @objid ("323163c1-b91c-408b-8845-95147499a926")
    public static final String IMAGEID_TAGTYPE = "imageId";

    /**
     * Tells whether a {@link ImageConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ImageConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("34535aec-d428-4873-b1bc-573f955f7d31")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ImageConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ImageConfiguration >> then instantiate a {@link ImageConfiguration} proxy.
     * 
     * @return a {@link ImageConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("6f08f507-d7a2-4ec7-8219-551a8b2a574c")
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
    @objid ("66b8db87-41d0-4f27-9c96-6f9999e6a0fc")
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
    @objid ("e62f1439-1c77-497d-9b2e-fa66b4759ca4")
    public static ImageConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ImageConfiguration.canInstantiate(obj))
        	return new ImageConfiguration(obj);
        else
        	throw new IllegalArgumentException("ImageConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("22c5cab7-c92a-4911-ad2c-f62f13a6e67b")
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
    @objid ("5d97e7e0-fb0e-4313-a4ae-20301a783fb2")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a584e0bf-5a4f-4e2f-aefc-70110ff0bda8")
    public String getImageId() {
        return this.elt.getTagValue(ImageConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT);
    }

    @objid ("e82c4df3-69a4-4849-8571-7cadd8eb7493")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("361ca482-79da-4b60-9b57-f2c8f06de3f7")
    public void setImageId(final String value) {
        this.elt.putTagValue(ImageConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT, value);
    }

    @objid ("6e9a6124-1423-47d8-834f-101d896fabe7")
    protected ImageConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("5ad67535-b375-43df-a0cf-c68e9322dfbb")
    public static final class MdaTypes {
        @objid ("67757c00-eca9-4e38-8bf8-aa45ed505700")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1143d187-2f43-448a-b5d8-e914eb39fe9a")
        public static TagType IMAGEID_TAGTYPE_ELT;

        @objid ("4aea25b6-9255-4edf-bf4b-7a72c830d2b6")
        private static Stereotype MDAASSOCDEP;

        @objid ("09bfea11-2d94-4cfe-9b97-ea28315efe0e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d0a790cf-e83d-4d37-873e-3f2be2c769c7")
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
