/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e98b4454-7fc4-40b8-9148-8dead72bf95f")
=======
    @objid ("1e3ca7a9-7d53-4e9b-8a3b-ccb03eeb4524")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "FunctionalEvent";

    /**
     * Tells whether a {@link FunctionalEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FunctionalEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("4ef97002-2c27-4067-acef-0d931c6016df")
=======
    @objid ("2e0496e7-d355-4466-8daa-05cf3d02cca3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FunctionalEvent >> then instantiate a {@link FunctionalEvent} proxy.
     * 
     * @return a {@link FunctionalEvent} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("bed559c8-1abe-48d5-bb7c-f584dea42e2b")
=======
    @objid ("ef4217ae-1fd2-41c5-b8ca-89f8e9a736c6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("90b7f1b2-8360-4642-ba42-5370c6c60d94")
=======
    @objid ("76bc6262-c796-46b9-a1a2-dc1a22d38c6e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5b07d2e4-c4f5-4b54-b258-a47ace58340e")
=======
    @objid ("8196d313-9882-4450-9fa5-6a212f864a48")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FunctionalEvent safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FunctionalEvent.canInstantiate(obj))
        	return new FunctionalEvent(obj);
        else
        	throw new IllegalArgumentException("FunctionalEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("716bd5ce-af6a-4021-9fe6-d1d4bf34b977")
=======
    @objid ("378fe3c2-66de-4525-b435-f229a1e991f7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b54077e2-0789-4357-b2bb-c3af213aecf1")
=======
    @objid ("6671c03d-1c00-423f-92aa-5b55ca6201ae")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("bdc8f95c-bc1b-48a0-811e-a7f70664926a")
=======
    @objid ("7efa2a9d-9342-4d60-afb3-98a79ccf5738")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("31f5b11e-b111-4fba-8c90-983c4737b94e")
=======
    @objid ("9803f3a2-9873-4974-8880-96ff683893d7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("4700b4c2-7249-4d25-8610-625589da3cca")
=======
    @objid ("95443fca-555d-44ae-92f4-2b5275cda1c6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e6f3eda2-a270-4b96-aa81-087ef80a8188")
=======
    @objid ("46a1d21a-c776-4964-901b-70140c6bf218")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d9877185-c7f3-493c-ad4c-3c460fd8d23b")
=======
    @objid ("07d00e3c-e6ec-4552-b594-f15e3fbff2ea")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("985c5786-5c82-4f43-ba6c-29061d9a0e9b")
=======
    @objid ("fb2e5abf-3262-44d9-8e83-e3e875bc2740")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected FunctionalEvent(final Class elt) {
        super(elt);
    }

    @objid ("1a266afd-186e-43cc-a4d6-d8eda707e81a")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("603b4ae1-041f-4538-b415-9d4dd05b2d5e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("af7b4e6b-2a0a-4697-843b-30fb5bd470a4")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1cb20c3-5a17-492e-92fc-f0e9913966c5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a4a7b465-5629-4baa-8647-dfac304a9d41")
=======
        @objid ("c3bc8dc8-5fd6-4b31-9ad6-ece49d64acbd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("57dbe642-8755-42c8-a110-1968603eabcd")
        private static Stereotype MDAASSOCDEP;

        @objid ("4a64b3a4-4cdf-47f1-a161-c581f1a6cbc3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7a4e3a4f-efe4-4e09-8e66-aeb1003549ad")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
