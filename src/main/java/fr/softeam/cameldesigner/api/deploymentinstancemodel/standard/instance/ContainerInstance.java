/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e7fe4376-3937-47de-9b73-3868c05ded57")
=======
    @objid ("faab0890-53df-492c-9753-dab6aca862c9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "ContainerInstance";

    /**
     * Tells whether a {@link ContainerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ContainerInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("fa87cb31-938e-4848-b495-0de3af9b4962")
=======
    @objid ("d7f8f011-5172-44bf-aaf0-59daa2192d5f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ContainerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ContainerInstance >> then instantiate a {@link ContainerInstance} proxy.
     * 
     * @return a {@link ContainerInstance} proxy on the created {@link Instance}.
     */
<<<<<<< HEAD
    @objid ("219ebdf0-62ea-419e-9578-9dfc2a247b1e")
=======
    @objid ("1d1abdb5-7ee3-429d-ac2e-a9bc54f0130b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("bd182367-b2a0-4512-8d5a-ad1accf14b43")
=======
    @objid ("a72f3cf0-2db7-4ede-9e3d-1e63bed9ade8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("33ef4864-ac45-4967-bf9f-f5a8511006d9")
=======
    @objid ("fbaa3394-be01-4520-9818-a763c9a69593")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d372a4e8-a7f1-41ed-8f55-00e0ce338761")
=======
    @objid ("bf058670-72d6-4c0d-9929-9262938dc630")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addRequiredCommunicationInstances(final CommunicationPort obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("c799a2bf-4e3c-42aa-a39b-fb822e262a9e")
=======
    @objid ("0563cf82-0d84-4070-a180-3aa3e5d59ceb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("9d8d2f02-4c3d-4044-9ca0-135745205196")
=======
    @objid ("aba74cd6-d893-49e9-83c1-d05e6524256e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2b8d37aa-f2c7-4751-86a5-f29807867118")
=======
    @objid ("2d3e21f1-03b6-43b2-b742-f1a2828f0f03")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'requiredCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("585cbe06-49df-425d-90a8-0fffd735a9a0")
=======
    @objid ("17b9c14c-cecc-40ce-ab2c-9d1e98e5ab55")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("86756f53-2eea-4614-a2cf-e6a428e79462")
=======
    @objid ("51358ea8-2a0a-4aab-9281-c520f71b9b19")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public HostingPort getRequiredHostInstance() {
          for (Port obj : ((Instance) this.elt).getPart(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

<<<<<<< HEAD
    @objid ("33a3729b-5286-4cd5-9168-44b5ae000a50")
=======
    @objid ("89b9a0d6-f2a3-439d-a4f9-72129a90b510")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("784191a2-2d62-4f2e-9803-18cdf6a3f175")
=======
    @objid ("f06fd889-e1ea-4fdc-b7fb-63dfaf575391")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRequiredCommunicationInstances(final CommunicationPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("22179e6e-5739-48e8-bd37-3c6514ec7852")
=======
    @objid ("555c0bd1-5319-4593-9265-a647a0c07101")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setParent(final DeploymentInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("13763680-a305-4c9b-b79b-3a4e4a062198")
=======
    @objid ("f413c877-2d58-446d-83da-aa456c160d26")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("21185e86-9b1f-4a79-88cc-bce6868eaee3")
=======
    @objid ("5a2ab9df-644c-42f0-835c-0edf172b9bba")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ContainerInstance(final Instance elt) {
        super(elt);
    }

    @objid ("1af32021-9f2d-4f19-946c-1fd148e9a0bc")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("3d7e21ab-d3ff-41ac-b2b1-4d8d4d00e2be")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("76d89ad7-f356-4aa8-bab5-3ec23ce5257b")
        private static Stereotype MDAASSOCDEP;

        @objid ("dd0feb4f-7db8-42b8-bb66-b032aec9f96f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e782e928-ce10-403a-a6c7-c65d744ccda0")
=======
        @objid ("20ee34a2-82b9-4b4d-9bd5-68c1ebfbe154")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b22a597d-5d94-4dc7-a988-44eb08d8c1cc")
        private static Stereotype MDAASSOCDEP;

        @objid ("0d84d89f-af5c-41c7-a3ec-f1de8c364226")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d94f44a7-6ad6-4f13-a285-d3ceef845130")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
