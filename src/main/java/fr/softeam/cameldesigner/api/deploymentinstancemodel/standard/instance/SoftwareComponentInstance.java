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
    @objid ("4b0d0981-9802-4708-9d81-ff26e94325ca")
    public static final String STEREOTYPE_NAME = "SoftwareComponentInstance";

    /**
     * Tells whether a {@link SoftwareComponentInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SoftwareComponentInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("745d5f29-6c28-4e8b-9f25-996026acf621")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SoftwareComponentInstance >> then instantiate a {@link SoftwareComponentInstance} proxy.
     * 
     * @return a {@link SoftwareComponentInstance} proxy on the created {@link Instance}.
     */
    @objid ("29f89dd1-1962-4ef5-add6-81471b2f6757")
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
    @objid ("27ae7d76-5be5-449a-b419-945ef31cb521")
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
    @objid ("16affe44-5a2f-48a0-b4c8-6c637d0a40ea")
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
    @objid ("1cd6a1a4-3897-4abe-9811-ce84f1880fde")
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
    @objid ("5fd744a0-60ad-4d37-9aef-73117775d366")
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
    @objid ("5b5621ea-1fee-45c7-96e5-57c94b166df2")
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
    @objid ("3168d207-6b57-4ab9-b4ae-867b56893723")
    public void addRequiredCommunicationsInstances(final CommunicationPort obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

    @objid ("34e8623c-d4e5-402d-9ca5-faa6cc0b398e")
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
    @objid ("d8ac98b5-864c-4390-9af1-1f8e9dc626dd")
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
    @objid ("28894336-b6eb-41a9-bdba-1b2765575755")
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
    @objid ("9a8b0e80-0d7f-4858-aba8-fd1ccd6f4550")
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
    @objid ("6c9826b4-345a-4b28-bc4f-165f9bd68fd7")
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
    @objid ("b92ce633-856a-4192-96cb-473547b3d534")
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'requiredCommunicationsInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0c4e228b-4780-4033-80f2-8b21a700d8ae")
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
    @objid ("7469bc96-a29c-4dd1-bbba-a8ff329e6923")
    public HostingPort getRequiredHostInstance() {
          for (Port obj : ((Instance) this.elt).getPart(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("8586bae6-238c-42ae-91fc-c78bbf08f221")
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
    @objid ("1ec84d90-a957-4fbc-be44-37d3050fc2a1")
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
    @objid ("8918cda3-14ad-47d5-8a5c-a115cca8b269")
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
    @objid ("c2d35d81-2e41-4f67-b454-fbba870b4567")
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
    @objid ("6150ca1b-ee2b-462a-91d3-59c6087568eb")
    public boolean removeRequiredCommunicationsInstances(final CommunicationPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9e898719-6fb5-4dea-8cb8-8324fbb927ba")
    public void setParent(final DeploymentInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bcfc094c-a703-4a31-b487-2fd60d83c806")
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

    @objid ("01fb3f3a-009a-456b-a8e7-bfb16ce40bb9")
    protected SoftwareComponentInstance(final Instance elt) {
        super(elt);
    }

    @objid ("eb836565-9ba9-424d-96b5-05bec355c93e")
    public static final class MdaTypes {
        @objid ("98ee0cb5-77fb-4c28-bfb9-9b200b4544d4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("70a4f621-348b-4507-b9ec-b37f4c7835c0")
        private static Stereotype MDAASSOCDEP;

        @objid ("7acab73b-7496-4758-9162-c156e92bd3b7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fdae1f4f-03b1-49ad-bafc-6039cc155a6d")
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
