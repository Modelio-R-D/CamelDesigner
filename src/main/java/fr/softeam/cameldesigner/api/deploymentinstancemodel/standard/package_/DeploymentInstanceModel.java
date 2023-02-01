/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentInstanceModelDiagram;
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
import org.modelio.metamodel.diagrams.AbstractDiagram;
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
<<<<<<< HEAD
    @objid ("f4789d2f-9229-4e64-bedc-ebd6fef0fa2c")
=======
    @objid ("b1cc9478-e9ce-4b4a-a6a7-df28d63f934d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DeploymentInstanceModel";

    /**
     * Tells whether a {@link DeploymentInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("a78d4581-287b-4419-9da9-9d5e813232bf")
=======
    @objid ("9e6e8196-4feb-4815-92aa-d9249b4069ba")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentInstanceModel >> then instantiate a {@link DeploymentInstanceModel} proxy.
     * 
     * @return a {@link DeploymentInstanceModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("5b3ef73c-89cb-4384-9b9f-421d7fa5354e")
=======
    @objid ("2563d681-b097-4562-b5cf-0fbcb0e4b2e3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a3832913-e9b0-4969-b9cd-0d4fffaaaff0")
=======
    @objid ("c8ac88a2-4127-4e6a-8c5f-044de01ee207")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0de5b5e0-e79b-478b-9c62-daf50360a1b9")
=======
    @objid ("e43c326b-aa83-43d3-a07a-648d92eb8f00")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7d4064cd-64d1-44dc-b47d-176a3e5d8b3c")
=======
    @objid ("4bb5c9a9-59fb-488b-963e-710409525233")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("fbd05123-0634-4cb2-b2ce-b1ce7cafdcba")
=======
    @objid ("5196c96e-9af7-49af-adb6-751ee4d2530b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addContainerInstances(final ContainerInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("e18d5bd4-6457-4663-91bc-65d7d9631239")
=======
    @objid ("689601d0-3157-454c-9d02-1495b18afd1c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final DeploymentInstanceModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'paasInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("d912e2ab-137b-4d88-99a6-ebf28b180727")
=======
    @objid ("ba7ec8b5-7d27-4aa9-96ff-5cfefc515df7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("544633c6-8c9c-428f-9d63-9c6e939cf7d7")
=======
    @objid ("497c6a43-3f52-4bcc-aa7f-978c8c8a9f9b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("08d0ef08-c114-4af1-800f-24e5bd9cf8ab")
=======
    @objid ("abaf86f1-a699-47aa-9b9f-bd33c715d2c3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addVmInstances(final VMInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("a484a465-5ad9-4aff-bee9-7f86edb302d0")
=======
    @objid ("aad0c1ee-c369-44f0-8ecd-c94771b20f22")
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
        DeploymentInstanceModel other = (DeploymentInstanceModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'communicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a270e8a7-144d-472d-b003-7f5454887aa1")
=======
    @objid ("d293bf26-b210-4e65-a4ba-c91b3e502d7f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f7b90b7f-f358-45da-b8bc-4de4b023d7ee")
=======
    @objid ("fadee1f2-f99d-4d8d-b938-1adbc0cec2c7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<ContainerInstance> getContainerInstances() {
        List<ContainerInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (ContainerInstance.canInstantiate(mObj))
        			results.add((ContainerInstance)CamelDesignerProxyFactory.instantiate(mObj, ContainerInstance.STEREOTYPE_NAME));
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
    @objid ("ac00ff45-2b46-4177-827a-7e0e7b24ada6")
=======
    @objid ("a974a5ea-b217-47dd-89e1-d5e61dc2a4f5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<DeploymentInstanceModelDiagram> getDiagrams() {
        List<DeploymentInstanceModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (DeploymentInstanceModelDiagram.canInstantiate(mObj))
        			results.add((DeploymentInstanceModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, DeploymentInstanceModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("1f9a0e38-1d08-4b55-9f3c-4fc00924166a")
=======
    @objid ("24792e3f-dd36-4592-8832-595c4ad4425e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5ca864ad-fbdd-49e8-a279-62a4e36b7776")
=======
    @objid ("e9025219-4794-4ffc-b17b-5bfa9d1c6c76")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d73308e4-4144-453b-803b-10d3d842163e")
=======
    @objid ("df6f8f72-7761-4616-af88-a12d8b915776")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b90dd696-a3dd-4554-abdb-02307d38ad3e")
=======
    @objid ("aba50fc5-4502-446b-a62f-2420382a178f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c5fb2f9a-f6ce-4c2a-9933-6c8ebf927a87")
=======
    @objid ("8d4c729d-6d4e-48ba-9114-e65ab6dcd656")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<VMInstance> getVmInstances() {
        List<VMInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (VMInstance.canInstantiate(mObj))
        			results.add((VMInstance)CamelDesignerProxyFactory.instantiate(mObj, VMInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("061211df-d293-4a48-89e5-927f7e42cf69")
=======
    @objid ("b04a383a-3c79-4548-bc3c-9eb2aa62166b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c7548cca-9812-48ae-9e53-1a7ab9e0cede")
=======
    @objid ("32f2499e-8e40-4176-a535-e805fdb5c2f0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("4424b34b-dcaa-475f-991e-22620fa75e94")
=======
    @objid ("2688452b-040e-4bb4-9b7a-94b3f8166cd3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeContainerInstances(final ContainerInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("eb732948-34de-41da-b6e6-dfe2bd30ea9c")
=======
    @objid ("2ee591e5-edf9-44f6-84d1-0f5c5bd8174b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final DeploymentInstanceModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'paasInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("2763d9b8-a13c-4eff-8b30-d6abeecc5f98")
=======
    @objid ("7aa5350d-2163-4bac-abb2-b6744dcde8a5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removePaasInstances(final PaaSInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'softwareComponentInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("bea02131-6444-49f0-9372-60da881216fb")
=======
    @objid ("6688fd81-0a3e-47b3-a690-c6842a2a5507")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSoftwareComponentInstances(final SoftwareComponentInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'vmInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("72235b9a-eb43-4334-a72b-2b41e3177f23")
=======
    @objid ("8e187ec6-7b1e-437b-87da-02f9ce658f39")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeVmInstances(final VMInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("e7157b84-6c7d-4a3c-bd3e-aabf8aa0405f")
=======
    @objid ("cd77529c-8a77-420c-8d1b-5c48210c4901")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("5d9400a1-f6e5-446c-a7ab-9e2118083731")
=======
    @objid ("e9e3a4be-2c3d-47ff-8fa1-828832ab17b9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DeploymentInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("3bc27954-cfa5-4cd5-95f8-63b26f92d695")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("c4fe370d-e0c4-4096-881e-7df36204cea9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8e2c92fe-7dea-43f6-b1a7-469a4c61f0d8")
        private static Stereotype MDAASSOCDEP;

        @objid ("a1137f34-e4b9-4391-8814-1bb86b2eb0ac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("172fec4a-0b17-4662-9c24-f90c5a6bb17d")
=======
        @objid ("f2f2659c-2b39-4102-8e98-3fec4ce081ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e6a8cf34-749a-45a0-bafb-00a2a0fbb47c")
        private static Stereotype MDAASSOCDEP;

        @objid ("68d09823-71f2-4baa-8af6-b68e5aa9b851")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bf24a423-3983-47e9-b346-b7578a242fb9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
