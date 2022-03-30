/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("a39c71ef-d9fe-4595-b668-9179b55a1640")
    public static final String STEREOTYPE_NAME = "CompositeMetric";

    @objid ("f46727b4-d44f-4a55-ac1c-5a727a5efc9e")
    public static final String FORMULA_TAGTYPE = "formula";

    /**
     * Tells whether a {@link CompositeMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f5dcac3d-0497-4ce4-afd0-ff6e94a0e241")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeMetric >> then instantiate a {@link CompositeMetric} proxy.
     * 
     * @return a {@link CompositeMetric} proxy on the created {@link Class}.
     */
    @objid ("58160968-8d9d-4621-8259-2d94862c5bf3")
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
    @objid ("5608ba75-f8bf-469b-826a-d780a7b3ca3a")
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
    @objid ("6418d17c-7e1d-4b93-91d6-5057b8b2d5a5")
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
    @objid ("64580120-f793-4a06-bc98-c11b4aa0234b")
    public void addComponentMetrics(final Metric obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeMetric.MdaTypes.MDAASSOCDEP);
            d.setName("componentMetrics");
            d.putTagValue(CompositeMetric.MdaTypes.MDAASSOCDEP_ROLE, "componentMetrics");
        }
    }

    @objid ("78903d0a-58ff-47d3-aef8-50f3f14811dd")
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
    @objid ("833b5be5-4888-499f-9b97-2aef2a7c1934")
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
    @objid ("4e3c6a62-0224-4483-a45f-655ee6ab096b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("97a60161-9124-486e-bd63-7094e1327d67")
    public String getFormula() {
        return this.elt.getTagValue(CompositeMetric.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    @objid ("ededb73b-3a02-4f27-baa0-77defb526495")
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
    @objid ("a3a47933-0f08-4b1d-a749-3484a5ecd762")
    public boolean removeComponentMetrics(final Metric obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CompositeMetric.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CompositeMetric.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
    @objid ("6015afad-537d-4547-ab98-840a2bdade8d")
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

    @objid ("d2fa70c6-549b-448e-9f0d-5d83c4965142")
    protected CompositeMetric(final Class elt) {
        super(elt);
    }

    @objid ("b52a26f6-5581-4431-a657-8c340315e64d")
    public static final class MdaTypes {
        @objid ("04df80b7-d09c-4404-a089-9f6bef633e1b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("78aca303-c378-4ffe-8048-3c4145e14c53")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("97e1e3c9-6080-4a1e-b568-0e1ff15b123f")
        private static Stereotype MDAASSOCDEP;

        @objid ("7f5da88d-c3ce-4777-bb39-5cbe1fb29453")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3509e3ae-974a-4fbf-ae73-d01489c52a99")
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
