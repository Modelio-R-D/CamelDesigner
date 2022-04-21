/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("c6e665b4-addb-4cca-91cc-3fb77b9b8bc5")
    public static final String STEREOTYPE_NAME = "SoftwareComponentMeasurement";

    /**
     * Tells whether a {@link SoftwareComponentMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SoftwareComponentMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("10f01096-cd78-42d6-9333-1333be22d170")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SoftwareComponentMeasurement >> then instantiate a {@link SoftwareComponentMeasurement} proxy.
     * 
     * @return a {@link SoftwareComponentMeasurement} proxy on the created {@link Class}.
     */
    @objid ("52c99106-c534-4423-8f68-a6fec1a518fd")
    public static SoftwareComponentMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentMeasurement.STEREOTYPE_NAME);
        return SoftwareComponentMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentMeasurement} proxy from a {@link Class} stereotyped << SoftwareComponentMeasurement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link SoftwareComponentMeasurement} proxy or <i>null</i>.
     */
    @objid ("ee2999ea-ac8f-4551-9e45-a5408b9c9864")
    public static SoftwareComponentMeasurement instantiate(final Class obj) {
        return SoftwareComponentMeasurement.canInstantiate(obj) ? new SoftwareComponentMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentMeasurement} proxy from a {@link Class} stereotyped << SoftwareComponentMeasurement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link SoftwareComponentMeasurement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("29e3baf7-2247-4dc7-bb66-e5cf1b741142")
    public static SoftwareComponentMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SoftwareComponentMeasurement.canInstantiate(obj))
            return new SoftwareComponentMeasurement(obj);
        else
            throw new IllegalArgumentException("SoftwareComponentMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fe517f00-80b7-4237-bd83-f8a30287a39a")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f5ae3852-c36a-46c4-94af-958315ada83c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'softwareComponent' role.<p>
     * Role description:
     * null
     */
    @objid ("256c4f93-2230-456f-9808-880dd49aa019")
    public SoftwareComponent getSoftwareComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponent")){
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
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
     */
    @objid ("0eb6d8e2-2029-46f9-8bc6-17b4355a576e")
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

    @objid ("0c12edda-f20e-405b-9784-211c51b1365d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'softwareComponent' role.<p>
     * Role description:
     * null
     */
    @objid ("5700b74e-a245-4baf-8463-2c66ca0b2bba")
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
     */
    @objid ("92552fcc-3c98-4d68-9565-8c7e926620ed")
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

    @objid ("55430111-cae7-4247-896a-96ef21282cbd")
    protected SoftwareComponentMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("6678fa3a-6261-42c4-945e-36481919263d")
    public static final class MdaTypes {
        @objid ("3c0270ed-dbbc-4fbd-b449-b88300c6d4de")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fdf56d89-bdcd-44c5-a14a-ef5accfae8c5")
        private static Stereotype MDAASSOCDEP;

        @objid ("4081a1b1-0f63-4116-b5a6-f7ce38fb9f54")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("712d530b-98c3-48b1-b354-679185bf7dc2")
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
