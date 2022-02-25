/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("de977534-3a20-491c-a8ad-cee5f5d3f7b3")
    public static final String STEREOTYPE_NAME = "SLOViolation";

    @objid ("e4c21a3b-debf-4fed-bc3a-be79408c7237")
    public static final String ASSESSMENTTIME_TAGTYPE = "assessmentTime";

    /**
     * Tells whether a {@link SLOViolation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SLOViolation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("95e721c4-f2a9-4b01-a40d-f75f3fc8ee75")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SLOViolation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SLOViolation >> then instantiate a {@link SLOViolation} proxy.
     * 
     * @return a {@link SLOViolation} proxy on the created {@link Class}.
     */
    @objid ("e946e9fa-047c-4612-9ab3-63c134f07bb5")
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
    @objid ("5a31160e-de1b-49f5-8f7d-e41529a5c6ed")
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
    @objid ("68ac142d-d601-450e-a660-815c9f0d9c51")
    public static SLOViolation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SLOViolation.canInstantiate(obj))
        	return new SLOViolation(obj);
        else
        	throw new IllegalArgumentException("SLOViolation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1a8dc033-1ec3-4e01-a416-4d815939153b")
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
    @objid ("fee0a861-da8c-4317-84ca-dde6c7ecb689")
    public String getAssessmentTime() {
        return this.elt.getTagValue(SLOViolation.MdaTypes.ASSESSMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("c144d287-d984-4124-9d23-eb6112863e2b")
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
    @objid ("4f352821-64c8-45d9-ac35-e4390068bd08")
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
    @objid ("e3a21cca-b412-4d66-9bbb-05702cad6e43")
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

    @objid ("58f479c0-c5a3-4159-b409-623072431d93")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'assessmentTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8f303d32-9c1b-4b25-8cbf-44065c85f0ad")
    public void setAssessmentTime(final String value) {
        this.elt.putTagValue(SLOViolation.MdaTypes.ASSESSMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'measurement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("eb44a513-1421-4fa9-9eb9-ea1008dcb8f9")
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
    @objid ("8eaca8f4-854d-4e69-b71f-f8b2e9a31631")
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

    @objid ("8f14fe26-0312-4b35-b4e3-4bb67c7cfd77")
    protected SLOViolation(final Class elt) {
        super(elt);
    }

    @objid ("d2af686a-83ed-4904-8eb0-ef64e85d5728")
    public static final class MdaTypes {
        @objid ("7ab8d324-cb1c-465f-b9b4-77ae1537121c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c9ce6d0-44db-4953-bdbb-7d1345b94a91")
        public static TagType ASSESSMENTTIME_TAGTYPE_ELT;

        @objid ("5f78f102-dd0f-4595-9ce4-2759e1423b56")
        private static Stereotype MDAASSOCDEP;

        @objid ("f6530260-0bd2-4751-bcde-eca8c39f8a29")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4b9367fa-ed8f-449a-91f9-9cc2f2254424")
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
