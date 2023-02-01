/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("09d029fd-d263-433c-995e-2c13f86dd5ff")
=======
    @objid ("5af7470a-701b-4be9-8be5-745cab3f0cc2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DataInstanceModel";

    /**
     * Tells whether a {@link DataInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d421096e-8725-492f-8b95-81534229f442")
=======
    @objid ("1ab28fa2-9bd8-4a91-bb35-5448a9cd5234")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DataInstanceModel >> then instantiate a {@link DataInstanceModel} proxy.
     * 
     * @return a {@link DataInstanceModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("821fd9bb-ab8e-4f1a-a653-a5829c59bdf8")
=======
    @objid ("ed20f1c9-0fd6-4c32-bbd0-835940c9a591")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d8a3ec17-0973-414e-8bf9-da0e325945ea")
=======
    @objid ("8cdd3f7f-e07e-4573-9fc6-08236704a44b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7dbb1d6c-de87-4d57-980b-7c7507005335")
=======
    @objid ("6f3496a1-2d2c-4140-9c26-f9480a93db7b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("bf5d975f-7689-41c9-947f-118a903cab70")
=======
    @objid ("85b8327c-0ebd-44ea-bd53-37b635a68afd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2e1ee5b2-470f-4525-8d82-51aa2eac7204")
=======
    @objid ("0bcd8c19-5204-47f0-8da6-fea4c95e1cde")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("24a62783-c3be-4eca-8310-7af11dd9d7a9")
=======
    @objid ("462f8083-035a-40ea-98bf-c97284d39660")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final DataInstanceModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("fbbe68ce-c5d0-45d1-862d-7f86b4f01a23")
=======
    @objid ("c07d9079-d9d0-4325-b928-bab33367ade9")
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
        DataInstanceModel other = (DataInstanceModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'dataInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("fa1170ec-f9ea-4add-8805-dde8bb43db46")
=======
    @objid ("402053e5-6e3c-4fde-ba0e-e0e820834676")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2a5265f0-f726-45bf-bab9-9f6faafeb037")
=======
    @objid ("71a56f22-e6de-47d9-9667-e67642087165")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c4d1322b-429e-42dc-871e-70b502457b23")
=======
    @objid ("f0dbf51b-855f-4860-89fe-0089c246ac7d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("8539eff8-d0d4-4a77-bdb1-10f1ec49c37d")
=======
    @objid ("6128e428-95cf-40fc-a943-f1522e07a158")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("eee6bfb5-67dc-42af-b8c5-0ca584fc9b5e")
=======
    @objid ("0dd3ffc9-f39a-4258-a9fd-5366633dc0da")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("072373d3-e17b-4f76-bbf1-a2ee22007c37")
=======
    @objid ("c0b9de59-3c55-483c-82dc-14d3f289c915")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6c29c5ec-48e6-4fbf-98f1-7227b81b3849")
=======
    @objid ("3522f1cc-036a-4f0a-afd4-292e7fb2128a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDataInstances(final DataInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'dataSourcesInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f3f0d172-aee8-4469-93ef-d67b1011ef22")
=======
    @objid ("4401d318-589d-4a6c-acaf-efd7ccc17b53")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDataSourcesInstances(final DataSourceInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("96954ce7-8799-4c0d-afcf-8f8365060842")
=======
    @objid ("83e90772-f933-44f9-b105-badf691b82ff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final DataInstanceModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("cfc20b9c-f1ee-4e82-b88c-1ed95badad89")
=======
    @objid ("748eef14-1268-4890-ac7e-2eaa3e005984")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("25bb4fb8-1071-431d-af45-72c1109ef4aa")
=======
    @objid ("6c0fb87b-7264-44ac-8468-67dde8944d79")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DataInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("1b14823c-7143-4254-9af2-2c028081c38f")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("95f19984-8bf3-4310-bccb-74dfaefa2047")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cbae20db-b253-404e-878d-67a45a9210ed")
        private static Stereotype MDAASSOCDEP;

        @objid ("32ba0c97-9549-4608-b525-b7bcc01b012b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4aa10268-e7a9-4b67-bcf5-e7da4b86f4d1")
=======
        @objid ("81aa5b00-1d5f-4bf2-9f08-ee166c755374")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bd1a91cf-ec8e-4639-a1ae-fc69656ca731")
        private static Stereotype MDAASSOCDEP;

        @objid ("3b6a06bc-ce1c-4698-8532-094abfff0cc4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e2bb3ec4-c237-4717-ade7-6d749950c9f5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
