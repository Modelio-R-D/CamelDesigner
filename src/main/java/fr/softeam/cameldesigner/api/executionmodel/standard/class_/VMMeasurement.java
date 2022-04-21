/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("98bf30c4-8516-4a59-8c79-844ecd65bb6c")
    public static final String STEREOTYPE_NAME = "VMMeasurement";

    /**
     * Tells whether a {@link VMMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VMMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("63a9a50a-bbf6-4b31-931e-450582d745b0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VMMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VMMeasurement >> then instantiate a {@link VMMeasurement} proxy.
     * 
     * @return a {@link VMMeasurement} proxy on the created {@link Class}.
     */
    @objid ("280dfaa2-dd5a-4977-b924-b54775563ab8")
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
    @objid ("b5f8719d-d4d9-425b-9640-a7a5b1efb5f2")
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
    @objid ("b631030d-7873-4746-bce7-bf6869684fe5")
    public static VMMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VMMeasurement.canInstantiate(obj))
            return new VMMeasurement(obj);
        else
            throw new IllegalArgumentException("VMMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b70797e6-e17a-4fc1-8c6a-7b026e0ee8a8")
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
    @objid ("2483a713-d58f-4ab1-aad3-e8ec69be8b7d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'vm' role.<p>
     * Role description:
     * null
     */
    @objid ("9361d3c0-08e9-4bbe-9db7-859ac1a5c797")
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
     */
    @objid ("a126e6ac-5397-472f-94d0-00c92fb5d231")
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

    @objid ("0edb0394-9171-4462-8461-347119ef09c4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'vm' role.<p>
     * Role description:
     * null
     */
    @objid ("5df73462-2e90-4094-89d5-77e789b4bc98")
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
    @objid ("25a655d3-3172-43fa-ad96-a7efdc317005")
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

    @objid ("004825b9-84c2-435a-b70d-7fd7e0f5da93")
    protected VMMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("722c2a2d-2b4b-4306-9ed5-0f04e5426046")
    public static final class MdaTypes {
        @objid ("8f564a9f-9d0b-447d-bd65-44c175fc5aab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8b3c2863-e666-4872-b40e-0ffa9ba90620")
        private static Stereotype MDAASSOCDEP;

        @objid ("d4c419c3-60f5-424d-83ad-28ee69dcdf30")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("38d4f422-4415-4e8d-886b-2a5e573a4744")
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
