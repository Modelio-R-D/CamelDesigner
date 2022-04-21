/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << RequirementModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("12da9c0b-7f68-4c3c-abc2-84b8c9b97aaa")
public class RequirementModel extends SubModel {
    @objid ("9127c2ec-ca06-4d47-9eb1-f37490cc978d")
    public static final String STEREOTYPE_NAME = "RequirementModel";

    /**
     * Tells whether a {@link RequirementModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << RequirementModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5ac507d3-47d8-485b-a8ea-d81c1d2f0792")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << RequirementModel >> then instantiate a {@link RequirementModel} proxy.
     * 
     * @return a {@link RequirementModel} proxy on the created {@link Package}.
     */
    @objid ("b33ab76c-2e9d-4b89-bc04-114aea582275")
    public static RequirementModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RequirementModel.STEREOTYPE_NAME);
        return RequirementModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link RequirementModel} proxy from a {@link Package} stereotyped << RequirementModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link RequirementModel} proxy or <i>null</i>.
     */
    @objid ("f4623bf3-becb-4eef-8e22-deff7d35cd43")
    public static RequirementModel instantiate(final Package obj) {
        return RequirementModel.canInstantiate(obj) ? new RequirementModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementModel} proxy from a {@link Package} stereotyped << RequirementModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link RequirementModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2a29b38c-c87c-4d85-9a2d-b6ae7bc08bc9")
    public static RequirementModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (RequirementModel.canInstantiate(obj))
            return new RequirementModel(obj);
        else
            throw new IllegalArgumentException("RequirementModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'requirements' role.<p>
     * Role description:
     * null
     */
    @objid ("300b21ea-4d06-4bbf-8805-a3c5ee3f7bfb")
    public void addRequirements(final Requirement obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("b593360d-0a21-4d76-8796-103094b7eb81")
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
        RequirementModel other = (RequirementModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("332d4233-c419-4bd5-b581-793ad7c61604")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("3bc6dc68-81de-4a49-a444-c693019c8438")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'requirements' role.<p>
     * Role description:
     * null
     */
    @objid ("455b1960-8ad2-48d5-b0ee-3c1ea88d26fa")
    public List<Requirement> getRequirements() {
        List<Requirement> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (ImageRequirement.canInstantiate(mObj))
                    results.add((ImageRequirement)CamelDesignerProxyFactory.instantiate(mObj, ImageRequirement.STEREOTYPE_NAME));
            if (LocationRequirement.canInstantiate(mObj))
                    results.add((LocationRequirement)CamelDesignerProxyFactory.instantiate(mObj, LocationRequirement.STEREOTYPE_NAME));
            if (OSRequirement.canInstantiate(mObj))
                    results.add((OSRequirement)CamelDesignerProxyFactory.instantiate(mObj, OSRequirement.STEREOTYPE_NAME));
            if (PaaSRequirement.canInstantiate(mObj))
                    results.add((PaaSRequirement)CamelDesignerProxyFactory.instantiate(mObj, PaaSRequirement.STEREOTYPE_NAME));
            if (ProviderRequirement.canInstantiate(mObj))
                    results.add((ProviderRequirement)CamelDesignerProxyFactory.instantiate(mObj, ProviderRequirement.STEREOTYPE_NAME));
            if (ResourceRequirement.canInstantiate(mObj))
                    results.add((ResourceRequirement)CamelDesignerProxyFactory.instantiate(mObj, ResourceRequirement.STEREOTYPE_NAME));
            if (HorizontalScaleRequirement.canInstantiate(mObj))
                    results.add((HorizontalScaleRequirement)CamelDesignerProxyFactory.instantiate(mObj, HorizontalScaleRequirement.STEREOTYPE_NAME));
            if (VerticalScaleRequirement.canInstantiate(mObj))
                    results.add((VerticalScaleRequirement)CamelDesignerProxyFactory.instantiate(mObj, VerticalScaleRequirement.STEREOTYPE_NAME));
            if (SecurityRequirement.canInstantiate(mObj))
                    results.add((SecurityRequirement)CamelDesignerProxyFactory.instantiate(mObj, SecurityRequirement.STEREOTYPE_NAME));
            if (SecuritySLO.canInstantiate(mObj))
                    results.add((SecuritySLO)CamelDesignerProxyFactory.instantiate(mObj, SecuritySLO.STEREOTYPE_NAME));
            if (ServiceLevelObjective.canInstantiate(mObj))
                    results.add((ServiceLevelObjective)CamelDesignerProxyFactory.instantiate(mObj, ServiceLevelObjective.STEREOTYPE_NAME));
            if (OptimisationRequirement.canInstantiate(mObj))
                    results.add((OptimisationRequirement)CamelDesignerProxyFactory.instantiate(mObj, OptimisationRequirement.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    @objid ("0b34a6e6-1eac-44dc-bb26-afa9aa2184ea")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'requirements' role.<p>
     * Role description:
     * null
     */
    @objid ("029eaf90-bb5b-43b2-a7b3-a5b02e4991eb")
    public boolean removeRequirements(final Requirement obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("431de232-810d-49d9-970d-a6c8b9f6a44f")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("26c99be5-cabf-4a9c-905e-7df442f59679")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getHorizontalScaleRequirements());
        result.addAll(getImageRequirements());
        result.addAll(getLocationRequirements());
        result.addAll(getOptimisationRequirements());
        result.addAll(getProviderRequirements());
        result.addAll(getResourceRequirements());
        result.addAll(getSLOs());
        return result;
    }

    @objid ("f0970245-dc85-488b-866d-44e7891ffb28")
    public Collection<HorizontalScaleRequirement> getHorizontalScaleRequirements() {
        List<HorizontalScaleRequirement> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (HorizontalScaleRequirement.canInstantiate(mObj))
                results.add(HorizontalScaleRequirement.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("dc72ea09-daaf-4ef4-ba49-1fb086af62d1")
    public Collection<ImageRequirement> getImageRequirements() {
        List<ImageRequirement> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (ImageRequirement.canInstantiate(mObj))
                results.add(ImageRequirement.safeInstantiate((Enumeration) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("e5d253e4-6ffd-4d91-9d43-47d63d1a32f0")
    public Collection<LocationRequirement> getLocationRequirements() {
        List<LocationRequirement> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (LocationRequirement.canInstantiate(mObj))
                results.add(LocationRequirement.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("1fb8ab7e-bf53-4094-950b-016273890143")
    public Collection<OptimisationRequirement> getOptimisationRequirements() {
        List<OptimisationRequirement> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (OptimisationRequirement.canInstantiate(mObj))
                results.add(OptimisationRequirement.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("a3e8d791-a40d-47c5-bed2-60ab2a109395")
    public Collection<ProviderRequirement> getProviderRequirements() {
        List<ProviderRequirement> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (ProviderRequirement.canInstantiate(mObj))
                results.add(ProviderRequirement.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("fb973444-86de-493e-be59-06447cbae132")
    public Collection<ResourceRequirement> getResourceRequirements() {
        List<ResourceRequirement> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (ResourceRequirement.canInstantiate(mObj))
                results.add(ResourceRequirement.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("d6b56f89-d3e3-404d-af3a-5efe3cdfc56b")
    public Collection<ServiceLevelObjective> getSLOs() {
        List<ServiceLevelObjective> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (ServiceLevelObjective.canInstantiate(mObj))
                results.add(ServiceLevelObjective.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("296448e7-79e9-46fa-9f64-996ce9848e07")
    protected RequirementModel(final Package elt) {
        super(elt);
    }

    @objid ("cda79ab4-0c73-48f6-9745-469f013ec194")
    public static final class MdaTypes {
        @objid ("584024a2-a7f8-4477-8f20-b5efbf47629e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("114d32bd-6934-4c25-85fe-fce4876b22c2")
        private static Stereotype MDAASSOCDEP;

        @objid ("0c7dde12-fc3c-414a-9f95-8058096e8d6f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b826f253-d435-4352-8103-087458c7c1cb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a6bb7236-ef3d-41b8-a879-26c642be9cb8");
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
