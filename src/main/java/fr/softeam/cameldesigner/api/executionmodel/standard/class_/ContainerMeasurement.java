/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("5256cd79-c456-4fce-bb11-19e5886f8b33")
    public static final String STEREOTYPE_NAME = "ContainerMeasurement";

    /**
     * Tells whether a {@link ContainerMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ContainerMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("daadc08d-2d30-47b2-8ab8-a225c1414419")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ContainerMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ContainerMeasurement >> then instantiate a {@link ContainerMeasurement} proxy.
     * 
     * @return a {@link ContainerMeasurement} proxy on the created {@link Class}.
     */
    @objid ("a74f02d0-4f65-43a0-8f30-eed87eb9fde8")
    public static ContainerMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ContainerMeasurement.STEREOTYPE_NAME);
        return ContainerMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ContainerMeasurement} proxy from a {@link Class} stereotyped << ContainerMeasurement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ContainerMeasurement} proxy or <i>null</i>.
     */
    @objid ("7f4c082c-1553-4699-9fbc-9f1a7a18ec3c")
    public static ContainerMeasurement instantiate(final Class obj) {
        return ContainerMeasurement.canInstantiate(obj) ? new ContainerMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ContainerMeasurement} proxy from a {@link Class} stereotyped << ContainerMeasurement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ContainerMeasurement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("92d2a024-2260-4d8f-b202-5df6d33c7823")
    public static ContainerMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ContainerMeasurement.canInstantiate(obj))
            return new ContainerMeasurement(obj);
        else
            throw new IllegalArgumentException("ContainerMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e6ac9f63-7ebe-4eb1-a2c7-d4074ba1a1aa")
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
     */
    @objid ("3b24e323-85e0-42fc-83e7-244117d50ede")
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
     */
    @objid ("06ada6fd-931f-4280-9955-83aa65ddf6b2")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f8e838f3-5f22-4573-b030-4f2705bd3ff3")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("e5a0220a-8749-4c26-a407-b11aa5608799")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'container' role.<p>
     * Role description:
     * null
     */
    @objid ("24a8b73b-00eb-4aa1-88ce-da5e0ef4b796")
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
     */
    @objid ("49962d10-04d0-448e-b639-7af5fbd5f541")
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

    @objid ("187a32a3-ded3-44d0-856a-a4884dcf836d")
    protected ContainerMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("0bc17bd6-139f-4ffe-97d9-fd0db467095f")
    public static final class MdaTypes {
        @objid ("25d7fd49-963b-443b-a589-7aa62a0e7d4a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0bfad580-7200-4bc1-8442-4f7b61010e19")
        private static Stereotype MDAASSOCDEP;

        @objid ("9ba3d774-a047-49b9-8f14-7832b43a6430")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0579d4f6-ac0b-4b69-8dac-fd9bc23f5c66")
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
