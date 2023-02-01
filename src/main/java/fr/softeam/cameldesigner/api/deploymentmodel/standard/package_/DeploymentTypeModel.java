/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentTypeModelDiagram;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.ControlFlowRelation;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
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
<<<<<<< HEAD
    @objid ("a9f03ca4-a6b2-49ca-818e-45a4ce6311bb")
=======
    @objid ("87650a2b-dc32-4a98-a9c3-c7cda85a36d3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DeploymentTypeModel";

    /**
     * Tells whether a {@link DeploymentTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("e81cfdd1-f96d-4b87-bbd0-a215b515ee3e")
=======
    @objid ("3a14d313-582d-4f34-9cbe-8c65d9570690")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentTypeModel >> then instantiate a {@link DeploymentTypeModel} proxy.
     * 
     * @return a {@link DeploymentTypeModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("8d193db7-ca30-4981-a1c2-d82b7df36f93")
=======
    @objid ("72734be9-ff65-4da7-aa9f-e889626b7450")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("bbb3dc21-fc53-47b3-a4f4-ea932a10e877")
=======
    @objid ("6857fc18-7e13-4d82-bd6d-263e0c1466a9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f41203cf-aaff-4dd9-aead-afd48a18f6d8")
=======
    @objid ("d75f1cf2-90ca-45e8-9f94-62b58d8738e7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("97f6954f-7bdb-488e-8c02-72629e18e20c")
=======
    @objid ("d47a5859-3b89-4398-bb54-4019b2551950")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6c7f9fe7-efec-4f4b-b5c9-16f3b74c946e")
=======
    @objid ("d2965ce5-4763-4473-b1a3-504eda73fb8c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addContainers(final Container obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("656e413a-f5b6-4e35-a85f-1ea7e1078651")
=======
    @objid ("18849167-b811-4033-9a0b-617f60726954")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final DeploymentTypeModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'hostings' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("4ea60e83-62be-4a39-8caf-1680d3786a2d")
=======
    @objid ("bd493620-fe12-47ee-adf4-83ec6dda8276")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("fee24ce6-7eaa-40de-ac72-243ba27ce56a")
=======
    @objid ("a6878b0e-1ac8-43b6-bc65-d7df7bf4722e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("06928f57-47b7-4206-88d9-26cd97930e63")
=======
    @objid ("0599fe80-e678-4cd0-8bbb-61ad965459ba")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3917480d-5448-4522-95b7-503a9c7d536b")
=======
    @objid ("5044bb25-2784-4c2d-87f8-81c452c0694a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("44a6ad55-262e-4731-afca-40cfe7abea58")
=======
    @objid ("828bc629-8071-440c-858b-f14801321de3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("aefc5713-ba9c-412a-b798-30e67367b4e2")
=======
    @objid ("48afa584-daed-4618-9ac3-1330304dfb18")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addVms(final VM obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("e7653725-bfbe-438d-9288-82d9e980c7f1")
=======
    @objid ("6d31005c-bbd9-46c8-b6fa-f23d50186efd")
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
        DeploymentTypeModel other = (DeploymentTypeModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the '' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cfbb8c54-73ea-4bfd-926f-46c233713a3c")
    public ControlFlowRelation get() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")){
              }
        }
        return null;
    }

    /**
     * Get the values of the 'communications' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("e5d9a5d6-9ae3-4427-83f3-2e7e558f86c9")
=======
    @objid ("4e7476e5-e9da-49f9-a9dc-8536a674f48d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("8602faac-5a3d-43ff-a791-cf6b9647acd6")
=======
    @objid ("fed999fc-89c9-422a-89ff-e2344e98b60b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<Container> getContainers() {
        List<Container> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Container.canInstantiate(mObj))
        			results.add((Container)CamelDesignerProxyFactory.instantiate(mObj, Container.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a2ce76ca-8828-44c4-a149-fdd34a281c43")
=======
    @objid ("c0994ef7-6a55-4751-b50a-7bdfba9efcec")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<DeploymentTypeModelDiagram> getDiagrams() {
        List<DeploymentTypeModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (DeploymentTypeModelDiagram.canInstantiate(mObj))
        			results.add((DeploymentTypeModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, DeploymentTypeModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("31fb6b25-a439-46f8-a506-985870379214")
=======
    @objid ("663633b1-38ae-44f5-b961-ebc65e3addb1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2ad89827-2414-4574-9e75-5b786f81601e")
=======
    @objid ("ffde9f30-cd63-44cd-976a-6ce85ffc6f3b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("eb450221-5f85-45e0-8ed1-941d542ab742")
=======
    @objid ("2d6c0604-d22e-4e34-9e9d-72d907fc7aaa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7d796c64-7045-4346-b74f-09519cd517d4")
=======
    @objid ("76d9532d-c55b-49dc-926e-72fb63687bf5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("61506ad4-3cba-4e4c-8d0b-e8785b4ea5b4")
=======
    @objid ("e41169d0-16a6-4364-98f8-606bb4efe88e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0833e67b-43cd-4213-8e3a-f78e9c796f75")
=======
    @objid ("9fe8006e-d48c-4f04-99ae-f149e4c9ac2a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b495f2cf-87a6-44fe-9942-08af755f785f")
=======
    @objid ("30090e62-d367-4963-bd22-6b7fa59818a5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("74446ec5-4032-43c0-b3cd-2da7eff3c36a")
=======
    @objid ("e085a4f0-b1ce-4666-a5c3-2b4bcc7d0bee")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<VM> getVms() {
        List<VM> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (VM.canInstantiate(mObj))
        			results.add((VM)CamelDesignerProxyFactory.instantiate(mObj, VM.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("0dae333e-4c8c-498a-a3e4-74ae511d5d85")
=======
    @objid ("82dfaa51-d12d-45d7-b539-f515b65c76c0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c22dad37-06a0-4344-b3b3-dee90668531a")
=======
    @objid ("a1125f15-21ed-4c3c-97bd-f8c166765cd2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeCommunications(final Communication obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "communications")) 
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
<<<<<<< HEAD
    @objid ("c6b7f45e-9e98-42c8-bbd7-3d27c2d25f4b")
=======
    @objid ("476a73dc-6315-421a-85e3-29117508c62a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeContainers(final Container obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("659303be-8396-4a84-8c3a-2eda1e19f753")
=======
    @objid ("06ea2d7e-d067-4e6a-812b-f29fff63f5cf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final DeploymentTypeModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'hostings' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("2d907a91-66ef-46a6-99e4-926790fdc0c2")
=======
    @objid ("1a799aec-caf7-4623-9b73-ca58ab70f077")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeHostings(final Hosting obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "hostings")) 
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
<<<<<<< HEAD
    @objid ("d4970660-8d1a-4e7d-9340-552cfb5a6c0d")
=======
    @objid ("0c9c11ca-25a2-4ae9-b61f-3f71588a3df7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeLocationCouplings(final LocationCoupling obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "locationCouplings")) 
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
<<<<<<< HEAD
    @objid ("6febf902-9aae-4203-bf60-f183e3150d26")
=======
    @objid ("a5b6dabd-1836-48b0-b809-eeab3dcafe4a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removePaases(final PaaS obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'requirementSets' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("50ca6214-f959-4029-8dff-0eb87b9bf8c9")
=======
    @objid ("d5cb5e91-787c-401d-a2a9-3a0e5edb78dc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRequirementSets(final RequirementSet obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ced4c506-388a-4160-b68a-63162f3fcecb")
=======
    @objid ("286c1138-0403-4706-8933-17f8721beba1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSoftwareComponents(final SoftwareComponent obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'vms' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("82590e7a-abb9-4e06-8be9-7cdab805e2ff")
=======
    @objid ("f2379ce6-934d-444f-8cb4-f199ada2e623")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeVms(final VM obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the '' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("27736eef-c3f7-4b44-bb54-14a55cbbe9c6")
    public void set(final ControlFlowRelation obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DeploymentTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DeploymentTypeModel.MdaTypes.MDAASSOCDEP);
              dep.setName("");      dep.putTagValue(DeploymentTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'globalRequirementSet' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("36fc36cb-1ab2-4178-8970-a450875cf2db")
=======
    @objid ("b1214e51-6ff6-41c9-8da5-2d8723fefc8d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("e2737b6a-df1e-4209-8df9-ff81bc7a395c")
=======
    @objid ("5226b746-930e-4963-84eb-40e0e88fb3ae")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DeploymentTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("aa0491e2-0f18-46c3-ba92-4686c725d9fa")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("92b0e3ac-cfdb-4add-b4c7-c49bb3bc678f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c6179a36-82f4-40dc-93c6-c1b347924728")
        private static Stereotype MDAASSOCDEP;

        @objid ("5acbadd0-61b1-4970-8ce6-d40661158d9b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("62a1d270-9f2a-4f66-b5d8-26f4a7fd0e08")
=======
        @objid ("cce3ab9f-594c-4a77-80af-3df18313511d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("80c46042-ae59-4f72-910d-4531f4d80448")
        private static Stereotype MDAASSOCDEP;

        @objid ("db5c5ac8-f980-4d6b-b4f1-289457ddb1c3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e91022a9-56f2-4316-99c1-1b68640ec7c5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
