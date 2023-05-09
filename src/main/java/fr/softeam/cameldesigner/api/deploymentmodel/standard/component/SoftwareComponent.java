/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("422fca54-b12f-4833-9749-b960791b7186")
    public static final String STEREOTYPE_NAME = "SoftwareComponent";

    @objid ("c903819f-50d5-40cf-a8c6-450eed29c751")
    public static final String COINSTANCEHOSTING_TAGTYPE = "coInstanceHosting";

    @objid ("d3479925-3eba-4316-848d-43a6c5c090e5")
    public static final String LONGLIVED_TAGTYPE = "longLived";

    /**
     * Tells whether a {@link SoftwareComponent proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << SoftwareComponent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("990558a6-fce4-40df-88e3-c1c4e140bce3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << SoftwareComponent >> then instantiate a {@link SoftwareComponent} proxy.
     * 
     * @return a {@link SoftwareComponent} proxy on the created {@link Component}.
     */
    @objid ("f0d708bf-b8cb-4f7d-8b66-c7580da201c3")
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
    @objid ("4f500a9d-3c12-4fd6-85fd-15be59fb9459")
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
    @objid ("bef22cd0-07e6-4a2c-b796-1cba7f5f117d")
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
    @objid ("d0647ebf-22c9-4add-90d7-58a020193d65")
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
    @objid ("23d596e3-dfe9-45e5-aedd-9ebfb9d85ed4")
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
    @objid ("75313351-e53f-44d2-b81c-d35812cb9bf9")
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
    @objid ("63e3418c-6ae0-40ad-8940-f2ab3c164715")
    public void addRequiredCommunications(final CommunicationPort obj) {
        if (obj!=null)
          ((Component) this.elt).getInternalStructure().add(obj.getElement());
    }

    @objid ("4d6853df-bfff-413f-b3ec-06fb5802adaa")
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
    @objid ("67093778-9319-4e7e-8a00-85d605f64c98")
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
    @objid ("7b20089b-4739-489e-8d92-7c937806d93a")
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
    @objid ("ab2e8d23-71ae-46ce-9d17-18d316bf8dd2")
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
    @objid ("1246275c-eb06-4f67-9418-37abe599eda3")
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
    @objid ("4c9abcff-03ef-4dea-a23a-284ca7724c1b")
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
    @objid ("50b67116-1f29-4340-9596-622e8597c867")
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
    @objid ("ca4d6c0b-9fa5-4227-b941-a6c500a5b17b")
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

    @objid ("9ac67ad0-9089-4b90-86f4-52dce27993c0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'coInstanceHosting'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e612a47c-fad1-4913-b644-2582e8196c4a")
    public boolean isCoInstanceHosting() {
        return this.elt.isTagged(SoftwareComponent.MdaTypes.COINSTANCEHOSTING_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'longLived'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("265828b9-6ac6-4ec9-be1f-c4f0c87e6ba1")
    public boolean isLongLived() {
        return this.elt.isTagged(SoftwareComponent.MdaTypes.LONGLIVED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'consumesData' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("06e32521-e2f3-4105-86f8-261be37bb73b")
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
    @objid ("6a35f546-2b13-4231-ac25-f4477e12ced2")
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
    @objid ("ad7da91a-f2de-494f-a82e-79aea31cacad")
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
    @objid ("f5c0d4a8-2818-46ef-9b9e-9e87396315dc")
    public boolean removeRequiredCommunications(final CommunicationPort obj) {
        return (obj!=null)? ((Component) this.elt).getInternalStructure().remove(obj.getElement()) : false;
    }

    /**
     * Setter for boolean property 'coInstanceHosting'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7465c98a-cf1d-4431-8f25-f9868aa4f83a")
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
    @objid ("11181157-6320-49cf-984b-81833d5a4e00")
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
    @objid ("0a4ff207-40b8-47d6-a840-d536dae8c86d")
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
    @objid ("4515f042-cd39-49fa-9bae-2679433771ae")
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

    @objid ("41d21a07-e9d3-44ed-931d-b288dd8e942d")
    protected SoftwareComponent(final Component elt) {
        super(elt);
    }

    @objid ("2f8e6622-096e-45ed-9142-912db33ad5b4")
    public static final class MdaTypes {
        @objid ("9edb7033-4210-4eeb-b135-a266f78f56bf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ceedd137-1d46-495b-8ee2-06f8d517fb78")
        public static TagType LONGLIVED_TAGTYPE_ELT;

        @objid ("c7d149fe-099a-4e8f-8ac6-15211761dbdb")
        public static TagType COINSTANCEHOSTING_TAGTYPE_ELT;

        @objid ("91a9636d-0c95-434b-a432-2dccca1bd462")
        private static Stereotype MDAASSOCDEP;

        @objid ("d0aaa0a2-0004-4af8-b442-c330d65eb392")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aa3743a3-a518-4cbe-9594-f6eaa8714ddb")
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
