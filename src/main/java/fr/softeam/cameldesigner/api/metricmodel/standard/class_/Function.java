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
    @objid ("2313f504-402c-4970-ab80-970e3b4e7ff9")
    public static final String STEREOTYPE_NAME = "Function";

    @objid ("204efd56-dc29-4773-9754-5a3780358aea")
    public static final String ARGUMENTS_TAGTYPE = "arguments";

    @objid ("fec39a1a-deff-4902-8141-8d60ce98d97a")
    public static final String EXPRESSION_TAGTYPE = "expression";

    /**
     * Tells whether a {@link Function proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Function >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f96c78b1-c8ed-46c9-a6c6-dc53374eec4a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Function.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Function >> then instantiate a {@link Function} proxy.
     * 
     * @return a {@link Function} proxy on the created {@link Class}.
     */
    @objid ("459c91c0-e4d0-43c1-bac0-ba5e84fe9298")
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
    @objid ("c01cff30-e479-4824-999e-d4182d76fc7f")
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
    @objid ("3a0b0e26-31ce-4e6b-9cee-c0116f33afc3")
    public static Function safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Function.canInstantiate(obj))
        	return new Function(obj);
        else
        	throw new IllegalArgumentException("Function: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0d7427d9-464d-4124-9bb9-030712d03333")
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
    @objid ("fa75fcd4-4aa1-4717-abb2-ccccab0c89c9")
    public List<String> getArguments() {
        return this.elt.getTagValues(Function.MdaTypes.ARGUMENTS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("045c69f4-56cf-4f81-864e-b71cac0bdaf9")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'expression'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cf12ce7a-c085-4315-985d-09eac852e583")
    public String getExpression() {
        return this.elt.getTagValue(Function.MdaTypes.EXPRESSION_TAGTYPE_ELT);
    }

    @objid ("bffa81ca-b252-4056-b423-7f39cde7150e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'arguments'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2cffec35-4d25-4a94-b1e7-d52fb3b1fb0c")
    public void setArguments(final List<String> values) {
        this.elt.putTagValues(Function.MdaTypes.ARGUMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'expression'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("79cb86b6-a268-46b6-8816-a9401fa7fa14")
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

    @objid ("d81d099e-68f6-41e1-a143-9737fdb5ad07")
    protected Function(final Class elt) {
        super(elt);
    }

    @objid ("9eab8954-1b48-4a6e-93ae-bfc5ed9fb0dc")
    public static final class MdaTypes {
        @objid ("4de8ade7-9af8-485c-9f40-9fbc481d7a90")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("73deac30-6406-4aee-a270-3c367c2cc482")
        public static TagType EXPRESSION_TAGTYPE_ELT;

        @objid ("43452b8c-b0d3-445c-b239-a791dfe6bd1e")
        public static TagType ARGUMENTS_TAGTYPE_ELT;

        @objid ("37f7cbdc-a05c-459c-9957-a90a3e03e5d7")
        private static Stereotype MDAASSOCDEP;

        @objid ("1d3d20af-621f-43b3-b7ec-346a8748aaa6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7e61ebad-ea0e-452e-a201-ed43e3133deb")
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
