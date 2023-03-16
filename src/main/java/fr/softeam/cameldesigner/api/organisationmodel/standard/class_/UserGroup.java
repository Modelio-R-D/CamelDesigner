/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
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
 * Proxy class to handle a {@link Class} with << UserGroup >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("abad6f96-f2ec-4ca1-9fb0-a0beaa067a8f")
public class UserGroup extends FeatureClass {
    @objid ("2f29a781-7407-4a9d-adb3-032510011786")
    public static final String STEREOTYPE_NAME = "UserGroup";

    /**
     * Tells whether a {@link UserGroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << UserGroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3bbfc24b-04ad-4d1d-83c7-7f1f07e1f3c9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UserGroup.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << UserGroup >> then instantiate a {@link UserGroup} proxy.
     * 
     * @return a {@link UserGroup} proxy on the created {@link Class}.
     */
    @objid ("0805ca45-1217-47bc-9dfe-9d0d3c9cbd05")
    public static UserGroup create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, UserGroup.STEREOTYPE_NAME);
        return UserGroup.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link UserGroup} proxy from a {@link Class} stereotyped << UserGroup >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link UserGroup} proxy or <i>null</i>.
     */
    @objid ("72547416-c00b-4b5c-9185-e9c1d4e8e468")
    public static UserGroup instantiate(final Class obj) {
        return UserGroup.canInstantiate(obj) ? new UserGroup(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UserGroup} proxy from a {@link Class} stereotyped << UserGroup >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link UserGroup} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c6ddef63-4dc3-45aa-ba6d-52db2d9f2816")
    public static UserGroup safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (UserGroup.canInstantiate(obj))
        	return new UserGroup(obj);
        else
        	throw new IllegalArgumentException("UserGroup: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'users' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c113dc56-6262-4491-94c3-d632df0d39b3")
    public void addUsers(final User obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), UserGroup.MdaTypes.MDAASSOCDEP);
            d.setName("users");
            d.putTagValue(UserGroup.MdaTypes.MDAASSOCDEP_ROLE, "users");
        }
    }

    @objid ("f7e6cea1-af7f-4c2d-af8c-18b8453d0235")
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
        UserGroup other = (UserGroup) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("fe57befe-bf1e-4b82-b517-05ca31d692dc")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'users' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b57d75c4-37b9-47a1-95dd-5f26fddfc492")
    public List<User> getUsers() {
        List<User> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(UserGroup.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(UserGroup.MdaTypes.MDAASSOCDEP_ROLE), "users")){
              if (User.canInstantiate(d.getDependsOn()))
                results.add((User)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), User.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4234ddbf-976a-4efd-9a0d-c33dda77a282")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'users' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2d3494a9-bf6d-4f82-ac19-07f8b7f931a6")
    public boolean removeUsers(final User obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(UserGroup.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(UserGroup.MdaTypes.MDAASSOCDEP_ROLE), "users")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("0a1f1650-ac33-41fa-91ae-c49542250bfc")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("5b162c16-6e1f-40bb-8d42-eeeed105f8d3")
    protected UserGroup(final Class elt) {
        super(elt);
    }

    @objid ("5c98c8d7-7e42-4650-94dd-2d4f9879ae9d")
    public static final class MdaTypes {
        @objid ("b66b2f8f-b605-4d10-adc7-29698c0039f7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("834d237c-3421-4af2-8d6b-696a3af0ca0a")
        private static Stereotype MDAASSOCDEP;

        @objid ("08c1ff2b-1a7a-4a2b-85d6-a108438e16d9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("563c6571-b149-4a23-879a-6a221baad896")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a69e85bc-a398-4ffb-a9d6-267bdf5cf5b2");
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
