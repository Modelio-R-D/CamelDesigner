/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("ded41b2c-7775-4eca-8003-7bf4cb294262")
    public static final String STEREOTYPE_NAME = "ScalabilityRule";

    /**
     * Tells whether a {@link ScalabilityRule proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ScalabilityRule >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3b7dc924-c514-4ea4-aa52-db1d7438184f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityRule.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ScalabilityRule >> then instantiate a {@link ScalabilityRule} proxy.
     * 
     * @return a {@link ScalabilityRule} proxy on the created {@link Class}.
     */
    @objid ("f21d6212-dd4a-41ba-91cc-321840ed6ce5")
    public static ScalabilityRule create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityRule.STEREOTYPE_NAME);
        return ScalabilityRule.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ScalabilityRule} proxy from a {@link Class} stereotyped << ScalabilityRule >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ScalabilityRule} proxy or <i>null</i>.
     */
    @objid ("6ad7c0f9-1176-49cd-880f-0ea41b90fa03")
    public static ScalabilityRule instantiate(final Class obj) {
        return ScalabilityRule.canInstantiate(obj) ? new ScalabilityRule(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ScalabilityRule} proxy from a {@link Class} stereotyped << ScalabilityRule >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ScalabilityRule} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c38fcc45-495b-4637-868e-963f329b8fc1")
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
     */
    @objid ("df214615-bc16-408b-ba97-0a9f6d127463")
    public void addActions(final Action obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ScalabilityRule.MdaTypes.MDAASSOCDEP);
            d.setName("actions");
            d.putTagValue(ScalabilityRule.MdaTypes.MDAASSOCDEP_ROLE, "actions");
        }
    }

    @objid ("2feb8b99-2926-4d31-a244-29560cab7940")
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
     */
    @objid ("ec594c0e-9315-424d-82bd-584be8e7ea35")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("c59b3140-e4ee-4598-9a09-9a44a6f9b1f8")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'event' role.<p>
     * Role description:
     * null
     */
    @objid ("1f7ee83a-9bf3-4ba1-b3d7-d847fa2ee869")
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

    @objid ("1dde4905-7b7c-401b-80bc-ec4d376f5eb4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'actions' role.<p>
     * Role description:
     * null
     */
    @objid ("c1401119-3a5f-4aae-a0ad-51a8aaabd0ed")
    public boolean removeActions(final Action obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ScalabilityRule.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ScalabilityRule.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
     */
    @objid ("4e2f3411-8c16-474e-965b-b145a21fb53b")
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

    @objid ("a263c8ab-0e50-4047-9c41-d4d61c100f22")
    protected ScalabilityRule(final Class elt) {
        super(elt);
    }

    @objid ("d6312fb9-a345-484c-b4fc-57f81b6fe120")
    public static final class MdaTypes {
        @objid ("bdeb1120-7794-4592-8b56-62a58667859b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("203729df-ef94-44fb-9782-73f1fd4021cc")
        private static Stereotype MDAASSOCDEP;

        @objid ("23ceb847-d8c0-4319-a060-6fd6880cc14d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6bcba21d-a5af-4f80-9427-48721ee9d921")
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
