/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.MeasurableAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.QualityAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.AttributeInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.MeasurableAttributeInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.QualityAttributeInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
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
 * Proxy class to handle a {@link Class} with << FunctionalEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6506e3fc-10e0-4ba7-b4b6-3bccd0b9a073")
public class FunctionalEvent extends SingleEvent {
    @objid ("d2e0dbd7-f00e-4838-8f99-8322ec38ad1d")
    public static final String STEREOTYPE_NAME = "FunctionalEvent";

    /**
     * Tells whether a {@link FunctionalEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FunctionalEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cfecc7ad-252e-4b2e-bd07-4b3ef9c47a40")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FunctionalEvent >> then instantiate a {@link FunctionalEvent} proxy.
     * 
     * @return a {@link FunctionalEvent} proxy on the created {@link Class}.
     */
    @objid ("af8ae7bd-361b-4045-9a50-931404aaa165")
    public static FunctionalEvent create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEvent.STEREOTYPE_NAME);
        return FunctionalEvent.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FunctionalEvent} proxy from a {@link Class} stereotyped << FunctionalEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link FunctionalEvent} proxy or <i>null</i>.
     */
    @objid ("c104bba1-fb48-4804-85f9-57836f444d61")
    public static FunctionalEvent instantiate(final Class obj) {
        return FunctionalEvent.canInstantiate(obj) ? new FunctionalEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FunctionalEvent} proxy from a {@link Class} stereotyped << FunctionalEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link FunctionalEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2e4ececb-0ea3-402c-b0b8-30e75af6f9b4")
    public static FunctionalEvent safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FunctionalEvent.canInstantiate(obj))
        	return new FunctionalEvent(obj);
        else
        	throw new IllegalArgumentException("FunctionalEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d1ad9eda-7728-4b21-88e9-7e4cdc86308d")
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
        FunctionalEvent other = (FunctionalEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'component' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("11b6dff1-7017-4868-ba0d-29a74bd6bd68")
    public CamelComponent getComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(FunctionalEvent.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(FunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE), "component")){
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
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("440813cf-c0fb-4b00-b26d-ad8dd3b59104")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'functionalType' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("34b207a5-687f-4307-8d73-d4cfaa3d00dc")
    public CamelAttribute getFunctionalType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(FunctionalEvent.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(FunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE), "functionalType")){
                  if (MeasurableAttributeAttribute.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (QualityAttributeAttribute.canInstantiate(d.getDependsOn()))
                     return (QualityAttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), QualityAttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeAttribute.canInstantiate(d.getDependsOn()))
                     return (AttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MeasurableAttributeClass.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttributeClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Certifiable.canInstantiate(d.getDependsOn()))
                     return (Certifiable)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Certifiable.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SecurityAttribute.canInstantiate(d.getDependsOn()))
                     return (SecurityAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (QualityAttributeClass.canInstantiate(d.getDependsOn()))
                     return (QualityAttributeClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), QualityAttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeClass.canInstantiate(d.getDependsOn()))
                     return (AttributeClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MeasurableAttributeInstance.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttributeInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttributeInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (QualityAttributeInstance.canInstantiate(d.getDependsOn()))
                     return (QualityAttributeInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), QualityAttributeInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeInstance.canInstantiate(d.getDependsOn()))
                     return (AttributeInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("7e281489-f38a-4c44-8968-b33f32d64f42")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'component' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("c56165e2-6b5b-4076-bf0d-c81fb82bfafd")
    public void setComponent(final CamelComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(FunctionalEvent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(FunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE), "component")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), FunctionalEvent.MdaTypes.MDAASSOCDEP);
              dep.setName("component");      dep.putTagValue(FunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE, "component");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'functionalType' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("c5fc803d-f8a3-48f6-9105-a32af8fe8a36")
    public void setFunctionalType(final CamelAttribute obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(FunctionalEvent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(FunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE), "functionalType")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), FunctionalEvent.MdaTypes.MDAASSOCDEP);
              dep.setName("functionalType");      dep.putTagValue(FunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE, "functionalType");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("3e848fb0-f7db-47f2-bbc2-e9fca64e6a2f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("bd70aab3-dbd5-456d-863d-067998b4ae7c")
    protected FunctionalEvent(final Class elt) {
        super(elt);
    }

    @objid ("1a266afd-186e-43cc-a4d6-d8eda707e81a")
    public static final class MdaTypes {
        @objid ("310ecbc3-cdf2-4dcd-b5d3-70a3c582be2b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("41148533-3d55-4e86-be9d-0d6eefd50c4f")
        private static Stereotype MDAASSOCDEP;

        @objid ("8bcfb048-a726-4cf2-944e-0dd92415fbd4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8b92694d-e444-4518-874a-f7691794ec94")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8d4865c6-d973-416b-ba6e-62311853e410");
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
