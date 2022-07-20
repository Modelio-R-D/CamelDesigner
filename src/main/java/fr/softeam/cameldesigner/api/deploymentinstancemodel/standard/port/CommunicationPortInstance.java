/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("7f38a7a4-74a5-4874-9d3b-b7f2d410befe")
    public static final String STEREOTYPE_NAME = "CommunicationPortInstance";

    /**
     * Tells whether a {@link CommunicationPortInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << CommunicationPortInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8f624af8-98cf-4ff0-9037-31a94fb8381a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPortInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << CommunicationPortInstance >> then instantiate a {@link CommunicationPortInstance} proxy.
     * 
     * @return a {@link CommunicationPortInstance} proxy on the created {@link Port}.
     */
    @objid ("45133ebc-dee0-4a16-8064-0ff716130992")
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
    @objid ("007c57f2-d208-4c21-8308-200e31e74c08")
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
    @objid ("1708c144-1d98-437b-96d6-06ea74b5ae02")
    public static CommunicationPortInstance safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (CommunicationPortInstance.canInstantiate(obj))
        	return new CommunicationPortInstance(obj);
        else
        	throw new IllegalArgumentException("CommunicationPortInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("136ceae9-bb7c-4613-b3e7-749ea22be798")
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
    @objid ("4ef10c59-650a-4a99-8e6e-c0cc4ecac4ab")
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
    @objid ("6d02e3ba-0f69-4b1e-ba00-c056ee159193")
    public CommunicationPort getType() {
        return (CommunicationPort)CamelDesignerProxyFactory.instantiate(((Port) this.elt).getRepresentedFeature(), CommunicationPort.STEREOTYPE_NAME);
    }

    @objid ("eb18ed19-df7c-4320-ae34-14109e16376c")
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
    @objid ("219c9657-0583-410e-b032-b13e1a14f885")
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

    @objid ("babe1536-612d-4804-98d4-30f9cc8e8ad9")
    protected CommunicationPortInstance(final Port elt) {
        super(elt);
    }

    @objid ("504cf2f2-0359-4c14-b98c-237508d0590f")
    public static final class MdaTypes {
        @objid ("0fae2a68-dd6a-4414-942c-793e0bb9019e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d4d68a97-a93e-4bf6-9df6-dcab780ba520")
        private static Stereotype MDAASSOCDEP;

        @objid ("2a9c12a8-66c4-458d-a529-7703583c542c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3cfe7dc2-f41e-4c93-a589-d840b24a9b1b")
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
