/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << PaaSRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f5103c3d-e058-41f9-b48b-a3555f8f176c")
public class PaaSRequirement extends HardRequirement {
    @objid ("184046ed-a280-4393-b75b-d889a675521c")
    public static final String STEREOTYPE_NAME = "PaaSRequirement";

    /**
     * Tells whether a {@link PaaSRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PaaSRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f0e14b31-f497-4ea8-8b49-a3d88ec29343")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PaaSRequirement >> then instantiate a {@link PaaSRequirement} proxy.
     * 
     * @return a {@link PaaSRequirement} proxy on the created {@link Class}.
     */
    @objid ("04c8c40d-75a4-4f2a-a55c-d39f535d9a9a")
    public static PaaSRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaSRequirement.STEREOTYPE_NAME);
        return PaaSRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PaaSRequirement} proxy from a {@link Class} stereotyped << PaaSRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link PaaSRequirement} proxy or <i>null</i>.
     */
    @objid ("0fc91a0b-f577-4c36-8bbc-2a1a9d248922")
    public static PaaSRequirement instantiate(final Class obj) {
        return PaaSRequirement.canInstantiate(obj) ? new PaaSRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaSRequirement} proxy from a {@link Class} stereotyped << PaaSRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link PaaSRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("eafe1c63-0113-4ccc-8617-4476b2a4cd33")
    public static PaaSRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PaaSRequirement.canInstantiate(obj))
        	return new PaaSRequirement(obj);
        else
        	throw new IllegalArgumentException("PaaSRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d2f02c4-a718-4806-a2e8-62deba540ba8")
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
        PaaSRequirement other = (PaaSRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e6b3c03b-5443-41c0-a729-3883a16f800c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("54763ca1-bb31-4f0c-b874-778c5a62e817")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("030e0731-9e44-4472-baad-c615462b1d25")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("05296cd2-ef70-4384-a23e-1af4a51a80f4")
    protected PaaSRequirement(final Class elt) {
        super(elt);
    }

    @objid ("f1ab105f-3a9a-4d24-8c32-5dd406174ad0")
    public static final class MdaTypes {
        @objid ("5ce52436-d846-432e-a49d-adf9e06964e2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("70f84983-fe93-41d2-ba00-54a0738a5b57")
        private static Stereotype MDAASSOCDEP;

        @objid ("3b53ba30-1025-47ae-9b72-a09cda79e84f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a1184c5f-7c8f-4fec-be1a-29397e56b9c7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1b4b9489-ad62-4a1b-be52-900e21e7f441");
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
