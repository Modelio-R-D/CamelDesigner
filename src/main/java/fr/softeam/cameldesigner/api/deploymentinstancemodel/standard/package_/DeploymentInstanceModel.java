/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("9b80fb8d-f970-46bf-8179-f96cd849d8df")
    public static final String STEREOTYPE_NAME = "DeploymentInstanceModel";

    /**
     * Tells whether a {@link DeploymentInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4771bd39-fc84-4a8c-9015-a0bce3820f15")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentInstanceModel >> then instantiate a {@link DeploymentInstanceModel} proxy.
     * 
     * @return a {@link DeploymentInstanceModel} proxy on the created {@link Package}.
     */
    @objid ("1e737584-c921-45a4-a031-e026f7b29b1a")
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
    @objid ("ac461e04-1701-4f3b-a06a-afa4b0846815")
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
    @objid ("c3a89d92-c8be-44e0-98c0-e9ed4543f1a3")
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
    @objid ("c11648b6-d6d6-4090-9e3f-dffee63fc798")
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
    @objid ("023e689f-4a36-43ea-8f9b-35a6f672dbb4")
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
    @objid ("1e32f37f-ec4e-46d8-ac5e-8aa409c4d4bc")
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
    @objid ("b45f5bef-fc8c-4ac6-865c-fe7f6b7bcaa8")
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
    @objid ("dac5e2bc-8521-4696-bfbe-9dc10b73c457")
    public void addVmInstances(final VMInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("00d22793-59e7-4175-ba9b-82e1eca2a413")
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
    @objid ("ea342d47-3832-4fa0-80ee-1786f5c4dc73")
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
    @objid ("814a836c-6c03-4592-9e59-0dda1b768e3a")
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
    @objid ("944462fc-834b-404d-b69c-7f7ae4ace6be")
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
    @objid ("507c7e02-4954-4b33-807c-235e34067fc0")
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
    @objid ("141b2898-9ae9-4b93-a29a-7afd1a97f5e1")
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
    @objid ("24c64aef-db50-42dc-9e60-6b63baa040c0")
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
    @objid ("7116783f-6fcb-4dab-933f-129aa293dab8")
    public List<VMInstance> getVmInstances() {
        List<VMInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (VMInstance.canInstantiate(mObj))
        			results.add((VMInstance)CamelDesignerProxyFactory.instantiate(mObj, VMInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("5e5c69ec-aa4f-4538-9cb2-d2fa2beaccfd")
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
    @objid ("e3070dad-6bd6-47e5-98ea-f6786a116d5f")
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
    @objid ("c0109486-4d13-4ee9-aac1-2485f8a8d038")
    public boolean removeContainerInstances(final ContainerInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'paasInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a437923e-62d9-4a39-ba32-a7c8c5299f37")
    public boolean removePaasInstances(final PaaSInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'softwareComponentInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("41dd12a7-4bc6-4d6c-bae0-589780af093a")
    public boolean removeSoftwareComponentInstances(final SoftwareComponentInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'vmInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("818f3175-4eaf-4859-a930-f442af54eb1c")
    public boolean removeVmInstances(final VMInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("003ef45e-a26c-4f45-a242-6c6a61cadec3")
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

    @objid ("ee0757ac-c7e8-43e8-853c-187af9de9804")
    protected DeploymentInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("3bc27954-cfa5-4cd5-95f8-63b26f92d695")
    public static final class MdaTypes {
        @objid ("e82bbb47-984e-43ff-950f-d9690bf0a208")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6b41acee-5982-4b02-92a1-1f69cd33b5b1")
        private static Stereotype MDAASSOCDEP;

        @objid ("5bb42d79-077f-4c10-8df7-3e862801eae3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6194b461-31e8-46fb-b6d8-0f9364e519f2")
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
