/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("1ad9c657-bcfd-4627-917a-bec644e1a099")
    public static final String STEREOTYPE_NAME = "RoleAssignment";

    @objid ("0223b77f-0957-43b9-a168-3a3469e7b6a3")
    public static final String ASSIGNMENTTIME_TAGTYPE = "assignmentTime";

    @objid ("a672d17c-df4c-4c2b-b3a4-c2765ff361fc")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("2e5d5cc7-71b6-4f9e-9c85-963663646686")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link RoleAssignment proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RoleAssignment >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bc4f871f-49a0-4d32-a75c-1dfc24be0d86")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RoleAssignment.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RoleAssignment >> then instantiate a {@link RoleAssignment} proxy.
     * 
     * @return a {@link RoleAssignment} proxy on the created {@link Class}.
     */
    @objid ("2d3a2c50-c71a-4b0f-a3ca-a7054c795b27")
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
    @objid ("8dbbe53a-71b1-4ffe-bb0d-2aca4b710544")
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
    @objid ("2b6d04e2-5438-42d7-b868-fa0803c83d4d")
    public static RoleAssignment safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RoleAssignment.canInstantiate(obj))
        	return new RoleAssignment(obj);
        else
        	throw new IllegalArgumentException("RoleAssignment: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5d562a5d-38e8-47cc-907a-cad082251649")
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
    @objid ("76090f5e-f8ee-427b-ac33-205bc76c0a94")
    public String getAssignmentTime() {
        return this.elt.getTagValue(RoleAssignment.MdaTypes.ASSIGNMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f92cb87c-54a7-4e35-9f18-e1d03cce341b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("556b3b61-c165-47d8-a089-66c27872b9ca")
    public String getEndTime() {
        return this.elt.getTagValue(RoleAssignment.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'role' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("338607fa-c902-4074-8cf0-42e1d007a557")
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
    @objid ("33341798-9cd4-450f-86bb-f934c6625fc7")
    public String getStartTime() {
        return this.elt.getTagValue(RoleAssignment.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'user' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8e62e33c-6261-4270-8524-4d4092a260d5")
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
    @objid ("3f7fc6cb-bdec-4edd-922c-723c74cb8245")
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

    @objid ("47cd6d1e-a2f2-4520-ad06-a48c490c9a34")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'assignmentTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1cae24b8-ab3e-4b9b-9baf-90588ea20e82")
    public void setAssignmentTime(final String value) {
        this.elt.putTagValue(RoleAssignment.MdaTypes.ASSIGNMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a8efc13b-a19f-4902-bdf9-adf2a9d23fbc")
    public void setEndTime(final String value) {
        this.elt.putTagValue(RoleAssignment.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'role' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ecc606fa-230b-4c46-a718-704dd604e9cd")
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
    @objid ("76374dca-42c0-4052-b9a9-8b39495c584d")
    public void setStartTime(final String value) {
        this.elt.putTagValue(RoleAssignment.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'user' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6a87ae37-3b91-4158-8d1d-7a419f04435a")
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
    @objid ("0969dd8d-5631-49bb-9618-330ba83e0bd5")
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

    @objid ("460fec7e-e849-41a6-8494-c7f9fa55c73e")
    protected RoleAssignment(final Class elt) {
        super(elt);
    }

    @objid ("25797b38-26a8-436f-90d6-470cd2d7d27e")
    public static final class MdaTypes {
        @objid ("73ca5834-16c4-4a3a-a31a-4d2e9372b55b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6f346d32-40b5-4a65-84ad-025ad6bc1621")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("00edd217-0587-4631-bc6b-ba13429bb571")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("b803f985-a081-48ba-8f56-a9ee8d7a215c")
        public static TagType ASSIGNMENTTIME_TAGTYPE_ELT;

        @objid ("fcb5a3e0-c75f-4e34-b568-aab3a3cb1000")
        private static Stereotype MDAASSOCDEP;

        @objid ("3cf278de-d348-49f6-bd73-f466e9946a69")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f2f3e67a-f34b-471b-b447-dc4b7847ff02")
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
