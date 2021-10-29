/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.04

 * This file was generated on 10/19/21 2:54 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
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
 * Proxy class to handle a {@link Class} with << VMMeasurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0daa56af-0081-4d09-ba8b-b2b01233ee1d")
public class VMMeasurement extends Measurement {
    @objid ("2c0d5c13-34de-4151-9ecb-041699864e7e")
    public static final String STEREOTYPE_NAME = "VMMeasurement";

    /**
     * Tells whether a {@link VMMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VMMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("578f6b20-bf2a-4910-a096-6c50aaf72326")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VMMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VMMeasurement >> then instantiate a {@link VMMeasurement} proxy.
     * 
     * @return a {@link VMMeasurement} proxy on the created {@link Class}.
     */
    @objid ("1c6b7c97-5adc-4dd1-a810-4f6a9fcc6981")
    public static VMMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VMMeasurement.STEREOTYPE_NAME);
        return VMMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link VMMeasurement} proxy from a {@link Class} stereotyped << VMMeasurement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link VMMeasurement} proxy or <i>null</i>.
     */
    @objid ("60f89aab-85c6-4ca1-8533-14ab9d896540")
    public static VMMeasurement instantiate(final Class obj) {
        return VMMeasurement.canInstantiate(obj) ? new VMMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VMMeasurement} proxy from a {@link Class} stereotyped << VMMeasurement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link VMMeasurement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("efc68210-ec8a-4396-b932-3668f735727a")
    public static VMMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VMMeasurement.canInstantiate(obj))
            return new VMMeasurement(obj);
        else
            throw new IllegalArgumentException("VMMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("499a8bb7-5b7f-4bfc-a6f5-3f8ca7faf758")
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
        VMMeasurement other = (VMMeasurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b40650a6-6ed8-4189-84ad-1f147f115b74")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'vm' role.<p>
     * Role description:
     * null
     */
    @objid ("b258e585-7afb-4d79-ad3d-7623c3c7f721")
    public VM getVm() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(VMMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(VMMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "vm")
                  && VM.canInstantiate(d.getDependsOn())) {
                     return (VM)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VM.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'vmInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("e1dcf461-9de7-47dd-a474-3cf3e57625f6")
    public VMInstance getVmInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(VMMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(VMMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "vmInstance")
                  && VMInstance.canInstantiate(d.getDependsOn())) {
                     return (VMInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VMInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("411aee5f-2f81-45ce-8d46-5b81bfda0470")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'vm' role.<p>
     * Role description:
     * null
     */
    @objid ("3c33be2f-cf13-4f84-beb9-8b06412b8ed5")
    public void setVm(final VM obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(VMMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(VMMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "vm")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), VMMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("vm");      dep.putTagValue(VMMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "vm");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'vmInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("680e56aa-aff6-4bdb-957f-0482a19c59eb")
    public void setVmInstance(final VMInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(VMMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(VMMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "vmInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), VMMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("vmInstance");      dep.putTagValue(VMMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "vmInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("66e95669-5640-4c99-9396-2674f011f65a")
    protected VMMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("722c2a2d-2b4b-4306-9ed5-0f04e5426046")
    public static final class MdaTypes {
        @objid ("e6d29051-9ed6-4da6-aa79-9cf721734427")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("092cc4e4-4257-4482-b421-d7cd0848ff6b")
        private static Stereotype MDAASSOCDEP;

        @objid ("ad80859f-9706-4e81-b68f-0091940e86cd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a9415cd7-766c-4e5a-9677-0adb286d3c59")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a33f8ce2-8fb0-4642-be2c-588ae287f860");
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
