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
 * Proxy class to handle a {@link Class} with << CommunicationMeasurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("edb868dc-4070-4b7f-8e36-da2647d6198a")
public class CommunicationMeasurement extends Measurement {
    @objid ("a2bf27b6-5e61-450f-ae4e-4c763b770c01")
    public static final String STEREOTYPE_NAME = "CommunicationMeasurement";

    /**
     * Tells whether a {@link CommunicationMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CommunicationMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("68f5c241-a6d2-4acf-a1d3-916cc9d8a8d8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CommunicationMeasurement >> then instantiate a {@link CommunicationMeasurement} proxy.
     * 
     * @return a {@link CommunicationMeasurement} proxy on the created {@link Class}.
     */
    @objid ("659055f3-5360-41ec-8623-4a0604831cbf")
    public static CommunicationMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationMeasurement.STEREOTYPE_NAME);
        return CommunicationMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMeasurement} proxy from a {@link Class} stereotyped << CommunicationMeasurement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link CommunicationMeasurement} proxy or <i>null</i>.
     */
    @objid ("cc70a72c-0562-4b9a-8147-1a4f4fe06a54")
    public static CommunicationMeasurement instantiate(final Class obj) {
        return CommunicationMeasurement.canInstantiate(obj) ? new CommunicationMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMeasurement} proxy from a {@link Class} stereotyped << CommunicationMeasurement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link CommunicationMeasurement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9ad68853-9817-4392-9663-772bc9d4c37d")
    public static CommunicationMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CommunicationMeasurement.canInstantiate(obj))
            return new CommunicationMeasurement(obj);
        else
            throw new IllegalArgumentException("CommunicationMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("49e28133-2cb6-4ff0-b92d-2400a58353ec")
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
        CommunicationMeasurement other = (CommunicationMeasurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("0114fcf4-eea3-4c42-a76d-730d76c2da1d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'sourceVM' role.<p>
     * Role description:
     * null
     */
    @objid ("8c97bbee-9d3b-4092-9578-f4a5a8ad16e1")
    public VM getSourceVM() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "sourceVM")
                  && VM.canInstantiate(d.getDependsOn())) {
                     return (VM)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VM.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'sourceVMInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("ffaf4e52-29d2-4b00-93bf-b9a1b18af37e")
    public VMInstance getSourceVMInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "sourceVMInstance")
                  && VMInstance.canInstantiate(d.getDependsOn())) {
                     return (VMInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VMInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'targetVM' role.<p>
     * Role description:
     * null
     */
    @objid ("6139fae3-cd9d-4a24-90c2-4805ecd30cc0")
    public VM getTargetVM() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "targetVM")
                  && VM.canInstantiate(d.getDependsOn())) {
                     return (VM)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VM.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'targetVMInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("078d2073-cf70-4c91-8fa1-d59586419866")
    public VMInstance getTargetVMInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "targetVMInstance")
                  && VMInstance.canInstantiate(d.getDependsOn())) {
                     return (VMInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VMInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("e1e6d159-6cae-41bc-b511-f4eba6bd766c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'sourceVM' role.<p>
     * Role description:
     * null
     */
    @objid ("b9776d49-8919-48d2-b13e-4368678ac460")
    public void setSourceVM(final VM obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CommunicationMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "sourceVM")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CommunicationMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("sourceVM");      dep.putTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "sourceVM");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'sourceVMInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("19d632d7-13b7-4164-9c8c-0f1a86252563")
    public void setSourceVMInstance(final VMInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CommunicationMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "sourceVMInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CommunicationMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("sourceVMInstance");      dep.putTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "sourceVMInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'targetVM' role.<p>
     * Role description:
     * null
     */
    @objid ("2908c723-3f47-4083-bfc2-3fac72f9a694")
    public void setTargetVM(final VM obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CommunicationMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "targetVM")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CommunicationMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("targetVM");      dep.putTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "targetVM");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'targetVMInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("c7912b29-f449-457d-931d-80f4f38def86")
    public void setTargetVMInstance(final VMInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CommunicationMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "targetVMInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CommunicationMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("targetVMInstance");      dep.putTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "targetVMInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("21b5969e-2661-4f35-a7eb-ff2bed6d4191")
    protected CommunicationMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("2bc724e6-be76-4f04-8dd1-ded2cd7a4cf6")
    public static final class MdaTypes {
        @objid ("9cae8c2c-9f41-4c49-8710-47c760faa18a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2e236d31-7109-45a9-a4e5-da6d936237b1")
        private static Stereotype MDAASSOCDEP;

        @objid ("3b037b05-6f89-4d2e-92d5-0dbcb6cf958b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b32e0534-d6d5-4b45-b119-ee04020e5e90")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "438c005e-3455-4a76-ba8b-3791473a3e5a");
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
