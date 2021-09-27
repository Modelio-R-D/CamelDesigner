/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

/**
 * Proxy class to handle a {@link Package} with << DeploymentTypeModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class DeploymentTypeModel extends DeploymentModel {
    public static final String STEREOTYPE_NAME = "DeploymentTypeModel";

    /**
     * Tells whether a {@link DeploymentTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     *
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentTypeModel >> then instantiate a {@link DeploymentTypeModel} proxy.
     *
     * @return a {@link DeploymentTypeModel} proxy on the created {@link Package}.
     */
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
    public void addVms(final VM obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DeploymentTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("vms");
            d.putTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "vms");
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
        DeploymentTypeModel other = (DeploymentTypeModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'communications' role.<p>
     * Role description:
     * null
     */
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

//    /**
//     * Get the values of the 'containers' role.<p>
//     * Role description:
//     * null
//     */
//    public List<Container> getContainers() {
//        List<Container> results = new ArrayList<>();
//        for (Dependency d : this.elt.getDependsOnDependency()) {
//          if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
//              && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "containers")
//              && Container.canInstantiate(d.getDependsOn()))
//                results.add((Container)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Container.MdaTypes.STEREOTYPE_ELT.getName()));
//        }
//        return Collections.unmodifiableList(results);
//    }

    /**
     * Get the underlying {@link Package}.
     *
     * @return the Package represented by this proxy, never null.
     */
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the value of the 'globalRequirementSet' role.<p>
     * Role description:
     * null
     */
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

//    /**
//     * Get the values of the 'paases' role.<p>
//     * Role description:
//     * null
//     */
//    public List<PaaS> getPaases() {
//        List<PaaS> results = new ArrayList<>();
//        for (Dependency d : this.elt.getDependsOnDependency()) {
//          if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
//              && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "paases")
//              && PaaS.canInstantiate(d.getDependsOn()))
//                results.add((PaaS)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaS.MdaTypes.STEREOTYPE_ELT.getName()));
//        }
//        return Collections.unmodifiableList(results);
//    }
//
//    /**
//     * Get the values of the 'requirementSets' role.<p>
//     * Role description:
//     * null
//     */
//    public List<RequirementSet> getRequirementSets() {
//        List<RequirementSet> results = new ArrayList<>();
//        for (Dependency d : this.elt.getDependsOnDependency()) {
//          if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
//              && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "requirementSets")
//              && RequirementSet.canInstantiate(d.getDependsOn()))
//                results.add((RequirementSet)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RequirementSet.MdaTypes.STEREOTYPE_ELT.getName()));
//        }
//        return Collections.unmodifiableList(results);
//    }

//    /**
//     * Get the values of the 'softwareComponents' role.<p>
//     * Role description:
//     * null
//     */
//    public List<SoftwareComponent> getSoftwareComponents() {
//        List<SoftwareComponent> results = new ArrayList<>();
//        for (Dependency d : this.elt.getDependsOnDependency()) {
//          if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
//              && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponents")
//              && SoftwareComponent.canInstantiate(d.getDependsOn()))
//                results.add((SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName()));
//        }
//        return Collections.unmodifiableList(results);
//    }

    /**
     * Get the values of the 'vms' role.<p>
     * Role description:
     * null
     */
    public List<VM> getVms() {
        List<VM> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "vms")
              && VM.canInstantiate(d.getDependsOn()))
                results.add((VM)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VM.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'communications' role.<p>
     * Role description:
     * null
     */
    public boolean removeCommunications(final Communication obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'containers' role.<p>
     * Role description:
     * null
     */
    public boolean removeContainers(final Container obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'hostings' role.<p>
     * Role description:
     * null
     */
    public boolean removeHostings(final Hosting obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'locationCouplings' role.<p>
     * Role description:
     * null
     */
    public boolean removeLocationCouplings(final LocationCoupling obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'paases' role.<p>
     * Role description:
     * null
     */
    public boolean removePaases(final PaaS obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'requirementSets' role.<p>
     * Role description:
     * null
     */
    public boolean removeRequirementSets(final RequirementSet obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     */
    public boolean removeSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'vms' role.<p>
     * Role description:
     * null
     */
    public boolean removeVms(final VM obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(getSoftwareComponents());
        result.addAll(getVMs());
        result.addAll(getPaases());
        result.addAll(getContainers());
        result.addAll(getRequirementSets());
        return result;
    }

    public Collection<SoftwareComponent> getSoftwareComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (SoftwareComponent.canInstantiate(mObj))
                results.add(SoftwareComponent.safeInstantiate((Component) mObj));

        return Collections.unmodifiableList(results);
    }


    public Collection<VM> getVMs() {
        List<VM> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (VM.canInstantiate(mObj))
                results.add(VM.safeInstantiate((Component) mObj));

        return Collections.unmodifiableList(results);
    }

    public Collection<PaaS> getPaases() {
        List<PaaS> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (PaaS.canInstantiate(mObj))
                results.add(PaaS.safeInstantiate((Component) mObj));

        return Collections.unmodifiableList(results);
    }

    public Collection<Container> getContainers() {
        List<Container> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (Container.canInstantiate(mObj))
                results.add(Container.safeInstantiate((Component) mObj));

        return Collections.unmodifiableList(results);
    }


    public Collection<RequirementSet> getRequirementSets() {
        List<RequirementSet> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (RequirementSet.canInstantiate(mObj))
                results.add(RequirementSet.safeInstantiate((Class) mObj));

        return Collections.unmodifiableList(results);
    }



    /**
     * Set the value of the 'globalRequirementSet' role.<p>
     * Role description:
     * null
     */
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

    protected DeploymentTypeModel(final Package elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
