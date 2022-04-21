/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
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
 * Proxy class to handle a {@link Class} with << PaaSRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f5103c3d-e058-41f9-b48b-a3555f8f176c")
public class PaaSRequirement extends HardRequirement {
    @objid ("ed7d633c-3150-4445-80be-cffaa7ee23a5")
    public static final String STEREOTYPE_NAME = "PaaSRequirement";

    /**
     * Tells whether a {@link PaaSRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PaaSRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("22d0a051-c0c3-4276-ac1b-e59425746c83")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PaaSRequirement >> then instantiate a {@link PaaSRequirement} proxy.
     * 
     * @return a {@link PaaSRequirement} proxy on the created {@link Class}.
     */
    @objid ("46960ed0-1ab2-4e44-a25f-b6e80b5db723")
    public static PaaSRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaSRequirement.STEREOTYPE_NAME);
        return PaaSRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PaaSRequirement} proxy from a {@link Class} stereotyped << PaaSRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link PaaSRequirement} proxy or <i>null</i>.
     */
    @objid ("482a731c-3657-48cc-9a47-eb11eb151c85")
    public static PaaSRequirement instantiate(final Class obj) {
        return PaaSRequirement.canInstantiate(obj) ? new PaaSRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaSRequirement} proxy from a {@link Class} stereotyped << PaaSRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link PaaSRequirement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("077c7293-f3a5-4e71-9140-14a7971f24af")
    public static PaaSRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PaaSRequirement.canInstantiate(obj))
            return new PaaSRequirement(obj);
        else
            throw new IllegalArgumentException("PaaSRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7f5a172f-2757-433d-b0bb-98a8c6977bda")
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
        PaaSRequirement other = (PaaSRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ff30cd75-5b1a-4a99-9c56-5cb0dd827277")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("e2bce0fe-21aa-4995-95cc-44b23ce4818b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("030e0731-9e44-4472-baad-c615462b1d25")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("e13215a4-7479-40be-a7aa-57f02f81eb38")
    protected PaaSRequirement(final Class elt) {
        super(elt);
    }

    @objid ("f1ab105f-3a9a-4d24-8c32-5dd406174ad0")
    public static final class MdaTypes {
        @objid ("77c9a9a4-ea64-41cc-8486-4f4cb172ef7c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bd3e3c02-d2f2-49fa-8bc9-9959590ad271")
        private static Stereotype MDAASSOCDEP;

        @objid ("38b2bac1-92a8-4228-8b59-3096a1b3e21d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c052ea19-380f-439a-ac11-cb4e2848bb56")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1b4b9489-ad62-4a1b-be52-900e21e7f441");
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
