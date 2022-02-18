/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("3653ce3d-3aa1-443d-af3d-6a467e91bf04")
    public static final String STEREOTYPE_NAME = "DeploymentInstanceModel";

    /**
     * Tells whether a {@link DeploymentInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8c8ff56e-be01-495b-ba5e-388a06b4b16b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentInstanceModel >> then instantiate a {@link DeploymentInstanceModel} proxy.
     * 
     * @return a {@link DeploymentInstanceModel} proxy on the created {@link Package}.
     */
    @objid ("c070ee6b-0496-49e7-9e0a-8ee78327cfe4")
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
    @objid ("b6b308f8-d60e-48cb-ae4c-87d1e04dae2c")
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
    @objid ("ee2027c5-325d-4bfb-acef-0978c96d810a")
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
    @objid ("a2a447fe-7deb-418a-9125-79dcfd985b94")
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
    @objid ("6b091e2a-a66d-4bca-8f63-65709426dd6d")
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
    @objid ("b82e5303-6300-4e60-ae0d-f928f70b8d83")
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
    @objid ("37857d4e-487b-4491-bf6e-3d4bdf92393f")
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
    @objid ("89063b06-5107-4247-80f0-03e90463376d")
    public void addVmInstances(final VMInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("cb0ed37f-0208-4246-bf6b-dc1566f0a659")
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
    @objid ("07bc52db-f245-4969-8273-b55b84a4ded8")
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
    @objid ("67b3cd14-7511-480b-abb4-95afd6bb35c2")
    public List<ContainerInstance> getContainerInstances() {
        List<ContainerInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (ContainerInstance.canInstantiate(mObj))
        			results.add((ContainerInstance)CamelDesignerProxyFactory.instantiate(mObj, ContainerInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("5073ed71-247e-4226-9a78-5dc7f7d08de1")
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
    @objid ("00e082fe-f9c9-4f79-af17-9fbc70b79019")
    public List<PaaSInstance> getPaasInstances() {
        List<PaaSInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (PaaSInstance.canInstantiate(mObj))
        			results.add((PaaSInstance)CamelDesignerProxyFactory.instantiate(mObj, PaaSInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'softwareComponentInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f1b3fb28-64ec-4528-8db4-88bf2d6789c7")
    public List<SoftwareComponentInstance> getSoftwareComponentInstances() {
        List<SoftwareComponentInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (SoftwareComponentInstance.canInstantiate(mObj))
        			results.add((SoftwareComponentInstance)CamelDesignerProxyFactory.instantiate(mObj, SoftwareComponentInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8a97fe04-f6ea-40e9-8307-35fe12873e4d")
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
    @objid ("a80abff9-33f3-48b0-b9da-b06b1ee89e20")
    public List<VMInstance> getVmInstances() {
        List<VMInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (VMInstance.canInstantiate(mObj))
        			results.add((VMInstance)CamelDesignerProxyFactory.instantiate(mObj, VMInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("0c1eb28d-4954-41d6-8ec4-55ada3e37169")
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
    @objid ("5e7c7c72-58e3-47bb-93b6-e2f11f10ea5a")
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
    @objid ("2879b85d-62ee-4d3b-a862-79f32bf5936b")
    public boolean removeContainerInstances(final ContainerInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'paasInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9eecdf82-2aa8-4671-a2de-3ce1ba76f9e4")
    public boolean removePaasInstances(final PaaSInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'softwareComponentInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("eb185991-175f-4c58-baf3-68aa8ca7bdf1")
    public boolean removeSoftwareComponentInstances(final SoftwareComponentInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'vmInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cc090495-b2fb-4cb6-929e-b5f35c93a281")
    public boolean removeVmInstances(final VMInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5d394af7-0cf3-4519-ac0c-356280841051")
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

    @objid ("a26d323c-f474-4507-8542-3f6e8afd09ab")
    protected DeploymentInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("3bc27954-cfa5-4cd5-95f8-63b26f92d695")
    public static final class MdaTypes {
        @objid ("f1dfd993-2077-4fec-a196-60aa7b6ebfb2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b29ff2d2-f477-439a-8eee-ba367124c72a")
        private static Stereotype MDAASSOCDEP;

        @objid ("c6275baa-f239-4ed4-9be3-5b2d3e2bb5b6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d5c7547-afb4-4866-9adc-7fb3a01bd8cd")
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
