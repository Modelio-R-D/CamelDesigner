/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.datamodel.standard.bindableinstance.DataInstanceBindableInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << DataInstanceModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2bb251af-61c2-4baa-b91a-9e56692a7104")
public class DataInstanceModel extends DataModel {
    @objid ("6c7b3021-f982-4b4e-878b-db867adb7e40")
    public static final String STEREOTYPE_NAME = "DataInstanceModel";

    /**
     * Tells whether a {@link DataInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("683c8dfb-e8d8-427b-9110-6f023d420841")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DataInstanceModel >> then instantiate a {@link DataInstanceModel} proxy.
     * 
     * @return a {@link DataInstanceModel} proxy on the created {@link Package}.
     */
    @objid ("a9b45336-3d87-4c79-a40e-9d3f382b0262")
    public static DataInstanceModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModel.STEREOTYPE_NAME);
        return DataInstanceModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link DataInstanceModel} proxy from a {@link Package} stereotyped << DataInstanceModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link DataInstanceModel} proxy or <i>null</i>.
     */
    @objid ("eadc2fe9-176e-4dab-9fa9-1377fc133faf")
    public static DataInstanceModel instantiate(final Package obj) {
        return DataInstanceModel.canInstantiate(obj) ? new DataInstanceModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstanceModel} proxy from a {@link Package} stereotyped << DataInstanceModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link DataInstanceModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("87efe09c-b02b-43e8-b688-16391cb09f95")
    public static DataInstanceModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (DataInstanceModel.canInstantiate(obj))
        	return new DataInstanceModel(obj);
        else
        	throw new IllegalArgumentException("DataInstanceModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'dataInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("05d5415d-5e2c-46d1-9b8b-06b9a2d7a625")
    public void addDataInstances(final DataInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'dataSourcesInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("aa863002-b18f-43c4-a53b-673fe7d7c604")
    public void addDataSourcesInstances(final DataSourceInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("d75e2704-a4ce-4529-b255-81a1998020a3")
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
        DataInstanceModel other = (DataInstanceModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'dataInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("10f08fcf-7cb1-4f96-b9c0-ed16d30491ee")
    public List<DataInstance> getDataInstances() {
        List<DataInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (DataInstanceBindableInstance.canInstantiate(mObj))
        			results.add((DataInstanceBindableInstance)CamelDesignerProxyFactory.instantiate(mObj, DataInstanceBindableInstance.STEREOTYPE_NAME));
        	if (DataInstance.canInstantiate(mObj))
        			results.add((DataInstance)CamelDesignerProxyFactory.instantiate(mObj, DataInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'dataSourcesInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("62a8b9e8-a433-4459-84eb-ea52fd8e588a")
    public List<DataSourceInstance> getDataSourcesInstances() {
        List<DataSourceInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (DataSourceInstance.canInstantiate(mObj))
        			results.add((DataSourceInstance)CamelDesignerProxyFactory.instantiate(mObj, DataSourceInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("0c57e6b1-7914-4d28-8721-a1d05161168b")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9ebe908f-a902-45df-9282-ae7de713a4ed")
    public DataTypeModel getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataInstanceModel.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "type")){
                  if (DataTypeModel.canInstantiate(d.getDependsOn()))
                     return (DataTypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataTypeModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("c488bbde-051e-4c81-aa75-6edf7eb90efd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'dataInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f804f601-3e2a-4625-9957-2bce960e2d60")
    public boolean removeDataInstances(final DataInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'dataSourcesInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("af515593-dd5e-4ab4-96ea-85da7cdbd432")
    public boolean removeDataSourcesInstances(final DataSourceInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("292dc699-a3e2-48f7-bc93-602bb59b34cf")
    public void setType(final DataTypeModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DataInstanceModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DataInstanceModel.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(DataInstanceModel.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("d511c7c9-d884-4cf9-b896-dd88795cd9d7")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getDataInstances());
        result.addAll(getDataSourcesInstances());
        return result;
    }

    @objid ("5e22cf83-3be4-44e1-ae8a-0c03de055f76")
    protected DataInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("1b14823c-7143-4254-9af2-2c028081c38f")
    public static final class MdaTypes {
        @objid ("3611bebd-66cd-45c1-ae3d-c0e15486c3ce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fcfd0330-3089-4728-ae95-c9473b8a85e1")
        private static Stereotype MDAASSOCDEP;

        @objid ("b821d95d-ae59-481f-9ced-791b3b4bb21e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("28014dfe-07ce-4808-91a7-fbc9018a10ff")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5f0d05aa-3af3-4ce2-b44f-e7f797acc992");
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
