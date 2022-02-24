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
    @objid ("77f1f316-3500-45dc-8ba0-fb09bc24520f")
    public static final String STEREOTYPE_NAME = "RoleAssignment";

    @objid ("6040fddd-d421-47f8-8d53-98879570f846")
    public static final String ASSIGNMENTTIME_TAGTYPE = "assignmentTime";

    @objid ("14ca135e-3775-4245-bf61-2e80c5c98a06")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("4642f680-9102-4b59-a729-6e9cde4fc218")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link RoleAssignment proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RoleAssignment >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e59d9be1-ebd2-4361-ae27-a5412ecaa03c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RoleAssignment.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RoleAssignment >> then instantiate a {@link RoleAssignment} proxy.
     * 
     * @return a {@link RoleAssignment} proxy on the created {@link Class}.
     */
    @objid ("b54dcd57-4556-4a75-8006-4cc643a40fe6")
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
    @objid ("bc96222c-77f1-4ad2-b91b-184b7a7f695f")
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
    @objid ("103565c4-604d-47f8-9dd1-62ba9fb50c9f")
    public static RoleAssignment safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RoleAssignment.canInstantiate(obj))
        	return new RoleAssignment(obj);
        else
        	throw new IllegalArgumentException("RoleAssignment: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e75c36f5-4b02-4526-b9d2-ee5a34cc18aa")
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
    @objid ("d22e31d3-6a82-49b4-9690-eea65cb1a74e")
    public String getAssignmentTime() {
        return this.elt.getTagValue(RoleAssignment.MdaTypes.ASSIGNMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("adef8f35-653a-461f-abe3-854f5bdce68a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("96592c74-5239-4f7e-afa5-16aa9b89f37a")
    public String getEndTime() {
        return this.elt.getTagValue(RoleAssignment.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'role' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f22524c3-ae05-4e86-8360-3851ac084e04")
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
    @objid ("8383f842-776f-470a-96f3-77f019e8a148")
    public String getStartTime() {
        return this.elt.getTagValue(RoleAssignment.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'user' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("86febeb8-013b-489b-b94d-e3dc5fb534fb")
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
    @objid ("7859319f-f602-44f4-8796-0d571a5ddb0b")
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

    @objid ("1540921a-2234-4a6e-82a4-7238406c2637")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'assignmentTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0de1c8af-182d-48e9-8fe2-818cc9f38a00")
    public void setAssignmentTime(final String value) {
        this.elt.putTagValue(RoleAssignment.MdaTypes.ASSIGNMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7527085a-bb82-4272-a6be-45f744fc6b38")
    public void setEndTime(final String value) {
        this.elt.putTagValue(RoleAssignment.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'role' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("16872e2f-d5b8-4ced-b363-cf5e0ee78039")
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
    @objid ("5d9e34ce-ffa9-449a-94b7-ec5df5d8471f")
    public void setStartTime(final String value) {
        this.elt.putTagValue(RoleAssignment.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'user' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2920e956-4be1-444c-b4ee-ea42af0d4d1a")
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
    @objid ("45bdfccc-08aa-4c1d-beb8-7656ed8cdcd4")
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

    @objid ("b27cb89c-593b-4f44-87af-869f27afc94a")
    protected RoleAssignment(final Class elt) {
        super(elt);
    }

    @objid ("25797b38-26a8-436f-90d6-470cd2d7d27e")
    public static final class MdaTypes {
        @objid ("f9be547e-cf44-4959-a9ca-a7ae08cc239b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a389eaba-1109-432b-99e6-1049acbe2657")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("e5ecd267-44fd-402f-bd07-7fd63a6401df")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("8e2d49c3-b6b4-4000-a13c-de4ec8d14524")
        public static TagType ASSIGNMENTTIME_TAGTYPE_ELT;

        @objid ("c588ea50-a926-4c43-9b8b-0c6ec08f92cd")
        private static Stereotype MDAASSOCDEP;

        @objid ("61781b60-704c-4539-8c3c-1343ea2700f1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("45ede3dc-27ff-461c-aadc-eb4a56755712")
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
