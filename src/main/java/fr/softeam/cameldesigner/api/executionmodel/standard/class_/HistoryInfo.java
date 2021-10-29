/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.04

 * This file was generated on 10/19/21 2:54 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
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
 * Proxy class to handle a {@link Class} with << HistoryInfo >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("32a73516-6547-4f5b-b3b1-4018a2466233")
public class HistoryInfo extends FeatureClass {
    @objid ("e5f09106-4cd2-44d4-8b2c-0683044415d3")
    public static final String STEREOTYPE_NAME = "HistoryInfo";

    @objid ("fdae5614-0a00-487a-9d02-4a3cebe7dfe7")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("4ea1e984-5799-430d-ac5a-c20fff797b2b")
    public static final String OBJECT_TAGTYPE = "object";

    @objid ("99e95f0a-ec66-4b53-bf28-02940f85c7cf")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link HistoryInfo proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HistoryInfo >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cdb2c105-364c-4e0d-8490-c56b44ed2319")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HistoryInfo.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HistoryInfo >> then instantiate a {@link HistoryInfo} proxy.
     * 
     * @return a {@link HistoryInfo} proxy on the created {@link Class}.
     */
    @objid ("cecf21e2-8263-4957-a47b-e70a8a86cd92")
    public static HistoryInfo create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HistoryInfo.STEREOTYPE_NAME);
        return HistoryInfo.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link HistoryInfo} proxy from a {@link Class} stereotyped << HistoryInfo >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link HistoryInfo} proxy or <i>null</i>.
     */
    @objid ("3149e6c3-01cc-484a-bdc3-727da2e5488c")
    public static HistoryInfo instantiate(final Class obj) {
        return HistoryInfo.canInstantiate(obj) ? new HistoryInfo(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HistoryInfo} proxy from a {@link Class} stereotyped << HistoryInfo >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link HistoryInfo} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ec95df77-a26e-4bd8-9fd6-32f75dfcbe7a")
    public static HistoryInfo safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HistoryInfo.canInstantiate(obj))
            return new HistoryInfo(obj);
        else
            throw new IllegalArgumentException("HistoryInfo: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6fb3037f-83e6-4f2c-ad40-5e9e2ef427bc")
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
        HistoryInfo other = (HistoryInfo) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'action' role.<p>
     * Role description:
     * null
     */
    @objid ("4cbf238d-4b15-433c-b5a2-28d29532b5eb")
    public MmsObject getAction() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryInfo.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE), "action")
                  && MmsObject.canInstantiate(d.getDependsOn())) {
                     return (MmsObject)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsObject.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("c7184e76-9c96-4704-97b2-b56be92e77f1")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("10ea4ae3-ed52-41ed-ab6d-4f1ea7443727")
    public String getEndTime() {
        return this.elt.getTagValue(HistoryInfo.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'object'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8953fe0b-d61b-46a5-b427-cc242c3f9963")
    public String getObject() {
        return this.elt.getTagValue(HistoryInfo.MdaTypes.OBJECT_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'objectRef' role.<p>
     * Role description:
     * null
     */
    @objid ("a8bb7c7a-a23c-4af0-b527-297649bee798")
    public CamelElement getObjectRef() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryInfo.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE), "objectRef")
                  && CamelElement.canInstantiate(d.getDependsOn())) {
                     return (CamelElement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelElement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b97a3e6b-79bb-497b-ac6e-199380ba8d71")
    public String getStartTime() {
        return this.elt.getTagValue(HistoryInfo.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'subject' role.<p>
     * Role description:
     * null
     */
    @objid ("124ce59b-4e2b-4398-b582-967220095179")
    public MmsObject getSubject() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryInfo.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE), "subject")
                  && MmsObject.canInstantiate(d.getDependsOn())) {
                     return (MmsObject)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsObject.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("5ecd52b3-e7e9-43e3-a43e-6a10008573c4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'action' role.<p>
     * Role description:
     * null
     */
    @objid ("9c45d704-90d7-48b8-bddd-5c654f6f7335")
    public void setAction(final MmsObject obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryInfo.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE), "action")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryInfo.MdaTypes.MDAASSOCDEP);
              dep.setName("action");      dep.putTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE, "action");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("42568531-f9af-4297-9068-682e72d3a619")
    public void setEndTime(final String value) {
        this.elt.putTagValue(HistoryInfo.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'object'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("83723342-79c8-41d3-8a63-22c922bc7773")
    public void setObject(final String value) {
        this.elt.putTagValue(HistoryInfo.MdaTypes.OBJECT_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'objectRef' role.<p>
     * Role description:
     * null
     */
    @objid ("ca9e2eff-e763-4db3-abc8-777b7ada7590")
    public void setObjectRef(final CamelElement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryInfo.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE), "objectRef")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryInfo.MdaTypes.MDAASSOCDEP);
              dep.setName("objectRef");      dep.putTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE, "objectRef");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0621b0c7-a1b6-4de8-8ad4-9739e170e028")
    public void setStartTime(final String value) {
        this.elt.putTagValue(HistoryInfo.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'subject' role.<p>
     * Role description:
     * null
     */
    @objid ("417e75d7-97e7-4b3e-b3c0-acdc29dbb05a")
    public void setSubject(final MmsObject obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryInfo.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE), "subject")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryInfo.MdaTypes.MDAASSOCDEP);
              dep.setName("subject");      dep.putTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE, "subject");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("a3616c00-33fa-4942-b866-5a4553bdc481")
    protected HistoryInfo(final Class elt) {
        super(elt);
    }

    @objid ("3e1aab74-be0c-48b2-b316-e35870217b33")
    public static final class MdaTypes {
        @objid ("5f0f8672-db67-48e6-badc-6e0177c9a13e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6434110d-f7a7-4bdb-bc70-c5b832516b0d")
        public static TagType OBJECT_TAGTYPE_ELT;

        @objid ("862f6545-e14c-431a-93f7-fe8a2dce549e")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("de2307f7-193b-4dd8-8b5f-2c6a5b3e0d12")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("3448ec54-c36d-4fb5-8028-a2eb448696f6")
        private static Stereotype MDAASSOCDEP;

        @objid ("bdba7b99-09dc-4b11-808e-9a81f71ac0f4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("830299b2-e5c6-4162-aedf-22953a23f36b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "acef265d-7979-416d-8e8d-bc2a20331822");
            OBJECT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b459f0a0-04c3-4f41-ba76-aca6f5dc6dda");
            STARTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3888f8fe-984d-4fcb-a8f4-ed0071eb91c0");
            ENDTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e34ce3bc-ef22-4d6d-9c02-81f6bbd2268b");
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
