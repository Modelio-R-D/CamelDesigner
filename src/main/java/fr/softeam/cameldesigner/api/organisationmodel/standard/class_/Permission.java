/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter;
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
    @objid ("64a93e7d-5eb5-46d0-a3e8-ea4a64372e29")
    public static final String STEREOTYPE_NAME = "Permission";

    @objid ("69e5ca84-50a0-433a-9f62-d45506923f3a")
    public static final String ACTION_TAGTYPE = "action";

    @objid ("1b5d3557-4075-4f8e-815f-6c94b2e45462")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("8943ca9e-c5fe-4572-b91a-f7f13ba7c36d")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link Permission proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Permission >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("acae1bc2-dfcf-46eb-9abe-7b2befe63585")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Permission.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Permission >> then instantiate a {@link Permission} proxy.
     * 
     * @return a {@link Permission} proxy on the created {@link Class}.
     */
    @objid ("b9760b40-0109-4297-a99e-57f16d04db28")
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
    @objid ("3c3b9d0b-b210-4c21-9104-0ee081cd1519")
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
    @objid ("472c9e96-3d7b-47cc-a373-338529a5ec1c")
    public static Permission safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Permission.canInstantiate(obj))
        	return new Permission(obj);
        else
        	throw new IllegalArgumentException("Permission: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5f097818-fa1b-46f7-bb0f-7a961cbdbb4a")
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
    @objid ("7cd56297-2133-4002-a74d-83b809c4f06d")
    public String getAction() {
        return this.elt.getTagValue(Permission.MdaTypes.ACTION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("a3dfbb24-756b-46f4-8fa4-d157c8daa484")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("90c100f6-5650-4a7c-bbda-5320ab3cff21")
    public String getEndTime() {
        return this.elt.getTagValue(Permission.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'resourceFilter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ba2a16c8-429f-430f-b9c2-3fcc1ea08718")
    public ResourceFilter getResourceFilter() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Permission.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Permission.MdaTypes.MDAASSOCDEP_ROLE), "resourceFilter")
                  && ResourceFilter.canInstantiate(d.getDependsOn())) {
                     return (ResourceFilter)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ResourceFilter.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("609d9ae4-1ca5-468b-b473-5c40194b1486")
    public String getStartTime() {
        return this.elt.getTagValue(Permission.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    @objid ("68f54b39-6132-46e7-88b1-56eb848fa6ab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d75972ff-00ab-42b1-b7e0-0b376d86d749")
    public void setAction(final String value) {
        this.elt.putTagValue(Permission.MdaTypes.ACTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aaf21701-a162-4565-8811-15881dd56a12")
    public void setEndTime(final String value) {
        this.elt.putTagValue(Permission.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'resourceFilter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3513e50a-9de6-47a3-8983-38b0c544ad7a")
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
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bcaa333a-5588-4765-9343-f848a01c0b3b")
    public void setStartTime(final String value) {
        this.elt.putTagValue(Permission.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    @objid ("24c333e0-3947-4e80-a340-9d37dc04de03")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("b71c81a5-6c28-47e9-b779-a4326d08c690")
    protected Permission(final Class elt) {
        super(elt);
    }

    @objid ("fd62df34-464e-4836-920b-01cca4e1811a")
    public static final class MdaTypes {
        @objid ("d231b61f-6b6b-4f58-84ac-ccde5051656f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("df57334f-f9c4-4f97-9599-74a1f5e4fccc")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("cefc620a-26fa-43f3-901b-18b8ece6edcc")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("3dee9db3-4415-48f6-8ae7-7b59def3e437")
        public static TagType ACTION_TAGTYPE_ELT;

        @objid ("564d594a-b6a0-4b96-827f-8a6fbfd3b795")
        private static Stereotype MDAASSOCDEP;

        @objid ("130948ff-b7b1-486c-88f5-ac1f9003fb11")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("60dd9a0d-dc51-417d-82bb-202f3cce13fc")
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
