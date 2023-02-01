/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
 * Proxy class to handle a {@link Class} with << ServiceResourceFilter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e74e8963-d51d-4407-92a7-54bf8fb74b46")
public class ServiceResourceFilter extends ResourceFilter {
<<<<<<< HEAD
    @objid ("b8cdc6d2-679c-4316-9a1c-9b4b31d861b4")
    public static final String STEREOTYPE_NAME = "ServiceResourceFilter";

    @objid ("40c31791-0f94-469a-9256-ee9973665076")
    public static final String EVERYSERVICE_TAGTYPE = "everyService";

    @objid ("8b07ba47-afe5-49c0-b8c6-399d5eb9c58d")
=======
    @objid ("c96239f6-c6f0-4ab4-9f30-c9dd4ec9a09a")
    public static final String STEREOTYPE_NAME = "ServiceResourceFilter";

    @objid ("11cda103-a4a4-4dd5-a8c2-122ac6f6be99")
    public static final String EVERYSERVICE_TAGTYPE = "everyService";

    @objid ("84abf272-041d-4696-8124-b56602f69bd2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String SERVICEURL_TAGTYPE = "serviceURL";

    /**
     * Tells whether a {@link ServiceResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ServiceResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("c1d8c1a6-b511-4013-b2da-4257796e21b0")
=======
    @objid ("0378ffe5-72a8-4b7e-a1b0-db6fc0d1e5eb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServiceResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ServiceResourceFilter >> then instantiate a {@link ServiceResourceFilter} proxy.
     * 
     * @return a {@link ServiceResourceFilter} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("adc58100-20c4-485c-9ff7-afe32a045a17")
=======
    @objid ("7479def7-ab76-4358-a386-e07967baef73")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ServiceResourceFilter create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ServiceResourceFilter.STEREOTYPE_NAME);
        return ServiceResourceFilter.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ServiceResourceFilter} proxy from a {@link Class} stereotyped << ServiceResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ServiceResourceFilter} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("f94b45e2-515a-49f3-ba8b-3d681672b521")
=======
    @objid ("9a118c8a-59b7-46a1-bddf-a3492aaf87a9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ServiceResourceFilter instantiate(final Class obj) {
        return ServiceResourceFilter.canInstantiate(obj) ? new ServiceResourceFilter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ServiceResourceFilter} proxy from a {@link Class} stereotyped << ServiceResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ServiceResourceFilter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("c9627e60-b7b2-40eb-be1f-08e7b4556017")
=======
    @objid ("780e3b1e-e5cf-460c-b0e6-b357171f92e7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ServiceResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ServiceResourceFilter.canInstantiate(obj))
        	return new ServiceResourceFilter(obj);
        else
        	throw new IllegalArgumentException("ServiceResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("ef2c1e28-c1b5-4768-a3b7-ea6de0a4c11c")
=======
    @objid ("a66221a7-e6af-47d6-a796-866fe76b2296")
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
        ServiceResourceFilter other = (ServiceResourceFilter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("a766544c-2151-4364-8657-91d0134ccc44")
=======
    @objid ("2f3ef70e-6dc8-435b-aee5-87bcfea33ae8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'serviceURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("105c12f2-7bad-4e49-8dae-8f6b3f09d615")
=======
    @objid ("852ca037-e485-49a8-bd30-33a2feaddc78")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getServiceURL() {
        return this.elt.getTagValue(ServiceResourceFilter.MdaTypes.SERVICEURL_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("8009b849-1bee-424e-a089-0f5ad701ab33")
=======
    @objid ("6cdfc528-e33d-4a70-97c6-f861285dc295")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'everyService'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("327d4e62-561e-416a-87d3-2dd9f1490815")
=======
    @objid ("0d3004ac-b6f9-405c-a458-8d5c6cfebef0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isEveryService() {
        return this.elt.isTagged(ServiceResourceFilter.MdaTypes.EVERYSERVICE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'everyService'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("c59dd58b-13e5-457e-a4df-61f36c5bb3ae")
=======
    @objid ("0b6f65e7-1bba-4925-bffd-e06c7ba796a2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setEveryService(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ServiceResourceFilter.MdaTypes.EVERYSERVICE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ServiceResourceFilter.MdaTypes.EVERYSERVICE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'serviceURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("3ef26b3b-6e0d-44b2-9ddd-77e0055d3857")
=======
    @objid ("53d6b68d-8a1e-4dfd-91b2-cf06906f2a72")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setServiceURL(final String value) {
        this.elt.putTagValue(ServiceResourceFilter.MdaTypes.SERVICEURL_TAGTYPE_ELT, value);
    }

    @objid ("38875f4b-aa00-4771-959d-ab356938149c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("4829cc24-42d7-41eb-a92c-0d4247c2186d")
=======
    @objid ("af85afeb-7d79-494e-8bab-62b527788432")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ServiceResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("6e1dac0f-8361-4302-8dc4-0b2938970e17")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("eeafb163-3ecc-41cb-a6bf-b2a54426d80e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("44b59836-d64d-4029-a383-022f1ff5a620")
        public static TagType SERVICEURL_TAGTYPE_ELT;

        @objid ("cb524a9f-847b-46e4-8fc2-f56c66c26839")
        public static TagType EVERYSERVICE_TAGTYPE_ELT;

        @objid ("579e9c88-5ac7-4519-895b-6c77b23864d1")
        private static Stereotype MDAASSOCDEP;

        @objid ("595c783a-a463-4c50-b3a2-d8ad5533911c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e77f672d-2f09-4374-8f51-3ad98f4b6084")
=======
        @objid ("000900ce-9a8b-4b12-a86b-d66d9af31274")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3118c8c5-4cb4-4c8b-981f-820bd5f3bb1c")
        public static TagType SERVICEURL_TAGTYPE_ELT;

        @objid ("21126093-235a-4b6f-b082-48f851546797")
        public static TagType EVERYSERVICE_TAGTYPE_ELT;

        @objid ("e85ea0d7-ecd6-4862-91b3-5d7e7ad6bbca")
        private static Stereotype MDAASSOCDEP;

        @objid ("82fb9235-0c3d-4324-96d6-f7198e5af230")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e6d53e18-828c-4d0e-9db1-86a27f3a6530")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0012ff53-c300-4f0c-bdce-8583f97e3236");
            SERVICEURL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b4c10c8-5621-4bb6-aa2e-3f00deea0d5e");
            EVERYSERVICE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a2aaca30-b509-469a-b65c-99a30cd09e16");
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
