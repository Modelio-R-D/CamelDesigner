/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("8fb868f9-bcb7-4b5e-accb-f1029e35d7b1")
    public static final String STEREOTYPE_NAME = "NonFunctionalEvent";

    @objid ("f06cde94-0a1f-443e-a34c-42092b73c4fe")
    public static final String ISVIOLATION_TAGTYPE = "isViolation";

    /**
     * Tells whether a {@link NonFunctionalEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << NonFunctionalEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("11533b79-c2d2-47d4-b5c3-af465da869ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << NonFunctionalEvent >> then instantiate a {@link NonFunctionalEvent} proxy.
     * 
     * @return a {@link NonFunctionalEvent} proxy on the created {@link Class}.
     */
    @objid ("c887dafe-0962-4655-a186-2568f05a6fc1")
    public static NonFunctionalEvent create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEvent.STEREOTYPE_NAME);
        return NonFunctionalEvent.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEvent} proxy from a {@link Class} stereotyped << NonFunctionalEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link NonFunctionalEvent} proxy or <i>null</i>.
     */
    @objid ("733119a3-7a41-4579-8f25-bc9ae9ed64cf")
    public static NonFunctionalEvent instantiate(final Class obj) {
        return NonFunctionalEvent.canInstantiate(obj) ? new NonFunctionalEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEvent} proxy from a {@link Class} stereotyped << NonFunctionalEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link NonFunctionalEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a44496ea-fd24-43e6-95f6-a4c262e0cd03")
    public static NonFunctionalEvent safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (NonFunctionalEvent.canInstantiate(obj))
        	return new NonFunctionalEvent(obj);
        else
        	throw new IllegalArgumentException("NonFunctionalEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fa6b7934-ed80-47e3-a206-226c41bdfe8d")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("4de62c3c-344b-4800-9f4d-a0fd005f11aa")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'metricConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c0f5caed-a671-4c02-b208-d38be001be79")
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

    @objid ("e3f7a3e6-cc5d-4cb9-975e-b908b87bab0d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isViolation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2315c27c-933c-48f3-ab02-34ba79d7d33d")
    public boolean isIsViolation() {
        return this.elt.isTagged(NonFunctionalEvent.MdaTypes.ISVIOLATION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'isViolation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f51465ca-a145-4dde-8c10-5d14b9f576f0")
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
     * 
     */
    @objid ("5e279452-0c85-47b5-b67f-a80caabc3ab1")
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

    @objid ("810c3615-bfc9-42ba-b42b-8b4f3360674e")
    protected NonFunctionalEvent(final Class elt) {
        super(elt);
    }

    @objid ("49bec042-33dd-4ad1-9b09-4dcfbe3512b3")
    public static final class MdaTypes {
        @objid ("ca91deac-8b86-4739-af33-e4ebac0abfc5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("78aec722-b7bf-43ca-87f6-31668bd587bb")
        public static TagType ISVIOLATION_TAGTYPE_ELT;

        @objid ("1699b4f9-dcac-4447-bf08-ab2f6c60199a")
        private static Stereotype MDAASSOCDEP;

        @objid ("c5f5876c-bdb0-4fd2-933b-341ca7bb4df4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("49dff8a8-f8db-4051-b669-c2b230015522")
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
