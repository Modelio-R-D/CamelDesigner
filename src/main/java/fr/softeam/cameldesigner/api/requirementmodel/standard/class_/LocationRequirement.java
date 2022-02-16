/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("7c29ef10-09db-4c0c-9df1-277b88b10a8e")
    public static final String STEREOTYPE_NAME = "LocationRequirement";

    @objid ("f1ed27cb-bd25-443e-98ed-93f4d7f0398f")
    public static final String ALLREQUIRED_TAGTYPE = "allRequired";

    /**
     * Tells whether a {@link LocationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << LocationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fa4c272e-4da0-4def-8944-ed4f584fc8ef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << LocationRequirement >> then instantiate a {@link LocationRequirement} proxy.
     * 
     * @return a {@link LocationRequirement} proxy on the created {@link Class}.
     */
    @objid ("335355b6-bee7-4d69-ad94-432eeb60198f")
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
    @objid ("2bb4dcc9-cf67-45d6-bf69-94f2f647fd69")
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
    @objid ("7e347071-6c5c-4aab-8aaf-80fe2f277e1d")
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
    @objid ("3fe05b0e-232e-4185-a5ba-0018224a5f7e")
    public void addLocations(final Location obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LocationRequirement.MdaTypes.MDAASSOCDEP);
            d.setName("locations");
            d.putTagValue(LocationRequirement.MdaTypes.MDAASSOCDEP_ROLE, "locations");
        }
    }

    @objid ("189521b4-6560-4abd-997f-5c1c63d3cfbd")
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
    @objid ("572fc165-782d-42f3-b8ac-46eab002744d")
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
    @objid ("17380dc6-06d2-439d-941b-3708019356aa")
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

    @objid ("549b25ac-534e-4c04-b2af-3da9fbaf8554")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'allRequired'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eda63085-04a7-4b05-abfe-bdaca66a8442")
    public boolean isAllRequired() {
        return this.elt.isTagged(LocationRequirement.MdaTypes.ALLREQUIRED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'locations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8eb2a1bf-9f82-45b2-8c7a-add2f45e9986")
    public boolean removeLocations(final Location obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(LocationRequirement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(LocationRequirement.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
    @objid ("16696465-80cf-4ad0-a2ff-c09730a76e0d")
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

    @objid ("2a97dd16-4140-49b3-b44b-d77d39be0043")
    protected LocationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("6baddae1-dc4f-440f-a708-5529c6ec0aa5")
    public static final class MdaTypes {
        @objid ("b95ebed2-4b48-4ddc-9412-6899ad2a9edd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8d393893-f366-493f-a391-65894037a22d")
        public static TagType ALLREQUIRED_TAGTYPE_ELT;

        @objid ("f23c3a10-60bb-4e18-8a5a-faab68926aee")
        private static Stereotype MDAASSOCDEP;

        @objid ("e4160a28-28b1-4979-b4d3-23ae1af0c48a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2a4702da-71c7-4c1c-9e84-a7a2beb1cea8")
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
