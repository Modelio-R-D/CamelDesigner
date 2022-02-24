/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("aaac6b1a-512d-4bf9-9e69-5c40034e5d6f")
    public static final String STEREOTYPE_NAME = "ContainerInstance";

    /**
     * Tells whether a {@link ContainerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ContainerInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("973b5557-c799-4cd7-bb04-037b7af3604b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ContainerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ContainerInstance >> then instantiate a {@link ContainerInstance} proxy.
     * 
     * @return a {@link ContainerInstance} proxy on the created {@link Instance}.
     */
    @objid ("3d110455-c2b3-481e-ac79-2dd2e3865d18")
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
    @objid ("abb84018-4f31-4bfa-82ce-292b1aa52881")
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
    @objid ("0120b733-129f-429d-8b52-bbd1f7c8d137")
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
    @objid ("0a716aef-da17-43da-a957-4c001ecf23b7")
    public void addRequiredCommunicationInstances(final CommunicationPort obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

    @objid ("417f3a50-0813-498e-9337-a61cfd197f3e")
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
    @objid ("0dc1f37d-d76b-4056-b5ce-93004ca6a9c8")
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
    @objid ("b0631a42-2ea8-4e49-93bb-0a5492fc7410")
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'requiredCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f33e8b48-8be9-4c15-bb1a-0102f81be043")
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
    @objid ("83b63da5-b870-4a61-a09e-a4e87b2f3489")
    public HostingPort getRequiredHostInstance() {
          for (Port obj : ((Instance) this.elt).getPart(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("97e72e01-5cf8-4973-8e2b-a31a06c5cf22")
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
    @objid ("61550a03-5fee-49cb-9655-3d575cdbbfdb")
    public boolean removeRequiredCommunicationInstances(final CommunicationPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b031b36b-9cf3-40e6-9a8d-5c99c239384e")
    public void setParent(final DeploymentInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("50adb627-2a84-4352-893a-4c4bb786efc1")
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

    @objid ("1464e4e6-bd19-4888-99ff-1943eda7d431")
    protected ContainerInstance(final Instance elt) {
        super(elt);
    }

    @objid ("1af32021-9f2d-4f19-946c-1fd148e9a0bc")
    public static final class MdaTypes {
        @objid ("f830298a-6ee9-4581-8a06-54fc7879bd5e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("497eb754-421f-4b75-9972-a494fdb6b4f7")
        private static Stereotype MDAASSOCDEP;

        @objid ("5685bb47-6789-488e-a003-aa0c75f33c59")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8a12789e-ba64-4b76-856c-94c3b8fca599")
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
