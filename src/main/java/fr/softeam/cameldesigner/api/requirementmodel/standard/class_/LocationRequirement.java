/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << LocationRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("74a3ed13-52f1-4d74-b05d-c1717fddaad8")
public class LocationRequirement extends HardRequirement {
    @objid ("8bba8165-c0ee-4830-ae2b-fe52636580a3")
    public static final String STEREOTYPE_NAME = "LocationRequirement";

    @objid ("354b9563-fbdb-4bf5-8d2f-bc1a14c343c4")
    public static final String ALLREQUIRED_TAGTYPE = "allRequired";

    /**
     * Tells whether a {@link LocationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << LocationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1817e057-0981-4670-a5c8-afad42e0b13f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << LocationRequirement >> then instantiate a {@link LocationRequirement} proxy.
     * 
     * @return a {@link LocationRequirement} proxy on the created {@link Class}.
     */
    @objid ("fb26a6e3-d160-4134-8abf-0bab874fb47b")
    public static LocationRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, LocationRequirement.STEREOTYPE_NAME);
        return LocationRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link LocationRequirement} proxy from a {@link Class} stereotyped << LocationRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link LocationRequirement} proxy or <i>null</i>.
     */
    @objid ("a2bf09fc-80b8-4985-9b5b-5a9cb3bdf059")
    public static LocationRequirement instantiate(final Class obj) {
        return LocationRequirement.canInstantiate(obj) ? new LocationRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LocationRequirement} proxy from a {@link Class} stereotyped << LocationRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link LocationRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c53449ee-0a6a-4768-a9ab-9cf807b041bd")
    public static LocationRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (LocationRequirement.canInstantiate(obj))
        	return new LocationRequirement(obj);
        else
        	throw new IllegalArgumentException("LocationRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'locations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b695072d-63d1-475c-a74d-1b1ee810e2de")
    public void addLocations(final Location obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LocationRequirement.MdaTypes.MDAASSOCDEP);
            d.setName("locations");
            d.putTagValue(LocationRequirement.MdaTypes.MDAASSOCDEP_ROLE, "locations");
        }
    }

    @objid ("bbf9d7fa-6584-4ee0-9bdc-d7b1749b2c8f")
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
        LocationRequirement other = (LocationRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("04e23a47-c000-4d01-9e76-633ca344f2ae")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'locations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a5b563d2-57f8-45b0-bed4-4b95e46874c1")
    public List<Location> getLocations() {
        List<Location> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(LocationRequirement.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(LocationRequirement.MdaTypes.MDAASSOCDEP_ROLE), "locations")){
              if (CloudLocation.canInstantiate(d.getDependsOn()))
                results.add((CloudLocation)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CloudLocation.MdaTypes.STEREOTYPE_ELT.getName()));
              if (GeographicalRegion.canInstantiate(d.getDependsOn()))
                results.add((GeographicalRegion)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("aadef773-8823-4dd9-8106-8d8a99133ca0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'allRequired'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e6fb8139-8b72-41a0-8214-1d2998e5902e")
    public boolean isAllRequired() {
        return this.elt.isTagged(LocationRequirement.MdaTypes.ALLREQUIRED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'locations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9e7517bb-634f-4b87-9ebd-40002bdb3613")
    public boolean removeLocations(final Location obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(LocationRequirement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(LocationRequirement.MdaTypes.MDAASSOCDEP_ROLE), "locations")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for boolean property 'allRequired'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cdad027b-dcbb-4575-a0a9-87a1d157810c")
    public void setAllRequired(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(LocationRequirement.MdaTypes.ALLREQUIRED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(LocationRequirement.MdaTypes.ALLREQUIRED_TAGTYPE_ELT);
    }

    @objid ("d2ba389f-3214-47da-ba0a-9dfed12a11ad")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("81f67b74-16af-4058-af6d-01a4bc5ab0fc")
    protected LocationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("6baddae1-dc4f-440f-a708-5529c6ec0aa5")
    public static final class MdaTypes {
        @objid ("ac45749a-d779-44ab-9c70-0ac85ca5639b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("510ee166-9057-4649-8145-9a49f490b1d4")
        public static TagType ALLREQUIRED_TAGTYPE_ELT;

        @objid ("30abc244-7a68-42f8-a37a-7b0b3831f508")
        private static Stereotype MDAASSOCDEP;

        @objid ("dcd9fdfa-aa79-4265-a912-832ec15b298c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f0e9865e-adad-4956-9295-10fc49c0a70b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "72da0f17-5434-4558-b50f-7be0430c3f2b");
            ALLREQUIRED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3af4908e-00c9-4466-8e0c-d74baa35afe1");
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
