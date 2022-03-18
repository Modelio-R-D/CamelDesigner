/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
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
 * Proxy class to handle a {@link Class} with << Role >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5846bcfc-fc98-4f31-b691-21c72a9930b9")
public class Role extends FeatureClass {
    @objid ("2c9afb8b-6be8-4ef7-a4e6-33e35516e508")
    public static final String STEREOTYPE_NAME = "Role";

    /**
     * Tells whether a {@link Role proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Role >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c564c97f-d57e-477b-8ec7-fd7365c7974c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Role.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Role >> then instantiate a {@link Role} proxy.
     * 
     * @return a {@link Role} proxy on the created {@link Class}.
     */
    @objid ("3aebee01-6b45-40fe-9aa6-6722f13bdefe")
    public static Role create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Role.STEREOTYPE_NAME);
        return Role.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Role} proxy from a {@link Class} stereotyped << Role >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Role} proxy or <i>null</i>.
     */
    @objid ("087bd599-d7fb-4676-96be-03d810c92d29")
    public static Role instantiate(final Class obj) {
        return Role.canInstantiate(obj) ? new Role(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Role} proxy from a {@link Class} stereotyped << Role >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Role} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7fa501f0-f7ea-4997-bc8c-1d97c8f86b34")
    public static Role safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Role.canInstantiate(obj))
        	return new Role(obj);
        else
        	throw new IllegalArgumentException("Role: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2203e232-c09a-41fe-b445-e270317dccdb")
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
        Role other = (Role) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("28a014ab-217b-4896-a37c-9c4e2fa36cda")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("ee899323-f9c5-4830-b7f6-cb41fe367eae")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3657ba2e-5382-4327-b5bc-5bfe2bd87073")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("dab9565e-b484-45b6-b76b-30568d2f95d8")
    protected Role(final Class elt) {
        super(elt);
    }

    @objid ("6984b739-246a-4151-a962-ff6ba842fc69")
    public static final class MdaTypes {
        @objid ("cce40f01-89ad-4070-87ec-7e9ff1bd6bab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0f58af80-3e39-40d2-a0f3-f0e2d7a679db")
        private static Stereotype MDAASSOCDEP;

        @objid ("1db97352-8cd4-4d09-8614-ceaa9c7b156a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aaa3a01a-c878-4a4e-b4f0-c0525d2970d2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "858f6212-589e-4b36-9150-2e764f0e91b5");
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
