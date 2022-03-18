/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("a78bc063-9cf3-4514-b1f9-6975bdcd0916")
    public static final String STEREOTYPE_NAME = "SecuritySLO";

    /**
     * Tells whether a {@link SecuritySLO proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecuritySLO >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("74114d67-f05a-40b0-8837-c9c89d542e42")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecuritySLO.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecuritySLO >> then instantiate a {@link SecuritySLO} proxy.
     * 
     * @return a {@link SecuritySLO} proxy on the created {@link Class}.
     */
    @objid ("d4de64da-ff6e-41e4-8c26-b2431bf92629")
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
    @objid ("f09b6847-2212-4f63-a672-0d037a89fb21")
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
    @objid ("89b4c533-8fc8-4ba7-8443-0aafcfc48ab4")
    public static SecuritySLO safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecuritySLO.canInstantiate(obj))
        	return new SecuritySLO(obj);
        else
        	throw new IllegalArgumentException("SecuritySLO: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6179f07a-fc11-484c-bd3b-29f90b0c0a82")
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
    @objid ("18e1f9fe-e79e-486d-a0e5-e5d9579548d9")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("61f79c56-0f9f-4675-b872-1cea39740cca")
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

    @objid ("927fa8da-5c62-4ae5-971e-1b5162bf3e8c")
    protected SecuritySLO(final Class elt) {
        super(elt);
    }

    @objid ("617e4bcc-2615-4bc6-b9f6-51075bd242b2")
    public static final class MdaTypes {
        @objid ("5fc9363b-94bc-45d3-a8e5-f5306c617265")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0beeb616-614a-4d66-9d30-1ea842b93b18")
        private static Stereotype MDAASSOCDEP;

        @objid ("a266ee97-03d1-40cb-8efd-460e9e9b9bd3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e3f08ca0-84fb-4e4d-8b1e-ed15b265a56a")
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
