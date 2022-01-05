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
 * Proxy class to handle a {@link Instance} with << ContainerInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("71cdb732-b116-447d-abd2-a9db81cf0f17")
public class ContainerInstance extends ComponentInstance {
    @objid ("01e0d02e-bc72-4ea9-a71e-d61634d2a6e6")
    public static final String STEREOTYPE_NAME = "ContainerInstance";

    /**
     * Tells whether a {@link ContainerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ContainerInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3e89ccec-3af0-4002-90f3-6b5cd671c66a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ContainerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ContainerInstance >> then instantiate a {@link ContainerInstance} proxy.
     * 
     * @return a {@link ContainerInstance} proxy on the created {@link Instance}.
     */
    @objid ("0c43544b-8956-4d65-a18d-c1091424af59")
    public static ContainerInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ContainerInstance.STEREOTYPE_NAME);
        return ContainerInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ContainerInstance} proxy from a {@link Instance} stereotyped << ContainerInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Instance
     * @return a {@link ContainerInstance} proxy or <i>null</i>.
     */
    @objid ("80eaec20-6a6e-44a5-b2ca-0a6ab3144c57")
    public static ContainerInstance instantiate(final Instance obj) {
        return ContainerInstance.canInstantiate(obj) ? new ContainerInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ContainerInstance} proxy from a {@link Instance} stereotyped << ContainerInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Instance}
     * @return a {@link ContainerInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bf3cdd51-ac75-45e9-9e69-2c32dc886cee")
    public static ContainerInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ContainerInstance.canInstantiate(obj))
            return new ContainerInstance(obj);
        else
            throw new IllegalArgumentException("ContainerInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'requiredCommunicationInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("59e9d0a1-f27e-4448-bfe6-250f6784b1e0")
    public void addRequiredCommunicationInstances(final CommunicationPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ContainerInstance.MdaTypes.MDAASSOCDEP);
            d.setName("requiredCommunicationInstances");
            d.putTagValue(ContainerInstance.MdaTypes.MDAASSOCDEP_ROLE, "requiredCommunicationInstances");
        }
    }

    @objid ("f6e554e9-9dad-4ddd-bcbd-2873986c1ce2")
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
        ContainerInstance other = (ContainerInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}.
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("4314f61e-b4b6-44dd-a98b-16507137d8fe")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'requiredCommunicationInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("8ac7d8de-8c05-4a49-b599-ed8f9b25376d")
    public List<CommunicationPort> getRequiredCommunicationInstances() {
        List<CommunicationPort> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(ContainerInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ContainerInstance.MdaTypes.MDAASSOCDEP_ROLE), "requiredCommunicationInstances")
              && CommunicationPort.canInstantiate(d.getDependsOn()))
                results.add((CommunicationPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationPort.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("b2bf2e59-c930-4af2-ab2d-9be4b0070615")
    public HostingPort getRequiredHostInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ContainerInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ContainerInstance.MdaTypes.MDAASSOCDEP_ROLE), "requiredHostInstance")
                  && HostingPort.canInstantiate(d.getDependsOn())) {
                     return (HostingPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HostingPort.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("6e33050b-d7e1-4619-a0f1-8e742b11708a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'requiredCommunicationInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("0e1a44c7-2fcf-4a9f-ba97-e9402bc6b059")
    public boolean removeRequiredCommunicationInstances(final CommunicationPort obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ContainerInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ContainerInstance.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("e5d3f02d-6657-4730-91f7-5c6b1a2b3e90")
    public void setRequiredHostInstance(final HostingPort obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ContainerInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ContainerInstance.MdaTypes.MDAASSOCDEP_ROLE), "requiredHostInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ContainerInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("requiredHostInstance");      dep.putTagValue(ContainerInstance.MdaTypes.MDAASSOCDEP_ROLE, "requiredHostInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("9566da8f-c44b-49f2-8de7-6f656b44370e")
    protected ContainerInstance(final Instance elt) {
        super(elt);
    }

    @objid ("1af32021-9f2d-4f19-946c-1fd148e9a0bc")
    public static final class MdaTypes {
        @objid ("382ca9c2-e495-4063-81e7-5a369082f1d3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("84e6d56a-6235-40ad-a8c2-84943a1822c5")
        private static Stereotype MDAASSOCDEP;

        @objid ("6a99bdaa-95bd-4eef-91e7-eff322672655")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9ed4f8a6-d320-4660-ad2f-2871de5fabb9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "13481bb8-bdfe-4a15-8050-482bd996ac9e");
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
