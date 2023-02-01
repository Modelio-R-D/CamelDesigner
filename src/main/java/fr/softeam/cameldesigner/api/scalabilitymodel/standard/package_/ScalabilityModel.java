/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram;
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
import org.modelio.metamodel.diagrams.AbstractDiagram;
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
<<<<<<< HEAD
    @objid ("63074352-3311-4765-97f5-6d4f20c3aea5")
=======
    @objid ("d30066e8-4aac-445b-b9b8-ef7880e3b2e7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "ScalabilityModel";

    /**
     * Tells whether a {@link ScalabilityModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ScalabilityModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("b73de0f8-b0aa-4073-af61-16d6d4889fbf")
=======
    @objid ("ee773835-7989-4d3f-bcf5-46df2187b61c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ScalabilityModel >> then instantiate a {@link ScalabilityModel} proxy.
     * 
     * @return a {@link ScalabilityModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("766bf52b-9ed7-43bf-9415-1f161ea9c4e4")
=======
    @objid ("62fa357b-aae5-4c25-bdbb-657a905addbc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a3106b5e-181e-4ff2-b9e7-0fc41fa21d55")
=======
    @objid ("38be380d-dc77-4b4f-b88f-018da5e68f8a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("8b4d2fbd-c875-4e4f-8191-44dd4fbbc8b2")
=======
    @objid ("adee2ce1-0fb5-42c9-9772-372083b4d12a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("220d1921-6df7-4ff1-b991-6d535199a9e4")
=======
    @objid ("e11db643-c527-475d-8e00-140a9d7abcdb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addActions(final ScalingAction obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("73300a70-8119-4ab0-ba5e-dc69f3dcf563")
=======
    @objid ("f18dde4d-d7b9-43c5-a1f1-83caa7859d5d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final ScalabilityModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'eventInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("340bcb84-2fc1-407d-ae75-308060c33204")
=======
    @objid ("e45858f2-559e-4ec4-a1bb-de91c494d8d3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ab62a7a2-d936-4333-8f2d-b78db98262f6")
=======
    @objid ("c30a5a98-3c08-4580-bd6b-94de0efdd573")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("40c0c1b2-8a9b-4d7d-9709-1418ddd684e8")
=======
    @objid ("7c67292f-c851-4c39-8ab7-feabf57a1a09")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d2579c36-6246-45fd-baa1-b1e8ae8a5c57")
=======
    @objid ("b8c4d342-45cc-4347-b041-5906e5457f3a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0e338246-ba19-4fce-b823-19c9e3dcfb31")
=======
    @objid ("167eac14-30aa-4bb1-8bef-98796594cdf6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addTimers(final Timer obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("201b0fa7-9d8d-4ebe-9a90-8466531f998d")
=======
    @objid ("522a9165-4de8-44f0-b3d4-a1ca504bb9d2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("acc767b0-6fcf-4d64-a2e5-06293f855759")
=======
    @objid ("493a9e34-cfc6-43b5-a79c-111ca8414b6b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d4c3905b-7c40-46ed-9f30-fe2416e1a12e")
=======
    @objid ("638de8b7-4030-4e76-8556-a71ed20e0f1e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("4f2f1dbd-45c4-44c9-b960-bed4e672578d")
=======
    @objid ("801f7622-94d8-4c8b-bb20-52d6d8352082")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<ScalabilityModelDiagram> getDiagrams() {
        List<ScalabilityModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (ScalabilityModelDiagram.canInstantiate(mObj))
        			results.add((ScalabilityModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, ScalabilityModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("477152ad-7b17-43ba-b8b9-08eaac241dab")
=======
    @objid ("3e4b9d8b-07ae-4e56-90bf-a312f43e2352")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a38ca106-c372-4f09-beb9-0fc2026233cd")
=======
    @objid ("5210e529-b05a-4cfb-a608-8daef4e64134")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("8fc5f424-c84d-4a77-853e-81223f4266c0")
=======
    @objid ("67387d43-824c-4ea9-8cbd-4c4ad096872f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("9f15b570-357a-48c7-8a68-aa49a878db2f")
=======
    @objid ("16782a93-0fa4-4e66-836e-f1f0840aee6b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("360d32ea-91c5-4f78-a69a-f3f8866bd415")
=======
    @objid ("94418edb-3a19-4d70-8ea3-446ebeba33a6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("213bdd7d-c85d-4662-ab93-f86f25360180")
=======
    @objid ("01341e69-ba47-4e6a-98f5-1be92518e894")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<Timer> getTimers() {
        List<Timer> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Timer.canInstantiate(mObj))
        			results.add((Timer)CamelDesignerProxyFactory.instantiate(mObj, Timer.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("7673c3b8-70c9-40f0-9230-b646d7f72c7e")
=======
    @objid ("ff03d413-d7f5-4a39-8dbc-ded9bfb02733")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d18152e1-0d27-4ad6-b2e9-5ce391bb7a1f")
=======
    @objid ("619335e3-7f2c-4cc3-818d-51a698fa7653")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeActions(final ScalingAction obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("bc529780-747d-4503-afd2-12abeced21dc")
=======
    @objid ("1f440697-c1d7-484b-ac2a-eae5d299852c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final ScalabilityModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'eventInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f2dde3d6-d57f-4a39-9559-03264457194f")
=======
    @objid ("67579052-be40-4367-95cd-1122eb44299a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeEventInstances(final EventInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'events' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a72d7737-2e26-4cf3-81c7-6a8db59a1484")
=======
    @objid ("cc552bcb-240a-4622-9f69-18755a550a39")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeEvents(final SingleEvent obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'patterns' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("0210ac41-3c4c-46a9-8bd7-bf8b8c7a715e")
=======
    @objid ("7ef40624-1a9d-4ad3-9249-0e4bed3dc4b2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removePatterns(final EventPattern obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rules' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("08b2c2c8-0499-4271-966e-8d50f98639d9")
=======
    @objid ("2604f01a-4dbc-4d4c-b017-9480097c0096")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRules(final ScalabilityRule obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'timers' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a8e568aa-7c83-450c-8604-e8cbe8a38e21")
=======
    @objid ("b33c4f74-65ff-483a-83e0-52edb26092e7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeTimers(final Timer obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("d39b5413-4ba6-4511-b023-fea5c5284d85")
=======
    @objid ("fa8d6ef7-0533-435e-ada9-e36cad021ac9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("3446e6dd-0815-41e7-b931-3890ff150e18")
=======
    @objid ("75d92d2d-7b83-4aed-914f-c80faacb799b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ScalabilityModel(final Package elt) {
        super(elt);
    }

    @objid ("c8089b03-881d-4197-88c6-c19a2044ecb8")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("057d82a8-f4e3-41c1-8a61-b60fcda575de")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("55d72fea-cb03-4fce-b5db-ecda481fdd18")
        private static Stereotype MDAASSOCDEP;

        @objid ("b7111ebc-6fe2-482b-9a8e-d4ae085e1316")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3eb05954-e0ab-4531-85e2-3bfd23c4d110")
=======
        @objid ("36a396bc-f57e-401b-b75f-748dc1991661")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0568aa5b-dd8b-4b5c-87f9-70b309eb5918")
        private static Stereotype MDAASSOCDEP;

        @objid ("019f93d7-fb30-4a21-90b2-fde313b1d9f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f6236c5-37ea-43cc-86bd-f350f6c5a1b5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
