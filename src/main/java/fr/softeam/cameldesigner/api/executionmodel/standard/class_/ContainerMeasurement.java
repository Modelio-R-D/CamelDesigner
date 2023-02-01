/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5dbb32dc-882a-48f1-8c5c-c72d8526b7c9")
=======
    @objid ("9207a9bb-c3de-4bdf-8604-539054e449b2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "ContainerMeasurement";

    /**
     * Tells whether a {@link ContainerMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ContainerMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("f2690911-2cfb-4cf4-93db-aa0fabf83b27")
=======
    @objid ("2fec2cca-2b40-431b-9ca6-7057b2264e50")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ContainerMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ContainerMeasurement >> then instantiate a {@link ContainerMeasurement} proxy.
     * 
     * @return a {@link ContainerMeasurement} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("e175fa58-490f-4da1-aafa-8b0577802072")
=======
    @objid ("21d086d8-c177-40e6-9db9-672c4e0cbb72")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5f1500d9-2c9a-4aaf-b4e3-440535a433e7")
=======
    @objid ("64892cd1-1114-4567-b809-fde20e5fe0bb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d3a15c88-82b0-405a-8cb2-34d38e7a0e3d")
=======
    @objid ("97c39bbd-f68f-4515-a10c-51adf537f2db")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ContainerMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ContainerMeasurement.canInstantiate(obj))
        	return new ContainerMeasurement(obj);
        else
        	throw new IllegalArgumentException("ContainerMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("453a479f-6de6-4d13-a97e-be8d2cc6ed59")
=======
    @objid ("6afe6e33-3316-4048-9f00-15ec3b3c12eb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("340ca356-2ade-4768-9ab1-d2241d1dda1d")
=======
    @objid ("21522b90-1182-4034-966c-538fff5b9662")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("70e78b6d-e6de-40a3-a939-9a1ddc663feb")
=======
    @objid ("b96e49b4-abee-41f6-988c-d4af4e8afe00")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d08755fd-ce6d-4e54-93f9-788ff68572a7")
=======
    @objid ("87526a5a-af35-4304-ae89-867081eaa88a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("fb9f567e-7387-471f-8bc5-120e5f87fef4")
=======
    @objid ("699774f7-ec35-452b-9446-56718994a794")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("32d9a48e-4a21-4ffc-b471-83914300b6bf")
=======
    @objid ("cb95e235-83ff-4351-ab58-fa083c5a67c0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3ffa4d92-c27b-48a9-b26c-f319c0a01ca2")
=======
    @objid ("6b8dd374-72c8-4765-aa86-00424b6358ec")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("62f8ed72-d00d-4f53-b410-b425ec5e70b5")
=======
    @objid ("708e426e-97c5-46fc-a0f5-d366b71802fb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ContainerMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("0bc17bd6-139f-4ffe-97d9-fd0db467095f")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("0e6deb72-6004-4dbc-b5bd-a20b5f27662c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("481e7ade-75a2-427b-9ff9-71c082fe0689")
        private static Stereotype MDAASSOCDEP;

        @objid ("faf11d9f-e82b-4430-adc9-3cd8fd672c69")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aa2932b5-1b82-44c8-8f39-e6d7563ac550")
=======
        @objid ("17cedf71-ad42-4f62-a00d-5dd642ca5065")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1b72803c-4300-4a84-ad42-20fb1867f2bf")
        private static Stereotype MDAASSOCDEP;

        @objid ("4f14bcd1-2f3a-426f-ae81-7bb97001ddc9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("320e46e4-5efc-46b2-9099-1c1653089552")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
