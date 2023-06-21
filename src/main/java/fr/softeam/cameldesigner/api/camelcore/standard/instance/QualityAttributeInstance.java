/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("d3a57e39-0b96-437c-a0bf-c2cb5a2926fd")
    public static final String STEREOTYPE_NAME = "QualityAttribute_Instance";

    /**
     * Tells whether a {@link QualityAttributeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << QualityAttribute_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ff149f38-3e30-4368-817b-f9fb65d91817")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << QualityAttribute_Instance >> then instantiate a {@link QualityAttributeInstance} proxy.
     * 
     * @return a {@link QualityAttributeInstance} proxy on the created {@link Instance}.
     */
    @objid ("ed1355b7-74e7-426a-899e-d6d91b0c0483")
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
    @objid ("3ba2e71c-c50f-416c-9a8d-d0361c3049e3")
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
    @objid ("4f459270-3e4e-4b5e-a602-b541e006c06e")
    public static QualityAttributeInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (QualityAttributeInstance.canInstantiate(obj))
        	return new QualityAttributeInstance(obj);
        else
        	throw new IllegalArgumentException("QualityAttributeInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3f15d736-d1bf-4939-8dff-45863010d374")
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
    @objid ("a4b32eae-f631-4fdd-9765-6bfad05aa2f5")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("7dd82f52-5491-4d0d-a0f2-a5ec8573dd17")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("792514aa-1124-4e31-8f69-cfe945b23201")
    protected QualityAttributeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("7bcf74f3-4096-4d0e-b52f-9631c8713380")
    public static final class MdaTypes {
        @objid ("725b2b55-9532-4864-a791-daa3d5deb818")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f3f0918a-3691-40fa-aadd-72795ce83500")
        private static Stereotype MDAASSOCDEP;

        @objid ("bd609fb5-e12e-434d-be3b-fc0d4edcf6a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d6282d8d-a84d-4635-9b94-1b5fc5ded6e7")
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
