/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("93063d9f-2561-49d9-9483-1ad48e2900bf")
    public static final String STEREOTYPE_NAME = "SoftwareComponentResourceFilter";

    @objid ("e2cdcd5e-5487-4cb8-a727-5cfebb5e0e1a")
    public static final String EVERYCOMPONENT_TAGTYPE = "everyComponent";

    /**
     * Tells whether a {@link SoftwareComponentResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SoftwareComponentResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0c212696-5149-4c55-b344-69c1704a303e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SoftwareComponentResourceFilter >> then instantiate a {@link SoftwareComponentResourceFilter} proxy.
     * 
     * @return a {@link SoftwareComponentResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("ad53f1f4-f832-4162-ba3a-8d4dc873f67c")
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
    @objid ("8f8fbf0a-e547-4dda-a83d-7bdf0421d0cf")
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
    @objid ("232d08c5-3bdd-402a-bcd6-8b6d16e6eb53")
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
    @objid ("ff03adad-64ac-427b-9617-2124e9645c96")
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP);
            d.setName("softwareComponents");
            d.putTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponents");
        }
    }

    @objid ("eb542030-00e3-412b-a325-217b602439c0")
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
    @objid ("09129889-d944-455b-a6cb-c21f87243541")
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
    @objid ("84191ed6-d192-4c68-a35a-3fa0cfed47d0")
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
    @objid ("d7f4a893-4d3c-49b0-a2c7-b74463c00ee4")
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

    @objid ("454eebf9-04f2-4443-b8f7-51e554112c15")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'everyComponent'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7bfec000-87a0-47fd-80c1-e3d4f4b1e635")
    public boolean isEveryComponent() {
        return this.elt.isTagged(SoftwareComponentResourceFilter.MdaTypes.EVERYCOMPONENT_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0f841d5e-33a8-4dd6-8f81-2315f9f3bd30")
    public boolean removeSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponents")) 
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
    @objid ("61ffc72a-0e8c-4b3b-91e8-9da08c0df348")
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
    @objid ("a403c5fc-6520-4b3a-80ab-ef7f093176f3")
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

    @objid ("843463af-4b5a-4793-a65e-b208b3fe6c00")
    protected SoftwareComponentResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("9797b51a-6b94-4caf-a495-9d34ae7b4370")
    public static final class MdaTypes {
        @objid ("f719148f-bf61-42ae-8dc8-921bf3192d64")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2673c680-e427-4c0d-a628-8b240546cbb3")
        public static TagType EVERYCOMPONENT_TAGTYPE_ELT;

        @objid ("1eb731ae-8694-4305-a6b6-495ba5ba10bd")
        private static Stereotype MDAASSOCDEP;

        @objid ("2f76b2c7-c11c-428d-ba62-dbc192d9cc8b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d927c7f2-c1b9-4e88-b360-49a62146721d")
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
