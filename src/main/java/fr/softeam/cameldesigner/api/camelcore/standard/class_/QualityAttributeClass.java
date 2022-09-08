/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("c17431fb-b122-4f60-9cfa-86a3e1e4bf27")
    public static final String STEREOTYPE_NAME = "QualityAttribute_Class";

    /**
     * Tells whether a {@link QualityAttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << QualityAttribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8683284f-fe92-43b4-9f78-2e039ea964b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << QualityAttribute_Class >> then instantiate a {@link QualityAttributeClass} proxy.
     * 
     * @return a {@link QualityAttributeClass} proxy on the created {@link Class}.
     */
    @objid ("b6b84042-7ad0-4cf6-a40d-d0ce16d53734")
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
    @objid ("492b1a57-134d-4c1f-9e6f-c36c2836df34")
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
    @objid ("85730c59-658e-43a0-85e3-d87a06efc2c0")
    public static QualityAttributeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (QualityAttributeClass.canInstantiate(obj))
            return new QualityAttributeClass(obj);
        else
            throw new IllegalArgumentException("QualityAttributeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b75489d6-45f0-4700-9a41-2ecfe05895b0")
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
    @objid ("b2b34b85-6c20-4880-9ff5-86f6f58dbb80")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("ebc94d11-bed4-4a6e-ab28-82c365d56c1c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d4bd7b3b-489a-463c-9188-1f734432ee53")
    protected QualityAttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("b614d475-a5cc-4fb3-8a5c-4681fb5ee31d")
    public static final class MdaTypes {
        @objid ("c2ef8cbe-5166-4ec9-a1c4-7bef3912dc1d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("82a73f87-0325-4a74-b43a-f2818be9a2b5")
        private static Stereotype MDAASSOCDEP;

        @objid ("1b4d0a4d-2332-4ecc-82bc-6353d2ee02e6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fc3bbbb9-09e6-467e-882b-e61bc75ee64b")
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
