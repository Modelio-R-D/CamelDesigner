/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.EventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.SingleEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << ScalabilityModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("aa6941bf-42c8-468d-869b-0d991fac6251")
public class ScalabilityModel extends SubModel {
    @objid ("c946328d-42bf-48a3-81e5-4c587df10292")
    public static final String STEREOTYPE_NAME = "ScalabilityModel";

    /**
     * Tells whether a {@link ScalabilityModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ScalabilityModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f7807186-e54b-45d5-bf78-72c481498eae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ScalabilityModel >> then instantiate a {@link ScalabilityModel} proxy.
     * 
     * @return a {@link ScalabilityModel} proxy on the created {@link Package}.
     */
    @objid ("a9d07446-0228-403f-8aae-987a7857d6d2")
    public static ScalabilityModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModel.STEREOTYPE_NAME);
        return ScalabilityModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ScalabilityModel} proxy from a {@link Package} stereotyped << ScalabilityModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link ScalabilityModel} proxy or <i>null</i>.
     */
    @objid ("dacfdeb9-da18-40aa-8e58-d25b54b97e5e")
    public static ScalabilityModel instantiate(final Package obj) {
        return ScalabilityModel.canInstantiate(obj) ? new ScalabilityModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ScalabilityModel} proxy from a {@link Package} stereotyped << ScalabilityModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link ScalabilityModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5eb401d1-1ce8-4b24-b2a4-e1b5e41827cc")
    public static ScalabilityModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ScalabilityModel.canInstantiate(obj))
        	return new ScalabilityModel(obj);
        else
        	throw new IllegalArgumentException("ScalabilityModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'actions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4ca41883-64e0-4d6b-8bdd-e7c78b39ddd6")
    public void addActions(final ScalingAction obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'eventInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("46e137e8-71a4-4a7b-94eb-8bb965c96852")
    public void addEventInstances(final EventInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'events' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("017fee60-cca2-4dce-8fa5-574fca2a71bc")
    public void addEvents(final SingleEvent obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'patterns' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("85669bf7-dd6f-4580-9c85-14a5e486a417")
    public void addPatterns(final EventPattern obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'rules' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3d538298-65bd-4b10-a8c7-6b619516d367")
    public void addRules(final ScalabilityRule obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'timers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4bfdb2e1-c568-47da-a754-1a6da1baa09b")
    public void addTimers(final Timer obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("00021b1c-effb-4a7e-9f42-369b399b2b4f")
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
        ScalabilityModel other = (ScalabilityModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'actions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8ae0bb10-d28b-4488-bf12-9c538d3e0442")
    public List<ScalingAction> getActions() {
        List<ScalingAction> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (HorizontalScalingAction.canInstantiate(mObj))
        			results.add((HorizontalScalingAction)CamelDesignerProxyFactory.instantiate(mObj, HorizontalScalingAction.STEREOTYPE_NAME));
        	if (VerticalScalingAction.canInstantiate(mObj))
        			results.add((VerticalScalingAction)CamelDesignerProxyFactory.instantiate(mObj, VerticalScalingAction.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("38b80c96-cca4-4970-995b-af615359e8bf")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("1c954435-d535-46c0-9047-9689b3e9ce1f")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'eventInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f28fd5b5-aab8-44dc-8572-4e19c2e603e6")
    public List<EventInstance> getEventInstances() {
        List<EventInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (FunctionalEventInstance.canInstantiate(mObj))
        			results.add((FunctionalEventInstance)CamelDesignerProxyFactory.instantiate(mObj, FunctionalEventInstance.STEREOTYPE_NAME));
        	if (NonFunctionalEventInstance.canInstantiate(mObj))
        			results.add((NonFunctionalEventInstance)CamelDesignerProxyFactory.instantiate(mObj, NonFunctionalEventInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'events' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("12ed51a6-aead-4a7d-af4a-1b00a1060bae")
    public List<SingleEvent> getEvents() {
        List<SingleEvent> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (FunctionalEvent.canInstantiate(mObj))
        			results.add((FunctionalEvent)CamelDesignerProxyFactory.instantiate(mObj, FunctionalEvent.STEREOTYPE_NAME));
        	if (NonFunctionalEvent.canInstantiate(mObj))
        			results.add((NonFunctionalEvent)CamelDesignerProxyFactory.instantiate(mObj, NonFunctionalEvent.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'patterns' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("440fdf10-aab7-49e2-a387-a89384d7ae4b")
    public List<EventPattern> getPatterns() {
        List<EventPattern> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (BinaryEventPattern.canInstantiate(mObj))
        			results.add((BinaryEventPattern)CamelDesignerProxyFactory.instantiate(mObj, BinaryEventPattern.STEREOTYPE_NAME));
        	if (UnaryEventPattern.canInstantiate(mObj))
        			results.add((UnaryEventPattern)CamelDesignerProxyFactory.instantiate(mObj, UnaryEventPattern.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'rules' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("596838a3-6cc4-459c-8d9a-4c13ca9c70c6")
    public List<ScalabilityRule> getRules() {
        List<ScalabilityRule> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (ScalabilityRule.canInstantiate(mObj))
        			results.add((ScalabilityRule)CamelDesignerProxyFactory.instantiate(mObj, ScalabilityRule.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'timers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("96538974-1daa-4cab-b9b3-faf2f05dc394")
    public List<Timer> getTimers() {
        List<Timer> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Timer.canInstantiate(mObj))
        			results.add((Timer)CamelDesignerProxyFactory.instantiate(mObj, Timer.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("62b7d1bf-993a-4126-912d-44ba32389936")
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
    @objid ("404899eb-3c34-4c21-995a-ce7832a90bc2")
    public boolean removeActions(final ScalingAction obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'eventInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("33ab14bd-2f0e-42a5-90eb-521ff7ff057b")
    public boolean removeEventInstances(final EventInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'events' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ffc690c0-128d-452b-976e-c34690d9c7be")
    public boolean removeEvents(final SingleEvent obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'patterns' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ce679332-9b44-4bad-be7d-72336f64ef8e")
    public boolean removePatterns(final EventPattern obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rules' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d963278e-932c-4f39-a1c5-ae1b231c6878")
    public boolean removeRules(final ScalabilityRule obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'timers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("75992194-7519-411d-b4e8-baffc6ae3c61")
    public boolean removeTimers(final Timer obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("de8cca23-f42c-4b52-825b-87b6af6fd9ed")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("3ab9a526-529d-4cc8-8acb-355918241d45")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("abea075a-19d9-41f2-82c7-3d16390dd24b")
    protected ScalabilityModel(final Package elt) {
        super(elt);
    }

    @objid ("c8089b03-881d-4197-88c6-c19a2044ecb8")
    public static final class MdaTypes {
        @objid ("a3fd9681-d7e4-493a-849e-0b9f05e76dc6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0fb06d6d-8914-45ac-af58-c6080d3803ac")
        private static Stereotype MDAASSOCDEP;

        @objid ("4be08825-fe69-476e-92bf-9bc398b39f7d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b04dd30a-e40c-4ec2-911b-1e822f2e3be5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0e1f4eeb-63ca-467d-b99c-92a54f34fcb5");
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
