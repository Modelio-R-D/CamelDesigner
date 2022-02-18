/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttribute;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
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
public class SecurityAttribute extends QualityAttribute {
    @objid ("5bc991b1-6267-4996-b63d-237b822ad7f6")
    public static final String STEREOTYPE_NAME = "SecurityAttribute";

    /**
     * Tells whether a {@link SecurityAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c2ef1b1a-9893-4e7c-b77e-15c1f274009e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityAttribute >> then instantiate a {@link SecurityAttribute} proxy.
     * 
     * @return a {@link SecurityAttribute} proxy on the created {@link Class}.
     */
    @objid ("74455111-322d-404b-aa60-09dead46e05a")
    public static SecurityAttribute create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityAttribute.STEREOTYPE_NAME);
        return SecurityAttribute.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecurityAttribute} proxy from a {@link Class} stereotyped << SecurityAttribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SecurityAttribute} proxy or <i>null</i>.
     */
    @objid ("f6297493-3a94-45cc-a8b9-cad85fc3d0cb")
    public static SecurityAttribute instantiate(final Class obj) {
        return SecurityAttribute.canInstantiate(obj) ? new SecurityAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityAttribute} proxy from a {@link Class} stereotyped << SecurityAttribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SecurityAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5be2f438-b8e2-4257-bb4c-f865e0e12a03")
    public static SecurityAttribute safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecurityAttribute.canInstantiate(obj))
        	return new SecurityAttribute(obj);
        else
        	throw new IllegalArgumentException("SecurityAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9cc53979-21ca-40d5-a7cc-e8d67597aec6")
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
     * 
     */
    @objid ("1a02874e-fbea-4f98-9e01-41e1fefeaad7")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d2ff8027-f7da-4103-9d8a-62e2db825845")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("58ae22a7-e6db-4511-87c1-be349babf88e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'domain' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9f698ca1-bfd2-45d0-956b-526262bf17a7")
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

    @objid ("36f7e378-2363-4bef-ad07-17b7fef15595")
    protected SecurityAttribute(final Class elt) {
        super(elt);
    }

    @objid ("6ae49d7c-2a2e-413e-af68-3326e7b2351a")
    public static final class MdaTypes {
        @objid ("eb953be0-1f8e-4168-9ada-0d975022b481")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e87d33f6-9e5a-4215-bcc8-e08d3a2d6ef4")
        private static Stereotype MDAASSOCDEP;

        @objid ("127fa2ff-d2e0-4ab9-b23d-840e652b9edb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b9ffd463-2106-411d-b228-cda95ec6c479")
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
