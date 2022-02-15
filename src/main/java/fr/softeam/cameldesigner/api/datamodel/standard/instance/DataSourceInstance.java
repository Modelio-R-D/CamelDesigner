/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << DataSourceInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7596aa7f-0bb2-4518-8c82-6822a15475d0")
public class DataSourceInstance extends FeatureInstance {
    @objid ("e4454a7e-0e9c-4fef-a00f-52f5b326fc86")
    public static final String STEREOTYPE_NAME = "DataSourceInstance";

    /**
     * Tells whether a {@link DataSourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DataSourceInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3af106a3-a044-424d-8c60-e2eaf44d9456")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataSourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DataSourceInstance >> then instantiate a {@link DataSourceInstance} proxy.
     * 
     * @return a {@link DataSourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("4b6cb23a-60df-4217-9e47-458192121d2a")
    public static DataSourceInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataSourceInstance.STEREOTYPE_NAME);
        return DataSourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link DataSourceInstance} proxy from a {@link Instance} stereotyped << DataSourceInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link DataSourceInstance} proxy or <i>null</i>.
     */
    @objid ("f4fbc7ba-0324-4837-9ba2-71ff80f31c2e")
    public static DataSourceInstance instantiate(final Instance obj) {
        return DataSourceInstance.canInstantiate(obj) ? new DataSourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataSourceInstance} proxy from a {@link Instance} stereotyped << DataSourceInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link DataSourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e336875a-3f67-4141-b7b8-868c77c22769")
    public static DataSourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (DataSourceInstance.canInstantiate(obj))
        	return new DataSourceInstance(obj);
        else
        	throw new IllegalArgumentException("DataSourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8f55e610-10f4-485a-8d63-4d373b302868")
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
        DataSourceInstance other = (DataSourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("2d75fc6c-373e-4541-a344-c3269dab953a")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("abe778db-f0c5-4639-9963-5f36aa43916e")
    public DataInstanceModel getParent() {
        return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DataInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("539872d1-410a-464a-9d54-e867e13f7baf")
    public SoftwareComponentInstance getSoftwareComponentInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataSourceInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataSourceInstance.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponentInstance")){
                  if (SoftwareComponentInstance.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a9022199-a177-43d2-ac22-fab5adad1e34")
    public DataSource getType() {
        return (DataSource)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), DataSource.STEREOTYPE_NAME);
    }

    @objid ("5ab6dcbf-bcd3-494a-9455-d8ca933dfc36")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c7147235-807d-4190-9afd-ae122932e739")
    public void setParent(final DataInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1371f892-4aa9-469a-ab8e-1943db187aae")
    public void setSoftwareComponentInstance(final SoftwareComponentInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DataSourceInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataSourceInstance.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponentInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DataSourceInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("softwareComponentInstance");      dep.putTagValue(DataSourceInstance.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponentInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("da07f061-927e-4858-bbce-7633716a75fe")
    public void setType(final DataSource obj) {
        ((Instance) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    @objid ("bb97ce67-1add-4095-86f2-6ed1c2d1641b")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("5c1cdb14-d156-48d0-a555-5ad3b47a6f5a")
    protected DataSourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("f274074b-7683-49b4-b45f-098faac6eaa7")
    public static final class MdaTypes {
        @objid ("36a85b60-a94b-4dd7-9171-7c6fae958b63")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d0ca8ad1-3857-4af7-b20f-bcd4816b4927")
        private static Stereotype MDAASSOCDEP;

        @objid ("ae1d887f-78c7-4f0d-b2f8-7d118e3ec37f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("955c4bab-6fc6-4602-8f8c-a3f0a8bc2583")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b72705cc-1db6-46cb-8f6e-de0c711a1997");
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
