/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("00c34cc5-a5bc-4c35-885f-3140c121061b")
    public static final String STEREOTYPE_NAME = "SoftwareComponent";

    @objid ("6566f577-496b-4c68-83bb-310d5a7773e6")
    public static final String COINSTANCEHOSTING_TAGTYPE = "coInstanceHosting";

    @objid ("1979b046-4587-4d61-a878-57fcfe218061")
    public static final String LONGLIVED_TAGTYPE = "longLived";

    /**
     * Tells whether a {@link SoftwareComponent proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << SoftwareComponent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fc1f8d5a-d30c-4c11-aae2-ee098853908c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << SoftwareComponent >> then instantiate a {@link SoftwareComponent} proxy.
     * 
     * @return a {@link SoftwareComponent} proxy on the created {@link Component}.
     */
    @objid ("84199540-d0db-474f-aeb3-f1164168c659")
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
    @objid ("77b54ebb-2c06-48c8-8424-437520e7c057")
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
    @objid ("2cba0aa5-d6fd-45ea-8993-166fec15552e")
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
    @objid ("029de74f-62cc-40b0-b8b4-f8043d06d2d3")
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
    @objid ("2eca114e-bab5-45df-a386-18b29d5aafbe")
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
    @objid ("788ecf64-9d1b-4e40-b041-4b22c21bc49b")
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
    @objid ("a1c9db90-49d6-4e6c-a7b0-6e43f089ee27")
    public void addRequiredCommunications(final CommunicationPort obj) {
        if (obj!=null)
          ((Component) this.elt).getInternalStructure().add(obj.getElement());
    }

    @objid ("cb5f44d3-78c5-4fca-b999-0ad7a6ce53ee")
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
    @objid ("f9174ee4-9be6-4d4e-9be5-b459fc341e69")
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
    @objid ("c77e7ef3-0d1c-4a5b-a72f-f4e38f3436c7")
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
    @objid ("8489495c-249b-4da4-aa12-ca6dd716f41a")
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
    @objid ("08b431a9-f9a6-4948-895c-48de970bdd74")
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
    @objid ("ca88c56d-4ccc-41af-8374-11a474e7c238")
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
    @objid ("f3688641-6079-4472-9746-c9e3b71aaa8e")
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
    @objid ("7d12ae18-2f00-46f5-8cff-09209e080194")
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

    @objid ("2805bc66-4dec-4a53-95d8-ac5a7b125d19")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'coInstanceHosting'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3ce6a33b-496a-4fba-871b-7bacdabbd0d8")
    public boolean isCoInstanceHosting() {
        return this.elt.isTagged(SoftwareComponent.MdaTypes.COINSTANCEHOSTING_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'longLived'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c4e2b8eb-77bc-4041-9a94-6b049b797e0c")
    public boolean isLongLived() {
        return this.elt.isTagged(SoftwareComponent.MdaTypes.LONGLIVED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'consumesData' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8433f1c2-a527-4a24-a414-5fec639f74ea")
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
    @objid ("c71a8d0e-c453-4197-b225-d0f01e414778")
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
    @objid ("5d8dacdf-10a5-455f-ad69-62e0bcd88ac4")
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
    @objid ("4d4d430f-fb80-44c1-9047-893afbdc0b64")
    public boolean removeRequiredCommunications(final CommunicationPort obj) {
        return (obj!=null)? ((Component) this.elt).getInternalStructure().remove(obj.getElement()) : false;
    }

    /**
     * Setter for boolean property 'coInstanceHosting'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("69ad369d-46c0-45a4-81cb-8736d67c2800")
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
    @objid ("a7565690-ee4b-4fd3-bedd-778541e9f88c")
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
    @objid ("33b0c7ca-ce6f-432b-aa01-5d8eaa94f348")
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
    @objid ("6001914d-3b2b-40c4-946d-cb75b433cf95")
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

    @objid ("7d8fc28f-12e6-4c4b-a939-af422eba3fb2")
    protected SoftwareComponent(final Component elt) {
        super(elt);
    }

    @objid ("2f8e6622-096e-45ed-9142-912db33ad5b4")
    public static final class MdaTypes {
        @objid ("c95c5073-ebd7-4d89-b4cd-5ab807409907")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b46c059b-1e31-48c2-aa40-2fcc0733a1eb")
        public static TagType LONGLIVED_TAGTYPE_ELT;

        @objid ("3b5ebc6a-711e-45aa-965b-e1f6382dd66d")
        public static TagType COINSTANCEHOSTING_TAGTYPE_ELT;

        @objid ("e21b7482-63e9-4042-8bb3-0e3e18d79135")
        private static Stereotype MDAASSOCDEP;

        @objid ("ffdcc8f9-4b19-45f0-a08a-feb24c088f93")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("60d432dc-c1f9-4908-bab5-e6cf85f2d440")
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
