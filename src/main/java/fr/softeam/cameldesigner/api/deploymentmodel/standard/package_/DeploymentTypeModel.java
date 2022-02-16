/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("f13259c0-ec7f-4547-b508-e5f2f2afe905")
    public static final String STEREOTYPE_NAME = "DeploymentTypeModel";

    /**
     * Tells whether a {@link DeploymentTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("34b6da92-ce32-464a-ba45-a05e3ac6dbb2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentTypeModel >> then instantiate a {@link DeploymentTypeModel} proxy.
     * 
     * @return a {@link DeploymentTypeModel} proxy on the created {@link Package}.
     */
    @objid ("f4ac560a-f75f-4543-aef1-3fb77ffbfb39")
    public static DeploymentTypeModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModel.STEREOTYPE_NAME);
        return DeploymentTypeModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentTypeModel} proxy from a {@link Package} stereotyped << DeploymentTypeModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link DeploymentTypeModel} proxy or <i>null</i>.
     */
    @objid ("2a93e49c-68c4-421d-9b2b-a8898da0773a")
    public static DeploymentTypeModel instantiate(final Package obj) {
        return DeploymentTypeModel.canInstantiate(obj) ? new DeploymentTypeModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentTypeModel} proxy from a {@link Package} stereotyped << DeploymentTypeModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link DeploymentTypeModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("08c9e210-11e1-4e4f-9216-1550850d4249")
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
     * 
     */
    @objid ("914d6bed-960c-4a9a-b98d-6ed5cd0bd818")
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
     * 
     */
    @objid ("6ebfed61-861b-43d9-ba44-b1b1d42f683c")
    public void addContainers(final Container obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'hostings' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b47ff8db-e7d6-4079-aa70-9efea14fcc66")
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
     * 
     */
    @objid ("f5b7c9f2-7ff9-480b-aa62-e670ef78bbdc")
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
     * 
     */
    @objid ("0c838ad7-4a45-420c-8809-eaa9f2decaa6")
    public void addPaases(final PaaS obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'requirementSets' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ebee2d87-6a1b-4ad8-9c24-cfc03b99d3a6")
    public void addRequirementSets(final RequirementSet obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("351395ab-00a7-49fd-af06-ef2509f8f54e")
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'vms' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("62deaaea-c5bb-4261-8c2a-5fdb011ecfe2")
    public void addVms(final VM obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("3444f654-5e79-45dc-aff9-e5f775d247f2")
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
     * 
     */
    @objid ("7025a5e1-6406-4222-af7a-3ca05b13fb07")
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
     * 
     */
    @objid ("6fea2450-543f-4992-8fbb-905497839827")
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
     * @return the Package represented by this proxy, never null.
     */
    @objid ("37530f2d-9576-4d97-a5c7-6fbd6abeb51f")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the value of the 'globalRequirementSet' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("80032136-86a3-45e4-806c-b7a7271123b2")
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
     * 
     */
    @objid ("387e3b01-4cc8-4162-83c6-3839846a7485")
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
     * 
     */
    @objid ("cc926091-0108-4c26-8b2c-b39395b5b4cc")
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
     * 
     */
    @objid ("33f99e1a-a5d0-4f36-b01b-aba187667d4b")
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
     * 
     */
    @objid ("5f6dde17-ce5b-4207-b313-5a3f89d52d7b")
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
     * 
     */
    @objid ("5a8c6dbd-b240-48d7-9721-296467854b41")
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
     * 
     */
    @objid ("ea7c3acd-b69d-44e4-943e-1e3808bf8cb2")
    public List<VM> getVms() {
        List<VM> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (VM.canInstantiate(mObj))
        			results.add((VM)CamelDesignerProxyFactory.instantiate(mObj, VM.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("d8940606-6680-4ec9-8788-cfa58b75bf89")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'communications' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fe647399-0e44-452f-9009-0887e9c13d27")
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
     * 
     */
    @objid ("6a1a4a7b-7bb2-45b3-b19d-a4a7c52790af")
    public boolean removeContainers(final Container obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'hostings' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1cedd49c-c1ed-4212-9c2b-5f1afac017ba")
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
     * 
     */
    @objid ("f9e5510a-e91d-4601-9b12-22e7223c0001")
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
     * 
     */
    @objid ("ca742c40-a266-4611-802a-5e8bae1cecda")
    public boolean removePaases(final PaaS obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'requirementSets' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7a552a13-80d3-47c2-a166-8edeaa3702fe")
    public boolean removeRequirementSets(final RequirementSet obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5b557820-b434-4f47-9b5a-5f0eaef0586d")
    public boolean removeSoftwareComponents(final SoftwareComponent obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'vms' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("650c679f-0589-4a78-9e70-6baa825c4302")
    public boolean removeVms(final VM obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'globalRequirementSet' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1bf3e128-dde9-402f-a1f0-794acfcf3046")
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

    @objid ("bedfccb2-146e-4b9a-b66d-8c6a5745ce18")
    protected DeploymentTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("aa0491e2-0f18-46c3-ba92-4686c725d9fa")
    public static final class MdaTypes {
        @objid ("9c2ead1d-b9c0-4957-b7b8-2a969b7c91c7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("73f1ac48-b1c0-4b97-ae1a-9458fbbd046b")
        private static Stereotype MDAASSOCDEP;

        @objid ("f07c3221-8306-4dad-8a24-2284a231c8f7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ae0ff28b-368e-42eb-bccb-f149f78191bd")
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
