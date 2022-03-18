/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement;
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
    @objid ("d601a004-40d6-48e6-80c3-4db71a3e9025")
    public static final String STEREOTYPE_NAME = "SLOViolation";

    @objid ("176fbcba-353b-4841-b67a-50cfd21be8c2")
    public static final String ASSESSMENTTIME_TAGTYPE = "assessmentTime";

    /**
     * Tells whether a {@link SLOViolation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SLOViolation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8a8920b1-3128-4898-93ee-80d6f7ba8955")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SLOViolation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SLOViolation >> then instantiate a {@link SLOViolation} proxy.
     * 
     * @return a {@link SLOViolation} proxy on the created {@link Class}.
     */
    @objid ("bc47ebbc-1c22-4a3e-9cef-1741254547bf")
    public static SLOViolation create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SLOViolation.STEREOTYPE_NAME);
        return SLOViolation.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SLOViolation} proxy from a {@link Class} stereotyped << SLOViolation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SLOViolation} proxy or <i>null</i>.
     */
    @objid ("c2e3f28a-669f-45b3-9882-92bc60efa21f")
    public static SLOViolation instantiate(final Class obj) {
        return SLOViolation.canInstantiate(obj) ? new SLOViolation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SLOViolation} proxy from a {@link Class} stereotyped << SLOViolation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SLOViolation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7a9d8deb-d815-4cc8-b005-327a6cabdce1")
    public static SLOViolation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SLOViolation.canInstantiate(obj))
        	return new SLOViolation(obj);
        else
        	throw new IllegalArgumentException("SLOViolation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2791bf47-81bf-42fa-a2f1-bb8589fe1ea3")
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
    @objid ("49e7e20b-fd99-4bac-bb5d-50d3e12ae370")
    public String getAssessmentTime() {
        return this.elt.getTagValue(SLOViolation.MdaTypes.ASSESSMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("6d4686d9-2901-402b-a94d-9f27e54b693b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'measurement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("40e859e6-ee45-4e2e-87a6-4e4e86fcfc99")
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
     * 
     */
    @objid ("b5391dad-ed60-4d3e-96da-108a58180662")
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

    @objid ("2edb2b96-e576-4cd0-b404-906334e711b7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'assessmentTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3f3bb052-288c-4707-b251-5eb4b998aeef")
    public void setAssessmentTime(final String value) {
        this.elt.putTagValue(SLOViolation.MdaTypes.ASSESSMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'measurement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("dc508e7f-de78-4fc7-9948-2d33650990e8")
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
     * 
     */
    @objid ("01794313-6622-4896-80fd-8b2ef513233a")
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

    @objid ("7bdd00a2-727f-485b-8783-17d617455086")
    protected SLOViolation(final Class elt) {
        super(elt);
    }

    @objid ("d2af686a-83ed-4904-8eb0-ef64e85d5728")
    public static final class MdaTypes {
        @objid ("b134c205-779f-4929-8f79-006bf638812e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3a58b2d8-cd01-4584-8a8d-31a6d99d9ef5")
        public static TagType ASSESSMENTTIME_TAGTYPE_ELT;

        @objid ("ea28218d-30d3-4eca-994f-289e4c375370")
        private static Stereotype MDAASSOCDEP;

        @objid ("4c2d2b1f-17f7-4e62-bb9f-19ed6d4b2744")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9a081275-2a1e-461a-8ffb-024f218c49fc")
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
