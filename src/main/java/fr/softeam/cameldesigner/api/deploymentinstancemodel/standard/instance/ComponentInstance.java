/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
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
 * Proxy class to handle a {@link Instance} with << ComponentInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5558f77d-42a8-4e10-8393-56d67ba21511")
public abstract class ComponentInstance extends FeatureInstance {
    @objid ("7d8b1ce2-2161-4cd1-acac-90cba18af266")
    public static final String STEREOTYPE_NAME = "ComponentInstance";

    @objid ("dba8464a-9cbb-4f4a-b848-650bc52bb9ea")
    public static final String DESTROYEDON_TAGTYPE = "destroyedOn";

    @objid ("fb7d3a39-0cc8-4165-b5a3-55fb3dcf6eff")
    public static final String INSTANTIATEDON_TAGTYPE = "instantiatedOn";

    /**
     * Add a value to the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("4e891b1e-30ca-4b37-b249-b9dc2106bf35")
    public void addProvidedCommunicationInstances(final CommunicationPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ComponentInstance.MdaTypes.MDAASSOCDEP);
            d.setName("providedCommunicationInstances");
            d.putTagValue(ComponentInstance.MdaTypes.MDAASSOCDEP_ROLE, "providedCommunicationInstances");
        }
    }

    /**
     * Add a value to the 'providedHostInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("6b6d2ffd-2029-40c2-8912-cb6c922b4aef")
    public void addProvidedHostInstances(final HostingPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ComponentInstance.MdaTypes.MDAASSOCDEP);
            d.setName("providedHostInstances");
            d.putTagValue(ComponentInstance.MdaTypes.MDAASSOCDEP_ROLE, "providedHostInstances");
        }
    }

    @objid ("aba15574-a7d5-4f7e-b4a4-ac7d8502ec26")
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
        ComponentInstance other = (ComponentInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'destroyedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("64a6cf0e-1d84-4159-9e00-10f53e8ec0d5")
    public String getDestroyedOn() {
        return this.elt.getTagValue(ComponentInstance.MdaTypes.DESTROYEDON_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}.
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("67b6d60c-33e9-4c6d-be53-7bb4193edc44")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'instantiatedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3ced9ace-8095-4e74-8f66-30ac0e20288b")
    public String getInstantiatedOn() {
        return this.elt.getTagValue(ComponentInstance.MdaTypes.INSTANTIATEDON_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("c5203b23-bc2d-43a2-9c11-d42ccf1fe5ae")
    public List<CommunicationPort> getProvidedCommunicationInstances() {
        List<CommunicationPort> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(ComponentInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "providedCommunicationInstances")
              && CommunicationPort.canInstantiate(d.getDependsOn()))
                results.add((CommunicationPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationPort.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'providedHostInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("1e500772-4b15-4adb-9d47-276d2fceaf92")
    public List<HostingPort> getProvidedHostInstances() {
        List<HostingPort> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(ComponentInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "providedHostInstances")
              && HostingPort.canInstantiate(d.getDependsOn()))
                results.add((HostingPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HostingPort.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("07dc5635-f915-4846-966b-010be1d61865")
    public CamelComponent getType() {
        return (CamelComponent)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), CamelComponent.STEREOTYPE_NAME);
    }

    @objid ("46529875-3c90-4cae-ab77-f7c312eecb21")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("002d98d5-476a-4990-8657-baa72957b0a1")
    public boolean removeProvidedCommunicationInstances(final CommunicationPort obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ComponentInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'providedHostInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("4110ad59-b064-41a8-873a-9e0e48de8c1d")
    public boolean removeProvidedHostInstances(final HostingPort obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ComponentInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'destroyedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8b3bdb93-2883-4c6e-aa58-941ecbc09382")
    public void setDestroyedOn(final String value) {
        this.elt.putTagValue(ComponentInstance.MdaTypes.DESTROYEDON_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'instantiatedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b5e0fa72-3b6c-45a4-870f-ff78ca0a1f67")
    public void setInstantiatedOn(final String value) {
        this.elt.putTagValue(ComponentInstance.MdaTypes.INSTANTIATEDON_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("593d6140-319a-42bf-9747-b173d5b95623")
    public void setType(final CamelComponent obj) {
        ((Instance) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    @objid ("637024fb-f846-40f1-b976-867c364a3f50")
    protected ComponentInstance(final Instance elt) {
        super(elt);
    }

    @objid ("410e6123-df3d-46bd-81d2-a929ad0d6a01")
    public static final class MdaTypes {
        @objid ("911c5d35-3da9-41e8-97a6-d134b9cc64af")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b8b46d1f-d8b7-4f52-b21b-f25036430c14")
        public static TagType INSTANTIATEDON_TAGTYPE_ELT;

        @objid ("c240ebce-cf80-448f-8847-7937fe44d8df")
        public static TagType DESTROYEDON_TAGTYPE_ELT;

        @objid ("541d0751-cc2b-431e-b230-10ea9a85f064")
        private static Stereotype MDAASSOCDEP;

        @objid ("46164075-0d09-42a2-a6c4-86968b2a27d7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0b70ba24-ee4b-4907-bb01-c28de2356c5c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aba476b3-2629-42d6-9138-1bf866332333");
            INSTANTIATEDON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e6ac56dd-6986-41e3-944d-c5fad2bd2b84");
            DESTROYEDON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fb31df1a-95e1-40e6-aea3-f1c4fc314882");
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
