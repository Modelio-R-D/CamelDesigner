/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("924b9484-02e8-4aa9-8eac-668773b0698a")
    public static final String STEREOTYPE_NAME = "ServiceResourceFilter";

    @objid ("d63c739f-1847-49f1-bbbd-5b26d06bebaa")
    public static final String EVERYSERVICE_TAGTYPE = "everyService";

    @objid ("b8f45787-477b-4ab7-b82e-978148fcefc2")
    public static final String SERVICEURL_TAGTYPE = "serviceURL";

    /**
     * Tells whether a {@link ServiceResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ServiceResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2a734594-e1ad-4dc0-9d2c-d58d0cd81a2b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServiceResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ServiceResourceFilter >> then instantiate a {@link ServiceResourceFilter} proxy.
     * 
     * @return a {@link ServiceResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("c0f84846-5496-409e-8138-c8267ca9f098")
    public static ServiceResourceFilter create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ServiceResourceFilter.STEREOTYPE_NAME);
        return ServiceResourceFilter.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ServiceResourceFilter} proxy from a {@link Class} stereotyped << ServiceResourceFilter >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ServiceResourceFilter} proxy or <i>null</i>.
     */
    @objid ("66556a18-6b83-478c-a83d-f48d957ca7b1")
    public static ServiceResourceFilter instantiate(final Class obj) {
        return ServiceResourceFilter.canInstantiate(obj) ? new ServiceResourceFilter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ServiceResourceFilter} proxy from a {@link Class} stereotyped << ServiceResourceFilter >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ServiceResourceFilter} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e062a908-7dc4-41fe-9b5f-0c2d09aa9d51")
    public static ServiceResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ServiceResourceFilter.canInstantiate(obj))
            return new ServiceResourceFilter(obj);
        else
            throw new IllegalArgumentException("ServiceResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("01b4bd39-2311-449f-98d8-ae1f558c7e1c")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("dfe0c3e2-ebb5-4a3b-9b58-b9f68b7eba81")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'serviceURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("addc6f39-d70a-4538-9227-4eeb2c262985")
    public String getServiceURL() {
        return this.elt.getTagValue(ServiceResourceFilter.MdaTypes.SERVICEURL_TAGTYPE_ELT);
    }

    @objid ("d5fea122-0f60-4f3f-9111-c5f7d94ce1a4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'everyService'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ffaef4d4-4835-43b7-b3f0-430f1041c7c3")
    public boolean isEveryService() {
        return this.elt.isTagged(ServiceResourceFilter.MdaTypes.EVERYSERVICE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'everyService'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("824ead33-7dff-4daa-8900-436a576355ec")
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
    @objid ("75564723-3441-4450-a7c3-c18ace78fc9f")
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

    @objid ("71ca1847-d4f2-4edb-a9e3-c2b5a328f28b")
    protected ServiceResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("6e1dac0f-8361-4302-8dc4-0b2938970e17")
    public static final class MdaTypes {
        @objid ("92e98427-96df-48f2-93cd-5d578b331514")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("25163a9c-b3d1-4bf3-9506-a2375f9732d2")
        public static TagType SERVICEURL_TAGTYPE_ELT;

        @objid ("b29e1565-0d05-4642-93ae-ef8bd223eaab")
        public static TagType EVERYSERVICE_TAGTYPE_ELT;

        @objid ("0392847d-9226-4239-bd00-c384888b03c6")
        private static Stereotype MDAASSOCDEP;

        @objid ("d17a1ee7-9b1b-441a-b5e6-bf64712955b1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("524b97ff-dd73-4f44-bfc6-fddb4c16a04e")
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
