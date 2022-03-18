/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
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
 * Proxy class to handle a {@link Instance} with << NonFunctionalEventInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cb340abc-2e6f-40f5-b96e-5f3764d6d408")
public class NonFunctionalEventInstance extends EventInstance {
    @objid ("a9ed4fba-666b-4a2e-a814-2f60f549febf")
    public static final String STEREOTYPE_NAME = "NonFunctionalEventInstance";

    /**
     * Tells whether a {@link NonFunctionalEventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << NonFunctionalEventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d1d855ff-2908-402e-a144-0d950e771a1e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEventInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << NonFunctionalEventInstance >> then instantiate a {@link NonFunctionalEventInstance} proxy.
     * 
     * @return a {@link NonFunctionalEventInstance} proxy on the created {@link Instance}.
     */
    @objid ("967a4158-fa93-4f88-90d2-0ac13f7302dd")
    public static NonFunctionalEventInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEventInstance.STEREOTYPE_NAME);
        return NonFunctionalEventInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEventInstance} proxy from a {@link Instance} stereotyped << NonFunctionalEventInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link NonFunctionalEventInstance} proxy or <i>null</i>.
     */
    @objid ("b34273b3-d3d8-4e73-a4f8-3fd603e1dfcd")
    public static NonFunctionalEventInstance instantiate(final Instance obj) {
        return NonFunctionalEventInstance.canInstantiate(obj) ? new NonFunctionalEventInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEventInstance} proxy from a {@link Instance} stereotyped << NonFunctionalEventInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link NonFunctionalEventInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6720152d-3a73-4b62-adcd-d710769cecc2")
    public static NonFunctionalEventInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (NonFunctionalEventInstance.canInstantiate(obj))
        	return new NonFunctionalEventInstance(obj);
        else
        	throw new IllegalArgumentException("NonFunctionalEventInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b0080a8a-65fd-4fa0-a9c6-d7c988852023")
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
        NonFunctionalEventInstance other = (NonFunctionalEventInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("d40f8fa9-9437-42e7-b3f5-fc53234b5162")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cf7bd0a5-8ad0-47e5-8f2b-7e9e3c2c5081")
    public MetricInstance getMetricInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(NonFunctionalEventInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(NonFunctionalEventInstance.MdaTypes.MDAASSOCDEP_ROLE), "metricInstance")){
                  if (SecurityMetricInstance.canInstantiate(d.getDependsOn()))
                     return (SecurityMetricInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityMetricInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricInstance.canInstantiate(d.getDependsOn()))
                     return (MetricInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("ff900180-2701-4d16-ad9f-fdbbc1a918b1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1a97f9eb-aa58-4dd4-87d1-37cfc17a21b0")
    public void setMetricInstance(final MetricInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(NonFunctionalEventInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(NonFunctionalEventInstance.MdaTypes.MDAASSOCDEP_ROLE), "metricInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), NonFunctionalEventInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("metricInstance");      dep.putTagValue(NonFunctionalEventInstance.MdaTypes.MDAASSOCDEP_ROLE, "metricInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("c87f9400-f405-40fb-ac91-09198235a143")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("16b69fab-1915-4548-87a9-d92f04db48d9")
    protected NonFunctionalEventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("115de52d-fac8-49f5-8245-053320b852b9")
    public static final class MdaTypes {
        @objid ("386a2ca8-0f03-46e3-98c0-019fbc2979a0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("edad1f3d-3188-479a-b25c-4a148474e2cb")
        private static Stereotype MDAASSOCDEP;

        @objid ("db242ea3-b844-498e-a445-320fd967c5b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("80ad49aa-6028-4d0e-833d-4dbcd051baad")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d6b986dc-6dc7-40b3-b2a3-c0fe9f6add0e");
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
