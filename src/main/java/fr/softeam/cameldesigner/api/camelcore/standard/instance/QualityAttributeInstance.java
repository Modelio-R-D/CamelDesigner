/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("db61e319-93ae-4b6e-b308-c4c8fe010c50")
    public static final String STEREOTYPE_NAME = "QualityAttribute_Instance";

    /**
     * Tells whether a {@link QualityAttributeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << QualityAttribute_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("20e84ab9-093a-40be-b833-2346c500aee2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << QualityAttribute_Instance >> then instantiate a {@link QualityAttributeInstance} proxy.
     * 
     * @return a {@link QualityAttributeInstance} proxy on the created {@link Instance}.
     */
    @objid ("bd2de23e-1028-4877-b828-23d91290b982")
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
    @objid ("86c88af0-9a6f-443a-bd87-fad8a6e7fb78")
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
    @objid ("088d4cf2-e9da-412b-a72d-3edf1f998b5f")
    public static QualityAttributeInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (QualityAttributeInstance.canInstantiate(obj))
        	return new QualityAttributeInstance(obj);
        else
        	throw new IllegalArgumentException("QualityAttributeInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("16a705e0-1e86-4b22-aacd-657bf0759857")
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
    @objid ("be752634-6ebf-4a61-adbe-e5da49a62b7a")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("66c10286-9bf1-4d06-9b9b-06d4d92fd7a1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5cc7cb58-657b-45b0-a793-92fe49551220")
    protected QualityAttributeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("7bcf74f3-4096-4d0e-b52f-9631c8713380")
    public static final class MdaTypes {
        @objid ("1701f9ea-e85f-4100-8e9f-99da3fc336ca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("935de2e1-615e-4ba6-8c53-f9db1db5d91d")
        private static Stereotype MDAASSOCDEP;

        @objid ("2b497fa5-3c49-4791-b691-fab175e1df36")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("475a9c72-6e35-44b1-bb4a-de75cabe3be6")
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
