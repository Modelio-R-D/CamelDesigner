/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("73ccd960-2314-4962-9719-4fb6ba8f3e8a")
    public static final String STEREOTYPE_NAME = "ServiceResourceFilter";

    @objid ("7941d479-9ec3-41af-a881-39c6dd6669a8")
    public static final String EVERYSERVICE_TAGTYPE = "everyService";

    @objid ("12a2f091-3f36-461f-9010-330d16ce3cd8")
    public static final String SERVICEURL_TAGTYPE = "serviceURL";

    /**
     * Tells whether a {@link ServiceResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ServiceResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0eefe759-d303-4606-b85d-2f2d9bd71cbc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServiceResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ServiceResourceFilter >> then instantiate a {@link ServiceResourceFilter} proxy.
     * 
     * @return a {@link ServiceResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("bf85238b-1e6f-45a9-b3bb-1f210cde4a6b")
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
    @objid ("a1b07b60-70f8-443b-a342-9310c8d7f48e")
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
    @objid ("2f2c74e7-93a4-4ce0-b7ea-21b4ab0c57f5")
    public static ServiceResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ServiceResourceFilter.canInstantiate(obj))
        	return new ServiceResourceFilter(obj);
        else
        	throw new IllegalArgumentException("ServiceResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("beafa0f1-758c-44a5-8ff5-a32a7219cf81")
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
    @objid ("c6b53d84-b77a-4a68-adf5-0adfe76df07a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'everyService'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c110109f-8705-4d22-be1e-4e8e33095d3f")
    public String getEveryService() {
        return this.elt.getTagValue(ServiceResourceFilter.MdaTypes.EVERYSERVICE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'serviceURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("15af8efb-d8cd-452b-9aad-adda2d2bf075")
    public String getServiceURL() {
        return this.elt.getTagValue(ServiceResourceFilter.MdaTypes.SERVICEURL_TAGTYPE_ELT);
    }

    @objid ("320ec905-cbab-47b0-b0b7-f281cdbeab17")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'everyService'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("783b8572-9aeb-4adb-ba89-5b71d909e918")
    public void setEveryService(final String value) {
        this.elt.putTagValue(ServiceResourceFilter.MdaTypes.EVERYSERVICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'serviceURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ae608ab1-a040-4319-bbe8-f45e3a2823ce")
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

    @objid ("2f811afe-fb5c-42d6-8362-dd7bfa5c9a9c")
    protected ServiceResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("6e1dac0f-8361-4302-8dc4-0b2938970e17")
    public static final class MdaTypes {
        @objid ("b1f36f4c-a9cd-4132-a1ba-5bbc1c01f39a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("08968fff-c75a-44b3-975a-9ebd9b901c76")
        public static TagType SERVICEURL_TAGTYPE_ELT;

        @objid ("6c6710c8-0f4c-4077-bda6-5d308291f347")
        public static TagType EVERYSERVICE_TAGTYPE_ELT;

        @objid ("0371d8bb-34e5-4e1e-bf25-8b77ea48a330")
        private static Stereotype MDAASSOCDEP;

        @objid ("a6215fcd-5681-401c-9ef2-6566021e4b9d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d295217c-f348-4185-b81d-7062ae95a849")
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
