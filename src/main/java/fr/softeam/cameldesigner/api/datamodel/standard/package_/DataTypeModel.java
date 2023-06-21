/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataTypeModelDiagram;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
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
    @objid ("455d164a-2659-42b8-b1ec-6ff883cc3733")
    public static final String STEREOTYPE_NAME = "DataTypeModel";

    /**
     * Tells whether a {@link DataTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5571b5cc-1313-4dd9-b688-5646e1fd3bed")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DataTypeModel >> then instantiate a {@link DataTypeModel} proxy.
     * 
     * @return a {@link DataTypeModel} proxy on the created {@link Package}.
     */
    @objid ("2e06fc92-a4e4-4746-8d4f-d29a5ccfbf61")
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
    @objid ("d1f1f706-ea2a-4921-bc35-ae7f513b0ec4")
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
    @objid ("35b45901-e782-4e2f-9e48-f3ac54574f7e")
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
    @objid ("d45114a4-5d8b-4a24-8bb7-ac91a8faab62")
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
    @objid ("da7c557d-dce1-4eca-8b70-41dcc14b0de9")
    public void addDataSources(final DataSource obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("aef5038e-1835-42e0-a366-c999d91689d6")
    public void addDiagrams(final DataTypeModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    @objid ("382393e2-748d-4932-bf28-8b4f7dbe0633")
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
    @objid ("6a9221d5-a346-4afd-b71c-3f875283e141")
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
    @objid ("95b2020d-3a65-4585-aa7c-fd9e9666c9bb")
    public List<DataSource> getDataSources() {
        List<DataSource> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (DataSource.canInstantiate(mObj))
        			results.add((DataSource)CamelDesignerProxyFactory.instantiate(mObj, DataSource.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("19821372-53f7-446a-a986-1fb8e9aeda41")
    public List<DataTypeModelDiagram> getDiagrams() {
        List<DataTypeModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (DataTypeModelDiagram.canInstantiate(mObj))
        			results.add((DataTypeModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, DataTypeModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("a137a976-252f-416c-8dc4-377a7f33bd25")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("14356873-d81f-42a4-923a-172b606d54bc")
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
    @objid ("1e837da4-0a72-4250-8601-e5b5388dbc42")
    public boolean removeData(final Data obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'dataSources' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("080bd46e-772e-4aae-bc8e-3cbc2d9d7b82")
    public boolean removeDataSources(final DataSource obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("db0ecfd4-63f7-4b91-a73f-3d8c9e6cdbef")
    public boolean removeDiagrams(final DataTypeModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    @objid ("79349856-0990-47bd-903b-65a784251391")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getData());
        result.addAll(getDataSources());
        return result;
    }

    @objid ("53e63c08-08a0-4799-8e88-ee05cf27eb86")
    protected DataTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("6b710ff0-3d2f-4e7f-9f5d-4066b77ae3ba")
    public static final class MdaTypes {
        @objid ("91800510-5b76-4a35-aeaf-8cc87ba46f34")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eb1f46ec-e976-4b99-90ab-66d259f7c3cc")
        private static Stereotype MDAASSOCDEP;

        @objid ("029189b3-ea39-4ca7-8512-4d3475f93324")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d79c1f5b-7591-4e67-8afc-7303fac622e6")
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
