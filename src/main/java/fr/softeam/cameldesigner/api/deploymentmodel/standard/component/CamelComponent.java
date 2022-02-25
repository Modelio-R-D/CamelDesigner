/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << CamelComponent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a91a167f-9c29-4c56-bc2c-ba8458b6d7fa")
public abstract class CamelComponent extends Feature {
    @objid ("99e5e74f-e20b-48ce-87a0-9bf485b80a17")
    public static final String STEREOTYPE_NAME = "CamelComponent";

    /**
     * Tells whether a {@link CamelComponent proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << CamelComponent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("35338332-6454-4c1e-9537-8acb3bcc32bd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelComponent.STEREOTYPE_NAME));
    }

    @objid ("0f698fb9-0219-49eb-92fb-66cd2ea2c41f")
    public static CamelComponent instantiate(final Component obj) {
        return Container.canInstantiate(obj) ? new Container(obj) : PaaS.canInstantiate(obj) ? new PaaS(obj) : SoftwareComponent.canInstantiate(obj) ? new SoftwareComponent(obj) : VM.canInstantiate(obj) ? new VM(obj) : null;
    }

    /**
     * Add a value to the 'configurations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3127e3c2-9989-42b1-bb87-b90e92661089")
    public void addConfigurations(final Configuration obj) {
        if (obj!=null)
          ((Component) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'providedCommunications' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a17ff300-35a7-45db-9a92-5b7ad93495fd")
    public void addProvidedCommunications(final CommunicationPort obj) {
        if (obj!=null)
          ((Component) this.elt).getInternalStructure().add(obj.getElement());
    }

    /**
     * Add a value to the 'providedHosts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a1259b56-0a99-4d0b-847b-05e91dc0d8f5")
    public void addProvidedHosts(final HostingPort obj) {
        if (obj!=null)
          ((Component) this.elt).getInternalStructure().add(obj.getElement());
    }

    @objid ("b77896f6-0eff-4605-80e7-ee35d0723aa9")
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
        CamelComponent other = (CamelComponent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'configurations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0984a3f3-3b2b-4c76-9c6e-a4f887c43dd0")
    public List<Configuration> getConfigurations() {
        List<Configuration> results = new ArrayList<>();
        for (ModelTree mObj : ((Component) this.elt).getOwnedElement()){
        	if (ClusterConfiguration.canInstantiate(mObj))
        			results.add((ClusterConfiguration)CamelDesignerProxyFactory.instantiate(mObj, ClusterConfiguration.STEREOTYPE_NAME));
        	if (PaaSConfiguration.canInstantiate(mObj))
        			results.add((PaaSConfiguration)CamelDesignerProxyFactory.instantiate(mObj, PaaSConfiguration.STEREOTYPE_NAME));
        	if (ScriptConfiguration.canInstantiate(mObj))
        			results.add((ScriptConfiguration)CamelDesignerProxyFactory.instantiate(mObj, ScriptConfiguration.STEREOTYPE_NAME));
        	if (ServerlessConfiguration.canInstantiate(mObj))
        			results.add((ServerlessConfiguration)CamelDesignerProxyFactory.instantiate(mObj, ServerlessConfiguration.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("efef7430-5a48-4fc9-bfe7-45d32efe2ac7")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    /**
     * Get the values of the 'providedCommunications' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("76a4969c-73a3-4f45-8e80-b34f5de8b1d9")
    public List<CommunicationPort> getProvidedCommunications() {
        List<CommunicationPort> results = new ArrayList<>();
        for (BindableInstance mObj : ((Component) this.elt).getInternalStructure()){
        	if (CommunicationPort.canInstantiate(mObj))
        			results.add((CommunicationPort)CamelDesignerProxyFactory.instantiate(mObj, CommunicationPort.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'providedHosts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("58f8d549-7b35-40e2-bf28-4a750ac90b29")
    public List<HostingPort> getProvidedHosts() {
        List<HostingPort> results = new ArrayList<>();
        for (BindableInstance mObj : ((Component) this.elt).getInternalStructure()){
        	if (HostingPort.canInstantiate(mObj))
        			results.add((HostingPort)CamelDesignerProxyFactory.instantiate(mObj, HostingPort.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("b88c69d9-3234-49b8-9b02-956016c2f924")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'configurations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3fc9ace1-a65c-4ae4-a93e-76abb5b2437d")
    public boolean removeConfigurations(final Configuration obj) {
        return (obj!=null)? ((Component) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'providedCommunications' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d8ccc85d-b7ea-4c49-9ea3-56b5035785b6")
    public boolean removeProvidedCommunications(final CommunicationPort obj) {
        return (obj!=null)? ((Component) this.elt).getInternalStructure().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'providedHosts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b272e620-d8c8-4603-afa2-fba8bf22624c")
    public boolean removeProvidedHosts(final HostingPort obj) {
        return (obj!=null)? ((Component) this.elt).getInternalStructure().remove(obj.getElement()) : false;
    }

    @objid ("aa39928c-9d3c-4c4c-b866-3a0fdee09d25")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getConfigurations());
        return result;
    }

    @objid ("2c03843e-089a-4e2c-9dce-ff27ce8f1806")
    protected CamelComponent(final Component elt) {
        super(elt);
    }

    @objid ("b119b6ad-b4ac-465e-9b4b-68e0a2014905")
    public static final class MdaTypes {
        @objid ("5bbc46ac-5f30-4090-8f28-09a3a1ecd546")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b9dda941-98cc-4425-9c2e-df82a823f3fe")
        private static Stereotype MDAASSOCDEP;

        @objid ("e63ec9d6-8449-4a82-a782-a962ab848577")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("24ed52e3-9539-47f7-a14b-2335f0faa05f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "abb7159a-fde4-40d9-8e5e-8f9ad94f2b31");
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
