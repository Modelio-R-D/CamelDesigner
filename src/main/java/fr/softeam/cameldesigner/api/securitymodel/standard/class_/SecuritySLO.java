/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("03b0374d-1b4a-4e14-9261-9c0f6a29e240")
    public static final String STEREOTYPE_NAME = "SecuritySLO";

    /**
     * Tells whether a {@link SecuritySLO proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecuritySLO >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e6087fae-b253-47aa-a040-4b4bfade67cf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecuritySLO.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecuritySLO >> then instantiate a {@link SecuritySLO} proxy.
     * 
     * @return a {@link SecuritySLO} proxy on the created {@link Class}.
     */
    @objid ("d1ec2bf7-4edc-4f58-8770-d04369ac0f3d")
    public static SecuritySLO create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecuritySLO.STEREOTYPE_NAME);
        return SecuritySLO.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecuritySLO} proxy from a {@link Class} stereotyped << SecuritySLO >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link SecuritySLO} proxy or <i>null</i>.
     */
    @objid ("cfe5574d-0770-4170-a2e6-ef692d3d41b1")
    public static SecuritySLO instantiate(final Class obj) {
        return SecuritySLO.canInstantiate(obj) ? new SecuritySLO(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecuritySLO} proxy from a {@link Class} stereotyped << SecuritySLO >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link SecuritySLO} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("03be0cb6-c407-47d8-bf2e-aeb20a57be6e")
    public static SecuritySLO safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecuritySLO.canInstantiate(obj))
            return new SecuritySLO(obj);
        else
            throw new IllegalArgumentException("SecuritySLO: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e2233a90-9a63-4d21-b518-94029d0d6dd2")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("bd00f19a-13e8-4eec-8149-485f36b7d6e3")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("5574c8f8-cbdb-47f1-b5e4-807d88a93e31")
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

    @objid ("e629c4ba-c826-4925-888f-69f8ae414c67")
    protected SecuritySLO(final Class elt) {
        super(elt);
    }

    @objid ("617e4bcc-2615-4bc6-b9f6-51075bd242b2")
    public static final class MdaTypes {
        @objid ("840db501-9296-46a3-9fc9-730d375da413")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0765b8c2-6f0e-4cc4-8f53-f25eb740b02e")
        private static Stereotype MDAASSOCDEP;

        @objid ("fc02e6f8-7580-43ea-94bd-ef8f6200aaae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("313be88e-1b1e-4f5c-b40d-b9eff0f6fa5c")
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
