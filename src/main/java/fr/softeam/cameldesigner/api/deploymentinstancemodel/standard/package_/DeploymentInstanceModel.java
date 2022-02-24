/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("5cae30dd-505f-4fc1-a730-fb537f535be9")
    public static final String STEREOTYPE_NAME = "DeploymentInstanceModel";

    /**
     * Tells whether a {@link DeploymentInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("56e1fb1a-db2a-40cd-bd55-077e04d7cfb4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentInstanceModel >> then instantiate a {@link DeploymentInstanceModel} proxy.
     * 
     * @return a {@link DeploymentInstanceModel} proxy on the created {@link Package}.
     */
    @objid ("f21fbbfd-a8f3-4e55-ad45-0d6d96102315")
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
    @objid ("1a183443-a7bb-40ae-9a62-cbac7549da6b")
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
    @objid ("a5bae9a3-c4a1-4f9f-9243-9117c4906b24")
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
    @objid ("d3fd3990-6af3-4963-be6c-3637963f3f68")
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
    @objid ("f5d48b29-7c59-4bdd-a79c-1cf3f08e78f9")
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
    @objid ("c1a52e9d-52a0-4502-88bf-4d73f1255969")
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
    @objid ("4350c5c1-40ad-40f4-9dde-297bf7839f96")
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
    @objid ("38f18ef4-714a-4e9d-bbc6-b1bf9457430c")
    public void addVmInstances(final VMInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("081bc223-f54b-4ef4-8aa6-027b13868599")
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
    @objid ("d948ff84-a94c-45e0-9133-4356f10051f4")
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
    @objid ("6ae54181-a6cd-4d47-8c2b-bc19312cffb0")
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
    @objid ("b8498c03-110b-463a-8b23-41d06493f849")
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
    @objid ("83df343f-fa2f-42e2-9123-d4b4948e4377")
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
    @objid ("d2877e54-b280-4a05-ab6d-06e102e31b72")
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
    @objid ("649b096f-14ca-4789-a958-f6c268f70bf7")
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
    @objid ("5b8eb201-1eca-49ab-a237-0c157ba2d90a")
    public List<VMInstance> getVmInstances() {
        List<VMInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (VMInstance.canInstantiate(mObj))
        			results.add((VMInstance)CamelDesignerProxyFactory.instantiate(mObj, VMInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("5320c598-3d93-4c16-a461-d3222a82864d")
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
    @objid ("12bd1691-6133-4cbd-906d-955997e76967")
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
    @objid ("a6994cd5-0f39-4a8c-8e8b-91166a1444a9")
    public boolean removeContainerInstances(final ContainerInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'paasInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("aa5dbf82-25a6-43d5-8434-9ea4c2e98a4f")
    public boolean removePaasInstances(final PaaSInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'softwareComponentInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("44d75c87-0989-4144-9779-0aab4fddf618")
    public boolean removeSoftwareComponentInstances(final SoftwareComponentInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'vmInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4d9f0ba2-ba51-438e-af83-8c18beebde65")
    public boolean removeVmInstances(final VMInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5489a59e-0314-4146-b002-d2d043487dcb")
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

    @objid ("b2fcae3f-af2a-4478-974e-9cc4e744168f")
    protected DeploymentInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("3bc27954-cfa5-4cd5-95f8-63b26f92d695")
    public static final class MdaTypes {
        @objid ("181be285-dea3-4405-9d32-3515b1cdd778")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bca89140-af4d-4a32-8650-d75f50144e9a")
        private static Stereotype MDAASSOCDEP;

        @objid ("3bce86cc-390f-48d3-9547-f4d5eb91049f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d979c0eb-4bed-492b-a452-23c8b910e78c")
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
