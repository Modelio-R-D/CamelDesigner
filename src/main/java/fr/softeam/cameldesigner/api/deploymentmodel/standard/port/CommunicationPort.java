/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
    @objid ("b2b7b39d-8b7b-416f-9a0d-dde4f0bab48a")
    public static final String STEREOTYPE_NAME = "CommunicationPort";

    @objid ("6a3c8758-a4a7-487a-9622-25ec4c6ab274")
    public static final String HIGHPORTNUMBER_TAGTYPE = "highPortNumber";

    @objid ("d36dcf58-d96e-49ed-a1de-c7376b75aa2e")
    public static final String ISMANDATORY_TAGTYPE = "isMandatory";

    @objid ("e910d562-2332-4761-b18c-f55fa572b08b")
    public static final String LOWPORTNUMBER_TAGTYPE = "lowPortNumber";

    /**
     * Tells whether a {@link CommunicationPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << CommunicationPort >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("11ea799e-bbe3-4155-aea0-ec1c586b8b48")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << CommunicationPort >> then instantiate a {@link CommunicationPort} proxy.
     * 
     * @return a {@link CommunicationPort} proxy on the created {@link Port}.
     */
    @objid ("ab4a2236-8fe2-4a9c-8b21-44d96c49ae1d")
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
    @objid ("9aa3f3ba-1328-4d16-bf26-7b3d0ddad9da")
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
    @objid ("ea64f777-23c9-4f9e-aec7-fab6adb67a30")
    public static CommunicationPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (CommunicationPort.canInstantiate(obj))
            return new CommunicationPort(obj);
        else
            throw new IllegalArgumentException("CommunicationPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("69f6b70a-769f-46d3-9361-86f3fec2c292")
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
    @objid ("37ff29e2-1734-48ed-92f6-4eb37391911a")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    /**
     * Getter for string property 'highPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("390904a6-ed3b-45c3-bc10-160f22dc7101")
    public String getHighPortNumber() {
        return this.elt.getTagValue(CommunicationPort.MdaTypes.HIGHPORTNUMBER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'lowPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("83d3ceb4-f386-41e9-b1c9-4d1dfa3e135a")
    public String getLowPortNumber() {
        return this.elt.getTagValue(CommunicationPort.MdaTypes.LOWPORTNUMBER_TAGTYPE_ELT);
    }

    @objid ("06d86da3-3b67-4281-b0ae-47696f45139b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isMandatory'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b9c2ae89-d175-45f1-afc9-26f841f3b8f4")
    public boolean isIsMandatory() {
        return this.elt.isTagged(CommunicationPort.MdaTypes.ISMANDATORY_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'highPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("207ac91a-4e88-4ebb-aba9-513662d30830")
    public void setHighPortNumber(final String value) {
        this.elt.putTagValue(CommunicationPort.MdaTypes.HIGHPORTNUMBER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'isMandatory'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("322e8926-4d62-488c-a9f2-aa3f94faa344")
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
    @objid ("a5d0718e-b8ad-4ce1-89bb-b6de254848cc")
    public void setLowPortNumber(final String value) {
        this.elt.putTagValue(CommunicationPort.MdaTypes.LOWPORTNUMBER_TAGTYPE_ELT, value);
    }

    @objid ("b7468ea3-d802-4a84-8e99-a44e50d9fe37")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c6248ee4-2417-44da-a38d-d9420324f066")
    protected CommunicationPort(final Port elt) {
        super(elt);
    }

    @objid ("4372cf5a-f8d4-4bb8-ad18-085c5dd70583")
    public static final class MdaTypes {
        @objid ("8f0577b0-32eb-4928-8902-48f01050f503")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c8c814fe-d3fe-44a0-bb2f-3abad1e883a9")
        public static TagType LOWPORTNUMBER_TAGTYPE_ELT;

        @objid ("f5015a1d-7e9d-4afe-b9c9-e9c59b759645")
        public static TagType HIGHPORTNUMBER_TAGTYPE_ELT;

        @objid ("f6deeac9-908f-4955-b718-faca67471596")
        public static TagType ISMANDATORY_TAGTYPE_ELT;

        @objid ("0ecc3aad-5d75-4541-8947-904b3be3736c")
        private static Stereotype MDAASSOCDEP;

        @objid ("bade3596-40cf-48b6-aa3d-cddf3fbe833a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7c232e55-015d-4b7b-9d25-52769569b0bf")
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
