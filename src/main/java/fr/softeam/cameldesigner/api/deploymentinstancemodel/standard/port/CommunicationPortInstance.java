/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("08b1dd69-d858-4034-8ab2-ab51162d9352")
    public static final String STEREOTYPE_NAME = "CommunicationPortInstance";

    /**
     * Tells whether a {@link CommunicationPortInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << CommunicationPortInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dc651e8f-36f5-4fd9-91b0-1cab2898179a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPortInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << CommunicationPortInstance >> then instantiate a {@link CommunicationPortInstance} proxy.
     * 
     * @return a {@link CommunicationPortInstance} proxy on the created {@link Port}.
     */
    @objid ("e5d825cb-808d-462e-84c4-5a4673ceec85")
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
    @objid ("5a3db4e8-3852-4012-abd2-f622393db0c8")
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
    @objid ("07abe4b6-183a-461c-a1fc-823811243ce0")
    public static CommunicationPortInstance safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (CommunicationPortInstance.canInstantiate(obj))
        	return new CommunicationPortInstance(obj);
        else
        	throw new IllegalArgumentException("CommunicationPortInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c0166010-cfe5-4ee3-9dcc-21235b1f406f")
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
    @objid ("9229608a-fcf3-42b5-bb36-ca05da81d938")
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
    @objid ("89b2e841-c390-408f-9794-47f559c85595")
    public CommunicationPort getType() {
        return (CommunicationPort)CamelDesignerProxyFactory.instantiate(((Port) this.elt).getRepresentedFeature(), CommunicationPort.STEREOTYPE_NAME);
    }

    @objid ("b49e5b54-d751-4275-8a08-1cffed71a5e0")
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
    @objid ("599c76ec-4bff-4432-bb0a-145c0483ddc9")
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

    @objid ("bb09a1eb-284d-430b-949b-ce1f556b2fee")
    protected CommunicationPortInstance(final Port elt) {
        super(elt);
    }

    @objid ("504cf2f2-0359-4c14-b98c-237508d0590f")
    public static final class MdaTypes {
        @objid ("a2f00b3b-3692-4bfb-9cfd-8a51ca966ff6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad47fc85-c597-4662-b9b1-b7f877fac1c0")
        private static Stereotype MDAASSOCDEP;

        @objid ("e23a25d0-e0c7-47de-9f98-36a1d6320526")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("92e99a4a-1fb3-406f-bb22-1f93bee2d346")
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
