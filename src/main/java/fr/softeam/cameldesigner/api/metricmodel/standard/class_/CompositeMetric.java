/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("848d1b58-42c3-4f0d-b730-7654e8d97b66")
    public static final String STEREOTYPE_NAME = "CompositeMetric";

    @objid ("e44b1dc5-7a3d-47cd-9304-ab8498620ce7")
=======
    @objid ("0120140b-647c-40b7-9541-03ef689338e8")
    public static final String STEREOTYPE_NAME = "CompositeMetric";

    @objid ("081b1b82-9c50-4cc1-87fb-ad6c21d5b29f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String FORMULA_TAGTYPE = "formula";

    /**
     * Tells whether a {@link CompositeMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("99753909-e36e-4f7e-a54d-8ba08bb82840")
=======
    @objid ("916b8ce9-23be-408f-bc31-4af203549b42")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeMetric >> then instantiate a {@link CompositeMetric} proxy.
     * 
     * @return a {@link CompositeMetric} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("a52305fa-8ba0-48bd-906a-d5762ba4210d")
=======
    @objid ("1047dd57-313d-4b71-8988-036446a6d71f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b2d8d4af-e251-4148-adfd-3df44ddb08fd")
=======
    @objid ("e07da10c-e497-4834-af9e-be5f0e3d51fb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("8995dcd4-249c-40cc-a3b4-5c634927d0db")
=======
    @objid ("d57a3c42-706b-4632-962f-c1f839cb2009")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("53d626b7-a28c-4cf5-b8ec-a4a69e0755aa")
=======
    @objid ("ef7074e2-cbbd-4212-a025-d880fd984a0a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addComponentMetrics(final Metric obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeMetric.MdaTypes.MDAASSOCDEP);
            d.setName("componentMetrics");
            d.putTagValue(CompositeMetric.MdaTypes.MDAASSOCDEP_ROLE, "componentMetrics");
        }
    }

<<<<<<< HEAD
    @objid ("1e6d7ae5-14cd-49f1-a70f-028589650290")
=======
    @objid ("be93a165-712e-4d5c-a1ec-c2d532780350")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0df1f89c-bb3a-4a3b-93e7-5f225158df8c")
=======
    @objid ("109ee989-97e7-4471-86e5-96990c41d244")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("880f3a46-5cdd-4d8d-b3f7-895281fa07da")
=======
    @objid ("458f22e9-48c4-4d86-b16c-ff3f1ac44772")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("b07a3c51-6589-4bbe-b915-6bc3397751cf")
=======
    @objid ("f0680b6d-d7cc-4b5b-96e5-5256530875e4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getFormula() {
        return this.elt.getTagValue(CompositeMetric.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("4d05bf56-1c7c-48fc-8004-3ca17954559e")
=======
    @objid ("bfc0d3d8-f9ac-4a28-b0e4-57d577133c6f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1b1e330a-c688-4a80-bd95-47209cc976d5")
=======
    @objid ("31fdb8eb-91bf-4fe4-bac5-7cf379536329")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("85eb74e1-ead6-4190-9567-7bbe9de84a53")
=======
    @objid ("e8a67577-d95d-43de-b350-1c19f2553d1e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("79b41fc9-5a9a-4c93-9e40-59f9a26db232")
=======
    @objid ("538989f8-3b48-4eaf-858a-4af53e8dc85d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CompositeMetric(final Class elt) {
        super(elt);
    }

    @objid ("b52a26f6-5581-4431-a657-8c340315e64d")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("49828de9-bfde-4c23-91a3-38389a6c3450")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c7897650-417d-4c3f-b854-fc2949ff70c5")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("7762cdda-4677-48dd-a05a-a81c31a1179c")
        private static Stereotype MDAASSOCDEP;

        @objid ("d7aeedc8-edac-46d7-9c8b-d60b824f3280")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("506f7897-a25d-43c5-90c2-320d9bb157f3")
=======
        @objid ("49d7e5a9-f824-4f0c-89a0-23ee842bfb0c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("194ec045-1228-4584-a99c-fab45299ee5e")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("df34757c-7c1f-42e3-8011-96445855656d")
        private static Stereotype MDAASSOCDEP;

        @objid ("879727ff-7007-4a4c-968c-bb5857b2e465")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("53ce233d-db50-4dfd-8314-3a0598358a9d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
