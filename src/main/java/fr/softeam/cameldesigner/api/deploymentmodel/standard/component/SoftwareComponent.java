/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("16ee751c-5c5b-4b1f-b132-0526814fdd41")
    public static final String STEREOTYPE_NAME = "SoftwareComponent";

    @objid ("a639b74e-47bc-4449-891d-26874d67612c")
    public static final String COINSTANCEHOSTING_TAGTYPE = "coInstanceHosting";

    @objid ("d43ef938-4571-4fbd-b88e-e50f76335e40")
    public static final String LONGLIVED_TAGTYPE = "longLived";

    /**
     * Tells whether a {@link SoftwareComponent proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << SoftwareComponent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("363dbef8-b4e9-4835-a7ae-41ad6a469725")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << SoftwareComponent >> then instantiate a {@link SoftwareComponent} proxy.
     * 
     * @return a {@link SoftwareComponent} proxy on the created {@link Component}.
     */
    @objid ("26cc1daf-8c09-4311-9846-aa5b1e866519")
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
    @objid ("a288ba03-45ff-4449-8866-9c26b9db3f78")
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
    @objid ("8bb5845a-d668-4c15-909c-35ba17945bc7")
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
    @objid ("c023e967-d877-4843-8e99-aa77f5cf8cdf")
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
    @objid ("b2b05e3d-3803-424b-add9-29a4ca052108")
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
    @objid ("d939ed1d-4821-4668-b0c5-74b8ac06a2cd")
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
    @objid ("7f6e0058-d172-4c84-bec8-b2303971bdee")
    public void addRequiredCommunications(final CommunicationPort obj) {
        if (obj!=null)
          ((Component) this.elt).getInternalStructure().add(obj.getElement());
    }

    @objid ("eb65c765-ca05-470a-9c21-88036a7fb7d2")
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
    @objid ("baf9353c-1218-4172-8dde-d7e31e5fe0c4")
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
    @objid ("32495e61-52b6-47d3-9f1e-b49f7d00f6d4")
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
    @objid ("8db4f37d-ff61-4a36-a5e3-9348b8e78498")
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
    @objid ("660c92e8-d97a-4191-a17a-42d4eff6b8d7")
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
    @objid ("c2b1bd5b-0092-4c72-8ca6-beba92159fe5")
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
    @objid ("b33278eb-10bd-431c-b81a-1ed1ba4a9027")
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
    @objid ("416dfc4e-8348-4d75-9b5e-b49f6a60a109")
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

    @objid ("947312bf-4434-4b69-b953-1887d364f223")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'coInstanceHosting'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("231b4f3f-4c68-4e06-a6d0-515cfabbb637")
    public boolean isCoInstanceHosting() {
        return this.elt.isTagged(SoftwareComponent.MdaTypes.COINSTANCEHOSTING_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'longLived'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ec6b304d-4b1f-4229-a744-2065b126b09f")
    public boolean isLongLived() {
        return this.elt.isTagged(SoftwareComponent.MdaTypes.LONGLIVED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'consumesData' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("33b9e6d4-a3a8-48a6-a9bf-5b19356bb701")
    public boolean removeConsumesData(final Data obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
    @objid ("af3299da-4832-4b5f-9253-85f526b89d30")
    public boolean removeGeneratesData(final Data obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
    @objid ("9bc4eca4-c5ee-4c69-952b-0b386f076164")
    public boolean removeManagesDataSource(final DataSource obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponent.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
    @objid ("0d551bb2-6518-4947-97dd-f0870fbfd167")
    public boolean removeRequiredCommunications(final CommunicationPort obj) {
        return (obj!=null)? ((Component) this.elt).getInternalStructure().remove(obj.getElement()) : false;
    }

    /**
     * Setter for boolean property 'coInstanceHosting'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2f77d65f-2715-4ddb-a09d-0cc0dd05810b")
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
    @objid ("528b3b8c-4e95-4324-b7e1-c724e381bbd0")
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
    @objid ("c63a65c8-2b9b-4fca-b449-ad0b1205cbda")
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
    @objid ("334c8895-dfe1-4706-ac38-f813e96aed7f")
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
        return result;
    }

    @objid ("0ae9c57d-fde0-470b-a77a-8c2a339483e6")
    protected SoftwareComponent(final Component elt) {
        super(elt);
    }

    @objid ("2f8e6622-096e-45ed-9142-912db33ad5b4")
    public static final class MdaTypes {
        @objid ("5f95479c-90c1-4725-9123-466d8ac42e66")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("be71238b-4454-451c-8b63-d00a553850a8")
        public static TagType LONGLIVED_TAGTYPE_ELT;

        @objid ("ea4cf076-0e1d-4507-a7c2-0c861ec5e47e")
        public static TagType COINSTANCEHOSTING_TAGTYPE_ELT;

        @objid ("4ffb91ae-7e28-487f-b268-8691587ac0fb")
        private static Stereotype MDAASSOCDEP;

        @objid ("30857d74-d3c9-44e8-be28-9d6a720a62ba")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c4cccc69-2dea-41e0-af35-92526bb19ea3")
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
