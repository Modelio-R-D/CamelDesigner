/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << DeploymentTypeModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("87c3b466-cf74-4126-ac62-bd1fb3c2d59d")
public class DeploymentTypeModel extends DeploymentModel {
    @objid ("e47c33ba-9106-48ed-a25d-a38e7e9732a7")
    public static final String STEREOTYPE_NAME = "DeploymentTypeModel";

    /**
     * Tells whether a {@link DeploymentTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3a92d2d0-4947-449d-84e3-076ba870fbdb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentTypeModel >> then instantiate a {@link DeploymentTypeModel} proxy.
     * 
     * @return a {@link DeploymentTypeModel} proxy on the created {@link Package}.
     */
    @objid ("816c911c-6e4d-4d3c-a1bf-3b916d83f157")
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
    @objid ("8dca6401-33be-4797-ad46-25a6ea8def1a")
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
    @objid ("acc983f8-d81c-46a6-a9d3-baa66fd1af84")
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
    @objid ("78a72676-fe48-48fc-bf6c-0063203fd032")
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
    @objid ("5c82aa98-ada3-47f4-877d-d52e9589f7d9")
    public void addContainers(final Container obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'hostings' role.<p>
     * Role description:
     * null
     */
    @objid ("1603c6d8-6b2e-4596-b8d7-5de3519dc485")
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
    @objid ("8129ac20-b57e-4f46-b169-61f1d9fd7003")
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
    @objid ("399a5fb6-e5b6-4472-be49-101cc8e325c0")
    public void addPaases(final PaaS obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'requirementSets' role.<p>
     * Role description:
     * null
     */
    @objid ("7d9e915c-797c-4219-9d7e-16569e017537")
    public void addRequirementSets(final RequirementSet obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'softwareComponents' role.<p>
     * Role description:
     * null
     */
    @objid ("d872de9a-95b7-4a8c-ac0c-bcbdbad929a6")
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'vms' role.<p>
     * Role description:
     * null
     */
    @objid ("4381db69-7a21-4b4d-9570-b66e63fd8f80")
    public void addVms(final VM obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("d1c81322-3fde-48f1-8d73-1dbcc52998a3")
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
    @objid ("2dbcface-ffb8-4bf1-bba8-4a81d95afccc")
    public List<Communication> getCommunications() {
        List<Communication> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "communications")){
              if (Communication.canInstantiate(d.getDependsOn()))
                results.add((Communication)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Communication.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'containers' role.<p>
     * Role description:
     * null
     */
    @objid ("12a5d906-aaea-4a49-b8eb-51d0316d083a")
    public List<Container> getContainers() {
        List<Container> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (Container.canInstantiate(mObj))
                    results.add((Container)CamelDesignerProxyFactory.instantiate(mObj, Container.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("640df425-b802-49b5-a10f-f976176230c3")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the value of the 'globalRequirementSet' role.<p>
     * Role description:
     * null
     */
    @objid ("9f51a088-8e73-4dcf-b858-8297ca89b16b")
    public RequirementSet getGlobalRequirementSet() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "globalRequirementSet")){
                  if (RequirementSet.canInstantiate(d.getDependsOn()))
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
    @objid ("cce6eba1-18a3-45c3-9c9e-03f8bf094467")
    public List<Hosting> getHostings() {
        List<Hosting> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "hostings")){
              if (Hosting.canInstantiate(d.getDependsOn()))
                results.add((Hosting)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Hosting.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'locationCouplings' role.<p>
     * Role description:
     * null
     */
    @objid ("8569727b-9e8a-4fff-a7de-9310609a5eda")
    public List<LocationCoupling> getLocationCouplings() {
        List<LocationCoupling> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "locationCouplings")){
              if (LocationCoupling.canInstantiate(d.getDependsOn()))
                results.add((LocationCoupling)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LocationCoupling.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'paases' role.<p>
     * Role description:
     * null
     */
    @objid ("2e5dd874-a91a-4133-9129-195601e6f74e")
    public List<PaaS> getPaases() {
        List<PaaS> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (PaaS.canInstantiate(mObj))
                    results.add((PaaS)CamelDesignerProxyFactory.instantiate(mObj, PaaS.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'requirementSets' role.<p>
     * Role description:
     * null
     */
    @objid ("1266b2a7-a213-42c2-8622-89efaf23eb5c")
    public List<RequirementSet> getRequirementSets() {
        List<RequirementSet> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (RequirementSet.canInstantiate(mObj))
                    results.add((RequirementSet)CamelDesignerProxyFactory.instantiate(mObj, RequirementSet.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'softwareComponents' role.<p>
     * Role description:
     * null
     */
    @objid ("26183ba5-a657-47d3-b4b3-4f4519e3dd90")
    public List<SoftwareComponent> getSoftwareComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (Sensor.canInstantiate(mObj))
                    results.add((Sensor)CamelDesignerProxyFactory.instantiate(mObj, Sensor.STEREOTYPE_NAME));
            if (SoftwareComponent.canInstantiate(mObj))
                    results.add((SoftwareComponent)CamelDesignerProxyFactory.instantiate(mObj, SoftwareComponent.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'vms' role.<p>
     * Role description:
     * null
     */
    @objid ("e863fab1-9e06-4d92-be5f-9a05e8df5156")
    public List<VM> getVms() {
        List<VM> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (VM.canInstantiate(mObj))
                    results.add((VM)CamelDesignerProxyFactory.instantiate(mObj, VM.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    @objid ("a016ccae-1e1b-4e4d-81b8-c90ee5d133eb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'communications' role.<p>
     * Role description:
     * null
     */
    @objid ("f2dc436a-09a5-41b1-b42d-b6d4e2e59f0b")
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
    @objid ("fce5a1e5-b75f-4bcc-9fb0-fdff240e2bdf")
    public boolean removeContainers(final Container obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'hostings' role.<p>
     * Role description:
     * null
     */
    @objid ("3094c934-493b-4be6-b9a5-c45c3ecb3f04")
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
    @objid ("4175da27-481b-4257-8b75-713a3447cf2e")
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
    @objid ("658aa5e7-5f61-474b-b738-2fc658ec6fc5")
    public boolean removePaases(final PaaS obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'requirementSets' role.<p>
     * Role description:
     * null
     */
    @objid ("8d914cde-68dc-4994-8a6c-aee4c467c39a")
    public boolean removeRequirementSets(final RequirementSet obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     */
    @objid ("9824090b-9246-48f6-9e6d-af3bebcbabeb")
    public boolean removeSoftwareComponents(final SoftwareComponent obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'vms' role.<p>
     * Role description:
     * null
     */
    @objid ("87003e48-2ef0-4a0f-adea-a6bf1c40e34e")
    public boolean removeVms(final VM obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'globalRequirementSet' role.<p>
     * Role description:
     * null
     */
    @objid ("0d3d8491-5077-48ef-a630-ae3a98788ddf")
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

    @objid ("da1e954d-f283-414d-84ae-cade57602252")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getSoftwareComponents());
        result.addAll(getVms());
        result.addAll(getPaases());
        result.addAll(getCommunications());
        result.addAll(getHostings());
        result.addAll(getRequirementSets());
        result.addAll(getLocationCouplings());
        result.addAll(getContainers());
        return result;
    }

    @objid ("63a17325-9924-4262-b292-a3d0bf96122a")
    protected DeploymentTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("aa0491e2-0f18-46c3-ba92-4686c725d9fa")
    public static final class MdaTypes {
        @objid ("9c6e8edf-66a3-487b-95d0-ba996c6f1e49")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b7ddbac4-1437-454f-959b-9c4aae80d756")
        private static Stereotype MDAASSOCDEP;

        @objid ("3259719f-6d28-448a-8557-aa3737906a24")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2555db28-3a70-452f-b19c-00cb14ceb764")
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
