/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO;
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
 * Proxy class to handle a {@link Class} with << SLOViolation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("229f0919-35a3-4332-a078-24ebef396ceb")
public class SLOViolation extends Cause {
    @objid ("d2de2c10-94be-43de-95b7-d01be5dba3d2")
    public static final String STEREOTYPE_NAME = "SLOViolation";

    @objid ("3d7674f0-55b0-4928-89a0-0f87637a378a")
    public static final String ASSESSMENTTIME_TAGTYPE = "assessmentTime";

    /**
     * Tells whether a {@link SLOViolation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SLOViolation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("76e40c6c-2246-4bb8-9816-3f4eecdf9f57")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SLOViolation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SLOViolation >> then instantiate a {@link SLOViolation} proxy.
     * 
     * @return a {@link SLOViolation} proxy on the created {@link Class}.
     */
    @objid ("21c487d8-4fc7-4f9d-92a8-080dfbc8e0d3")
    public static SLOViolation create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SLOViolation.STEREOTYPE_NAME);
        return SLOViolation.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SLOViolation} proxy from a {@link Class} stereotyped << SLOViolation >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link SLOViolation} proxy or <i>null</i>.
     */
    @objid ("2c54e3ba-2a3f-41c5-b8f3-5520a705f11d")
    public static SLOViolation instantiate(final Class obj) {
        return SLOViolation.canInstantiate(obj) ? new SLOViolation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SLOViolation} proxy from a {@link Class} stereotyped << SLOViolation >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link SLOViolation} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("50f81a85-deb3-4bd3-b99e-952ac2c89df3")
    public static SLOViolation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SLOViolation.canInstantiate(obj))
            return new SLOViolation(obj);
        else
            throw new IllegalArgumentException("SLOViolation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a2ad7d05-b1b8-44d0-b6e7-41e5bbc4c607")
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
        SLOViolation other = (SLOViolation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'assessmentTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("24d8b3b8-e9cc-4158-b660-15bc11e7c32c")
    public String getAssessmentTime() {
        return this.elt.getTagValue(SLOViolation.MdaTypes.ASSESSMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("61312990-4f04-48af-a8f2-e3f100ce55d0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'measurement' role.<p>
     * Role description:
     * null
     */
    @objid ("19911ca1-7f33-4974-af96-980a79f83409")
    public Measurement getMeasurement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SLOViolation.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SLOViolation.MdaTypes.MDAASSOCDEP_ROLE), "measurement")){
                  if (ApplicationMeasurement.canInstantiate(d.getDependsOn()))
                     return (ApplicationMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ApplicationMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CommunicationMeasurement.canInstantiate(d.getDependsOn()))
                     return (CommunicationMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ContainerMeasurement.canInstantiate(d.getDependsOn()))
                     return (ContainerMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ContainerMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataMeasurement.canInstantiate(d.getDependsOn()))
                     return (DataMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PaaSMeasurement.canInstantiate(d.getDependsOn()))
                     return (PaaSMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponentMeasurement.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (VMMeasurement.canInstantiate(d.getDependsOn()))
                     return (VMMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VMMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'slo' role.<p>
     * Role description:
     * null
     */
    @objid ("76f829e1-1dad-4355-aa2e-5fc0165021ba")
    public ServiceLevelObjective getSlo() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SLOViolation.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SLOViolation.MdaTypes.MDAASSOCDEP_ROLE), "slo")){
                  if (SecuritySLO.canInstantiate(d.getDependsOn()))
                     return (SecuritySLO)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecuritySLO.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ServiceLevelObjective.canInstantiate(d.getDependsOn()))
                     return (ServiceLevelObjective)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ServiceLevelObjective.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("05c17c1f-df23-466d-a876-b9e933fecfdc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'assessmentTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5eeab257-6063-4d2e-9db3-c2661aa801df")
    public void setAssessmentTime(final String value) {
        this.elt.putTagValue(SLOViolation.MdaTypes.ASSESSMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'measurement' role.<p>
     * Role description:
     * null
     */
    @objid ("dec308c1-55b3-46d5-9b45-1862182738f0")
    public void setMeasurement(final Measurement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SLOViolation.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SLOViolation.MdaTypes.MDAASSOCDEP_ROLE), "measurement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SLOViolation.MdaTypes.MDAASSOCDEP);
              dep.setName("measurement");      dep.putTagValue(SLOViolation.MdaTypes.MDAASSOCDEP_ROLE, "measurement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'slo' role.<p>
     * Role description:
     * null
     */
    @objid ("0b954c31-772f-4c59-bc6e-c4bf6f5d01e1")
    public void setSlo(final ServiceLevelObjective obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SLOViolation.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SLOViolation.MdaTypes.MDAASSOCDEP_ROLE), "slo")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SLOViolation.MdaTypes.MDAASSOCDEP);
              dep.setName("slo");      dep.putTagValue(SLOViolation.MdaTypes.MDAASSOCDEP_ROLE, "slo");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("c5706353-340d-48e7-8d78-54dc0a893188")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("04005d98-9836-4b63-8c32-e93a0bb207d0")
    protected SLOViolation(final Class elt) {
        super(elt);
    }

    @objid ("d2af686a-83ed-4904-8eb0-ef64e85d5728")
    public static final class MdaTypes {
        @objid ("db90bfaa-a5ae-4f3b-b155-a0d9b3cc1f54")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("adb2fc63-8cae-400c-bac7-1a22ade4ab42")
        public static TagType ASSESSMENTTIME_TAGTYPE_ELT;

        @objid ("9a8e57ad-15c8-4d76-b820-5e75d3aca540")
        private static Stereotype MDAASSOCDEP;

        @objid ("69e0f316-51c7-400b-bd77-d00b65b448b5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0cf0ef7e-90d8-4f43-a155-f930f45655d1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe591c4e-317f-4202-9f7a-43dff0e6d7fe");
            ASSESSMENTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fc352744-f101-466f-a61c-0b32b9269a34");
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
