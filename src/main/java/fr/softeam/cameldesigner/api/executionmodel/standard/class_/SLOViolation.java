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
    @objid ("4ad41cbc-5ff0-4203-b8d4-b3699a2d51a1")
    public static final String STEREOTYPE_NAME = "SLOViolation";

    @objid ("f2ad8ffc-6473-4b21-9c88-3665c3b8bbdf")
    public static final String ASSESSMENTTIME_TAGTYPE = "assessmentTime";

    /**
     * Tells whether a {@link SLOViolation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SLOViolation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f1ede385-0e56-4318-8223-a7eeb669aa23")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SLOViolation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SLOViolation >> then instantiate a {@link SLOViolation} proxy.
     * 
     * @return a {@link SLOViolation} proxy on the created {@link Class}.
     */
    @objid ("a649e5db-2de7-4f6b-84e1-ab6d480d992b")
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
    @objid ("eca63456-0f84-4f59-8b73-184a71738e46")
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
    @objid ("0a654f1f-a076-42eb-9543-6ad2442277e8")
    public static SLOViolation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SLOViolation.canInstantiate(obj))
        	return new SLOViolation(obj);
        else
        	throw new IllegalArgumentException("SLOViolation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f9b8868a-8f96-4c26-b74a-9ad81b69a8db")
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
    @objid ("87b8de84-6413-4932-b94c-73e6fa90c95d")
    public String getAssessmentTime() {
        return this.elt.getTagValue(SLOViolation.MdaTypes.ASSESSMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d9986e6e-ce04-445c-82ab-9c05d96a03a6")
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
    @objid ("4cde6755-6abc-486f-964f-3eeaf7be53b9")
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
    @objid ("a1ca4138-3223-4d21-bad8-427b13a2fb31")
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

    @objid ("439eb24f-de55-4ca5-88d9-8ada33a87348")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'assessmentTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4fa3126b-942d-4137-b4e3-ae1642467319")
    public void setAssessmentTime(final String value) {
        this.elt.putTagValue(SLOViolation.MdaTypes.ASSESSMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'measurement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("77338e87-d9ad-41b7-812f-93229987012a")
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
    @objid ("76e9ee42-abd3-4c3b-b584-a7097d1129a8")
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

    @objid ("d97bab01-d8b0-478c-abd6-a105b2c769f0")
    protected SLOViolation(final Class elt) {
        super(elt);
    }

    @objid ("d2af686a-83ed-4904-8eb0-ef64e85d5728")
    public static final class MdaTypes {
        @objid ("44e1fb46-d3ba-4a6a-a583-f2b9a0e0060d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("77555744-69c7-47d4-9b7d-4efb00622a42")
        public static TagType ASSESSMENTTIME_TAGTYPE_ELT;

        @objid ("e42d1d68-bd2d-4c82-8418-cdc95dfc2b22")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ea94bc6-cd06-4527-b926-2d71ec97af96")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7cae05d9-b24c-40f7-80cc-a0b8e937905e")
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
