/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("db65cfbd-e4ff-43d0-a740-5076ac284f95")
    public static final String STEREOTYPE_NAME = "NonFunctionalEventInstance";

    /**
     * Tells whether a {@link NonFunctionalEventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << NonFunctionalEventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c020d6a7-197b-44fe-b8bd-14ce2b6a4315")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEventInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << NonFunctionalEventInstance >> then instantiate a {@link NonFunctionalEventInstance} proxy.
     * 
     * @return a {@link NonFunctionalEventInstance} proxy on the created {@link Instance}.
     */
    @objid ("946fdd84-5323-46cb-b15d-18ece7181b07")
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
    @objid ("017c7476-82af-492f-8b8e-d6c27d8b1476")
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
    @objid ("4e17c5e6-ac61-4fe1-a261-1fd40582078e")
    public static NonFunctionalEventInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (NonFunctionalEventInstance.canInstantiate(obj))
        	return new NonFunctionalEventInstance(obj);
        else
        	throw new IllegalArgumentException("NonFunctionalEventInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("249fdcee-7055-43e3-b183-6a5be073569e")
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
    @objid ("a6f1c0c2-aaea-4fea-9c84-2cf7f3fc9c58")
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
    @objid ("4edb17d7-5e5b-42e9-9121-fa3792356058")
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

    @objid ("e6c63ae1-f58d-4aea-8172-9b85a254c8ec")
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
    @objid ("71678711-4b63-4dd0-b833-492c9a1dfe4d")
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

    @objid ("8ae02f59-027e-4fef-b6a8-8b53b7a3d9da")
    protected NonFunctionalEventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("115de52d-fac8-49f5-8245-053320b852b9")
    public static final class MdaTypes {
        @objid ("bb8be3fb-ae64-4fbf-bd9f-2cba34f9a915")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c9c506e3-449a-4bf9-8fbe-222dc5c2378c")
        private static Stereotype MDAASSOCDEP;

        @objid ("3648bce9-a3f9-4d18-98a4-93c190979d6f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5d63f605-a7ab-484c-901c-395744d2b9f1")
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
