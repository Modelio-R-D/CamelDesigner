/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("a8222bfb-9afd-4a57-85c1-2c7cb556ed12")
    public static final String STEREOTYPE_NAME = "ContainerMeasurement";

    /**
     * Tells whether a {@link ContainerMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ContainerMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ca99c1f7-0729-4c66-bb79-17c4eecc5242")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ContainerMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ContainerMeasurement >> then instantiate a {@link ContainerMeasurement} proxy.
     * 
     * @return a {@link ContainerMeasurement} proxy on the created {@link Class}.
     */
    @objid ("d934112e-45b8-479c-b753-7f64573b37f3")
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
    @objid ("0cbf048d-7961-417d-bac1-58d53f85162b")
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
    @objid ("65d6b3e2-3623-48a1-81ac-77fc9e9ad83e")
    public static ContainerMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ContainerMeasurement.canInstantiate(obj))
        	return new ContainerMeasurement(obj);
        else
        	throw new IllegalArgumentException("ContainerMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("13c36e6e-05cd-48f9-a989-ae38d794128a")
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
    @objid ("696a30bd-0c35-4d9a-8da6-8fb77da975db")
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
    @objid ("3f82b6a4-3703-43c1-9434-c5d50c56be52")
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
    @objid ("b4cc95a4-b4f0-43f0-bd82-cab1feb92424")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("3baf8c83-94f2-41f9-8e1f-30a9f0a06098")
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
    @objid ("0b4e2681-c1f0-40da-a95f-7876e203773d")
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
    @objid ("b17be950-b7c2-47bf-82f6-5cb98186a65b")
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

    @objid ("cb93231a-658c-47ae-b062-c07404ba6735")
    protected ContainerMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("0bc17bd6-139f-4ffe-97d9-fd0db467095f")
    public static final class MdaTypes {
        @objid ("fdae353b-8f5b-4412-8cf0-110f28d76060")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("94251a25-11ad-4ee4-b589-3ee6a79b7812")
        private static Stereotype MDAASSOCDEP;

        @objid ("635e75e2-53f3-4f5f-9e55-58a9b5e74136")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("59dc7e8a-f37c-4eee-9bb9-9a16e90324f9")
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
