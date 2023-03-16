/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.standard.instance.AttributeInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.MeasurableAttributeInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.QualityAttributeInstance;
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
    @objid ("2006d141-a3ab-45a7-a24f-51840a1061c6")
    public static final String STEREOTYPE_NAME = "VMInstance";

    /**
     * Tells whether a {@link VMInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << VMInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("04219eb0-1f65-4f3f-99f2-525f9d3e707a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VMInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << VMInstance >> then instantiate a {@link VMInstance} proxy.
     * 
     * @return a {@link VMInstance} proxy on the created {@link Instance}.
     */
    @objid ("ae0792fb-164c-4f93-a390-e20672734def")
    public static VMInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VMInstance.STEREOTYPE_NAME);
        return VMInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link VMInstance} proxy from a {@link Instance} stereotyped << VMInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link VMInstance} proxy or <i>null</i>.
     */
    @objid ("73865e78-e366-42bb-8666-683224a3ba99")
    public static VMInstance instantiate(final Instance obj) {
        return VMInstance.canInstantiate(obj) ? new VMInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VMInstance} proxy from a {@link Instance} stereotyped << VMInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link VMInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2783d201-4b43-40fb-8826-3feb04cfb032")
    public static VMInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (VMInstance.canInstantiate(obj))
        	return new VMInstance(obj);
        else
        	throw new IllegalArgumentException("VMInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1a534689-5df9-44e5-9b84-420136969dfc")
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
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("629c0c2e-c3e5-40ac-b32a-139d4377ea6e")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value of the 'location' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("34b0345f-9e88-49fd-99e8-41610fbb59f5")
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
     * 
     */
    @objid ("e9760847-7d4e-4172-84cb-25aa09668dbe")
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
                  if (MeasurableAttributeInstance.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttributeInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttributeInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (QualityAttributeInstance.canInstantiate(d.getDependsOn()))
                     return (QualityAttributeInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), QualityAttributeInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeInstance.canInstantiate(d.getDependsOn()))
                     return (AttributeInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("831ee46f-0d5b-47e2-8d99-72c432c68087")
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    @objid ("1cfd7810-4daa-47e4-aa3e-3b35bc41418c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'location' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ed816395-217a-4989-adc5-b2867d10ee95")
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
     * 
     */
    @objid ("983bbbd7-ac6b-40e8-98b8-491d06ebfc74")
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
     * 
     */
    @objid ("654f4002-7d23-4b95-9566-74af07669e27")
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

    @objid ("ba176b46-9e67-4a6e-bf72-f8720a03d27c")
    protected VMInstance(final Instance elt) {
        super(elt);
    }

    @objid ("fe234d2a-6b82-4461-8b1d-47db446666cf")
    public static final class MdaTypes {
        @objid ("4c515836-1559-4dce-9375-5bc28d1ff75e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7fc98717-d9a1-4561-9b2f-6f02816c7f57")
        private static Stereotype MDAASSOCDEP;

        @objid ("0dd77260-108e-46eb-9940-e8eee49b475c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8534e348-774d-4764-85a3-f80201fa7dbb")
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
