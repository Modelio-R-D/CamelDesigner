/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << WindowCriterion >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("900e62c9-b5b3-47e5-bd4f-56f2ac5dc7a3")
public class WindowCriterion extends ExpendableElement {
    @objid ("27c7b1cb-32da-4200-872e-a84cd448504a")
    public static final String STEREOTYPE_NAME = "WindowCriterion";

    @objid ("57eac916-68c4-4a30-b9e4-a8c17ed0c798")
    public static final String ASCENDING_TAGTYPE = "ascending";

    @objid ("78894611-3b8e-41ea-8d67-8acdd34ccec0")
    public static final String CUSTOM_TAGTYPE = "custom";

    @objid ("ee2c4ebc-5947-4cdc-b827-087a1ea69219")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link WindowCriterion proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << WindowCriterion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fb179bec-ca04-401b-94a1-818bad8b0071")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, WindowCriterion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << WindowCriterion >> then instantiate a {@link WindowCriterion} proxy.
     * 
     * @return a {@link WindowCriterion} proxy on the created {@link Attribute}.
     */
    @objid ("3276c405-f36c-4b7c-9b6d-55c2346c4411")
    public static WindowCriterion create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, WindowCriterion.STEREOTYPE_NAME);
        return WindowCriterion.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link WindowCriterion} proxy from a {@link Attribute} stereotyped << WindowCriterion >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link WindowCriterion} proxy or <i>null</i>.
     */
    @objid ("5e2738ce-3dd6-4573-a385-3b164841d1ea")
    public static WindowCriterion instantiate(final Attribute obj) {
        return WindowCriterion.canInstantiate(obj) ? new WindowCriterion(obj) : null;
    }

    /**
     * Tries to instantiate a {@link WindowCriterion} proxy from a {@link Attribute} stereotyped << WindowCriterion >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link WindowCriterion} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8ebfdbff-64d5-4a3f-b84a-cf3fc72768b9")
    public static WindowCriterion safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (WindowCriterion.canInstantiate(obj))
        	return new WindowCriterion(obj);
        else
        	throw new IllegalArgumentException("WindowCriterion: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fd60285b-afc0-43a0-b073-3c9a497f1e89")
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
        WindowCriterion other = (WindowCriterion) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'custom'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("45701e1c-b1fd-4ed5-bebb-f528401a87c3")
    public String getCustom() {
        return this.elt.getTagValue(WindowCriterion.MdaTypes.CUSTOM_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("7f9f97b1-f937-4584-ba54-bc30e79e2215")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Get the value of the 'metric' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7c2eb73e-a9fe-4642-b0f5-d851ed04a0c7")
    public Metric getMetric() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(WindowCriterion.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(WindowCriterion.MdaTypes.MDAASSOCDEP_ROLE), "metric")){
                  if (CompositeSecurityMetric.canInstantiate(d.getDependsOn()))
                     return (CompositeSecurityMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeSecurityMetric.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CompositeMetric.canInstantiate(d.getDependsOn()))
                     return (CompositeMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeMetric.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricVariable.canInstantiate(d.getDependsOn()))
                     return (MetricVariable)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricVariable.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RawSecurityMetric.canInstantiate(d.getDependsOn()))
                     return (RawSecurityMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawSecurityMetric.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RawMetric.canInstantiate(d.getDependsOn()))
                     return (RawMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawMetric.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2d147394-08a8-4030-a0ef-5b3292f339a8")
    public String getType() {
        return this.elt.getTagValue(WindowCriterion.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @objid ("faebe471-6bef-4f10-ac8d-45317c33a7b1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'ascending'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e3d7df22-e32f-49b6-be6e-aa29e52f6dc9")
    public boolean isAscending() {
        return this.elt.isTagged(WindowCriterion.MdaTypes.ASCENDING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'ascending'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("614f7148-b138-4ffc-bf0c-1ed48f0a3b8e")
    public void setAscending(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(WindowCriterion.MdaTypes.ASCENDING_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(WindowCriterion.MdaTypes.ASCENDING_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'custom'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d3fd6248-70bb-4004-bcd8-ef50c599b7c9")
    public void setCustom(final String value) {
        this.elt.putTagValue(WindowCriterion.MdaTypes.CUSTOM_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'metric' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ab6c4603-00ca-4485-a167-75f2ec0014d6")
    public void setMetric(final Metric obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(WindowCriterion.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(WindowCriterion.MdaTypes.MDAASSOCDEP_ROLE), "metric")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), WindowCriterion.MdaTypes.MDAASSOCDEP);
              dep.setName("metric");      dep.putTagValue(WindowCriterion.MdaTypes.MDAASSOCDEP_ROLE, "metric");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6f4d9f3c-cc33-417e-9d4c-c00654ec5a23")
    public void setType(final String value) {
        this.elt.putTagValue(WindowCriterion.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    @objid ("487208dc-b394-481c-a809-20efd154f6b0")
    protected WindowCriterion(final Attribute elt) {
        super(elt);
    }

    @objid ("47b38b02-d301-4be9-b91c-62870fa9c181")
    public static final class MdaTypes {
        @objid ("6f27e87f-c542-4fe3-959e-49d680f49d3e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e71a3b09-2407-4cf1-a2f8-98141c4d379d")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("03c1a3c1-513e-45fa-be3a-cd70e5be2bb3")
        public static TagType CUSTOM_TAGTYPE_ELT;

        @objid ("ca6ddde5-1e3f-4182-91ae-9da36df485a6")
        public static TagType ASCENDING_TAGTYPE_ELT;

        @objid ("58a08879-0fbd-4390-9029-b10f3054d6f3")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ddbad78-f501-40a9-a3a8-4b0a2711933c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("891472f8-2732-4905-86b2-0930f6962986")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "81e92e20-6f60-47fa-b9ab-2fac27914b51");
            TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d7a1a6cc-9105-4915-939e-c0387b259400");
            CUSTOM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "79921b6b-9439-42eb-869f-5cebff44070a");
            ASCENDING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c1f10924-684c-49c9-8ca4-0d4f1df687cd");
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
