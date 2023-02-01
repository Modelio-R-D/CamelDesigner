/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
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
    @objid ("051aeaea-ae16-42bb-8b44-ee672aaeff2f")
    public static final String STEREOTYPE_NAME = "WindowCriterion";

    @objid ("3d8be6ae-630c-4fa9-8a58-f1e4a45346ff")
    public static final String ASCENDING_TAGTYPE = "ascending";

    @objid ("8286abeb-bc34-4e75-a882-89f5f63dc4bb")
    public static final String CUSTOM_TAGTYPE = "custom";

    @objid ("0d455807-4791-4a06-8ceb-80d9e84667d7")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link WindowCriterion proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << WindowCriterion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5f7b66a6-d8f5-406d-bd49-58274095d0b7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, WindowCriterion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << WindowCriterion >> then instantiate a {@link WindowCriterion} proxy.
     * 
     * @return a {@link WindowCriterion} proxy on the created {@link Attribute}.
     */
    @objid ("a6f31fac-b09e-4a26-b243-95b551a44061")
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
    @objid ("bded9f85-bf01-4a50-97e7-3c0731ffdec6")
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
    @objid ("81e923b7-a86a-4f73-96be-085763be4d81")
    public static WindowCriterion safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (WindowCriterion.canInstantiate(obj))
        	return new WindowCriterion(obj);
        else
        	throw new IllegalArgumentException("WindowCriterion: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fd404082-d905-40a9-a8b6-5134559bfe36")
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
    @objid ("51ffa914-c1ee-4d1a-92b1-c0f39777dd3f")
    public String getCustom() {
        return this.elt.getTagValue(WindowCriterion.MdaTypes.CUSTOM_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("32ef807d-0b0c-4d3a-9f0c-8e02fd01ce83")
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
    @objid ("76b506cc-7c9d-4106-a500-61b39e283c11")
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
    @objid ("ecacfdea-b315-478c-b838-11df637bc3ff")
    public String getType() {
        return this.elt.getTagValue(WindowCriterion.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @objid ("89102485-9fca-4719-999d-e3b77897b845")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'ascending'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c72e375c-adba-4c67-8058-2a040b5fd8a1")
    public boolean isAscending() {
        return this.elt.isTagged(WindowCriterion.MdaTypes.ASCENDING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'ascending'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("520167c3-9327-4842-84dd-1e3bc013a43e")
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
    @objid ("1ddbc744-d4ff-412d-a827-3c1442d86b41")
    public void setCustom(final String value) {
        this.elt.putTagValue(WindowCriterion.MdaTypes.CUSTOM_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'metric' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e008b9b8-d57d-4cd9-aa72-78816d7abcbd")
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
    @objid ("b99d2ad1-22be-4e2a-80a6-07732e81d4cf")
    public void setType(final String value) {
        this.elt.putTagValue(WindowCriterion.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    @objid ("7753d6eb-0a61-4601-ae18-d9955e7b89c7")
    protected WindowCriterion(final Attribute elt) {
        super(elt);
    }

    @objid ("47b38b02-d301-4be9-b91c-62870fa9c181")
    public static final class MdaTypes {
        @objid ("e127a824-9079-4cf3-bb8b-ad1f3f41dd3f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7742dbd4-44c2-4df3-80e8-d03ec6d1793f")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("1cb67e9c-eb28-4fb8-b1d8-be54cce8c2ba")
        public static TagType CUSTOM_TAGTYPE_ELT;

        @objid ("afc60d99-e842-404c-9560-0d2a93e636f7")
        public static TagType ASCENDING_TAGTYPE_ELT;

        @objid ("f90f5e65-31d4-4b06-ac3c-c889f8eabd42")
        private static Stereotype MDAASSOCDEP;

        @objid ("58d8b608-5867-47f1-9965-b866011ed12b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6b0a86e0-12a1-40a8-9071-4a45544dbb9a")
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
