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
    @objid ("2d1b1313-7ec3-4db7-8534-2f5b8f927b69")
    public static final String STEREOTYPE_NAME = "PaaSInstance";

    /**
     * Tells whether a {@link PaaSInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << PaaSInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("53242cf4-7af2-46ec-a612-fa5da5b3e8c7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << PaaSInstance >> then instantiate a {@link PaaSInstance} proxy.
     * 
     * @return a {@link PaaSInstance} proxy on the created {@link Instance}.
     */
    @objid ("a2c649df-81ea-46a7-87cd-b1ac6b595e02")
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
    @objid ("1d605885-a38e-4272-8c11-7f5c8196fe8e")
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
    @objid ("5bf2aa63-bb67-440c-acf4-319a74dc20a4")
    public static PaaSInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (PaaSInstance.canInstantiate(obj))
        	return new PaaSInstance(obj);
        else
        	throw new IllegalArgumentException("PaaSInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("424d966c-8325-4fd4-b481-a80cdfb7c2f2")
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
    @objid ("88c6bb85-db2e-4831-ad67-160c80e80f5a")
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
    @objid ("0286dd61-bbf7-4e04-b2d7-b0987bbfa161")
    public DeploymentInstanceModel getParent() {
        return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DeploymentInstanceModel.STEREOTYPE_NAME);
    }

    @objid ("ad042210-9a2e-43b4-8523-aeffb70c1845")
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
    @objid ("80c6170e-533e-45f2-a44f-57e549f68828")
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

    @objid ("5e144e5f-771b-4a83-a14d-7fd824441127")
    protected PaaSInstance(final Instance elt) {
        super(elt);
    }

    @objid ("387fa399-3754-4069-9e53-4383d23163dc")
    public static final class MdaTypes {
        @objid ("376a2f3f-9991-4bdd-8d90-40557ccb280f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a4d52815-c3d7-4d3e-b525-efbe3c5c2aff")
        private static Stereotype MDAASSOCDEP;

        @objid ("33f10fae-51d4-49ec-b82d-4084c83c777c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d01ce030-37fb-4947-a5f0-b2b03189fc00")
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
