/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << QualityAttribute_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9c9b9a9a-5e8a-461c-87f8-f089d0e376e2")
public class QualityAttributeAttribute extends AttributeAttribute {
    @objid ("9ec2d1c7-781f-4b63-9eab-52c73c9ae08e")
    public static final String STEREOTYPE_NAME = "QualityAttribute_Attribute";

    /**
     * Tells whether a {@link QualityAttributeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << QualityAttribute_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a96579fd-ac3e-481f-a28c-35b657d608b5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << QualityAttribute_Attribute >> then instantiate a {@link QualityAttributeAttribute} proxy.
     * 
     * @return a {@link QualityAttributeAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("7fb9c1d2-41a8-4187-983e-a8b686533729")
    public static QualityAttributeAttribute create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeAttribute.STEREOTYPE_NAME);
        return QualityAttributeAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link QualityAttributeAttribute} proxy from a {@link Attribute} stereotyped << QualityAttribute_Attribute >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Attribute
     * @return a {@link QualityAttributeAttribute} proxy or <i>null</i>.
     */
    @objid ("76e8e12b-ea59-4143-b797-35621aac3c0b")
    public static QualityAttributeAttribute instantiate(final Attribute obj) {
        return QualityAttributeAttribute.canInstantiate(obj) ? new QualityAttributeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link QualityAttributeAttribute} proxy from a {@link Attribute} stereotyped << QualityAttribute_Attribute >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Attribute}
     * @return a {@link QualityAttributeAttribute} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("81072360-d911-4734-bd3b-5e9dcb1e45f2")
    public static QualityAttributeAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (QualityAttributeAttribute.canInstantiate(obj))
            return new QualityAttributeAttribute(obj);
        else
            throw new IllegalArgumentException("QualityAttributeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0fe31d12-2d12-40e9-b0c5-e75b52ce0922")
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
        QualityAttributeAttribute other = (QualityAttributeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}.
     * 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("7b5cf5bb-17b4-4d7a-a007-ff142121e9d2")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("f1897861-1af2-4ac9-9dc4-597c5b0e52a4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a0641233-3cd6-4b8a-ae87-292916a343a3")
    protected QualityAttributeAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("d44e9721-1831-4bbf-98a7-0b98a311c1d2")
    public static final class MdaTypes {
        @objid ("7cec0897-b1e0-4469-bb3c-b9c0546ecb1d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("beecea7e-e072-4716-aed8-ecaa1e29cdde")
        private static Stereotype MDAASSOCDEP;

        @objid ("b128ec95-4e23-4fff-bf27-1b84f04d716c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b22c4300-d206-4786-91ff-9326880ebd03")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "affcb570-9c14-4702-aacd-86bdbea720ff");
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
