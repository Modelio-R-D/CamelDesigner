/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
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
    @objid ("b6fb2973-3a9a-401f-9f1a-0fed18a878b6")
    public static final String STEREOTYPE_NAME = "DataInstance";

    /**
     * Tells whether a {@link DataInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DataInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("041d3a63-47bf-4a0f-a4df-0659ff283f53")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DataInstance >> then instantiate a {@link DataInstance} proxy.
     * 
     * @return a {@link DataInstance} proxy on the created {@link Instance}.
     */
    @objid ("8cefd334-f332-411b-b19f-fcadf4401fb6")
    public static DataInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstance.STEREOTYPE_NAME);
        return DataInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link DataInstance} proxy from a {@link Instance} stereotyped << DataInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link DataInstance} proxy or <i>null</i>.
     */
    @objid ("ddbca3aa-be06-4af6-8e9f-c6c5ee0d553f")
    public static DataInstance instantiate(final Instance obj) {
        return DataInstance.canInstantiate(obj) ? new DataInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstance} proxy from a {@link Instance} stereotyped << DataInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link DataInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c1959d51-3661-4dda-b588-9efcc78b5c3f")
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
     * 
     */
    @objid ("e078695a-4982-4b3e-b190-68599fa5aa73")
    public void addIncludesDataInstance(final DataInstanceBindableInstance obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

    @objid ("bc6b9151-7d32-4770-bd53-994cf8004137")
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
     * 
     */
    @objid ("1db31aa4-e5de-4033-8f16-af7775dfd0eb")
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
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("536fcd77-4984-46ee-a1e0-491bbc2951b3")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'includesDataInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cd030406-0fe5-4b71-852c-ad3d208b24fa")
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
     * 
     */
    @objid ("e77989f0-181b-4dbd-a18e-5dc356da2ed9")
    public DataInstanceModel getParent() {
        return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DataInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ceb87e75-e923-4927-8806-7f3198bb3389")
    public Data getType() {
        return (Data)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), Data.STEREOTYPE_NAME);
    }

    @objid ("2b2edd09-fcda-46d9-a04c-3f51c800bf15")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'includesDataInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("63c6b1b6-2b95-4d35-876e-cf775a53d62b")
    public boolean removeIncludesDataInstance(final DataInstanceBindableInstance obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'dataSourceInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6c62555a-af74-4553-8fca-1d8dce0b6403")
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
     * 
     */
    @objid ("fd50bd66-3e1e-40aa-bf1f-5c177aaf72f0")
    public void setParent(final DataInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e8fae600-679a-4eab-8742-41070377e66c")
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

    @objid ("6a56b9b3-31ae-40f6-b437-1d0afa04c55a")
    protected DataInstance(final Instance elt) {
        super(elt);
    }

    @objid ("db37a04c-5717-4bc1-9bb0-fe56f193bb91")
    public static final class MdaTypes {
        @objid ("51e926a5-d637-4abe-bf77-2216b2e1837c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3141709d-a786-4489-b88b-177d6ff0f982")
        private static Stereotype MDAASSOCDEP;

        @objid ("0626d6f9-150f-4487-a2ce-7c0c858e1ac3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3b022a9c-4f03-4702-aee4-a67e86afdea7")
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
