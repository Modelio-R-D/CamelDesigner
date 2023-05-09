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
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << ContainerInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("71cdb732-b116-447d-abd2-a9db81cf0f17")
public class ContainerInstance extends ComponentInstance {
    @objid ("05c078f3-f346-4c50-b6b6-04513ba99b5b")
    public static final String STEREOTYPE_NAME = "ContainerInstance";

    /**
     * Tells whether a {@link ContainerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ContainerInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c9a7ba5c-ce8d-4383-8297-8657454efc7b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ContainerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ContainerInstance >> then instantiate a {@link ContainerInstance} proxy.
     * 
     * @return a {@link ContainerInstance} proxy on the created {@link Instance}.
     */
    @objid ("307b60f3-4c99-43c0-83b2-6ae1a876f7bc")
    public static ContainerInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ContainerInstance.STEREOTYPE_NAME);
        return ContainerInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ContainerInstance} proxy from a {@link Instance} stereotyped << ContainerInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ContainerInstance} proxy or <i>null</i>.
     */
    @objid ("eec269f0-a313-46bd-a951-770e30c0ee25")
    public static ContainerInstance instantiate(final Instance obj) {
        return ContainerInstance.canInstantiate(obj) ? new ContainerInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ContainerInstance} proxy from a {@link Instance} stereotyped << ContainerInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link ContainerInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1f110760-8902-4f05-b779-1addafcccb18")
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
     * 
     */
    @objid ("ac2652b8-bf4a-426e-853d-10005e54281d")
    public void addRequiredCommunicationInstances(final CommunicationPort obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

    @objid ("19ffbc25-e30c-4769-be71-ca2788cc7538")
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
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("7c7732db-b06a-40c8-bedd-5e0f0a8af17d")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6028dfea-6d77-42b8-86aa-62d621bfce85")
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'requiredCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("77f9947d-c952-49ee-945a-c5eae1d1968f")
    public List<CommunicationPort> getRequiredCommunicationInstances() {
        List<CommunicationPort> results = new ArrayList<>();
        for (BindableInstance mObj : ((Instance) this.elt).getPart()){
        	if (CommunicationPort.canInstantiate(mObj))
        			results.add((CommunicationPort)CamelDesignerProxyFactory.instantiate(mObj, CommunicationPort.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c8dfe290-dfa5-4351-9533-720261db45f5")
    public HostingPort getRequiredHostInstance() {
          for (Port obj : ((Instance) this.elt).getPart(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("9d121c72-59df-4993-beba-2543e7108a00")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'requiredCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b4b9ffa0-d23c-4750-8421-044be553babd")
    public boolean removeRequiredCommunicationInstances(final CommunicationPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b8fec86e-10c6-438d-a739-6681ec7627de")
    public void setParent(final DeploymentInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("581d8822-37be-4a5d-b95c-3ca3494e7e09")
    public void setRequiredHostInstance(final HostingPort obj) {
        // Remove existing HostingPorts
        for (Port e : ((Instance) this.elt).getPart(Port.class)) {
           if (HostingPort.canInstantiate(e)) {
               e.delete();
           }
        }
        // Set the HostingPort
        if (obj != null) {
            ((Instance) this.elt).getPart().add(obj.getElement());
        }
    }

    @objid ("e5f2e238-cdcb-4d8c-8c0d-601a341f05e4")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c2562815-8aa4-4d7e-b878-45caf579ae69")
    protected ContainerInstance(final Instance elt) {
        super(elt);
    }

    @objid ("1af32021-9f2d-4f19-946c-1fd148e9a0bc")
    public static final class MdaTypes {
        @objid ("d25e9700-0b2c-4e3a-b12b-a76d60483464")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5f339e94-17ee-4574-9608-55c388d02b8d")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ed66ee2-9ea3-480b-bb8b-096a70028f99")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eadd16f1-3cdd-431b-b99e-5e88c77a1d33")
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
