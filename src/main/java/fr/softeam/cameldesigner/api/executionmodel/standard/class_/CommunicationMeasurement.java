/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("dcbc2f98-a071-4107-8972-6fe3daf0f141")
    public static final String STEREOTYPE_NAME = "CommunicationMeasurement";

    /**
     * Tells whether a {@link CommunicationMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CommunicationMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d64bef90-e8be-44e2-b4f6-9b37025d22ab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CommunicationMeasurement >> then instantiate a {@link CommunicationMeasurement} proxy.
     * 
     * @return a {@link CommunicationMeasurement} proxy on the created {@link Class}.
     */
    @objid ("e3b04e91-e0c1-4e91-ba03-41ffb033524c")
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
    @objid ("a07d03f9-c60f-4a53-a54a-e681ee9f6326")
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
    @objid ("4972232a-261d-4aca-8caa-24ce37ccddb5")
    public static CommunicationMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CommunicationMeasurement.canInstantiate(obj))
        	return new CommunicationMeasurement(obj);
        else
        	throw new IllegalArgumentException("CommunicationMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("79333118-2920-42b7-8562-e32b056842b8")
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
    @objid ("3bd40b34-db8a-412d-a17c-738c819bf5d8")
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
    @objid ("a291e5f7-78b0-4d68-a0d7-ec72188ef760")
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
    @objid ("4eade902-f52e-4570-890f-c6308d672755")
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
    @objid ("a151387a-8d7c-40c6-9a7e-14af2ef7cc50")
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
    @objid ("2620a4e2-69b0-4ec2-833c-100358b3fe87")
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

    @objid ("87ad5146-c172-46e9-b5c8-1adc238e06f4")
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
    @objid ("ce2dbf73-fb84-4689-9d93-1fd708301391")
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
    @objid ("d1d44d0a-58f7-467e-bbbd-891cad5e7db8")
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
    @objid ("c07b9b09-856f-4de6-a2ff-7ec7f516743a")
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
    @objid ("e6d5e032-861f-4c0e-b9c4-e8b1ebcbaf17")
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

    @objid ("92f1bd5d-9d6d-42bf-9dfc-a45e29aaaa5b")
    protected CommunicationMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("2bc724e6-be76-4f04-8dd1-ded2cd7a4cf6")
    public static final class MdaTypes {
        @objid ("7a1c4461-246b-4298-b236-994afb97e738")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d2fc4a9b-8517-4d5e-8ba2-0ce9ed664d2a")
        private static Stereotype MDAASSOCDEP;

        @objid ("da46246b-555f-4fca-a3f0-191c203650f6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("94c5d20d-3203-4fcc-99b1-a062c3478fba")
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
