/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
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
 * Proxy class to handle a {@link Class} with << SoftwareComponentResourceFilter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("729d862a-a2e3-4f6e-ae37-85020c924c77")
public class SoftwareComponentResourceFilter extends ResourceFilter {
    @objid ("036e5dab-84ce-440e-84fc-d8e50d89e95c")
    public static final String STEREOTYPE_NAME = "SoftwareComponentResourceFilter";

    @objid ("742f8809-b104-4cac-a138-db389d61f36a")
    public static final String EVERYCOMPONENT_TAGTYPE = "everyComponent";

    /**
     * Tells whether a {@link SoftwareComponentResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SoftwareComponentResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8d9e9b3c-0773-4fb0-9dfa-23586a1a0509")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SoftwareComponentResourceFilter >> then instantiate a {@link SoftwareComponentResourceFilter} proxy.
     * 
     * @return a {@link SoftwareComponentResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("88228bf1-af8a-4cf8-b030-3374ad44811e")
    public static SoftwareComponentResourceFilter create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentResourceFilter.STEREOTYPE_NAME);
        return SoftwareComponentResourceFilter.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentResourceFilter} proxy from a {@link Class} stereotyped << SoftwareComponentResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SoftwareComponentResourceFilter} proxy or <i>null</i>.
     */
    @objid ("605be9c8-76de-40e8-8537-d0367117084d")
    public static SoftwareComponentResourceFilter instantiate(final Class obj) {
        return SoftwareComponentResourceFilter.canInstantiate(obj) ? new SoftwareComponentResourceFilter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentResourceFilter} proxy from a {@link Class} stereotyped << SoftwareComponentResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SoftwareComponentResourceFilter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a42e4fbd-c9dd-4513-a521-7a16013a6e66")
    public static SoftwareComponentResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SoftwareComponentResourceFilter.canInstantiate(obj))
        	return new SoftwareComponentResourceFilter(obj);
        else
        	throw new IllegalArgumentException("SoftwareComponentResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a639a01a-2863-4d48-869a-5ec0f3050444")
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP);
            d.setName("softwareComponents");
            d.putTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponents");
        }
    }

    @objid ("e2ff54c8-d425-4fd3-8ab2-023626226329")
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
        SoftwareComponentResourceFilter other = (SoftwareComponentResourceFilter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'application' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("34bcf451-46db-4298-94f7-865cc525bd81")
    public CamelModel getApplication() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "application")){
                  if (CamelModel.canInstantiate(d.getDependsOn()))
                     return (CamelModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("0b66f86f-36cb-4d6b-9682-5e49d9ec8d8e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8b4c1180-5d1d-4ad8-b3d0-1ab78c6275f0")
    public List<SoftwareComponent> getSoftwareComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponents")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
              if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                results.add((SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("716a197f-d90d-43ca-8ec8-36a8e2f6efe1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'everyComponent'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("22f2e604-328f-492b-ae25-d3e0f5248f5e")
    public boolean isEveryComponent() {
        return this.elt.isTagged(SoftwareComponentResourceFilter.MdaTypes.EVERYCOMPONENT_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("10cfa0de-a858-4046-ab8e-cf79da16edc1")
    public boolean removeSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'application' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f1d1910a-5777-4817-bc8e-3a594414fcc3")
    public void setApplication(final CamelModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "application")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP);
              dep.setName("application");      dep.putTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "application");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for boolean property 'everyComponent'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d590aa2a-4b0c-4014-8e3a-9b7cf4358552")
    public void setEveryComponent(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SoftwareComponentResourceFilter.MdaTypes.EVERYCOMPONENT_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SoftwareComponentResourceFilter.MdaTypes.EVERYCOMPONENT_TAGTYPE_ELT);
    }

    @objid ("8c004877-96e9-479c-889b-9eb7a9e610c0")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("fa28a775-c3f0-4ca7-a85f-f908692c2aed")
    protected SoftwareComponentResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("9797b51a-6b94-4caf-a495-9d34ae7b4370")
    public static final class MdaTypes {
        @objid ("e03e5666-d287-4b8c-bce3-962ea8db97d9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("95e70d6e-924c-403d-91cf-3ea998514873")
        public static TagType EVERYCOMPONENT_TAGTYPE_ELT;

        @objid ("e11a01f9-e164-48cd-9e8f-4eefa3ae1d4d")
        private static Stereotype MDAASSOCDEP;

        @objid ("ab05cc75-bb5f-4052-a195-bdf390c8b8a7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d5f8654a-6e91-4d32-8c02-e6b2f3c56b08")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d2a3f527-691b-4b04-a5c2-63f39b55c173");
            EVERYCOMPONENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "726ba30c-05cc-4f4b-b31a-4c9238661a62");
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
