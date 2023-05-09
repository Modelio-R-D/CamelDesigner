/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("cc9538e8-1d40-47cf-8574-a1f5c2c443e7")
    public static final String STEREOTYPE_NAME = "SoftwareComponentResourceFilter";

    @objid ("405b39dd-051a-41a9-a592-c52fecbfe9da")
    public static final String EVERYCOMPONENT_TAGTYPE = "everyComponent";

    /**
     * Tells whether a {@link SoftwareComponentResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SoftwareComponentResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1f03209d-19b9-4867-af82-975adff957c6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SoftwareComponentResourceFilter >> then instantiate a {@link SoftwareComponentResourceFilter} proxy.
     * 
     * @return a {@link SoftwareComponentResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("9ff9f11a-f46d-4f3b-a3f2-4e3095310c3c")
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
    @objid ("6a60b11b-ae32-4ea8-a6ee-e2a78de992c7")
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
    @objid ("433deef3-8eea-46d2-ba9a-f57335adc44f")
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
    @objid ("1aac09af-5f25-40d6-8c20-abb6a71034fe")
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP);
            d.setName("softwareComponents");
            d.putTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponents");
        }
    }

    @objid ("022dac66-d2b3-472f-9d31-a50a754af229")
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
    @objid ("72664082-1688-4cfe-8e72-4a5b03e6ba89")
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
    @objid ("8779f5a6-cb4a-45ea-93b9-91ce877c3373")
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
    @objid ("0c61bf82-b35e-41ef-ac5f-8f45ca83fd04")
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

    @objid ("676f793a-1f78-46d5-97ee-17b2113c61da")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'everyComponent'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c5b11e24-0719-4950-8131-5754f1176a07")
    public boolean isEveryComponent() {
        return this.elt.isTagged(SoftwareComponentResourceFilter.MdaTypes.EVERYCOMPONENT_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ee1dcf82-0b12-4b86-9b67-41c6cd84eddc")
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
    @objid ("6b598e60-78bd-4239-ba3c-909b85b06e1e")
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
    @objid ("705578a7-b7e5-43be-a4d7-94db21139f5b")
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

    @objid ("7fc4c0a4-518e-4fd0-b58b-4e6efff607df")
    protected SoftwareComponentResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("9797b51a-6b94-4caf-a495-9d34ae7b4370")
    public static final class MdaTypes {
        @objid ("690fb760-abf5-40f9-b8fe-7d2ba8a869eb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("36f1aa3d-4db7-41d2-b213-5933b33c03a9")
        public static TagType EVERYCOMPONENT_TAGTYPE_ELT;

        @objid ("c9c16cf9-66a3-4ae1-b9f9-d3de6b5e3b22")
        private static Stereotype MDAASSOCDEP;

        @objid ("fc09c498-550c-4c82-924c-8346839a5de0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("947fc87d-0d9a-4bcb-9b4f-503f3ee140c2")
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
