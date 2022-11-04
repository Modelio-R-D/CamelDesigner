/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataInstanceModelDiagram;
import fr.softeam.cameldesigner.api.datamodel.standard.bindableinstance.DataInstanceBindableInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
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
    @objid ("5af7470a-701b-4be9-8be5-745cab3f0cc2")
    public static final String STEREOTYPE_NAME = "DataInstanceModel";

    /**
     * Tells whether a {@link DataInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1ab28fa2-9bd8-4a91-bb35-5448a9cd5234")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DataInstanceModel >> then instantiate a {@link DataInstanceModel} proxy.
     * 
     * @return a {@link DataInstanceModel} proxy on the created {@link Package}.
     */
    @objid ("ed20f1c9-0fd6-4c32-bbd0-835940c9a591")
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
    @objid ("8cdd3f7f-e07e-4573-9fc6-08236704a44b")
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
    @objid ("6f3496a1-2d2c-4140-9c26-f9480a93db7b")
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
    @objid ("85b8327c-0ebd-44ea-bd53-37b635a68afd")
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
    @objid ("0bcd8c19-5204-47f0-8da6-fea4c95e1cde")
    public void addDataSourcesInstances(final DataSourceInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("462f8083-035a-40ea-98bf-c97284d39660")
    public void addDiagrams(final DataInstanceModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    @objid ("c07d9079-d9d0-4325-b928-bab33367ade9")
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
    @objid ("402053e5-6e3c-4fde-ba0e-e0e820834676")
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
    @objid ("71a56f22-e6de-47d9-9667-e67642087165")
    public List<DataSourceInstance> getDataSourcesInstances() {
        List<DataSourceInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (DataSourceInstance.canInstantiate(mObj))
        			results.add((DataSourceInstance)CamelDesignerProxyFactory.instantiate(mObj, DataSourceInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f0dbf51b-855f-4860-89fe-0089c246ac7d")
    public List<DataInstanceModelDiagram> getDiagrams() {
        List<DataInstanceModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (DataInstanceModelDiagram.canInstantiate(mObj))
        			results.add((DataInstanceModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, DataInstanceModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("6128e428-95cf-40fc-a943-f1522e07a158")
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
    @objid ("0dd3ffc9-f39a-4258-a9fd-5366633dc0da")
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

    @objid ("c0b9de59-3c55-483c-82dc-14d3f289c915")
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
    @objid ("3522f1cc-036a-4f0a-afd4-292e7fb2128a")
    public boolean removeDataInstances(final DataInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'dataSourcesInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4401d318-589d-4a6c-acaf-efd7ccc17b53")
    public boolean removeDataSourcesInstances(final DataSourceInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("83e90772-f933-44f9-b105-badf691b82ff")
    public boolean removeDiagrams(final DataInstanceModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("748eef14-1268-4890-ac7e-2eaa3e005984")
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

    @objid ("6c0fb87b-7264-44ac-8468-67dde8944d79")
    protected DataInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("1b14823c-7143-4254-9af2-2c028081c38f")
    public static final class MdaTypes {
        @objid ("81aa5b00-1d5f-4bf2-9f08-ee166c755374")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bd1a91cf-ec8e-4639-a1ae-fc69656ca731")
        private static Stereotype MDAASSOCDEP;

        @objid ("3b6a06bc-ce1c-4698-8532-094abfff0cc4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e2bb3ec4-c237-4717-ade7-6d749950c9f5")
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
