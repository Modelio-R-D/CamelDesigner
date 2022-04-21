/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("5a5a6896-f569-46cf-b431-8f345c09ae90")
    public static final String STEREOTYPE_NAME = "ScalabilityModel";

    /**
     * Tells whether a {@link ScalabilityModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ScalabilityModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("85736ff2-bb79-4e85-b01f-95280651a91f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ScalabilityModel >> then instantiate a {@link ScalabilityModel} proxy.
     * 
     * @return a {@link ScalabilityModel} proxy on the created {@link Package}.
     */
    @objid ("3ce8891f-bb66-41a2-983f-f67f4c574198")
    public static ScalabilityModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModel.STEREOTYPE_NAME);
        return ScalabilityModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ScalabilityModel} proxy from a {@link Package} stereotyped << ScalabilityModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link ScalabilityModel} proxy or <i>null</i>.
     */
    @objid ("1d41e9a4-5b29-45dd-b203-fd089fe508e5")
    public static ScalabilityModel instantiate(final Package obj) {
        return ScalabilityModel.canInstantiate(obj) ? new ScalabilityModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ScalabilityModel} proxy from a {@link Package} stereotyped << ScalabilityModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link ScalabilityModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("81745233-c763-4352-8b0c-565b9ab56942")
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
     */
    @objid ("80b2caec-861f-46e2-9747-1773b047b6e4")
    public void addActions(final ScalingAction obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'eventInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("24e42777-3434-40ea-8bfc-bc3e41d8c0d3")
    public void addEventInstances(final EventInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'events' role.<p>
     * Role description:
     * null
     */
    @objid ("2131fdda-c042-4971-8469-6695f1c9c266")
    public void addEvents(final SingleEvent obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'patterns' role.<p>
     * Role description:
     * null
     */
    @objid ("f8e50755-1b94-4179-b85e-ef9d08a44fa3")
    public void addPatterns(final EventPattern obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'rules' role.<p>
     * Role description:
     * null
     */
    @objid ("c8c1b679-47a1-4abe-b5e3-0eefe248a0d9")
    public void addRules(final ScalabilityRule obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'timers' role.<p>
     * Role description:
     * null
     */
    @objid ("982be382-c5d3-46cc-a435-175e0c66dea5")
    public void addTimers(final Timer obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("6a143188-1e53-4840-8fc7-df511cfce9d8")
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
     */
    @objid ("c3cbcc40-d094-4e2a-8cbc-0d7c5692d075")
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
     */
    @objid ("9120cb87-500b-4a0e-8b0c-6ae0e4a2f4f1")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("09fc0c59-fa9c-4553-8b1a-8e1a59eadd9d")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'eventInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("002b4d0c-db4c-4282-ac65-98cfc4443ac0")
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
     */
    @objid ("43035ec9-f629-4fe6-b656-365cc7db8ebc")
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
     */
    @objid ("d7ce1e24-dc5c-49b8-9355-b96ca773f88d")
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
     */
    @objid ("6431ff77-4e74-4168-8e35-c436b25095da")
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
     */
    @objid ("af6644cf-2826-4e8c-8104-3d30204e12fb")
    public List<Timer> getTimers() {
        List<Timer> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (Timer.canInstantiate(mObj))
                    results.add((Timer)CamelDesignerProxyFactory.instantiate(mObj, Timer.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    @objid ("f54cb80b-fcf8-41ab-86a7-448916a36746")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'actions' role.<p>
     * Role description:
     * null
     */
    @objid ("9379f1d8-5901-4aef-a825-cacf5def1df3")
    public boolean removeActions(final ScalingAction obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'eventInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("30f4c319-05a7-4761-b82f-1304f054706c")
    public boolean removeEventInstances(final EventInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'events' role.<p>
     * Role description:
     * null
     */
    @objid ("6f730c79-747d-4996-ba83-1438b990019f")
    public boolean removeEvents(final SingleEvent obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'patterns' role.<p>
     * Role description:
     * null
     */
    @objid ("cdd32509-bd00-4d56-aeec-e563ae8c5eeb")
    public boolean removePatterns(final EventPattern obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rules' role.<p>
     * Role description:
     * null
     */
    @objid ("e386f656-27d6-41a5-83e2-bf254f4282bb")
    public boolean removeRules(final ScalabilityRule obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'timers' role.<p>
     * Role description:
     * null
     */
    @objid ("0b432d1c-3402-400c-bf89-c302d7c65871")
    public boolean removeTimers(final Timer obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("a994773d-868d-456a-a416-5c0f809612d3")
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

    @objid ("98e67486-a7a8-43cc-baff-9bed7ca7e082")
    protected ScalabilityModel(final Package elt) {
        super(elt);
    }

    @objid ("c8089b03-881d-4197-88c6-c19a2044ecb8")
    public static final class MdaTypes {
        @objid ("62d0e8ed-098e-457e-a0ee-1a3d4e24c176")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ed9840b5-4261-4d44-8ff4-774a9449497c")
        private static Stereotype MDAASSOCDEP;

        @objid ("5678b677-4e47-48fe-b453-3a0831629f76")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ffc9f2f6-6128-49f2-a0a6-b59a20dbd34a")
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
