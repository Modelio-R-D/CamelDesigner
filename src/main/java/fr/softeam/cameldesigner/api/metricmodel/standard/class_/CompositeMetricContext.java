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
<<<<<<< HEAD
    @objid ("740f5c2c-0061-4785-8e97-b56d7cdb503c")
    public static final String STEREOTYPE_NAME = "CompositeMetricContext";

    @objid ("e1689af6-5d5b-4180-be42-aaf49afb5ef0")
=======
    @objid ("083f6844-a176-4a77-91e2-2b0a343b6c0e")
    public static final String STEREOTYPE_NAME = "CompositeMetricContext";

    @objid ("ee99b137-4da8-48bb-83f4-a37cc39d357d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String GROUPINGTYPE_TAGTYPE = "groupingType";

    /**
     * Tells whether a {@link CompositeMetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeMetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("214b7801-601c-4685-9fef-5dc5f81af66b")
=======
    @objid ("485268ad-836d-489f-9da7-08c5e1d3b74b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetricContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeMetricContext >> then instantiate a {@link CompositeMetricContext} proxy.
     * 
     * @return a {@link CompositeMetricContext} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("da16fea6-bbc0-4010-afbf-6a89293f376e")
=======
    @objid ("a3004259-4b48-4a03-b08f-989836ac951f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("96addabf-d014-4fe3-8231-40c5831b02ac")
=======
    @objid ("3b352d36-cf77-497c-a715-adcb9360e2b4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1e50561f-aa64-46e7-a97a-2646576b9c3f")
=======
    @objid ("fcd85103-42cc-446f-bfe2-5d99d3e94820")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ed6fa2b9-a3a2-424a-9fd3-fc710ad67e14")
=======
    @objid ("2f1776f5-1ab4-4325-8aa7-d5505b84dfa4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addComposingMetricContexts(final MetricContext obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeMetricContext.MdaTypes.MDAASSOCDEP);
            d.setName("composingMetricContexts");
            d.putTagValue(CompositeMetricContext.MdaTypes.MDAASSOCDEP_ROLE, "composingMetricContexts");
        }
    }

<<<<<<< HEAD
    @objid ("1fa9dc15-d3ac-4236-b2c7-0de07b095b3a")
=======
    @objid ("2bd9f755-0110-4f3e-b24d-3b1b15b9e825")
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
        CompositeMetricContext other = (CompositeMetricContext) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'composingMetricContexts' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("0ae28fac-1955-4c28-b7e9-e3c1af7ccc7b")
=======
    @objid ("fcb986f6-7b19-41fa-b29b-7fd2106a976a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1c008f3d-6317-44aa-9099-e563b5798394")
=======
    @objid ("aaba40d3-98a5-47fb-9a09-d1d09062ea14")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'groupingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("42d57bed-c32d-40fd-9629-7ed7720deb0d")
=======
    @objid ("eb316334-c0f2-4317-aebd-89435d5ddc48")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getGroupingType() {
        return this.elt.getTagValue(CompositeMetricContext.MdaTypes.GROUPINGTYPE_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    /**
     * Get the value of the 'window' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5d97cf3c-01f2-4166-a2b9-58d6b8632102")
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

    @objid ("9e8a24f3-a2bf-4bb0-a209-6057d0ce8f93")
=======
    @objid ("3478be26-2583-46c1-b5ce-6f8390fcaad2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6d1155cb-abd4-4c28-9f54-631b01b2a883")
=======
    @objid ("e3b4efdc-894e-405a-8153-a22d9c6fdc3c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("583c7cd4-8419-4bd0-80ad-8d3f8491a91e")
=======
    @objid ("9d495bee-78b5-45f7-9e5d-5b4496cb4170")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setGroupingType(final String value) {
        this.elt.putTagValue(CompositeMetricContext.MdaTypes.GROUPINGTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'window' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4fb6f112-8fef-4319-b703-b39c24bb5145")
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

<<<<<<< HEAD
    @objid ("8a01747c-390d-4fb2-8207-8ce381e240a3")
=======
    @objid ("b25dd7e9-14fc-43d7-a319-8d33459ba878")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CompositeMetricContext(final Class elt) {
        super(elt);
    }

    @objid ("9ffb0326-f714-4556-995b-da9eb6055bfe")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("df8d01bd-9785-460a-be7f-1c912016920d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4dbc4094-1c80-46f4-8255-5cffa6460f03")
        public static TagType GROUPINGTYPE_TAGTYPE_ELT;

        @objid ("31f0d334-b015-466e-be2f-cf432ec4b04b")
        private static Stereotype MDAASSOCDEP;

        @objid ("6bcc2a10-04ce-4d87-8de1-0471e254197a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3725a63a-e855-497e-abc2-17c03eefc306")
=======
        @objid ("81e734e3-f8bd-425a-8b22-81bd89b0baa9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2ff0f067-e60a-4c15-b09c-87e104450bf6")
        public static TagType GROUPINGTYPE_TAGTYPE_ELT;

        @objid ("2ddb5a03-3bb9-4305-97e4-eb62c74569eb")
        private static Stereotype MDAASSOCDEP;

        @objid ("a2a0abe9-b234-4077-ac66-e221d7a31c1f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0595694f-b15f-485c-8d47-aab02db32468")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
