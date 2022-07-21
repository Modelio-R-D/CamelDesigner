/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("6f269b1b-9b43-4b32-b658-4e6735364ac5")
    public static final String STEREOTYPE_NAME = "DataTypeModel";

    /**
     * Tells whether a {@link DataTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f0b35bf1-a9c5-4938-b4fd-0178b4bb95af")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DataTypeModel >> then instantiate a {@link DataTypeModel} proxy.
     * 
     * @return a {@link DataTypeModel} proxy on the created {@link Package}.
     */
    @objid ("5ae385e3-fb6d-44dc-a3f4-d0a3352909cb")
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
    @objid ("737e55d0-bd6b-4ace-bf1d-8646108c3a3a")
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
    @objid ("24c03789-bd8e-468a-8347-a5f36c505512")
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
    @objid ("6ee517b5-2430-405a-8ed1-ffa3cd3329b2")
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
    @objid ("84bbe95c-fe53-4672-be52-1ff13cbccac5")
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
    @objid ("ab98b4ba-79b2-4729-967a-8527a81e5f49")
    public void addDiagrams(final DataTypeModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    @objid ("70d4c46e-ad76-417f-a1f0-0b2b9dd34e16")
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
    @objid ("fcc45120-a83a-42a0-8304-54c830d894f9")
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
    @objid ("d45dcfae-47a6-4e15-800d-2bf3634d8b89")
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
    @objid ("014fdf3f-75cc-49d1-9b0b-b5b605455553")
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
    @objid ("6dd139d5-5da6-4787-a5a8-f845ecf4ee7b")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("00438bc8-aee8-4076-a1a5-0c2164973208")
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
    @objid ("09f0cf9f-1491-4997-a4c7-d51b86e65c26")
    public boolean removeData(final Data obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'dataSources' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("af49960b-01e3-47cb-8f8b-9ec534dbb41e")
    public boolean removeDataSources(final DataSource obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c207961b-2045-46ea-b649-81a0fc0ec87a")
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

    @objid ("9e0b5e29-de37-4488-bd3a-a478190b1f6d")
    protected DataTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("6b710ff0-3d2f-4e7f-9f5d-4066b77ae3ba")
    public static final class MdaTypes {
        @objid ("79a474c6-09a1-4db4-848f-9b4cfa559eac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a7ceb753-ee2d-4221-9f0c-da82d376f2bb")
        private static Stereotype MDAASSOCDEP;

        @objid ("e566e006-137d-43ab-99e5-f7071e62d24d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("edd3bc91-62f7-4270-9eb0-5433b5a96749")
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
