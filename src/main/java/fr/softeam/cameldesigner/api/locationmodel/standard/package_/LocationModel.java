/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.locationmodel.standard.package_;

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
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.LocationModelDiagram;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << LocationModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e06f1e35-8aba-474b-985b-73a18abd3a7a")
public class LocationModel extends SubModel {
    @objid ("c1f6dcef-3043-4694-a012-1d577034c0d9")
    public static final String STEREOTYPE_NAME = "LocationModel";

    /**
     * Tells whether a {@link LocationModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << LocationModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a4c13394-223a-4c70-a72a-055b02053991")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << LocationModel >> then instantiate a {@link LocationModel} proxy.
     * 
     * @return a {@link LocationModel} proxy on the created {@link Package}.
     */
    @objid ("a576fc33-230b-4ebb-a138-6212b50d5d0a")
    public static LocationModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, LocationModel.STEREOTYPE_NAME);
        return LocationModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link LocationModel} proxy from a {@link Package} stereotyped << LocationModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link LocationModel} proxy or <i>null</i>.
     */
    @objid ("c720e56c-cdbf-433c-8b27-03dd9f5be2a1")
    public static LocationModel instantiate(final Package obj) {
        return LocationModel.canInstantiate(obj) ? new LocationModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LocationModel} proxy from a {@link Package} stereotyped << LocationModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link LocationModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2145128c-5e30-4a4d-b3d3-a6fcd2d98a53")
    public static LocationModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (LocationModel.canInstantiate(obj))
        	return new LocationModel(obj);
        else
        	throw new IllegalArgumentException("LocationModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'cloudLocations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ebb7edca-0ad3-4555-a044-5d3ea4cc3a09")
    public void addCloudLocations(final CloudLocation obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2e8f8dc2-6442-4b87-abb0-8d4eecb4f06f")
    public void addDiagrams(final LocationModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'regions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("de248126-ecb0-4a98-8835-bf74f42253d1")
    public void addRegions(final GeographicalRegion obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("fd016fd3-113c-4906-bf05-d64d7281346f")
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
        LocationModel other = (LocationModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8555ce39-60b6-47cc-a72f-01f236c66e49")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'cloudLocations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ce48110b-c945-40ff-a84a-f1a43355a101")
    public List<CloudLocation> getCloudLocations() {
        List<CloudLocation> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (CloudLocation.canInstantiate(mObj))
        			results.add((CloudLocation)CamelDesignerProxyFactory.instantiate(mObj, CloudLocation.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("04f1d049-f095-49b1-acd1-e700cdeeab0b")
    public List<LocationModelDiagram> getDiagrams() {
        List<LocationModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (LocationModelDiagram.canInstantiate(mObj))
        			results.add((LocationModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, LocationModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("b4a3a22b-9850-4ed9-97c3-7c3972d9872b")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'regions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("526548b9-e07f-48ac-ad49-5b0a90a77ff8")
    public List<GeographicalRegion> getRegions() {
        List<GeographicalRegion> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (GeographicalRegion.canInstantiate(mObj))
        			results.add((GeographicalRegion)CamelDesignerProxyFactory.instantiate(mObj, GeographicalRegion.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("30bdab5b-ebe1-48e3-801f-d3e9cfa02719")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'cloudLocations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3ac1159d-d593-44ae-aa2c-dddbab1cc376")
    public boolean removeCloudLocations(final CloudLocation obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4fad1984-b315-438d-afcf-99cf4be0114b")
    public boolean removeDiagrams(final LocationModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'regions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c567fc55-b1b2-4b6e-b6c9-2aaeb88e6b86")
    public boolean removeRegions(final GeographicalRegion obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("347c9c69-7ec5-4063-9a3d-b19cee5c070c")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("23c37ccd-27a5-4c21-b3db-15a7c420d8ec")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getRegions());
        result.addAll(getCloudLocations());
        return result;
    }

    @objid ("780a34e3-3aa6-4020-ab63-b30ffbd2bcf2")
    protected LocationModel(final Package elt) {
        super(elt);
    }

    @objid ("a2ca82c4-fc32-4a3b-bda6-79e19816d45c")
    public static final class MdaTypes {
        @objid ("bbf23d6f-a306-48a1-991a-11e1194b349f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d81d5e40-6f10-4717-a937-47e22ec9bdcb")
        private static Stereotype MDAASSOCDEP;

        @objid ("e2625cf9-d270-44f8-949a-58ac0a50a82b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9cc290f1-491f-4a24-b6d0-590cd9e0b427")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ae1d1599-c214-4ba0-9176-8cd1277e2ae1");
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
