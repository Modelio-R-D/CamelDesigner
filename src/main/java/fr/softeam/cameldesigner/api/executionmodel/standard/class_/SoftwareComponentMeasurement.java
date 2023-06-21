/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.api.profiler.standard.component.ProfilerComponent;
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
 * Proxy class to handle a {@link Class} with << SoftwareComponentMeasurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("89078e63-2e23-49e3-a485-89531a4dcc4c")
public class SoftwareComponentMeasurement extends Measurement {
    @objid ("4d353e43-0397-499f-b967-6858dcb260b3")
    public static final String STEREOTYPE_NAME = "SoftwareComponentMeasurement";

    /**
     * Tells whether a {@link SoftwareComponentMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SoftwareComponentMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ff9782ba-53d0-4313-bab4-5c346d7d6f80")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SoftwareComponentMeasurement >> then instantiate a {@link SoftwareComponentMeasurement} proxy.
     * 
     * @return a {@link SoftwareComponentMeasurement} proxy on the created {@link Class}.
     */
    @objid ("c8c378a7-0e69-431e-b933-d47de93f2857")
    public static SoftwareComponentMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentMeasurement.STEREOTYPE_NAME);
        return SoftwareComponentMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentMeasurement} proxy from a {@link Class} stereotyped << SoftwareComponentMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SoftwareComponentMeasurement} proxy or <i>null</i>.
     */
    @objid ("498e8e6c-df60-472c-8b7b-c0be9303c7de")
    public static SoftwareComponentMeasurement instantiate(final Class obj) {
        return SoftwareComponentMeasurement.canInstantiate(obj) ? new SoftwareComponentMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentMeasurement} proxy from a {@link Class} stereotyped << SoftwareComponentMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SoftwareComponentMeasurement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("251095c1-159d-4683-a5ad-a761c6924307")
    public static SoftwareComponentMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SoftwareComponentMeasurement.canInstantiate(obj))
        	return new SoftwareComponentMeasurement(obj);
        else
        	throw new IllegalArgumentException("SoftwareComponentMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("46f69d2f-a712-4145-ba74-0dbd770b6bb8")
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
        SoftwareComponentMeasurement other = (SoftwareComponentMeasurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("7faaeae9-623e-4959-8544-905162c00681")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'softwareComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e5af2f48-0046-43cd-b553-297864e71ffe")
    public SoftwareComponent getSoftwareComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponent")){
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ProfilerComponent.canInstantiate(d.getDependsOn()))
                     return (ProfilerComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ProfilerComponent.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ce0e1769-6668-484b-b45b-3dd63c163206")
    public SoftwareComponentInstance getSoftwareComponentInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponentInstance")){
                  if (SoftwareComponentInstance.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("72ff7b5b-f483-48db-9b6c-7f6dd7b36cd9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'softwareComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a68c0c84-be98-4a2f-bc3e-b6f5b81d70d6")
    public void setSoftwareComponent(final SoftwareComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("softwareComponent");      dep.putTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3bb82fe7-d6d5-425d-9b30-eeb03efc65fc")
    public void setSoftwareComponentInstance(final SoftwareComponentInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponentInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("softwareComponentInstance");      dep.putTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponentInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("05ddebc9-9af3-4863-80d6-352f2556deb8")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c5f47fb5-6252-4989-b5b0-e803acd8dc46")
    protected SoftwareComponentMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("6678fa3a-6261-42c4-945e-36481919263d")
    public static final class MdaTypes {
        @objid ("954335b1-8ac2-44b1-907a-2ede5f82dcba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b90fb5a7-69cb-4b81-865b-80da5fa7c485")
        private static Stereotype MDAASSOCDEP;

        @objid ("ff6bdb81-308c-47aa-b1d7-d151dd40d2a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9b08f4eb-f7e2-4f9b-875b-fbb47a81791e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cef53d47-e830-42d6-9834-bfc960dc6abe");
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
