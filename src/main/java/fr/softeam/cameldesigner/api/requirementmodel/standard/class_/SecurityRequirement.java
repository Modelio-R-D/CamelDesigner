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
    @objid ("af8c99ee-7ca8-496a-b61d-ea3520edca6d")
    public static final String STEREOTYPE_NAME = "SecurityRequirement";

    /**
     * Tells whether a {@link SecurityRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9a66b0fc-8793-4ce5-8f22-1ff906c221d8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityRequirement >> then instantiate a {@link SecurityRequirement} proxy.
     * 
     * @return a {@link SecurityRequirement} proxy on the created {@link Class}.
     */
    @objid ("f95db3e2-55d8-418b-a7b7-797a23de5e46")
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
    @objid ("75c15a4c-c2b9-4992-9809-6a9f98b554ac")
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
    @objid ("f4309342-d7e0-4332-9406-17decaa46b84")
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
    @objid ("e46720a1-4061-40fb-9a8a-60aa99e3b373")
    public void addSecurityControls(final SecurityControl obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityRequirement.MdaTypes.MDAASSOCDEP);
            d.setName("securityControls");
            d.putTagValue(SecurityRequirement.MdaTypes.MDAASSOCDEP_ROLE, "securityControls");
        }
    }

    @objid ("411fd360-d967-476c-aca7-12d8030c95ce")
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
    @objid ("69a7cf71-670e-43cb-9a6b-08d58769e631")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'securityControls' role.<p>
     * Role description:
     * null
     */
    @objid ("8891c813-5f16-4463-b2c3-e15cc3fb7c77")
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

    @objid ("53c894a5-c502-453d-af62-4d35892de922")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'securityControls' role.<p>
     * Role description:
     * null
     */
    @objid ("158e7bfb-9658-40da-a630-b2b3b21264d6")
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

    @objid ("4ca21618-7ad1-41ce-9498-1c88666706cc")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("71983519-e720-47da-9b86-111912f4a6a9")
    protected SecurityRequirement(final Class elt) {
        super(elt);
    }

    @objid ("9b57abca-226e-4023-b549-3dc9186ae82b")
    public static final class MdaTypes {
        @objid ("9b8dbef2-cead-4ac4-9ba9-6c6bc0cd25aa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2e75d350-1756-45ac-a319-8bb7bee7a2b0")
        private static Stereotype MDAASSOCDEP;

        @objid ("f15de3fb-0015-4993-9193-ee069ef9e620")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("82485244-83df-4059-ad52-0ab4cf5d7fe7")
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
