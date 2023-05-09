/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("9872575e-de34-44aa-a961-eac825e1eada")
    public static final String STEREOTYPE_NAME = "LocationModel";

    /**
     * Tells whether a {@link LocationModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << LocationModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b2557a2f-a499-45b8-b94a-dcb881c98723")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << LocationModel >> then instantiate a {@link LocationModel} proxy.
     * 
     * @return a {@link LocationModel} proxy on the created {@link Package}.
     */
    @objid ("fee982a9-5c4a-4ab5-a633-dd46513f0253")
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
    @objid ("835652fe-6db0-4567-afb3-b8590eca2f84")
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
    @objid ("5f1c57bd-32d6-46a7-9da0-58bf37bfab7a")
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
    @objid ("43c41c61-00b9-45ce-bac2-ab904a70d9d3")
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
    @objid ("f116dfe6-67e0-4c9d-9a9e-e747010ae7d2")
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
    @objid ("b1cd39af-5603-4fa7-aa08-74e9a97581ad")
    public void addRegions(final GeographicalRegion obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("f2d3feed-a092-4c8a-b2c3-a2505a66c5d6")
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
    @objid ("a014272c-78bf-406e-99f5-280768ec08d1")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'cloudLocations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7a205776-4e08-4b16-b43b-ed32ec1cc933")
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
    @objid ("4c781a9e-984c-4d8e-9fdf-8f87a65c7a61")
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
    @objid ("b068f0be-5c41-475e-b9de-69b69b113f71")
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
    @objid ("aaefc446-b320-4c2a-b4c1-b21dd995ec3a")
    public List<GeographicalRegion> getRegions() {
        List<GeographicalRegion> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (GeographicalRegion.canInstantiate(mObj))
        			results.add((GeographicalRegion)CamelDesignerProxyFactory.instantiate(mObj, GeographicalRegion.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("b8f5e7b9-d12d-4cbf-a33d-2f38f8449287")
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
    @objid ("dc540444-ec0d-4ff7-b303-61f44a857745")
    public boolean removeCloudLocations(final CloudLocation obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("58ea5a7b-8c83-4a42-bb9a-ef128299b902")
    public boolean removeDiagrams(final LocationModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'regions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("849cd14a-660c-4f4d-8dc2-6f22428e78bf")
    public boolean removeRegions(final GeographicalRegion obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("91c54e44-782b-422c-81b6-315475bd6442")
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

    @objid ("64d0a507-3415-4dfb-9533-eb1f3af8d1f3")
    protected LocationModel(final Package elt) {
        super(elt);
    }

    @objid ("a2ca82c4-fc32-4a3b-bda6-79e19816d45c")
    public static final class MdaTypes {
        @objid ("9dbb9d54-2039-4d4e-b906-8c334df0947b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b2aa2856-9127-4ca7-8b0b-979aeddcc2a8")
        private static Stereotype MDAASSOCDEP;

        @objid ("66647f63-22af-4afd-811d-7db0cddceba8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6e92baf8-2e05-411e-8d1a-feb6c54e9541")
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
