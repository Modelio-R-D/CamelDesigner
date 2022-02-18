/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("ba773668-1e8a-486a-8d67-e8b8cdf04461")
    public static final String STEREOTYPE_NAME = "QualityAttribute";

    /**
     * Tells whether a {@link QualityAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << QualityAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ff6a23b4-849e-4e9b-b2c0-7d5eced4e71f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << QualityAttribute >> then instantiate a {@link QualityAttribute} proxy.
     * 
     * @return a {@link QualityAttribute} proxy on the created {@link Class}.
     */
    @objid ("fa13e8aa-27e0-4603-ba06-76245758de21")
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
    @objid ("22cc4d73-eb38-4dc2-910d-42b4c1593652")
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
    @objid ("7378c876-a1da-420b-bb2a-88b33d77e825")
    public static QualityAttribute safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (QualityAttribute.canInstantiate(obj))
        	return new QualityAttribute(obj);
        else
        	throw new IllegalArgumentException("QualityAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8fd19dea-adcb-4146-ba69-3942d231bb15")
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
    @objid ("4110e36b-9012-4f56-9d1b-b2f48b3b5960")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("4aebc9ad-7b4c-4f35-a3d0-b91831e610c3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8913374b-333b-4765-92c9-52dd58215aae")
    protected QualityAttribute(final Class elt) {
        super(elt);
    }

    @objid ("b614d475-a5cc-4fb3-8a5c-4681fb5ee31d")
    public static final class MdaTypes {
        @objid ("e00ffdfa-4cea-495b-a10a-d91f94770d75")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("be6fce81-7cbd-49ea-bae5-273abf9aa342")
        private static Stereotype MDAASSOCDEP;

        @objid ("d7c0fb0f-1522-4bc7-a6b4-d546144725ec")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("23c96f0d-8d1b-41a9-9539-8d34c4dd64d6")
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
