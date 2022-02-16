/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
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
 * Proxy class to handle a {@link Class} with << ObjectContext >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6b0e8788-1e8c-4f51-b3be-5895fa33507f")
public class ObjectContext extends FeatureClass {
    @objid ("49ff1ceb-7709-4536-bf10-fd757a9bdf1c")
    public static final String STEREOTYPE_NAME = "ObjectContext";

    /**
     * Tells whether a {@link ObjectContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ObjectContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9e31acbc-e333-4001-a449-c78df82e816d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ObjectContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ObjectContext >> then instantiate a {@link ObjectContext} proxy.
     * 
     * @return a {@link ObjectContext} proxy on the created {@link Class}.
     */
    @objid ("a86b5f93-7885-473d-912b-890f4e710fd3")
    public static ObjectContext create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ObjectContext.STEREOTYPE_NAME);
        return ObjectContext.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ObjectContext} proxy from a {@link Class} stereotyped << ObjectContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ObjectContext} proxy or <i>null</i>.
     */
    @objid ("2bfa39d1-000e-456a-81e0-98df2350c140")
    public static ObjectContext instantiate(final Class obj) {
        return ObjectContext.canInstantiate(obj) ? new ObjectContext(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ObjectContext} proxy from a {@link Class} stereotyped << ObjectContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ObjectContext} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9503b97c-a38e-40a9-9ac9-3c6c01f1fc6a")
    public static ObjectContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ObjectContext.canInstantiate(obj))
        	return new ObjectContext(obj);
        else
        	throw new IllegalArgumentException("ObjectContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("801eff60-424f-4600-ad8d-442a598b9176")
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
        ObjectContext other = (ObjectContext) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'communication' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("38f6fa57-b179-428c-aeff-8858195b6abb")
    public Communication getCommunication() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ObjectContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE), "communication")){
                  if (Communication.canInstantiate(d.getDependsOn()))
                     return (Communication)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Communication.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'component' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("832c5d22-d4ba-4567-9185-148e8754f7c8")
    public CamelComponent getComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ObjectContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE), "component")){
                  if (Container.canInstantiate(d.getDependsOn()))
                     return (Container)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Container.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PaaS.canInstantiate(d.getDependsOn()))
                     return (PaaS)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaS.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
                  if (VM.canInstantiate(d.getDependsOn()))
                     return (VM)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VM.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'data' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bef6f4dd-f646-4845-8b65-c5252e893c38")
    public Data getData() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ObjectContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE), "data")){
                  if (Data.canInstantiate(d.getDependsOn()))
                     return (Data)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Data.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("82fbf228-6207-48d7-8b2d-c543691937ce")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("6cb67350-84ab-450a-b341-a2a11ca0a815")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'communication' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("02a01b97-9637-4e40-a3bd-b8d66c4fd2e0")
    public void setCommunication(final Communication obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ObjectContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE), "communication")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ObjectContext.MdaTypes.MDAASSOCDEP);
              dep.setName("communication");      dep.putTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE, "communication");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'component' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d6a45626-6a54-4bd5-9e4f-05148f3d599a")
    public void setComponent(final CamelComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ObjectContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE), "component")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ObjectContext.MdaTypes.MDAASSOCDEP);
              dep.setName("component");      dep.putTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE, "component");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'data' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("890cdb9c-3de9-4219-ad95-97afffa6ecdc")
    public void setData(final Data obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ObjectContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE), "data")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ObjectContext.MdaTypes.MDAASSOCDEP);
              dep.setName("data");      dep.putTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE, "data");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("f6484111-a4a6-4d62-af98-21cb4ae4f1e1")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("ef838d3c-236f-4613-a88f-94376b6771d5")
    protected ObjectContext(final Class elt) {
        super(elt);
    }

    @objid ("5fffe97f-3562-4512-9295-ad884699b40d")
    public static final class MdaTypes {
        @objid ("f5898af6-e109-4f81-b501-c5f69f517d7a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ee230fc5-08b1-4d61-9153-30f3ec0701d1")
        private static Stereotype MDAASSOCDEP;

        @objid ("f6c6027a-0d30-4632-a9dd-08e93777fa30")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("45dd995d-c306-46e0-98f3-cf7d90126ccb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b5ec870a-0a52-4a49-a5f3-ee6a50acb0c7");
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
