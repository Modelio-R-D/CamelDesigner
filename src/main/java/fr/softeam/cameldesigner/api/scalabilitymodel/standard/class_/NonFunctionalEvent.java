/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("c376d339-619a-49c1-8917-e7e917546d6e")
    public static final String STEREOTYPE_NAME = "NonFunctionalEvent";

    @objid ("57b76f2e-2fc7-4b10-b42c-870537af85e8")
    public static final String ISVIOLATION_TAGTYPE = "isViolation";

    /**
     * Tells whether a {@link NonFunctionalEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << NonFunctionalEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e36dfcd7-790c-44d3-978b-483d83a7cfea")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << NonFunctionalEvent >> then instantiate a {@link NonFunctionalEvent} proxy.
     * 
     * @return a {@link NonFunctionalEvent} proxy on the created {@link Class}.
     */
    @objid ("bd184a6d-1fb8-482b-bd8b-2b30d9d8bb49")
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
    @objid ("3fd13bb4-7aa8-498e-a7a1-e7afe13512de")
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
    @objid ("4ca38420-65e0-4553-8985-78c708dfb41a")
    public static NonFunctionalEvent safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (NonFunctionalEvent.canInstantiate(obj))
            return new NonFunctionalEvent(obj);
        else
            throw new IllegalArgumentException("NonFunctionalEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d1f8d4f6-9be5-4d2e-8af8-0c4b3e14d398")
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
    @objid ("79e88203-1e3f-4de0-a4e1-c9696bb70a5d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'metricConstraint' role.<p>
     * Role description:
     * null
     */
    @objid ("2c415069-c2df-4504-9f42-8426278261a3")
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

    @objid ("d05ad61b-b790-4703-bc45-0884056fd494")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isViolation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0b61febb-f608-4623-8b35-9d5bda3c0728")
    public boolean isIsViolation() {
        return this.elt.isTagged(NonFunctionalEvent.MdaTypes.ISVIOLATION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'isViolation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("014763d6-c92a-463e-87f8-46e4ff517ab5")
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
    @objid ("e14627c4-7a1b-4348-999f-f579786c59fb")
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

    @objid ("27ae8f79-c1d5-4bf0-9baf-104f664dccb4")
    protected NonFunctionalEvent(final Class elt) {
        super(elt);
    }

    @objid ("49bec042-33dd-4ad1-9b09-4dcfbe3512b3")
    public static final class MdaTypes {
        @objid ("0b3ffaa9-a0e6-467a-83b2-fac558c737fc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("995385f4-b4da-48f3-a55a-7296723c2e70")
        public static TagType ISVIOLATION_TAGTYPE_ELT;

        @objid ("113838b1-c36d-4e8d-b2db-d573cb41ba85")
        private static Stereotype MDAASSOCDEP;

        @objid ("1c7ab9cc-08d6-4b54-83c8-cc180aabccc7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9de3004c-8256-41b3-9c9c-190834517579")
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
