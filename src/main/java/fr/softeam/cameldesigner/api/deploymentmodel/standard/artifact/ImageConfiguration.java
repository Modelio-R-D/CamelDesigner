/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
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
    @objid ("3dbb2221-3596-4295-ba2a-7d9475ec497b")
    public static final String STEREOTYPE_NAME = "ImageConfiguration";

    @objid ("bf5464db-19ed-4acb-b2c7-61269b868092")
    public static final String IMAGEID_TAGTYPE = "imageId";

    /**
     * Tells whether a {@link ImageConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ImageConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("24a2ba1a-efb6-4598-ab5b-1b748f4f3623")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ImageConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ImageConfiguration >> then instantiate a {@link ImageConfiguration} proxy.
     * 
     * @return a {@link ImageConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("4a6872e2-b4a9-4e14-b7c4-db375d4aa63e")
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
    @objid ("edaca916-5bc4-4daf-af4d-f90ebac471ee")
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
    @objid ("bcc04aae-595e-4cb3-9636-6f6f81ce67a7")
    public static ImageConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ImageConfiguration.canInstantiate(obj))
        	return new ImageConfiguration(obj);
        else
        	throw new IllegalArgumentException("ImageConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1b2ada56-38be-4e37-8310-7a4c8ec58182")
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
    @objid ("c628b806-df36-46a0-b5c9-61b82a089c8b")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b98fb699-2394-4866-ade7-8ccf248a9ae0")
    public String getImageId() {
        return this.elt.getTagValue(ImageConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT);
    }

    @objid ("230deca6-5810-4b82-a9b4-0fe237234da0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("751ba07d-9c4b-440f-9626-3a11a36d7e13")
    public void setImageId(final String value) {
        this.elt.putTagValue(ImageConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT, value);
    }

    @objid ("eb552ed8-a190-4803-abc6-74903f882bd6")
    protected ImageConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("5ad67535-b375-43df-a0cf-c68e9322dfbb")
    public static final class MdaTypes {
        @objid ("d02a579b-5b56-42a4-96df-a5777021fab2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("38666ad2-26b9-4997-9076-1d3c706f8c4a")
        public static TagType IMAGEID_TAGTYPE_ELT;

        @objid ("66c4c589-e1cc-424b-81bb-05eb6b17e90e")
        private static Stereotype MDAASSOCDEP;

        @objid ("88372b76-8e9f-4557-9f69-942042a56857")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7fcdd4d0-6541-4128-9b17-6b925268a4ab")
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
