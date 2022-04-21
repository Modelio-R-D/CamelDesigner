/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("5e111753-f87a-4bbb-a486-896c349e0c93")
    public static final String STEREOTYPE_NAME = "DataResourceFilter";

    @objid ("542b2ad2-acae-4f38-880b-fcaf1749dd01")
    public static final String EVERYDATA_TAGTYPE = "everyData";

    /**
     * Tells whether a {@link DataResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("183b82d9-fdde-4948-b42d-3f184cff43c5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataResourceFilter >> then instantiate a {@link DataResourceFilter} proxy.
     * 
     * @return a {@link DataResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("0f97dc54-6721-40d4-bbc8-687ab5a40d41")
    public static DataResourceFilter create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataResourceFilter.STEREOTYPE_NAME);
        return DataResourceFilter.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DataResourceFilter} proxy from a {@link Class} stereotyped << DataResourceFilter >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link DataResourceFilter} proxy or <i>null</i>.
     */
    @objid ("567e36ea-2e97-4330-a321-9c3ef06e8255")
    public static DataResourceFilter instantiate(final Class obj) {
        return DataResourceFilter.canInstantiate(obj) ? new DataResourceFilter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataResourceFilter} proxy from a {@link Class} stereotyped << DataResourceFilter >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link DataResourceFilter} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dd43e0fa-5255-4df3-9c8d-07db73454a6d")
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
     */
    @objid ("d1cf0188-c716-438a-a03a-81e376013c7e")
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
     */
    @objid ("9549a5c0-9d5e-4227-a2e4-532a644b8426")
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
     */
    @objid ("de428126-c2d5-478d-b272-9d1377f1e834")
    public void addLocations(final Location obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DataResourceFilter.MdaTypes.MDAASSOCDEP);
            d.setName("locations");
            d.putTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "locations");
        }
    }

    @objid ("f52fa1cb-4a20-489d-bdc5-425616a34ee7")
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
     */
    @objid ("9e8e5069-e9df-419c-ae8f-0a77eeafdebd")
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
     */
    @objid ("94a9a557-d2e5-48bb-903a-705fbfec1f61")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d7564d5c-26c7-4357-9555-afc35799badd")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'locations' role.<p>
     * Role description:
     * null
     */
    @objid ("089c4747-d8e0-47c4-bb84-db64d1a171a2")
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

    @objid ("eaf6340e-69a3-4311-ac9c-ec87c6383a7e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'everyData'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("97e5c2dd-3557-44dd-b5de-1abe82ee04c5")
    public boolean isEveryData() {
        return this.elt.isTagged(DataResourceFilter.MdaTypes.EVERYDATA_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'data' role.<p>
     * Role description:
     * null
     */
    @objid ("8c621f28-bea3-4113-82da-ab738eb1b774")
    public boolean removeData(final Data obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DataResourceFilter.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
     */
    @objid ("a8d97959-51ec-41d5-a15a-6ccfede9a246")
    public boolean removeDataInstances(final DataInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DataResourceFilter.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
     */
    @objid ("a0f3d924-d805-4613-973e-7e3bf8e09fe7")
    public boolean removeLocations(final Location obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(DataResourceFilter.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
    @objid ("0bf82ff1-46e0-431e-85d1-151f15e0d225")
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

    @objid ("0eca6026-3a90-4a0e-a391-9c3f22911147")
    protected DataResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("a60319da-e29b-4af0-b3aa-4b4d80f83f8b")
    public static final class MdaTypes {
        @objid ("285bd80b-6a4a-4301-86d3-ce63d58efadd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5aefb296-1f1b-44aa-90d6-bab24ead3d86")
        public static TagType EVERYDATA_TAGTYPE_ELT;

        @objid ("07b3cdee-928c-4d58-a539-353a65f8a563")
        private static Stereotype MDAASSOCDEP;

        @objid ("ce59e24f-8d1d-43d0-bd72-0d9b7299ca5a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("88ff5e76-9bd6-4e34-a88b-b5c6de5ad9c7")
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
