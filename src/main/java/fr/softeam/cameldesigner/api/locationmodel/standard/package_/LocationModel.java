/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << LocationModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e06f1e35-8aba-474b-985b-73a18abd3a7a")
public class LocationModel extends SubModel {
    @objid ("10826d5f-9472-48ee-8652-7ee9f445e4f8")
    public static final String STEREOTYPE_NAME = "LocationModel";

    /**
     * Tells whether a {@link LocationModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << LocationModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("63fa2320-e353-4b6c-ace9-09cbe74f2102")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << LocationModel >> then instantiate a {@link LocationModel} proxy.
     * 
     * @return a {@link LocationModel} proxy on the created {@link Package}.
     */
    @objid ("98da8184-d93a-4fce-9286-8aafb5f1e947")
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
    @objid ("4df241ec-f245-43fe-9ece-fea446a59b64")
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
    @objid ("3d35c12f-76f5-4263-bdaa-7f9b4e3fdefb")
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
    @objid ("d503bb8b-a7b6-40ec-98dc-7d63cc9a1a84")
    public void addCloudLocations(final CloudLocation obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'regions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f8ea242d-c4bf-4263-aa2a-e4784d41cf93")
    public void addRegions(final GeographicalRegion obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("e8589e93-bf21-4e13-8ec2-aa5779d7a8cd")
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
    @objid ("f4104aad-9046-4e9f-88e8-bb5e2ed3effc")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'cloudLocations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9ba6c9f8-a71e-4152-bb83-cbf22d87c975")
    public List<CloudLocation> getCloudLocations() {
        List<CloudLocation> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (CloudLocation.canInstantiate(mObj))
        			results.add((CloudLocation)CamelDesignerProxyFactory.instantiate(mObj, CloudLocation.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("2c7a27c5-2a83-49d9-a099-7b073bc177b3")
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
    @objid ("12d42bef-d362-496f-b6fa-a60843f9d36b")
    public List<GeographicalRegion> getRegions() {
        List<GeographicalRegion> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (GeographicalRegion.canInstantiate(mObj))
        			results.add((GeographicalRegion)CamelDesignerProxyFactory.instantiate(mObj, GeographicalRegion.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("f453e099-f0a7-42b1-bc6f-dda84e21242c")
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
    @objid ("329c058c-e621-4016-a65c-a4032a837f8e")
    public boolean removeCloudLocations(final CloudLocation obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'regions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f6d3b34b-c57f-4d98-92ef-be981ff37768")
    public boolean removeRegions(final GeographicalRegion obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a1749aee-20ac-4129-b66b-bdd16fc6b5e7")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("23c37ccd-27a5-4c21-b3db-15a7c420d8ec")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("df1ea5fb-8b7f-43bf-8dd9-2eb06f943d3f")
    protected LocationModel(final Package elt) {
        super(elt);
    }

    @objid ("a2ca82c4-fc32-4a3b-bda6-79e19816d45c")
    public static final class MdaTypes {
        @objid ("7ce3f351-31d0-430d-986c-90f9f7956fb6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fc836991-379a-4511-91e2-0e71b9ac0388")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e0cf447-fcdc-4a29-af51-286af4644a85")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9fde65af-09fe-4320-adf0-3889da3a7033")
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
