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
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttributeClass;
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
 * Proxy class to handle a {@link Class} with << SecurityAttribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("dcfdf889-b55e-406d-8583-1ecbb8c17322")
public class SecurityAttribute extends QualityAttributeClass {
    @objid ("b4777069-2d18-40ca-9d06-e59135629109")
    public static final String STEREOTYPE_NAME = "SecurityAttribute";

    /**
     * Tells whether a {@link SecurityAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c7a320a3-a7ed-485a-9589-c702d6bf9813")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityAttribute >> then instantiate a {@link SecurityAttribute} proxy.
     * 
     * @return a {@link SecurityAttribute} proxy on the created {@link Class}.
     */
    @objid ("236b4261-16a7-4994-97d5-7b6623349cd1")
    public static SecurityAttribute create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityAttribute.STEREOTYPE_NAME);
        return SecurityAttribute.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecurityAttribute} proxy from a {@link Class} stereotyped << SecurityAttribute >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link SecurityAttribute} proxy or <i>null</i>.
     */
    @objid ("15d78d1f-28d4-4d83-a13a-de14af8d6dba")
    public static SecurityAttribute instantiate(final Class obj) {
        return SecurityAttribute.canInstantiate(obj) ? new SecurityAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityAttribute} proxy from a {@link Class} stereotyped << SecurityAttribute >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link SecurityAttribute} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("401efe37-0caa-4f40-a58f-a7d7f9fbefa3")
    public static SecurityAttribute safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecurityAttribute.canInstantiate(obj))
            return new SecurityAttribute(obj);
        else
            throw new IllegalArgumentException("SecurityAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ac85393a-5a33-4295-8b0f-710b6ce71588")
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
        SecurityAttribute other = (SecurityAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'domain' role.<p>
     * Role description:
     * null
     */
    @objid ("fa9d6e4b-742c-420e-8c11-e0b7647d48fb")
    public SecurityDomain getDomain() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SecurityAttribute.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SecurityAttribute.MdaTypes.MDAASSOCDEP_ROLE), "domain")){
                  if (SecurityDomain.canInstantiate(d.getDependsOn()))
                     return (SecurityDomain)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityDomain.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("0ca34f4d-b0c2-44fe-9941-4dbe752d9614")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("5a1dab8a-023a-4580-ae04-28a5e754b885")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'domain' role.<p>
     * Role description:
     * null
     */
    @objid ("d439ecbe-c642-4a2e-b5d1-8c172f20ea9d")
    public void setDomain(final SecurityDomain obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SecurityAttribute.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityAttribute.MdaTypes.MDAASSOCDEP_ROLE), "domain")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SecurityAttribute.MdaTypes.MDAASSOCDEP);
              dep.setName("domain");      dep.putTagValue(SecurityAttribute.MdaTypes.MDAASSOCDEP_ROLE, "domain");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("21dfbb37-3912-41b1-8316-33fa0faa4960")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("75ab1a55-b9db-4a0b-9c0d-02c5e0ae6e4d")
    protected SecurityAttribute(final Class elt) {
        super(elt);
    }

    @objid ("6ae49d7c-2a2e-413e-af68-3326e7b2351a")
    public static final class MdaTypes {
        @objid ("f017dfd9-e5cc-4bfd-8e69-94c58fad6639")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("53303f15-8d70-4abd-a6b5-21639f3c752c")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1383710-423e-44ea-a82c-0a59505f724f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("55f41559-ced0-4e12-97c2-33475a0402b1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "59943cbd-62e2-4183-8973-e15130bcb7d3");
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
