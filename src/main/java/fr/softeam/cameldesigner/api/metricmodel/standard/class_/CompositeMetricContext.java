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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
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
    @objid ("4c7b5c0a-3a6a-46ee-a90c-153d6dc35332")
    public static final String STEREOTYPE_NAME = "CompositeMetricContext";

    @objid ("32f0ef03-99dc-4369-9cd1-50747d47e51e")
    public static final String GROUPINGTYPE_TAGTYPE = "groupingType";

    /**
     * Tells whether a {@link CompositeMetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeMetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("544dfa68-5884-43d7-a0a0-85118a6fd699")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetricContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeMetricContext >> then instantiate a {@link CompositeMetricContext} proxy.
     * 
     * @return a {@link CompositeMetricContext} proxy on the created {@link Class}.
     */
    @objid ("bfac623a-5b8c-4a57-84be-59e1d531612d")
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
    @objid ("57b201ed-d2a2-4c91-97fb-935c3dda3253")
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
    @objid ("411ec0fa-348b-4737-a40c-4fe2eddbfd1c")
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
    @objid ("cc100fdb-2471-4e61-a1c8-7be5f88e4e44")
    public void addComposingMetricContexts(final MetricContext obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeMetricContext.MdaTypes.MDAASSOCDEP);
            d.setName("composingMetricContexts");
            d.putTagValue(CompositeMetricContext.MdaTypes.MDAASSOCDEP_ROLE, "composingMetricContexts");
        }
    }

    @objid ("d40e7af1-daad-484c-bf1d-4c80bf3ac27c")
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
    @objid ("7e66a911-996f-495b-b89a-e3976b6dde34")
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
    @objid ("fd3dab2b-fb19-4159-a81c-458d3f988734")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'groupingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bdf5c8c0-815b-4b00-a3bc-0fa8de5edbd3")
    public String getGroupingType() {
        return this.elt.getTagValue(CompositeMetricContext.MdaTypes.GROUPINGTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'window' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bb700082-8a16-459c-9371-1de2be5f2ca5")
    public Window getWindow() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CompositeMetricContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CompositeMetricContext.MdaTypes.MDAASSOCDEP_ROLE), "window")){
                  if (Window.canInstantiate(d.getDependsOn()))
                     return (Window)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Window.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("7d0a07d7-3ed0-4c5e-8adc-14a514ecaae4")
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
    @objid ("d966e1dd-a435-408c-8ea5-5cebf60ab1bd")
    public boolean removeComposingMetricContexts(final MetricContext obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CompositeMetricContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CompositeMetricContext.MdaTypes.MDAASSOCDEP_ROLE), "composingMetricContexts")) 
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
    @objid ("ce6a90f0-b3fb-4de8-bfdf-75ace48f0e63")
    public void setGroupingType(final String value) {
        this.elt.putTagValue(CompositeMetricContext.MdaTypes.GROUPINGTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'window' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("482a1020-6928-4b90-b1fc-107b6c7ae84d")
    public void setWindow(final Window obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CompositeMetricContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CompositeMetricContext.MdaTypes.MDAASSOCDEP_ROLE), "window")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CompositeMetricContext.MdaTypes.MDAASSOCDEP);
              dep.setName("window");      dep.putTagValue(CompositeMetricContext.MdaTypes.MDAASSOCDEP_ROLE, "window");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("311edf36-a15a-4c1e-a078-f8c175f81cbb")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c5ca4741-45b6-4591-9a06-a01e444043e9")
    protected CompositeMetricContext(final Class elt) {
        super(elt);
    }

    @objid ("9ffb0326-f714-4556-995b-da9eb6055bfe")
    public static final class MdaTypes {
        @objid ("0532136a-d73b-45c2-bb1a-dc01d8906466")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5e3696ea-30d2-41c0-ae24-6c5f17955fc8")
        public static TagType GROUPINGTYPE_TAGTYPE_ELT;

        @objid ("bba1ff31-122f-484e-9b66-24dc72c2f596")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a78a21a-389d-4675-b6a2-3bfa381ed749")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2713d3e9-6c6d-4a5b-93d6-facfbc8fcee1")
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
