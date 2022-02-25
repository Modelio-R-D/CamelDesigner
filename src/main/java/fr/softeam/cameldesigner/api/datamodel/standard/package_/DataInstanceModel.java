/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("60a0a7b0-70fb-4162-9337-33d0f9e12e49")
    public static final String STEREOTYPE_NAME = "DataInstanceModel";

    /**
     * Tells whether a {@link DataInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("91ea784d-8bda-49e8-8ecf-d463fa5bdfa0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DataInstanceModel >> then instantiate a {@link DataInstanceModel} proxy.
     * 
     * @return a {@link DataInstanceModel} proxy on the created {@link Package}.
     */
    @objid ("a8e0cf89-18e6-4e6c-9b9f-85632e3045ac")
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
    @objid ("2c4e70ec-4e7a-4ee4-a2e5-c41fac5a5b49")
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
    @objid ("eb8f9329-adbf-45f0-95a7-f669413998b4")
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
    @objid ("932eef47-5d9a-48fa-990c-1fd1723de5d5")
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
    @objid ("76b4b6ca-3c3e-44a1-bfb4-786cf394e340")
    public void addDataSourcesInstances(final DataSourceInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("5193321c-44c1-4697-ba6f-bc9ae67ab719")
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
    @objid ("9935ad63-3fb1-4b26-af5f-9a6796ed46c0")
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
    @objid ("5e4fb42d-b61c-4cff-96e7-836a82c54983")
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
    @objid ("b769bd72-50b0-4df8-8edc-bae544625741")
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
    @objid ("9bde11a8-c3f8-4e28-ba96-d9fc98d2baf7")
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

    @objid ("54e81c3d-f2c6-4ec6-800c-817b355464ef")
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
    @objid ("37b3e259-9111-4f15-a00f-8a2de72d5828")
    public boolean removeDataInstances(final DataInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'dataSourcesInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8addad83-8b68-4f92-8f22-0c8e8a172da9")
    public boolean removeDataSourcesInstances(final DataSourceInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bb3c87fd-da42-4c8e-a646-8bd5d1e95733")
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
        return result;
    }

    @objid ("a74efedc-8f06-42cd-b2f8-52da3128c9a1")
    protected DataInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("1b14823c-7143-4254-9af2-2c028081c38f")
    public static final class MdaTypes {
        @objid ("d9fa1889-cb60-49a5-8ecb-39d8fd963c15")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bac19f8f-4593-45f9-a0ec-4e93bdeb195b")
        private static Stereotype MDAASSOCDEP;

        @objid ("71105009-120a-455c-992b-b63cbf4fa97d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c47721d3-40e1-4f3c-8a72-f57097c36e1a")
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
