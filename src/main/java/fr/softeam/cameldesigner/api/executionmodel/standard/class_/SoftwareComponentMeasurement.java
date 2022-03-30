/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("10a672e6-0ad6-42b4-a5d9-b8bea84b87ad")
    public static final String STEREOTYPE_NAME = "SoftwareComponentMeasurement";

    /**
     * Tells whether a {@link SoftwareComponentMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SoftwareComponentMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("455cc7ad-11cf-4918-bf1d-01ed45297c4e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SoftwareComponentMeasurement >> then instantiate a {@link SoftwareComponentMeasurement} proxy.
     * 
     * @return a {@link SoftwareComponentMeasurement} proxy on the created {@link Class}.
     */
    @objid ("8d3bffe2-8d62-497a-992d-3c1730555f7f")
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
    @objid ("623700e1-bebb-4df6-8983-d140ed13ec12")
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
    @objid ("4e63e785-92dc-49f8-ad75-2b74185c848a")
    public static SoftwareComponentMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SoftwareComponentMeasurement.canInstantiate(obj))
        	return new SoftwareComponentMeasurement(obj);
        else
        	throw new IllegalArgumentException("SoftwareComponentMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f749c534-0ddc-467a-9789-8fb91088583c")
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
    @objid ("fd04d1e0-fc50-4dbd-a5a4-9a5255210ce4")
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
    @objid ("4a906700-a320-498c-b5f7-e55e635bb5b8")
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
     * 
     */
    @objid ("fce84424-6042-4f8e-a7c3-8695ca5ee09f")
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

    @objid ("6ce28c42-6fd3-4878-a81e-3452fc17f809")
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
    @objid ("87c727c7-0d2f-47a4-bf4d-3e05127100eb")
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
    @objid ("8bc1a15c-ef76-40eb-b755-4c440fc0a7da")
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

    @objid ("e8c12097-d2c6-4ce0-a72e-d1b4073f5192")
    protected SoftwareComponentMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("6678fa3a-6261-42c4-945e-36481919263d")
    public static final class MdaTypes {
        @objid ("cc0eb15b-9e5b-4673-96a6-aa3f86c257a7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7347b8a9-a8af-4c65-8430-2c62974f3b3d")
        private static Stereotype MDAASSOCDEP;

        @objid ("8618b7da-1111-4303-b7a8-573649d73bb4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("af16a053-a3fe-4bae-845c-62ca7dd23336")
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
