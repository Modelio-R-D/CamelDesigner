/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("ac6928c8-3e0a-4680-800f-a824bb614367")
    public static final String STEREOTYPE_NAME = "QualityAttribute_Attribute";

    /**
     * Tells whether a {@link QualityAttributeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << QualityAttribute_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("28126c72-065c-4e90-b5e0-ffff031e4148")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << QualityAttribute_Attribute >> then instantiate a {@link QualityAttributeAttribute} proxy.
     * 
     * @return a {@link QualityAttributeAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("a20949aa-95da-4c3a-a78f-e752ad473021")
    public static QualityAttributeAttribute create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeAttribute.STEREOTYPE_NAME);
        return QualityAttributeAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link QualityAttributeAttribute} proxy from a {@link Attribute} stereotyped << QualityAttribute_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link QualityAttributeAttribute} proxy or <i>null</i>.
     */
    @objid ("10758b43-2c3f-4618-b7df-af2442cea44f")
    public static QualityAttributeAttribute instantiate(final Attribute obj) {
        return QualityAttributeAttribute.canInstantiate(obj) ? new QualityAttributeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link QualityAttributeAttribute} proxy from a {@link Attribute} stereotyped << QualityAttribute_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link QualityAttributeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cd9b406a-42c1-4810-b0e3-d906335c619f")
    public static QualityAttributeAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (QualityAttributeAttribute.canInstantiate(obj))
        	return new QualityAttributeAttribute(obj);
        else
        	throw new IllegalArgumentException("QualityAttributeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("78afe92d-e2f2-4f1d-b7fc-31ed28c9fbd4")
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
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("799ec3d4-75fe-40fa-ab25-09f768700823")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("cc1780af-3dfb-4982-a5e6-953e4fdd45d1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("79d4c106-66e7-4369-bc27-274cbbed16b0")
    protected QualityAttributeAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("d44e9721-1831-4bbf-98a7-0b98a311c1d2")
    public static final class MdaTypes {
        @objid ("c05549a7-71ff-4f0f-8c3d-d49cf3d23659")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dedfa934-72e5-45a1-8fdb-8fae349968a2")
        private static Stereotype MDAASSOCDEP;

        @objid ("9db7d4d6-e57d-4bab-bc29-5d9858cd8e51")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("08d72336-8d19-4d48-852e-d05059772d9a")
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
