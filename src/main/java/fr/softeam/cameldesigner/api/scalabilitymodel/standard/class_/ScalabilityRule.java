/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("33e9439b-2780-4184-ab4e-a9cee93dde01")
    public static final String STEREOTYPE_NAME = "ScalabilityRule";

    /**
     * Tells whether a {@link ScalabilityRule proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ScalabilityRule >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ffb7e7ef-e1f8-4717-aa4b-892fa4e2cf25")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityRule.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ScalabilityRule >> then instantiate a {@link ScalabilityRule} proxy.
     * 
     * @return a {@link ScalabilityRule} proxy on the created {@link Class}.
     */
    @objid ("a1b088da-bb39-45f2-89d7-828538fcb595")
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
    @objid ("48f6cb58-1956-416c-ba6a-ed394c66f85b")
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
    @objid ("5648cb86-6b7c-466b-9190-974b10525381")
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
    @objid ("23def4ff-bf6a-4a22-95d9-bbd076ce3fcc")
    public void addActions(final Action obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ScalabilityRule.MdaTypes.MDAASSOCDEP);
            d.setName("actions");
            d.putTagValue(ScalabilityRule.MdaTypes.MDAASSOCDEP_ROLE, "actions");
        }
    }

    @objid ("8b39f3d8-7a94-426f-8c9f-4e91f286365b")
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
    @objid ("cfc4bc74-fa93-4cda-9ad8-36c2b559d28b")
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
    @objid ("af3448df-4971-4d95-866c-bb5759ac161a")
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
    @objid ("d83cdced-01c0-434f-b64f-e949d0b562a8")
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

    @objid ("9b31048c-a4d5-4def-a805-39a89604ecc1")
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
    @objid ("52b5a974-5e43-4db2-a330-e75e78d6a30d")
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
    @objid ("b2657eb7-6855-4395-860b-ad55f5f4d76b")
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

    @objid ("2e0b6c76-ce82-49fd-89dc-ada2c6430dd8")
    protected ScalabilityRule(final Class elt) {
        super(elt);
    }

    @objid ("d6312fb9-a345-484c-b4fc-57f81b6fe120")
    public static final class MdaTypes {
        @objid ("9e81ce54-a853-489e-99a1-ae824f780ceb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2eb2cf99-a471-4b2f-9d3d-9965a4a7c02d")
        private static Stereotype MDAASSOCDEP;

        @objid ("c4dcc30c-926e-415e-ac89-cfdadc5fc24a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("776bea84-37a4-427e-b2bf-0fb32f789d06")
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
