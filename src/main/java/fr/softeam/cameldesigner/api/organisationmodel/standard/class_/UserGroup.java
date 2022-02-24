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
    @objid ("b5d10494-d25a-488a-a840-22d4412ce4e5")
    public static final String STEREOTYPE_NAME = "UserGroup";

    /**
     * Tells whether a {@link UserGroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << UserGroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fe663b11-1045-4a4e-a2c1-d6e5280e9476")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UserGroup.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << UserGroup >> then instantiate a {@link UserGroup} proxy.
     * 
     * @return a {@link UserGroup} proxy on the created {@link Class}.
     */
    @objid ("4ce6f87f-d9d4-48b6-bd96-ddee138c28b8")
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
    @objid ("63248082-c772-44f1-9a8c-e1bb731f06b4")
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
    @objid ("c0a719a7-e5bd-4568-9149-45f8c04980ae")
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
    @objid ("ad92fc54-957d-4f92-8ce6-aedb93cc7bc0")
    public void addUsers(final User obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), UserGroup.MdaTypes.MDAASSOCDEP);
            d.setName("users");
            d.putTagValue(UserGroup.MdaTypes.MDAASSOCDEP_ROLE, "users");
        }
    }

    @objid ("9cecea06-3fc9-4091-86fb-cb6a6a3feb52")
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
    @objid ("4bbba2ec-314e-4c1b-a1cc-5f77a9b0fcb3")
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
    @objid ("9e79ec12-3e93-47be-b587-83804a84f195")
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

    @objid ("b8bae2b6-98ba-4a06-937b-a367cf287047")
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
    @objid ("02d2279f-b812-4f50-9022-bd0ee0318612")
    public boolean removeUsers(final User obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(UserGroup.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(UserGroup.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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

    @objid ("290430e7-7a86-4dfc-80d9-f6f1f34aa17a")
    protected UserGroup(final Class elt) {
        super(elt);
    }

    @objid ("5c98c8d7-7e42-4650-94dd-2d4f9879ae9d")
    public static final class MdaTypes {
        @objid ("25118495-6fd9-4cb5-b7ef-e660496e162d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("88a8fa0e-1275-4492-92e1-2ee6acdd0856")
        private static Stereotype MDAASSOCDEP;

        @objid ("6efe3408-6511-442f-8693-1226786d99e4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("21122ca0-9ddb-4c58-80e7-1ae5c09b7e9b")
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
