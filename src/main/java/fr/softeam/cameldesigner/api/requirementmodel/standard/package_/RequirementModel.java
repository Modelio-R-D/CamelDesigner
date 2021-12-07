/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
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
    @objid ("ab40fe16-d35a-44f3-bbcb-5fdb5e30611a")
    public static final String STEREOTYPE_NAME = "RequirementModel";

    /**
     * Tells whether a {@link RequirementModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << RequirementModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("843abcda-6f55-434a-a079-fe2c581d69fa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << RequirementModel >> then instantiate a {@link RequirementModel} proxy.
     * 
     * @return a {@link RequirementModel} proxy on the created {@link Package}.
     */
    @objid ("5220c5e0-ba34-4921-8a78-12d52ec52e14")
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
    @objid ("c30683b6-763a-44a7-9a5b-777de1abcc03")
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
    @objid ("6b5c89c4-0d35-4d65-a2c7-ff7a51777d44")
    public static RequirementModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (RequirementModel.canInstantiate(obj))
            return new RequirementModel(obj);
        else
            throw new IllegalArgumentException("RequirementModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8cb7b2bf-cce7-4789-b0dd-f22bb4f00076")
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
    @objid ("d3b4667f-f303-48ba-be2e-ab830a447bc3")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("82947382-de03-469f-a1be-010114538f33")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("bcf713a7-547a-4b0d-80cc-30a4f9ca67b7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("81eccaf1-c0a2-447e-8d4a-a41581507804")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("1de70ca6-4da8-44aa-b5a7-5fd3e362336c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(getResourceRequirements());
        result.addAll(getHorizontalScaleRequirements());
        result.addAll(getImageRequirements());
        result.addAll(getSLOs());
        result.addAll(getProviderRequirements());
        result.addAll(getOptimisationRequirements());
        result.addAll(getLocationRequirements());
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

    @objid ("f9f97f0a-1503-4461-a406-f97f3769b72a")
    protected RequirementModel(final Package elt) {
        super(elt);
    }

    @objid ("cda79ab4-0c73-48f6-9745-469f013ec194")
    public static final class MdaTypes {
        @objid ("1018fda3-894a-4489-b023-b2681634c3ca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f669ee69-5c7c-4dda-a71f-21cc76a63af4")
        private static Stereotype MDAASSOCDEP;

        @objid ("b1171b43-8b83-49b5-bd27-99c55d0b1048")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("793a5af8-7b8d-4b35-bd30-fd1ba2f344a7")
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
