/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f2812b70-5a9e-4f2c-b788-a7a52b1f06c5")
=======
    @objid ("5c39ebbe-4604-4198-a2f8-16c80e333948")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "SoftwareComponentInstance";

    /**
     * Tells whether a {@link SoftwareComponentInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SoftwareComponentInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("446887bf-9ba0-4c71-b75d-50e313751c3b")
=======
    @objid ("c1b1ea91-3d67-41d0-8573-e109c83471c0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SoftwareComponentInstance >> then instantiate a {@link SoftwareComponentInstance} proxy.
     * 
     * @return a {@link SoftwareComponentInstance} proxy on the created {@link Instance}.
     */
<<<<<<< HEAD
    @objid ("c57e4b0e-8ef7-4f9d-8a3d-b772babd48ce")
=======
    @objid ("72a4e130-c7ba-4ce0-ab92-4febb1e17955")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("57cc51cf-741d-4209-b1d9-3c5112b1a1ad")
=======
    @objid ("62b1b8ff-d317-482a-8b77-d6015ecd2681")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5b2513bc-282f-44de-9ee6-12f48b8502bb")
=======
    @objid ("5ccb4fb1-d1ef-4ac5-9707-ebfec61e09e3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5eb77a90-2e56-47d9-97a4-1eac04a0b789")
=======
    @objid ("fbac9569-ed56-4399-96c6-5b5ae61ecb11")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d92bdd4b-c4e7-4377-a694-62c110360464")
=======
    @objid ("73a2355c-9474-425c-aeea-fee35ca209d4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e07c187b-ec10-4c62-957e-f42833043a8b")
=======
    @objid ("4b13ed1f-fc66-4826-936f-c47b93b3c05d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("43f0de44-2acb-4bbd-833c-3b15ae5eebae")
=======
    @objid ("5d418d7b-8f0d-4b72-854d-32d35c4d2415")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addRequiredCommunicationsInstances(final CommunicationPort obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("d7e6d80c-93c0-456c-9af2-947f5dfc6ab5")
=======
    @objid ("e593829d-90b1-4030-a9d2-cf7a1d23a4bc")
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
        SoftwareComponentInstance other = (SoftwareComponentInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'consumesDataInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("cbc83063-0aef-4a0e-9731-faabe36f3fe6")
=======
    @objid ("234ea9d5-c216-49f1-b28c-1a792e501181")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("545c48c1-cfb4-4643-8fca-6cac341b0784")
=======
    @objid ("b0a6462c-1cb9-44c4-82db-7059ea7e05a9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5d1cb07b-f9a9-4ca5-9ada-2021d81cdb6d")
=======
    @objid ("8a041cdc-9923-4ba2-860a-c90bf338d727")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b338a11c-5d51-40ed-81e9-3fecc7e6da1c")
=======
    @objid ("94afb546-cb97-485f-adc0-ad47df25a26a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b52a5e63-cb3c-4436-8e27-1faef82ab13e")
=======
    @objid ("3a08bbfb-68bd-4d71-a2c2-e2a130f7289d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'requiredCommunicationsInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("4c0cdf17-b16a-466a-ba58-ebb64ef681a2")
=======
    @objid ("6496d778-631d-4d1d-9a69-aa5047568600")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("48f9c60a-bc38-4639-b22e-fa31f6d2aa01")
=======
    @objid ("d0baa342-b213-4686-850e-969cb9512e13")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public HostingPort getRequiredHostInstance() {
          for (Port obj : ((Instance) this.elt).getPart(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

<<<<<<< HEAD
    @objid ("5af8de23-a391-489c-8837-720e68bde2d7")
=======
    @objid ("a134c1d2-88d3-4647-99bb-48473285d9d6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1bc458b2-0341-41c2-9ff6-24257ad92fdb")
=======
    @objid ("45513742-22b6-47d2-ae7b-bbefc4a6ba91")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("8ef99ec2-f9f1-40e2-9467-da6515160a60")
=======
    @objid ("aaf31e93-a088-4523-bc1a-aefbb188034e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ceb722f7-cfc7-4062-93f0-311ec2380feb")
=======
    @objid ("223b0ce7-d9d0-451c-9e28-7ff794752b87")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("44241956-cad0-4307-882c-f3d607f34ff2")
=======
    @objid ("48b0788e-a499-4f1d-90d5-828699055637")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRequiredCommunicationsInstances(final CommunicationPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("811179d5-4387-4cdd-9b60-806f29638483")
=======
    @objid ("853b1550-e578-4143-bef2-2a11f712b956")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setParent(final DeploymentInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("692dff06-7fb6-4931-af59-45b3d9990c15")
=======
    @objid ("15a27b34-9ed0-4263-b7dc-f26fdc099646")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("626748f3-6bbf-4a81-adae-9836c04a9565")
=======
    @objid ("fb0e0bd3-4419-4ce9-9367-ae2f7db337e7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected SoftwareComponentInstance(final Instance elt) {
        super(elt);
    }

    @objid ("eb836565-9ba9-424d-96b5-05bec355c93e")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("16ef0260-88ef-40a0-9f5d-7b0526363e26")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c9c4dda9-c825-4c73-b4bf-ebf6dab6c695")
        private static Stereotype MDAASSOCDEP;

        @objid ("4fd0064d-e247-4b8d-bb9e-e98e3e77abed")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("18fc5c62-9654-4cea-976e-4099100650bd")
=======
        @objid ("93d39733-4e68-41cc-8aa4-ab6080d4b8f8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eb4de5a8-0124-49e6-ad5f-08b5c56a018e")
        private static Stereotype MDAASSOCDEP;

        @objid ("b9373a40-7152-468a-a837-56d53ae00825")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3d91d3b1-5a97-4a68-b306-c48fe81ce79d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
