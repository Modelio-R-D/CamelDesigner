/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("9f8664a7-0e19-4a3d-94a5-dfde2acee324")
    public static final String STEREOTYPE_NAME = "UserGroup";

    /**
     * Tells whether a {@link UserGroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << UserGroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4934f35c-dc9d-4965-b5d1-fe6aaa7530be")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UserGroup.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << UserGroup >> then instantiate a {@link UserGroup} proxy.
     * 
     * @return a {@link UserGroup} proxy on the created {@link Class}.
     */
    @objid ("f026d1a1-b545-4990-90cd-8fa5ad9a0007")
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
    @objid ("25e61bb1-d8fe-44ef-a9d9-b93a5bd26b8c")
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
    @objid ("c04e999d-e3a6-4d67-9c3c-b16caa31fa45")
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
    @objid ("52c27f10-0a15-4979-a122-9454b88eaf9f")
    public void addUsers(final User obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), UserGroup.MdaTypes.MDAASSOCDEP);
            d.setName("users");
            d.putTagValue(UserGroup.MdaTypes.MDAASSOCDEP_ROLE, "users");
        }
    }

    @objid ("90cc4145-8e1b-4b89-834f-b67bab7be7f2")
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
    @objid ("9349e71b-d948-493c-a115-9f036eb2626a")
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
    @objid ("4c96966b-ba74-4a48-80aa-1f7a762559a5")
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

    @objid ("24adf7f6-3ef5-4ddb-95f8-0be35a7ac89b")
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
    @objid ("b82ea76f-b05f-45a0-b902-feebf40989b0")
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

    @objid ("faf014a3-78c1-402f-acf0-c3966aeb7a38")
    protected UserGroup(final Class elt) {
        super(elt);
    }

    @objid ("5c98c8d7-7e42-4650-94dd-2d4f9879ae9d")
    public static final class MdaTypes {
        @objid ("a1a2171d-c171-4998-839c-54b328e26974")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c2a1eaca-2d1b-41d0-9c1a-8dbfc8c5387f")
        private static Stereotype MDAASSOCDEP;

        @objid ("4a077bf7-6885-4715-a1a8-4b66f91a4443")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c78920e-5ac8-40dc-bd8e-575cf49c0134")
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
