/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("869773ef-f00a-4d6e-91e5-8bb8d2b27c1c")
    public static final String STEREOTYPE_NAME = "MetricObjectBinding";

    /**
     * Tells whether a {@link MetricObjectBinding proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricObjectBinding >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7492cbbd-2fcc-4eee-bf58-82f4946f19db")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricObjectBinding.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricObjectBinding >> then instantiate a {@link MetricObjectBinding} proxy.
     * 
     * @return a {@link MetricObjectBinding} proxy on the created {@link Class}.
     */
    @objid ("f567488a-93a0-4105-9777-85983f3234c9")
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
    @objid ("1d9afd6a-7412-46b9-a408-e367ccdea91a")
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
    @objid ("a30082c6-dc82-4330-b3ad-6f8250b5cedd")
    public static MetricObjectBinding safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MetricObjectBinding.canInstantiate(obj))
        	return new MetricObjectBinding(obj);
        else
        	throw new IllegalArgumentException("MetricObjectBinding: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ef705a5f-6f6d-48f6-9333-18b748942768")
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
    @objid ("71d8cdba-916f-4e18-9ef3-027b11c8d819")
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
    @objid ("af265219-ee79-47d8-8716-301bc371173b")
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
    @objid ("d625ef18-90d9-46bf-aefa-cb92b14da111")
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
    @objid ("f037ea5c-77d1-4272-85a2-f2400f1086c1")
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

    @objid ("b0963b70-c810-439b-a22c-6609d84ebac9")
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
    @objid ("e264ffe1-dd18-4288-8039-dc88ec653568")
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
    @objid ("87646223-5de7-45ea-9cd6-c3c0736254fe")
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
    @objid ("7c8174d8-0d99-41e6-b989-9fbf0959c000")
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

    @objid ("0e185f41-235e-4e7a-bc5a-d0ddd2c2f2a1")
    protected MetricObjectBinding(final Class elt) {
        super(elt);
    }

    @objid ("272f62f0-81e6-49eb-82ae-aabe9b0a0678")
    public static final class MdaTypes {
        @objid ("82a55ddb-8f0a-40ea-9e9e-607470c746cd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b7fcbd5b-df4e-4545-abbf-4a24af29b7aa")
        private static Stereotype MDAASSOCDEP;

        @objid ("91979d47-62ea-4291-ab1e-9ee8990e54a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f9baee82-9dcc-4cde-888e-f52612a1b203")
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
