/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("945b3cd6-4764-4f39-87b1-2c8210e1c06f")
    public static final String STEREOTYPE_NAME = "Role";

    /**
     * Tells whether a {@link Role proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Role >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("26c4d4bd-623b-4559-9ae5-5ff0fb23b89e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Role.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Role >> then instantiate a {@link Role} proxy.
     * 
     * @return a {@link Role} proxy on the created {@link Class}.
     */
    @objid ("ec7ca2dd-6cd3-436f-9dd9-d1a15b8a4a97")
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
    @objid ("4d82ff68-568f-454c-b8e8-0d8884f788e0")
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
    @objid ("e6038781-42a2-46f5-80d5-4d20f2cae8c4")
    public static Role safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Role.canInstantiate(obj))
        	return new Role(obj);
        else
        	throw new IllegalArgumentException("Role: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("eed67ab8-879b-4e33-94eb-a4ace96dad58")
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
    @objid ("20275983-df85-4491-93ab-686eebbeb4aa")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("40e96689-9df1-44bd-89da-a043eba47fae")
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

    @objid ("513b2234-4c53-45e4-a908-f959b976080d")
    protected Role(final Class elt) {
        super(elt);
    }

    @objid ("6984b739-246a-4151-a962-ff6ba842fc69")
    public static final class MdaTypes {
        @objid ("f97d5e70-ac4e-4f8d-b8dd-198da2aaba22")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1429f8e6-c738-404c-9c69-a7f5cc95625e")
        private static Stereotype MDAASSOCDEP;

        @objid ("5c7401d6-8fff-486f-bf53-c06b50b93b0f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d7a9391e-9663-472b-acad-7a73dd087ad1")
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
