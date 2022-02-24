/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("823b1217-2643-4bed-8d78-205ebd526c7d")
    public static final String STEREOTYPE_NAME = "QualityAttribute";

    /**
     * Tells whether a {@link QualityAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << QualityAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a497799f-7321-4b8b-aad1-05a8f5b19850")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << QualityAttribute >> then instantiate a {@link QualityAttribute} proxy.
     * 
     * @return a {@link QualityAttribute} proxy on the created {@link Class}.
     */
    @objid ("7c439a19-aa5f-4fdf-8205-e9c48d369ae5")
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
    @objid ("7f0d1348-3f88-4a6e-afc2-fb80852bb2a9")
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
    @objid ("e8d6420c-7acb-48c1-88cd-250ab11a3c85")
    public static QualityAttribute safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (QualityAttribute.canInstantiate(obj))
        	return new QualityAttribute(obj);
        else
        	throw new IllegalArgumentException("QualityAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7b638144-4cc5-4c2e-ac03-8cf7e81c48e0")
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
    @objid ("c9f01e65-b0df-4ed5-9002-9428b0b2d33e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("942aa739-e4d9-496a-ad6e-7b58a6b0da80")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("df71590d-174e-4e26-9386-2025f62745b2")
    protected QualityAttribute(final Class elt) {
        super(elt);
    }

    @objid ("b614d475-a5cc-4fb3-8a5c-4681fb5ee31d")
    public static final class MdaTypes {
        @objid ("0dc87be5-7d67-4732-826f-cc1219614121")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f07132c5-a0bb-46c1-ae7e-964ff76e6585")
        private static Stereotype MDAASSOCDEP;

        @objid ("b3cd75e4-e447-40bc-b84a-2e10df5427a6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7a68a127-66db-4b7e-814e-36face8265e6")
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
