/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("f1f3a97d-4afa-4502-811f-c042cfcd5d0b")
    public static final String STEREOTYPE_NAME = "ScalabilityModel";

    /**
     * Tells whether a {@link ScalabilityModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ScalabilityModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0c45ae71-7cb0-45b3-85fe-1793c4978c56")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ScalabilityModel >> then instantiate a {@link ScalabilityModel} proxy.
     * 
     * @return a {@link ScalabilityModel} proxy on the created {@link Package}.
     */
    @objid ("0029c336-a002-485d-ba3f-0223024e3a7e")
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
    @objid ("b9079073-3b00-4be5-a2ce-0c65541fd4e3")
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
    @objid ("d799c6da-3286-4edf-b2ef-0a1cd4f4bc6e")
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
    @objid ("6217ee07-30c5-4116-a631-a19a13b82516")
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
    @objid ("cb1a7f1d-73d8-4601-8416-d68633de1e0d")
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
    @objid ("7239f12f-6414-4e4e-8133-df031614045e")
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
    @objid ("3df87f07-2a27-4475-923f-af1984e019fd")
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
    @objid ("1cb145c6-1f25-4f58-8840-a6f943ae2020")
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
    @objid ("4a127ebc-733c-4308-8c52-afc9c8b1e4f7")
    public void addTimers(final Timer obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("460fae8b-b766-40db-8bea-eb98498cab22")
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
    @objid ("64f53118-5e87-44db-8764-15eb91719728")
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
    @objid ("606d1717-27bf-4832-8ef4-261ca11f433f")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("b291ab14-6b19-4d7c-ae52-302d45447ffa")
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
    @objid ("8c1ab768-87ed-457c-807b-b58a048deb0b")
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
    @objid ("4cdf4c0c-6da9-470a-93f4-8e323424b803")
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
    @objid ("45f4a55a-5325-4cd5-b720-2e0ecdb6780b")
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
    @objid ("1fbfaa6e-9343-4023-a04e-6051f3e63d27")
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
    @objid ("0cdaeb49-1c04-4cac-b000-62866c1d815a")
    public List<Timer> getTimers() {
        List<Timer> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Timer.canInstantiate(mObj))
        			results.add((Timer)CamelDesignerProxyFactory.instantiate(mObj, Timer.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("7e2b73c1-9f3f-42b8-ad8f-2361b2479c44")
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
    @objid ("05f0ff93-233d-42f7-ab93-cc6b97e9ad32")
    public boolean removeActions(final ScalingAction obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'eventInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cfdef704-8607-4475-97fd-df3f6956b799")
    public boolean removeEventInstances(final EventInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'events' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f7fc288d-ba2e-4243-aa25-fa56587c05d2")
    public boolean removeEvents(final SingleEvent obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'patterns' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2b39ecab-a8f0-4e80-859c-2f35d2dcb5d0")
    public boolean removePatterns(final EventPattern obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rules' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("16413b98-0a81-470c-a1f2-67096801311c")
    public boolean removeRules(final ScalabilityRule obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'timers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0a22f4fb-68b4-4928-8fdd-66a4314e71ad")
    public boolean removeTimers(final Timer obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("090bdc7d-3662-4996-9740-f7b83d7ea802")
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

    @objid ("d5bf9b24-050e-4ac9-97fc-5dadd2c3e513")
    protected ScalabilityModel(final Package elt) {
        super(elt);
    }

    @objid ("c8089b03-881d-4197-88c6-c19a2044ecb8")
    public static final class MdaTypes {
        @objid ("950a7123-ae93-4dd2-b58a-071d4cb92259")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c76b1b41-536e-45ae-ac5b-c68f98d7f3ea")
        private static Stereotype MDAASSOCDEP;

        @objid ("80917ab2-bbc1-462c-82d6-0159cfcda099")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ceba670-83f2-40d8-80a5-b4591f42f795")
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
