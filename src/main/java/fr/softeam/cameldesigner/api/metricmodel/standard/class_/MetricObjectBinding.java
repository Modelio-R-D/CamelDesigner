/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
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
    @objid ("e5c51ea5-ba80-4eb1-9244-e862ecb249dc")
    public static final String STEREOTYPE_NAME = "MetricObjectBinding";

    /**
     * Tells whether a {@link MetricObjectBinding proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricObjectBinding >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7fb236da-dd7a-440c-8c01-1fe51316a260")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricObjectBinding.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricObjectBinding >> then instantiate a {@link MetricObjectBinding} proxy.
     * 
     * @return a {@link MetricObjectBinding} proxy on the created {@link Class}.
     */
    @objid ("318a7c2a-b378-444d-8d87-117c303e2b2b")
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
    @objid ("14decce7-9baa-4b3e-886e-a1d58a3d5730")
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
    @objid ("30ba1ec8-69ab-49c8-b0b6-6c09ca78d8b1")
    public static MetricObjectBinding safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MetricObjectBinding.canInstantiate(obj))
        	return new MetricObjectBinding(obj);
        else
        	throw new IllegalArgumentException("MetricObjectBinding: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a925da52-9d73-46a1-8c81-03067004cc9c")
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
    @objid ("73743a89-d946-4e0f-95b1-3b095c5f24d1")
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
    @objid ("f8aec5d7-1ff3-4008-90e4-2ae06bc94b7b")
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
    @objid ("68c06660-b972-4379-8510-4bc82da285f0")
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
    @objid ("8554f663-83ea-49d6-acb6-43354e659359")
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

    @objid ("e6343424-d4b3-4f05-bb37-adfd4147e682")
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
    @objid ("240c0164-80c8-44e3-a3e8-9c3157376a5f")
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
    @objid ("ec8baf1e-b3d4-474a-8aa6-17abfb5317dd")
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
    @objid ("879f186c-f423-4bfa-9342-7862f93f7ad2")
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

    @objid ("a7c4860f-9862-45f2-842f-7101f73a2583")
    protected MetricObjectBinding(final Class elt) {
        super(elt);
    }

    @objid ("272f62f0-81e6-49eb-82ae-aabe9b0a0678")
    public static final class MdaTypes {
        @objid ("65b98135-36c0-4313-a40b-656cc16b1dc1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("995bf80a-f09c-4fe7-8cfe-7c307d2b8a21")
        private static Stereotype MDAASSOCDEP;

        @objid ("7f4e789c-e66b-4418-96bf-3c07d00073db")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c25bdcf5-e9ce-4221-9fce-3ee3768f392e")
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
