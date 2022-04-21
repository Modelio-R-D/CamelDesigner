/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("31b58769-116c-475d-9d0d-c8d3e27b40d0")
    public static final String STEREOTYPE_NAME = "SecuritySLO";

    /**
     * Tells whether a {@link SecuritySLO proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecuritySLO >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1eb0ebe1-11b9-48f6-8ce8-2cc07adac651")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecuritySLO.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecuritySLO >> then instantiate a {@link SecuritySLO} proxy.
     * 
     * @return a {@link SecuritySLO} proxy on the created {@link Class}.
     */
    @objid ("fbde96de-37aa-4d26-8976-d40f0977688d")
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
    @objid ("79bb3775-5e2a-4341-8f73-d249ec653649")
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
    @objid ("e11f8c3f-590a-4312-a0b4-4be23e4e4950")
    public static SecuritySLO safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecuritySLO.canInstantiate(obj))
            return new SecuritySLO(obj);
        else
            throw new IllegalArgumentException("SecuritySLO: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e52e27b0-ea57-46e0-9f05-711b9ce994bd")
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
    @objid ("58a651da-efae-4b24-99b9-7c1097c9d1ed")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("2271343c-a090-41be-8364-7b44e35552a3")
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

    @objid ("b64c6cbb-a5d9-4416-9034-a5d075cdd88a")
    protected SecuritySLO(final Class elt) {
        super(elt);
    }

    @objid ("617e4bcc-2615-4bc6-b9f6-51075bd242b2")
    public static final class MdaTypes {
        @objid ("becbb700-d17c-4da9-b1be-f18497d61c47")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("835b4e25-1901-4cd5-b3e0-b7f6539f5da7")
        private static Stereotype MDAASSOCDEP;

        @objid ("c73c48e9-d15e-4517-bd23-f19bc1ff08b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ee28ae54-06f2-4fca-ba9a-91435eabd671")
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
