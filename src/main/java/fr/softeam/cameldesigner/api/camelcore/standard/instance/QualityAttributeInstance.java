/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.camelcore.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << QualityAttribute_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4c3db515-c07b-4f06-b20c-b9df6b6b9468")
public class QualityAttributeInstance extends AttributeInstance {
<<<<<<< HEAD
    @objid ("e424659d-af35-443f-9a3f-a75461ddae33")
=======
    @objid ("d297ec60-26bf-4b74-ab6e-ddc80aa04c6c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "QualityAttribute_Instance";

    /**
     * Tells whether a {@link QualityAttributeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << QualityAttribute_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d26f3567-9d63-4b16-a885-5c27ffa33cfa")
=======
    @objid ("37ae14f2-b932-4afb-bdf8-32b6652a720f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << QualityAttribute_Instance >> then instantiate a {@link QualityAttributeInstance} proxy.
     * 
     * @return a {@link QualityAttributeInstance} proxy on the created {@link Instance}.
     */
<<<<<<< HEAD
    @objid ("b8adfa77-69e1-461e-8b00-8abebd5632f9")
=======
    @objid ("e3c26922-7061-4cc6-9583-52e6a54052a5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static QualityAttributeInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeInstance.STEREOTYPE_NAME);
        return QualityAttributeInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link QualityAttributeInstance} proxy from a {@link Instance} stereotyped << QualityAttribute_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link QualityAttributeInstance} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("8a2d75d0-99c0-487e-8f44-e48ea572e53a")
=======
    @objid ("0e334f11-22a3-49df-a878-be592314caff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static QualityAttributeInstance instantiate(final Instance obj) {
        return QualityAttributeInstance.canInstantiate(obj) ? new QualityAttributeInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link QualityAttributeInstance} proxy from a {@link Instance} stereotyped << QualityAttribute_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link QualityAttributeInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("56ce06b6-3276-46fd-a9b2-643b081a0ae7")
=======
    @objid ("4ab8e4a2-9668-489c-ab1e-4920467d3c47")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static QualityAttributeInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (QualityAttributeInstance.canInstantiate(obj))
        	return new QualityAttributeInstance(obj);
        else
        	throw new IllegalArgumentException("QualityAttributeInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("f1d62477-b9a9-4b3a-8280-cd4098c7d7d7")
=======
    @objid ("29c7e9ee-2a77-4d09-8957-f179f95dc29e")
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
        QualityAttributeInstance other = (QualityAttributeInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("859e85ce-d553-4ac9-aca9-fcbce6bab781")
=======
    @objid ("4c87724d-a53a-4827-8572-787a8493510b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

<<<<<<< HEAD
    @objid ("7da8a53a-f796-46b0-a618-12f7bb73c190")
=======
    @objid ("177f9a79-1cd3-4001-984f-c6e092e27573")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

<<<<<<< HEAD
    @objid ("700dc8cf-0e58-4a7d-8731-09ab4a337752")
=======
    @objid ("27ec907e-fab2-4b7b-b6a9-6b488a967b48")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected QualityAttributeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("7bcf74f3-4096-4d0e-b52f-9631c8713380")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("e6d8445d-e671-46d8-aa4d-88977c2bb885")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a60f6b7b-a581-4003-8351-5216bf8865ee")
        private static Stereotype MDAASSOCDEP;

        @objid ("216058a7-5e51-4003-aef9-94026af4cdd6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1631b09c-1060-4523-9c8d-d14ef5aecda6")
=======
        @objid ("e8c86ca3-ea5b-4311-b122-a26011b75921")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6f86d0d0-83b1-42c4-b389-fe19a0f64614")
        private static Stereotype MDAASSOCDEP;

        @objid ("91ca9d50-c14e-4c7a-89ba-459a81f24559")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3e38fa4f-e64d-4eed-a228-c0ba091e9a27")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "941ade06-ff13-4f23-a6da-bef6181d19c3");
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
