/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
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
 * Proxy class to handle a {@link Class} with << NonFunctionalEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("91c5901d-2f7a-441c-aea0-ec0a3019dafd")
public class NonFunctionalEvent extends SingleEvent {
    @objid ("ed871635-2a4f-4706-949d-c7953d6d1f7d")
    public static final String STEREOTYPE_NAME = "NonFunctionalEvent";

    @objid ("64dd5bc7-8e55-4fcf-8839-3ccf31162df3")
    public static final String ISVIOLATION_TAGTYPE = "isViolation";

    /**
     * Tells whether a {@link NonFunctionalEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << NonFunctionalEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6d58cedf-5b6a-4685-9e14-ee232ad1b532")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << NonFunctionalEvent >> then instantiate a {@link NonFunctionalEvent} proxy.
     * 
     * @return a {@link NonFunctionalEvent} proxy on the created {@link Class}.
     */
    @objid ("ae42a764-47ff-4d16-8b88-e2ef1e5acbf0")
    public static NonFunctionalEvent create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEvent.STEREOTYPE_NAME);
        return NonFunctionalEvent.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEvent} proxy from a {@link Class} stereotyped << NonFunctionalEvent >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link NonFunctionalEvent} proxy or <i>null</i>.
     */
    @objid ("0f4968b3-b9b6-4838-89dc-c8e8ff77b4da")
    public static NonFunctionalEvent instantiate(final Class obj) {
        return NonFunctionalEvent.canInstantiate(obj) ? new NonFunctionalEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEvent} proxy from a {@link Class} stereotyped << NonFunctionalEvent >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link NonFunctionalEvent} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d2428460-e494-444b-a505-7dbe014079f1")
    public static NonFunctionalEvent safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (NonFunctionalEvent.canInstantiate(obj))
            return new NonFunctionalEvent(obj);
        else
            throw new IllegalArgumentException("NonFunctionalEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("11d99d9e-5f3e-49b1-a7c2-e98fd6084b6d")
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
        NonFunctionalEvent other = (NonFunctionalEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("658df804-dc9f-45f0-8ed5-b0f8d552e7a8")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'metricConstraint' role.<p>
     * Role description:
     * null
     */
    @objid ("7bddd27e-d243-4275-9702-c7e9cb6b44f3")
    public MetricConstraint getMetricConstraint() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(NonFunctionalEvent.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(NonFunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE), "metricConstraint")){
                  if (MetricConstraint.canInstantiate(d.getDependsOn()))
                     return (MetricConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricConstraint.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("cc92a8e7-aaa4-4cfe-b8b8-a5fbdf0835cd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isViolation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0b4fb731-c7b9-4d7f-a5ca-b2f707dfde68")
    public boolean isIsViolation() {
        return this.elt.isTagged(NonFunctionalEvent.MdaTypes.ISVIOLATION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'isViolation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("23d09aa5-2340-48fe-8bd8-0b405799cb8c")
    public void setIsViolation(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(NonFunctionalEvent.MdaTypes.ISVIOLATION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(NonFunctionalEvent.MdaTypes.ISVIOLATION_TAGTYPE_ELT);
    }

    /**
     * Set the value of the 'metricConstraint' role.<p>
     * Role description:
     * null
     */
    @objid ("21935591-1fd0-46f8-82b5-4fa2137ec831")
    public void setMetricConstraint(final MetricConstraint obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(NonFunctionalEvent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(NonFunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE), "metricConstraint")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), NonFunctionalEvent.MdaTypes.MDAASSOCDEP);
              dep.setName("metricConstraint");      dep.putTagValue(NonFunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE, "metricConstraint");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("ccf11b3a-c3d1-4fbc-9a06-fa865f4f4851")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("9b77f989-ac8c-47ca-86bb-f2484cfd5c61")
    protected NonFunctionalEvent(final Class elt) {
        super(elt);
    }

    @objid ("49bec042-33dd-4ad1-9b09-4dcfbe3512b3")
    public static final class MdaTypes {
        @objid ("24580e54-dc92-4a1d-ad7d-55aedf3f0541")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a5be4e93-9648-42fb-9c91-8283126a5e8f")
        public static TagType ISVIOLATION_TAGTYPE_ELT;

        @objid ("a9095156-f302-4dd0-a86f-28de32d56cd3")
        private static Stereotype MDAASSOCDEP;

        @objid ("9d6686bf-2c2c-4873-8621-5699a33e081f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f5405dc7-c710-4fe2-8715-cf3124b68136")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "af2fc032-7f83-4251-9a0c-8ef45959bb71");
            ISVIOLATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7adb963c-c7f7-4e56-9770-80f01813f2b5");
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
