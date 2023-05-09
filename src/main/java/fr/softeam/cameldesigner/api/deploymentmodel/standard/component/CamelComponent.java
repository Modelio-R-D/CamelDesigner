/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ContainerConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ImageConfiguration;
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
public abstract class CamelComponent extends FeatureClass {
    @objid ("97d52b0b-2961-4ed7-b221-a0d0599fc142")
    public static final String STEREOTYPE_NAME = "CamelComponent";

    /**
     * Tells whether a {@link CamelComponent proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << CamelComponent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3596421f-88ee-4944-bf66-0d9b27c3dda0")
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
    @objid ("89627125-5e09-4f71-80ea-6a0ee479426e")
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
    @objid ("9510e193-91dd-45bf-b241-f8f1ec8b3ce0")
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
    @objid ("ce052be3-10de-4d91-8867-863a09b54fe3")
    public void addProvidedHosts(final HostingPort obj) {
        if (obj!=null)
          ((Component) this.elt).getInternalStructure().add(obj.getElement());
    }

    @objid ("d17513f3-3ba2-4416-a089-ef534a4e7381")
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
    @objid ("3f033be7-ccbc-4feb-8ccc-44bff2f6ca5b")
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
        	if (ImageConfiguration.canInstantiate(mObj))
        			results.add((ImageConfiguration)CamelDesignerProxyFactory.instantiate(mObj, ImageConfiguration.STEREOTYPE_NAME));
        	if (ContainerConfiguration.canInstantiate(mObj))
        			results.add((ContainerConfiguration)CamelDesignerProxyFactory.instantiate(mObj, ContainerConfiguration.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("359fd4aa-4ed4-4ebe-a00c-c802377dbb67")
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
    @objid ("7a8ad148-41c1-4b69-bcec-73021c74034c")
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
    @objid ("26f9622c-b9cb-4ddc-885d-94c85d9b6b3b")
    public List<HostingPort> getProvidedHosts() {
        List<HostingPort> results = new ArrayList<>();
        for (BindableInstance mObj : ((Component) this.elt).getInternalStructure()){
        	if (HostingPort.canInstantiate(mObj))
        			results.add((HostingPort)CamelDesignerProxyFactory.instantiate(mObj, HostingPort.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("dab02116-5d23-481d-9fe7-874b11626108")
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
    @objid ("399897ed-9299-4093-a631-dd0abcc0d440")
    public boolean removeConfigurations(final Configuration obj) {
        return (obj!=null)? ((Component) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'providedCommunications' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7fc1c89d-627e-4aab-8b3a-eeb4ef87945c")
    public boolean removeProvidedCommunications(final CommunicationPort obj) {
        return (obj!=null)? ((Component) this.elt).getInternalStructure().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'providedHosts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a5b4f016-ef9d-41df-b86c-552abe94d0a1")
    public boolean removeProvidedHosts(final HostingPort obj) {
        return (obj!=null)? ((Component) this.elt).getInternalStructure().remove(obj.getElement()) : false;
    }

    @objid ("aa39928c-9d3c-4c4c-b866-3a0fdee09d25")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getConfigurations());
        result.addAll(getProvidedHosts());
        result.addAll(getProvidedCommunications());
        return result;
    }

    @objid ("53429779-69fa-4228-84f8-ecf1e50e650f")
    protected CamelComponent(final Component elt) {
        super(elt);
    }

    @objid ("b119b6ad-b4ac-465e-9b4b-68e0a2014905")
    public static final class MdaTypes {
        @objid ("11254ecc-60dc-4202-a7e1-3c073464b26a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("533765ce-9c4c-4d1f-92cc-7c46035d34f6")
        private static Stereotype MDAASSOCDEP;

        @objid ("694313c5-4319-41de-bb23-bebf0900e275")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cbe78656-df40-47b9-a2dc-1b891553acfb")
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
