/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << DeploymentInstanceModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("32850d2a-548f-4680-aa57-5290cf509da5")
public class DeploymentInstanceModel extends DeploymentModel {
    @objid ("ab47623e-fd86-4196-a741-38fb42d1b8c2")
    public static final String STEREOTYPE_NAME = "DeploymentInstanceModel";

    /**
     * Tells whether a {@link DeploymentInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7bcc953a-3c84-4f79-95aa-628aff15426d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentInstanceModel >> then instantiate a {@link DeploymentInstanceModel} proxy.
     * 
     * @return a {@link DeploymentInstanceModel} proxy on the created {@link Package}.
     */
    @objid ("cb221d6a-7e43-4e14-9a43-f6575af29dbd")
    public static DeploymentInstanceModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModel.STEREOTYPE_NAME);
        return DeploymentInstanceModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentInstanceModel} proxy from a {@link Package} stereotyped << DeploymentInstanceModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link DeploymentInstanceModel} proxy or <i>null</i>.
     */
    @objid ("03d1fc43-cfc0-4242-b30f-2c9f9cdbd51b")
    public static DeploymentInstanceModel instantiate(final Package obj) {
        return DeploymentInstanceModel.canInstantiate(obj) ? new DeploymentInstanceModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentInstanceModel} proxy from a {@link Package} stereotyped << DeploymentInstanceModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link DeploymentInstanceModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("46957d9a-b66e-461c-82d1-97b7a286fe41")
    public static DeploymentInstanceModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (DeploymentInstanceModel.canInstantiate(obj))
        	return new DeploymentInstanceModel(obj);
        else
        	throw new IllegalArgumentException("DeploymentInstanceModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'communicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("23557031-c7bb-4853-9074-808dc9f880d0")
    public void addCommunicationInstances(final CommunicationInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, DeploymentInstanceModel.MdaTypes.MDAASSOCDEP);
            d.setName("parent");
            d.putTagValue(DeploymentInstanceModel.MdaTypes.MDAASSOCDEP_ROLE, "parent");
        }
    }

    /**
     * Add a value to the 'containerInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f1eca0f8-49dd-48f1-bd06-656aecff0a8c")
    public void addContainerInstances(final ContainerInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'paasInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("10ad9735-e356-4084-a863-20c0f30e9ae4")
    public void addPaasInstances(final PaaSInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'softwareComponentInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("66aaab55-4c0c-47d8-8b2d-18b01dd9ba10")
    public void addSoftwareComponentInstances(final SoftwareComponentInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'vmInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9fb0b463-9342-43a8-b028-9b577fdbea46")
    public void addVmInstances(final VMInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("cfede1cb-344c-4c8b-9a9a-ba6d23a33f9d")
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
        DeploymentInstanceModel other = (DeploymentInstanceModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'communicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f197d5ff-f164-4966-aad7-1966a8b7cba2")
    public List<CommunicationInstance> getCommunicationInstances() {
        List<CommunicationInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(DeploymentInstanceModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DeploymentInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "parent")
              && CommunicationInstance.canInstantiate(d.getImpacted())) {
                 results.add((CommunicationInstance)CamelDesignerProxyFactory.instantiate(d.getImpacted(), CommunicationInstance.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'containerInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("918eb59d-1657-4453-8ab4-570715e44e51")
    public List<ContainerInstance> getContainerInstances() {
        List<ContainerInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared())
        	if (ContainerInstance.canInstantiate(mObj))
        			results.add((ContainerInstance)CamelDesignerProxyFactory.instantiate(mObj, ContainerInstance.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("e6810c1c-32a0-48a3-b3e9-96a8b15cd5cc")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'paasInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d8ad1c2c-613a-49e8-9dd1-74a8f010eded")
    public List<PaaSInstance> getPaasInstances() {
        List<PaaSInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared())
        	if (PaaSInstance.canInstantiate(mObj))
        			results.add((PaaSInstance)CamelDesignerProxyFactory.instantiate(mObj, PaaSInstance.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'softwareComponentInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b5018ddf-f3f1-4ec9-ab30-fd191581d868")
    public List<SoftwareComponentInstance> getSoftwareComponentInstances() {
        List<SoftwareComponentInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared())
        	if (SoftwareComponentInstance.canInstantiate(mObj))
        			results.add((SoftwareComponentInstance)CamelDesignerProxyFactory.instantiate(mObj, SoftwareComponentInstance.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4bd362d6-cfff-4846-a95e-09746614c78b")
    public DeploymentTypeModel getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DeploymentInstanceModel.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DeploymentInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "type")){
                  if (DeploymentTypeModel.canInstantiate(d.getDependsOn()))
                     return (DeploymentTypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentTypeModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'vmInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cf861654-18e0-4d37-b698-602bd240bc0c")
    public List<VMInstance> getVmInstances() {
        List<VMInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared())
        	if (VMInstance.canInstantiate(mObj))
        			results.add((VMInstance)CamelDesignerProxyFactory.instantiate(mObj, VMInstance.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    @objid ("76353435-79bd-4090-a5f2-419670fe6431")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'communicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("324e6100-8326-4705-ad5c-2a562a2746cb")
    public boolean removeCommunicationInstances(final CommunicationInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(DeploymentInstanceModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "parent"))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'containerInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("973c3e4e-6138-4f72-ac5d-cf8e95307927")
    public boolean removeContainerInstances(final ContainerInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'paasInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("65ba9613-5db8-4fdd-bacd-bc9db298ba31")
    public boolean removePaasInstances(final PaaSInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'softwareComponentInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0c765763-97be-4bab-a52a-8ca3b7b8ec45")
    public boolean removeSoftwareComponentInstances(final SoftwareComponentInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'vmInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("71dd8c3d-9f2f-407d-9861-ae84a10be87a")
    public boolean removeVmInstances(final VMInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("62d0d8bf-a78c-4a34-af9f-2f608332c8a7")
    public void setType(final DeploymentTypeModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DeploymentInstanceModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DeploymentInstanceModel.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(DeploymentInstanceModel.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("148297e9-f396-444d-9a01-97f3f5180299")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("f9aca4d1-e050-46f5-aa4f-40ac08da5bd9")
    protected DeploymentInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("3bc27954-cfa5-4cd5-95f8-63b26f92d695")
    public static final class MdaTypes {
        @objid ("09e3b96c-5ff5-4856-9d3e-47265aa84afd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e27a464c-f6df-4cc6-8085-a81ee166ad35")
        private static Stereotype MDAASSOCDEP;

        @objid ("20e0b87b-3013-4259-a58c-818e54d24a83")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("08a617ca-aaf7-425f-b4cf-ce5bf663dd61")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b43cbec3-a3d4-4d2b-90c9-eb4a56ed3ca9");
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
