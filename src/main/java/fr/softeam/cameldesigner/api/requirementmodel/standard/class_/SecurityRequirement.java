/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
@objid ("6b8aa5ee-f997-4cf1-b7ce-1eb33e152b7e")
public class SecurityRequirement extends HardRequirement {
    @objid ("4d7c4fd0-cf3c-4ea0-b091-76b087653b2b")
    public static final String STEREOTYPE_NAME = "SecurityRequirement";

    /**
     * Tells whether a {@link SecurityRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8a4c579a-142d-4f3f-b003-19c52d87bea7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityRequirement >> then instantiate a {@link SecurityRequirement} proxy.
     * 
     * @return a {@link SecurityRequirement} proxy on the created {@link Class}.
     */
    @objid ("5ca3701e-fc87-43e0-9590-0e40b3f155db")
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
    @objid ("d12f67d9-092c-4a62-bb94-1053da16aad1")
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
    @objid ("e62d3a79-7923-4625-98ef-9cfc3d473df7")
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
    @objid ("f1f65e0d-d0c1-4b3d-86fa-2628e6119e11")
    public void addSecurityControls(final SecurityControl obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityRequirement.MdaTypes.MDAASSOCDEP);
            d.setName("securityControls");
            d.putTagValue(SecurityRequirement.MdaTypes.MDAASSOCDEP_ROLE, "securityControls");
        }
    }

    @objid ("2330b5ed-3e8a-4b71-8e48-d45faf8607a6")
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
    @objid ("c515ce6e-1fd5-45e3-a062-3ab2086d58c9")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'securityControls' role.<p>
     * Role description:
     * null
     */
    @objid ("cfa95e30-1194-4a4d-91ba-a7d004b57693")
    public List<SecurityControl> getSecurityControls() {
        List<SecurityControl> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SecurityRequirement.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SecurityRequirement.MdaTypes.MDAASSOCDEP_ROLE), "securityControls")){
              if (SecurityControl.canInstantiate(d.getDependsOn()))
                results.add((SecurityControl)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityControl.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cc0fae95-e544-4882-9a6e-b28e0b3e2ddd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'securityControls' role.<p>
     * Role description:
     * null
     */
    @objid ("973b938b-2180-475e-9285-404b6a2054eb")
    public boolean removeSecurityControls(final SecurityControl obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SecurityRequirement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityRequirement.MdaTypes.MDAASSOCDEP_ROLE), "securityControls")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("4ca21618-7ad1-41ce-9498-1c88666706cc")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("2c1eb274-da4b-496c-9ff5-f327fdb97969")
    protected SecurityRequirement(final Class elt) {
        super(elt);
    }

    @objid ("9b57abca-226e-4023-b549-3dc9186ae82b")
    public static final class MdaTypes {
        @objid ("bc31bfee-3aa2-4f92-bcb6-116721b5a545")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("03d8a111-4eff-4fd9-8dd3-a900853af50e")
        private static Stereotype MDAASSOCDEP;

        @objid ("63897074-6626-4328-883e-5cbcdd498cf2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d8b889bd-7414-4e6d-a3dd-8af10653eb35")
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
