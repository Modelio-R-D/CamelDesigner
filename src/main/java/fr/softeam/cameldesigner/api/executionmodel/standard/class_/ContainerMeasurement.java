/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("df3e1c45-6ee2-4888-b86f-ee7a4bfc17cd")
    public static final String STEREOTYPE_NAME = "ContainerMeasurement";

    /**
     * Tells whether a {@link ContainerMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ContainerMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1845de12-ffa6-4e3d-923c-652fb1793c9c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ContainerMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ContainerMeasurement >> then instantiate a {@link ContainerMeasurement} proxy.
     * 
     * @return a {@link ContainerMeasurement} proxy on the created {@link Class}.
     */
    @objid ("808cf0a0-85f1-436f-9c2e-5aaf9018838c")
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
    @objid ("9908402d-daff-4245-b639-6636f15b9ed4")
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
    @objid ("ec976e63-61ff-4b8d-9e8e-da7364d9ce43")
    public static ContainerMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ContainerMeasurement.canInstantiate(obj))
        	return new ContainerMeasurement(obj);
        else
        	throw new IllegalArgumentException("ContainerMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("69a42de9-71d7-4d74-ae78-95ed000feb73")
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
    @objid ("2dbeda1b-2c0f-4fea-b739-cedfb60d3757")
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
    @objid ("4e5468e5-dffb-4ba6-bbb1-ba93b1b6d307")
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
    @objid ("cc2759b0-8f07-40f4-b2e9-b68d957754cc")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("bbbacff0-5105-49d3-9b69-1b85fe55802c")
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
    @objid ("3cbaae1e-4247-4d6d-99c2-b6a777495d2a")
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
    @objid ("2ff77b86-2c85-4012-9edb-e1065e8b5ca8")
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

    @objid ("6e969228-aeec-4644-92f7-ec12b0ca1cd5")
    protected ContainerMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("0bc17bd6-139f-4ffe-97d9-fd0db467095f")
    public static final class MdaTypes {
        @objid ("59073ffd-1181-4e49-9268-83d560f60362")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("98a180c5-0ada-440a-a907-31cc7a945b01")
        private static Stereotype MDAASSOCDEP;

        @objid ("73409fda-c389-40b5-97bb-6e8e694f667a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("abf40f96-5225-4827-8593-7fccb0443977")
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
