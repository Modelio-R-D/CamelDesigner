/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("8e9afd91-7b68-4909-9bea-30d591cbdcef")
    public static final String STEREOTYPE_NAME = "CommunicationMeasurement";

    /**
     * Tells whether a {@link CommunicationMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CommunicationMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("79dcc30c-712f-49f8-a9d4-56f80d1f6598")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CommunicationMeasurement >> then instantiate a {@link CommunicationMeasurement} proxy.
     * 
     * @return a {@link CommunicationMeasurement} proxy on the created {@link Class}.
     */
    @objid ("0db0cf21-7b5f-41a4-8d85-6d2b23762cb7")
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
    @objid ("415a3454-ac68-4f7c-aaba-a4ea3f10c511")
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
    @objid ("9d257aeb-c85e-4c53-ba85-5d51be37493c")
    public static CommunicationMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CommunicationMeasurement.canInstantiate(obj))
        	return new CommunicationMeasurement(obj);
        else
        	throw new IllegalArgumentException("CommunicationMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6005eb86-6978-4215-ab81-65e7bed0f77a")
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
    @objid ("f87bec9c-39f8-4cd1-a5fa-653d49d9ba01")
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
    @objid ("22254cae-5b72-404b-aa7f-da9ebf3071f4")
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
    @objid ("272b53c0-e28a-4a4c-86ad-6b257cee52dc")
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
    @objid ("92aecec3-abf4-421c-933e-88b9b27a15ad")
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
    @objid ("a01f0375-01e6-4a09-bbf3-101fe789516d")
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

    @objid ("ff4784b7-27df-480f-bfbd-0fe25fe92a67")
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
    @objid ("200479dc-8a5c-4246-a160-ebfad8ed16a7")
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
    @objid ("ffdb8a78-0eb1-40a0-94ae-fd4ba105b598")
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
    @objid ("5a71336b-6e5f-4772-8dce-c1fcd78cb8ee")
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
    @objid ("e9b74e66-12dd-414a-981e-1345509e1855")
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

    @objid ("fd3c1b50-5cab-4c8d-9dd1-6e17016ea021")
    protected CommunicationMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("2bc724e6-be76-4f04-8dd1-ded2cd7a4cf6")
    public static final class MdaTypes {
        @objid ("9213bfb9-9391-4067-b6d6-0c058fbe6cbb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("121679a6-7db6-4a7e-b17d-6c2d4afe3dc1")
        private static Stereotype MDAASSOCDEP;

        @objid ("c58a70d4-0a2a-4946-b7f3-8de7b39a4d55")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("67da5141-7cb7-449d-8f38-88561f58c2c4")
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
