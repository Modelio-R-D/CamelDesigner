/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << CompositeMetric >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0f0eceac-8159-46e5-b1f0-1e1cd9fd9b49")
public class CompositeMetric extends Metric {
    @objid ("3d5bb96c-2879-498d-8dde-feb839075933")
    public static final String STEREOTYPE_NAME = "CompositeMetric";

    @objid ("f5e2150d-033d-41de-8e78-6a6dc2ac8460")
    public static final String FORMULA_TAGTYPE = "formula";

    /**
     * Tells whether a {@link CompositeMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c5f306ed-2ca2-4035-8b9c-8114bb9ca82b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeMetric >> then instantiate a {@link CompositeMetric} proxy.
     * 
     * @return a {@link CompositeMetric} proxy on the created {@link Class}.
     */
    @objid ("eedbe91a-63cc-4f17-9c5c-3d375e71a3ba")
    public static CompositeMetric create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetric.STEREOTYPE_NAME);
        return CompositeMetric.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CompositeMetric} proxy from a {@link Class} stereotyped << CompositeMetric >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CompositeMetric} proxy or <i>null</i>.
     */
    @objid ("be335afb-ac3b-4f44-9a5f-87faab150c5c")
    public static CompositeMetric instantiate(final Class obj) {
        return CompositeMetric.canInstantiate(obj) ? new CompositeMetric(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CompositeMetric} proxy from a {@link Class} stereotyped << CompositeMetric >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CompositeMetric} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("06d31351-83bb-4cda-8750-2123dfd3d6e9")
    public static CompositeMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CompositeMetric.canInstantiate(obj))
        	return new CompositeMetric(obj);
        else
        	throw new IllegalArgumentException("CompositeMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'componentMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8e8b113d-b14e-4347-b671-44d45a978cbb")
    public void addComponentMetrics(final Metric obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeMetric.MdaTypes.MDAASSOCDEP);
            d.setName("componentMetrics");
            d.putTagValue(CompositeMetric.MdaTypes.MDAASSOCDEP_ROLE, "componentMetrics");
        }
    }

    @objid ("487cac1e-cc7e-46c1-9139-0dd0bd5743e8")
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
        CompositeMetric other = (CompositeMetric) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'componentMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("66bac218-5422-4ac2-af6d-185d2e84a2ad")
    public List<Metric> getComponentMetrics() {
        List<Metric> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(CompositeMetric.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CompositeMetric.MdaTypes.MDAASSOCDEP_ROLE), "componentMetrics")){
              if (CompositeSecurityMetric.canInstantiate(d.getDependsOn()))
                results.add((CompositeSecurityMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeSecurityMetric.MdaTypes.STEREOTYPE_ELT.getName()));
              if (CompositeMetric.canInstantiate(d.getDependsOn()))
                results.add((CompositeMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeMetric.MdaTypes.STEREOTYPE_ELT.getName()));
              if (MetricVariable.canInstantiate(d.getDependsOn()))
                results.add((MetricVariable)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricVariable.MdaTypes.STEREOTYPE_ELT.getName()));
              if (RawSecurityMetric.canInstantiate(d.getDependsOn()))
                results.add((RawSecurityMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawSecurityMetric.MdaTypes.STEREOTYPE_ELT.getName()));
              if (RawMetric.canInstantiate(d.getDependsOn()))
                results.add((RawMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawMetric.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("584dedfb-a2f3-45a7-800f-11e0d810e806")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5108aaa8-bae3-4bd5-b0d9-34f538245dc3")
    public String getFormula() {
        return this.elt.getTagValue(CompositeMetric.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    @objid ("aea5c066-09d3-49bd-90cf-047a202bb76b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'componentMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5b95028b-6b56-4894-a150-1e911688ab49")
    public boolean removeComponentMetrics(final Metric obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CompositeMetric.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CompositeMetric.MdaTypes.MDAASSOCDEP_ROLE), "componentMetrics")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bf4031fb-da59-46be-82d3-6b8d91f1cef9")
    public void setFormula(final String value) {
        this.elt.putTagValue(CompositeMetric.MdaTypes.FORMULA_TAGTYPE_ELT, value);
    }

    @objid ("e8f98591-b838-4488-8fe0-6f1ebd8abf79")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("05311d5a-32a6-46ca-9d95-39e91ff250ea")
    protected CompositeMetric(final Class elt) {
        super(elt);
    }

    @objid ("b52a26f6-5581-4431-a657-8c340315e64d")
    public static final class MdaTypes {
        @objid ("8e659ad4-b7b6-4155-b92e-f3767e08587e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2332e747-4536-4c80-9454-7303caf6b8de")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("ca1e73f9-a14e-4f82-bc7e-c2f86cdf1995")
        private static Stereotype MDAASSOCDEP;

        @objid ("cf146324-c6f4-40b6-96dd-c2a9aabfd14f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2bd3840a-4ffd-40a9-8c7d-912c30178dbc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "680d667b-9545-40d8-9c12-84675bc68fc4");
            FORMULA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851d14e4-ea15-4582-a92c-96160e350212");
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
