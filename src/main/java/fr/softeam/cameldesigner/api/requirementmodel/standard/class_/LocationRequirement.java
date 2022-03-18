/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("67aaeb27-b024-4280-8311-85c159505335")
    public static final String STEREOTYPE_NAME = "LocationRequirement";

    @objid ("231effaa-7b44-4afe-9a1f-9419658d00b9")
    public static final String ALLREQUIRED_TAGTYPE = "allRequired";

    /**
     * Tells whether a {@link LocationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << LocationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("361493a8-15ef-4d57-b319-134526f24297")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << LocationRequirement >> then instantiate a {@link LocationRequirement} proxy.
     * 
     * @return a {@link LocationRequirement} proxy on the created {@link Class}.
     */
    @objid ("aa2b4255-0eb9-4150-96cc-31a030085dec")
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
    @objid ("6a6ccad8-8dc0-4f0e-812a-4070c999fcce")
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
    @objid ("b98ed2f6-7d57-4f40-b4e1-cddf41921e15")
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
    @objid ("49043acd-43b3-4cfc-8877-dee993152429")
    public void addLocations(final Location obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LocationRequirement.MdaTypes.MDAASSOCDEP);
            d.setName("locations");
            d.putTagValue(LocationRequirement.MdaTypes.MDAASSOCDEP_ROLE, "locations");
        }
    }

    @objid ("8750fab1-1db8-4d18-a599-74e1e1115ff7")
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
    @objid ("c601ad52-51dc-478c-a951-300621ecebc9")
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
    @objid ("a5890480-1197-4dd8-ae4e-89960a4b8a47")
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

    @objid ("83158167-75c2-4328-9a4c-a4311b4b23f2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'allRequired'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6c8a1930-3d28-4bae-b6de-691d94730354")
    public boolean isAllRequired() {
        return this.elt.isTagged(LocationRequirement.MdaTypes.ALLREQUIRED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'locations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("620f8b3e-6fa3-4f57-8447-31dda0163682")
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
    @objid ("f4a65a9c-df9e-4145-a881-c4d7d18513ff")
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

    @objid ("1982e05d-3a08-4cfc-ac5a-758b45e8d108")
    protected LocationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("6baddae1-dc4f-440f-a708-5529c6ec0aa5")
    public static final class MdaTypes {
        @objid ("c407f794-d75a-41ca-9952-bd0fd33307a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ca874117-4a19-4efd-929e-db9cf9819522")
        public static TagType ALLREQUIRED_TAGTYPE_ELT;

        @objid ("cd64b6b9-84f0-40d6-88f6-bd4709e0fff9")
        private static Stereotype MDAASSOCDEP;

        @objid ("051b4ac7-5575-4478-9999-0936c6388a8f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ffb19928-2e99-4418-8092-f4e7940c63ce")
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
