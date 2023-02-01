/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.CommunicationRequirement;
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
import org.modelio.metamodel.diagrams.AbstractDiagram;
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
<<<<<<< HEAD
    @objid ("d804940a-d935-42a6-898f-d5105fc9bbba")
=======
    @objid ("f994fef9-098e-48f8-b2d2-f75aa37acff4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "RequirementModel";

    /**
     * Tells whether a {@link RequirementModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << RequirementModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("1e67bd33-23ca-483a-a9fe-4bfac60bf3a1")
=======
    @objid ("f65b24e3-5303-4db8-8868-9c3c20a035e8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << RequirementModel >> then instantiate a {@link RequirementModel} proxy.
     * 
     * @return a {@link RequirementModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("9ce439af-2f64-4b0a-a0b6-8afc09fed230")
=======
    @objid ("8a8ee92a-506f-4951-9df1-c16930feb296")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static RequirementModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RequirementModel.STEREOTYPE_NAME);
        return RequirementModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link RequirementModel} proxy from a {@link Package} stereotyped << RequirementModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link RequirementModel} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("4ea1f517-fffa-444e-b085-8c27449e0897")
=======
    @objid ("f176e51a-2668-4994-8656-a02dd438c886")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static RequirementModel instantiate(final Package obj) {
        return RequirementModel.canInstantiate(obj) ? new RequirementModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementModel} proxy from a {@link Package} stereotyped << RequirementModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link RequirementModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("8e0974df-e32c-42a6-bd98-f04cf049e916")
=======
    @objid ("505063f8-d4ed-48df-9824-516bfb26ac11")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static RequirementModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (RequirementModel.canInstantiate(obj))
        	return new RequirementModel(obj);
        else
        	throw new IllegalArgumentException("RequirementModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("018f9530-b2f2-43b6-b5b6-c32e08ee71ce")
=======
    @objid ("75e1a4a2-23bc-4b02-b660-1c3df5658bde")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final RequirementModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'requirements' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("072daf08-757b-4986-a206-45196083c23d")
=======
    @objid ("b1309c49-af9a-4e55-84df-538529d13e3e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addRequirements(final Requirement obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("9897132a-2526-4b5f-a590-1d31c43887c4")
=======
    @objid ("542deb91-9a9e-45ad-b323-433163de5e2a")
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
        RequirementModel other = (RequirementModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("25496c92-974d-4355-96fd-01f692ab6969")
=======
    @objid ("3d3ed754-98f0-4d49-8287-4afa022f91aa")
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
    @objid ("0a2b6eb4-66c8-4852-934e-9f88c9fe7459")
=======
    @objid ("b2ff7047-e2d8-4a8c-ae62-db95d16377e7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<RequirementModelDiagram> getDiagrams() {
        List<RequirementModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (RequirementModelDiagram.canInstantiate(mObj))
        			results.add((RequirementModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, RequirementModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("a98c1814-8bd0-4dfe-81c8-039e0ba5fcc2")
=======
    @objid ("ab1f45ee-2a84-46e6-9056-7579acd287bc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'requirements' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("677c0571-cd96-40cd-aed9-92c07b94fd23")
=======
    @objid ("43972b83-d53a-4447-bdc4-d9d6bc845634")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
        	if (CommunicationRequirement.canInstantiate(mObj))
        			results.add((CommunicationRequirement)CamelDesignerProxyFactory.instantiate(mObj, CommunicationRequirement.STEREOTYPE_NAME));
=======
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        	if (OptimisationRequirement.canInstantiate(mObj))
        			results.add((OptimisationRequirement)CamelDesignerProxyFactory.instantiate(mObj, OptimisationRequirement.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("d1189d06-cd27-445c-9c96-dc89ff24dd89")
=======
    @objid ("3a1d6669-2c5d-45b8-8cf7-6942ca3cebf6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9e31d884-0c65-42e5-8ade-32b02f6784ef")
=======
    @objid ("7cd80fb0-bb2f-41c0-8f94-f30181952bfb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final RequirementModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'requirements' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ef613438-bd7b-486a-ace9-fe7e48520e56")
=======
    @objid ("4915f642-342a-4ed5-adc1-17674ec1b855")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRequirements(final Requirement obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("1f318522-6fc3-4b19-a723-5aa9143e3370")
=======
    @objid ("7544fd5e-2ed4-4cda-a962-072c3ec45f50")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
        result.addAll(getPaaSRequirement());
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

<<<<<<< HEAD
    @objid ("09c8d26e-388d-4a24-a031-d616c02970a3")
=======
    @objid ("5cead1cf-6def-49cf-bdbd-0d7dc3aef299")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected RequirementModel(final Package elt) {
        super(elt);
    }

    @objid ("80494732-c62a-442c-a969-41f2991063a1")
    private Collection<PaaSRequirement> getPaaSRequirement() {
        List<PaaSRequirement> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (PaaSRequirement.canInstantiate(mObj))
                results.add(PaaSRequirement.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("cda79ab4-0c73-48f6-9745-469f013ec194")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("b7808047-24b1-4cb8-9d77-f1ecd0c5f481")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("23568c97-f165-4150-adba-60ca02b002b1")
        private static Stereotype MDAASSOCDEP;

        @objid ("0f3f583a-e4d2-4f29-88db-05d8e1b4c4d4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9fd811e2-938a-45d8-ad30-89bee52df53c")
=======
        @objid ("87af3f22-61c4-445f-b896-d2ec2620a426")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("653a77a4-190e-4ac5-ad2e-13f6f7c1ebfc")
        private static Stereotype MDAASSOCDEP;

        @objid ("32ef5716-43c0-49bf-a7b5-80b966d02ae4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e5b7f722-e243-4796-bccd-2c2fea68cca7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
