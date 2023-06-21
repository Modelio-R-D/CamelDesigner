/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("08856ee2-0fe9-4521-b3c6-43c1c2cc57cd")
    public static final String STEREOTYPE_NAME = "CommunicationRequirement";

    /**
     * Tells whether a {@link CommunicationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CommunicationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dcfb6e4e-3efc-4832-ad02-cd143f3fe62c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CommunicationRequirement >> then instantiate a {@link CommunicationRequirement} proxy.
     * 
     * @return a {@link CommunicationRequirement} proxy on the created {@link Class}.
     */
    @objid ("07cc319e-5fd2-4163-97fa-464efb5c5c31")
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
    @objid ("e0ff07aa-8ec2-4010-959c-4a7393e3c5d8")
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
    @objid ("992bd986-3e42-4c56-832d-1117547a8173")
    public static CommunicationRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CommunicationRequirement.canInstantiate(obj))
        	return new CommunicationRequirement(obj);
        else
        	throw new IllegalArgumentException("CommunicationRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fa3a9c96-c3f2-4907-9a34-fc4eecdbdcdf")
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
    @objid ("a5e8378e-c0ba-414b-ba6d-a5dd229296f7")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("16c581c2-1ba2-4770-b959-04d4e18a6d94")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("763269d6-2a55-4042-8166-eb2cdec5914f")
    protected CommunicationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("d2f08d28-0c46-4738-b9ae-bf1bba9bcb27")
    public static final class MdaTypes {
        @objid ("d79e4068-73d0-4546-8755-557862d5f713")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("147b88a6-ac9d-4e97-867f-4df9e01f9666")
        private static Stereotype MDAASSOCDEP;

        @objid ("62dfe24c-bf7e-4593-afa7-fd2be66be513")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fabe07c1-60cc-4f13-bd45-c687e627feb5")
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
