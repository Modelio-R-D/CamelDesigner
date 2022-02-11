/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("7177a3e6-88de-44d8-8b06-6d3340c79eec")
    public static final String STEREOTYPE_NAME = "VMInstance";

    /**
     * Tells whether a {@link VMInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << VMInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e8c1ab37-5bc7-4b71-937c-755159d8438a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VMInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << VMInstance >> then instantiate a {@link VMInstance} proxy.
     * 
     * @return a {@link VMInstance} proxy on the created {@link Instance}.
     */
    @objid ("04c01cd5-c0d0-48d0-aa42-3957415baef1")
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
    @objid ("214de944-b2aa-4297-8dea-8e98c1b0b1b1")
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
    @objid ("518a0d75-1fb9-4961-bef5-4213c2046838")
    public static VMInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (VMInstance.canInstantiate(obj))
            return new VMInstance(obj);
        else
            throw new IllegalArgumentException("VMInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("da639119-2bd3-47b0-a6e1-5f454361ae85")
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
    @objid ("a80d1828-8c3a-436f-8b76-1075a0bb5ca3")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value of the 'location' role.<p>
     * Role description:
     * null
     */
    @objid ("25a263f9-a7ae-4c47-b641-a1d8d771a146")
    public Location getLocation() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(VMInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(VMInstance.MdaTypes.MDAASSOCDEP_ROLE), "location")
                  && Location.canInstantiate(d.getDependsOn())) {
                     return (Location)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Location.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("c47431b9-d6ba-461f-bad4-01c254351171")
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    @objid ("7e16a60b-34bf-4a08-909c-e29bbd1213e8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'location' role.<p>
     * Role description:
     * null
     */
    @objid ("a1a35d50-dd09-4c29-aeb4-aa5dccd8c131")
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
     */
    @objid ("3893392f-3ed0-408f-8ce7-5e6647f56868")
    public void setParent(final DeploymentInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("c97bf005-55a4-4e9f-ac7f-28992249a01c")
    protected VMInstance(final Instance elt) {
        super(elt);
    }

    @objid ("3d61a589-5548-406e-b06f-bbe3221b1a83")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("fe234d2a-6b82-4461-8b1d-47db446666cf")
    public static final class MdaTypes {
        @objid ("277ada12-b3de-4796-be55-f2f137f14171")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad8d7729-b59a-4819-bf07-3bf95fa8b5e1")
        private static Stereotype MDAASSOCDEP;

        @objid ("373fc019-2150-4347-b528-c426b2c5feb5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("22009522-9da7-4b45-a7ed-ab7ebf591c3f")
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
