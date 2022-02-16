/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern;
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
 * Proxy class to handle a {@link Class} with << ServiceLevelObjective >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c1a7b9fb-e797-4f38-a956-d25268a52f8d")
public class ServiceLevelObjective extends HardRequirement {
    @objid ("c9facb5b-4160-467c-9799-413ab7056cc8")
    public static final String STEREOTYPE_NAME = "ServiceLevelObjective";

    /**
     * Tells whether a {@link ServiceLevelObjective proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ServiceLevelObjective >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9e379250-8364-4a06-a59e-b431a9d9092e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServiceLevelObjective.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ServiceLevelObjective >> then instantiate a {@link ServiceLevelObjective} proxy.
     * 
     * @return a {@link ServiceLevelObjective} proxy on the created {@link Class}.
     */
    @objid ("0ea0f299-b2d7-42fb-bdc0-3d870bb59db5")
    public static ServiceLevelObjective create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ServiceLevelObjective.STEREOTYPE_NAME);
        return ServiceLevelObjective.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ServiceLevelObjective} proxy from a {@link Class} stereotyped << ServiceLevelObjective >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ServiceLevelObjective} proxy or <i>null</i>.
     */
    @objid ("10db99a9-2f7a-43c1-92d8-e4603dc0eb6b")
    public static ServiceLevelObjective instantiate(final Class obj) {
        return ServiceLevelObjective.canInstantiate(obj) ? new ServiceLevelObjective(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ServiceLevelObjective} proxy from a {@link Class} stereotyped << ServiceLevelObjective >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ServiceLevelObjective} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1c1d32fa-43d4-4f31-bb84-afd65da649ae")
    public static ServiceLevelObjective safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ServiceLevelObjective.canInstantiate(obj))
        	return new ServiceLevelObjective(obj);
        else
        	throw new IllegalArgumentException("ServiceLevelObjective: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d946bc62-147e-4c67-90b0-4d899d5fa049")
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
        ServiceLevelObjective other = (ServiceLevelObjective) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'constraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7b6f679b-88a7-4d83-8010-4e3a64c07de9")
    public CamelConstraint getConstraint() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ServiceLevelObjective.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ServiceLevelObjective.MdaTypes.MDAASSOCDEP_ROLE), "constraint")){
                  if (MetricConstraint.canInstantiate(d.getDependsOn()))
                     return (MetricConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeConstraint.canInstantiate(d.getDependsOn()))
                     return (AttributeConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricVariableConstraint.canInstantiate(d.getDependsOn()))
                     return (MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricVariableConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (IfThenConstraint.canInstantiate(d.getDependsOn()))
                     return (IfThenConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), IfThenConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (LogicalConstraint.canInstantiate(d.getDependsOn()))
                     return (LogicalConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LogicalConstraint.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("efc00630-5073-4a98-9ea2-411dd13f3878")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'violationEvent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a44093f0-dc93-4544-8c06-04a4aa72cf4d")
    public Event getViolationEvent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ServiceLevelObjective.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ServiceLevelObjective.MdaTypes.MDAASSOCDEP_ROLE), "violationEvent")){
                  if (BinaryEventPattern.canInstantiate(d.getDependsOn()))
                     return (BinaryEventPattern)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), BinaryEventPattern.MdaTypes.STEREOTYPE_ELT.getName());
                  if (UnaryEventPattern.canInstantiate(d.getDependsOn()))
                     return (UnaryEventPattern)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), UnaryEventPattern.MdaTypes.STEREOTYPE_ELT.getName());
                  if (FunctionalEvent.canInstantiate(d.getDependsOn()))
                     return (FunctionalEvent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FunctionalEvent.MdaTypes.STEREOTYPE_ELT.getName());
                  if (NonFunctionalEvent.canInstantiate(d.getDependsOn()))
                     return (NonFunctionalEvent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), NonFunctionalEvent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("f1aae728-a4c1-491c-ad2d-4401041584a5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'constraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6617747f-8ea4-472d-ae00-5535fd4cf892")
    public void setConstraint(final CamelConstraint obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ServiceLevelObjective.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ServiceLevelObjective.MdaTypes.MDAASSOCDEP_ROLE), "constraint")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ServiceLevelObjective.MdaTypes.MDAASSOCDEP);
              dep.setName("constraint");      dep.putTagValue(ServiceLevelObjective.MdaTypes.MDAASSOCDEP_ROLE, "constraint");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'violationEvent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("920fd930-c782-4de9-9fd5-346954bf4e05")
    public void setViolationEvent(final Event obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ServiceLevelObjective.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ServiceLevelObjective.MdaTypes.MDAASSOCDEP_ROLE), "violationEvent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ServiceLevelObjective.MdaTypes.MDAASSOCDEP);
              dep.setName("violationEvent");      dep.putTagValue(ServiceLevelObjective.MdaTypes.MDAASSOCDEP_ROLE, "violationEvent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("f2a77e68-ba11-4d61-8f8a-6bb4848adc98")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("91570bf5-78c6-40a5-8970-29b8b24dd7b5")
    protected ServiceLevelObjective(final Class elt) {
        super(elt);
    }

    @objid ("798dc94a-b673-4408-9cfc-a760eac81e13")
    public static final class MdaTypes {
        @objid ("7b550830-612e-40f0-8503-8dc26c0d0c31")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f2dc6b44-7047-4798-be1d-3175756cefee")
        private static Stereotype MDAASSOCDEP;

        @objid ("c8ac34f3-90d0-4009-8b0d-3b204b8c1da8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2bab74fa-64cd-4f8d-aa28-ae516f6c0974")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "72de5d29-7d68-48f4-a3ac-eace289da2c6");
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
