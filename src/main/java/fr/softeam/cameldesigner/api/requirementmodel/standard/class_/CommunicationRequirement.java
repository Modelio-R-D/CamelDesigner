/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("ef99b55e-3b90-4b18-8ba0-3226bb3bc07d")
    public static final String STEREOTYPE_NAME = "CommunicationRequirement";

    /**
     * Tells whether a {@link CommunicationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CommunicationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ce78833c-d274-4ea8-9799-4f0420b71e06")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CommunicationRequirement >> then instantiate a {@link CommunicationRequirement} proxy.
     * 
     * @return a {@link CommunicationRequirement} proxy on the created {@link Class}.
     */
    @objid ("c3b6ced4-5b4b-4409-a256-ea5b4148f068")
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
    @objid ("cb1e787d-d5e7-4532-8f94-a41596bcd019")
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
    @objid ("420ee77f-4d1f-4048-900e-32009297ba77")
    public static CommunicationRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CommunicationRequirement.canInstantiate(obj))
        	return new CommunicationRequirement(obj);
        else
        	throw new IllegalArgumentException("CommunicationRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3da0cfea-cee7-42d7-8e42-dd31b17cc28b")
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
    @objid ("31b83bc8-261d-4fe4-b510-18dc5f9f3b23")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("75178594-a921-42a5-ad27-ad4613dab931")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("bf4964bd-84b5-4d1f-9ae1-705cd1fc0a6e")
    protected CommunicationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("d2f08d28-0c46-4738-b9ae-bf1bba9bcb27")
    public static final class MdaTypes {
        @objid ("c9c8d1ce-c1c7-4744-b919-02bc3aee9517")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("024e1e46-ccd9-475a-9990-c8cb20136480")
        private static Stereotype MDAASSOCDEP;

        @objid ("6c467eb0-28c1-42b0-a015-0030a2ac63f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("758b2309-3339-4499-80e9-fc01321ad455")
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
