/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link Class} with << CommunicationRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4039df5b-6637-44a0-b422-e2f658a79b78")
public class CommunicationRequirement extends HardRequirement {
    @objid ("d11f9426-717e-4336-b4ac-1ee5f3bb25ac")
    public static final String STEREOTYPE_NAME = "CommunicationRequirement";

    /**
     * Tells whether a {@link CommunicationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CommunicationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("efa483bc-6d50-4526-bd1f-245fb919f67d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CommunicationRequirement >> then instantiate a {@link CommunicationRequirement} proxy.
     * 
     * @return a {@link CommunicationRequirement} proxy on the created {@link Class}.
     */
    @objid ("e0a23e1e-34e6-4a95-9c9b-4b801684c8f6")
    public static CommunicationRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationRequirement.STEREOTYPE_NAME);
        return CommunicationRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationRequirement} proxy from a {@link Class} stereotyped << CommunicationRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CommunicationRequirement} proxy or <i>null</i>.
     */
    @objid ("6451c4ae-4985-40f5-8054-a0dad50744eb")
    public static CommunicationRequirement instantiate(final Class obj) {
        return CommunicationRequirement.canInstantiate(obj) ? new CommunicationRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationRequirement} proxy from a {@link Class} stereotyped << CommunicationRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CommunicationRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b04ad506-02ac-417f-83e7-32b49b7fa683")
    public static CommunicationRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CommunicationRequirement.canInstantiate(obj))
        	return new CommunicationRequirement(obj);
        else
        	throw new IllegalArgumentException("CommunicationRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9899b5a9-b15e-4e1e-bfc5-271cac24f01d")
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
        CommunicationRequirement other = (CommunicationRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("42222f35-392f-4b59-82a8-940bbfa97a6f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("94b1abe6-17a9-447f-a5e5-f163db4b8dc6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ec863207-6be0-4c96-87f0-ac247a998356")
    protected CommunicationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("d2f08d28-0c46-4738-b9ae-bf1bba9bcb27")
    public static final class MdaTypes {
        @objid ("b44b8c9d-9c1a-4848-8290-17bed3da15cb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ef0adbf9-6daa-41d3-80ab-b109ebba5e99")
        private static Stereotype MDAASSOCDEP;

        @objid ("580f9fca-aead-4eb8-9c5e-5109920537ee")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7083c749-16de-45be-aebc-6bda292237dc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d79c9f3a-4dfe-472a-b36d-70326b490551");
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
