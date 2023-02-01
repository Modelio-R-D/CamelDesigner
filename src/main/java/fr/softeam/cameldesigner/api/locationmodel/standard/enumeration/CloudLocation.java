/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.locationmodel.standard.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Enumeration} with << CloudLocation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ec445b98-cb41-4e0b-8577-5f1b03d78177")
public class CloudLocation extends Location {
<<<<<<< HEAD
    @objid ("8b1be1e2-62af-4ee8-bff6-22fbbda5f14e")
    public static final String STEREOTYPE_NAME = "CloudLocation";

    @objid ("d739b9d1-e782-4e28-b610-926c6e76d0ba")
=======
    @objid ("675306c9-4e18-4b46-80b1-6ccd764dfe62")
    public static final String STEREOTYPE_NAME = "CloudLocation";

    @objid ("e59dc593-cc77-45d6-893e-7f6a9f834c72")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String ISASSIGNABLE_TAGTYPE = "isAssignable";

    /**
     * Tells whether a {@link CloudLocation proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << CloudLocation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("dd541f33-378f-4c72-9cb6-1e32e45ce92f")
=======
    @objid ("25fb74f9-bf90-4c55-ad35-d41a5a89e892")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudLocation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << CloudLocation >> then instantiate a {@link CloudLocation} proxy.
     * 
     * @return a {@link CloudLocation} proxy on the created {@link Enumeration}.
     */
<<<<<<< HEAD
    @objid ("18a40bdf-f3ca-4a1f-a830-08d25fcce0b9")
=======
    @objid ("d1b276ed-e993-4944-9847-a5532600d7d7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CloudLocation create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Enumeration");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CloudLocation.STEREOTYPE_NAME);
        return CloudLocation.instantiate((Enumeration)e);
    }

    /**
     * Tries to instantiate a {@link CloudLocation} proxy from a {@link Enumeration} stereotyped << CloudLocation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Enumeration
     * @return a {@link CloudLocation} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("7c147761-0d91-4f5e-84c3-f1cc83f319f1")
=======
    @objid ("f138acc0-ffd8-4b54-a381-e15fde58383a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CloudLocation instantiate(final Enumeration obj) {
        return CloudLocation.canInstantiate(obj) ? new CloudLocation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudLocation} proxy from a {@link Enumeration} stereotyped << CloudLocation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Enumeration}
     * @return a {@link CloudLocation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("2bcdc7a6-6cdf-4cde-9b20-020e7dfc020a")
=======
    @objid ("d1e60095-c1ca-4569-89e0-ab51f0c77406")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CloudLocation safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (CloudLocation.canInstantiate(obj))
        	return new CloudLocation(obj);
        else
        	throw new IllegalArgumentException("CloudLocation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'subLocations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("095f610f-cd49-4224-9468-68c4fb14d678")
=======
    @objid ("ff3223f1-d461-477e-b72f-de6faae1a8db")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSubLocations(final CloudLocation obj) {
        if (obj!=null)
          ((Enumeration) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("114f23f4-44e9-4997-9bf6-fbbe8e4d7318")
=======
    @objid ("c413972f-ec66-47bf-b2eb-a7d633ca3298")
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
        CloudLocation other = (CloudLocation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Enumeration}. 
     * @return the Enumeration represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("d41597c1-fc01-4e18-b9cb-44b78b41979b")
=======
    @objid ("eb8bb760-882b-4ae1-86e9-c882bfffa1f5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Get the value of the 'geographicalRegion' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("248519f0-c044-472b-91a9-4357880dcd0c")
=======
    @objid ("027bb875-83b2-4732-bacd-015f72a1ef5c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public GeographicalRegion getGeographicalRegion() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CloudLocation.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE), "geographicalRegion")){
                  if (GeographicalRegion.canInstantiate(d.getDependsOn()))
                     return (GeographicalRegion)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("fa9bbe45-86bf-4cfb-9b58-125aa622ec7a")
=======
    @objid ("7d2b08b4-2872-4dac-8eb0-0adc23ae5f22")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public CloudLocation getParent() {
        return (CloudLocation)CamelDesignerProxyFactory.instantiate(((Enumeration) this.elt).getOwner(), CloudLocation.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'subLocations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("6e387433-446e-4b3e-a58c-66605e08a521")
=======
    @objid ("e24f21eb-d296-4e53-ba4b-baa551fa42ca")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<CloudLocation> getSubLocations() {
        List<CloudLocation> results = new ArrayList<>();
        for (ModelTree mObj : ((Enumeration) this.elt).getOwnedElement()){
        	if (CloudLocation.canInstantiate(mObj))
        			results.add((CloudLocation)CamelDesignerProxyFactory.instantiate(mObj, CloudLocation.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("da2b7dbb-92b3-4f14-907e-b6b2045d0da8")
=======
    @objid ("fb4ad822-8891-42b6-91f4-28f0b93fd806")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isAssignable'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("9dd08309-efbf-4ce8-a85d-f745e49d13ea")
=======
    @objid ("53873d87-959b-46c2-8841-5d7832035be4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isIsAssignable() {
        return this.elt.isTagged(CloudLocation.MdaTypes.ISASSIGNABLE_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'subLocations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("73c4718b-43cd-44ca-bccc-b0802815e9e2")
=======
    @objid ("a986f4a7-e169-4b87-8157-7a99ba784a2a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSubLocations(final CloudLocation obj) {
        return (obj!=null)? ((Enumeration) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'geographicalRegion' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("4db7c8e6-3925-46aa-8a73-4fa22fafaba4")
=======
    @objid ("4086d0b6-4f38-45f0-adde-27d365727926")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setGeographicalRegion(final GeographicalRegion obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CloudLocation.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE), "geographicalRegion")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CloudLocation.MdaTypes.MDAASSOCDEP);
              dep.setName("geographicalRegion");      dep.putTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE, "geographicalRegion");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for boolean property 'isAssignable'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("e875de75-0ade-4937-9e0c-411a3d371ba9")
=======
    @objid ("a2b77d82-1c1d-4a1b-bf53-15966c53932f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setIsAssignable(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudLocation.MdaTypes.ISASSIGNABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudLocation.MdaTypes.ISASSIGNABLE_TAGTYPE_ELT);
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8cb113bf-8175-4fd8-bf98-4f7383919966")
=======
    @objid ("e879b192-a3e7-4d51-8324-090bd1965bc9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setParent(final CloudLocation obj) {
        ((Enumeration) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("45b6e359-3de0-4fd6-b652-5a0740bc791d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getSubLocations());
        return result;
    }

<<<<<<< HEAD
    @objid ("48581540-5688-422f-a877-6c58a9750a0c")
=======
    @objid ("af1d82fa-f505-4e31-8583-96a7d8e36428")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CloudLocation(final Enumeration elt) {
        super(elt);
    }

    @objid ("2601abe9-713a-4dc1-b7a9-b34987ddef2b")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("a207a556-a14c-4581-a4a8-738978a2f029")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2da35f95-463f-4083-b562-057a83f62a5e")
        public static TagType ISASSIGNABLE_TAGTYPE_ELT;

        @objid ("90905c55-1e5a-40e7-99b8-8e013dbe36ec")
        private static Stereotype MDAASSOCDEP;

        @objid ("6aaca353-f1b6-4d5f-b450-5761b271f024")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("24a52f61-4181-4f20-8826-e7148182296f")
=======
        @objid ("af231e77-2e4b-4363-9676-47f135f71e5b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("632a70bd-95b1-4daf-8ccb-20dd04ccb701")
        public static TagType ISASSIGNABLE_TAGTYPE_ELT;

        @objid ("050b4910-a91e-4bb9-a0a0-f716a3614f94")
        private static Stereotype MDAASSOCDEP;

        @objid ("801165c7-dc7f-471a-adf5-b5e6749f4586")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8d20b4f1-2fbd-4428-9bf0-607e52b325e5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "230c406e-effa-4238-9937-957af3c1a96d");
            ISASSIGNABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9636ddd4-581e-40c7-98e9-2ce66cca47e8");
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
