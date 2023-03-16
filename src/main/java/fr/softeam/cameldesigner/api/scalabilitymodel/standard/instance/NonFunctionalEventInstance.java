/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("ab058198-63a2-4703-a097-719bdfad2b9f")
    public static final String STEREOTYPE_NAME = "NonFunctionalEventInstance";

    /**
     * Tells whether a {@link NonFunctionalEventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << NonFunctionalEventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e48f2dcf-2693-4d32-ab85-6d14e5bd2a24")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEventInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << NonFunctionalEventInstance >> then instantiate a {@link NonFunctionalEventInstance} proxy.
     * 
     * @return a {@link NonFunctionalEventInstance} proxy on the created {@link Instance}.
     */
    @objid ("02b17455-d4ef-4a92-841b-e225166a8931")
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
    @objid ("1ff7e389-807b-4e74-983a-9e49ce184391")
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
    @objid ("cbeb8c54-9c04-4e65-a47e-c941b924127e")
    public static NonFunctionalEventInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (NonFunctionalEventInstance.canInstantiate(obj))
        	return new NonFunctionalEventInstance(obj);
        else
        	throw new IllegalArgumentException("NonFunctionalEventInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aaac9836-9fb8-46af-926f-f0c8f9e9f149")
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
    @objid ("9ffe863f-3e78-4247-9807-bd0750e1e769")
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
    @objid ("b544f6c5-f885-4bf1-8e40-7e75fe18e577")
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

    @objid ("99fa9c09-b60b-474e-8244-8bba8f6f1238")
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
    @objid ("86bf2cc7-bdc1-4031-94bb-7e963bb735e7")
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

    @objid ("d09a5f8c-a8b5-4be7-a87c-434d5a82cfb0")
    protected NonFunctionalEventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("115de52d-fac8-49f5-8245-053320b852b9")
    public static final class MdaTypes {
        @objid ("3f6aca45-95eb-47f3-b640-53003a33562f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2a32cce2-1d6d-422b-8929-b71199db7e95")
        private static Stereotype MDAASSOCDEP;

        @objid ("e05e23ab-bbe7-4064-8b21-33a82caafebf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5365bde5-41fc-48b4-8a71-e7c9499a4312")
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
