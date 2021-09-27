/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.package_;

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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

/**
 * Proxy class to handle a {@link Package} with << DeploymentModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class DeploymentModel extends SubModel {
    public static final String STEREOTYPE_NAME = "DeploymentModel";

    /**
     * Tells whether a {@link DeploymentModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     *
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentModel >> then instantiate a {@link DeploymentModel} proxy.
     *
     * @return a {@link DeploymentModel} proxy on the created {@link Package}.
     */
    public static DeploymentModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModel.STEREOTYPE_NAME);
        return DeploymentModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentModel} proxy from a {@link Package} stereotyped << DeploymentModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     *
     * @param obj a Package
     * @return a {@link DeploymentModel} proxy or <i>null</i>.
     */
    public static DeploymentModel instantiate(final Package obj) {
        return DeploymentModel.canInstantiate(obj) ? new DeploymentModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentModel} proxy from a {@link Package} stereotyped << DeploymentModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     *
     * @param obj a {@link Package}
     * @return a {@link DeploymentModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static DeploymentModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (DeploymentModel.canInstantiate(obj))
            return new DeploymentModel(obj);
        else
            throw new IllegalArgumentException("DeploymentModel: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DeploymentModel other = (DeploymentModel) obj;
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

    protected DeploymentModel(final Package elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7d620068-3fc6-4fec-8829-0444c0c3186f");
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
        result.addAll(getSoftwareComponents());
        result.addAll(getVMs());
        result.addAll(getPaases());
        result.addAll(getContainers());
        result.addAll(getRequirementSets());
        return result;
    }

    public Collection<SoftwareComponent> getSoftwareComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (SoftwareComponent.canInstantiate(mObj))
                results.add(SoftwareComponent.safeInstantiate((Component) mObj));

        return Collections.unmodifiableList(results);
    }


    public Collection<VM> getVMs() {
        List<VM> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (VM.canInstantiate(mObj))
                results.add(VM.safeInstantiate((Component) mObj));

        return Collections.unmodifiableList(results);
    }

    public Collection<PaaS> getPaases() {
        List<PaaS> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (PaaS.canInstantiate(mObj))
                results.add(PaaS.safeInstantiate((Component) mObj));

        return Collections.unmodifiableList(results);
    }

    public Collection<Container> getContainers() {
        List<Container> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (Container.canInstantiate(mObj))
                results.add(Container.safeInstantiate((Component) mObj));

        return Collections.unmodifiableList(results);
    }


    public Collection<RequirementSet> getRequirementSets() {
        List<RequirementSet> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (RequirementSet.canInstantiate(mObj))
                results.add(RequirementSet.safeInstantiate((Class) mObj));

        return Collections.unmodifiableList(results);
    }


}
