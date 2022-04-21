/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("7ec69d18-236a-4d89-8715-6d792a3eb576")
    public static final String STEREOTYPE_NAME = "QualityAttribute_Class";

    /**
     * Tells whether a {@link QualityAttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << QualityAttribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("53f97db8-88b0-43ae-99c0-3aa4e03d5b4b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << QualityAttribute_Class >> then instantiate a {@link QualityAttributeClass} proxy.
     * 
     * @return a {@link QualityAttributeClass} proxy on the created {@link Class}.
     */
    @objid ("b286daa2-0ede-48fc-a4f9-602fd3701498")
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
    @objid ("10f99a86-070c-47da-a878-93389a4eefab")
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
    @objid ("58ce570b-9689-4d51-94c8-403299c21f28")
    public static QualityAttributeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (QualityAttributeClass.canInstantiate(obj))
            return new QualityAttributeClass(obj);
        else
            throw new IllegalArgumentException("QualityAttributeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("91dae874-e985-44b8-a26b-0d6d9c2b9098")
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
    @objid ("e9d522e1-88c9-42d9-ab11-3af9c9092b4c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("13f3eb34-6df6-42da-9b90-5438e34a12d7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d5d144b7-dd6f-483f-b130-65b2fdffc185")
    protected QualityAttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("b614d475-a5cc-4fb3-8a5c-4681fb5ee31d")
    public static final class MdaTypes {
        @objid ("e2bc483c-c4e7-43ef-9158-97f797e91a25")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0f860da5-da47-41ce-9c17-7551b3e61f32")
        private static Stereotype MDAASSOCDEP;

        @objid ("a6fb2556-268a-40ee-b5ed-45db436bbceb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e1bd8fe5-770e-490d-98df-2173b9a8e0fd")
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
