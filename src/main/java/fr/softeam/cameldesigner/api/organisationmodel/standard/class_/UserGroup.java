/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("43058c64-f139-47b4-90a3-120ebbd5f883")
    public static final String STEREOTYPE_NAME = "UserGroup";

    /**
     * Tells whether a {@link UserGroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << UserGroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("882fccf7-29f1-4490-8471-18f95d630f5a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UserGroup.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << UserGroup >> then instantiate a {@link UserGroup} proxy.
     * 
     * @return a {@link UserGroup} proxy on the created {@link Class}.
     */
    @objid ("1a3a16c8-cf7b-435c-bb9d-f920304d3a4a")
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
    @objid ("148d254c-cad1-4bb4-9ab4-20c6db587ee0")
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
    @objid ("a339b462-ad8b-4322-8d50-c990e341fbba")
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
    @objid ("67c09fd2-a57b-496f-b127-3744d75b826b")
    public void addUsers(final User obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), UserGroup.MdaTypes.MDAASSOCDEP);
            d.setName("users");
            d.putTagValue(UserGroup.MdaTypes.MDAASSOCDEP_ROLE, "users");
        }
    }

    @objid ("240094ec-467f-4161-b086-72b7173aca12")
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
    @objid ("ea52c1bd-0dd4-417a-83bc-2886df222142")
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
    @objid ("e9442e2d-02a4-4373-8048-b08f9ed11528")
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

    @objid ("fce4ff02-3aaf-44a4-ac95-068aa0c72d73")
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
    @objid ("03485162-5ac6-4f3b-8d9e-adc0b2fd361e")
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

    @objid ("90ebb974-a386-4d83-97db-87bb1287b0a5")
    protected UserGroup(final Class elt) {
        super(elt);
    }

    @objid ("5c98c8d7-7e42-4650-94dd-2d4f9879ae9d")
    public static final class MdaTypes {
        @objid ("8bd14ac9-1d7f-4def-b899-08b81924c5da")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ac406369-b7e1-4426-b2cf-2078f81f6184")
        private static Stereotype MDAASSOCDEP;

        @objid ("0c8c5ecb-a1ba-4ef4-bbfc-681961705590")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dc83b264-da99-48de-876e-14df45617952")
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
