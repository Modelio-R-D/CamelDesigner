/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("6fc4e71c-15de-41de-9aef-0ff502814c3f")
    public static final String STEREOTYPE_NAME = "DataSourceInstance";

    /**
     * Tells whether a {@link DataSourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DataSourceInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4ca0126e-ceb0-4028-b6c9-dd91b6208cf2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataSourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DataSourceInstance >> then instantiate a {@link DataSourceInstance} proxy.
     * 
     * @return a {@link DataSourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("9d3adc2e-e1d0-4106-8e44-63cec59e0b9e")
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
    @objid ("e64b0a69-4fba-461e-9779-ab9b2de249ec")
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
    @objid ("01174bae-5f8e-4119-a98a-dcadc9f7fa47")
    public static DataSourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (DataSourceInstance.canInstantiate(obj))
        	return new DataSourceInstance(obj);
        else
        	throw new IllegalArgumentException("DataSourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("accf2d75-faa1-4233-9f53-107911555a90")
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
    @objid ("7d463003-e05f-44ec-8ba4-6638aa43eb25")
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
    @objid ("e4b14458-153f-4057-80d4-f30dfc92cbe0")
    public DataInstanceModel getParent() {
        return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DataInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c3d4bad6-59ee-4c6f-ba60-4cf5252dbe3e")
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
    @objid ("f3a211d2-4a45-4073-b7c9-58bbf9b23317")
    public DataSource getType() {
        return (DataSource)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), DataSource.STEREOTYPE_NAME);
    }

    @objid ("b328b5b7-40d9-4679-bdc4-c79e67969dcc")
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
    @objid ("2fe31ac1-9256-4f64-ae51-6506f40eab88")
    public void setParent(final DataInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bf2a406e-6755-447d-af24-6a9d8a80adc7")
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
    @objid ("ca98aa89-4e05-495f-8a4f-9035c5bae3c5")
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

    @objid ("75aa51ce-1648-4a84-8b80-01148ff6c0a2")
    protected DataSourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("f274074b-7683-49b4-b45f-098faac6eaa7")
    public static final class MdaTypes {
        @objid ("9acbc8aa-88de-4b13-8bb7-6cbc17b8c3dc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0246c60b-ca3a-48f3-87f2-6d4b35042bfb")
        private static Stereotype MDAASSOCDEP;

        @objid ("41460cd1-f588-45b5-b8f3-0bf90b03d4a4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a533747a-7bac-4e68-b290-52ebd71dc8a6")
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
