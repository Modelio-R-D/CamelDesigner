/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
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
    @objid ("b030effb-fa7a-41ed-b5f6-8898830d8dd9")
    public static final String STEREOTYPE_NAME = "DataInstanceModel";

    /**
     * Tells whether a {@link DataInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("639269bf-05d3-4ac2-a33e-cff253e2cf9c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DataInstanceModel >> then instantiate a {@link DataInstanceModel} proxy.
     * 
     * @return a {@link DataInstanceModel} proxy on the created {@link Package}.
     */
    @objid ("c853dcc8-cdfd-4ab7-b6d6-136e9332fa6f")
    public static DataInstanceModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModel.STEREOTYPE_NAME);
        return DataInstanceModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link DataInstanceModel} proxy from a {@link Package} stereotyped << DataInstanceModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link DataInstanceModel} proxy or <i>null</i>.
     */
    @objid ("481203a3-8818-4b32-932d-06583c251c3e")
    public static DataInstanceModel instantiate(final Package obj) {
        return DataInstanceModel.canInstantiate(obj) ? new DataInstanceModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstanceModel} proxy from a {@link Package} stereotyped << DataInstanceModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link DataInstanceModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6a61c0c6-4921-461e-a635-a5c8a8e44efb")
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
     */
    @objid ("3b13b9fa-4cee-4928-8a96-f8ff5ba1d46e")
    public void addDataInstances(final DataInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'dataSourcesInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("e7efb017-d136-434d-b319-0c421c77443e")
    public void addDataSourcesInstances(final DataSourceInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("4ab449a3-c501-4701-8ff0-ac3cc56d3a16")
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
     */
    @objid ("74116897-5a27-4788-9b03-0ab2a974d706")
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
     */
    @objid ("22e5c785-e684-41cb-8a09-5b68c04bd6ff")
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
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("e6c62a40-f84d-4ea8-b7b4-7b51b8d330ee")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("6aaf68cd-68e4-4b04-8b8a-e0f34498cb73")
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

    @objid ("599c837f-0db2-40bc-afdf-973324c41c07")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'dataInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("034f6059-a56b-4818-9326-c623bb7e1cfd")
    public boolean removeDataInstances(final DataInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'dataSourcesInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("c684a8aa-2561-4a07-8c8d-51c7dba92f31")
    public boolean removeDataSourcesInstances(final DataSourceInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("247a3789-6e87-46a1-bd02-b56f67936218")
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

    @objid ("1a022ec9-b27e-4705-87c1-25ff819f17dc")
    protected DataInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("1b14823c-7143-4254-9af2-2c028081c38f")
    public static final class MdaTypes {
        @objid ("fb49f795-cbec-4d59-afaf-eae7e20d0e7b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("64224073-8fb4-4d8f-83d7-6450162000b5")
        private static Stereotype MDAASSOCDEP;

        @objid ("af21caee-587a-4b9e-ac6d-da036763d4da")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("29d4c069-4a17-4b8d-81fc-a04f8c6607af")
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
