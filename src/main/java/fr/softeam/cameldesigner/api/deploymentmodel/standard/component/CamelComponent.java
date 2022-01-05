/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
<<<<<<< HEAD
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Component;
=======
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
<<<<<<< HEAD
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration;
=======
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << CamelComponent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a91a167f-9c29-4c56-bc2c-ba8458b6d7fa")
public abstract class CamelComponent extends Feature {
    @objid ("b6051cd3-c4e9-4322-a855-c812b7eb239a")
    public static final String STEREOTYPE_NAME = "CamelComponent";

    @objid ("0f698fb9-0219-49eb-92fb-66cd2ea2c41f")
    public static CamelComponent instantiate(final Component obj) {
        return Container.canInstantiate(obj) ? new Container(obj) : PaaS.canInstantiate(obj) ? new PaaS(obj) : SoftwareComponent.canInstantiate(obj) ? new SoftwareComponent(obj) : VM.canInstantiate(obj) ? new VM(obj) : null;
    }

    /**
     * Add a value to the 'configurations' role.<p>
     * Role description:
     * null
     */
    @objid ("466e3170-2b60-4b4d-8d28-4e44f4962667")
    public void addConfigurations(final Configuration obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CamelComponent.MdaTypes.MDAASSOCDEP);
            d.setName("configurations");
            d.putTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE, "configurations");
        }
    }

    /**
     * Add a value to the 'providedCommunications' role.<p>
     * Role description:
     * null
     */
    @objid ("5f5bdf42-f9bb-4717-9883-ac4c15bd9547")
    public void addProvidedCommunications(final CommunicationPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CamelComponent.MdaTypes.MDAASSOCDEP);
            d.setName("providedCommunications");
            d.putTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE, "providedCommunications");
        }
    }

    /**
     * Add a value to the 'providedHosts' role.<p>
     * Role description:
     * null
     */
    @objid ("b6061640-a961-4371-add4-69ef5bb68515")
    public void addProvidedHosts(final HostingPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CamelComponent.MdaTypes.MDAASSOCDEP);
            d.setName("providedHosts");
            d.putTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE, "providedHosts");
        }
    }

    @objid ("2ba8f9dc-446f-4e40-a4f5-93599f52bf96")
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
     */
    @objid ("5feb5ffe-bb78-4d3a-9c23-9bd43f07f5a9")
    public List<Configuration> getConfigurations() {
        List<Configuration> results = new ArrayList<>();
<<<<<<< HEAD
        for (ModelTree mObj : getElement().getOwnedElement()) {
            if (ScriptConfiguration.canInstantiate(mObj)) {
                    results.add(ScriptConfiguration.instantiate((Artifact)mObj));
            }else if (ClusterConfiguration.canInstantiate(mObj)) {
                results.add(ClusterConfiguration.instantiate((Artifact)mObj));
            }else if (PaaSConfiguration.canInstantiate(mObj)) {
                results.add(PaaSConfiguration.instantiate((Artifact)mObj));
            }else if (ServerlessConfiguration.canInstantiate(mObj)) {
                results.add(ServerlessConfiguration.instantiate((Artifact)mObj));
            }
=======
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "configurations")
              && Configuration.canInstantiate(d.getDependsOn()))
                results.add((Configuration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Configuration.MdaTypes.STEREOTYPE_ELT.getName()));
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Component}.
     * 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("f805d1ea-38cc-4653-b022-6f8c464b1f7b")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    /**
     * Get the values of the 'providedCommunications' role.<p>
     * Role description:
     * null
     */
    @objid ("9680e4ce-6f8a-481e-92ab-1a13409ca90c")
    public List<CommunicationPort> getProvidedCommunications() {
        List<CommunicationPort> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "providedCommunications")
              && CommunicationPort.canInstantiate(d.getDependsOn()))
                results.add((CommunicationPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationPort.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'providedHosts' role.<p>
     * Role description:
     * null
     */
    @objid ("08bfe320-33e7-470e-9285-f2a7a5eccd40")
    public List<HostingPort> getProvidedHosts() {
        List<HostingPort> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "providedHosts")
              && HostingPort.canInstantiate(d.getDependsOn()))
                results.add((HostingPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HostingPort.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a193b95e-90c3-43e0-b0ad-13227ec1d913")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'configurations' role.<p>
     * Role description:
     * null
     */
    @objid ("0e4527dc-3a95-403c-a9fa-82a3a14a9e95")
    public boolean removeConfigurations(final Configuration obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
<<<<<<< HEAD
            if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), ""))
=======
            if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "")) 
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'providedCommunications' role.<p>
     * Role description:
     * null
     */
    @objid ("42cd18e7-e070-4896-9acd-17718ff5d153")
    public boolean removeProvidedCommunications(final CommunicationPort obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
<<<<<<< HEAD
            if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), ""))
=======
            if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "")) 
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'providedHosts' role.<p>
     * Role description:
     * null
     */
    @objid ("de1a588e-b055-481b-969d-628f5bfa8b59")
    public boolean removeProvidedHosts(final HostingPort obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
<<<<<<< HEAD
            if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), ""))
=======
            if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "")) 
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("aa39928c-9d3c-4c4c-b866-3a0fdee09d25")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(getConfigurations());
        return result;
    }

    @objid ("58a9f6ab-d646-43ca-9678-c89e31ba01d3")
    protected CamelComponent(final Component elt) {
        super(elt);
    }

    @objid ("b119b6ad-b4ac-465e-9b4b-68e0a2014905")
    public static final class MdaTypes {
        @objid ("64491f2a-a79c-4a24-b8f5-f5cfb274da6d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eec332be-1f46-4177-b3c1-0f6e361bd246")
        private static Stereotype MDAASSOCDEP;

        @objid ("3a5465df-e48d-49b5-b63a-e30178ceca9d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4337426d-3d6a-4dcf-b057-dc0521275f8e")
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
