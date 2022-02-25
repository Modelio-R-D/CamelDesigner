/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("df6ff867-88c3-45e3-82e6-2ebfaaf06c0f")
    public static final String STEREOTYPE_NAME = "ContainerInstance";

    /**
     * Tells whether a {@link ContainerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ContainerInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("27766c1b-28c2-450d-9b0f-78b05395f3d0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ContainerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ContainerInstance >> then instantiate a {@link ContainerInstance} proxy.
     * 
     * @return a {@link ContainerInstance} proxy on the created {@link Instance}.
     */
    @objid ("f8cd8212-5885-4acd-9a57-52e709ee9621")
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
    @objid ("c886128c-8970-4aae-8caf-b54022dc37b8")
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
    @objid ("d9019197-6e12-46c5-8eb0-d73a9e041092")
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
    @objid ("5588c1c2-d4d3-4a46-9aeb-82695af5d90d")
    public void addRequiredCommunicationInstances(final CommunicationPort obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

    @objid ("3add0fb5-609a-4c38-8965-87d4e22e9ff2")
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
    @objid ("fa30407a-353c-4734-8521-636d608a1a13")
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
    @objid ("3c7b3652-84e0-4768-a826-4d382422a4d3")
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'requiredCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("60f6ade6-7396-4a57-9709-a4e396a9bdf8")
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
    @objid ("e44130f2-c416-4394-86e1-2d92592ba0dd")
    public HostingPort getRequiredHostInstance() {
          for (Port obj : ((Instance) this.elt).getPart(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("030177ed-4b5d-496b-ad81-e019cddadb15")
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
    @objid ("d2baceb4-b90f-4217-9f9c-ff07bf76e26c")
    public boolean removeRequiredCommunicationInstances(final CommunicationPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6379bab8-6969-4120-9df2-aafc2da4f932")
    public void setParent(final DeploymentInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("25baa1d8-eaf6-43ac-9c09-24b108ce0768")
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

    @objid ("0ed5fca2-a455-426c-8321-5994702d52fc")
    protected ContainerInstance(final Instance elt) {
        super(elt);
    }

    @objid ("1af32021-9f2d-4f19-946c-1fd148e9a0bc")
    public static final class MdaTypes {
        @objid ("55c1d9dc-ec32-4acf-ba7b-972e873ecae4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7741f3ca-ff0e-488f-89ce-396afca113d7")
        private static Stereotype MDAASSOCDEP;

        @objid ("1fbc97a9-6471-46fe-aaac-2568ca1310d9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("049c0533-0934-4b34-b7a2-2728eee8c933")
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
