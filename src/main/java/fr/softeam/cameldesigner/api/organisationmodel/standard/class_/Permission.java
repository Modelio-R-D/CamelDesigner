/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter;
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
 * Proxy class to handle a {@link Class} with << Permission >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c4125da8-2af3-4f99-b5b9-17fc903ad9ce")
public class Permission extends FeatureClass {
    @objid ("6aa4de0c-75dd-4db4-bf41-6605787f3a5c")
    public static final String STEREOTYPE_NAME = "Permission";

    @objid ("0bd4aa64-40db-4748-8681-0ed43aba0aec")
    public static final String ACTION_TAGTYPE = "action";

    @objid ("e7b2b04d-4791-4a9f-9a3f-c54987c14aa6")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("300a81ab-c168-4ac5-9a0b-428db9f574dc")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link Permission proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Permission >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0710522b-5546-405a-a0f6-afab31bff95c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Permission.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Permission >> then instantiate a {@link Permission} proxy.
     * 
     * @return a {@link Permission} proxy on the created {@link Class}.
     */
    @objid ("27b592b2-5e9c-4b47-81b8-5eef17120b0a")
    public static Permission create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Permission.STEREOTYPE_NAME);
        return Permission.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Permission} proxy from a {@link Class} stereotyped << Permission >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Permission} proxy or <i>null</i>.
     */
    @objid ("01813728-bed3-4667-85c2-d5869d219c99")
    public static Permission instantiate(final Class obj) {
        return Permission.canInstantiate(obj) ? new Permission(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Permission} proxy from a {@link Class} stereotyped << Permission >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Permission} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("caf1f79a-8a10-4bf2-b555-1002d5c6e02a")
    public static Permission safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Permission.canInstantiate(obj))
        	return new Permission(obj);
        else
        	throw new IllegalArgumentException("Permission: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("23c03452-337e-47c3-97b0-105fe58aba2d")
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
        Permission other = (Permission) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9e6bd2f1-6779-4624-9deb-a2dbf056b21d")
    public String getAction() {
        return this.elt.getTagValue(Permission.MdaTypes.ACTION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("08050301-06ff-4596-95c8-9606d234e93f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b825d914-2640-47e4-a736-0734aca66953")
    public String getEndTime() {
        return this.elt.getTagValue(Permission.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'resourceFilter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a191cf77-5efb-463e-973f-90d90744860e")
    public ResourceFilter getResourceFilter() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Permission.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Permission.MdaTypes.MDAASSOCDEP_ROLE), "resourceFilter")){
                  if (DataResourceFilter.canInstantiate(d.getDependsOn()))
                     return (DataResourceFilter)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataResourceFilter.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ModelResourceFilter.canInstantiate(d.getDependsOn()))
                     return (ModelResourceFilter)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ModelResourceFilter.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ServiceResourceFilter.canInstantiate(d.getDependsOn()))
                     return (ServiceResourceFilter)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ServiceResourceFilter.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponentResourceFilter.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentResourceFilter)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentResourceFilter.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'role' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0943c25f-f4e4-442f-9118-fd4b5ec31daa")
    public Role getRole() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Permission.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Permission.MdaTypes.MDAASSOCDEP_ROLE), "role")){
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
    @objid ("881fe070-8988-4aa6-b86d-246f03bccd15")
    public String getStartTime() {
        return this.elt.getTagValue(Permission.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    @objid ("f8b60014-1a72-4c7c-a0d2-71a7e6b91bd0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("312ff3ae-0fb1-4f90-92dc-65d2ce72e913")
    public void setAction(final String value) {
        this.elt.putTagValue(Permission.MdaTypes.ACTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eccef40f-dae0-48db-99b4-d235b5ef6974")
    public void setEndTime(final String value) {
        this.elt.putTagValue(Permission.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'resourceFilter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7c58a3c0-fb0f-4229-af96-86de76f1e4bd")
    public void setResourceFilter(final ResourceFilter obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Permission.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Permission.MdaTypes.MDAASSOCDEP_ROLE), "resourceFilter")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Permission.MdaTypes.MDAASSOCDEP);
              dep.setName("resourceFilter");      dep.putTagValue(Permission.MdaTypes.MDAASSOCDEP_ROLE, "resourceFilter");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'role' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6a254a12-075e-4946-86dc-d24bf9fa112e")
    public void setRole(final Role obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Permission.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Permission.MdaTypes.MDAASSOCDEP_ROLE), "role")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Permission.MdaTypes.MDAASSOCDEP);
              dep.setName("role");      dep.putTagValue(Permission.MdaTypes.MDAASSOCDEP_ROLE, "role");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("767a2ee2-4d08-44c6-98e4-11ae42ab80c9")
    public void setStartTime(final String value) {
        this.elt.putTagValue(Permission.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    @objid ("c0377be3-07de-4343-a86d-2e3bdf615a6e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("cf5589b7-e072-4fa6-9e5f-664d9552248e")
    protected Permission(final Class elt) {
        super(elt);
    }

    @objid ("fd62df34-464e-4836-920b-01cca4e1811a")
    public static final class MdaTypes {
        @objid ("23d9c8af-a7ea-4234-b98d-39bdf682b751")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6181a60e-86e1-4789-9ceb-b3f6b7f15cf3")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("173eca9f-1f77-440a-9294-861850d34aa7")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("efba9223-5a8c-4241-9fe9-e774a9593b78")
        public static TagType ACTION_TAGTYPE_ELT;

        @objid ("ce741d18-c951-43be-a953-548a391a13be")
        private static Stereotype MDAASSOCDEP;

        @objid ("c722d507-eaea-4008-b61f-2f50b921aaae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d9958fa9-b978-4375-bfea-d55d911a5de1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6ae08256-a803-41d5-b777-25c632563818");
            STARTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1cd5d4cb-89a8-4de9-bb2b-b8c6c32eb886");
            ENDTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "915d1bbf-4329-4bc3-808f-6a5c16adb930");
            ACTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9e1084c-4454-4058-8d17-2a224a9d9315");
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
