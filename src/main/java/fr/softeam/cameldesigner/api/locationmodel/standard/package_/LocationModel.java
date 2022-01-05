/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("6d7e8139-ddc6-4bfa-bd7a-c57b294c04c5")
    public static final String STEREOTYPE_NAME = "LocationModel";

    /**
     * Tells whether a {@link LocationModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << LocationModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("09297e1d-5d8c-453e-b5de-b96515ba4225")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << LocationModel >> then instantiate a {@link LocationModel} proxy.
     * 
     * @return a {@link LocationModel} proxy on the created {@link Package}.
     */
    @objid ("420baa7d-5d67-4ba6-950d-06aa9baf4733")
    public static LocationModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, LocationModel.STEREOTYPE_NAME);
        return LocationModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link LocationModel} proxy from a {@link Package} stereotyped << LocationModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link LocationModel} proxy or <i>null</i>.
     */
    @objid ("e0670dd5-fc26-456a-955c-5ec838b2336a")
    public static LocationModel instantiate(final Package obj) {
        return LocationModel.canInstantiate(obj) ? new LocationModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LocationModel} proxy from a {@link Package} stereotyped << LocationModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link LocationModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f0cc4edc-3047-41ac-a5a7-13edf5eeabcb")
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
     */
    @objid ("f8c49245-e1cf-4d5e-b750-e14127fb4da7")
    public void addCloudLocations(final CloudLocation obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LocationModel.MdaTypes.MDAASSOCDEP);
            d.setName("cloudLocations");
            d.putTagValue(LocationModel.MdaTypes.MDAASSOCDEP_ROLE, "cloudLocations");
        }
    }

    /**
     * Add a value to the 'regions' role.<p>
     * Role description:
     * null
     */
    @objid ("5cbc3dbc-8e26-45dc-8fa6-2ff695571c57")
    public void addRegions(final GeographicalRegion obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LocationModel.MdaTypes.MDAASSOCDEP);
            d.setName("regions");
            d.putTagValue(LocationModel.MdaTypes.MDAASSOCDEP_ROLE, "regions");
        }
    }

    @objid ("44e95f0f-3452-4b3e-94f6-7c4e3dc8c7de")
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
     */
    @objid ("10e23393-7568-4197-a5a6-c2d14edff94f")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'cloudLocations' role.<p>
     * Role description:
     * null
     */
    @objid ("50b3f535-166e-4570-90b6-71b2b07c1fb7")
    public List<CloudLocation> getCloudLocations() {
        List<CloudLocation> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(LocationModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(LocationModel.MdaTypes.MDAASSOCDEP_ROLE), "cloudLocations")
              && CloudLocation.canInstantiate(d.getDependsOn()))
                results.add((CloudLocation)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CloudLocation.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("7e70b517-a915-457f-937a-1afcbf4a5b9b")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'regions' role.<p>
     * Role description:
     * null
     */
    @objid ("589652b9-05fe-4473-8783-65260ecdb620")
    public List<GeographicalRegion> getRegions() {
        List<GeographicalRegion> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(LocationModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(LocationModel.MdaTypes.MDAASSOCDEP_ROLE), "regions")
              && GeographicalRegion.canInstantiate(d.getDependsOn()))
                results.add((GeographicalRegion)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d1d58c1a-2151-404f-bf71-8fed95c3c330")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'cloudLocations' role.<p>
     * Role description:
     * null
     */
    @objid ("3546bb83-debc-4331-bc80-7cbd4421ff6f")
    public boolean removeCloudLocations(final CloudLocation obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(LocationModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(LocationModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'regions' role.<p>
     * Role description:
     * null
     */
    @objid ("ac99655e-2e05-4687-8ceb-ec2f6f3ecf20")
    public boolean removeRegions(final GeographicalRegion obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(LocationModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(LocationModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("026490a1-3694-47e3-89ff-5b4424cf83b4")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("c23c1391-ef05-46bc-ab0f-c95449e14469")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("26ba71ed-9655-4c40-9047-cbe0b26786f2")
    protected LocationModel(final Package elt) {
        super(elt);
    }

    @objid ("a2ca82c4-fc32-4a3b-bda6-79e19816d45c")
    public static final class MdaTypes {
        @objid ("418b22b3-1746-4df1-b2f5-a62df5c82783")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d6643ea-5483-4cfd-8d27-cc1c1f1ab857")
        private static Stereotype MDAASSOCDEP;

        @objid ("8b1e495d-b542-4866-b9fd-43ac0652313a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1ef0ebde-b40f-449b-9059-18bf8585e344")
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
