/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
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
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Port} with << CommunicationPort >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("25c6d854-7691-4b15-a2cb-b76b325613c6")
public class CommunicationPort extends FeaturePort {
    @objid ("65e16a4f-ef67-490b-93cd-ccb34631739c")
    public static final String STEREOTYPE_NAME = "CommunicationPort";

    @objid ("1b643d0e-2081-4cec-9b61-63233f3613e6")
    public static final String HIGHPORTNUMBER_TAGTYPE = "highPortNumber";

    @objid ("5081aec7-2ccb-48d3-b0a8-1925af7a360d")
    public static final String ISMANDATORY_TAGTYPE = "isMandatory";

    @objid ("54c07656-f827-4c4f-be23-e49e55111e2c")
    public static final String LOWPORTNUMBER_TAGTYPE = "lowPortNumber";

    /**
     * Tells whether a {@link CommunicationPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << CommunicationPort >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c438bec9-21ac-4c9f-96c1-1da4507405ea")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << CommunicationPort >> then instantiate a {@link CommunicationPort} proxy.
     * 
     * @return a {@link CommunicationPort} proxy on the created {@link Port}.
     */
    @objid ("6ec077b9-75b5-4235-8c91-4224c624f2d9")
    public static CommunicationPort create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPort.STEREOTYPE_NAME);
        return CommunicationPort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationPort} proxy from a {@link Port} stereotyped << CommunicationPort >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Port
     * @return a {@link CommunicationPort} proxy or <i>null</i>.
     */
    @objid ("5d76ce80-c9e9-4352-9f19-f525bf7430fe")
    public static CommunicationPort instantiate(final Port obj) {
        return CommunicationPort.canInstantiate(obj) ? new CommunicationPort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationPort} proxy from a {@link Port} stereotyped << CommunicationPort >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Port}
     * @return a {@link CommunicationPort} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bdb36f8a-11ae-4ebf-a5a2-565a04d8c2f7")
    public static CommunicationPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (CommunicationPort.canInstantiate(obj))
            return new CommunicationPort(obj);
        else
            throw new IllegalArgumentException("CommunicationPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a4c3572f-ae18-4b90-a5ab-ce6be888400a")
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
        CommunicationPort other = (CommunicationPort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}.
     * 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("f97d401b-4e44-4aff-b47b-a55dbb932763")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    /**
     * Getter for string property 'highPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e1fbd6f3-6554-489c-b388-d96fb1c565c3")
    public String getHighPortNumber() {
        return this.elt.getTagValue(CommunicationPort.MdaTypes.HIGHPORTNUMBER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'lowPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("64fef154-be45-4410-bdff-d50e356ca370")
    public String getLowPortNumber() {
        return this.elt.getTagValue(CommunicationPort.MdaTypes.LOWPORTNUMBER_TAGTYPE_ELT);
    }

    @objid ("b1eb275f-4847-4f2f-8244-135762bd40e6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isMandatory'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b41a8862-8226-4121-8fc8-433975a63194")
    public boolean isIsMandatory() {
        return this.elt.isTagged(CommunicationPort.MdaTypes.ISMANDATORY_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'highPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("22e8e2de-a6e9-4afa-9c09-1924e2ad410c")
    public void setHighPortNumber(final String value) {
        this.elt.putTagValue(CommunicationPort.MdaTypes.HIGHPORTNUMBER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'isMandatory'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("807b57ae-0476-4865-b306-7fae4e9ac270")
    public void setIsMandatory(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CommunicationPort.MdaTypes.ISMANDATORY_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CommunicationPort.MdaTypes.ISMANDATORY_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'lowPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6937575e-5af8-45f9-9012-b84984298785")
    public void setLowPortNumber(final String value) {
        this.elt.putTagValue(CommunicationPort.MdaTypes.LOWPORTNUMBER_TAGTYPE_ELT, value);
    }

    @objid ("3ad6d9ad-f788-42a3-93b0-9c8d3b59586f")
    protected CommunicationPort(final Port elt) {
        super(elt);
    }

    @objid ("4372cf5a-f8d4-4bb8-ad18-085c5dd70583")
    public static final class MdaTypes {
        @objid ("97b5a7ed-0960-4c57-ab9c-936e2475373c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5bc833e0-7447-4b23-97ec-019d0a414b6f")
        public static TagType LOWPORTNUMBER_TAGTYPE_ELT;

        @objid ("825d8d6e-92f1-4de7-86df-50bb53cf8719")
        public static TagType HIGHPORTNUMBER_TAGTYPE_ELT;

        @objid ("da09d25f-dd34-4b35-95da-a2d54cb752a6")
        public static TagType ISMANDATORY_TAGTYPE_ELT;

        @objid ("740f7a04-587e-4ccb-b5e2-d9a0784028b8")
        private static Stereotype MDAASSOCDEP;

        @objid ("22dc33c5-2a77-40d9-b671-00952e8515cd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("357bc333-2bb3-4ac6-ba40-e35d5fca0769")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c3c6e0a4-b112-4a00-9c2f-964e3093c423");
            LOWPORTNUMBER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6a5677a8-e95a-48ca-9d2c-17c3eb64fb84");
            HIGHPORTNUMBER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4ea4c624-90ec-4d17-bed6-7bbba5114296");
            ISMANDATORY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db6301a8-58c7-4502-a816-681c606c13cf");
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
