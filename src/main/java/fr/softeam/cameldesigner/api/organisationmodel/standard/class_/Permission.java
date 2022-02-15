/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
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
    @objid ("317c0688-3208-462b-9e92-7d930f912a72")
    public static final String STEREOTYPE_NAME = "Permission";

    @objid ("e1715e39-e44e-48a9-af30-e7734b55e199")
    public static final String ACTION_TAGTYPE = "action";

    @objid ("38a1c94d-362b-46d9-bb78-fbab954cf47d")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("9619179c-b194-4913-b241-0b567e237955")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link Permission proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Permission >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6ae12889-2b36-4075-9502-c64ea33e7747")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Permission.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Permission >> then instantiate a {@link Permission} proxy.
     * 
     * @return a {@link Permission} proxy on the created {@link Class}.
     */
    @objid ("e6636aac-e1a0-4db4-879f-1a0e6b615d05")
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
    @objid ("85d0020b-2e39-4e45-bde2-e21e4ed9ff19")
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
    @objid ("ea762dba-b435-4252-9090-083014009e38")
    public static Permission safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Permission.canInstantiate(obj))
        	return new Permission(obj);
        else
        	throw new IllegalArgumentException("Permission: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("22f5bbe4-2c06-4aaa-94d4-855a22b1837f")
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
    @objid ("d209d75b-6885-438f-956b-dec5cf405893")
    public String getAction() {
        return this.elt.getTagValue(Permission.MdaTypes.ACTION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("45a28a79-491b-4a60-b228-778045eb79c0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a213fb9e-6610-4e4c-b388-c72af8b2c95e")
    public String getEndTime() {
        return this.elt.getTagValue(Permission.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'resourceFilter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6bb2d4de-19ae-4fb3-9ab8-cb211e041a04")
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
    @objid ("6167bf28-3826-45f6-92cc-9d4e8cdd36d5")
    public String getStartTime() {
        return this.elt.getTagValue(Permission.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    @objid ("c6fdb9d0-9bc0-4462-ab58-b22a05d75ad2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("29bc7476-233b-4124-a66c-9309322f4acc")
    public void setAction(final String value) {
        this.elt.putTagValue(Permission.MdaTypes.ACTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("25b65c13-ef43-4031-a8e9-3671ae469fe7")
    public void setEndTime(final String value) {
        this.elt.putTagValue(Permission.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'resourceFilter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f529ab4f-faaa-4c7f-bd60-066d1606ad05")
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
    @objid ("8a2c5434-25dc-4122-ac8f-3ab57d253e27")
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

    @objid ("8ed5808c-46bd-45af-8d32-afd6b4872f44")
    protected Permission(final Class elt) {
        super(elt);
    }

    @objid ("fd62df34-464e-4836-920b-01cca4e1811a")
    public static final class MdaTypes {
        @objid ("6e2a9338-d455-469d-9227-032f5f250803")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("20ce178a-21b7-40c6-b000-1a67016be270")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("49626b1a-c828-4816-8636-b889762fc429")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("4e0af7e9-6bcc-47ac-8093-57cc7ce6b909")
        public static TagType ACTION_TAGTYPE_ELT;

        @objid ("5bbf044d-f0a0-44bb-a099-d0e2194b5a57")
        private static Stereotype MDAASSOCDEP;

        @objid ("705ea99f-7ce0-436f-8241-7186ed6dcb3a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9fc6b3fc-6199-4b1e-b308-72ae1d91c1e1")
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
