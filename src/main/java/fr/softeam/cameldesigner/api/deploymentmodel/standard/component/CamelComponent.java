/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("74fc8224-3a6e-4371-8610-f4cf36e7b3c5")
=======
    @objid ("a1df39e2-884b-49d6-8871-e8523482ecd9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "CamelComponent";

    /**
     * Tells whether a {@link CamelComponent proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << CamelComponent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("c8c4aa34-1ac6-4e86-ad29-7777c42a6e46")
=======
    @objid ("bb613175-6122-44d7-ab27-2410d3cb91c8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("979ef2fc-27b0-4486-9c39-0da1f82ddce6")
=======
    @objid ("e5c9d86f-0651-40a9-b61c-0d69f97cb303")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7a22b11a-e143-4102-bb0b-731956e1a810")
=======
    @objid ("6bc4d47d-17a4-4353-8423-e39f15a5cc93")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("30c95f3f-dccb-4afb-bb36-d7f2fbc4f657")
=======
    @objid ("83620d3a-e235-49ed-83b4-867503e8b0f9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addProvidedHosts(final HostingPort obj) {
        if (obj!=null)
          ((Component) this.elt).getInternalStructure().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("29a49079-8bce-4244-91ce-5887bb7d37c7")
=======
    @objid ("22745ec1-f397-4565-bd71-eb8c6f84e6af")
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
        CamelComponent other = (CamelComponent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'configurations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("1db08669-3ff6-484a-9c2f-5968592c3943")
=======
    @objid ("c0970f5c-44ac-4c7b-8052-5cad122df902")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
        	if (ImageConfiguration.canInstantiate(mObj))
        			results.add((ImageConfiguration)CamelDesignerProxyFactory.instantiate(mObj, ImageConfiguration.STEREOTYPE_NAME));
        	if (ContainerConfiguration.canInstantiate(mObj))
        			results.add((ContainerConfiguration)CamelDesignerProxyFactory.instantiate(mObj, ContainerConfiguration.STEREOTYPE_NAME));
=======
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("ff64eb56-a0df-4d0c-b49d-cf7b3e12a0ef")
=======
    @objid ("a9e713df-caff-4b1e-a1b1-f1354cf36519")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b1ced4f1-06a4-4dc8-aa1d-c8fdf3be3f24")
=======
    @objid ("884b64c8-3d6d-484d-868b-007533036172")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f056e335-7889-4254-bcdd-916d3f08b37d")
=======
    @objid ("ef6b16d5-a8eb-4b49-9e46-5a4a7396d817")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<HostingPort> getProvidedHosts() {
        List<HostingPort> results = new ArrayList<>();
        for (BindableInstance mObj : ((Component) this.elt).getInternalStructure()){
        	if (HostingPort.canInstantiate(mObj))
        			results.add((HostingPort)CamelDesignerProxyFactory.instantiate(mObj, HostingPort.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("e9b03ccb-6caf-4919-adb9-cb3e6d5db38c")
=======
    @objid ("1818cf56-ab77-4f1a-91d9-aa94ebf3c383")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e1953cce-8a14-4bc5-89be-02c0689b8edb")
=======
    @objid ("c8a9a1fe-f536-4d69-97d6-40913e14181f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeConfigurations(final Configuration obj) {
        return (obj!=null)? ((Component) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'providedCommunications' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b726929f-c29a-4fbe-8524-0a67bc796e56")
=======
    @objid ("9f5606a2-a2f5-4ee4-8b70-48c17197df6f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeProvidedCommunications(final CommunicationPort obj) {
        return (obj!=null)? ((Component) this.elt).getInternalStructure().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'providedHosts' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("52497f64-e5d0-426b-8c7f-5c2786499904")
=======
    @objid ("a51d1503-e280-4bf7-9fbd-95c34d038226")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("1b7d4095-5cd9-46ea-8bda-6af3e2f5dc66")
=======
    @objid ("7f4508ff-343e-4881-9eaa-a4545687be70")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CamelComponent(final Component elt) {
        super(elt);
    }

    @objid ("b119b6ad-b4ac-465e-9b4b-68e0a2014905")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("8218e55b-3ca8-4bd8-aaf9-c41ed864c0e7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f67fa41a-fe12-4c44-bcae-372848fbad62")
        private static Stereotype MDAASSOCDEP;

        @objid ("a3f9d851-66f7-4e34-b18f-0a2de7e35b5c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16125c26-b310-4a4f-913c-458e5e4d59c3")
=======
        @objid ("fd208487-3d91-44b3-96e8-ea9c67d9746a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b98bad47-2252-4600-bcc7-c57dead0e3d2")
        private static Stereotype MDAASSOCDEP;

        @objid ("af300a1d-9449-4601-9270-1049537f7e1e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2b52965b-28db-44c7-9027-f48594794278")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
