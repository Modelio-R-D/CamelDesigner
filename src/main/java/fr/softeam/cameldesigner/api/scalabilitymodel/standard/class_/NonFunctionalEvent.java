/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("4033cc23-2984-483c-8ddf-26cd91ef7a12")
    public static final String STEREOTYPE_NAME = "NonFunctionalEvent";

    @objid ("0cd202db-4afe-4ce6-b90a-6442f2c99b12")
    public static final String ISVIOLATION_TAGTYPE = "isViolation";

    /**
     * Tells whether a {@link NonFunctionalEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << NonFunctionalEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e7ef0a1c-0de1-41c4-ab6d-8bb4875a5665")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << NonFunctionalEvent >> then instantiate a {@link NonFunctionalEvent} proxy.
     * 
     * @return a {@link NonFunctionalEvent} proxy on the created {@link Class}.
     */
    @objid ("ce4b7bc6-a202-4b70-a4ef-27d5d76dd969")
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
    @objid ("aa60543d-5ada-489f-a2c0-6241e8908965")
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
    @objid ("09e46013-b937-4a9a-9921-8b53b6eb0f17")
    public static NonFunctionalEvent safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (NonFunctionalEvent.canInstantiate(obj))
        	return new NonFunctionalEvent(obj);
        else
        	throw new IllegalArgumentException("NonFunctionalEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ca0a58c1-9288-44ae-8b8f-d5406a9f851f")
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
    @objid ("1181aa6e-699a-4924-aa7c-b7c380078a20")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'isViolation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6251f520-c582-4ba7-ba1e-082a5bf95040")
    public String getIsViolation() {
        return this.elt.getTagValue(NonFunctionalEvent.MdaTypes.ISVIOLATION_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'metricConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8c2a0fad-6b04-49c0-9833-3b67905ddbb0")
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

    @objid ("bbd2b1ef-206b-462c-87b1-2a59a0add329")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'isViolation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("33cb92a6-788d-4fe4-9a07-98fc91b75c06")
    public void setIsViolation(final String value) {
        this.elt.putTagValue(NonFunctionalEvent.MdaTypes.ISVIOLATION_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'metricConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("13a39c1d-581d-4af4-9420-750ea4a32b7c")
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

    @objid ("f0c43fdf-3252-4b95-9661-cdc831db55f3")
    protected NonFunctionalEvent(final Class elt) {
        super(elt);
    }

    @objid ("49bec042-33dd-4ad1-9b09-4dcfbe3512b3")
    public static final class MdaTypes {
        @objid ("a2f21977-9638-41c6-bce7-e1c33e3f36ca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4d360e8c-93fa-4db4-aeca-afec6a1bd200")
        public static TagType ISVIOLATION_TAGTYPE_ELT;

        @objid ("1dbd23de-fbab-42fb-9230-e7342772cafb")
        private static Stereotype MDAASSOCDEP;

        @objid ("4154145d-c30b-4341-bbe5-99db2f1fc01f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e4488f26-5ff1-4ed2-aeaa-5ac2f17c2620")
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
