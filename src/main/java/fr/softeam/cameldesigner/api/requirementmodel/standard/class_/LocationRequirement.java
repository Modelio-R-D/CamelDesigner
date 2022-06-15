/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("1ef42d24-8666-48a9-a508-cf263f8cf1f8")
    public static final String STEREOTYPE_NAME = "LocationRequirement";

    @objid ("4eca8728-16c5-4685-ba32-f9fa89a4c2dc")
    public static final String ALLREQUIRED_TAGTYPE = "allRequired";

    /**
     * Tells whether a {@link LocationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << LocationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f1767882-c802-4d2c-a1f0-df0b1f71c6d2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << LocationRequirement >> then instantiate a {@link LocationRequirement} proxy.
     * 
     * @return a {@link LocationRequirement} proxy on the created {@link Class}.
     */
    @objid ("3e41c61f-d577-4bb7-9a44-3ce3c08f478e")
    public static LocationRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, LocationRequirement.STEREOTYPE_NAME);
        return LocationRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link LocationRequirement} proxy from a {@link Class} stereotyped << LocationRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link LocationRequirement} proxy or <i>null</i>.
     */
    @objid ("19775447-9efa-455d-90fd-e90e27bc65e3")
    public static LocationRequirement instantiate(final Class obj) {
        return LocationRequirement.canInstantiate(obj) ? new LocationRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LocationRequirement} proxy from a {@link Class} stereotyped << LocationRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link LocationRequirement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("524d18ff-f584-4ca4-8723-b058f90f058a")
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
     */
    @objid ("2d36917e-e49b-4545-a226-f3fde1bfa2bc")
    public void addLocations(final Location obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LocationRequirement.MdaTypes.MDAASSOCDEP);
            d.setName("locations");
            d.putTagValue(LocationRequirement.MdaTypes.MDAASSOCDEP_ROLE, "locations");
        }
    }

    @objid ("a2efc36b-b36e-4b8d-8f72-fbbe45b5f35b")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f4e93185-69fd-4fde-8618-b38d47270e42")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'locations' role.<p>
     * Role description:
     * null
     */
    @objid ("cc24a9ba-a26a-4bac-86e7-0d31955570af")
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

    @objid ("e2f2f1cd-1547-42f9-aaeb-8d211f070ece")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'allRequired'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8d7b901c-3338-4ba0-ad51-4acd3ee9aaa1")
    public boolean isAllRequired() {
        return this.elt.isTagged(LocationRequirement.MdaTypes.ALLREQUIRED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'locations' role.<p>
     * Role description:
     * null
     */
    @objid ("48ba23c7-eb32-459c-a05f-a7e83ac1fc12")
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
    @objid ("be2dd450-9cb0-41e3-91a1-bb74abcd3edb")
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

    @objid ("5da7c3bb-147b-44e1-a635-c23cf4289d09")
    protected LocationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("6baddae1-dc4f-440f-a708-5529c6ec0aa5")
    public static final class MdaTypes {
        @objid ("5a2af7a7-25bf-44ab-93f4-f9f47bc80e3b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f0fdac9b-2725-4605-8461-9364b8dac875")
        public static TagType ALLREQUIRED_TAGTYPE_ELT;

        @objid ("3bfe8026-2178-42d0-83f7-1fd54f8a769f")
        private static Stereotype MDAASSOCDEP;

        @objid ("763f9986-93af-4fda-a715-21e2ca8f3fdc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("daf2733d-24af-4af9-a807-836dbd012e2b")
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
