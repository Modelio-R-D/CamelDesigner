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
<<<<<<< HEAD
    @objid ("10eb022d-5a0d-4f45-8de0-c11ecd4f487d")
    public static final String STEREOTYPE_NAME = "Permission";

    @objid ("b84def40-b3e4-499b-a9f9-a839f9ab099d")
    public static final String ACTION_TAGTYPE = "action";

    @objid ("194be11a-1cea-44fc-959d-128eac0cb845")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("0ad7d29c-75ef-464f-bfba-376950af83e9")
=======
    @objid ("fa56306c-8e0d-4ac8-b613-7fdba0506164")
    public static final String STEREOTYPE_NAME = "Permission";

    @objid ("ad8d026f-7718-4f5f-aa86-221a5b450cb9")
    public static final String ACTION_TAGTYPE = "action";

    @objid ("f4a7c614-b107-481b-8624-dec10b327a16")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("e6edb3aa-e44c-41d8-817a-b7a52089be5a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link Permission proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Permission >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d8ad8f8a-babe-4edb-8909-c131b61af416")
=======
    @objid ("b6f543f1-e84e-4e95-aeb4-264932f8fcf8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Permission.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Permission >> then instantiate a {@link Permission} proxy.
     * 
     * @return a {@link Permission} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("be492795-340d-4a73-84fe-ec91f0cea575")
=======
    @objid ("8b533caa-579c-40d4-bb3e-0aab358ecc9f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("17ac3f63-dfca-4366-9193-8012de46c5d6")
=======
    @objid ("b8844058-dfbb-4eab-bc70-25c6449d51fa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ec202cff-c72c-4b98-b32b-91cf48fe3e5f")
=======
    @objid ("a21eb56c-75e4-46e2-b8f2-0d3bb134ca0b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Permission safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Permission.canInstantiate(obj))
        	return new Permission(obj);
        else
        	throw new IllegalArgumentException("Permission: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("359b3819-d970-425c-8099-86227abda5a8")
=======
    @objid ("0b135892-0b48-4849-9299-81a928a1b17b")
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
        Permission other = (Permission) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("869871d3-8ff2-4169-8aaa-fa59b9b919db")
=======
    @objid ("0d22010d-9a1b-488c-a0ab-50da7810ac0e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getAction() {
        return this.elt.getTagValue(Permission.MdaTypes.ACTION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("62a7b0c0-c4c4-405c-bed9-8a3ab1212c03")
=======
    @objid ("55289de0-c1cb-40c9-ae0e-cd25477d688f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("cb8f2c87-eb96-4cb4-99e4-f925a7e8c2b9")
=======
    @objid ("137cc833-3c77-4946-9eab-094fd508337a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getEndTime() {
        return this.elt.getTagValue(Permission.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'resourceFilter' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8bd73aa1-df2d-42b3-9451-a0e622c3e941")
=======
    @objid ("aeff5e56-d21e-4445-baca-f03fd2dbce40")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1a63f6ec-f5ff-450b-b7af-4adc43d5072f")
=======
    @objid ("81d4a744-7a66-45d0-b358-5ba86584453a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f3d72fda-c82a-4670-8725-12a2912d84c8")
=======
    @objid ("7246affa-a4b6-41da-9d7a-684d4118030c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getStartTime() {
        return this.elt.getTagValue(Permission.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("8f41a31a-9d30-459b-b38e-641016f05b99")
=======
    @objid ("850f085c-aa0f-43d9-8b96-eb015f8ceddc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("477f03e7-e894-4269-9c54-84efac8770f2")
=======
    @objid ("e36c5c9f-582a-4f8d-8d8f-19fede8fe802")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setAction(final String value) {
        this.elt.putTagValue(Permission.MdaTypes.ACTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("85ead214-6b8e-431c-9661-a9c6091c1638")
=======
    @objid ("4bb1a1a5-2ca3-45be-a8a9-d850768fc5f1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setEndTime(final String value) {
        this.elt.putTagValue(Permission.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'resourceFilter' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("d7450723-2cf6-4772-aa6d-4e8361465242")
=======
    @objid ("912b5acc-623c-4a6b-aebc-25f3dc0c7f91")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7db4726a-5990-4125-8c07-7a443d248657")
=======
    @objid ("df8be3d1-3c18-4c2a-8001-aa05099c4091")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d751646c-6459-497e-9c23-a6baef44c70d")
=======
    @objid ("794be677-a933-4ba3-ba99-41721fa8ce16")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("7089a78f-53f6-4f07-8e8a-7bdcadb23a21")
=======
    @objid ("9a32268d-202c-4770-b7f1-3eb7abd656ae")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Permission(final Class elt) {
        super(elt);
    }

    @objid ("fd62df34-464e-4836-920b-01cca4e1811a")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("8a676142-e5c7-4b1c-be6f-68e7ba930607")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("79ebeb9b-093a-4bbb-9702-4f137b11b2e7")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("202acc3f-c927-4cfa-8189-2d42e23c7735")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("eaa55d20-ddc6-4e17-b81b-81a28ab59ecb")
        public static TagType ACTION_TAGTYPE_ELT;

        @objid ("ec95002e-4ced-42e0-9647-08aa93201d68")
        private static Stereotype MDAASSOCDEP;

        @objid ("6ee698dd-5644-4cf1-b30e-07afadf38f9c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a5fe09bc-1afb-422c-92d5-76db58d4a566")
=======
        @objid ("836df43d-7088-4650-a315-1c80a64cb0fc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("39408eac-fe1a-455d-a207-cf541a9820c3")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("fefa1909-2d73-4d51-b89e-eef9a1754ba0")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("ff12240d-de32-4016-a650-b947a8df5c45")
        public static TagType ACTION_TAGTYPE_ELT;

        @objid ("892c58a5-78a6-4e2e-979c-1b213fa49f91")
        private static Stereotype MDAASSOCDEP;

        @objid ("4323549c-be7a-4d48-b375-1859ec463788")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("515cc8db-b6b0-4ee6-b8b8-31b3d406e49d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
