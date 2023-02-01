/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("fa0e0e91-04e0-4f9b-aa8f-6fdbda383575")
=======
    @objid ("980793b5-14a3-480c-9d1d-aaa1bdfbc545")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "UserGroup";

    /**
     * Tells whether a {@link UserGroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << UserGroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("e6a28075-1aa7-4988-844f-2d608671c019")
=======
    @objid ("55a6902a-4920-409a-9585-dac9281e8768")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UserGroup.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << UserGroup >> then instantiate a {@link UserGroup} proxy.
     * 
     * @return a {@link UserGroup} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("ad45167a-b3be-46f7-b1c2-01808a6fc633")
=======
    @objid ("7000e5c1-19ea-48f6-8251-e31bc622f8ed")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("18fd4045-8973-43f8-82df-6457666cd487")
=======
    @objid ("a76e340e-46c9-4507-9ace-e9427d1149e8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1aba70a0-64de-4dc3-b1e4-bd977f16daf7")
=======
    @objid ("49d5aae7-f2ae-4688-b1c0-00e5f659a030")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("8464c010-cf65-4681-9959-ecb5269ca714")
=======
    @objid ("ea8aeb0e-7d66-4d3b-84c5-6c55db77434d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addUsers(final User obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), UserGroup.MdaTypes.MDAASSOCDEP);
            d.setName("users");
            d.putTagValue(UserGroup.MdaTypes.MDAASSOCDEP_ROLE, "users");
        }
    }

<<<<<<< HEAD
    @objid ("fc6c9a31-be24-41f8-af4f-ca1feb52231b")
=======
    @objid ("e5f40cfc-dc5d-4a2b-b478-5fbc82adf030")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("dafffd86-2351-49d6-ab12-d60c9cf37cdd")
=======
    @objid ("ad03fd27-0163-4d26-89ee-c672baefb958")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("820e1938-ffee-49c2-8ebb-d8fcad92a23b")
=======
    @objid ("94743477-a9c7-4071-95b0-72ac4a9a9eb4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("9f610a17-edf0-4f27-b8f0-8d9249a58deb")
=======
    @objid ("13b4fbc6-2a0c-4119-8841-94b4028a8d74")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ed2fdf6f-a300-4fec-8bd8-e57bed532928")
=======
    @objid ("04a24a97-8173-44b1-ae0b-3d2d1f018b68")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("87bd927f-e132-4501-95da-ce6bb35d6bef")
=======
    @objid ("8db9659d-b0ab-4d5a-97fb-7d09cfc67875")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected UserGroup(final Class elt) {
        super(elt);
    }

    @objid ("5c98c8d7-7e42-4650-94dd-2d4f9879ae9d")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("0c468b19-7296-4772-aae3-42255943f3e8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("187f10b4-70c0-450e-8c12-0b19f03b5096")
        private static Stereotype MDAASSOCDEP;

        @objid ("67013114-dc74-44ff-868b-bbaa0468a39c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1045fb46-2066-4cdd-803f-f3339bc698bf")
=======
        @objid ("cc1939f3-8023-4dd0-ba15-f60ab51fd4e7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a04ae86-e02c-4e7f-994f-e7d29972160e")
        private static Stereotype MDAASSOCDEP;

        @objid ("d2eaacff-c1fa-4a74-9a1e-eaefb0a4f79f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9e6c7910-bc5a-43e6-b25a-1d79686ce383")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
