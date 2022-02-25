/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("8ba58686-382e-4272-8a2d-c1a48fc68ed1")
    public static final String STEREOTYPE_NAME = "ServiceResourceFilter";

    @objid ("006456e7-40eb-47d8-8747-3f7541808e13")
    public static final String EVERYSERVICE_TAGTYPE = "everyService";

    @objid ("1d172ca6-9f24-45f2-aabc-c1ab520cfd74")
    public static final String SERVICEURL_TAGTYPE = "serviceURL";

    /**
     * Tells whether a {@link ServiceResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ServiceResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7c595327-4796-4c31-ad7c-f5703952de0a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServiceResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ServiceResourceFilter >> then instantiate a {@link ServiceResourceFilter} proxy.
     * 
     * @return a {@link ServiceResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("8ccc3257-ca1d-4bf3-b618-ec2e2c99eae2")
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
    @objid ("dc90134c-149a-4ef3-8faf-4ce80ff4fc39")
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
    @objid ("2f7fbc04-3bbb-4ad4-8ac1-89b9031428a4")
    public static ServiceResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ServiceResourceFilter.canInstantiate(obj))
        	return new ServiceResourceFilter(obj);
        else
        	throw new IllegalArgumentException("ServiceResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b63b2084-d200-42f3-8786-8c6c138f21da")
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
    @objid ("31dd8a38-7279-4c3a-88c5-1aba49cf0a4b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'everyService'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4334753d-9aa0-4d16-a43a-1056b417ef8b")
    public String getEveryService() {
        return this.elt.getTagValue(ServiceResourceFilter.MdaTypes.EVERYSERVICE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'serviceURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d02d7ff5-e220-4033-b21e-3786845aebf5")
    public String getServiceURL() {
        return this.elt.getTagValue(ServiceResourceFilter.MdaTypes.SERVICEURL_TAGTYPE_ELT);
    }

    @objid ("7ffa9266-d25f-43a5-bb84-0ef11783ceb7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'everyService'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d0ec6f89-6ed5-40f8-82bc-441520798822")
    public void setEveryService(final String value) {
        this.elt.putTagValue(ServiceResourceFilter.MdaTypes.EVERYSERVICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'serviceURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4a4381a6-f76e-44ae-98df-5b09136f59a5")
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

    @objid ("2c6777a3-4076-4c5e-b341-01c55f6fca9b")
    protected ServiceResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("6e1dac0f-8361-4302-8dc4-0b2938970e17")
    public static final class MdaTypes {
        @objid ("860c3ead-0be6-4076-a364-c2d5b86a1b7a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("32458837-8bba-4d24-a7ba-1757c4b02d58")
        public static TagType SERVICEURL_TAGTYPE_ELT;

        @objid ("87756d2a-c78f-45cb-85db-f2ba97cb029f")
        public static TagType EVERYSERVICE_TAGTYPE_ELT;

        @objid ("675a47ea-0d46-4469-94d6-48fa34ff61c9")
        private static Stereotype MDAASSOCDEP;

        @objid ("93ae26e1-1ef6-43ca-bd84-9d56428767a1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("57e6ea74-8d4b-4d4a-9a2b-c5f88b726a56")
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
