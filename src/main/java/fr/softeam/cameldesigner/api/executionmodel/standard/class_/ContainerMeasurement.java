/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
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
 * Proxy class to handle a {@link Class} with << ContainerMeasurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c4401553-3d0b-4901-8ab2-21261d105e3c")
public class ContainerMeasurement extends Measurement {
    @objid ("922955a5-4145-499a-a323-ba54dcb9faff")
    public static final String STEREOTYPE_NAME = "ContainerMeasurement";

    /**
     * Tells whether a {@link ContainerMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ContainerMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0b8ee107-6ba1-4261-903f-016c9e6ccd09")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ContainerMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ContainerMeasurement >> then instantiate a {@link ContainerMeasurement} proxy.
     * 
     * @return a {@link ContainerMeasurement} proxy on the created {@link Class}.
     */
    @objid ("806339bc-d74b-45d8-b898-0f9cff45b2ea")
    public static ContainerMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ContainerMeasurement.STEREOTYPE_NAME);
        return ContainerMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ContainerMeasurement} proxy from a {@link Class} stereotyped << ContainerMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ContainerMeasurement} proxy or <i>null</i>.
     */
    @objid ("3038940d-9509-4494-87b6-afbc91ebe969")
    public static ContainerMeasurement instantiate(final Class obj) {
        return ContainerMeasurement.canInstantiate(obj) ? new ContainerMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ContainerMeasurement} proxy from a {@link Class} stereotyped << ContainerMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ContainerMeasurement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f2bc1b55-c6cb-4df2-8a66-687be57cab40")
    public static ContainerMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ContainerMeasurement.canInstantiate(obj))
        	return new ContainerMeasurement(obj);
        else
        	throw new IllegalArgumentException("ContainerMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a1173c05-0f60-44a6-beba-8f5d7524cda8")
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
        ContainerMeasurement other = (ContainerMeasurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'container' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c9a58d80-5ff6-4e3f-8531-1466867ec15d")
    public Container getContainer() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ContainerMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ContainerMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "container")){
                  if (Container.canInstantiate(d.getDependsOn()))
                     return (Container)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Container.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'containerInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9bf65115-7229-44ab-9e76-4effdf77796f")
    public ContainerInstance getContainerInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ContainerMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ContainerMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "containerInstance")){
                  if (ContainerInstance.canInstantiate(d.getDependsOn()))
                     return (ContainerInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ContainerInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ac195d66-54f6-4263-a7db-06ab14490404")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("9d6e2519-ea57-40c8-85a2-309026ee5090")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'container' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("50203b30-e912-4883-9658-cb7548a0da22")
    public void setContainer(final Container obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ContainerMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ContainerMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "container")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ContainerMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("container");      dep.putTagValue(ContainerMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "container");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'containerInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fb60b41b-00c4-4f9d-975b-42844a144103")
    public void setContainerInstance(final ContainerInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ContainerMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ContainerMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "containerInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ContainerMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("containerInstance");      dep.putTagValue(ContainerMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "containerInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("cf152c1d-bca6-4200-83d5-7d07147b1d07")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("e0959a8b-1423-438e-b363-dad8aa414e04")
    protected ContainerMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("0bc17bd6-139f-4ffe-97d9-fd0db467095f")
    public static final class MdaTypes {
        @objid ("b891d85c-f951-4cca-9c0a-9730f1e4125c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("215a373f-0dbf-41ca-8f62-5df9ad66370e")
        private static Stereotype MDAASSOCDEP;

        @objid ("d241ac04-b106-4dd4-ad8e-7cc1fc0c2d4e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("784a547e-ecc5-4504-9a9b-4069873ff072")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "85629f9a-c7b9-455f-a948-e90a070e6b60");
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
