/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("1aa4b3b1-4c3d-4635-9fe7-554eb22ecd57")
    public static final String STEREOTYPE_NAME = "QualityAttribute";

    /**
     * Tells whether a {@link QualityAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << QualityAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("34098fb8-76f3-4859-9f29-f68e927ef31a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << QualityAttribute >> then instantiate a {@link QualityAttribute} proxy.
     * 
     * @return a {@link QualityAttribute} proxy on the created {@link Class}.
     */
    @objid ("b171acdf-3f76-43be-9288-6a3ec5e07181")
    public static QualityAttribute create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, QualityAttribute.STEREOTYPE_NAME);
        return QualityAttribute.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link QualityAttribute} proxy from a {@link Class} stereotyped << QualityAttribute >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link QualityAttribute} proxy or <i>null</i>.
     */
    @objid ("8c73a5f7-0752-49ca-b238-4c6c40800218")
    public static QualityAttribute instantiate(final Class obj) {
        return QualityAttribute.canInstantiate(obj) ? new QualityAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link QualityAttribute} proxy from a {@link Class} stereotyped << QualityAttribute >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link QualityAttribute} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7c48a8d2-1ced-43ff-8a08-9d3db219c8e6")
    public static QualityAttribute safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (QualityAttribute.canInstantiate(obj))
            return new QualityAttribute(obj);
        else
            throw new IllegalArgumentException("QualityAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d1eb1989-26ed-4660-822f-4f6ee366d0f6")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("fd7539cd-34fc-4c78-a4a5-84f4b45f12e1")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("546e0eb5-6b9e-4c52-8288-be5572f002b7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("edacdaf9-362c-44a4-8108-49da34e4b47a")
    protected QualityAttribute(final Class elt) {
        super(elt);
    }

    @objid ("b614d475-a5cc-4fb3-8a5c-4681fb5ee31d")
    public static final class MdaTypes {
        @objid ("0fed892b-d9b8-4be7-ab00-1164d8875d12")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bf9e3a4d-bb0c-4550-9c8a-58189064448d")
        private static Stereotype MDAASSOCDEP;

        @objid ("7193a71c-2197-49eb-8c04-1530451be701")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ea8544ee-2e60-4e56-81c9-7027b3dc62aa")
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
