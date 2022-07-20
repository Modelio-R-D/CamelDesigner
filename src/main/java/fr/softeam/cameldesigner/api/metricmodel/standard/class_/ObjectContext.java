/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("1f1de7b9-8fca-4b61-b843-92612baffb94")
    public static final String STEREOTYPE_NAME = "ObjectContext";

    /**
     * Tells whether a {@link ObjectContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ObjectContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b60ab1ab-2634-4a3c-bf75-c497e4a1e047")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ObjectContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ObjectContext >> then instantiate a {@link ObjectContext} proxy.
     * 
     * @return a {@link ObjectContext} proxy on the created {@link Class}.
     */
    @objid ("81cd7e0e-5c07-4ffa-b93a-18b3b770068b")
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
    @objid ("22898775-b08b-453a-9dad-d8dbe323e48c")
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
    @objid ("472b0036-9714-4a8d-9d49-267ac088eea7")
    public static ObjectContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ObjectContext.canInstantiate(obj))
        	return new ObjectContext(obj);
        else
        	throw new IllegalArgumentException("ObjectContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("01c35c42-1e76-49dd-9efa-42072c2591ba")
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
    @objid ("d85b2a66-7878-4d51-b9a4-89e8c32d0e0e")
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
    @objid ("c3b0260d-c0b5-485c-8409-535f9f68129f")
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
    @objid ("6be4dd6e-3244-40d2-8075-c925fec1af40")
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
    @objid ("e8d38f3e-ecf7-4556-8963-7eb4aadd843d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("d88d9e49-bdcf-4442-af90-6c668edd5266")
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
    @objid ("6b1abe4d-99da-43a0-ab67-ea4f6212dcc8")
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
    @objid ("240e7c18-1a19-4a68-908c-773177c049e6")
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
    @objid ("cb6c3209-38f9-44b8-b472-24c102cb2f0e")
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

    @objid ("d0f75fda-c244-4910-9f42-96a02fb99e6f")
    protected ObjectContext(final Class elt) {
        super(elt);
    }

    @objid ("5fffe97f-3562-4512-9295-ad884699b40d")
    public static final class MdaTypes {
        @objid ("a78c5795-7760-4b6d-9d57-0ccf6f062669")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("908128b0-f806-45f5-9f26-9a289c7857e4")
        private static Stereotype MDAASSOCDEP;

        @objid ("816b5b12-e070-4bf3-8b51-6763cd38c06a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c53b29cf-b873-4e27-83ec-368c0363b188")
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
