/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

/**
 * Proxy class to handle a {@link Component} with << CamelComponent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public abstract class CamelComponent extends Feature {
    public static final String STEREOTYPE_NAME = "CamelComponent";

    /**
     * Add a value to the 'configurations' role.<p>
     * Role description:
     * null
     */
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
    public void addProvidedHosts(final HostingPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CamelComponent.MdaTypes.MDAASSOCDEP);
            d.setName("providedHosts");
            d.putTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE, "providedHosts");
        }
    }

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

//    /**
//     * Get the values of the 'configurations' role.<p>
//     * Role description:
//     * null
//     */
//    public List<Configuration> getConfigurations() {
//        List<Configuration> results = new ArrayList<>();
//        for (Dependency d : this.elt.getDependsOnDependency()) {
//            if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP)
//                    && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "configurations")
//                    && Configuration.canInstantiate(d.getDependsOn()))
//                results.add((Configuration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Configuration.MdaTypes.STEREOTYPE_ELT.getName()));
//        }
//        return Collections.unmodifiableList(results);
//    }

    /**
     * Get the underlying {@link Component}.
     *
     * @return the Component represented by this proxy, never null.
     */
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    public static CamelComponent instantiate(final Component obj) {
        if (SoftwareComponent.canInstantiate(obj)) {
            return new SoftwareComponent(obj);
        }else if (VM.canInstantiate(obj)) {
            return new VM(obj);
        }else if (Container.canInstantiate(obj)) {
            return new Container(obj);
        }else if (PaaS.canInstantiate(obj)) {
            return new PaaS(obj);
        }
        return  null;
    }


    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && (
                ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME) ||
                ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME) ||
                ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaS.STEREOTYPE_NAME) ||
                ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Container.STEREOTYPE_NAME) ));
    }

    /**
     * Get the values of the 'providedCommunications' role.<p>
     * Role description:
     * null
     */
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

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'configurations' role.<p>
     * Role description:
     * null
     */
    public boolean removeConfigurations(final Configuration obj) {
        if (obj != null) {
            for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
                if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), ""))
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
    public boolean removeProvidedCommunications(final CommunicationPort obj) {
        if (obj != null) {
            for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
                if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), ""))
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
    public boolean removeProvidedHosts(final HostingPort obj) {
        if (obj != null) {
            for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
                if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), ""))
                    if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                        d.delete();
                        return true;
                    }
            }
        }
        return false;
    }

    protected CamelComponent(final Component elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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

    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(getConfigurations());
        return result;
    }

    public List<Configuration> getConfigurations() {
        List<Configuration> result = new ArrayList<>();
        result.addAll(getScriptConfigurations());
        result.addAll(getClusterConfigurations());
        result.addAll(getPaaSConfigurations());
        result.addAll(getServerlessConfigurations());
        result.addAll(getBuildConfigurations());

        return result;
    }

    public List<ScriptConfiguration> getScriptConfigurations() {
        List<ScriptConfiguration> result = new ArrayList<>();

        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (ScriptConfiguration.canInstantiate(mObj))
                result.add(ScriptConfiguration.safeInstantiate((Artifact) mObj));
        return result;
    }


    public List<ClusterConfiguration> getClusterConfigurations() {
        List<ClusterConfiguration> result = new ArrayList<>();

        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (ClusterConfiguration.canInstantiate(mObj))
                result.add(ClusterConfiguration.safeInstantiate((Artifact) mObj));
        return result;
    }


    public List<PaaSConfiguration> getPaaSConfigurations() {
        List<PaaSConfiguration> result = new ArrayList<>();

        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (PaaSConfiguration.canInstantiate(mObj))
                result.add(PaaSConfiguration.safeInstantiate((Artifact) mObj));
        return result;
    }


    public List<ServerlessConfiguration> getServerlessConfigurations() {
        List<ServerlessConfiguration> result = new ArrayList<>();

        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (ServerlessConfiguration.canInstantiate(mObj))
                result.add(ServerlessConfiguration.safeInstantiate((Artifact) mObj));
        return result;
    }


    public List<BuildConfiguration> getBuildConfigurations() {
        List<BuildConfiguration> result = new ArrayList<>();

        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (BuildConfiguration.canInstantiate(mObj))
                result.add(BuildConfiguration.safeInstantiate((Artifact) mObj));
        return result;
    }

}
