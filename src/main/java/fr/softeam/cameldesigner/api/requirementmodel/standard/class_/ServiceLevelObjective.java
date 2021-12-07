/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << ServiceLevelObjective >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c1a7b9fb-e797-4f38-a956-d25268a52f8d")
public class ServiceLevelObjective extends HardRequirement {
    @objid ("dda435d4-80b3-466e-95ec-b7ad92c909d5")
    public static final String STEREOTYPE_NAME = "ServiceLevelObjective";

    /**
     * Tells whether a {@link ServiceLevelObjective proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ServiceLevelObjective >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("09e547cd-6e8c-4ca4-be7f-2edba30d0494")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServiceLevelObjective.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ServiceLevelObjective >> then instantiate a {@link ServiceLevelObjective} proxy.
     * 
     * @return a {@link ServiceLevelObjective} proxy on the created {@link Class}.
     */
    @objid ("c9a66097-5472-4638-80cf-3ae9ccea260c")
    public static ServiceLevelObjective create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ServiceLevelObjective.STEREOTYPE_NAME);
        return ServiceLevelObjective.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ServiceLevelObjective} proxy from a {@link Class} stereotyped << ServiceLevelObjective >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ServiceLevelObjective} proxy or <i>null</i>.
     */
    @objid ("fc0360f6-73b8-447f-a689-c294206e72d0")
    public static ServiceLevelObjective instantiate(final Class obj) {
        return ServiceLevelObjective.canInstantiate(obj) ? new ServiceLevelObjective(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ServiceLevelObjective} proxy from a {@link Class} stereotyped << ServiceLevelObjective >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ServiceLevelObjective} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c22ebe31-afef-4360-bf77-217751547d7b")
    public static ServiceLevelObjective safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ServiceLevelObjective.canInstantiate(obj))
            return new ServiceLevelObjective(obj);
        else
            throw new IllegalArgumentException("ServiceLevelObjective: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("409d8fa6-cf26-439d-99f8-dc1eefe40532")
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
        ServiceLevelObjective other = (ServiceLevelObjective) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("60db1e09-44dd-40ba-9e7b-45c57ebe0137")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'violationEvent' role.<p>
     * Role description:
     * null
     */
    @objid ("1d3376dd-8926-4fb2-854e-03b81b25e5b5")
    public Event getViolationEvent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ServiceLevelObjective.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ServiceLevelObjective.MdaTypes.MDAASSOCDEP_ROLE), "violationEvent")
                  && Event.canInstantiate(d.getDependsOn())) {
                     return (Event)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Event.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("8eb500c2-59b3-4a10-8f70-a4f93d0acbfc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'violationEvent' role.<p>
     * Role description:
     * null
     */
    @objid ("869612d6-292e-4eb7-8e77-bd70617be507")
    public void setViolationEvent(final Event obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ServiceLevelObjective.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ServiceLevelObjective.MdaTypes.MDAASSOCDEP_ROLE), "violationEvent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ServiceLevelObjective.MdaTypes.MDAASSOCDEP);
              dep.setName("violationEvent");      dep.putTagValue(ServiceLevelObjective.MdaTypes.MDAASSOCDEP_ROLE, "violationEvent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("231d5d1d-ddbd-4f0c-adc1-93f97bcd486c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("032e0d27-e706-43df-a126-1b620fb80127")
    protected ServiceLevelObjective(final Class elt) {
        super(elt);
    }

    @objid ("798dc94a-b673-4408-9cfc-a760eac81e13")
    public static final class MdaTypes {
        @objid ("402193fd-6958-49f4-8d0c-744c4e5a1076")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f38779f0-bd40-4bd4-b9e7-44d62bacc8c2")
        private static Stereotype MDAASSOCDEP;

        @objid ("66bf3142-71f2-417c-b79e-bea81757e67f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e4d552d3-ede2-482b-ba46-92795befec28")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "72de5d29-7d68-48f4-a3ac-eace289da2c6");
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
