/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link Class} with << QualityAttribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("00b4d8d6-dff1-41ad-8764-b639c5cef9a2")
public class QualityAttribute extends AttributeClass {
    @objid ("83008da3-6f3c-4244-b8b1-7c48d87fd7c0")
    public static final String STEREOTYPE_NAME = "QualityAttribute";

    /**
     * Tells whether a {@link QualityAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << QualityAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("08e58b24-3c37-4c21-ae5c-86fde9fa0f15")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << QualityAttribute >> then instantiate a {@link QualityAttribute} proxy.
     * 
     * @return a {@link QualityAttribute} proxy on the created {@link Class}.
     */
    @objid ("8288c68d-a02c-4b3f-9a92-d229ffeb410e")
    public static QualityAttribute create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, QualityAttribute.STEREOTYPE_NAME);
        return QualityAttribute.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link QualityAttribute} proxy from a {@link Class} stereotyped << QualityAttribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link QualityAttribute} proxy or <i>null</i>.
     */
    @objid ("f690e0cf-41bf-4bdf-ab8e-e9dd4bcd84de")
    public static QualityAttribute instantiate(final Class obj) {
        return QualityAttribute.canInstantiate(obj) ? new QualityAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link QualityAttribute} proxy from a {@link Class} stereotyped << QualityAttribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link QualityAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0fb31b11-6b42-47b2-b2ef-e7f5301bc4dc")
    public static QualityAttribute safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (QualityAttribute.canInstantiate(obj))
        	return new QualityAttribute(obj);
        else
        	throw new IllegalArgumentException("QualityAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("73ab71f7-e7fc-46c0-bd98-be5969e08641")
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
        QualityAttribute other = (QualityAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("745ae18e-e3eb-4daa-8ffd-f77ce35aeb97")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("030597b2-9d01-4e70-bbaa-b85239d1a47b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1d7e23c6-3052-4c67-86ba-5cc997f03652")
    protected QualityAttribute(final Class elt) {
        super(elt);
    }

    @objid ("b614d475-a5cc-4fb3-8a5c-4681fb5ee31d")
    public static final class MdaTypes {
        @objid ("82d323b5-93ef-42cb-9097-389e7633e8e0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c75073a0-ad8b-4cb2-859f-f65da9bbb577")
        private static Stereotype MDAASSOCDEP;

        @objid ("65a68fb6-e47b-4d06-8250-048cfb98526e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ac52bf5f-f742-41fc-b886-37768b81355d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ef0c1237-df8a-4bfc-8f0b-d3ad72e39bf4");
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
