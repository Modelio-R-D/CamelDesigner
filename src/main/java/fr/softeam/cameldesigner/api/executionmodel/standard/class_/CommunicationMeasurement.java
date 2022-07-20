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
    @objid ("21e80914-7113-4b8a-9287-970525b677fe")
    public static final String STEREOTYPE_NAME = "CommunicationMeasurement";

    /**
     * Tells whether a {@link CommunicationMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CommunicationMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("be1eb4ea-a322-4e9e-9d46-110718a74941")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CommunicationMeasurement >> then instantiate a {@link CommunicationMeasurement} proxy.
     * 
     * @return a {@link CommunicationMeasurement} proxy on the created {@link Class}.
     */
    @objid ("69f34ef2-364d-4ddb-aa02-588beb1cf909")
    public static CommunicationMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationMeasurement.STEREOTYPE_NAME);
        return CommunicationMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMeasurement} proxy from a {@link Class} stereotyped << CommunicationMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CommunicationMeasurement} proxy or <i>null</i>.
     */
    @objid ("9347fffa-5177-40ee-9504-2665a0956a1b")
    public static CommunicationMeasurement instantiate(final Class obj) {
        return CommunicationMeasurement.canInstantiate(obj) ? new CommunicationMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMeasurement} proxy from a {@link Class} stereotyped << CommunicationMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CommunicationMeasurement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("31832168-e31e-4a7b-a77c-f300f0191c4e")
    public static CommunicationMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CommunicationMeasurement.canInstantiate(obj))
        	return new CommunicationMeasurement(obj);
        else
        	throw new IllegalArgumentException("CommunicationMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("911d529b-935e-43cc-bd42-e973534359f3")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("cb37c2dc-673d-45b5-bd8b-091caf6f0992")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'sourceVM' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("34da1c91-6ccb-4b9a-a219-8bf4f7a157b4")
    public VM getSourceVM() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "sourceVM")){
                  if (VM.canInstantiate(d.getDependsOn()))
                     return (VM)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VM.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'sourceVMInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2e1efa25-3807-4fa7-95fc-62d0a889a9ad")
    public VMInstance getSourceVMInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "sourceVMInstance")){
                  if (VMInstance.canInstantiate(d.getDependsOn()))
                     return (VMInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VMInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'targetVM' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("493ea559-b905-4bf4-9bc8-8a934ee04ca6")
    public VM getTargetVM() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "targetVM")){
                  if (VM.canInstantiate(d.getDependsOn()))
                     return (VM)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VM.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'targetVMInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("726e2d3e-8494-4c7b-8a51-5dd9c2d3e502")
    public VMInstance getTargetVMInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "targetVMInstance")){
                  if (VMInstance.canInstantiate(d.getDependsOn()))
                     return (VMInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VMInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("a0a72eba-7fac-412d-8011-07e1480a620c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'sourceVM' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("70648696-23c3-4e64-b4ba-0364913bff94")
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
     * 
     */
    @objid ("ec9a704a-b9b2-4979-92c7-b67fe29dd73d")
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
     * 
     */
    @objid ("c3965769-f25f-4f27-b5e4-ced8e602a440")
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
     * 
     */
    @objid ("ab88aabf-b66e-4aaa-b2c1-9b590186acff")
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

    @objid ("84965b36-7dc3-40c5-8d11-8ed512a12af8")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("408e2e44-7674-4217-b041-1c531a650b31")
    protected CommunicationMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("2bc724e6-be76-4f04-8dd1-ded2cd7a4cf6")
    public static final class MdaTypes {
        @objid ("3c79e5b6-3590-4c40-8818-bee28f9f877a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4dfa9bdd-b271-41f9-a61f-2a36068dc09c")
        private static Stereotype MDAASSOCDEP;

        @objid ("ee9d7e85-1671-4685-a27a-f6104b6bd459")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("855cae46-3281-40b9-b299-7af634042d10")
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
