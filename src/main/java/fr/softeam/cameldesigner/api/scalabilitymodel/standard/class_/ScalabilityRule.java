/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction;
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
 * Proxy class to handle a {@link Class} with << ScalabilityRule >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8af1d7c2-a602-48ad-a7fe-b5775f92342e")
public class ScalabilityRule extends FeatureClass {
    @objid ("bbbc679b-4fb0-434b-a96f-c960314db991")
    public static final String STEREOTYPE_NAME = "ScalabilityRule";

    /**
     * Tells whether a {@link ScalabilityRule proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ScalabilityRule >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("771381bc-6b46-466e-bb00-4f47aa6764ae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityRule.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ScalabilityRule >> then instantiate a {@link ScalabilityRule} proxy.
     * 
     * @return a {@link ScalabilityRule} proxy on the created {@link Class}.
     */
    @objid ("aa59738e-aa2c-4234-8050-53dcdd279ce2")
    public static ScalabilityRule create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityRule.STEREOTYPE_NAME);
        return ScalabilityRule.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ScalabilityRule} proxy from a {@link Class} stereotyped << ScalabilityRule >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ScalabilityRule} proxy or <i>null</i>.
     */
    @objid ("f7294fa7-5036-442e-98d8-b2b86b1f8fa4")
    public static ScalabilityRule instantiate(final Class obj) {
        return ScalabilityRule.canInstantiate(obj) ? new ScalabilityRule(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ScalabilityRule} proxy from a {@link Class} stereotyped << ScalabilityRule >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ScalabilityRule} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4d65582d-918b-414d-a0d4-7a4c636054ee")
    public static ScalabilityRule safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ScalabilityRule.canInstantiate(obj))
        	return new ScalabilityRule(obj);
        else
        	throw new IllegalArgumentException("ScalabilityRule: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'actions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6ae51088-4d25-4a83-bed4-20dadbc6a02f")
    public void addActions(final Action obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ScalabilityRule.MdaTypes.MDAASSOCDEP);
            d.setName("actions");
            d.putTagValue(ScalabilityRule.MdaTypes.MDAASSOCDEP_ROLE, "actions");
        }
    }

    @objid ("ea2523f4-36ee-406c-ac13-a7cdf59ccfda")
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
        ScalabilityRule other = (ScalabilityRule) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'actions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f57ddad6-d0a1-4bb0-8953-92733ba116c2")
    public List<Action> getActions() {
        List<Action> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(ScalabilityRule.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ScalabilityRule.MdaTypes.MDAASSOCDEP_ROLE), "actions")){
              if (HorizontalScalingAction.canInstantiate(d.getDependsOn()))
                results.add((HorizontalScalingAction)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HorizontalScalingAction.MdaTypes.STEREOTYPE_ELT.getName()));
              if (VerticalScalingAction.canInstantiate(d.getDependsOn()))
                results.add((VerticalScalingAction)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VerticalScalingAction.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("7af036b0-ea7e-405b-b5cf-68e26750b7eb")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'event' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cedbe236-237e-47ea-a5a9-fecdb0da2271")
    public Event getEvent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ScalabilityRule.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ScalabilityRule.MdaTypes.MDAASSOCDEP_ROLE), "event")){
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

    @objid ("3cd4adf0-e7be-45e3-a3f3-9d84e44bd9c8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'actions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("48640133-cef2-441c-83cb-474d225e7446")
    public boolean removeActions(final Action obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ScalabilityRule.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ScalabilityRule.MdaTypes.MDAASSOCDEP_ROLE), "actions")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'event' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("35415e47-cf27-413c-b147-6b03163b735e")
    public void setEvent(final Event obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ScalabilityRule.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ScalabilityRule.MdaTypes.MDAASSOCDEP_ROLE), "event")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ScalabilityRule.MdaTypes.MDAASSOCDEP);
              dep.setName("event");      dep.putTagValue(ScalabilityRule.MdaTypes.MDAASSOCDEP_ROLE, "event");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("12e633b8-7a18-4164-9660-129b01908ce2")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("40911417-a83f-4370-8453-3dac006e5e5b")
    protected ScalabilityRule(final Class elt) {
        super(elt);
    }

    @objid ("d6312fb9-a345-484c-b4fc-57f81b6fe120")
    public static final class MdaTypes {
        @objid ("bbacc601-ab49-4f0e-add9-c0f2152d7a6e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eb4224f1-5f7e-4f41-8afb-15cac986b509")
        private static Stereotype MDAASSOCDEP;

        @objid ("7a10c914-c0c2-4c4d-84e8-acdd01c067ed")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8010602d-8e16-4fc5-98f8-510b54152416")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cf2a4cc5-0c2d-4f57-9f3e-35cf455ef4cb");
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
