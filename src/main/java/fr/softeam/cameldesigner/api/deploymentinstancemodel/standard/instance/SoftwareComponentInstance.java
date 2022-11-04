/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("5c39ebbe-4604-4198-a2f8-16c80e333948")
    public static final String STEREOTYPE_NAME = "SoftwareComponentInstance";

    /**
     * Tells whether a {@link SoftwareComponentInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SoftwareComponentInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c1b1ea91-3d67-41d0-8573-e109c83471c0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SoftwareComponentInstance >> then instantiate a {@link SoftwareComponentInstance} proxy.
     * 
     * @return a {@link SoftwareComponentInstance} proxy on the created {@link Instance}.
     */
    @objid ("72a4e130-c7ba-4ce0-ab92-4febb1e17955")
    public static SoftwareComponentInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentInstance.STEREOTYPE_NAME);
        return SoftwareComponentInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentInstance} proxy from a {@link Instance} stereotyped << SoftwareComponentInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SoftwareComponentInstance} proxy or <i>null</i>.
     */
    @objid ("62b1b8ff-d317-482a-8b77-d6015ecd2681")
    public static SoftwareComponentInstance instantiate(final Instance obj) {
        return SoftwareComponentInstance.canInstantiate(obj) ? new SoftwareComponentInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentInstance} proxy from a {@link Instance} stereotyped << SoftwareComponentInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SoftwareComponentInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5ccb4fb1-d1ef-4ac5-9707-ebfec61e09e3")
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
     * 
     */
    @objid ("fbac9569-ed56-4399-96c6-5b5ae61ecb11")
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
     * 
     */
    @objid ("73a2355c-9474-425c-aeea-fee35ca209d4")
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
     * 
     */
    @objid ("4b13ed1f-fc66-4826-936f-c47b93b3c05d")
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
     * 
     */
    @objid ("5d418d7b-8f0d-4b72-854d-32d35c4d2415")
    public void addRequiredCommunicationsInstances(final CommunicationPort obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

    @objid ("e593829d-90b1-4030-a9d2-cf7a1d23a4bc")
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
     * 
     */
    @objid ("234ea9d5-c216-49f1-b28c-1a792e501181")
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
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("b0a6462c-1cb9-44c4-82db-7059ea7e05a9")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'generatesDataInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8a041cdc-9923-4ba2-860a-c90bf338d727")
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
     * 
     */
    @objid ("94afb546-cb97-485f-adc0-ad47df25a26a")
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
     * 
     */
    @objid ("3a08bbfb-68bd-4d71-a2c2-e2a130f7289d")
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'requiredCommunicationsInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6496d778-631d-4d1d-9a69-aa5047568600")
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
     * 
     */
    @objid ("d0baa342-b213-4686-850e-969cb9512e13")
    public HostingPort getRequiredHostInstance() {
          for (Port obj : ((Instance) this.elt).getPart(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("a134c1d2-88d3-4647-99bb-48473285d9d6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'consumesDataInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("45513742-22b6-47d2-ae7b-bbefc4a6ba91")
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
     * 
     */
    @objid ("aaf31e93-a088-4523-bc1a-aefbb188034e")
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
     * 
     */
    @objid ("223b0ce7-d9d0-451c-9e28-7ff794752b87")
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
     * 
     */
    @objid ("48b0788e-a499-4f1d-90d5-828699055637")
    public boolean removeRequiredCommunicationsInstances(final CommunicationPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("853b1550-e578-4143-bef2-2a11f712b956")
    public void setParent(final DeploymentInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("15a27b34-9ed0-4263-b7dc-f26fdc099646")
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

    @objid ("fb0e0bd3-4419-4ce9-9367-ae2f7db337e7")
    protected SoftwareComponentInstance(final Instance elt) {
        super(elt);
    }

    @objid ("eb836565-9ba9-424d-96b5-05bec355c93e")
    public static final class MdaTypes {
        @objid ("93d39733-4e68-41cc-8aa4-ab6080d4b8f8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eb4de5a8-0124-49e6-ad5f-08b5c56a018e")
        private static Stereotype MDAASSOCDEP;

        @objid ("b9373a40-7152-468a-a837-56d53ae00825")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3d91d3b1-5a97-4a68-b306-c48fe81ce79d")
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
