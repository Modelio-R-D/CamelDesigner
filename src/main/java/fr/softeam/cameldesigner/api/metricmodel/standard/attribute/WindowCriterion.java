/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("143a5a34-d2e8-4050-8c81-524a5639ef28")
    public static final String STEREOTYPE_NAME = "WindowCriterion";

    @objid ("5ea472fd-7c24-4f09-965c-136de235fd5c")
    public static final String ASCENDING_TAGTYPE = "ascending";

    @objid ("d4fafa78-56bc-440b-8c29-40d5bac9a712")
    public static final String CUSTOM_TAGTYPE = "custom";

    @objid ("66c915ab-1ca2-49a8-9df2-b063a4ddbdea")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link WindowCriterion proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << WindowCriterion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("265af3c0-5488-48bd-829a-3673560e66a2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, WindowCriterion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << WindowCriterion >> then instantiate a {@link WindowCriterion} proxy.
     * 
     * @return a {@link WindowCriterion} proxy on the created {@link Attribute}.
     */
    @objid ("ec92b129-53d5-430a-917b-4aed4356a534")
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
    @objid ("50ab0733-aca2-4727-bf31-c92b5c34d711")
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
    @objid ("3d9e21de-10aa-4cab-80c9-77097cd63fb9")
    public static WindowCriterion safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (WindowCriterion.canInstantiate(obj))
        	return new WindowCriterion(obj);
        else
        	throw new IllegalArgumentException("WindowCriterion: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("476b190b-ab6c-4b95-a35f-dc961fe80e8e")
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
    @objid ("cc303e43-e7b0-48a5-947f-9a7231e1149f")
    public String getCustom() {
        return this.elt.getTagValue(WindowCriterion.MdaTypes.CUSTOM_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("86b8fc6e-3d37-4022-a3cc-6860d40194cb")
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
    @objid ("20dbed16-b7af-438a-a5d0-475db3a175e2")
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
    @objid ("334ba6f5-e8ee-4f1a-bd51-ee5638c18878")
    public String getType() {
        return this.elt.getTagValue(WindowCriterion.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @objid ("96339ecf-ae0d-426b-9503-d780b963a0ef")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'ascending'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("efd94f1e-8599-455b-99b7-ad54464416d1")
    public boolean isAscending() {
        return this.elt.isTagged(WindowCriterion.MdaTypes.ASCENDING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'ascending'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("58168edd-fcfb-4797-8231-925510111a2d")
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
    @objid ("19e08e38-0d42-4a9f-9096-b48f3126eb1d")
    public void setCustom(final String value) {
        this.elt.putTagValue(WindowCriterion.MdaTypes.CUSTOM_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'metric' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ad739668-6ef1-4769-bc25-4899227db7f0")
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
    @objid ("6d3744eb-85ab-46d9-a60d-d79f4148b5df")
    public void setType(final String value) {
        this.elt.putTagValue(WindowCriterion.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    @objid ("2a79c2b5-b929-47b5-be6a-8c76c31ed293")
    protected WindowCriterion(final Attribute elt) {
        super(elt);
    }

    @objid ("47b38b02-d301-4be9-b91c-62870fa9c181")
    public static final class MdaTypes {
        @objid ("014a368d-b321-41ca-b64b-114c147efdda")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c8e133dc-5f0a-47cb-830b-68743e099c79")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("d2c87022-7c33-4bbd-aa03-d543532e4faa")
        public static TagType CUSTOM_TAGTYPE_ELT;

        @objid ("38885b8a-1a2c-4ce0-be9b-6fb775c04f4f")
        public static TagType ASCENDING_TAGTYPE_ELT;

        @objid ("c8052989-7d60-4be2-96a1-ae96d8d0305a")
        private static Stereotype MDAASSOCDEP;

        @objid ("70cfbfec-0572-474f-980b-9b6eca0e5d1d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("90584277-0688-4ee5-95ed-36205dd02cab")
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
