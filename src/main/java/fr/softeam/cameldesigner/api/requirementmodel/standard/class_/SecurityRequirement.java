/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.04

 * This file was generated on 11/9/20 11:45 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
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
 * Proxy class to handle a {@link Class} with << SecurityRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class SecurityRequirement extends HardRequirement {
    public static final String STEREOTYPE_NAME = "SecurityRequirement";

    /**
     * Tells whether a {@link SecurityRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityRequirement >> then instantiate a {@link SecurityRequirement} proxy.
     * 
     * @return a {@link SecurityRequirement} proxy on the created {@link Class}.
     */
    public static SecurityRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityRequirement.STEREOTYPE_NAME);
        return SecurityRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecurityRequirement} proxy from a {@link Class} stereotyped << SecurityRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link SecurityRequirement} proxy or <i>null</i>.
     */
    public static SecurityRequirement instantiate(final Class obj) {
        return SecurityRequirement.canInstantiate(obj) ? new SecurityRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityRequirement} proxy from a {@link Class} stereotyped << SecurityRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link SecurityRequirement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SecurityRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecurityRequirement.canInstantiate(obj))
            return new SecurityRequirement(obj);
        else
            throw new IllegalArgumentException("SecurityRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'securityControls' role.<p>
     * Role description:
     * null
     */
    public void addSecurityControls(final SecurityControl obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityRequirement.MdaTypes.MDAASSOCDEP);
            d.setName("securityControls");
            d.putTagValue(SecurityRequirement.MdaTypes.MDAASSOCDEP_ROLE, "securityControls");
        }
    }

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
        SecurityRequirement other = (SecurityRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'securityControls' role.<p>
     * Role description:
     * null
     */
    public List<SecurityControl> getSecurityControls() {
        List<SecurityControl> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(SecurityRequirement.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SecurityRequirement.MdaTypes.MDAASSOCDEP_ROLE), "securityControls")
              && SecurityControl.canInstantiate(d.getDependsOn()))
                results.add((SecurityControl)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityControl.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'securityControls' role.<p>
     * Role description:
     * null
     */
    public boolean removeSecurityControls(final SecurityControl obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SecurityRequirement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityRequirement.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    protected SecurityRequirement(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c104b35e-2578-4138-94df-ff26daad8dc7");
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
