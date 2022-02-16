/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("e0a21110-722c-43f6-8560-4fe75b571236")
    public static final String STEREOTYPE_NAME = "ScalabilityModel";

    /**
     * Tells whether a {@link ScalabilityModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ScalabilityModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("47da5822-f95a-4354-9a97-7054a9cab8fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ScalabilityModel >> then instantiate a {@link ScalabilityModel} proxy.
     * 
     * @return a {@link ScalabilityModel} proxy on the created {@link Package}.
     */
    @objid ("49e4be86-4aaa-474c-ae19-b22a2b4b25c7")
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
    @objid ("072f7dc4-8a7c-469c-97da-646d153dd3d1")
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
    @objid ("eaac5a92-fac1-4122-86d7-70790e5e5e8c")
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
    @objid ("0dad19f3-abad-4343-a306-166f6b2d9da7")
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
    @objid ("a9447c94-47fd-47a1-bf9a-c2733957fc5f")
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
    @objid ("97f9c237-d935-4c40-b249-9c63b8b7ac04")
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
    @objid ("4ef4793f-acb7-42af-b580-cdc1b15ce0b6")
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
    @objid ("dfefc5a0-f5cf-428f-9970-9228517bc934")
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
    @objid ("cffa98e7-9ed0-4cd3-96e1-74c3ef299a1f")
    public void addTimers(final Timer obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("aa95f24b-ad97-4774-9ee8-a73d1a03a325")
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
    @objid ("aa496651-6b93-4c7b-999a-d2e5095169be")
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
    @objid ("5ef3caa0-2010-4a29-b5fb-44e72ec21f47")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("729a6ac1-5fd8-49bd-b100-d176a9bb33b1")
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
    @objid ("ce5ac54f-184f-477c-a771-b205f4cb1775")
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
    @objid ("cd348ade-9129-4463-8bc5-554438d0cfab")
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
    @objid ("709f3f81-faa2-415b-a3f5-87374798e788")
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
    @objid ("c2b57076-b9a9-46a5-9e8f-5c960ca61693")
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
    @objid ("9e347d5d-91ee-40c5-a9c2-a80b280bede2")
    public List<Timer> getTimers() {
        List<Timer> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Timer.canInstantiate(mObj))
        			results.add((Timer)CamelDesignerProxyFactory.instantiate(mObj, Timer.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("c3dccb36-8ff3-432c-bc35-b5bb7abc13fa")
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
    @objid ("0bb0bbd4-a2d5-40b3-90a8-d948362534a2")
    public boolean removeActions(final ScalingAction obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'eventInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d35a1d1c-072d-4e80-89f6-d915ca3c7b0c")
    public boolean removeEventInstances(final EventInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'events' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("42853666-75dd-4c24-a281-64d91bbf2f3b")
    public boolean removeEvents(final SingleEvent obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'patterns' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4e3705cd-8748-4b4c-b29f-c50ef30ab8bc")
    public boolean removePatterns(final EventPattern obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rules' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("91a22056-57e4-405d-9504-76e6d4acb373")
    public boolean removeRules(final ScalabilityRule obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'timers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("467db7a0-b941-4ed7-877f-f31e0163e1aa")
    public boolean removeTimers(final Timer obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0e18624f-f281-4ac9-b4f4-95148fbb30eb")
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

    @objid ("c9cc6fa2-4501-4efa-a3be-d06663c15443")
    protected ScalabilityModel(final Package elt) {
        super(elt);
    }

    @objid ("c8089b03-881d-4197-88c6-c19a2044ecb8")
    public static final class MdaTypes {
        @objid ("ee0a1e79-10f1-43ab-85e4-8762296bb3af")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("45285190-ecf9-47b3-8e40-7ed40d9fe539")
        private static Stereotype MDAASSOCDEP;

        @objid ("fed0dba8-98d5-4542-8e9e-8f06a4b733a3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9fbdef4f-8a0c-4dc6-aca0-64bea1a4b992")
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
