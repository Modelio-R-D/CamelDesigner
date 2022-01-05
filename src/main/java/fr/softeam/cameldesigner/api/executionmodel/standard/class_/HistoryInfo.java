/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("ab4e3d36-66f1-4f56-a870-75008884c007")
    public static final String STEREOTYPE_NAME = "HistoryInfo";

    @objid ("1d32c1cc-8312-43d1-8c74-270ee8056915")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("d8cb5e34-8e9a-49f9-9095-46c6f047cb6a")
    public static final String OBJECT_TAGTYPE = "object";

    @objid ("fd35ab6d-bfd1-44be-86ed-7c52349c0ee1")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link HistoryInfo proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HistoryInfo >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bd4c846a-ff2d-4d06-847b-f431a35e77fd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HistoryInfo.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HistoryInfo >> then instantiate a {@link HistoryInfo} proxy.
     * 
     * @return a {@link HistoryInfo} proxy on the created {@link Class}.
     */
    @objid ("2a1e312c-a93b-483d-8afc-22aa4d0bd64d")
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
    @objid ("688f120c-9995-412d-b4a1-493b9079910d")
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
    @objid ("c0abb870-e2be-4973-9d12-594cee78a261")
    public static HistoryInfo safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HistoryInfo.canInstantiate(obj))
            return new HistoryInfo(obj);
        else
            throw new IllegalArgumentException("HistoryInfo: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a6bd47fb-c406-48c2-a8d7-c576ee46390f")
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
    @objid ("772a62f0-6899-48c7-aeba-31402cf2d873")
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
    @objid ("cae910c0-c5b3-470e-aa4e-03431f6ff118")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b872b21a-6374-4c75-bccf-9ae83b2b547a")
    public String getEndTime() {
        return this.elt.getTagValue(HistoryInfo.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'object'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("50c20c09-fc2c-4260-a69a-1ac0f5e486b3")
    public String getObject() {
        return this.elt.getTagValue(HistoryInfo.MdaTypes.OBJECT_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'objectRef' role.<p>
     * Role description:
     * null
     */
    @objid ("ae9ebe3a-364b-4855-8761-6b7272acc9ca")
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
    @objid ("6b5efff2-1217-4700-bf68-89a4018c431e")
    public String getStartTime() {
        return this.elt.getTagValue(HistoryInfo.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'subject' role.<p>
     * Role description:
     * null
     */
    @objid ("5afc6df8-d395-4e94-9d0b-f83b858fed48")
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

    @objid ("f042824c-6491-4675-abab-f368cfb8a961")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'action' role.<p>
     * Role description:
     * null
     */
    @objid ("a8a68481-b4a1-4ebf-a701-a56eea77b1bb")
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
    @objid ("95db6c44-e9b1-4da0-9edb-2918e583f19d")
    public void setEndTime(final String value) {
        this.elt.putTagValue(HistoryInfo.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'object'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("332ca64d-b06e-45ea-9e35-38917f8a4ac1")
    public void setObject(final String value) {
        this.elt.putTagValue(HistoryInfo.MdaTypes.OBJECT_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'objectRef' role.<p>
     * Role description:
     * null
     */
    @objid ("285ddb32-b919-4a56-98d0-605c54b88332")
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
    @objid ("4822b6db-30eb-47ee-bea6-12c6b4049bca")
    public void setStartTime(final String value) {
        this.elt.putTagValue(HistoryInfo.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'subject' role.<p>
     * Role description:
     * null
     */
    @objid ("16427fec-0ecc-488f-856d-7d5f829cba55")
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

    @objid ("fa3dd0ac-1d15-4553-b9d8-f629e3d1e407")
    protected HistoryInfo(final Class elt) {
        super(elt);
    }

    @objid ("3e1aab74-be0c-48b2-b316-e35870217b33")
    public static final class MdaTypes {
        @objid ("71d30130-235c-4cea-9a58-51578f0b05a7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("71fb787c-5fe3-4994-8e82-bac402159335")
        public static TagType OBJECT_TAGTYPE_ELT;

        @objid ("4247ef63-6d7f-407b-8482-13c0640eb7c0")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("07174759-75c1-4d3c-ac37-2962640be82c")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("b3dbf13f-9c8b-4640-ab31-744adc170299")
        private static Stereotype MDAASSOCDEP;

        @objid ("981790b7-ba5f-443f-9d26-7e93222695c8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b4ab6350-542c-4327-97c0-1be82a5d27fb")
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
