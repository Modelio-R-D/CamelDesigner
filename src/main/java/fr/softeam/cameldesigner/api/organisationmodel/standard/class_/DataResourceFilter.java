/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("de092db1-4495-4d8c-a5ec-0a92c23e337e")
    public static final String STEREOTYPE_NAME = "DataResourceFilter";

    @objid ("e86f4dc9-a518-4010-8711-146fb1dbf5be")
    public static final String EVERYDATA_TAGTYPE = "everyData";

    /**
     * Tells whether a {@link DataResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4bd92afc-b6da-4862-9030-35d60e078f35")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataResourceFilter >> then instantiate a {@link DataResourceFilter} proxy.
     * 
     * @return a {@link DataResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("c0129046-1fb1-457f-9c23-97dc6e81ece2")
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
    @objid ("a524c6f3-14e0-4e7e-9034-6226d8d3caac")
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
    @objid ("1e3b2365-a12a-4288-a030-5ca15c63ade0")
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
    @objid ("50e676e7-eec3-4732-89f1-483d543d798f")
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
    @objid ("ac86b5ae-9d2a-4688-9894-c75192f96878")
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
    @objid ("333906c2-e254-4b11-9644-0091b6bc0134")
    public void addLocations(final Location obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), DataResourceFilter.MdaTypes.MDAASSOCDEP);
            d.setName("locations");
            d.putTagValue(DataResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "locations");
        }
    }

    @objid ("7b0055e7-7f76-41b6-bdd1-dea1cc057bdb")
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
    @objid ("a1b71b0e-daa5-4249-946a-465e9f9dd5ac")
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
     * 
     */
    @objid ("da0dfa8e-17f2-4eb5-9b70-68e9b86f2bc2")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f3fbd02b-43ea-4e74-96f5-46964e20b0a9")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'everyData'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f7355f44-d41d-497b-9ddd-8e4eeb6afd68")
    public String getEveryData() {
        return this.elt.getTagValue(DataResourceFilter.MdaTypes.EVERYDATA_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'locations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("decbd4ff-a160-4ff9-a96e-596e6f6ea167")
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

    @objid ("8d3a3b2c-702a-49e1-9a79-76d0f6dfea3e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'data' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7c92b10f-9a1e-4896-89fc-380bb9f468cf")
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
     * 
     */
    @objid ("a528a7d0-a488-4f9e-b6b8-0b6890c38d70")
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
     * 
     */
    @objid ("1ff506c0-64c7-4aa8-bca5-720f144164a2")
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
    @objid ("15a5924d-edb4-4413-9381-452fdc12a995")
    public void setEveryData(final String value) {
        this.elt.putTagValue(DataResourceFilter.MdaTypes.EVERYDATA_TAGTYPE_ELT, value);
    }

    @objid ("d4cf318b-54ab-4cc7-95e2-f0190d1340ca")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("3dbe67ca-e905-44ae-bde8-2d43a719dc30")
    protected DataResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("a60319da-e29b-4af0-b3aa-4b4d80f83f8b")
    public static final class MdaTypes {
        @objid ("ca66686a-ac54-4208-a4db-6d734eec8240")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("64c93c63-74cd-4c06-a59f-79a846fb35ec")
        public static TagType EVERYDATA_TAGTYPE_ELT;

        @objid ("1893656f-900a-497c-9b4f-5dbba15deddd")
        private static Stereotype MDAASSOCDEP;

        @objid ("4bc05c66-2f2a-402d-8578-ef9da867df86")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a29fec16-53e9-47fd-a707-7a44e9d25535")
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
