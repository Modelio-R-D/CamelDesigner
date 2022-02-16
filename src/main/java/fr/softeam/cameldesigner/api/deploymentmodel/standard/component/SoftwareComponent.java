/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("4254fbcc-2652-4f9d-9502-1363763a5968")
    public static final String STEREOTYPE_NAME = "SoftwareComponent";

    @objid ("a60ad9aa-a419-4e0c-bc09-eaa8950719ab")
    public static final String COINSTANCEHOSTING_TAGTYPE = "coInstanceHosting";

    @objid ("e5dfa0a8-3784-42d0-bfa9-69d2dc11b21b")
    public static final String LONGLIVED_TAGTYPE = "longLived";

    /**
     * Tells whether a {@link SoftwareComponent proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << SoftwareComponent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("aa5f7643-4260-4148-befd-d99711750164")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << SoftwareComponent >> then instantiate a {@link SoftwareComponent} proxy.
     * 
     * @return a {@link SoftwareComponent} proxy on the created {@link Component}.
     */
    @objid ("3f5d132e-00ee-45ae-a546-50d0f81e9de8")
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
    @objid ("0c0047ec-b119-40b5-a364-b516747efe48")
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
    @objid ("57a94af3-ecff-4426-b4a1-8ee79c3e6336")
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
    @objid ("2f3c5d7c-28eb-489f-9e5c-6dfd7151fb20")
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
    @objid ("7e63f293-b556-41b8-8b63-a919b461ec52")
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
    @objid ("6f36283b-2830-493e-9727-847b9501601d")
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
    @objid ("b705b93a-9097-413f-9584-61758b16c9fb")
    public void addRequiredCommunications(final CommunicationPort obj) {
        if (obj!=null)
          ((Component) this.elt).getInternalStructure().add(obj.getElement());
    }

    @objid ("34c721be-c569-45cb-8801-522c3300a945")
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
     * Getter for string property 'coInstanceHosting'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a4234b6f-fac8-43d6-8c27-cbe3f27b65d3")
    public String getCoInstanceHosting() {
        return this.elt.getTagValue(SoftwareComponent.MdaTypes.COINSTANCEHOSTING_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'consumesData' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d687d615-82fe-4c42-bf0a-98f528df2ed4")
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
    @objid ("238ebb6b-780e-4a85-b414-9a439b2828d0")
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
    @objid ("093db701-67ee-45fc-aff1-c5f9d36834d4")
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
     * Getter for string property 'longLived'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("20ef562a-10fd-4380-b2f6-4f0e626bc523")
    public String getLongLived() {
        return this.elt.getTagValue(SoftwareComponent.MdaTypes.LONGLIVED_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'managesDataSource' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("71ae1e60-5f7f-4aa8-a8f8-e1e1d3ec8c23")
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
    @objid ("d9199764-5365-4dc4-b5e6-cbb8b7c36016")
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
    @objid ("a9dbd3e0-9e87-4937-9d9a-387825bed91d")
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
    @objid ("37b57eb9-9691-4eb4-8c08-8fac787a633a")
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

    @objid ("bf48d313-a656-4385-ba16-cb57ea3be218")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'consumesData' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("917dea40-b7a9-40ad-9a5d-980510586242")
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
    @objid ("92b896a1-83d7-416d-b0e5-1940c680bc74")
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
    @objid ("370a4a22-67f8-4db5-b815-ad3bb488f3b9")
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
    @objid ("bf3887d0-f209-4d45-9306-c93c7cdb3a4e")
    public boolean removeRequiredCommunications(final CommunicationPort obj) {
        return (obj!=null)? ((Component) this.elt).getInternalStructure().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'coInstanceHosting'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f69e779d-1616-46a2-8dcb-2fb0739aa171")
    public void setCoInstanceHosting(final String value) {
        this.elt.putTagValue(SoftwareComponent.MdaTypes.COINSTANCEHOSTING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'longLived'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ca21845e-11d3-47e0-a2de-99d351938c66")
    public void setLongLived(final String value) {
        this.elt.putTagValue(SoftwareComponent.MdaTypes.LONGLIVED_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'requiredHost' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7e034f22-035f-4038-b12a-739960e46fa5")
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
    @objid ("c34fc5c5-35d8-4f89-9ff2-1b4b6a6a558d")
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

    @objid ("fcffcd2b-ba4f-44ca-9e02-4c4a735ef6d9")
    protected SoftwareComponent(final Component elt) {
        super(elt);
    }

    @objid ("2f8e6622-096e-45ed-9142-912db33ad5b4")
    public static final class MdaTypes {
        @objid ("ff29e76a-0758-40b7-a3f5-b29c6d692cbb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("46b2ac1c-b3de-4f9f-85c0-704c1a3f7a05")
        public static TagType LONGLIVED_TAGTYPE_ELT;

        @objid ("0582be84-5c6b-4f24-a041-51d6949aca16")
        public static TagType COINSTANCEHOSTING_TAGTYPE_ELT;

        @objid ("a5691073-50a0-4e25-bffc-4bc7909325b0")
        private static Stereotype MDAASSOCDEP;

        @objid ("6dec6a89-3316-435f-870a-16d55ccf116a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d4ff26de-ef99-4cef-816a-ccbc8b09fa72")
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
