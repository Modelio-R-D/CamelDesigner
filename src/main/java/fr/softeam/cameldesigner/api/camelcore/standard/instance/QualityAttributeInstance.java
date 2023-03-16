/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("9ebc6af5-0d17-4bde-8586-21236982b6f4")
    public static final String STEREOTYPE_NAME = "QualityAttribute_Instance";

    /**
     * Tells whether a {@link QualityAttributeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << QualityAttribute_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("08b67930-bc5c-4619-b3ce-a9e1d027921f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << QualityAttribute_Instance >> then instantiate a {@link QualityAttributeInstance} proxy.
     * 
     * @return a {@link QualityAttributeInstance} proxy on the created {@link Instance}.
     */
    @objid ("6c094ec7-3d6f-4e51-b092-c23a5f0d399e")
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
    @objid ("4b8e21d4-60d1-476b-a3e2-ab4dc97efbfe")
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
    @objid ("43496d92-5d41-4887-9131-8fceb7e37eb4")
    public static QualityAttributeInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (QualityAttributeInstance.canInstantiate(obj))
        	return new QualityAttributeInstance(obj);
        else
        	throw new IllegalArgumentException("QualityAttributeInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("87e2fb3d-b860-42ef-bccc-9ea20478ba6e")
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
    @objid ("fdc3e9b1-b7fe-4df6-8d4f-bb95d18fa3e8")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("737dbe01-7d25-45d4-8e9a-811950c92e99")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5332fd12-1261-45f0-83cb-ecd58cfd664d")
    protected QualityAttributeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("7bcf74f3-4096-4d0e-b52f-9631c8713380")
    public static final class MdaTypes {
        @objid ("06953e21-a207-48dd-a3cb-996c1aa50ffd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b00cc65f-fca0-4d18-8f4c-8baeeffd1c1a")
        private static Stereotype MDAASSOCDEP;

        @objid ("d91bfefa-aee5-4f21-a475-70d677f5a0d6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("87fa9873-b4af-452e-acd9-e4859bb7cfbb")
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
