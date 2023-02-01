/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("dbe6a7aa-8195-47a7-9a03-f8f7fce83d5d")
    public static final String STEREOTYPE_NAME = "CommunicationPort";

    @objid ("312a7125-cfa8-4794-9ed0-6a5875bd76b3")
    public static final String HIGHPORTNUMBER_TAGTYPE = "highPortNumber";

    @objid ("80849ba5-67c6-424f-94fc-c6e899eaa06e")
    public static final String ISMANDATORY_TAGTYPE = "isMandatory";

    @objid ("9eea3bbe-073c-4c81-8710-9e70b243e886")
=======
    @objid ("471a7b45-5dcb-4983-a3cb-c38670b5d215")
    public static final String STEREOTYPE_NAME = "CommunicationPort";

    @objid ("58d77ea0-93f8-4693-a168-d21a0fed23e8")
    public static final String HIGHPORTNUMBER_TAGTYPE = "highPortNumber";

    @objid ("57ac1310-1314-42cc-b367-a626eb987b42")
    public static final String ISMANDATORY_TAGTYPE = "isMandatory";

    @objid ("59ffca38-c7b1-4f84-b192-7f1eab0bc408")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String LOWPORTNUMBER_TAGTYPE = "lowPortNumber";

    /**
     * Tells whether a {@link CommunicationPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << CommunicationPort >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("21ca9243-00ac-4997-be60-f1c6b069008d")
=======
    @objid ("88f3c888-dcf4-4e35-b032-07437fd4252c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << CommunicationPort >> then instantiate a {@link CommunicationPort} proxy.
     * 
     * @return a {@link CommunicationPort} proxy on the created {@link Port}.
     */
<<<<<<< HEAD
    @objid ("84e158a2-5a5f-4d17-ada1-be1280cd2469")
=======
    @objid ("49658af4-dbd8-4aa0-a94c-6681810961f0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7c4f4da5-231e-44f7-a722-f318ec36c256")
=======
    @objid ("d6a89f3d-a929-425f-b239-e52360d58bcf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("367959f9-b2c5-46fd-bc3e-9bd5eacc73c4")
=======
    @objid ("61618f18-0caf-4dcf-947c-e22a09d30ed1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CommunicationPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (CommunicationPort.canInstantiate(obj))
        	return new CommunicationPort(obj);
        else
        	throw new IllegalArgumentException("CommunicationPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("7ffb593d-a73a-4578-bb2c-b33c335c71b2")
=======
    @objid ("b577e981-538e-4257-91c8-c6442ca83f60")
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
        CommunicationPort other = (CommunicationPort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("5bff8f95-d33d-4d29-809b-2fc34d4a11cf")
=======
    @objid ("566f10a0-e861-4989-a9cc-5de7aba38ac6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    /**
     * Getter for string property 'highPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("a30197e6-4cb2-479f-9199-317624df592d")
=======
    @objid ("aa6eb631-aaa1-496e-a5a4-f9bc050966eb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getHighPortNumber() {
        return this.elt.getTagValue(CommunicationPort.MdaTypes.HIGHPORTNUMBER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'lowPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("52adb268-1649-46c1-97b4-ed47b057dce4")
=======
    @objid ("6b2212b2-e244-4f69-b356-d78f9e49a2ad")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getLowPortNumber() {
        return this.elt.getTagValue(CommunicationPort.MdaTypes.LOWPORTNUMBER_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("9deb5533-72f7-4047-9895-8e27043e75c5")
=======
    @objid ("c16f9a8e-18c1-4e29-9f36-b4f3c83fcb86")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isMandatory'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("15979204-6513-4c42-99f3-4459b3172c41")
=======
    @objid ("4681fc64-dd90-43e0-8bf7-b34c2f1eb6ec")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isIsMandatory() {
        return this.elt.isTagged(CommunicationPort.MdaTypes.ISMANDATORY_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'highPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("4688c746-4210-43a5-bff1-a0b8f91b3af8")
=======
    @objid ("f965a51d-59b8-4fb6-9eee-f4a860af728e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setHighPortNumber(final String value) {
        this.elt.putTagValue(CommunicationPort.MdaTypes.HIGHPORTNUMBER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'isMandatory'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("49a6ea52-d301-47ac-bfcf-8c1306743cea")
=======
    @objid ("5d69247f-66ba-4140-ad14-6102de398399")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("06f010b6-8a94-43e4-a6d5-2657a55b50cf")
=======
    @objid ("3869b633-dc1c-414c-8071-c2f9711359d6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("5179856b-d485-498a-8436-2b353d3dd127")
=======
    @objid ("5a61e573-7a93-45e5-ab44-1bbbd79b3811")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CommunicationPort(final Port elt) {
        super(elt);
    }

    @objid ("4372cf5a-f8d4-4bb8-ad18-085c5dd70583")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("e266d420-bd1e-4656-8bf0-1fe2f4395584")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("933c602e-128f-49e4-9f22-77eb82304850")
        public static TagType LOWPORTNUMBER_TAGTYPE_ELT;

        @objid ("6aaf383d-3717-4e24-9689-0760c8d45ed8")
        public static TagType HIGHPORTNUMBER_TAGTYPE_ELT;

        @objid ("d5ae51f8-27b4-438a-a0fd-65b6f9fc8e5a")
        public static TagType ISMANDATORY_TAGTYPE_ELT;

        @objid ("f031cb49-d08c-4a12-aa03-219cfe7f0761")
        private static Stereotype MDAASSOCDEP;

        @objid ("80e5de32-2365-4c2a-91f5-04912f64ea0e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f71ba1b5-33ca-4507-8688-bbe81763eef6")
=======
        @objid ("4fab8665-f929-4131-9943-7a0a2481ce57")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ce1a357e-f8ef-452e-ae58-d0426255095c")
        public static TagType LOWPORTNUMBER_TAGTYPE_ELT;

        @objid ("99c54257-2fff-4582-9006-e63240c1e441")
        public static TagType HIGHPORTNUMBER_TAGTYPE_ELT;

        @objid ("d1d834d0-fe9e-4324-b904-a8bbbcedc293")
        public static TagType ISMANDATORY_TAGTYPE_ELT;

        @objid ("7a9a0ef9-1a57-4a32-a1bb-46f1c0966e5b")
        private static Stereotype MDAASSOCDEP;

        @objid ("7e0115ee-f89b-490d-b645-fe2dc5e5b113")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("599c954f-9335-4789-86cd-0796585f32b2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
