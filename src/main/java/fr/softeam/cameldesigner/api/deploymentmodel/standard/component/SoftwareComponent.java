/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << SoftwareComponent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7665f659-8d0d-492d-9074-064922996094")
public class SoftwareComponent extends CamelComponent {
<<<<<<< HEAD
    @objid ("ef1beed7-4841-44ac-9014-8d9a30570c97")
    public static final String STEREOTYPE_NAME = "SoftwareComponent";

    @objid ("4b668adb-3125-4822-8802-4170c2127612")
    public static final String COINSTANCEHOSTING_TAGTYPE = "coInstanceHosting";

    @objid ("b416ef52-084b-4654-9d0e-c6f31afe9fa6")
=======
    @objid ("a15f1109-9ea9-4674-bad5-a65b1d25ae9f")
    public static final String STEREOTYPE_NAME = "SoftwareComponent";

    @objid ("2130ec44-c1c3-42b8-8f74-36b082c17893")
    public static final String COINSTANCEHOSTING_TAGTYPE = "coInstanceHosting";

    @objid ("203715cf-b663-4439-bda7-f2dfd838fad9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String LONGLIVED_TAGTYPE = "longLived";

    /**
     * Tells whether a {@link SoftwareComponent proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << SoftwareComponent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("e8ad50b5-4c71-488b-b988-b77acf8f51af")
=======
    @objid ("2affb0f6-c1ad-44ef-bf5c-a6d6f5d1894f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << SoftwareComponent >> then instantiate a {@link SoftwareComponent} proxy.
     * 
     * @return a {@link SoftwareComponent} proxy on the created {@link Component}.
     */
<<<<<<< HEAD
    @objid ("4f5a7f14-09b4-4ae6-8a98-4307ab21e444")
=======
    @objid ("d48d01cd-4f32-4821-808d-d35344d1a50f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SoftwareComponent create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Component");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME);
        return SoftwareComponent.instantiate((Component)e);
    }

    /**
     * Tries to instantiate a {@link SoftwareComponent} proxy from a {@link Component} stereotyped << SoftwareComponent >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Component
     * @return a {@link SoftwareComponent} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("4aca7fce-7266-4490-bf15-dc3564d0a912")
=======
    @objid ("c6701713-68e6-4bc4-8674-3f312d3681db")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SoftwareComponent instantiate(final Component obj) {
        return SoftwareComponent.canInstantiate(obj) ? new SoftwareComponent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SoftwareComponent} proxy from a {@link Component} stereotyped << SoftwareComponent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Component}
     * @return a {@link SoftwareComponent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("cf151012-7e08-4b91-93c3-dc71688d53c5")
=======
    @objid ("2c789235-4ddc-46ac-9e72-8f0c2c59a11f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SoftwareComponent safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (SoftwareComponent.canInstantiate(obj))
        	return new SoftwareComponent(obj);
        else
        	throw new IllegalArgumentException("SoftwareComponent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'consumesData' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("6f868ac3-34fa-4fd2-880d-3558ca491b79")
=======
    @objid ("f68fda17-8c37-45c6-8e27-88c48f0cefce")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addConsumesData(final Data obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponent.MdaTypes.MDAASSOCDEP);
            d.setName("consumesData");
            d.putTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE, "consumesData");
        }
    }

    /**
     * Add a value to the 'generatesData' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("d58dfaeb-9daa-40ec-924c-fba8e4d489e7")
=======
    @objid ("6e11c7f9-ddc4-46d8-8657-315b4f349239")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addGeneratesData(final Data obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponent.MdaTypes.MDAASSOCDEP);
            d.setName("generatesData");
            d.putTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE, "generatesData");
        }
    }

    /**
     * Add a value to the 'managesDataSource' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("d5c094f0-43b3-4e76-97fd-bc3d14390c60")
=======
    @objid ("d2e78a92-62c7-494f-82f4-35ce027dabe6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addManagesDataSource(final DataSource obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponent.MdaTypes.MDAASSOCDEP);
            d.setName("managesDataSource");
            d.putTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE, "managesDataSource");
        }
    }

    /**
     * Add a value to the 'requiredCommunications' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("627ae712-f9f5-49cf-896f-8209ba153d4e")
=======
    @objid ("5de560e2-b002-48dd-8bcc-8e4dc84536d9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addRequiredCommunications(final CommunicationPort obj) {
        if (obj!=null)
          ((Component) this.elt).getInternalStructure().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("16a0429e-ead3-41ee-b65d-7faf8d5af3ec")
=======
    @objid ("4ab8269f-9199-4aba-8c00-284ceaf90661")
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
        SoftwareComponent other = (SoftwareComponent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'consumesData' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("0a6a6523-f88b-4177-8e92-780a73744f95")
=======
    @objid ("71714484-ee44-4833-9058-a2898255637e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<Data> getConsumesData() {
        List<Data> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SoftwareComponent.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE), "consumesData")){
              if (Data.canInstantiate(d.getDependsOn()))
                results.add((Data)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Data.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("47650b9f-9405-491c-b3e5-1096adb4441b")
=======
    @objid ("43a2da94-ff2a-4dae-93f5-2474a0d1c502")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    /**
     * Get the values of the 'generatesData' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("17a0c77c-42bd-476e-bbac-eadcb33f9bde")
=======
    @objid ("902e2204-ebd3-49ec-83cd-a9b3b9831cde")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<Data> getGeneratesData() {
        List<Data> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SoftwareComponent.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE), "generatesData")){
              if (Data.canInstantiate(d.getDependsOn()))
                results.add((Data)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Data.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'managesDataSource' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("16151f67-6d83-4ea5-8606-ee78ca8b8534")
=======
    @objid ("4f2827ad-c93c-4399-bad6-9058d9c7549f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<DataSource> getManagesDataSource() {
        List<DataSource> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SoftwareComponent.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE), "managesDataSource")){
              if (DataSource.canInstantiate(d.getDependsOn()))
                results.add((DataSource)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataSource.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'requiredCommunications' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("1b397def-fb5b-4832-9e97-1eb45e032f01")
=======
    @objid ("0e80037f-48a9-4fef-87be-8d0274e954fe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<CommunicationPort> getRequiredCommunications() {
        List<CommunicationPort> results = new ArrayList<>();
        for (BindableInstance mObj : ((Component) this.elt).getInternalStructure()){
        	if (CommunicationPort.canInstantiate(mObj))
        			results.add((CommunicationPort)CamelDesignerProxyFactory.instantiate(mObj, CommunicationPort.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'requiredHost' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8b36caf7-c22e-421f-ab52-4ecb4af5cc01")
=======
    @objid ("3ef8d6b2-a849-4129-ba98-2ebd50d561fe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public HostingPort getRequiredHost() {
          for (Port obj : ((Component) this.elt).getInternalStructure(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

    /**
     * Get the value of the 'requirementSet' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a64c1e91-10b2-4cfe-8463-5422a6fdb86b")
=======
    @objid ("e5305ad9-0049-4c93-b3c5-b089b77a71ef")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public RequirementSet getRequirementSet() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SoftwareComponent.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE), "requirementSet")){
                  if (RequirementSet.canInstantiate(d.getDependsOn()))
                     return (RequirementSet)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RequirementSet.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

<<<<<<< HEAD
    @objid ("ffe07b58-0bdd-4edb-a691-b36a1539f4f1")
=======
    @objid ("44ceddbb-f3e8-4a19-ae39-f6b84488ffc3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'coInstanceHosting'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("8c205d86-1130-4c3e-8304-d6508d934970")
=======
    @objid ("3f4b0871-8bfb-4d3b-8bc5-31b973797156")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isCoInstanceHosting() {
        return this.elt.isTagged(SoftwareComponent.MdaTypes.COINSTANCEHOSTING_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'longLived'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("bf9f263e-ef51-4d12-850a-f034e09416e1")
=======
    @objid ("4c33ca00-b4eb-40db-96e0-b34cfd0b4e3f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isLongLived() {
        return this.elt.isTagged(SoftwareComponent.MdaTypes.LONGLIVED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'consumesData' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("e40a0f9d-fced-410c-9f64-548f14d6dab9")
=======
    @objid ("be66bb0e-8411-4cc1-9f0e-a8158d048a6e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeConsumesData(final Data obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE), "consumesData")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'generatesData' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("23abdc6c-5e26-4fa7-9a7e-c895f0cbed04")
=======
    @objid ("f9e9477c-2536-43dc-9d8b-f4e365bd78ae")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeGeneratesData(final Data obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE), "generatesData")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'managesDataSource' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b828f8e9-4810-45e5-bb3b-59d96bee4343")
=======
    @objid ("f40df72d-d712-4b2b-9c78-077faf0a93c0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeManagesDataSource(final DataSource obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE), "managesDataSource")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'requiredCommunications' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("07f8b74c-fc9e-4c08-835b-4ce9322a342d")
=======
    @objid ("9eb02575-d1fe-4436-845b-ca05dc4e0e58")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRequiredCommunications(final CommunicationPort obj) {
        return (obj!=null)? ((Component) this.elt).getInternalStructure().remove(obj.getElement()) : false;
    }

    /**
     * Setter for boolean property 'coInstanceHosting'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("e04f917e-0153-4be0-90e0-6f43171467a4")
=======
    @objid ("829c3212-12ed-4e8a-a897-da406893df2f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setCoInstanceHosting(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SoftwareComponent.MdaTypes.COINSTANCEHOSTING_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SoftwareComponent.MdaTypes.COINSTANCEHOSTING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'longLived'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("eed3c26d-7344-48ff-ad75-b40e7accbe1b")
=======
    @objid ("f75cf921-707c-4361-8688-b7ca8f052039")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setLongLived(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SoftwareComponent.MdaTypes.LONGLIVED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SoftwareComponent.MdaTypes.LONGLIVED_TAGTYPE_ELT);
    }

    /**
     * Set the value of the 'requiredHost' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("2414a6a3-343d-47f3-80af-41b1995cb7a0")
=======
    @objid ("7a16fde1-da5f-4b17-9da8-14083a67164f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setRequiredHost(final HostingPort obj) {
        // Remove existing HostingPorts
        for (Port e : ((Component) this.elt).getInternalStructure(Port.class)) {
           if (HostingPort.canInstantiate(e)) {
               e.delete();
           }
        }
        // Set the HostingPort
        if (obj != null) {
            ((Component) this.elt).getInternalStructure().add(obj.getElement());
        }
    }

    /**
     * Set the value of the 'requirementSet' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f567b957-5730-40e0-a6d3-eee8daacc488")
=======
    @objid ("237e34d7-0770-4052-90db-0294ed9f8af7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setRequirementSet(final RequirementSet obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SoftwareComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE), "requirementSet")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponent.MdaTypes.MDAASSOCDEP);
              dep.setName("requirementSet");      dep.putTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE, "requirementSet");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("f655444c-1c50-496d-b5de-b1380640ad8c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.add(getRequiredHost());
        result.addAll(getRequiredCommunications());
        //result.removeAll(Collections.singleton(null));
        return result;
    }

<<<<<<< HEAD
    @objid ("24fcdd92-735c-40bf-aabf-262e48ba4cab")
=======
    @objid ("7c61bf8c-8aad-4b0d-a492-1b7aad6485db")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected SoftwareComponent(final Component elt) {
        super(elt);
    }

    @objid ("2f8e6622-096e-45ed-9142-912db33ad5b4")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("2fa4c8b3-305b-442a-93de-2602a43c8fdf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("aafa08fc-0448-4ffe-9cdf-82052e284af9")
        public static TagType LONGLIVED_TAGTYPE_ELT;

        @objid ("400200a9-6fb4-499b-8230-574f02030a81")
        public static TagType COINSTANCEHOSTING_TAGTYPE_ELT;

        @objid ("1cf44754-c23a-40b6-b5eb-aed38f63f80c")
        private static Stereotype MDAASSOCDEP;

        @objid ("1035d08e-ab44-496b-8a48-ff9cf24cde08")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5eae5f99-c662-46b1-a2a5-81d359fb47f2")
=======
        @objid ("5fef94f8-44a1-44a4-894d-8cf4bb2b7fb9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4aa658a9-e98d-4d92-85a7-a7e18fdc84c5")
        public static TagType LONGLIVED_TAGTYPE_ELT;

        @objid ("79139ee0-ab68-40c0-a226-aafb57d37bf9")
        public static TagType COINSTANCEHOSTING_TAGTYPE_ELT;

        @objid ("44d6e824-e459-44f2-a862-f7df1b874b7a")
        private static Stereotype MDAASSOCDEP;

        @objid ("c0a93cbf-48a2-4414-b0b9-08e20e3f3027")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("04a34256-4bff-4e0c-ab6c-7780ab6c5430")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e66ca9e8-6d1c-46bd-9d9d-e1e16675fada");
            LONGLIVED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dad4c8d0-a0a7-4cbd-86b5-f8f40b461f7e");
            COINSTANCEHOSTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "494a7252-cb31-4efb-ba4c-43fde6acbc7f");
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
