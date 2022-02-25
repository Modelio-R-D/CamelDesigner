/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("cdab2c27-8c96-40bc-9e09-08d03c80000e")
    public static final String STEREOTYPE_NAME = "QualityAttribute";

    /**
     * Tells whether a {@link QualityAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << QualityAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0e69dac6-1a97-456e-ab39-f10cffadb4c5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << QualityAttribute >> then instantiate a {@link QualityAttribute} proxy.
     * 
     * @return a {@link QualityAttribute} proxy on the created {@link Class}.
     */
    @objid ("b33acfa9-9b1f-4fe2-8f82-edf539570c6f")
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
    @objid ("e1a52402-c77a-4a02-818e-1148d96208bb")
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
    @objid ("19c7f5b4-dcbf-48d9-ac0a-af06873aad26")
    public static QualityAttribute safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (QualityAttribute.canInstantiate(obj))
        	return new QualityAttribute(obj);
        else
        	throw new IllegalArgumentException("QualityAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d3dc4f1d-9195-4737-879f-ae428fa89893")
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
    @objid ("611bbcf5-3c1d-4314-ae38-7d9f9901323e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("ddc19dfd-5c93-4ce7-888d-f98deeb4cbca")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ac84719e-bb84-447c-9304-0d973082cfcd")
    protected QualityAttribute(final Class elt) {
        super(elt);
    }

    @objid ("b614d475-a5cc-4fb3-8a5c-4681fb5ee31d")
    public static final class MdaTypes {
        @objid ("1f22f008-cccf-4bb2-962b-0414d93e8b55")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("40831f5b-258e-46c6-947f-0a67e7ecf8f5")
        private static Stereotype MDAASSOCDEP;

        @objid ("51255f80-4491-4086-925c-3f73f2be0ec0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8d938d7e-d7a2-49d2-a3ff-bac0259d5447")
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
