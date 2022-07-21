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
    @objid ("bb32fa0d-5f91-4b0f-9fa2-2d7cd0a5792c")
    public static final String STEREOTYPE_NAME = "QualityAttribute_Class";

    /**
     * Tells whether a {@link QualityAttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << QualityAttribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c0949f59-e596-4260-bf2b-a0d20bccdd60")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << QualityAttribute_Class >> then instantiate a {@link QualityAttributeClass} proxy.
     * 
     * @return a {@link QualityAttributeClass} proxy on the created {@link Class}.
     */
    @objid ("fa8fe8b1-1981-4d97-946e-29f644d38205")
    public static QualityAttributeClass create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeClass.STEREOTYPE_NAME);
        return QualityAttributeClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link QualityAttributeClass} proxy from a {@link Class} stereotyped << QualityAttribute_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link QualityAttributeClass} proxy or <i>null</i>.
     */
    @objid ("a88f4077-beb6-4ac0-af4c-db3bae0a78c6")
    public static QualityAttributeClass instantiate(final Class obj) {
        return QualityAttributeClass.canInstantiate(obj) ? new QualityAttributeClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link QualityAttributeClass} proxy from a {@link Class} stereotyped << QualityAttribute_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link QualityAttributeClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e03bf57d-3211-4e4a-9402-30a2ad265560")
    public static QualityAttributeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (QualityAttributeClass.canInstantiate(obj))
        	return new QualityAttributeClass(obj);
        else
        	throw new IllegalArgumentException("QualityAttributeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4f4e5848-119e-4f18-8306-445a3989b3e8")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("cfe46197-87b0-421d-9660-5514ffab7d02")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("a58e3558-d722-408d-9808-225e217f5761")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("03e1fc06-75ba-471a-b2be-c371dc32842c")
    protected QualityAttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("b614d475-a5cc-4fb3-8a5c-4681fb5ee31d")
    public static final class MdaTypes {
        @objid ("f3ea20f9-f163-4bd3-ac27-cb5d22aa0379")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6483ff2d-b616-4cfa-afa0-48ecf531d469")
        private static Stereotype MDAASSOCDEP;

        @objid ("9234aacd-deec-4a74-94a8-6d81ab08de90")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b0dbb171-6162-4d6e-af18-6f96a733ddcc")
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
