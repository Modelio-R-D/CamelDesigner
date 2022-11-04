/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("a31c519a-9f04-44b7-86bc-2172a5421e1e")
    public static final String STEREOTYPE_NAME = "Function";

    @objid ("9f13ae0c-f7f7-4c12-96ee-4b6f57ddd03e")
    public static final String ARGUMENTS_TAGTYPE = "arguments";

    @objid ("8032aaf4-fded-4d92-a9be-1591499323c9")
    public static final String EXPRESSION_TAGTYPE = "expression";

    /**
     * Tells whether a {@link Function proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Function >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f51fb613-1141-4130-b67b-fd98bfed57c7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Function.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Function >> then instantiate a {@link Function} proxy.
     * 
     * @return a {@link Function} proxy on the created {@link Class}.
     */
    @objid ("d533ff4c-5dd3-4af4-9ecb-81ea5453674f")
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
    @objid ("6c742b30-2fd7-41b4-b148-7812e61a4111")
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
    @objid ("183c6897-e2d3-4200-bc76-45de0802bbc2")
    public static Function safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Function.canInstantiate(obj))
        	return new Function(obj);
        else
        	throw new IllegalArgumentException("Function: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6140c7a2-9c4d-4cd7-9c3c-e1cbd42ffb4a")
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
    @objid ("890f5a33-4845-440d-9074-6c912515e168")
    public List<String> getArguments() {
        return this.elt.getTagValues(Function.MdaTypes.ARGUMENTS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e931636a-7b52-47c5-8b3c-6e1cb14c3615")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'expression'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fadf6975-94ec-4c69-b945-766b4485e48e")
    public String getExpression() {
        return this.elt.getTagValue(Function.MdaTypes.EXPRESSION_TAGTYPE_ELT);
    }

    @objid ("0b236c42-c90e-4542-8d43-1482cb34daa2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'arguments'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b794d1c0-5b3d-4684-91a1-b2780477eb97")
    public void setArguments(final List<String> values) {
        this.elt.putTagValues(Function.MdaTypes.ARGUMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'expression'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("af0c5e95-a522-44d1-ace2-2c887469c7ff")
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

    @objid ("33cc5c84-c0ba-4d90-aa42-78b483b094d3")
    protected Function(final Class elt) {
        super(elt);
    }

    @objid ("9eab8954-1b48-4a6e-93ae-bfc5ed9fb0dc")
    public static final class MdaTypes {
        @objid ("96181562-3db0-43ca-bda1-2964217388eb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c7b0f619-fbe7-4073-9c4f-9acab15d8ebc")
        public static TagType EXPRESSION_TAGTYPE_ELT;

        @objid ("30791870-1dac-46b2-9170-1b6ea061a899")
        public static TagType ARGUMENTS_TAGTYPE_ELT;

        @objid ("44294d2a-7c1f-4adb-9d6e-bc8ecfa17bce")
        private static Stereotype MDAASSOCDEP;

        @objid ("3c16ece8-345e-405e-8299-26851377e507")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44b823f4-aca7-415a-ba82-73d4450e5f8e")
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
