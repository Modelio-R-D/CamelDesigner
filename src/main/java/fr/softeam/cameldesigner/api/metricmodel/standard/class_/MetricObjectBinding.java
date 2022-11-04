/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << MetricObjectBinding >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f5340f1c-c3cf-49b5-938b-4ac6b35cbc07")
public class MetricObjectBinding extends FeatureClass {
    @objid ("cd69479e-225a-4d6e-a1a3-23f649835a17")
    public static final String STEREOTYPE_NAME = "MetricObjectBinding";

    /**
     * Tells whether a {@link MetricObjectBinding proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricObjectBinding >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("543be130-1399-4675-980b-8a3ca600a469")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricObjectBinding.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricObjectBinding >> then instantiate a {@link MetricObjectBinding} proxy.
     * 
     * @return a {@link MetricObjectBinding} proxy on the created {@link Class}.
     */
    @objid ("073a16d8-65a6-4320-981f-6c461a798b72")
    public static MetricObjectBinding create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricObjectBinding.STEREOTYPE_NAME);
        return MetricObjectBinding.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MetricObjectBinding} proxy from a {@link Class} stereotyped << MetricObjectBinding >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link MetricObjectBinding} proxy or <i>null</i>.
     */
    @objid ("03542d01-4906-4f86-a2cd-be9597382aaf")
    public static MetricObjectBinding instantiate(final Class obj) {
        return MetricObjectBinding.canInstantiate(obj) ? new MetricObjectBinding(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricObjectBinding} proxy from a {@link Class} stereotyped << MetricObjectBinding >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link MetricObjectBinding} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("22a32329-7838-4083-8167-3bac360ff52d")
    public static MetricObjectBinding safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MetricObjectBinding.canInstantiate(obj))
        	return new MetricObjectBinding(obj);
        else
        	throw new IllegalArgumentException("MetricObjectBinding: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b1e1b1bc-b8c8-4c9e-9acb-e595d56d1884")
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
        MetricObjectBinding other = (MetricObjectBinding) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'communicationInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bb55289d-55dc-40b4-8e37-635545332d62")
    public CommunicationInstance getCommunicationInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricObjectBinding.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricObjectBinding.MdaTypes.MDAASSOCDEP_ROLE), "communicationInstance")){
                  if (CommunicationInstance.canInstantiate(d.getDependsOn()))
                     return (CommunicationInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'componentInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("26fbbade-ec90-4df0-acc1-2167dba691fe")
    public ComponentInstance getComponentInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricObjectBinding.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricObjectBinding.MdaTypes.MDAASSOCDEP_ROLE), "componentInstance")){
                  if (ContainerInstance.canInstantiate(d.getDependsOn()))
                     return (ContainerInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ContainerInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PaaSInstance.canInstantiate(d.getDependsOn()))
                     return (PaaSInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponentInstance.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (VMInstance.canInstantiate(d.getDependsOn()))
                     return (VMInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VMInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("61a00ee8-f760-4a85-8886-9281359a54a9")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'executionModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cb8ed3cb-f350-4633-a06b-6a3a66b2747a")
    public ExecutionModel getExecutionModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricObjectBinding.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricObjectBinding.MdaTypes.MDAASSOCDEP_ROLE), "executionModel")){
                  if (ExecutionModel.canInstantiate(d.getDependsOn()))
                     return (ExecutionModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ExecutionModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("8d08608d-ee2d-4fb7-adbb-c1de2f4e81ee")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'communicationInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("340ed248-a291-48bc-8991-791bee28c5f1")
    public void setCommunicationInstance(final CommunicationInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricObjectBinding.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricObjectBinding.MdaTypes.MDAASSOCDEP_ROLE), "communicationInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricObjectBinding.MdaTypes.MDAASSOCDEP);
              dep.setName("communicationInstance");      dep.putTagValue(MetricObjectBinding.MdaTypes.MDAASSOCDEP_ROLE, "communicationInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'componentInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0453e9e3-ef35-4664-afbb-d846af1f7eac")
    public void setComponentInstance(final ComponentInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricObjectBinding.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricObjectBinding.MdaTypes.MDAASSOCDEP_ROLE), "componentInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricObjectBinding.MdaTypes.MDAASSOCDEP);
              dep.setName("componentInstance");      dep.putTagValue(MetricObjectBinding.MdaTypes.MDAASSOCDEP_ROLE, "componentInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'executionModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9a58fd4f-d21b-4cb3-9bed-e414c594b221")
    public void setExecutionModel(final ExecutionModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricObjectBinding.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricObjectBinding.MdaTypes.MDAASSOCDEP_ROLE), "executionModel")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricObjectBinding.MdaTypes.MDAASSOCDEP);
              dep.setName("executionModel");      dep.putTagValue(MetricObjectBinding.MdaTypes.MDAASSOCDEP_ROLE, "executionModel");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("336b8e1c-3ff8-4ed1-bb85-3703166b4686")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("03cd99f0-6f3d-424c-9b5c-c8e220791f62")
    protected MetricObjectBinding(final Class elt) {
        super(elt);
    }

    @objid ("272f62f0-81e6-49eb-82ae-aabe9b0a0678")
    public static final class MdaTypes {
        @objid ("22403202-40b7-4943-b399-e649f7fb51f1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("07489e4a-902d-4afd-96e5-a62f28de45a1")
        private static Stereotype MDAASSOCDEP;

        @objid ("9ef1bd25-ef40-490e-bdee-d6e1fa50b1d9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9d8e93d7-e594-4523-b576-158e43479de1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "53d4e08f-3c02-461e-91e7-e2adf292b0c2");
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
