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
 * Proxy class to handle a {@link Instance} with << PaaSInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("dddfb99b-2d25-4bf8-a552-181e1549079a")
public class PaaSInstance extends ComponentInstance {
<<<<<<< HEAD
    @objid ("534aa14e-01e0-48ae-b3ab-f7cda3d3dea3")
=======
    @objid ("73454640-7b4d-4dad-958f-06cca47026b5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "PaaSInstance";

    /**
     * Tells whether a {@link PaaSInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << PaaSInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("fa1f5ba3-9433-41c5-a98b-1961a236e72c")
=======
    @objid ("fcede16c-3add-4dd7-bf93-e6be1f2fda16")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << PaaSInstance >> then instantiate a {@link PaaSInstance} proxy.
     * 
     * @return a {@link PaaSInstance} proxy on the created {@link Instance}.
     */
<<<<<<< HEAD
    @objid ("0fb945b3-283f-4fda-bd32-1702a7ad1611")
=======
    @objid ("f40fedcc-fd2e-4f19-9504-8cc7ce17e236")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PaaSInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaSInstance.STEREOTYPE_NAME);
        return PaaSInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link PaaSInstance} proxy from a {@link Instance} stereotyped << PaaSInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link PaaSInstance} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("c6739713-0cab-4a38-a956-8e23c34fbaf7")
=======
    @objid ("fa88b339-ef62-442d-b217-e2c12380df1e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PaaSInstance instantiate(final Instance obj) {
        return PaaSInstance.canInstantiate(obj) ? new PaaSInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaSInstance} proxy from a {@link Instance} stereotyped << PaaSInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link PaaSInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("71484307-2747-4505-a54d-3860a83e7611")
=======
    @objid ("a3e11c02-906d-4fa1-9f89-d9b688965eb6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PaaSInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (PaaSInstance.canInstantiate(obj))
        	return new PaaSInstance(obj);
        else
        	throw new IllegalArgumentException("PaaSInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("1fa2582c-b394-4706-9a4b-2356564d8637")
=======
    @objid ("6b9e26ae-bc08-4464-bfb9-c402bb41631a")
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
        PaaSInstance other = (PaaSInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("97bda8aa-6b8a-4ce6-b206-e07ad82a1119")
=======
    @objid ("e5420f09-cb9f-4020-9d17-92f76b2b47fe")
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
    @objid ("15b4a761-b133-4180-a175-27a45e86ebdb")
=======
    @objid ("ed292685-33d7-44f8-9cc5-ee47347d7462")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

<<<<<<< HEAD
    @objid ("e64493dc-1763-47d6-89bb-51edd52ebb22")
=======
    @objid ("ade69953-a6aa-4438-9f2d-0f01ea9a043d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b913636f-7136-43f8-8510-07af10fe9459")
=======
    @objid ("354ae0ac-bcb5-456a-9e52-b8d1bb160785")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setParent(final DeploymentInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("b44b2ff3-dbf9-4fe7-bedc-edc6a30b4555")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("8e7438e3-e0aa-4440-8870-af58922b13be")
=======
    @objid ("73e7d0dd-f66b-48f5-b22d-d993a210e756")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected PaaSInstance(final Instance elt) {
        super(elt);
    }

    @objid ("387fa399-3754-4069-9e53-4383d23163dc")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("c349770a-3ee0-4da1-aeef-a435f0c478db")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f7b6bf5d-91da-41cc-9a0d-8d62c946599c")
        private static Stereotype MDAASSOCDEP;

        @objid ("5bd425a0-2a20-4b68-b50d-d8440e1e0819")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1c5ea917-d845-4795-ba94-4f9359baa37a")
=======
        @objid ("0befbc20-c08d-45f6-aa9d-30e404bdf128")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9fa856b9-2ec1-4cff-811d-1965cbc52a9d")
        private static Stereotype MDAASSOCDEP;

        @objid ("088e3578-1e9b-4e6f-9516-70779dde134c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("88f275a6-25a6-4ca5-ae3b-41f947abc50d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8d6e2b24-ed30-4aad-9c44-39b18b4c76d8");
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
