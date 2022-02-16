/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("058f32a8-4c80-4270-8272-d721a4b9a168")
    public static final String STEREOTYPE_NAME = "CompositeMetricContext";

    @objid ("a8e7d7d3-34bb-4526-b7da-47f51831dc45")
    public static final String GROUPINGTYPE_TAGTYPE = "groupingType";

    /**
     * Tells whether a {@link CompositeMetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeMetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5818ccc6-0863-4e57-85b8-b959f4469efb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetricContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeMetricContext >> then instantiate a {@link CompositeMetricContext} proxy.
     * 
     * @return a {@link CompositeMetricContext} proxy on the created {@link Class}.
     */
    @objid ("09cbb2b1-32fb-4fb9-895f-430b81f84fad")
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
    @objid ("33c40870-c7de-4828-9718-7b203a71b047")
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
    @objid ("d45ca2cc-7952-48f6-9d67-077031a91b7e")
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
    @objid ("f44279fd-4362-431a-865d-c9310b81355c")
    public void addComposingMetricContexts(final MetricContext obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeMetricContext.MdaTypes.MDAASSOCDEP);
            d.setName("composingMetricContexts");
            d.putTagValue(CompositeMetricContext.MdaTypes.MDAASSOCDEP_ROLE, "composingMetricContexts");
        }
    }

    @objid ("c779d1f8-0b64-499a-8bd2-37a6baaa2396")
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
    @objid ("bf550cfa-8841-4ceb-a25f-c49cf388304c")
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
    @objid ("55f05112-508b-49e8-b2aa-186423d123b3")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'groupingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c5eefd8c-2e62-421b-9967-927a9069be8d")
    public String getGroupingType() {
        return this.elt.getTagValue(CompositeMetricContext.MdaTypes.GROUPINGTYPE_TAGTYPE_ELT);
    }

    @objid ("46d2b7cc-3c3e-435d-bb87-9a647e0cbe51")
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
    @objid ("0d4dd922-fe81-4c3b-b3f9-ee55fe81b0cf")
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
    @objid ("547d7989-cfad-4b67-9637-2934402ba625")
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

    @objid ("f6b3a644-1c89-4ef4-b6e0-001c800d7bfb")
    protected CompositeMetricContext(final Class elt) {
        super(elt);
    }

    @objid ("9ffb0326-f714-4556-995b-da9eb6055bfe")
    public static final class MdaTypes {
        @objid ("35b20a89-1028-4811-8bcb-c473b113ebf9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("89ed2804-35c6-4ef9-a1af-df8cade7e434")
        public static TagType GROUPINGTYPE_TAGTYPE_ELT;

        @objid ("278df07c-9281-448c-a8a4-256894b48852")
        private static Stereotype MDAASSOCDEP;

        @objid ("026c4837-2c57-4348-90cd-d308858846f0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f4473bef-c71f-4032-8cec-1d7b890d9b45")
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
