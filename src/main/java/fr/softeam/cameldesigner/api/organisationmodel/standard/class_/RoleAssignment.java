/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("688d347f-d04f-48fc-a438-dc136305d6f5")
    public static final String STEREOTYPE_NAME = "RoleAssignment";

    @objid ("52ae0716-d3f5-456c-8fa3-3795e2af092d")
    public static final String ASSIGNMENTTIME_TAGTYPE = "assignmentTime";

    @objid ("1dd84aad-5e3b-4baf-98a6-ff35c6d4f3db")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("1f44e535-9d5d-452e-bd29-5b6cd23d3b11")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link RoleAssignment proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RoleAssignment >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("13e3f385-7aba-4025-9c20-8d5b528c7ce6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RoleAssignment.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RoleAssignment >> then instantiate a {@link RoleAssignment} proxy.
     * 
     * @return a {@link RoleAssignment} proxy on the created {@link Class}.
     */
    @objid ("c1768c1c-45f7-4613-9d24-33d4b6c9fb2b")
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
    @objid ("c4fae09f-57c5-42aa-888e-00c146c1589f")
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
    @objid ("2d5f93f3-a83b-4c73-8f50-c08f3c25ac18")
    public static RoleAssignment safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RoleAssignment.canInstantiate(obj))
        	return new RoleAssignment(obj);
        else
        	throw new IllegalArgumentException("RoleAssignment: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("12c9869d-3f13-4d5d-b7b2-37fc91edb450")
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
    @objid ("41ba56ef-5617-45df-bf8a-859b4131e7d1")
    public String getAssignmentTime() {
        return this.elt.getTagValue(RoleAssignment.MdaTypes.ASSIGNMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("5a19e39a-30a1-43c7-95fe-8be52b0322ce")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9c82a4a6-b509-43b6-9e59-44fd17a178e0")
    public String getEndTime() {
        return this.elt.getTagValue(RoleAssignment.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'role' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f4d80357-641c-41e7-870a-e0a342d31b51")
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
    @objid ("cbae0429-a447-48b0-8791-041b76878abd")
    public String getStartTime() {
        return this.elt.getTagValue(RoleAssignment.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'user' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9a6cfb10-1425-4a0c-8775-3b2ed18ecc21")
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
    @objid ("76bae8cc-9267-42cb-9bc7-1126471136f6")
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

    @objid ("117faeba-5107-4762-9151-a7a1fcef29e5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'assignmentTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ae84f4f8-3407-4e40-8ec4-7a7efa7db57b")
    public void setAssignmentTime(final String value) {
        this.elt.putTagValue(RoleAssignment.MdaTypes.ASSIGNMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5fb51e97-1872-4b9a-b1c3-4b569440cfc4")
    public void setEndTime(final String value) {
        this.elt.putTagValue(RoleAssignment.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'role' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a5f40add-c3ec-4f61-93ac-06a38c291019")
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
    @objid ("0751fdb3-0165-4c5d-b877-f6d4d4204a1a")
    public void setStartTime(final String value) {
        this.elt.putTagValue(RoleAssignment.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'user' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("65587192-a186-4ef9-8e45-d9ab9cfcdf44")
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
    @objid ("b5787ca4-563d-4a74-a430-0e0def1b23ed")
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

    @objid ("6403ec63-c137-41bc-9b12-79dcf49fbe86")
    protected RoleAssignment(final Class elt) {
        super(elt);
    }

    @objid ("25797b38-26a8-436f-90d6-470cd2d7d27e")
    public static final class MdaTypes {
        @objid ("620c0744-8784-4425-9f3a-59fb0940ef19")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cc0de78e-f107-4234-9008-0baea86b5abe")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("e8ca19f1-d5cb-46c3-9163-03d214b329ba")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("23e76021-a1a8-4780-a07b-9929d0c05940")
        public static TagType ASSIGNMENTTIME_TAGTYPE_ELT;

        @objid ("1b708a9e-827f-4fc5-aa9d-5599df1182ba")
        private static Stereotype MDAASSOCDEP;

        @objid ("61513a4f-05b0-4fc0-894d-cfaaec94967a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d8d4dc66-2f77-40dd-bcf8-26bb5af5738c")
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
