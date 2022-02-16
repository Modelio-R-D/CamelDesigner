/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("52f817f3-0caf-4f31-a630-133d9bdeb6ff")
    public static final String STEREOTYPE_NAME = "CommunicationMeasurement";

    /**
     * Tells whether a {@link CommunicationMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CommunicationMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c03409e6-9dff-4127-88a3-07f4791df19d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CommunicationMeasurement >> then instantiate a {@link CommunicationMeasurement} proxy.
     * 
     * @return a {@link CommunicationMeasurement} proxy on the created {@link Class}.
     */
    @objid ("69fb6dd4-22e3-4ab7-8798-bf1fce0f09c8")
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
    @objid ("74212af0-4642-4f75-aabe-7e6364804301")
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
    @objid ("95a90bf8-14c6-4934-9108-fcfdea88dc1b")
    public static CommunicationMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CommunicationMeasurement.canInstantiate(obj))
        	return new CommunicationMeasurement(obj);
        else
        	throw new IllegalArgumentException("CommunicationMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("788456cf-f152-4865-a91a-5caee9a98954")
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
    @objid ("125b2a23-cb78-43bc-80a5-aea696102572")
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
    @objid ("3009715a-dd01-45e1-8584-08e7e6e3ab15")
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
    @objid ("52bff55d-f803-41e2-bb91-52447695b189")
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
    @objid ("77a18b76-8361-4492-b0d2-c4757ce8b152")
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
    @objid ("60342802-a168-487a-a240-210570fee56b")
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

    @objid ("e8ab14d1-d4a6-484c-bf8a-1a54de1b0b8b")
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
    @objid ("3f28f567-2742-4bea-b175-a24662ef3a8c")
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
    @objid ("2e9e6b12-d780-4aa2-a46f-6d8b4c86f249")
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
    @objid ("cbd67143-1b12-49ac-9e8d-1ae71459b4d8")
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
    @objid ("6f0e4058-6206-4b64-8675-9277eb9a7654")
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

    @objid ("5242ae06-4bfb-4d14-8f0b-35ad6778b034")
    protected CommunicationMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("2bc724e6-be76-4f04-8dd1-ded2cd7a4cf6")
    public static final class MdaTypes {
        @objid ("36778b54-94cf-4079-9924-072351f4f783")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("97bae4f8-989e-4d80-8d48-1d6eb7280d31")
        private static Stereotype MDAASSOCDEP;

        @objid ("c275f6a1-dfb1-478c-b11f-e1c862465cad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b175f079-2da9-4f48-bbdf-9a23886d3a6e")
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
