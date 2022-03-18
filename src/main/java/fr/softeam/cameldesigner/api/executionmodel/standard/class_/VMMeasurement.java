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
 * Proxy class to handle a {@link Class} with << VMMeasurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0daa56af-0081-4d09-ba8b-b2b01233ee1d")
public class VMMeasurement extends Measurement {
    @objid ("955f86b7-34b4-4350-b398-2a59b0e78838")
    public static final String STEREOTYPE_NAME = "VMMeasurement";

    /**
     * Tells whether a {@link VMMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VMMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3e84bf0d-fed9-4511-a468-b60a87a0f9ef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VMMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VMMeasurement >> then instantiate a {@link VMMeasurement} proxy.
     * 
     * @return a {@link VMMeasurement} proxy on the created {@link Class}.
     */
    @objid ("f90395bc-f3e7-470b-a184-5d619bdb87e2")
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
    @objid ("d200bb17-8772-4b9f-90c8-eab1811ad1d5")
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
    @objid ("d8754da2-529d-4868-a3e1-4f9d1d075189")
    public static VMMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VMMeasurement.canInstantiate(obj))
        	return new VMMeasurement(obj);
        else
        	throw new IllegalArgumentException("VMMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("911c19dd-fd6b-446a-b705-ce4f2f7116d2")
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
    @objid ("f7cc6880-8ace-492b-8205-48846c94ffa4")
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
    @objid ("f7d3526c-7843-4791-aacc-e38b7d09dc23")
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
    @objid ("d7c36b42-7246-4e37-81de-4646472a1bfb")
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

    @objid ("8a82d171-ac4a-4ed5-ad13-468243925616")
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
    @objid ("6e048662-4e22-4304-9adb-64ed11e9328a")
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
    @objid ("62f41f84-cf61-4129-8a6d-1f3c8474c614")
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

    @objid ("916a4f27-a366-4bc0-b8a0-9d653d3c7c2c")
    protected VMMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("722c2a2d-2b4b-4306-9ed5-0f04e5426046")
    public static final class MdaTypes {
        @objid ("8deb2ae6-8f3d-4aa1-9663-8781063decc0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7ad0a62e-96fb-4355-80f8-113768d1cfbf")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1006d85-5595-42e6-807c-c447d41b137a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9e7268dd-021e-4dbc-b8f0-5a674cd2ec5e")
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
