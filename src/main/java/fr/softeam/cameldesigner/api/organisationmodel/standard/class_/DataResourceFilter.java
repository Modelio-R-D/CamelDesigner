/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.datamodel.standard.bindableinstance.DataInstanceBindableInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
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
 * Proxy class to handle a {@link Class} with << DataResourceFilter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("791b2878-7c50-4215-a525-604369238537")
public class DataResourceFilter extends ResourceFilter {
<<<<<<< HEAD
    @objid ("7a4df490-adc8-453f-8876-cd0620222503")
    public static final String STEREOTYPE_NAME = "DataResourceFilter";

    @objid ("7cc046c1-737a-4a6a-a13f-56dddf6fe1eb")
=======
    @objid ("016be67b-f5bb-4797-bdd4-add1df71b663")
    public static final String STEREOTYPE_NAME = "DataResourceFilter";

    @objid ("d76814cf-7a8a-4091-8c91-72e75ad5f6f8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String EVERYDATA_TAGTYPE = "everyData";

    /**
     * Tells whether a {@link DataResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("cb6e1363-79df-4c63-84ae-c8b20728db16")
=======
    @objid ("7e29a0e4-5264-40f7-b622-f7922d4904d4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataResourceFilter >> then instantiate a {@link DataResourceFilter} proxy.
     * 
     * @return a {@link DataResourceFilter} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("a2e97423-cf8c-4487-be46-d4ebe1078374")
=======
    @objid ("1f1d1c88-3b51-40eb-98df-4e4d2b3a73d6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataResourceFilter create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataResourceFilter.STEREOTYPE_NAME);
        return DataResourceFilter.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DataResourceFilter} proxy from a {@link Class} stereotyped << DataResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link DataResourceFilter} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("16b87a31-9685-4c44-a209-e12e41f44985")
=======
    @objid ("ea2ab903-ca5b-47df-a6d1-0812bb4bb1c8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataResourceFilter instantiate(final Class obj) {
        return DataResourceFilter.canInstantiate(obj) ? new DataResourceFilter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataResourceFilter} proxy from a {@link Class} stereotyped << DataResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link DataResourceFilter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("e2979c19-0632-4ea8-8da1-69b41bca2a3f")
=======
    @objid ("d2ec998e-5e88-45e8-8fd4-40c335f1017e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DataResourceFilter.canInstantiate(obj))
        	return new DataResourceFilter(obj);
        else
        	throw new IllegalArgumentException("DataResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'data' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("89a2fe8c-d2e6-43c8-b539-a7fec3680cae")
=======
    @objid ("f5d727c1-c16d-4d9d-883c-0a37ab79cc33")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addData(final Data obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DataResourceFilter.MdaTypes.MDAASSOCDEP);
            d.setName("data");
            d.putTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "data");
        }
    }

    /**
     * Add a value to the 'dataInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("c73eb5a1-10e6-4494-8038-c699b7c3c4f4")
=======
    @objid ("2c056457-7fec-4fc5-a249-687d9bb188f6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDataInstances(final DataInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DataResourceFilter.MdaTypes.MDAASSOCDEP);
            d.setName("dataInstances");
            d.putTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "dataInstances");
        }
    }

    /**
     * Add a value to the 'locations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("7b8e6772-141a-4249-8bc6-54e517e92509")
=======
    @objid ("992d945b-0128-4270-bead-2b4a48c3c5aa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addLocations(final Location obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DataResourceFilter.MdaTypes.MDAASSOCDEP);
            d.setName("locations");
            d.putTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "locations");
        }
    }

<<<<<<< HEAD
    @objid ("46442216-8922-499b-9113-7dac55a328a9")
=======
    @objid ("a572420f-4441-480d-9da2-33d9142e44cc")
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
        DataResourceFilter other = (DataResourceFilter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'data' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("1b5e107d-2f9b-4729-8a32-0544b78f8c87")
=======
    @objid ("ee19a506-a80e-4e2f-afcb-3cbecffc93c1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<Data> getData() {
        List<Data> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(DataResourceFilter.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "data")){
              if (Data.canInstantiate(d.getDependsOn()))
                results.add((Data)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Data.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'dataInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("077056ca-614b-406b-874b-17e4e3ddb386")
=======
    @objid ("b976513b-365f-449f-8162-a69e4e655401")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<DataInstance> getDataInstances() {
        List<DataInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(DataResourceFilter.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "dataInstances")){
              if (DataInstanceBindableInstance.canInstantiate(d.getDependsOn()))
                results.add((DataInstanceBindableInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceBindableInstance.MdaTypes.STEREOTYPE_ELT.getName()));
              if (DataInstance.canInstantiate(d.getDependsOn()))
                results.add((DataInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstance.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("5be5121d-9f4b-4083-8158-30404ad56441")
=======
    @objid ("725ad4ad-4a76-4fcc-9017-0376a32b5262")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6166fc76-42a7-4f42-88df-6e3ede243fc2")
=======
    @objid ("e2f1cff6-2608-4c3a-989a-4910a56993a5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<Location> getLocations() {
        List<Location> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(DataResourceFilter.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "locations")){
              if (CloudLocation.canInstantiate(d.getDependsOn()))
                results.add((CloudLocation)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CloudLocation.MdaTypes.STEREOTYPE_ELT.getName()));
              if (GeographicalRegion.canInstantiate(d.getDependsOn()))
                results.add((GeographicalRegion)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("d7711ab7-0628-4322-b983-2d0fe9574c35")
=======
    @objid ("99015f6a-18f0-4390-98e3-95d3e4e3469c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'everyData'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("16990002-141e-4f58-9a57-b4c235c7d296")
=======
    @objid ("7f64ccbb-3066-4b40-abae-93ccf5886118")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isEveryData() {
        return this.elt.isTagged(DataResourceFilter.MdaTypes.EVERYDATA_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'data' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("c90254ab-531c-4bf4-b3fb-e903be513112")
=======
    @objid ("4c20487b-f5c0-48ef-b8d0-9d61d721d8d4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeData(final Data obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DataResourceFilter.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "data")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'dataInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a34a3f98-2235-4891-a753-32f36cfeaf80")
=======
    @objid ("9085c4d8-718d-492c-8d2d-d27f08093bb7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDataInstances(final DataInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DataResourceFilter.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "dataInstances")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'locations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("e8f6cc87-12e7-43b5-ad60-0fa620c77a6f")
=======
    @objid ("deefc1bf-e5a0-40b2-9130-083131108b8d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeLocations(final Location obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DataResourceFilter.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "locations")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for boolean property 'everyData'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("dd38a0f4-d06a-43f3-aff7-0276927108d5")
=======
    @objid ("eb3eda86-0605-415c-af8f-c4848ba8e80d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setEveryData(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(DataResourceFilter.MdaTypes.EVERYDATA_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(DataResourceFilter.MdaTypes.EVERYDATA_TAGTYPE_ELT);
    }

    @objid ("16858fa2-9c7a-4d14-bce1-5ad19622f1ee")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("88059dc4-a3b6-499f-bbbf-f047bbdd8f27")
=======
    @objid ("7c3d0e06-de57-4bef-b7c7-1fc6b5bcce18")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DataResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("a60319da-e29b-4af0-b3aa-4b4d80f83f8b")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("3e51b86d-9714-47a0-824e-f8d3b3b9ee14")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a14ae1c1-1f21-4e3d-a908-c45528f71618")
        public static TagType EVERYDATA_TAGTYPE_ELT;

        @objid ("02b151b0-0ba1-4c6c-be84-04b6b656cac1")
        private static Stereotype MDAASSOCDEP;

        @objid ("65f65b1d-9f3c-485f-b85c-967555f00277")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ac10b79e-e5af-4d78-a37f-a7a808f090a1")
=======
        @objid ("cb4f9333-bf02-4d93-8bfc-db2e6fe4feba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("319d8f10-ab9e-4157-b911-26d53ffd1e8f")
        public static TagType EVERYDATA_TAGTYPE_ELT;

        @objid ("dde4f444-4d83-48b4-a2c7-96c85d7645b2")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ec2e670-c5ac-4afd-975e-537a125eb49d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b7b05a20-fc4c-452f-9456-8c9349144247")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "db53c8ff-ef9a-4bc2-bbfa-af051fcaa66d");
            EVERYDATA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "224a9d86-f0da-48c2-aee2-621dc2822fd3");
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
