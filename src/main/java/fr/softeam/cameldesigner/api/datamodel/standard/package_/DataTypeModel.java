/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << DataTypeModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7c502d97-b3d6-4b26-a717-f2c9c65a164e")
public class DataTypeModel extends DataModel {
    @objid ("bb8dcfe3-0400-4654-8698-f0c858acb999")
    public static final String STEREOTYPE_NAME = "DataTypeModel";

    /**
     * Tells whether a {@link DataTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("63ac9277-a646-4ddf-94e9-0fa17eb9570c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DataTypeModel >> then instantiate a {@link DataTypeModel} proxy.
     * 
     * @return a {@link DataTypeModel} proxy on the created {@link Package}.
     */
    @objid ("76e9c9e8-9ba9-48b9-bf67-cd690560b999")
    public static DataTypeModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModel.STEREOTYPE_NAME);
        return DataTypeModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link DataTypeModel} proxy from a {@link Package} stereotyped << DataTypeModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link DataTypeModel} proxy or <i>null</i>.
     */
    @objid ("7417be26-2a96-4a0b-9625-0d68f4f6c056")
    public static DataTypeModel instantiate(final Package obj) {
        return DataTypeModel.canInstantiate(obj) ? new DataTypeModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataTypeModel} proxy from a {@link Package} stereotyped << DataTypeModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link DataTypeModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("481c755d-9d2e-402b-bc44-6ba11e7908e2")
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
     */
    @objid ("fd14fbde-5a93-414a-8704-56c4b9631f88")
    public void addData(final Data obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'dataSources' role.<p>
     * Role description:
     * null
     */
    @objid ("6485200c-6702-4d7a-87a9-d00240f3891d")
    public void addDataSources(final DataSource obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("783d53bd-7949-487a-8bfb-6cacbefda165")
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
     */
    @objid ("23e03420-7ccd-442f-838a-9934d9e3477a")
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
     */
    @objid ("53888e62-90be-4c9f-82de-19ca8cf0f3d4")
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
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("10b18f9d-3850-47ca-b703-3e7c9ea39c57")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("af9e94a1-450b-4507-8939-fe1a68215b8f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'data' role.<p>
     * Role description:
     * null
     */
    @objid ("404a837f-f0a9-4b73-b6c8-2d3306aa7eb0")
    public boolean removeData(final Data obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'dataSources' role.<p>
     * Role description:
     * null
     */
    @objid ("cd9c64cd-51a6-4d69-a507-9f5f89255b42")
    public boolean removeDataSources(final DataSource obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
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

    @objid ("40d18768-b548-4592-8df8-4f9cd1db387b")
    protected DataTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("6b710ff0-3d2f-4e7f-9f5d-4066b77ae3ba")
    public static final class MdaTypes {
        @objid ("a33e0420-9f05-4b35-aef2-0a1fe2d5b42c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("753eac0e-0cdc-4c63-a0a9-c2b9bc896684")
        private static Stereotype MDAASSOCDEP;

        @objid ("65c49d61-8987-4c9b-8185-186f76e87fb2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("575847cd-cf1f-4577-9657-c0174a7e5885")
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
