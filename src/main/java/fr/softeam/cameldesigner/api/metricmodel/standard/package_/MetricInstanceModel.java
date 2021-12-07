/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << MetricInstanceModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fc62e562-4151-4b10-80da-5289e792c7a8")
public class MetricInstanceModel extends MetricModel {
    @objid ("39ab58c3-4be0-48e6-8f3c-7850e730cb95")
    public static final String STEREOTYPE_NAME = "MetricInstanceModel";

    /**
     * Tells whether a {@link MetricInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fd33a9d1-d4c0-490b-ae92-74d7e4744498")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetricInstanceModel >> then instantiate a {@link MetricInstanceModel} proxy.
     * 
     * @return a {@link MetricInstanceModel} proxy on the created {@link Package}.
     */
    @objid ("cc46d5b5-a937-4eb9-8b0e-2d011fd41732")
    public static MetricInstanceModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModel.STEREOTYPE_NAME);
        return MetricInstanceModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link MetricInstanceModel} proxy from a {@link Package} stereotyped << MetricInstanceModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link MetricInstanceModel} proxy or <i>null</i>.
     */
    @objid ("11c91d42-0fcc-4c3f-a985-98b1dfdadf08")
    public static MetricInstanceModel instantiate(final Package obj) {
        return MetricInstanceModel.canInstantiate(obj) ? new MetricInstanceModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricInstanceModel} proxy from a {@link Package} stereotyped << MetricInstanceModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link MetricInstanceModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("69c9c4a9-4c47-476d-ae06-a5ac1aebcd8e")
    public static MetricInstanceModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (MetricInstanceModel.canInstantiate(obj))
            return new MetricInstanceModel(obj);
        else
            throw new IllegalArgumentException("MetricInstanceModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'bindings' role.<p>
     * Role description:
     * null
     */
    @objid ("61b5b1a1-2497-4640-9396-15a40b2c5665")
    public void addBindings(final MetricObjectBinding obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricInstanceModel.MdaTypes.MDAASSOCDEP);
            d.setName("bindings");
            d.putTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE, "bindings");
        }
    }

    /**
     * Add a value to the 'metricInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("5810c809-98a3-4d9f-bde1-8089f718ac39")
    public void addMetricInstances(final MetricInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricInstanceModel.MdaTypes.MDAASSOCDEP);
            d.setName("metricInstances");
            d.putTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE, "metricInstances");
        }
    }

    @objid ("7a09f8ee-dba9-4155-a4a1-b9fb54e0c4c9")
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
        MetricInstanceModel other = (MetricInstanceModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'bindings' role.<p>
     * Role description:
     * null
     */
    @objid ("14035071-4739-43af-a198-415468460a9a")
    public List<MetricObjectBinding> getBindings() {
        List<MetricObjectBinding> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "bindings")
              && MetricObjectBinding.canInstantiate(d.getDependsOn()))
                results.add((MetricObjectBinding)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricObjectBinding.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("6d37ed06-0670-4cb5-b7d1-19e12ae71c90")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'metricInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("c96bb710-1307-4ac0-9595-5213d82551d4")
    public List<MetricInstance> getMetricInstances() {
        List<MetricInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "metricInstances")
              && MetricInstance.canInstantiate(d.getDependsOn()))
                results.add((MetricInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricInstance.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("f08aba60-9d52-4208-9076-476741cc2245")
    public MetricTypeModel getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "type")
                  && MetricTypeModel.canInstantiate(d.getDependsOn())) {
                     return (MetricTypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTypeModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("76abed3b-1e83-4c4a-8fa4-11a570363828")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'bindings' role.<p>
     * Role description:
     * null
     */
    @objid ("8c107f2e-95fa-436e-984d-617b649218f2")
    public boolean removeBindings(final MetricObjectBinding obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'metricInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("1990e072-fa45-44af-812f-9e222d05947a")
    public boolean removeMetricInstances(final MetricInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("8d7b094d-0b1b-4e48-9845-6a602aea734d")
    public void setType(final MetricTypeModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricInstanceModel.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("fe102b71-1c2a-4597-9f6b-e49778711710")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("67b2e112-8b77-4473-8858-710840d1eab1")
    protected MetricInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("f50c0e56-9674-4958-8a3c-cef476fee649")
    public static final class MdaTypes {
        @objid ("c1d68adb-9e70-42f2-990c-dc3e4064442b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c5645a18-f622-4c37-9088-5cd1c6eb538b")
        private static Stereotype MDAASSOCDEP;

        @objid ("d99e3180-bf4f-4b4a-ba3d-7e84cb6112bb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5e0fea0a-9c81-463c-b6c4-b4b037f26006")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "42ce7273-a709-4cf7-bc51-ac7ee48b9f13");
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
