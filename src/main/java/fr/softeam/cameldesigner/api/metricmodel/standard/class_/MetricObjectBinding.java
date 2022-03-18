/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("8d7398cc-a061-495b-ad88-c342345ba52b")
    public static final String STEREOTYPE_NAME = "MetricObjectBinding";

    /**
     * Tells whether a {@link MetricObjectBinding proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricObjectBinding >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f0ad44d3-13bf-4e2a-9fa1-d34c09a84427")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricObjectBinding.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricObjectBinding >> then instantiate a {@link MetricObjectBinding} proxy.
     * 
     * @return a {@link MetricObjectBinding} proxy on the created {@link Class}.
     */
    @objid ("049fe680-e1e4-41fe-bb7e-e759e7b8eb9d")
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
    @objid ("b9ae63d6-0072-4dc0-8621-ad07dfdd7515")
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
    @objid ("2b502980-040b-4545-b393-bdc2cd908c8e")
    public static MetricObjectBinding safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MetricObjectBinding.canInstantiate(obj))
        	return new MetricObjectBinding(obj);
        else
        	throw new IllegalArgumentException("MetricObjectBinding: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cba376e7-09db-42b5-8af1-5efe93658f70")
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
    @objid ("57cde99f-729a-47b1-9928-cb7fc4a3f02a")
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
    @objid ("1a4b9412-97f7-40d8-9155-d986c23ecdbc")
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
    @objid ("ba506a7c-93ed-4758-9b6a-b0930e85a95b")
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
    @objid ("add9cffc-0847-486d-a475-d1b5793de77c")
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

    @objid ("ae747268-4a69-4c84-aa23-9c80c0416768")
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
    @objid ("a31cbea4-02c2-459e-bfc4-a2eaf5b4458e")
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
    @objid ("eb14eb2c-8763-4bb3-a44b-c1b62148b78a")
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
    @objid ("d229745c-df1d-4f50-99df-7a05fed61320")
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

    @objid ("73cdabf5-228d-46a2-b54a-6cb853c2cb5d")
    protected MetricObjectBinding(final Class elt) {
        super(elt);
    }

    @objid ("272f62f0-81e6-49eb-82ae-aabe9b0a0678")
    public static final class MdaTypes {
        @objid ("0186f01b-c3c7-4e43-b211-d8d3a615874b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a4f4d365-091d-450f-864c-76b110eec138")
        private static Stereotype MDAASSOCDEP;

        @objid ("979f0a45-6d5f-458e-8fb3-03feb4a432c3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("79b405bd-46d2-4acc-b28d-f765c8464f03")
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
