/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
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
 * Proxy class to handle a {@link Instance} with << DataInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("649011e7-76d7-432b-9ea5-833d04d8e471")
public class DataInstance extends FeatureInstance {
    @objid ("4cb178fe-c08b-4717-8ccf-d979117d0c5e")
    public static final String STEREOTYPE_NAME = "DataInstance";

    /**
     * Tells whether a {@link DataInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DataInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1678ea76-2c3c-4396-a15b-9cf4a98af8e9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DataInstance >> then instantiate a {@link DataInstance} proxy.
     * 
     * @return a {@link DataInstance} proxy on the created {@link Instance}.
     */
    @objid ("8eb986fb-2f65-4e34-91ed-55d2c5d4acf2")
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
    @objid ("39daaa5c-ba00-4667-a9e1-c6e8f84783ab")
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
    @objid ("6366ad71-8a6b-49d7-9169-0ce3ca183cf2")
    public static DataInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (DataInstance.canInstantiate(obj))
            return new DataInstance(obj);
        else
            throw new IllegalArgumentException("DataInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8d64a24a-ba81-41f8-9b81-87d71eb4956d")
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
    @objid ("94b2d030-ae79-428b-bcb3-af2603ce2ecb")
    public DataSourceInstance getDataSourceInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataInstance.MdaTypes.MDAASSOCDEP_ROLE), "dataSourceInstance")
                  && DataSourceInstance.canInstantiate(d.getDependsOn())) {
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
    @objid ("77117ceb-12c3-4fc7-b60f-46c6fd3af716")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("7e91d58d-9b9f-4063-8753-b9f50bd4e62e")
    public Data getType() {
        return (Data)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), Data.STEREOTYPE_NAME);
    }

    @objid ("d878dfa3-4c7a-4426-9340-1b13533b6712")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'dataSourceInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("bd927513-7b29-44a2-908b-bb75118f80ae")
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
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("b3b37560-422b-4301-aba8-38acd3c534c6")
    public void setType(final Data obj) {
        ((Instance) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    @objid ("422f6380-9de0-446d-b80c-88ab246ed272")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("33007319-eb11-492a-bcfb-757c6728c840")
    protected DataInstance(final Instance elt) {
        super(elt);
    }

    @objid ("db37a04c-5717-4bc1-9bb0-fe56f193bb91")
    public static final class MdaTypes {
        @objid ("eba49b58-0d0a-4f5c-9104-86689bbbc16f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4337c3bf-a286-486c-939e-a6a39371f09d")
        private static Stereotype MDAASSOCDEP;

        @objid ("9772abe8-0bb3-4f8d-b912-36c083203e08")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7d4243d6-c3da-498c-b6a7-85bde1382b3c")
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
