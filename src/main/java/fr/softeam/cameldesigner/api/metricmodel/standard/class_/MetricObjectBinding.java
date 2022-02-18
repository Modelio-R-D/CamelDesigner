/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("778392bf-f170-4764-b7b7-44d29de3e59a")
    public static final String STEREOTYPE_NAME = "MetricObjectBinding";

    /**
     * Tells whether a {@link MetricObjectBinding proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricObjectBinding >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("27632025-c6e9-4922-b7bd-b725ab430417")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricObjectBinding.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricObjectBinding >> then instantiate a {@link MetricObjectBinding} proxy.
     * 
     * @return a {@link MetricObjectBinding} proxy on the created {@link Class}.
     */
    @objid ("923e3cb1-7b49-41dc-8612-a81af2ae4531")
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
    @objid ("3f6f948d-b091-4a72-9b45-cd9aa5979c69")
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
    @objid ("8a15c301-7142-4daa-a37c-2f0ced109c25")
    public static MetricObjectBinding safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MetricObjectBinding.canInstantiate(obj))
        	return new MetricObjectBinding(obj);
        else
        	throw new IllegalArgumentException("MetricObjectBinding: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ca9bc6af-6e43-49b5-aa43-5c52daf06969")
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
    @objid ("523290e1-8d13-477b-a386-7e97b3b29285")
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
    @objid ("0c42e127-3318-4488-a504-219b90814005")
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
    @objid ("afb5d2ab-db91-4b51-8fc3-68c0d9fceacf")
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
    @objid ("a70a9436-fb86-4ea4-a539-a6af85a60be9")
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

    @objid ("c495bef9-2ca5-421e-83fe-6f67bd5fd945")
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
    @objid ("f7f52be0-58ee-4679-a6bf-774b27df4ede")
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
    @objid ("c0e37976-b7af-4d7b-b4b4-d3d4ac3b4d75")
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
    @objid ("62b7836a-9698-410b-8775-69fb1b375ead")
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

    @objid ("ca98406f-2231-4f9a-815a-e5b1dbe78bfd")
    protected MetricObjectBinding(final Class elt) {
        super(elt);
    }

    @objid ("272f62f0-81e6-49eb-82ae-aabe9b0a0678")
    public static final class MdaTypes {
        @objid ("d39a33d3-ec59-409c-bafa-dbb3a38baa66")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("86dd0b23-ea6c-4e00-a429-40dcca648f4d")
        private static Stereotype MDAASSOCDEP;

        @objid ("96129ce9-9a90-4ad2-8b5c-157503faa8eb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bec54b60-22e5-4724-970c-904806e5d40d")
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
