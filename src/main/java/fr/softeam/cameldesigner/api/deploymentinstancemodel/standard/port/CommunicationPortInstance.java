/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
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
 * Proxy class to handle a {@link Port} with << CommunicationPortInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("69c260bf-5f8b-43c5-99e2-3e3608ba3eb2")
public class CommunicationPortInstance extends FeaturePort {
<<<<<<< HEAD
    @objid ("80136af3-2752-4e23-a899-498d658554bf")
=======
    @objid ("08b1dd69-d858-4034-8ab2-ab51162d9352")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "CommunicationPortInstance";

    /**
     * Tells whether a {@link CommunicationPortInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << CommunicationPortInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("f720a11a-d2ac-4734-a776-f5255ffde759")
=======
    @objid ("dc651e8f-36f5-4fd9-91b0-1cab2898179a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPortInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << CommunicationPortInstance >> then instantiate a {@link CommunicationPortInstance} proxy.
     * 
     * @return a {@link CommunicationPortInstance} proxy on the created {@link Port}.
     */
<<<<<<< HEAD
    @objid ("1a88fcd3-97aa-42c5-bd46-4563b97cfe9a")
=======
    @objid ("e5d825cb-808d-462e-84c4-5a4673ceec85")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CommunicationPortInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPortInstance.STEREOTYPE_NAME);
        return CommunicationPortInstance.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationPortInstance} proxy from a {@link Port} stereotyped << CommunicationPortInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link CommunicationPortInstance} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("01bc5bb8-04be-4b2c-8b76-4185f5b844ca")
=======
    @objid ("5a3db4e8-3852-4012-abd2-f622393db0c8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CommunicationPortInstance instantiate(final Port obj) {
        return CommunicationPortInstance.canInstantiate(obj) ? new CommunicationPortInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationPortInstance} proxy from a {@link Port} stereotyped << CommunicationPortInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link CommunicationPortInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("215638ca-c8a3-41fa-b093-91adc8ee7580")
=======
    @objid ("07abe4b6-183a-461c-a1fc-823811243ce0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CommunicationPortInstance safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (CommunicationPortInstance.canInstantiate(obj))
        	return new CommunicationPortInstance(obj);
        else
        	throw new IllegalArgumentException("CommunicationPortInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("fa26729a-be69-4cd7-9ec7-0106cb6b16fe")
=======
    @objid ("c0166010-cfe5-4ee3-9dcc-21235b1f406f")
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
        CommunicationPortInstance other = (CommunicationPortInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("97a41ff4-00fe-4c1f-8685-a7958de7ad1e")
=======
    @objid ("9229608a-fcf3-42b5-bb36-ca05da81d938")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b8ea60ae-221f-4889-87fc-22ce52bca8df")
=======
    @objid ("89b2e841-c390-408f-9794-47f559c85595")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public CommunicationPort getType() {
        return (CommunicationPort)CamelDesignerProxyFactory.instantiate(((Port) this.elt).getRepresentedFeature(), CommunicationPort.STEREOTYPE_NAME);
    }

<<<<<<< HEAD
    @objid ("2189cc04-acd9-40ed-a3f8-f786d752655b")
=======
    @objid ("b49e5b54-d751-4275-8a08-1cffed71a5e0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("61e6138b-54bb-4840-93f2-4f0b12aae5b6")
=======
    @objid ("599c76ec-4bff-4432-bb0a-145c0483ddc9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setType(final CommunicationPort obj) {
        ((Port) this.elt).setRepresentedFeature((obj != null) ? obj.getElement() : null);
    }

    @objid ("fae49f17-ca3e-4730-afce-666dd768f513")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("9289470f-b7de-404f-9cb8-a7e559b4a498")
=======
    @objid ("bb09a1eb-284d-430b-949b-ce1f556b2fee")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CommunicationPortInstance(final Port elt) {
        super(elt);
    }

    @objid ("504cf2f2-0359-4c14-b98c-237508d0590f")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("01e93a92-ce3b-48c4-bad4-3ca980c8e59b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1e4b88cb-22b4-457c-ae7a-7c5a93a0584c")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e7348e9-5b12-4778-980f-12a7af7d20bb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("628e5fcb-742c-4ac1-9701-cd3c9d5d7e41")
=======
        @objid ("a2f00b3b-3692-4bfb-9cfd-8a51ca966ff6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad47fc85-c597-4662-b9b1-b7f877fac1c0")
        private static Stereotype MDAASSOCDEP;

        @objid ("e23a25d0-e0c7-47de-9f98-36a1d6320526")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("92e99a4a-1fb3-406f-bb22-1f93bee2d346")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "42bf761a-193d-48f8-b686-2c4b96a56384");
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
