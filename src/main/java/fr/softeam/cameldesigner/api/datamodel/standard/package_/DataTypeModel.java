/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << DataTypeModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7c502d97-b3d6-4b26-a717-f2c9c65a164e")
public class DataTypeModel extends DataModel {
    @objid ("cd138a46-8725-4485-b1ec-1d20c970b7e6")
    public static final String STEREOTYPE_NAME = "DataTypeModel";

    /**
     * Tells whether a {@link DataTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("407d9e3c-c96c-44a6-962f-164d7f419f72")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DataTypeModel >> then instantiate a {@link DataTypeModel} proxy.
     * 
     * @return a {@link DataTypeModel} proxy on the created {@link Package}.
     */
    @objid ("33a902e4-b54c-40d2-a353-222e72c1927f")
    public static DataTypeModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModel.STEREOTYPE_NAME);
        return DataTypeModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link DataTypeModel} proxy from a {@link Package} stereotyped << DataTypeModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link DataTypeModel} proxy or <i>null</i>.
     */
    @objid ("ce386cd0-0b9e-4ff4-8ee4-684a11514c2d")
    public static DataTypeModel instantiate(final Package obj) {
        return DataTypeModel.canInstantiate(obj) ? new DataTypeModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataTypeModel} proxy from a {@link Package} stereotyped << DataTypeModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link DataTypeModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8e2e3d2d-f3b9-41c7-8646-7eb9d9912bef")
    public static DataTypeModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (DataTypeModel.canInstantiate(obj))
        	return new DataTypeModel(obj);
        else
        	throw new IllegalArgumentException("DataTypeModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'data' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("669351fe-af78-469a-b1e5-e98dd96faba0")
    public void addData(final Data obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'dataSources' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("45f0fad8-108d-45ad-8f4a-e1142ab71ad0")
    public void addDataSources(final DataSource obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("ed5034ba-cca5-420a-89fc-2a85e98af4f2")
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
        DataTypeModel other = (DataTypeModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'data' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bb1d8b5a-ba2d-43bf-bd20-44cca0f60b44")
    public List<Data> getData() {
        List<Data> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Data.canInstantiate(mObj))
        			results.add((Data)CamelDesignerProxyFactory.instantiate(mObj, Data.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'dataSources' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1e775004-7553-4f4b-9e4a-6da1561898af")
    public List<DataSource> getDataSources() {
        List<DataSource> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (DataSource.canInstantiate(mObj))
        			results.add((DataSource)CamelDesignerProxyFactory.instantiate(mObj, DataSource.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("26706407-4963-4512-a2b0-dba15936ceb5")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("9fba91d0-0571-401e-8ce7-72a9473abd58")
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
    @objid ("e9d56a8c-fc3a-4b45-af99-c02b82ef2197")
    public boolean removeData(final Data obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'dataSources' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("65fd069b-4c2d-4832-8e25-a8e37b542de0")
    public boolean removeDataSources(final DataSource obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    @objid ("79349856-0990-47bd-903b-65a784251391")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("e06a4414-2125-41e8-be4e-fa48efe8beae")
    protected DataTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("6b710ff0-3d2f-4e7f-9f5d-4066b77ae3ba")
    public static final class MdaTypes {
        @objid ("f7a98cbe-c402-406b-a9cb-51daad3d0a32")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8c0027f1-b98f-4cdc-9865-14d5ad7bb3e6")
        private static Stereotype MDAASSOCDEP;

        @objid ("1e4894a8-d6db-4cd5-917d-bec9b535ca1a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f51afe7c-3b5e-4666-ad2a-cc02231cf5c9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0014ffb4-9b70-4831-bf43-352df23bedfa");
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
