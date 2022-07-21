/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("98a32fa0-4d39-4ab3-8d15-d7f98923899c")
    public static final String STEREOTYPE_NAME = "CamelComponent";

    /**
     * Tells whether a {@link CamelComponent proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << CamelComponent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d01aec77-42fa-4cb2-9a57-16cd4ee934f3")
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
    @objid ("fa00216b-c67a-4e8a-bd9d-7827f54363cf")
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
    @objid ("964e5280-b8ba-42ef-9fcd-7bed85f4ec32")
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
    @objid ("29c70262-0081-4669-bbc6-dd27c3824299")
    public void addProvidedHosts(final HostingPort obj) {
        if (obj!=null)
          ((Component) this.elt).getInternalStructure().add(obj.getElement());
    }

    @objid ("4c1266f0-87a2-494a-aa76-47df319ad293")
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
    @objid ("1b405048-3c4d-4c67-aae1-ad172fb2660a")
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
    @objid ("2e099672-0f0b-4462-84c6-9ddf72c0725a")
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
    @objid ("e0028982-0977-4192-984a-6833d9a0c662")
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
    @objid ("d797e51d-c7a3-46e2-a7f5-d45316df3440")
    public List<HostingPort> getProvidedHosts() {
        List<HostingPort> results = new ArrayList<>();
        for (BindableInstance mObj : ((Component) this.elt).getInternalStructure()){
        	if (HostingPort.canInstantiate(mObj))
        			results.add((HostingPort)CamelDesignerProxyFactory.instantiate(mObj, HostingPort.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("ac49852f-e93e-49fd-a5b6-c3a3e1b4498d")
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
    @objid ("888302ac-beec-41a6-8a72-d0c2cc08d200")
    public boolean removeConfigurations(final Configuration obj) {
        return (obj!=null)? ((Component) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'providedCommunications' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0be2413d-3edc-4bfd-a1a7-7e62fdf28fbf")
    public boolean removeProvidedCommunications(final CommunicationPort obj) {
        return (obj!=null)? ((Component) this.elt).getInternalStructure().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'providedHosts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("19eec671-ec56-44d3-9818-ce7ba249503c")
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

    @objid ("b65f3311-baad-485c-b9e3-5c205579702d")
    protected CamelComponent(final Component elt) {
        super(elt);
    }

    @objid ("b119b6ad-b4ac-465e-9b4b-68e0a2014905")
    public static final class MdaTypes {
        @objid ("4380cd7b-e102-42d6-bb40-2767f3d4e430")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("551535ac-4773-476d-8fad-4780e33c2500")
        private static Stereotype MDAASSOCDEP;

        @objid ("ec983821-d841-4da1-b2be-9766ce1bfd1d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4c87e252-ce55-410e-a5ff-b0892eec5422")
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
