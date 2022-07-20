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
 * Proxy class to handle a {@link Class} with << VMMeasurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0daa56af-0081-4d09-ba8b-b2b01233ee1d")
public class VMMeasurement extends Measurement {
    @objid ("854de2f9-80c0-45ae-b053-8b3978a7931f")
    public static final String STEREOTYPE_NAME = "VMMeasurement";

    /**
     * Tells whether a {@link VMMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VMMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1b131344-0c7e-45b1-985e-691f216d72a8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VMMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VMMeasurement >> then instantiate a {@link VMMeasurement} proxy.
     * 
     * @return a {@link VMMeasurement} proxy on the created {@link Class}.
     */
    @objid ("255e1737-c29d-4037-a3c6-796f9376e80f")
    public static VMMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VMMeasurement.STEREOTYPE_NAME);
        return VMMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link VMMeasurement} proxy from a {@link Class} stereotyped << VMMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link VMMeasurement} proxy or <i>null</i>.
     */
    @objid ("5f309433-b029-4a82-b3dd-d9f42bab89e1")
    public static VMMeasurement instantiate(final Class obj) {
        return VMMeasurement.canInstantiate(obj) ? new VMMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VMMeasurement} proxy from a {@link Class} stereotyped << VMMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link VMMeasurement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7a9e1cd3-3885-4679-850f-9beb04de1c70")
    public static VMMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VMMeasurement.canInstantiate(obj))
        	return new VMMeasurement(obj);
        else
        	throw new IllegalArgumentException("VMMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("779bb7c0-9d93-4aeb-9e97-8042adcf6375")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1b053b44-b8bf-40d3-ad1a-d21636d2676c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'vm' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b10a883d-e32b-47f9-a4c1-6276cddaf27a")
    public VM getVm() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(VMMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(VMMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "vm")){
                  if (VM.canInstantiate(d.getDependsOn()))
                     return (VM)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VM.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'vmInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a118346a-ffa7-4c84-9ce3-67632dba4deb")
    public VMInstance getVmInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(VMMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(VMMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "vmInstance")){
                  if (VMInstance.canInstantiate(d.getDependsOn()))
                     return (VMInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VMInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("b87c4e1d-fdbd-495a-90f5-3900ba30b75a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'vm' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("86ca28fb-3795-488e-995f-6ab3b58daa90")
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
     * 
     */
    @objid ("fe29a531-6313-4dd1-8952-7da57d7a64b7")
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

    @objid ("5f078d78-d78d-4e11-8b46-f0cdc7013b70")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("70afc797-8fe0-4741-a147-5984ed531925")
    protected VMMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("722c2a2d-2b4b-4306-9ed5-0f04e5426046")
    public static final class MdaTypes {
        @objid ("88073d79-c31e-4a9f-979a-fc2f1d344f08")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b3f94d1d-2701-4342-8308-3f9fb3ec7b54")
        private static Stereotype MDAASSOCDEP;

        @objid ("4111cc9e-6807-4658-95d4-d9073eb334f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5991bb8c-3b9f-49df-9374-b4d66f7461fb")
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
