/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("ff3bab68-0352-4a50-a91c-269ecb770647")
    public static final String STEREOTYPE_NAME = "Role";

    /**
     * Tells whether a {@link Role proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Role >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("22db6852-e7b9-43e4-b197-a354a59f1f5e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Role.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Role >> then instantiate a {@link Role} proxy.
     * 
     * @return a {@link Role} proxy on the created {@link Class}.
     */
    @objid ("dba95cc7-6500-4cc3-a67d-d30d11b0aaea")
    public static Role create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Role.STEREOTYPE_NAME);
        return Role.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Role} proxy from a {@link Class} stereotyped << Role >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link Role} proxy or <i>null</i>.
     */
    @objid ("bbcb7f13-49f4-48b5-a2c5-56376e139884")
    public static Role instantiate(final Class obj) {
        return Role.canInstantiate(obj) ? new Role(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Role} proxy from a {@link Class} stereotyped << Role >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link Role} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4dcfe15d-1424-4550-ad19-6a0d9e0d2e6f")
    public static Role safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Role.canInstantiate(obj))
            return new Role(obj);
        else
            throw new IllegalArgumentException("Role: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3a40a008-2852-41ce-af24-8bd8be98006b")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1260eeba-45d0-42b6-87af-8321fb6961ff")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("fd3edb8d-9311-4962-a5c8-23e954f91b66")
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

    @objid ("dfadee11-5723-47c3-99cc-b4d979661837")
    protected Role(final Class elt) {
        super(elt);
    }

    @objid ("6984b739-246a-4151-a962-ff6ba842fc69")
    public static final class MdaTypes {
        @objid ("695238ea-7b59-46f7-9a50-4208a9344b2c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c3dcaed5-3791-4e55-ba17-772e3e082c7e")
        private static Stereotype MDAASSOCDEP;

        @objid ("a234213d-4d5c-4168-a68c-6ec733a7ebae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8d5b1b54-a1e5-4448-b785-a429fa851c32")
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
