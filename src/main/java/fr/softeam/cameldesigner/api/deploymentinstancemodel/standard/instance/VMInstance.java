/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.MeasurableAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.QualityAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttributeClass;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << VMInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8d75b5a3-1b22-4793-a4d1-8b8d4ec31008")
public class VMInstance extends ComponentInstance {
    @objid ("f458b89c-c374-4e0e-a9e4-97396a682247")
    public static final String STEREOTYPE_NAME = "VMInstance";

    /**
     * Tells whether a {@link VMInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << VMInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("43be0f24-ecae-4f93-b66a-ff76cd4443ce")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VMInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << VMInstance >> then instantiate a {@link VMInstance} proxy.
     * 
     * @return a {@link VMInstance} proxy on the created {@link Instance}.
     */
    @objid ("cd8130a6-83e4-4a55-ad80-60a1a80eae60")
    public static VMInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VMInstance.STEREOTYPE_NAME);
        return VMInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link VMInstance} proxy from a {@link Instance} stereotyped << VMInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Instance
     * @return a {@link VMInstance} proxy or <i>null</i>.
     */
    @objid ("a349ad05-bc67-4732-b805-3b16e607960f")
    public static VMInstance instantiate(final Instance obj) {
        return VMInstance.canInstantiate(obj) ? new VMInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VMInstance} proxy from a {@link Instance} stereotyped << VMInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Instance}
     * @return a {@link VMInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ad560ce3-d832-4d5f-85cc-3ff7c21c0d9e")
    public static VMInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (VMInstance.canInstantiate(obj))
            return new VMInstance(obj);
        else
            throw new IllegalArgumentException("VMInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9c7f7df0-3248-42cc-b0a4-2f7edad5f5cf")
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
        VMInstance other = (VMInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}.
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("8519d2d5-7924-44c0-95c3-611c1bc71afc")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value of the 'location' role.<p>
     * Role description:
     * null
     */
    @objid ("ff52f072-cd39-4c47-951d-c677e9e0780a")
    public Location getLocation() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(VMInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(VMInstance.MdaTypes.MDAASSOCDEP_ROLE), "location")){
                  if (CloudLocation.canInstantiate(d.getDependsOn()))
                     return (CloudLocation)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CloudLocation.MdaTypes.STEREOTYPE_ELT.getName());
                  if (GeographicalRegion.canInstantiate(d.getDependsOn()))
                     return (GeographicalRegion)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'os' role.<p>
     * Role description:
     * null
     */
    @objid ("eecf982e-5d3e-466a-98d7-8ea58895e214")
    public CamelAttribute getOs() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(VMInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(VMInstance.MdaTypes.MDAASSOCDEP_ROLE), "os")){
                  if (MeasurableAttributeAttribute.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (QualityAttributeAttribute.canInstantiate(d.getDependsOn()))
                     return (QualityAttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), QualityAttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeAttribute.canInstantiate(d.getDependsOn()))
                     return (AttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MeasurableAttributeClass.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttributeClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Certifiable.canInstantiate(d.getDependsOn()))
                     return (Certifiable)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Certifiable.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SecurityAttribute.canInstantiate(d.getDependsOn()))
                     return (SecurityAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (QualityAttributeClass.canInstantiate(d.getDependsOn()))
                     return (QualityAttributeClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), QualityAttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeClass.canInstantiate(d.getDependsOn()))
                     return (AttributeClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("ba1faf01-5450-4b4f-aa85-d238146e42a4")
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    @objid ("8771cb77-f4b1-4376-a57d-1783253cff33")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'location' role.<p>
     * Role description:
     * null
     */
    @objid ("5a5f3a95-d23c-474a-9216-9db2d975833e")
    public void setLocation(final Location obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(VMInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(VMInstance.MdaTypes.MDAASSOCDEP_ROLE), "location")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), VMInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("location");      dep.putTagValue(VMInstance.MdaTypes.MDAASSOCDEP_ROLE, "location");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'os' role.<p>
     * Role description:
     * null
     */
    @objid ("70bd861f-afd5-4ac5-b718-1ce9826a0233")
    public void setOs(final CamelAttribute obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(VMInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(VMInstance.MdaTypes.MDAASSOCDEP_ROLE), "os")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), VMInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("os");      dep.putTagValue(VMInstance.MdaTypes.MDAASSOCDEP_ROLE, "os");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("0fd731db-f456-40ff-b176-2bf5b88ebdcf")
    public void setParent(final DeploymentInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("3d61a589-5548-406e-b06f-bbe3221b1a83")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("aa83f607-b91b-4e79-9b87-63efaf81535d")
    protected VMInstance(final Instance elt) {
        super(elt);
    }

    @objid ("fe234d2a-6b82-4461-8b1d-47db446666cf")
    public static final class MdaTypes {
        @objid ("4f7b7985-9416-4011-8cff-46ff57c7cb86")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3320aa2c-c9e8-484e-b161-baf9317515cc")
        private static Stereotype MDAASSOCDEP;

        @objid ("24d4bdc6-166e-4c20-892c-dd27c02fb4f1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cf44a915-b983-4ffa-8ad1-0477d3f4189b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a9a4550c-517a-4781-a3c9-5eb56d430f48");
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
