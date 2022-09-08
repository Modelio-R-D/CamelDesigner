/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("f77ea8dd-6a36-44fc-a989-0c09ada7edf6")
    public static final String STEREOTYPE_NAME = "NonFunctionalEventInstance";

    /**
     * Tells whether a {@link NonFunctionalEventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << NonFunctionalEventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4e3472c2-4a60-4971-8e94-28bcd2969253")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEventInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << NonFunctionalEventInstance >> then instantiate a {@link NonFunctionalEventInstance} proxy.
     * 
     * @return a {@link NonFunctionalEventInstance} proxy on the created {@link Instance}.
     */
    @objid ("8c843df1-4808-43a3-8f19-50dac463cfd0")
    public static NonFunctionalEventInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEventInstance.STEREOTYPE_NAME);
        return NonFunctionalEventInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEventInstance} proxy from a {@link Instance} stereotyped << NonFunctionalEventInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Instance
     * @return a {@link NonFunctionalEventInstance} proxy or <i>null</i>.
     */
    @objid ("9c765ae9-0ddf-4108-9be6-b19446c853ae")
    public static NonFunctionalEventInstance instantiate(final Instance obj) {
        return NonFunctionalEventInstance.canInstantiate(obj) ? new NonFunctionalEventInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEventInstance} proxy from a {@link Instance} stereotyped << NonFunctionalEventInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Instance}
     * @return a {@link NonFunctionalEventInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0c26d697-5c0e-4a09-83a5-293a237831e2")
    public static NonFunctionalEventInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (NonFunctionalEventInstance.canInstantiate(obj))
            return new NonFunctionalEventInstance(obj);
        else
            throw new IllegalArgumentException("NonFunctionalEventInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("938c0287-ecfe-433a-abda-ce111dc48970")
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
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("a104187f-4448-4d53-84d2-5db9cd9c68d7")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("44908574-a406-466a-8981-9968372ba717")
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

    @objid ("ae23e60d-5749-476e-8d4e-6acb031b0e9a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("ead5cab2-1616-4666-99a2-d66cc13bf93e")
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

    @objid ("db1ab562-49e9-48a3-8dd3-2e87053d7dad")
    protected NonFunctionalEventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("115de52d-fac8-49f5-8245-053320b852b9")
    public static final class MdaTypes {
        @objid ("cff57cd4-a748-4c86-91a3-bfea781a4859")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e8c685ad-6b1c-41e3-9a6b-b2be9cf0c9cd")
        private static Stereotype MDAASSOCDEP;

        @objid ("da1dd205-98e9-427c-9dc1-f1fec35d1fb5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("93dc54f5-5743-4788-8548-296d264c35bc")
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
