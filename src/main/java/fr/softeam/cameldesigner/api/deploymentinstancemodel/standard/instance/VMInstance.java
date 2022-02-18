/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
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
    @objid ("741563f2-d6f3-4f1b-8d75-d3fb21944079")
    public static final String STEREOTYPE_NAME = "VMInstance";

    /**
     * Tells whether a {@link VMInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << VMInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5011039b-4e09-438e-be1c-2cfe9f09d17d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VMInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << VMInstance >> then instantiate a {@link VMInstance} proxy.
     * 
     * @return a {@link VMInstance} proxy on the created {@link Instance}.
     */
    @objid ("68fba2a1-8d6a-47d7-9c99-ded6522132a5")
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
    @objid ("2600f0f6-4221-4e62-ad3f-4257200cd808")
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
    @objid ("ddf5bebf-86e3-4093-8630-1a9d38d5b8be")
    public static VMInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (VMInstance.canInstantiate(obj))
        	return new VMInstance(obj);
        else
        	throw new IllegalArgumentException("VMInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bc21c83f-3a86-4b09-828e-5cee2e822008")
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
    @objid ("c904e367-2521-4ea6-b84f-924d12e49c87")
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
    @objid ("0d310354-3411-4d6c-966e-13d0ee9a0bf5")
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
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3545a8ed-a8db-4667-8b88-868b1150bfbf")
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    @objid ("dd5ca29c-a37b-4038-9e20-f94b1266a5b1")
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
    @objid ("7161d4fa-6112-4875-bfdd-e0a69c97ff09")
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
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7c81213c-559f-4622-918f-838c58712d3d")
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

    @objid ("ac206494-ecb5-4338-a6ce-16a2eb82942f")
    protected VMInstance(final Instance elt) {
        super(elt);
    }

    @objid ("fe234d2a-6b82-4461-8b1d-47db446666cf")
    public static final class MdaTypes {
        @objid ("8027a461-9f98-4321-a398-eaf2f1b05bc9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("811c71b1-247d-4082-89b1-4617c885ebda")
        private static Stereotype MDAASSOCDEP;

        @objid ("567fb4ce-75a6-4ac0-b42d-1ccd661e03bc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bd3f0aa9-b493-4fde-bc6f-359c522a12b6")
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
