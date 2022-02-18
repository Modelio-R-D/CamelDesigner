/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
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
 * Proxy class to handle a {@link Class} with << CompositeMetricContext >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("448daa47-c892-46fc-8cf2-94d1153ff985")
public class CompositeMetricContext extends MetricContext {
    @objid ("b5cb9974-da12-4b1e-9ef6-9f194fead5c1")
    public static final String STEREOTYPE_NAME = "CompositeMetricContext";

    @objid ("a627e296-42b9-48e3-be7a-eac0fa3c9049")
    public static final String GROUPINGTYPE_TAGTYPE = "groupingType";

    /**
     * Tells whether a {@link CompositeMetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeMetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a3a52680-b467-42c0-ab1e-d6ec8c13a6b2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetricContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeMetricContext >> then instantiate a {@link CompositeMetricContext} proxy.
     * 
     * @return a {@link CompositeMetricContext} proxy on the created {@link Class}.
     */
    @objid ("1cf8d810-965a-4219-b11b-99a462036951")
    public static CompositeMetricContext create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetricContext.STEREOTYPE_NAME);
        return CompositeMetricContext.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CompositeMetricContext} proxy from a {@link Class} stereotyped << CompositeMetricContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CompositeMetricContext} proxy or <i>null</i>.
     */
    @objid ("dcfd4c53-2817-42ea-9dad-4c0bcaa2ff65")
    public static CompositeMetricContext instantiate(final Class obj) {
        return CompositeMetricContext.canInstantiate(obj) ? new CompositeMetricContext(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CompositeMetricContext} proxy from a {@link Class} stereotyped << CompositeMetricContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CompositeMetricContext} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4b48ec39-590c-4c33-b0cf-24a30d294df1")
    public static CompositeMetricContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CompositeMetricContext.canInstantiate(obj))
        	return new CompositeMetricContext(obj);
        else
        	throw new IllegalArgumentException("CompositeMetricContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'composingMetricContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("87a6707e-0aa6-4065-b7f8-d64592946c3d")
    public void addComposingMetricContexts(final MetricContext obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeMetricContext.MdaTypes.MDAASSOCDEP);
            d.setName("composingMetricContexts");
            d.putTagValue(CompositeMetricContext.MdaTypes.MDAASSOCDEP_ROLE, "composingMetricContexts");
        }
    }

    @objid ("4eef561c-bd76-4e04-a956-e39ecc671070")
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
        CompositeMetricContext other = (CompositeMetricContext) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'composingMetricContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("17197e12-7ce4-460f-9184-f0ded647c1a7")
    public List<MetricContext> getComposingMetricContexts() {
        List<MetricContext> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(CompositeMetricContext.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CompositeMetricContext.MdaTypes.MDAASSOCDEP_ROLE), "composingMetricContexts")){
              if (CompositeMetricContext.canInstantiate(d.getDependsOn()))
                results.add((CompositeMetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeMetricContext.MdaTypes.STEREOTYPE_ELT.getName()));
              if (RawMetricContext.canInstantiate(d.getDependsOn()))
                results.add((RawMetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawMetricContext.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("393b0b86-d5f6-4d2e-90c0-a21ccaa7b82c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'groupingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dc0f5b55-110c-4206-83ab-d12bd50702f2")
    public String getGroupingType() {
        return this.elt.getTagValue(CompositeMetricContext.MdaTypes.GROUPINGTYPE_TAGTYPE_ELT);
    }

    @objid ("538c2714-3de4-4ee3-a7fa-e53df9ef303b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'composingMetricContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7b9f39b4-29a7-43e4-aae8-b37b0b5fea83")
    public boolean removeComposingMetricContexts(final MetricContext obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CompositeMetricContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CompositeMetricContext.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'groupingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e3ab5d18-171a-4a0f-b794-ce85b266358b")
    public void setGroupingType(final String value) {
        this.elt.putTagValue(CompositeMetricContext.MdaTypes.GROUPINGTYPE_TAGTYPE_ELT, value);
    }

    @objid ("311edf36-a15a-4c1e-a078-f8c175f81cbb")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("ec6ce471-4813-4cf3-a87a-8588cfff6ed5")
    protected CompositeMetricContext(final Class elt) {
        super(elt);
    }

    @objid ("9ffb0326-f714-4556-995b-da9eb6055bfe")
    public static final class MdaTypes {
        @objid ("98797d4c-6a82-4c85-b8ff-106c6ee46a04")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dc77577f-bb49-4576-bc3b-14b288910b68")
        public static TagType GROUPINGTYPE_TAGTYPE_ELT;

        @objid ("8879b609-ef5d-4aba-be20-27260a67b931")
        private static Stereotype MDAASSOCDEP;

        @objid ("765a0241-86c1-4e62-bb5c-f6c73b119528")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d1b6ea2e-fdc6-4184-82b1-6f7d03598c19")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5967b9ec-f47f-4506-8f58-e308c56214d4");
            GROUPINGTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7147fecd-832f-4c13-ad68-032239f5c0f3");
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
