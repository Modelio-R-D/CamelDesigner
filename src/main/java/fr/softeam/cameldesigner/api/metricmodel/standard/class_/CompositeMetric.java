/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("7ec242ff-a6b4-48d6-8171-54725359a93a")
    public static final String STEREOTYPE_NAME = "CompositeMetric";

    @objid ("ee75d5d6-52dd-48eb-8d64-2621a8c40319")
    public static final String FORMULA_TAGTYPE = "formula";

    /**
     * Tells whether a {@link CompositeMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0a166f80-4c96-4ba0-aa79-5b8c01470337")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeMetric >> then instantiate a {@link CompositeMetric} proxy.
     * 
     * @return a {@link CompositeMetric} proxy on the created {@link Class}.
     */
    @objid ("4f3421c1-8386-430d-b555-7bf31fdfe609")
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
    @objid ("70f5abae-e705-483b-bc38-47af0da82b21")
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
    @objid ("c5710d60-9e19-488c-b2bc-040345476508")
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
    @objid ("06ff61e9-4d91-438e-9844-173c7670d6d3")
    public void addComponentMetrics(final Metric obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeMetric.MdaTypes.MDAASSOCDEP);
            d.setName("componentMetrics");
            d.putTagValue(CompositeMetric.MdaTypes.MDAASSOCDEP_ROLE, "componentMetrics");
        }
    }

    @objid ("78cdc004-57f8-4a84-bba3-7b76fb03b6f9")
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
    @objid ("ba9f193c-74b1-478b-af88-dcbf1fb4cef6")
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
    @objid ("0ad1f945-0c8d-4f02-96cc-4f1d33e6ba8c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b3ed9d37-b75f-482b-90b7-671aca50ca2d")
    public String getFormula() {
        return this.elt.getTagValue(CompositeMetric.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    @objid ("e9d97f1b-a5ee-4161-9af4-e7d3471f4a7b")
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
    @objid ("a651bc82-f84b-4f5b-bb64-4397a83085c2")
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
    @objid ("ab0a8117-410e-44da-b8a2-5ae01faff313")
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

    @objid ("89cc357d-e9e0-454f-961c-1764a4d49864")
    protected CompositeMetric(final Class elt) {
        super(elt);
    }

    @objid ("b52a26f6-5581-4431-a657-8c340315e64d")
    public static final class MdaTypes {
        @objid ("2052618f-5df6-464b-b985-7b14f77a9fce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f9bf98ef-a6af-40f9-882d-1c5e08ca3266")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("a4e40066-91f0-40fc-a61e-2f0e4baaa87f")
        private static Stereotype MDAASSOCDEP;

        @objid ("182cfd51-8c86-4633-87ff-d37792911cff")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c038bf4a-6c0f-4c38-9aa6-7e85cf6f1f77")
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
