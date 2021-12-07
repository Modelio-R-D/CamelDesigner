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
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
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
    @objid ("1bfaa4c8-4d21-4857-bfdd-6436a009991c")
    public static final String STEREOTYPE_NAME = "DataSourceInstance";

    /**
     * Tells whether a {@link DataSourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DataSourceInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2d894b05-915f-4e25-bea1-6ed9a9fee14a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataSourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DataSourceInstance >> then instantiate a {@link DataSourceInstance} proxy.
     * 
     * @return a {@link DataSourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("467cc174-1ec9-4e3c-b3a6-18deb03f294f")
    public static DataSourceInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataSourceInstance.STEREOTYPE_NAME);
        return DataSourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link DataSourceInstance} proxy from a {@link Instance} stereotyped << DataSourceInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Instance
     * @return a {@link DataSourceInstance} proxy or <i>null</i>.
     */
    @objid ("de9b1968-d6d3-4f87-a835-657238e98de2")
    public static DataSourceInstance instantiate(final Instance obj) {
        return DataSourceInstance.canInstantiate(obj) ? new DataSourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataSourceInstance} proxy from a {@link Instance} stereotyped << DataSourceInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Instance}
     * @return a {@link DataSourceInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e6b6c639-a1b7-4d04-9428-e3a465df484f")
    public static DataSourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (DataSourceInstance.canInstantiate(obj))
            return new DataSourceInstance(obj);
        else
            throw new IllegalArgumentException("DataSourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fbb7efaa-4e64-4505-b9ba-214346e4b65a")
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
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("0aa838ef-b8a9-4618-bd7a-dcd6adc1b22a")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("76c412a2-4020-4bfc-92ac-fa1ced91b852")
    public SoftwareComponentInstance getSoftwareComponentInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataSourceInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataSourceInstance.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponentInstance")
                  && SoftwareComponentInstance.canInstantiate(d.getDependsOn())) {
                     return (SoftwareComponentInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("8879ac9a-f1dc-451b-8961-872d36c18b69")
    public DataSource getType() {
        return (DataSource)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), DataSource.STEREOTYPE_NAME);
    }

    @objid ("09cd6e54-4e6b-481d-a431-25e21fbb0603")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("e10f44ec-09b4-427d-85c0-abf1665f0147")
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
     */
    @objid ("622bed49-0ced-45bc-8cb0-e391705351cc")
    public void setType(final DataSource obj) {
        ((Instance) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    @objid ("08a0c213-7450-4614-be6e-888941ecb5d2")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("86f17b51-3cd2-44d5-bad5-381a4e256888")
    protected DataSourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("f274074b-7683-49b4-b45f-098faac6eaa7")
    public static final class MdaTypes {
        @objid ("16170b1c-5566-4fb8-9099-91aac3a8f17a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("632a5208-c86b-45a2-95d5-3441ca64dd9d")
        private static Stereotype MDAASSOCDEP;

        @objid ("ac6f9862-24c1-45f0-bc83-d0bc3a26e606")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0bb83c8b-019f-4d24-b9b3-2df5a55a4625")
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
