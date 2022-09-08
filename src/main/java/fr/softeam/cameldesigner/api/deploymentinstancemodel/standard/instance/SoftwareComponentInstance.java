/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.datamodel.standard.bindableinstance.DataInstanceBindableInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SoftwareComponentInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a0c4baed-2aff-4ee2-a7f5-c01274a910db")
public class SoftwareComponentInstance extends ComponentInstance {
    @objid ("2cb805cf-fc30-423a-abbc-a95df386be1e")
    public static final String STEREOTYPE_NAME = "SoftwareComponentInstance";

    /**
     * Tells whether a {@link SoftwareComponentInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SoftwareComponentInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6c7e76f6-6dca-4ea1-afda-a13baf9dadb9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SoftwareComponentInstance >> then instantiate a {@link SoftwareComponentInstance} proxy.
     * 
     * @return a {@link SoftwareComponentInstance} proxy on the created {@link Instance}.
     */
    @objid ("14579fcd-b449-48f4-907c-8ed12dc65a52")
    public static SoftwareComponentInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentInstance.STEREOTYPE_NAME);
        return SoftwareComponentInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentInstance} proxy from a {@link Instance} stereotyped << SoftwareComponentInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Instance
     * @return a {@link SoftwareComponentInstance} proxy or <i>null</i>.
     */
    @objid ("fea3639f-107d-4b8f-986c-e8b4a5ad01c0")
    public static SoftwareComponentInstance instantiate(final Instance obj) {
        return SoftwareComponentInstance.canInstantiate(obj) ? new SoftwareComponentInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentInstance} proxy from a {@link Instance} stereotyped << SoftwareComponentInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Instance}
     * @return a {@link SoftwareComponentInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a47a0c33-4575-40d8-ab57-cc6d1d4cc3f4")
    public static SoftwareComponentInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SoftwareComponentInstance.canInstantiate(obj))
            return new SoftwareComponentInstance(obj);
        else
            throw new IllegalArgumentException("SoftwareComponentInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'consumesDataInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("7f933c7e-0cc5-42ed-aed8-874d606e87eb")
    public void addConsumesDataInstances(final DataInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentInstance.MdaTypes.MDAASSOCDEP);
            d.setName("consumesDataInstances");
            d.putTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE, "consumesDataInstances");
        }
    }

    /**
     * Add a value to the 'generatesDataInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("cad791d4-c0b8-4996-bc9a-5effdfcefda2")
    public void addGeneratesDataInstance(final DataInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentInstance.MdaTypes.MDAASSOCDEP);
            d.setName("generatesDataInstance");
            d.putTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE, "generatesDataInstance");
        }
    }

    /**
     * Add a value to the 'managesDataSourceInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("624b321c-e520-4401-8965-d98f23d96f51")
    public void addManagesDataSourceInstance(final DataSourceInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentInstance.MdaTypes.MDAASSOCDEP);
            d.setName("managesDataSourceInstance");
            d.putTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE, "managesDataSourceInstance");
        }
    }

    /**
     * Add a value to the 'requiredCommunicationsInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("2441d7e9-dfa3-426d-b925-38bfeef521a4")
    public void addRequiredCommunicationsInstances(final CommunicationPort obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

    @objid ("5f238890-d528-4023-bcef-bb10d3272da0")
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
        SoftwareComponentInstance other = (SoftwareComponentInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'consumesDataInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("d11714db-7e8d-4e54-9172-9db13e3eb821")
    public List<DataInstance> getConsumesDataInstances() {
        List<DataInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "consumesDataInstances")){
              if (DataInstanceBindableInstance.canInstantiate(d.getDependsOn()))
                results.add((DataInstanceBindableInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceBindableInstance.MdaTypes.STEREOTYPE_ELT.getName()));
              if (DataInstance.canInstantiate(d.getDependsOn()))
                results.add((DataInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstance.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Instance}.
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("61f76f4f-e92c-4904-b613-575b95c29961")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'generatesDataInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("cb66d9ce-aebf-4974-9b46-4f354499a29c")
    public List<DataInstance> getGeneratesDataInstance() {
        List<DataInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "generatesDataInstance")){
              if (DataInstanceBindableInstance.canInstantiate(d.getDependsOn()))
                results.add((DataInstanceBindableInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceBindableInstance.MdaTypes.STEREOTYPE_ELT.getName()));
              if (DataInstance.canInstantiate(d.getDependsOn()))
                results.add((DataInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstance.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'managesDataSourceInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("85a9ad3d-e6ff-4677-abba-2af9af44ea5f")
    public List<DataSourceInstance> getManagesDataSourceInstance() {
        List<DataSourceInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "managesDataSourceInstance")){
              if (DataSourceInstance.canInstantiate(d.getDependsOn()))
                results.add((DataSourceInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataSourceInstance.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("c10ef08a-25b7-4810-8cee-d088b2c33b39")
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'requiredCommunicationsInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("4dc1e940-8c73-4838-9f04-8c289ff1acb9")
    public List<CommunicationPort> getRequiredCommunicationsInstances() {
        List<CommunicationPort> results = new ArrayList<>();
        for (BindableInstance mObj : ((Instance) this.elt).getPart()){
            if (CommunicationPort.canInstantiate(mObj))
                    results.add((CommunicationPort)CamelDesignerProxyFactory.instantiate(mObj, CommunicationPort.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("51035ef6-2aa3-4617-bdeb-970e24f60576")
    public HostingPort getRequiredHostInstance() {
        for (Port obj : ((Instance) this.elt).getPart(Port.class)) {
         if (HostingPort.canInstantiate(obj))
           return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
        }
        return null;
    }

    @objid ("3d5cb75f-a8ab-4e22-97d6-f24e29e34247")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'consumesDataInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("746eb702-a41d-4e9f-b346-1d1620192bac")
    public boolean removeConsumesDataInstances(final DataInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "consumesDataInstances")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'generatesDataInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("e8debd11-7157-49c6-8169-48f5ba546b53")
    public boolean removeGeneratesDataInstance(final DataInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "generatesDataInstance")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'managesDataSourceInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("5b38f6cf-4b33-49b7-b0d3-ecddecb3cbf3")
    public boolean removeManagesDataSourceInstance(final DataSourceInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "managesDataSourceInstance")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'requiredCommunicationsInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("850f3dcd-83f6-4dd1-bf20-862f1a9797b2")
    public boolean removeRequiredCommunicationsInstances(final CommunicationPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("1bf12036-d5b4-4551-a6d1-306ca5a96739")
    public void setParent(final DeploymentInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("3b3d1bdc-7db6-42b3-b565-a22d4527eda1")
    public void setRequiredHostInstance(final HostingPort obj) {
        // Remove existing HostingPorts
        for (Port e : ((Instance) this.elt).getPart(Port.class)) {
           if (HostingPort.canInstantiate(e)) {
               e.delete();
           }
        }
        // Set the HostingPort
        if (obj != null) {
            ((Instance) this.elt).getPart().add(obj.getElement());
        }
    }

    @objid ("47f392f3-860d-492a-931c-4a30257969bd")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("71a07549-d05b-4098-9bda-b72e59dbcd18")
    protected SoftwareComponentInstance(final Instance elt) {
        super(elt);
    }

    @objid ("eb836565-9ba9-424d-96b5-05bec355c93e")
    public static final class MdaTypes {
        @objid ("944e5eee-0f07-4a4a-8c50-17d0595fdd2a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7a51018f-c441-451c-9d0b-f5f3fe683998")
        private static Stereotype MDAASSOCDEP;

        @objid ("df15b919-9c01-4ed2-9fe7-1f292e8d8bd1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("34b29ed2-8198-48a1-b55e-57bc3b42b64e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dfb1cf41-de3c-4af9-a3ff-66986b4f35fb");
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
