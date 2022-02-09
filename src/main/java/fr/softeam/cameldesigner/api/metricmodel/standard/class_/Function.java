/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
    @objid ("50f33b16-259f-4755-9775-2a85796c8a0b")
    public static final String STEREOTYPE_NAME = "Function";

    @objid ("e0a79687-bcf7-45a5-b290-9fc7374bd5ea")
    public static final String ARGUMENTS_TAGTYPE = "arguments";

    @objid ("c6243073-de26-4ebf-b9e6-2198a6750070")
    public static final String EXPRESSION_TAGTYPE = "expression";

    /**
     * Tells whether a {@link Function proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Function >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("644efe4d-2d6c-4f25-888a-099c1e671d76")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Function.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Function >> then instantiate a {@link Function} proxy.
     * 
     * @return a {@link Function} proxy on the created {@link Class}.
     */
    @objid ("92af6036-c20d-448e-9351-2140f0064cc2")
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
    @objid ("9eb0eaac-beb8-4d5f-b4c4-6fed2537daef")
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
    @objid ("cd3fa8c6-8bea-45e5-ab05-5ad87068b389")
    public static Function safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Function.canInstantiate(obj))
        	return new Function(obj);
        else
        	throw new IllegalArgumentException("Function: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f42b2967-352f-446c-8baa-895b6c1c87d7")
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
     * Getter for string property 'arguments'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("795fa5d3-bd06-4600-b72e-df60c0faed3b")
    public String getArguments() {
        return this.elt.getTagValue(Function.MdaTypes.ARGUMENTS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b224d325-24d5-441b-b71c-79d664bff816")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'expression'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dd00b631-db34-434a-b132-d27e1608e912")
    public String getExpression() {
        return this.elt.getTagValue(Function.MdaTypes.EXPRESSION_TAGTYPE_ELT);
    }

    @objid ("899f1e54-d334-470b-989a-363143e0bd00")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'arguments'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f808c7e1-de1c-4595-9acf-b6def6bff349")
    public void setArguments(final String value) {
        this.elt.putTagValue(Function.MdaTypes.ARGUMENTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'expression'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b0ad2d95-f8c2-4abd-a65d-c4a2e736d2c4")
    public void setExpression(final String value) {
        this.elt.putTagValue(Function.MdaTypes.EXPRESSION_TAGTYPE_ELT, value);
    }

    @objid ("c4550020-8c9d-4979-b5af-1bb83145a7ee")
    protected Function(final Class elt) {
        super(elt);
    }

    @objid ("9eab8954-1b48-4a6e-93ae-bfc5ed9fb0dc")
    public static final class MdaTypes {
        @objid ("d8b7354c-8530-46d2-9638-14fcc8df0856")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1397bb59-be99-4378-bfb0-6afd4b62bdb5")
        public static TagType EXPRESSION_TAGTYPE_ELT;

        @objid ("8310615c-7661-43d0-9cdf-331c41bf1bdf")
        public static TagType ARGUMENTS_TAGTYPE_ELT;

        @objid ("873d1196-7e56-4210-a947-c1c69fa3e07f")
        private static Stereotype MDAASSOCDEP;

        @objid ("b9e5cbad-6e1a-4432-b98d-70974e43180b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7fa52252-fa89-46c2-bf60-2d13dac00f3c")
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
