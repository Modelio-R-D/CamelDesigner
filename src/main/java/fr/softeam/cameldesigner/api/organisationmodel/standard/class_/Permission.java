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
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter;
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
    @objid ("7a94e8b1-1a66-4b97-9251-9a15e2905194")
    public static final String STEREOTYPE_NAME = "Permission";

    @objid ("e6a62836-4005-4531-810d-5f66a739bf29")
    public static final String ACTION_TAGTYPE = "action";

    @objid ("8588ac7a-0603-425c-9000-3f8c582663ca")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("6d2e6b46-7420-480f-97e5-ad67f341d17d")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link Permission proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Permission >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0ecab325-d321-46fe-9ca3-01d7d7591823")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Permission.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Permission >> then instantiate a {@link Permission} proxy.
     * 
     * @return a {@link Permission} proxy on the created {@link Class}.
     */
    @objid ("a3c1afd0-e6fe-465e-863a-2b56d62edaf4")
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
    @objid ("29ba606f-2807-40a0-927f-25c47dbde72a")
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
    @objid ("4e1c6e20-ab63-40fd-acff-2bb8b918a0f9")
    public static Permission safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Permission.canInstantiate(obj))
        	return new Permission(obj);
        else
        	throw new IllegalArgumentException("Permission: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("82080cee-3dad-43a6-a0a7-a12ea47a52d4")
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
    @objid ("a765442b-4137-46cd-9aa3-b3c6ce02dd7a")
    public String getAction() {
        return this.elt.getTagValue(Permission.MdaTypes.ACTION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8d8f6526-8824-4eb1-8555-d5117721d960")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("30018a08-ca0e-45b5-80f6-430eba0441dc")
    public String getEndTime() {
        return this.elt.getTagValue(Permission.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'resourceFilter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d8d3d74e-dfc6-4175-a7da-d767254441d0")
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
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5938cf01-97a9-4e5f-b584-9d8144cd25ff")
    public String getStartTime() {
        return this.elt.getTagValue(Permission.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    @objid ("77f4915e-c7a3-4a41-87c6-7a7ce7c23978")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("33642248-b732-44d1-8f53-677fc3a69bc0")
    public void setAction(final String value) {
        this.elt.putTagValue(Permission.MdaTypes.ACTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cc1a04f5-5562-40e9-a73c-a4b9b2f745f1")
    public void setEndTime(final String value) {
        this.elt.putTagValue(Permission.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'resourceFilter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8ebfac05-2740-4b39-9820-a4f5c4cbd9c4")
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
    @objid ("9c26555c-9a30-435e-aec2-8bfb24c868fb")
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

    @objid ("d41fc5e3-ca25-4cdb-ad2d-24bbe582768e")
    protected Permission(final Class elt) {
        super(elt);
    }

    @objid ("fd62df34-464e-4836-920b-01cca4e1811a")
    public static final class MdaTypes {
        @objid ("e0b3d978-eab3-46a0-96b0-220ff104664f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2c5d3d7b-1618-48a0-b541-06392e39ca62")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("a0a3b30f-c3d7-4711-bff8-1ec46013e51a")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("b312f8e1-c4d9-4dd7-b433-8b32cd8dc5bb")
        public static TagType ACTION_TAGTYPE_ELT;

        @objid ("74979e54-ad93-4aa7-ab12-64a11f69d8a7")
        private static Stereotype MDAASSOCDEP;

        @objid ("9b816576-b186-4240-b882-2757f00417df")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fdcc556a-7d7f-45c2-8d0b-3f2829ff514e")
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
