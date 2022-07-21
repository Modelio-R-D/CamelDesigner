/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("24bbe3c0-ad7c-45ce-9d1b-966e745c49cb")
    public static final String STEREOTYPE_NAME = "ObjectContext";

    /**
     * Tells whether a {@link ObjectContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ObjectContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f4c857d9-8afd-4bfd-8516-3fca1b1c653c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ObjectContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ObjectContext >> then instantiate a {@link ObjectContext} proxy.
     * 
     * @return a {@link ObjectContext} proxy on the created {@link Class}.
     */
    @objid ("2b219f46-e157-43aa-a1d2-7c65c37a7096")
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
    @objid ("fb67825f-db8d-43a4-a757-c0b91dcf117a")
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
    @objid ("ce10b4d9-1750-47c2-8e9e-9a3be1e7af6c")
    public static ObjectContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ObjectContext.canInstantiate(obj))
        	return new ObjectContext(obj);
        else
        	throw new IllegalArgumentException("ObjectContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("04be78b5-d2f7-4929-b525-b49ad9565990")
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
    @objid ("b835d754-2e16-4fbe-ac62-3064f8780a5b")
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
    @objid ("fc9a453f-dcdd-435b-bacf-030a7cc9b6e5")
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
    @objid ("e1a978d2-cbdd-4e4b-8864-494e37631b7b")
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
    @objid ("24a16dfc-f40c-4197-8801-dee890f1bfb3")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("ae224364-f503-476c-a3a5-8498883f176e")
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
    @objid ("9e2cc8fe-a28e-4230-bfa6-8695d57aa423")
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
    @objid ("e3ab2a17-1a29-47da-9ed8-0440ffde0076")
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
    @objid ("9a2ac807-3705-4195-b2c0-c22fb5b940ce")
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

    @objid ("a77654bd-1434-44d4-9776-759bce7bb423")
    protected ObjectContext(final Class elt) {
        super(elt);
    }

    @objid ("5fffe97f-3562-4512-9295-ad884699b40d")
    public static final class MdaTypes {
        @objid ("fb1fed8d-6ceb-43d9-acee-1174ee5eb133")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9dd72b8b-ebd4-4483-893d-030ea453a3ed")
        private static Stereotype MDAASSOCDEP;

        @objid ("0605df98-6f95-43a1-bdaa-ca07cfdd65ce")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d53c10b5-c7df-4e38-a883-93ba9f1c91db")
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
