/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
<<<<<<< HEAD
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Component;
=======
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << DeploymentTypeModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("87c3b466-cf74-4126-ac62-bd1fb3c2d59d")
public class DeploymentTypeModel extends DeploymentModel {
    @objid ("39ef547f-058f-409d-bf31-4e48a8782f71")
    public static final String STEREOTYPE_NAME = "DeploymentTypeModel";

    /**
     * Tells whether a {@link DeploymentTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c863ee0e-1236-414b-8d65-c8f52b681f66")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentTypeModel >> then instantiate a {@link DeploymentTypeModel} proxy.
     * 
     * @return a {@link DeploymentTypeModel} proxy on the created {@link Package}.
     */
    @objid ("742b9961-0166-4c20-a6c4-8bd25fc29ed0")
    public static DeploymentTypeModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModel.STEREOTYPE_NAME);
        return DeploymentTypeModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentTypeModel} proxy from a {@link Package} stereotyped << DeploymentTypeModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link DeploymentTypeModel} proxy or <i>null</i>.
     */
    @objid ("f9716ece-4d6c-4db1-a934-0c6ee9b2649e")
    public static DeploymentTypeModel instantiate(final Package obj) {
        return DeploymentTypeModel.canInstantiate(obj) ? new DeploymentTypeModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentTypeModel} proxy from a {@link Package} stereotyped << DeploymentTypeModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link DeploymentTypeModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3b5ef7c2-e80d-45ac-b577-21e128a3fcd2")
    public static DeploymentTypeModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (DeploymentTypeModel.canInstantiate(obj))
            return new DeploymentTypeModel(obj);
        else
            throw new IllegalArgumentException("DeploymentTypeModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'communications' role.<p>
     * Role description:
     * null
     */
    @objid ("bb81ed88-3cd8-42ad-9dee-fb169ccea613")
    public void addCommunications(final Communication obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DeploymentTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("communications");
            d.putTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "communications");
        }
    }

    /**
     * Add a value to the 'containers' role.<p>
     * Role description:
     * null
     */
    @objid ("6e1436ff-901b-4b39-ac8a-9dc3511dffc4")
    public void addContainers(final Container obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DeploymentTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("containers");
            d.putTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "containers");
        }
    }

    /**
     * Add a value to the 'hostings' role.<p>
     * Role description:
     * null
     */
    @objid ("1054e4dc-d204-4e51-91f0-20fc5cc8cb32")
    public void addHostings(final Hosting obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DeploymentTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("hostings");
            d.putTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "hostings");
        }
    }

    /**
     * Add a value to the 'locationCouplings' role.<p>
     * Role description:
     * null
     */
    @objid ("e6ccb47a-f81f-4d1b-9b87-26a654e51a77")
    public void addLocationCouplings(final LocationCoupling obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DeploymentTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("locationCouplings");
            d.putTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "locationCouplings");
        }
    }

    /**
     * Add a value to the 'paases' role.<p>
     * Role description:
     * null
     */
    @objid ("2f4f487e-d23f-4d35-9328-df2ed366b995")
    public void addPaases(final PaaS obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DeploymentTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("paases");
            d.putTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "paases");
        }
    }

    /**
     * Add a value to the 'requirementSets' role.<p>
     * Role description:
     * null
     */
    @objid ("3921ca4a-19f3-431f-8055-bf1991a5d763")
    public void addRequirementSets(final RequirementSet obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DeploymentTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("requirementSets");
            d.putTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "requirementSets");
        }
    }

    /**
     * Add a value to the 'softwareComponents' role.<p>
     * Role description:
     * null
     */
    @objid ("496a8bb3-52be-43e5-af3e-1e78291f0afd")
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DeploymentTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("softwareComponents");
            d.putTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponents");
        }
    }

    /**
     * Add a value to the 'vms' role.<p>
     * Role description:
     * null
     */
    @objid ("ad34b567-43cf-4b73-aaf5-0ebf7e495b68")
    public void addVms(final VM obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DeploymentTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("vms");
            d.putTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "vms");
        }
    }

    @objid ("c17f86ac-f9e0-40e0-bc7a-dcb4375293e4")
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
        DeploymentTypeModel other = (DeploymentTypeModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'communications' role.<p>
     * Role description:
     * null
     */
    @objid ("0cad8ac0-c3cf-4913-aec7-7a039df096d5")
    public List<Communication> getCommunications() {
        List<Communication> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
                    && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "communications")
                    && Communication.canInstantiate(d.getDependsOn()))
                results.add((Communication)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Communication.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'containers' role.<p>
     * Role description:
     * null
     */
    @objid ("dbd0d107-16e1-4aa6-96dc-3d2b6f0f4388")
    public List<Container> getContainers() {
        List<Container> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
<<<<<<< HEAD
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
                    && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "containers")
                    && Container.canInstantiate(d.getDependsOn()))
=======
          if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "containers")
              && Container.canInstantiate(d.getDependsOn()))
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
                results.add((Container)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Container.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("d3a4c7c5-72cc-4a25-9951-b87b0db3bfa9")
    @Override
    public Package getElement() {
        return (Package) super.getElement();
    }

    /**
     * Get the value of the 'globalRequirementSet' role.<p>
     * Role description:
     * null
     */
    @objid ("d49ce6d6-fbf9-4fc7-adcd-be8783d32cf1")
    public RequirementSet getGlobalRequirementSet() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
                    && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "globalRequirementSet")
                    && RequirementSet.canInstantiate(d.getDependsOn())) {
                return (RequirementSet)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RequirementSet.MdaTypes.STEREOTYPE_ELT.getName());
            }
        }
        return null;
    }

    /**
     * Get the values of the 'hostings' role.<p>
     * Role description:
     * null
     */
    @objid ("2144f947-b425-4ebf-9082-604f21924393")
    public List<Hosting> getHostings() {
        List<Hosting> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
                    && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "hostings")
                    && Hosting.canInstantiate(d.getDependsOn()))
                results.add((Hosting)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Hosting.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'locationCouplings' role.<p>
     * Role description:
     * null
     */
    @objid ("2e133bf0-a2d4-4bce-b2cd-27f81849e441")
    public List<LocationCoupling> getLocationCouplings() {
        List<LocationCoupling> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
                    && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "locationCouplings")
                    && LocationCoupling.canInstantiate(d.getDependsOn()))
                results.add((LocationCoupling)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LocationCoupling.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'paases' role.<p>
     * Role description:
     * null
     */
    @objid ("472a30bb-7288-447e-b9bf-746d28c7f9fd")
    public List<PaaS> getPaases() {
        List<PaaS> results = new ArrayList<>();
<<<<<<< HEAD
        for(ModelTree ownedElt : getElement().getOwnedElement()) {
            if (PaaS.canInstantiate(ownedElt)) {
                results.add(PaaS.instantiate((Component)ownedElt));
            }
=======
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "paases")
              && PaaS.canInstantiate(d.getDependsOn()))
                results.add((PaaS)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaS.MdaTypes.STEREOTYPE_ELT.getName()));
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'requirementSets' role.<p>
     * Role description:
     * null
     */
    @objid ("90742b61-5bc8-496a-a214-841f2d133fdb")
    public List<RequirementSet> getRequirementSets() {
        List<RequirementSet> results = new ArrayList<>();
<<<<<<< HEAD
        for(ModelTree ownedElt : getElement().getOwnedElement()) {
            if (RequirementSet.canInstantiate(ownedElt)) {
                results.add(RequirementSet.instantiate((Component)ownedElt));
            }
=======
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "requirementSets")
              && RequirementSet.canInstantiate(d.getDependsOn()))
                results.add((RequirementSet)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RequirementSet.MdaTypes.STEREOTYPE_ELT.getName()));
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'softwareComponents' role.<p>
     * Role description:
     * null
     */
    @objid ("1c992cd7-1548-4d4f-8263-a696a7713e61")
    public List<SoftwareComponent> getSoftwareComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
<<<<<<< HEAD
        for(ModelTree ownedElt : getElement().getOwnedElement()) {
            if (SoftwareComponent.canInstantiate(ownedElt)) {
                results.add(SoftwareComponent.instantiate((Component)ownedElt));
            }
=======
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponents")
              && SoftwareComponent.canInstantiate(d.getDependsOn()))
                results.add((SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName()));
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'vms' role.<p>
     * Role description:
     * null
     */
    @objid ("f34bafdc-c783-4e74-a03e-f1c1127eebde")
    public List<VM> getVms() {
        List<VM> results = new ArrayList<>();
        for(ModelTree ownedElt : getElement().getOwnedElement()) {
            if (VM.canInstantiate(ownedElt)) {
                results.add(VM.instantiate((Component)ownedElt));
            }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2135e545-45d9-4228-892b-fc39a087f066")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'communications' role.<p>
     * Role description:
     * null
     */
    @objid ("95cd6b9b-fea6-4540-a395-2b27d100e990")
    public boolean removeCommunications(final Communication obj) {
        if (obj != null) {
<<<<<<< HEAD
            for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
                if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
                    if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                        d.delete();
                        return true;
                    }
            }
=======
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        }
        return false;
    }

    /**
     * Remove a value from the 'containers' role.<p>
     * Role description:
     * null
     */
    @objid ("cb4e5a88-bc55-4d96-a5fc-360a7c468572")
    public boolean removeContainers(final Container obj) {
        if (obj != null) {
<<<<<<< HEAD
            for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
                if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
                    if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                        d.delete();
                        return true;
                    }
            }
=======
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        }
        return false;
    }

    /**
     * Remove a value from the 'hostings' role.<p>
     * Role description:
     * null
     */
    @objid ("bba5bd4e-31e9-46e4-958f-dbef5b94630f")
    public boolean removeHostings(final Hosting obj) {
        if (obj != null) {
<<<<<<< HEAD
            for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
                if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
                    if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                        d.delete();
                        return true;
                    }
            }
=======
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        }
        return false;
    }

    /**
     * Remove a value from the 'locationCouplings' role.<p>
     * Role description:
     * null
     */
    @objid ("83cc1f37-00a4-4431-aeb9-f391dcde88d3")
    public boolean removeLocationCouplings(final LocationCoupling obj) {
        if (obj != null) {
<<<<<<< HEAD
            for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
                if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
                    if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                        d.delete();
                        return true;
                    }
            }
=======
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        }
        return false;
    }

    /**
     * Remove a value from the 'paases' role.<p>
     * Role description:
     * null
     */
    @objid ("a2c26783-102f-4a34-af79-98bdaf5e6d0a")
    public boolean removePaases(final PaaS obj) {
        if (obj != null) {
<<<<<<< HEAD
            for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
                if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
                    if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                        d.delete();
                        return true;
                    }
            }
=======
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        }
        return false;
    }

    /**
     * Remove a value from the 'requirementSets' role.<p>
     * Role description:
     * null
     */
    @objid ("f36d92f8-a742-4bdc-956e-4c126731de20")
    public boolean removeRequirementSets(final RequirementSet obj) {
        if (obj != null) {
<<<<<<< HEAD
            for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
                if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
                    if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                        d.delete();
                        return true;
                    }
            }
=======
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        }
        return false;
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     */
    @objid ("a0faf296-72f3-4377-ab0d-fab82a465743")
    public boolean removeSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
<<<<<<< HEAD
            for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
                if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
                    if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                        d.delete();
                        return true;
                    }
            }
=======
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        }
        return false;
    }

    /**
     * Remove a value from the 'vms' role.<p>
     * Role description:
     * null
     */
    @objid ("ff96c0c5-290a-4f25-8767-e7dadd654c1a")
    public boolean removeVms(final VM obj) {
        if (obj != null) {
<<<<<<< HEAD
            for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
                if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
                    if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                        d.delete();
                        return true;
                    }
            }
=======
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        }
        return false;
    }

    /**
     * Set the value of the 'globalRequirementSet' role.<p>
     * Role description:
     * null
     */
    @objid ("3c842a47-a887-4f0e-83f6-ffec52f89367")
    public void setGlobalRequirementSet(final RequirementSet obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "globalRequirementSet")) {
                dep = d;
                break;
            }
        if (obj == null) {
            if(dep != null) dep.delete();
        } else {
            if (dep == null) {
                IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
                dep = session.getModel().createDependency(this.elt, obj.getElement(), DeploymentTypeModel.MdaTypes.MDAASSOCDEP);
                dep.setName("globalRequirementSet");      dep.putTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "globalRequirementSet");
            }
            dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("89e6c1c8-810b-4606-b324-e3ffe83eaba2")
    protected DeploymentTypeModel(final Package elt) {
        super(elt);
    }

<<<<<<< HEAD
    @objid ("2b046734-8a8a-4888-912d-ebd6a778865e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getSoftwareComponents());
        result.addAll(getVms());
        result.addAll(getPaases());
        result.addAll(getContainers());
        result.addAll(getRequirementSets());
        return result;
    }

=======
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
    @objid ("aa0491e2-0f18-46c3-ba92-4686c725d9fa")
    public static final class MdaTypes {
        @objid ("df09dd21-98b9-45fe-b2de-6fcca0788959")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e5b7ea6c-6127-4c5b-8133-d481b9c462be")
        private static Stereotype MDAASSOCDEP;

        @objid ("bec31b2b-4033-478e-bd7f-e105bd04e14d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ac272b2d-9810-4e46-a961-04f2d8261368")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "24bc0f0f-63bd-4249-8f58-47597e6cae12");
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
