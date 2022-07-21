/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("2880ab09-4828-4f97-ab3f-7b6dc8fcd0a5")
    public static final String STEREOTYPE_NAME = "CommunicationPort";

    @objid ("afd40b0e-4352-4440-a966-28a5d71cb640")
    public static final String HIGHPORTNUMBER_TAGTYPE = "highPortNumber";

    @objid ("b5f84454-e484-4de3-a43a-02386031e08f")
    public static final String ISMANDATORY_TAGTYPE = "isMandatory";

    @objid ("31b9be63-448e-4448-b2f5-b9c1d12a75d1")
    public static final String LOWPORTNUMBER_TAGTYPE = "lowPortNumber";

    /**
     * Tells whether a {@link CommunicationPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << CommunicationPort >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("65146614-a136-4830-a81e-1bbe0bdb955f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << CommunicationPort >> then instantiate a {@link CommunicationPort} proxy.
     * 
     * @return a {@link CommunicationPort} proxy on the created {@link Port}.
     */
    @objid ("949d8926-7f24-47b0-b9c0-aa96b1e98681")
    public static CommunicationPort create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPort.STEREOTYPE_NAME);
        return CommunicationPort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationPort} proxy from a {@link Port} stereotyped << CommunicationPort >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link CommunicationPort} proxy or <i>null</i>.
     */
    @objid ("32a3e982-b9a2-417f-b1ed-17104e97c245")
    public static CommunicationPort instantiate(final Port obj) {
        return CommunicationPort.canInstantiate(obj) ? new CommunicationPort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationPort} proxy from a {@link Port} stereotyped << CommunicationPort >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link CommunicationPort} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5333b09c-e766-40c8-bfbd-4b888b8b69d3")
    public static CommunicationPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (CommunicationPort.canInstantiate(obj))
        	return new CommunicationPort(obj);
        else
        	throw new IllegalArgumentException("CommunicationPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a092e6b4-7c64-425f-a01e-34f38d7f3889")
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
     * @return the Port represented by this proxy, never null.
     */
    @objid ("b4785aa9-0c14-4ff1-b32a-dad022c920bb")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    /**
     * Getter for string property 'highPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("69afebe4-3931-4f7f-a665-56e32dbb8c07")
    public String getHighPortNumber() {
        return this.elt.getTagValue(CommunicationPort.MdaTypes.HIGHPORTNUMBER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'lowPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7cf75b31-515f-4d04-8344-1de9e9e9bc76")
    public String getLowPortNumber() {
        return this.elt.getTagValue(CommunicationPort.MdaTypes.LOWPORTNUMBER_TAGTYPE_ELT);
    }

    @objid ("9e26b58b-8981-496b-b6db-173b05bfface")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isMandatory'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6e97f29f-1960-45ac-adc7-3037d510b888")
    public boolean isIsMandatory() {
        return this.elt.isTagged(CommunicationPort.MdaTypes.ISMANDATORY_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'highPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eeff5c4f-4470-4f2f-ae82-58fe2acd88e8")
    public void setHighPortNumber(final String value) {
        this.elt.putTagValue(CommunicationPort.MdaTypes.HIGHPORTNUMBER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'isMandatory'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7b3267be-f269-4b5d-bc00-6340ce33d322")
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
    @objid ("f8345e59-5e1a-44ad-865c-1b799ee62148")
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

    @objid ("995e3053-51d9-408f-9656-1375e81c5502")
    protected CommunicationPort(final Port elt) {
        super(elt);
    }

    @objid ("4372cf5a-f8d4-4bb8-ad18-085c5dd70583")
    public static final class MdaTypes {
        @objid ("3fe852ae-1db6-47be-a5a7-62e4fba9d208")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6adb8d3f-d18b-4080-887b-d744b5928c12")
        public static TagType LOWPORTNUMBER_TAGTYPE_ELT;

        @objid ("838fb9ce-6d58-480c-b536-aa90430248a6")
        public static TagType HIGHPORTNUMBER_TAGTYPE_ELT;

        @objid ("fe1dc3da-57c7-4b6f-8205-0f8df93ab819")
        public static TagType ISMANDATORY_TAGTYPE_ELT;

        @objid ("f87ef089-17b8-449d-a3ac-66000bef414e")
        private static Stereotype MDAASSOCDEP;

        @objid ("d03cdb4b-a7c2-48e4-9c5d-427c6f316e4e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d818ec09-efa0-4f05-aff6-eb81e604bd22")
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
