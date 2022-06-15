/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << QualityAttribute_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("00b4d8d6-dff1-41ad-8764-b639c5cef9a2")
public class QualityAttributeClass extends AttributeClass {
    @objid ("33f1ce0a-0bff-4c2f-8c86-283b610222bc")
    public static final String STEREOTYPE_NAME = "QualityAttribute_Class";

    /**
     * Tells whether a {@link QualityAttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << QualityAttribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("129700d7-b155-4b70-a545-c3e49d75e3b8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << QualityAttribute_Class >> then instantiate a {@link QualityAttributeClass} proxy.
     * 
     * @return a {@link QualityAttributeClass} proxy on the created {@link Class}.
     */
    @objid ("1aa4823b-0b57-4c5d-a430-78e88c7b5717")
    public static QualityAttributeClass create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeClass.STEREOTYPE_NAME);
        return QualityAttributeClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link QualityAttributeClass} proxy from a {@link Class} stereotyped << QualityAttribute_Class >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link QualityAttributeClass} proxy or <i>null</i>.
     */
    @objid ("d8ad3f78-f042-4f1f-a148-32c98e000a6e")
    public static QualityAttributeClass instantiate(final Class obj) {
        return QualityAttributeClass.canInstantiate(obj) ? new QualityAttributeClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link QualityAttributeClass} proxy from a {@link Class} stereotyped << QualityAttribute_Class >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link QualityAttributeClass} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("70068ebf-dc0e-4934-badd-21039f5bcbfc")
    public static QualityAttributeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (QualityAttributeClass.canInstantiate(obj))
            return new QualityAttributeClass(obj);
        else
            throw new IllegalArgumentException("QualityAttributeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bba0f998-7a31-441a-8f25-bba963da5d5d")
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
        QualityAttributeClass other = (QualityAttributeClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("72e7f24f-e7e0-432d-8b42-8729a5c50116")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("124df1a3-dab4-4093-9513-9cde6cd47f97")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("de5508f1-5ad5-4e1a-afd6-e5023ab89fe4")
    protected QualityAttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("b614d475-a5cc-4fb3-8a5c-4681fb5ee31d")
    public static final class MdaTypes {
        @objid ("2b5d8af8-082e-4d0d-b6a3-1f4eaa2100cd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dcebb014-2fa8-4797-a4fd-da1dc2071fdc")
        private static Stereotype MDAASSOCDEP;

        @objid ("f51427bd-9879-481c-9c94-0dd6993fc35b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a12290aa-aa0b-425f-bda1-11e185189e5b")
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
