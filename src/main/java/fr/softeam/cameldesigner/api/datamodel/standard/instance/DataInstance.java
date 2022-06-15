/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.bindableinstance.DataInstanceBindableInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << DataInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("649011e7-76d7-432b-9ea5-833d04d8e471")
public class DataInstance extends FeatureInstance {
    @objid ("8b6bb0e5-6711-40a3-8599-fb7c13bcca8d")
    public static final String STEREOTYPE_NAME = "DataInstance";

    /**
     * Tells whether a {@link DataInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DataInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("eae37133-b299-4891-94e7-a9cb84c7e314")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DataInstance >> then instantiate a {@link DataInstance} proxy.
     * 
     * @return a {@link DataInstance} proxy on the created {@link Instance}.
     */
    @objid ("76901391-d235-40f0-81b0-722e78770e7b")
    public static DataInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstance.STEREOTYPE_NAME);
        return DataInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link DataInstance} proxy from a {@link Instance} stereotyped << DataInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Instance
     * @return a {@link DataInstance} proxy or <i>null</i>.
     */
    @objid ("d26a3dfe-afb4-4583-a63b-3cf1a0443fd7")
    public static DataInstance instantiate(final Instance obj) {
        return DataInstance.canInstantiate(obj) ? new DataInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstance} proxy from a {@link Instance} stereotyped << DataInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Instance}
     * @return a {@link DataInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ada7cf46-546f-42f9-850e-34cd3733dd38")
    public static DataInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (DataInstance.canInstantiate(obj))
            return new DataInstance(obj);
        else
            throw new IllegalArgumentException("DataInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'includesDataInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("11c67f05-038d-4a34-9c7f-ecf3eb69ce50")
    public void addIncludesDataInstance(final DataInstanceBindableInstance obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

    @objid ("bbaa666a-ae3f-4899-866a-6028c84a91dd")
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
        DataInstance other = (DataInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'dataSourceInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("9ce8d8d7-751b-4d44-9ef6-64ce58519cf3")
    public DataSourceInstance getDataSourceInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataInstance.MdaTypes.MDAASSOCDEP_ROLE), "dataSourceInstance")){
                  if (DataSourceInstance.canInstantiate(d.getDependsOn()))
                     return (DataSourceInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataSourceInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Instance}.
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("2d9a8283-c9fc-40c3-95bd-f63ca27b2262")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'includesDataInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("3ba30bac-16ce-4a56-bfe7-21719191001e")
    public List<DataInstanceBindableInstance> getIncludesDataInstance() {
        List<DataInstanceBindableInstance> results = new ArrayList<>();
        for (BindableInstance mObj : ((Instance) this.elt).getPart()){
            if (DataInstanceBindableInstance.canInstantiate(mObj))
                    results.add((DataInstanceBindableInstance)CamelDesignerProxyFactory.instantiate(mObj, DataInstanceBindableInstance.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("8713ec89-3dce-4fd9-a224-c713437f96a4")
    public DataInstanceModel getParent() {
        return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DataInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("71ef2ab7-5ac7-4e1b-84fc-081fc637ae05")
    public Data getType() {
        return (Data)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), Data.STEREOTYPE_NAME);
    }

    @objid ("bd67f1ea-0951-4b39-a810-89c71583e1ad")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'includesDataInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("386576a7-b9bb-4b5f-aead-799221c4f87c")
    public boolean removeIncludesDataInstance(final DataInstanceBindableInstance obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'dataSourceInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("b884d028-00ba-4245-bb9a-150d53a275dc")
    public void setDataSourceInstance(final DataSourceInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DataInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataInstance.MdaTypes.MDAASSOCDEP_ROLE), "dataSourceInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DataInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("dataSourceInstance");      dep.putTagValue(DataInstance.MdaTypes.MDAASSOCDEP_ROLE, "dataSourceInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("84f6ccad-9c15-4405-a59f-d8fb22bf3189")
    public void setParent(final DataInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("7613ea2e-9238-4841-8843-9945fe417941")
    public void setType(final Data obj) {
        ((Instance) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    @objid ("68de0177-b40e-4d1a-ade1-e13a97fb9d7e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("aa099c0b-320e-4de8-a0f2-eb92fcd31825")
    protected DataInstance(final Instance elt) {
        super(elt);
    }

    @objid ("db37a04c-5717-4bc1-9bb0-fe56f193bb91")
    public static final class MdaTypes {
        @objid ("70735320-3f21-411b-b9d3-98606bb3ab12")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a022f47b-8636-4368-bdc5-e3bc69c3025e")
        private static Stereotype MDAASSOCDEP;

        @objid ("d53d9fe9-3bc6-4c20-bfe8-98f98488038c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c263b3d-ceab-40dd-b0c6-46f429ad0fc9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fd50c81e-cd4d-4ae8-8e12-a2818c71f1de");
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
