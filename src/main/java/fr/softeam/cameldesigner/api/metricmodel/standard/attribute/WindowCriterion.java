/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("ab6d3e63-bdab-4d47-8927-b6c21276ea44")
    public static final String STEREOTYPE_NAME = "WindowCriterion";

    @objid ("f9dc560f-2d56-446c-a1be-fc58193f0e8c")
    public static final String ASCENDING_TAGTYPE = "ascending";

    @objid ("a6af4a77-9e4e-4a7f-8c42-48c82048259c")
    public static final String CUSTOM_TAGTYPE = "custom";

    @objid ("ae4e4264-a6fc-4d9f-917c-4fe7b4a51712")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link WindowCriterion proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << WindowCriterion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("191002ab-277b-46b6-996b-8b09a8bf4d50")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, WindowCriterion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << WindowCriterion >> then instantiate a {@link WindowCriterion} proxy.
     * 
     * @return a {@link WindowCriterion} proxy on the created {@link Attribute}.
     */
    @objid ("9170d816-69a3-4f2b-b3f5-fb55acb0918b")
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
    @objid ("18fbe0c6-1b55-41c8-b8f6-5523e37a59e7")
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
    @objid ("0429eb08-c0ab-4dbe-bcf2-c4e430c2df5d")
    public static WindowCriterion safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (WindowCriterion.canInstantiate(obj))
        	return new WindowCriterion(obj);
        else
        	throw new IllegalArgumentException("WindowCriterion: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3533ddb6-1e34-421b-a849-4494b620a7cc")
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
    @objid ("22dfbd96-16f2-4a85-b160-0be74b1c82d0")
    public String getCustom() {
        return this.elt.getTagValue(WindowCriterion.MdaTypes.CUSTOM_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("d37d8ad1-75ca-4b09-88ff-a9bc8f06ab8d")
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
    @objid ("4c54f526-cc70-4708-b4e7-8cb8752bae3b")
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
    @objid ("92eb16a9-2464-4263-a944-15e074ac336e")
    public String getType() {
        return this.elt.getTagValue(WindowCriterion.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @objid ("73ae0d75-171a-414f-a4ec-bc48d16f513d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'ascending'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ea1e23f7-fc17-450f-80f7-7576078218ab")
    public boolean isAscending() {
        return this.elt.isTagged(WindowCriterion.MdaTypes.ASCENDING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'ascending'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("add1c1ff-eab5-4ee0-a09b-03f9c8930f34")
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
    @objid ("bd785d46-43cc-4323-80bf-21186c25b424")
    public void setCustom(final String value) {
        this.elt.putTagValue(WindowCriterion.MdaTypes.CUSTOM_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'metric' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1b0397e1-c252-417c-8138-226ffd08330e")
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
    @objid ("8f0ff6fd-3759-46f6-b5d0-d677aa882eca")
    public void setType(final String value) {
        this.elt.putTagValue(WindowCriterion.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    @objid ("172cb672-8ecd-4769-9022-c7dcd88aec71")
    protected WindowCriterion(final Attribute elt) {
        super(elt);
    }

    @objid ("47b38b02-d301-4be9-b91c-62870fa9c181")
    public static final class MdaTypes {
        @objid ("a4931478-4369-4bf7-adf5-db18b1c7a881")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("52efc5b0-9aea-427d-a87b-b9de6dcf9d61")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("08653e25-d47c-4a0d-b108-7b28f10c48ec")
        public static TagType CUSTOM_TAGTYPE_ELT;

        @objid ("2febff58-361c-4430-83b7-d21d725b10a9")
        public static TagType ASCENDING_TAGTYPE_ELT;

        @objid ("0b6bee85-fc19-4234-8728-7e8bb2a0bc20")
        private static Stereotype MDAASSOCDEP;

        @objid ("c75a9bc8-ccf8-4b8e-bbfb-55aa5e817bae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fef1a8d7-0c5d-4d67-bc6b-ac463273d102")
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
