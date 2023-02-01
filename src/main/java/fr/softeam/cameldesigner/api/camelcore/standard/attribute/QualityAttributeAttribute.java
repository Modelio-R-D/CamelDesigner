/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3c65b76e-aa35-4218-93a5-66b83dc485b8")
=======
    @objid ("d12507e8-66f6-4290-a6f5-6f1d4b5f9a69")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "QualityAttribute_Attribute";

    /**
     * Tells whether a {@link QualityAttributeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << QualityAttribute_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("a30b2428-1367-468b-83c5-1325b39f42ee")
=======
    @objid ("07cb4b8d-5322-4818-9a09-28b8a6fed1b3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << QualityAttribute_Attribute >> then instantiate a {@link QualityAttributeAttribute} proxy.
     * 
     * @return a {@link QualityAttributeAttribute} proxy on the created {@link Attribute}.
     */
<<<<<<< HEAD
    @objid ("340c1977-90e9-41f1-8927-cff32af51838")
=======
    @objid ("be577759-5ddd-4a98-81e5-d6bda6f039fc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d3454f69-28fd-4140-b06d-95cdcc92d664")
=======
    @objid ("7cafdcbc-4743-4389-99ac-a528553876e3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a93e0e8f-f584-43e9-8488-0c49d15f8f79")
=======
    @objid ("c9cb4c7c-7d40-403c-8d65-e968737e817e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static QualityAttributeAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (QualityAttributeAttribute.canInstantiate(obj))
        	return new QualityAttributeAttribute(obj);
        else
        	throw new IllegalArgumentException("QualityAttributeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("8e288b2a-0a5a-4dda-b9c9-07de34fea600")
=======
    @objid ("de210ec1-0c93-4c03-838d-2e8a62bfd77f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2ae45b40-5725-46a6-b8aa-9e3874e01203")
=======
    @objid ("24d8bd0a-7cc7-4312-bd23-e9cc1fc5d7b7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

<<<<<<< HEAD
    @objid ("4e7a0ba0-3d57-45ae-8ab9-9089751a0fb0")
=======
    @objid ("1e8f15dd-283d-4254-9aab-c5f3989cd3eb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

<<<<<<< HEAD
    @objid ("8949d882-367c-4b50-a18e-cc145a50f680")
=======
    @objid ("a794d5d9-604b-484e-bea6-8014d7b59e78")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected QualityAttributeAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("d44e9721-1831-4bbf-98a7-0b98a311c1d2")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("0018481c-9c0e-49fc-a6d5-8776ef33c9f1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("60675d97-8da6-4193-9d5c-48547ba027b7")
        private static Stereotype MDAASSOCDEP;

        @objid ("603e22a4-752d-4be2-88e5-f639b91b6c29")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("672566f8-ed9b-4929-bc37-a6787566533b")
=======
        @objid ("1f0385c6-7c6a-48f5-8c28-263a8b58f36a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b96bfb87-b9f6-48f1-9f5c-7d6759e3041d")
        private static Stereotype MDAASSOCDEP;

        @objid ("2753a8e6-3796-4965-8fe6-f9d8cad7346d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("039f23fe-b7a3-450b-a5e3-cb1d9d050156")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
