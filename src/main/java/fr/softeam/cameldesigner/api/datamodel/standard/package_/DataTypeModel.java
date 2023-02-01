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
<<<<<<< HEAD
    @objid ("35710e19-574d-4c8e-aabc-646fe6a94482")
=======
    @objid ("cb45a6e6-bd75-4704-878b-f642fe522c47")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DataTypeModel";

    /**
     * Tells whether a {@link DataTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("907df9c0-8852-4d55-a457-d32cc688a51e")
=======
    @objid ("e72780a0-73a9-4497-b394-5aa78bc8e984")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DataTypeModel >> then instantiate a {@link DataTypeModel} proxy.
     * 
     * @return a {@link DataTypeModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("d2da0a7e-d425-449f-ab74-8f0369968903")
=======
    @objid ("c2e6efef-ed76-4fd5-8e52-b7864a324c97")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("15dc5f73-c046-463e-8919-23c073e0b4ae")
=======
    @objid ("83f316ab-8db7-4492-afd7-24c566285c2f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5c9d0cd6-0316-42cc-be55-2c91025268f8")
=======
    @objid ("12f39a60-28d9-4cc8-8c6e-2f57653004f9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3a08b8f5-75af-4561-97b1-21a87158051b")
=======
    @objid ("74f59ee7-f33b-42c8-af5b-451461f5af6d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("4ced6dba-776a-47f1-a5be-a96b783cc886")
=======
    @objid ("0eb79bc8-3736-4afd-9d53-c7797e2ba66d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("77f23ab7-4546-4314-9ba1-8139283b53bc")
=======
    @objid ("14da4c37-78f8-46e6-af8e-d4aa5bb1c597")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final DataTypeModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("8cdf9d36-ad79-42cd-9f5a-6379fe7fc8f2")
=======
    @objid ("d903c5ec-f1a2-48f5-8829-f4d526c7c55b")
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
        DataTypeModel other = (DataTypeModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'data' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9a25d3b0-ac78-4fcc-9fdb-c6e7cc0d0e70")
=======
    @objid ("e76e1b77-fe06-4c95-b480-298c889e0752")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("de10b56c-8357-48b0-844b-7b04771a45c7")
=======
    @objid ("fdd661aa-decc-43c5-b519-63147f0cbe69")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("53b6a704-1773-4094-9b58-dc8fac9edf15")
=======
    @objid ("7ff3e5d8-e414-4847-b23f-3b31c24416fb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("4729e56a-f45a-4338-abcf-374c2ffa8faa")
=======
    @objid ("bdf8cead-a270-4800-9e95-70491db6017f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

<<<<<<< HEAD
    @objid ("0d879fda-bfe0-4057-ab9f-e6aa74ef0e8b")
=======
    @objid ("2c04e791-1787-454d-85e1-61a0cd3a0504")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("db8d15b0-6fea-4a15-a006-c7dfc31d3172")
=======
    @objid ("e4732dcc-ae18-4075-8575-294a5c07768a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeData(final Data obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'dataSources' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f3038988-6723-449b-9356-3dc20345a532")
=======
    @objid ("73595ccc-d091-4560-86a4-d33c68dadbcb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDataSources(final DataSource obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("fab3ba84-0e8c-42bd-afeb-254fb979c801")
=======
    @objid ("948798f5-5055-46be-b404-ae79516100e9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("13b63797-dea3-4972-a45a-fa45b7bf763a")
=======
    @objid ("c8059c8d-7ba1-4ee7-b371-34b5ee103cd8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DataTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("6b710ff0-3d2f-4e7f-9f5d-4066b77ae3ba")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("bb6d3549-919b-4813-be28-a3953ac29082")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0abfad78-2aec-4f58-8e3b-1db4ae4c284e")
        private static Stereotype MDAASSOCDEP;

        @objid ("99011233-c4d7-4946-a92f-355d0af52bab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a6b47023-3931-47be-a61e-1c56e5fd80a3")
=======
        @objid ("db6ff973-af03-43a0-8a64-0ef5ae3eea67")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("02a2b70f-b15a-4f32-a1f8-b7fe679e7201")
        private static Stereotype MDAASSOCDEP;

        @objid ("61d8aad1-29c4-4ee3-8766-b135579e902b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("56cef558-4e4f-465c-9eab-3d15d51b2321")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
