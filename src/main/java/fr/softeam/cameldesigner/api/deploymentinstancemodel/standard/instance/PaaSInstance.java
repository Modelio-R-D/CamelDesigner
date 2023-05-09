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
    @objid ("df47d8b3-63e8-4822-b841-49ed24688547")
    public static final String STEREOTYPE_NAME = "PaaSInstance";

    /**
     * Tells whether a {@link PaaSInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << PaaSInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ef3672ee-9acc-4bb6-979e-eb34cbea0034")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << PaaSInstance >> then instantiate a {@link PaaSInstance} proxy.
     * 
     * @return a {@link PaaSInstance} proxy on the created {@link Instance}.
     */
    @objid ("9f1adec0-1bc3-4b12-9db1-bb68e962195b")
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
    @objid ("9466b2d3-0aa1-44cc-8d31-29e2c600ce18")
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
    @objid ("ef1b199b-c9f3-4c2e-afde-1b28157300e0")
    public static PaaSInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (PaaSInstance.canInstantiate(obj))
        	return new PaaSInstance(obj);
        else
        	throw new IllegalArgumentException("PaaSInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("345bd9ab-aa21-4de0-bc68-ce845ba79d3c")
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
    @objid ("9fa3aee6-66f5-4052-9f9f-73706d31ce59")
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
    @objid ("a6cdd109-497d-4e5b-a9d7-65e71544450f")
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    @objid ("cbebafcd-9596-4986-85ad-3792f190f751")
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
    @objid ("4dd78dfc-598e-42be-baf4-d01aca23bb75")
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

    @objid ("18f48e44-8266-4c12-b569-3d992a251cc7")
    protected PaaSInstance(final Instance elt) {
        super(elt);
    }

    @objid ("387fa399-3754-4069-9e53-4383d23163dc")
    public static final class MdaTypes {
        @objid ("4ab10da7-fb92-47e6-b930-d33491b85222")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("65c6a556-82e4-46e5-b960-39ad69ce9a4c")
        private static Stereotype MDAASSOCDEP;

        @objid ("82f10356-e8fa-4d86-a4a4-276fa55b75a0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6fef0e0c-e99c-422d-931b-ec2838b881eb")
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
