/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup;
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
 * Proxy class to handle a {@link Class} with << RoleAssignment >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("61cc6fd1-460e-4076-9418-4a79ca600092")
public class RoleAssignment extends FeatureClass {
    @objid ("20e1fd67-e182-487d-a11b-7ae961d16179")
    public static final String STEREOTYPE_NAME = "RoleAssignment";

    @objid ("9bc908e4-7356-4dd6-9e2d-4de0c88836f1")
    public static final String ASSIGNMENTTIME_TAGTYPE = "assignmentTime";

    @objid ("d1ef89bb-542f-42e7-ba6e-27f2c84df4f7")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("6d5cb6ed-fd7d-4b71-a572-f1b3dd9db0d3")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link RoleAssignment proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RoleAssignment >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("127f8a8c-9cbb-49bc-b0b3-0a9694356f75")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RoleAssignment.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RoleAssignment >> then instantiate a {@link RoleAssignment} proxy.
     * 
     * @return a {@link RoleAssignment} proxy on the created {@link Class}.
     */
    @objid ("19e35ff6-1c31-480e-b904-5de31e6855b4")
    public static RoleAssignment create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RoleAssignment.STEREOTYPE_NAME);
        return RoleAssignment.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RoleAssignment} proxy from a {@link Class} stereotyped << RoleAssignment >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RoleAssignment} proxy or <i>null</i>.
     */
    @objid ("d5aa7016-b4c4-4ce2-87ad-80da9a38c9d2")
    public static RoleAssignment instantiate(final Class obj) {
        return RoleAssignment.canInstantiate(obj) ? new RoleAssignment(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RoleAssignment} proxy from a {@link Class} stereotyped << RoleAssignment >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RoleAssignment} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8cc32091-ea24-4c16-a7ce-a67e7b93c5cc")
    public static RoleAssignment safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RoleAssignment.canInstantiate(obj))
        	return new RoleAssignment(obj);
        else
        	throw new IllegalArgumentException("RoleAssignment: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6dd5eded-d296-4e3c-86a4-6b336059845d")
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
        RoleAssignment other = (RoleAssignment) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'assignmentTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f8d46f94-f60c-45ce-a256-be22ef8a06b7")
    public String getAssignmentTime() {
        return this.elt.getTagValue(RoleAssignment.MdaTypes.ASSIGNMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f56f1a53-af09-4f98-9b09-00e1e57d7e7c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("044f6eae-1e58-4f65-85b9-c30873fd236d")
    public String getEndTime() {
        return this.elt.getTagValue(RoleAssignment.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'role' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9310d9d4-909b-4878-9d8d-468bca8aa074")
    public Role getRole() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RoleAssignment.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RoleAssignment.MdaTypes.MDAASSOCDEP_ROLE), "role")){
                  if (Role.canInstantiate(d.getDependsOn()))
                     return (Role)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Role.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6aad654a-94dd-4ff0-85eb-682cad2fad12")
    public String getStartTime() {
        return this.elt.getTagValue(RoleAssignment.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'user' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("700ecefe-67e1-4a67-9b62-53c52c202164")
    public User getUser() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RoleAssignment.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RoleAssignment.MdaTypes.MDAASSOCDEP_ROLE), "user")){
                  if (User.canInstantiate(d.getDependsOn()))
                     return (User)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), User.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'userGroup' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d58e8704-623a-4141-8449-43b523edc943")
    public UserGroup getUserGroup() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RoleAssignment.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RoleAssignment.MdaTypes.MDAASSOCDEP_ROLE), "userGroup")){
                  if (UserGroup.canInstantiate(d.getDependsOn()))
                     return (UserGroup)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), UserGroup.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("f594ea9a-20e7-4d35-8153-80f00e7fcd3b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'assignmentTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ca0a7a7d-ac83-4db7-a1b1-b09eb452b3c4")
    public void setAssignmentTime(final String value) {
        this.elt.putTagValue(RoleAssignment.MdaTypes.ASSIGNMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3e067a62-ed36-4b98-a927-804d2a187c02")
    public void setEndTime(final String value) {
        this.elt.putTagValue(RoleAssignment.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'role' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b39115d8-b465-44d7-88f5-5e0739837b91")
    public void setRole(final Role obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RoleAssignment.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RoleAssignment.MdaTypes.MDAASSOCDEP_ROLE), "role")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RoleAssignment.MdaTypes.MDAASSOCDEP);
              dep.setName("role");      dep.putTagValue(RoleAssignment.MdaTypes.MDAASSOCDEP_ROLE, "role");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3b423be8-c88c-4090-acdc-a6578f588c8a")
    public void setStartTime(final String value) {
        this.elt.putTagValue(RoleAssignment.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'user' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("365c64ac-4ab4-4fa2-9704-2151514e65eb")
    public void setUser(final User obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RoleAssignment.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RoleAssignment.MdaTypes.MDAASSOCDEP_ROLE), "user")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RoleAssignment.MdaTypes.MDAASSOCDEP);
              dep.setName("user");      dep.putTagValue(RoleAssignment.MdaTypes.MDAASSOCDEP_ROLE, "user");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'userGroup' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a1ea6962-d3aa-49fa-a0ea-c7eebaf20a2b")
    public void setUserGroup(final UserGroup obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RoleAssignment.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RoleAssignment.MdaTypes.MDAASSOCDEP_ROLE), "userGroup")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RoleAssignment.MdaTypes.MDAASSOCDEP);
              dep.setName("userGroup");      dep.putTagValue(RoleAssignment.MdaTypes.MDAASSOCDEP_ROLE, "userGroup");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("b6e32dfe-327f-44c5-a6eb-da5029c5d4b5")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("03c5ea45-f225-4ac3-ab0b-d61ebf4236bc")
    protected RoleAssignment(final Class elt) {
        super(elt);
    }

    @objid ("25797b38-26a8-436f-90d6-470cd2d7d27e")
    public static final class MdaTypes {
        @objid ("4bb85421-809f-4518-9126-d6fe6df378a1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("760a7741-350a-451f-b657-19f9d5f6ae8b")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("593fc7de-1a67-49a4-acfa-9c0435b237fb")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("afb23e23-1632-4829-9437-ac3f98d1dfd5")
        public static TagType ASSIGNMENTTIME_TAGTYPE_ELT;

        @objid ("ae14ffd1-89ec-44c3-af98-254deabe1ebc")
        private static Stereotype MDAASSOCDEP;

        @objid ("06b83417-99d5-4e7e-84f3-6e2bbaf4e510")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3c29465c-6df6-4e0f-9291-9f39db50a951")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "25d04405-c94a-44a0-848d-8563ca51ba23");
            STARTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "18d4111c-a2ed-4810-84d3-509d97db6890");
            ENDTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a5dd39e5-3525-409a-86ca-821144af3aab");
            ASSIGNMENTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a10d5c66-ff1b-405a-a713-cd6e0515e09d");
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
