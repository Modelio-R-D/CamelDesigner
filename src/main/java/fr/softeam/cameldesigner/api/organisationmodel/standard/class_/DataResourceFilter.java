/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
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
    @objid ("7377d1bb-f7c0-4c4b-9bce-42faacb6545b")
    public static final String STEREOTYPE_NAME = "DataResourceFilter";

    @objid ("ca191fc3-c41f-4d73-b80a-b3b52763f1fa")
    public static final String EVERYDATA_TAGTYPE = "everyData";

    /**
     * Tells whether a {@link DataResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e07e678e-dcf3-4ff2-a2e6-acbcb5801664")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataResourceFilter >> then instantiate a {@link DataResourceFilter} proxy.
     * 
     * @return a {@link DataResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("05553ac4-e7a0-4e43-81f7-44f2dad57435")
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
    @objid ("6fb0c5fd-2601-4725-9707-e3b7f6deeee0")
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
    @objid ("7e6585ff-7b5b-40a3-86cc-af0dfa2a330e")
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
    @objid ("a35cebd0-c826-4523-a7e6-6c33e6fca746")
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
    @objid ("d68f65cb-8e41-4c16-a27c-aaf415af8d1b")
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
    @objid ("5916855c-554b-4b37-92ea-cbcf5f82b250")
    public void addLocations(final Location obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DataResourceFilter.MdaTypes.MDAASSOCDEP);
            d.setName("locations");
            d.putTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "locations");
        }
    }

    @objid ("75fb5738-d7f7-47ff-b7b5-0f009f65774c")
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
    @objid ("4d4f9c45-d564-4392-8086-0b636481fd85")
    public List<Data> getData() {
        List<Data> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(DataResourceFilter.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "data")
              && Data.canInstantiate(d.getDependsOn()))
                results.add((Data)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Data.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'dataInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("95eabb94-feec-4a2d-8e48-c9d2c0c845f5")
    public List<DataInstance> getDataInstances() {
        List<DataInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(DataResourceFilter.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "dataInstances")
              && DataInstance.canInstantiate(d.getDependsOn()))
                results.add((DataInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstance.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ef39f7ac-0fdf-49b0-b460-a5b169cba197")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'everyData'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("48fece9b-59c8-42ec-b200-45ade51ed65b")
    public String getEveryData() {
        return this.elt.getTagValue(DataResourceFilter.MdaTypes.EVERYDATA_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'locations' role.<p>
     * Role description:
     * null
     */
    @objid ("95113209-e538-4463-92af-ee463d876d97")
    public List<Location> getLocations() {
        List<Location> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(DataResourceFilter.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "locations")
              && Location.canInstantiate(d.getDependsOn()))
                results.add((Location)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Location.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b6283544-187d-4873-957f-2af0fbb834e4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'data' role.<p>
     * Role description:
     * null
     */
    @objid ("7f97c5b3-f543-4642-9d0c-117a9e75c9f3")
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
    @objid ("bb169e03-dda0-49e8-b3c3-e013a0d10cfe")
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
    @objid ("ed3afb22-bdc6-4919-af91-3df2b7ddacb7")
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
     * Setter for string property 'everyData'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1d0b733f-9b12-4759-b809-87cc8e477cb7")
    public void setEveryData(final String value) {
        this.elt.putTagValue(DataResourceFilter.MdaTypes.EVERYDATA_TAGTYPE_ELT, value);
    }

    @objid ("d4cf318b-54ab-4cc7-95e2-f0190d1340ca")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("0c7ace56-596d-4a5c-b517-57af8a37b9b6")
    protected DataResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("a60319da-e29b-4af0-b3aa-4b4d80f83f8b")
    public static final class MdaTypes {
        @objid ("0ac55fb2-570d-4c0e-a7ed-68e19ce21486")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("799842d7-69a7-431f-a374-207f6d4f50f8")
        public static TagType EVERYDATA_TAGTYPE_ELT;

        @objid ("5323fffa-3400-4da3-a2fc-212337599a58")
        private static Stereotype MDAASSOCDEP;

        @objid ("2361c1f2-0728-4371-b7a9-c51a088b5901")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7bba4d4c-ad12-4b60-9a8e-7dfea32c1b57")
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
