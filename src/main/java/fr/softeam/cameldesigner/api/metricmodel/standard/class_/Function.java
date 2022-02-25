/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
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
 * Proxy class to handle a {@link Class} with << Function >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("01bf9d90-3138-4d31-84e2-99a064932b6c")
public class Function extends FeatureClass {
    @objid ("186ce609-c674-407f-9b89-e871be4c3143")
    public static final String STEREOTYPE_NAME = "Function";

    @objid ("68b5adee-2431-48a3-9b07-7444a270bf08")
    public static final String ARGUMENTS_TAGTYPE = "arguments";

    @objid ("cd148d0d-3d8f-4aa0-aa60-81112a28f39a")
    public static final String EXPRESSION_TAGTYPE = "expression";

    /**
     * Tells whether a {@link Function proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Function >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a069e635-9086-4ee8-af06-4014e4272d61")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Function.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Function >> then instantiate a {@link Function} proxy.
     * 
     * @return a {@link Function} proxy on the created {@link Class}.
     */
    @objid ("3f371a9e-c70d-4880-8391-d79d79e7a3a9")
    public static Function create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Function.STEREOTYPE_NAME);
        return Function.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Function} proxy from a {@link Class} stereotyped << Function >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Function} proxy or <i>null</i>.
     */
    @objid ("c7a2f4a2-fa88-435b-b486-5c80f3d879ac")
    public static Function instantiate(final Class obj) {
        return Function.canInstantiate(obj) ? new Function(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Function} proxy from a {@link Class} stereotyped << Function >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Function} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("011d3c76-9504-4627-b640-eb3f0e6b64b5")
    public static Function safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Function.canInstantiate(obj))
        	return new Function(obj);
        else
        	throw new IllegalArgumentException("Function: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9a407bef-2ca6-414a-abaf-97b28ecb4075")
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
        Function other = (Function) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'arguments'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
    @objid ("d28bbba3-721e-4530-b68d-1bd4e6415a13")
    public List<String> getArguments() {
        return this.elt.getTagValues(Function.MdaTypes.ARGUMENTS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("6efa5f37-1745-49fd-ab7d-5d3d41db03bc")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'expression'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("517d2d8a-82bb-48af-a064-538ef5affd5c")
    public String getExpression() {
        return this.elt.getTagValue(Function.MdaTypes.EXPRESSION_TAGTYPE_ELT);
    }

    @objid ("4ec71e1c-e140-4b4a-af6a-bdd53397259d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'arguments'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4bd8e6e1-c005-42d3-9cb9-b7844d8ed4e8")
    public void setArguments(final List<String> values) {
        this.elt.putTagValues(Function.MdaTypes.ARGUMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'expression'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("995a1702-c7e2-4aba-a1fd-fc610102c148")
    public void setExpression(final String value) {
        this.elt.putTagValue(Function.MdaTypes.EXPRESSION_TAGTYPE_ELT, value);
    }

    @objid ("137cfcd0-1699-4c27-a07b-d46257f5245a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("3a60b5b1-b554-4b72-aedf-d7b20a021d4a")
    protected Function(final Class elt) {
        super(elt);
    }

    @objid ("9eab8954-1b48-4a6e-93ae-bfc5ed9fb0dc")
    public static final class MdaTypes {
        @objid ("a8874245-79e8-45a2-a771-7df3cd6e840a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("affa07f5-cb20-40bd-bd40-20a94bf6280f")
        public static TagType EXPRESSION_TAGTYPE_ELT;

        @objid ("760f2fb7-995b-4ea4-8814-2535bd97a93b")
        public static TagType ARGUMENTS_TAGTYPE_ELT;

        @objid ("a8353804-d932-467e-9f64-c08db31e6c3f")
        private static Stereotype MDAASSOCDEP;

        @objid ("414f9e5e-4d80-45d6-b2cc-10cb86e9540e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fc6ff1ec-1d03-489d-9a06-4c9ced7e3010")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2ce13037-e3af-417d-9c03-54d155a1d933");
            EXPRESSION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8e19ff42-15d1-4aa8-b24d-934d6c6f8774");
            ARGUMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e6a87341-c973-4532-970a-be2e90fe9dda");
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
