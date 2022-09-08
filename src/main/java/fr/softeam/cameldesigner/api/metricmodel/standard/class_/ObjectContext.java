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
    @objid ("4b4047d4-65d0-4d59-98ad-09d365ff3d1e")
    public static final String STEREOTYPE_NAME = "ObjectContext";

    /**
     * Tells whether a {@link ObjectContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ObjectContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1b296369-25c8-4a18-86aa-e885298a462f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ObjectContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ObjectContext >> then instantiate a {@link ObjectContext} proxy.
     * 
     * @return a {@link ObjectContext} proxy on the created {@link Class}.
     */
    @objid ("c96addbb-85a7-4ffc-a05d-88f82d076335")
    public static ObjectContext create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ObjectContext.STEREOTYPE_NAME);
        return ObjectContext.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ObjectContext} proxy from a {@link Class} stereotyped << ObjectContext >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ObjectContext} proxy or <i>null</i>.
     */
    @objid ("fefe5408-353b-473b-abba-b2d7e9086e31")
    public static ObjectContext instantiate(final Class obj) {
        return ObjectContext.canInstantiate(obj) ? new ObjectContext(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ObjectContext} proxy from a {@link Class} stereotyped << ObjectContext >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ObjectContext} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8edab14e-2cf6-41bb-91f8-e08d4d42c5a5")
    public static ObjectContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ObjectContext.canInstantiate(obj))
            return new ObjectContext(obj);
        else
            throw new IllegalArgumentException("ObjectContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bd955b2b-d638-461c-8558-266da6786b3e")
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
     */
    @objid ("b158fb80-6099-4c47-a282-0a6efc507b78")
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
     */
    @objid ("a5855ca6-49f2-4602-9cd9-fc1bea6cd424")
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
     */
    @objid ("b3b71cd4-46d2-417b-8ba6-2474caa8e702")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("5091c90e-b1e4-4616-a4ac-66554ae08bac")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("c8f66702-35db-43cd-8287-11f97241282c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'communication' role.<p>
     * Role description:
     * null
     */
    @objid ("35d208b9-df2d-40f5-9a01-2f67dd2d14d6")
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
     */
    @objid ("e5b7f086-bd03-4d3e-8a04-e7eca9656a90")
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
     */
    @objid ("32c16070-7fa7-4a03-be73-74f2e80afbf5")
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

    @objid ("43ba66bc-5bbe-44fa-a90d-97b6a0d543fc")
    protected ObjectContext(final Class elt) {
        super(elt);
    }

    @objid ("5fffe97f-3562-4512-9295-ad884699b40d")
    public static final class MdaTypes {
        @objid ("d2fa13ca-11ba-43a7-a8ba-ea93cd326cf6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("20075600-aaa4-4d8a-acc7-ca11092a70d2")
        private static Stereotype MDAASSOCDEP;

        @objid ("9f23930e-d177-4901-bdd9-e01838414abd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2700e7f7-9e47-4d5c-8f6f-357af2ad76c0")
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
