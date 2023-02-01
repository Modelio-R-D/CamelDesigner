/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("161c3515-5c07-47d2-a45c-a47311751762")
=======
    @objid ("7551ea89-390e-4186-873f-4d3c91814b95")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "LocationModel";

    /**
     * Tells whether a {@link LocationModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << LocationModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d224887e-4e0c-416d-a021-3a949f600891")
=======
    @objid ("ad280206-9c6d-46fe-96fd-f6ddc7dfa16e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << LocationModel >> then instantiate a {@link LocationModel} proxy.
     * 
     * @return a {@link LocationModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("7fafe628-bf83-4b6e-b9dd-387455fbd384")
=======
    @objid ("a4bcb3a3-af6a-45a9-89cc-69861af00135")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("9304bd33-cbb9-4b34-9ec6-456785cb588d")
=======
    @objid ("e4202c96-9c04-4879-a2e2-9c7083f6638a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c044ebc8-813b-4844-a9dd-46bd6e55f490")
=======
    @objid ("dc4f05cc-f8be-41fc-a784-2afd17d2f2a0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("994c8491-96c2-40b1-a17c-4994b74bd9c7")
=======
    @objid ("d4f93b59-04d2-4378-87d5-33a76c9003ca")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6d33e4c3-2124-4df3-be9e-b5c23e2c932a")
=======
    @objid ("633e6b87-8410-4ee4-844b-37ecbbdac14a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d85b6600-dcc6-401d-8eaf-f581fd73adf9")
=======
    @objid ("177c3396-f2a7-4438-a873-3f0915e06dc6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addRegions(final GeographicalRegion obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("75423fd2-9064-4c3c-8a0a-c9eb3d790918")
=======
    @objid ("f2a7dded-640f-4723-941b-6727e87e3053")
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
        LocationModel other = (LocationModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("4b7d1831-dfed-4907-a8ef-d82f99866226")
=======
    @objid ("86ac4a52-f787-4359-8aea-8dcd08eee0eb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'cloudLocations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f77ffb95-29e0-46c3-9ce6-555b68561869")
=======
    @objid ("ef8cbbeb-3748-4eb4-9477-e8e722ac6025")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("46d60371-a766-41ef-a633-c390919cb45f")
=======
    @objid ("f4bdb1bf-e48d-4130-9ce1-7793218c1d40")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("406750d8-a4a2-4dcb-a606-cd8ca5511e4c")
=======
    @objid ("79fdb379-d9f0-44ae-955f-c07d8e5471f9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("19b18f25-4f8e-4993-b7e5-f02000864b0a")
=======
    @objid ("4b0106ff-326f-4b69-86bf-a522165dae23")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<GeographicalRegion> getRegions() {
        List<GeographicalRegion> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (GeographicalRegion.canInstantiate(mObj))
        			results.add((GeographicalRegion)CamelDesignerProxyFactory.instantiate(mObj, GeographicalRegion.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("e8a16424-559c-484a-8f0d-7255dfe66130")
=======
    @objid ("653ca437-d973-4e61-afee-00a94400cc61")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("84e1597d-19fa-4b85-9ed1-e780726259df")
=======
    @objid ("97603acd-2f8d-4dd8-8b5f-b438099b8c1d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeCloudLocations(final CloudLocation obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("4a1fa9dc-88a3-4b10-a29d-46c5d267b7b8")
=======
    @objid ("141098f9-83f4-47c3-85cb-677cb14edb47")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final LocationModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'regions' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("99a32e6e-df55-4c15-a918-005c11f26222")
=======
    @objid ("fb6b8c27-b53c-4535-80e0-2ae10107c31b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRegions(final GeographicalRegion obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("c619b7c6-34df-4b05-a820-c54c982abae7")
=======
    @objid ("15f33ec9-45c0-4ceb-80ff-4b8b3d50c606")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("52d92d0a-4e9f-420c-8b1b-cfb9bc3ab20a")
=======
    @objid ("98f6a21f-04a8-448b-923c-6933f8d8a609")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected LocationModel(final Package elt) {
        super(elt);
    }

    @objid ("a2ca82c4-fc32-4a3b-bda6-79e19816d45c")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("e87c627a-b578-4dc2-9643-905442bc126f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad3fd441-dd8d-4718-8551-8bdf4dcc0661")
        private static Stereotype MDAASSOCDEP;

        @objid ("0e536ca9-86af-4e4e-a8cc-d40ce1a3ba32")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d533bc70-4018-4760-9235-b42ce021d4cd")
=======
        @objid ("668997b1-794f-4102-8b13-f943a5613ea1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("41d98681-cf86-4490-8f42-84703e378efc")
        private static Stereotype MDAASSOCDEP;

        @objid ("29100bbe-f992-48ed-bd81-f5ff4b52d1c5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("60ccc222-e312-4aef-9178-9e0491927e7a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
