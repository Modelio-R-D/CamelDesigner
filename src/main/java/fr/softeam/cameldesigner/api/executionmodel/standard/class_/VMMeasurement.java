/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("9a197bb4-1d5d-420d-ad4c-774b8023f840")
    public static final String STEREOTYPE_NAME = "VMMeasurement";

    /**
     * Tells whether a {@link VMMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VMMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d44debd9-e890-41a9-9836-18979feaf204")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VMMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VMMeasurement >> then instantiate a {@link VMMeasurement} proxy.
     * 
     * @return a {@link VMMeasurement} proxy on the created {@link Class}.
     */
    @objid ("eeca3c64-5f6f-4998-85f3-d6cc29b79299")
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
    @objid ("9d196ba9-1062-44a0-94f8-71c9758db81d")
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
    @objid ("282e7a36-ce24-42c7-89af-d4ceea3a1e7f")
    public static VMMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VMMeasurement.canInstantiate(obj))
        	return new VMMeasurement(obj);
        else
        	throw new IllegalArgumentException("VMMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("31fe2664-0458-4a60-b432-e678c3747806")
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
    @objid ("1c173782-d47f-4b9b-8c00-6a10fa79cb8a")
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
    @objid ("1da29106-458d-4f56-930f-5f279126a3e4")
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
    @objid ("0800586f-f5b9-411d-bf9b-26c2b48ce7bc")
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

    @objid ("49612810-cf4e-451c-9275-0e20840b49b3")
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
    @objid ("24e395c7-8374-4be0-a4a9-150a230354e1")
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
    @objid ("277eaf07-b827-4852-a313-ca27f590a7c2")
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

    @objid ("d042006b-bf91-4467-9c7e-7f05885fd8ff")
    protected VMMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("722c2a2d-2b4b-4306-9ed5-0f04e5426046")
    public static final class MdaTypes {
        @objid ("73518117-e8b8-4c8a-b562-f9f29963780d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5c4ea909-6edf-42e5-9692-f9ed8184ec19")
        private static Stereotype MDAASSOCDEP;

        @objid ("ee4d0607-459f-475e-a9e9-9ebc2aea90d6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("789a6683-1cca-4891-b4cb-d3de43bbf241")
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
