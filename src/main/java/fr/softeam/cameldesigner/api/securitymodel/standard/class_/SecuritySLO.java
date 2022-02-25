/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
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
 * Proxy class to handle a {@link Class} with << SecuritySLO >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("14701eb6-66e6-421f-bc02-e050f9e15799")
public class SecuritySLO extends ServiceLevelObjective {
    @objid ("1b3aa34d-0d6f-4783-8314-ec7b9018e4aa")
    public static final String STEREOTYPE_NAME = "SecuritySLO";

    /**
     * Tells whether a {@link SecuritySLO proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecuritySLO >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("26472054-f019-4661-a2c5-7ce28c866bac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecuritySLO.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecuritySLO >> then instantiate a {@link SecuritySLO} proxy.
     * 
     * @return a {@link SecuritySLO} proxy on the created {@link Class}.
     */
    @objid ("f1f21c9f-46c6-471b-8d98-09aa60f58eae")
    public static SecuritySLO create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecuritySLO.STEREOTYPE_NAME);
        return SecuritySLO.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecuritySLO} proxy from a {@link Class} stereotyped << SecuritySLO >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SecuritySLO} proxy or <i>null</i>.
     */
    @objid ("fdb29321-bc20-4aa9-a37c-e2988497d25d")
    public static SecuritySLO instantiate(final Class obj) {
        return SecuritySLO.canInstantiate(obj) ? new SecuritySLO(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecuritySLO} proxy from a {@link Class} stereotyped << SecuritySLO >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SecuritySLO} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a84e18b7-0f6f-458c-a5f0-86bcf922aa65")
    public static SecuritySLO safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecuritySLO.canInstantiate(obj))
        	return new SecuritySLO(obj);
        else
        	throw new IllegalArgumentException("SecuritySLO: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f4ce33d3-e82e-4b38-adea-652b1ffad30b")
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
        SecuritySLO other = (SecuritySLO) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e9f330c4-670c-4293-88c9-33afcfaa9e26")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("44b51f34-cca9-424f-bc1b-1ab0745c1147")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0884089d-11ac-40cf-865e-45d813d66936")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("34eb9887-cee6-4785-8ead-8452d6bf9a05")
    protected SecuritySLO(final Class elt) {
        super(elt);
    }

    @objid ("617e4bcc-2615-4bc6-b9f6-51075bd242b2")
    public static final class MdaTypes {
        @objid ("46818229-b40f-4e9e-b8b0-f2b480ffce32")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("467fc7ec-2f62-4da1-9236-5a5f6af0eb46")
        private static Stereotype MDAASSOCDEP;

        @objid ("e2dd4329-9e34-40d4-930e-24590b94486b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8f8c8cd5-fec9-4012-af3b-cb3c40520177")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8fcb0a39-47f5-4d53-9540-bede515f2431");
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
