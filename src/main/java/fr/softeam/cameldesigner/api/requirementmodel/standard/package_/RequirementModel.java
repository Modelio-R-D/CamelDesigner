/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
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

/**
 * Proxy class to handle a {@link Package} with << RequirementModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class RequirementModel extends SubModel {
    public static final String STEREOTYPE_NAME = "RequirementModel";

    /**
     * Tells whether a {@link RequirementModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << RequirementModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     *
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << RequirementModel >> then instantiate a {@link RequirementModel} proxy.
     *
     * @return a {@link RequirementModel} proxy on the created {@link Package}.
     */
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
    public static RequirementModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (RequirementModel.canInstantiate(obj))
            return new RequirementModel(obj);
        else
            throw new IllegalArgumentException("RequirementModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}.
     *
     * @return the Package represented by this proxy, never null.
     */
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     */
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    protected RequirementModel(final Package elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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

    public Collection<ResourceRequirement> getResourceRequirements() {
        List<ResourceRequirement> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (ResourceRequirement.canInstantiate(mObj))
                results.add(ResourceRequirement.safeInstantiate((Class) mObj));

        return Collections.unmodifiableList(results);
    }

    public Collection<HorizontalScaleRequirement> getHorizontalScaleRequirements() {
        List<HorizontalScaleRequirement> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (HorizontalScaleRequirement.canInstantiate(mObj))
                results.add(HorizontalScaleRequirement.safeInstantiate((Class) mObj));

        return Collections.unmodifiableList(results);
    }

    public Collection<ImageRequirement> getImageRequirements() {
        List<ImageRequirement> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (ImageRequirement.canInstantiate(mObj))
                results.add(ImageRequirement.safeInstantiate((Enumeration) mObj));

        return Collections.unmodifiableList(results);
    }

    public Collection<ServiceLevelObjective> getSLOs() {
        List<ServiceLevelObjective> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (ServiceLevelObjective.canInstantiate(mObj))
                results.add(ServiceLevelObjective.safeInstantiate((Class) mObj));

        return Collections.unmodifiableList(results);
    }

    public Collection<OptimisationRequirement> getOptimisationRequirements() {
        List<OptimisationRequirement> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (OptimisationRequirement.canInstantiate(mObj))
                results.add(OptimisationRequirement.safeInstantiate((Class) mObj));

        return Collections.unmodifiableList(results);
    }

    public Collection<ProviderRequirement> getProviderRequirements() {
        List<ProviderRequirement> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (ProviderRequirement.canInstantiate(mObj))
                results.add(ProviderRequirement.safeInstantiate((Class) mObj));

        return Collections.unmodifiableList(results);
    }

    public Collection<LocationRequirement> getLocationRequirements() {
        List<LocationRequirement> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (LocationRequirement.canInstantiate(mObj))
                results.add(LocationRequirement.safeInstantiate((Class) mObj));

        return Collections.unmodifiableList(results);
    }

}
