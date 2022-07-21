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
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttributeClass;
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
public class SecurityAttribute extends QualityAttributeClass {
    @objid ("1cd26788-c14d-40ab-8127-c80552443c0f")
    public static final String STEREOTYPE_NAME = "SecurityAttribute";

    /**
     * Tells whether a {@link SecurityAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8ad67c5d-031e-4b5b-8a77-ec8c9e4075c7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityAttribute >> then instantiate a {@link SecurityAttribute} proxy.
     * 
     * @return a {@link SecurityAttribute} proxy on the created {@link Class}.
     */
    @objid ("d1ec5850-2167-48ea-bd96-b072b66a77d3")
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
    @objid ("a4bdea5a-a7dc-4192-8443-7af85a94d624")
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
    @objid ("90db6f66-01b8-4cb1-8919-96a0241dbaaa")
    public static SecurityAttribute safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecurityAttribute.canInstantiate(obj))
        	return new SecurityAttribute(obj);
        else
        	throw new IllegalArgumentException("SecurityAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f51cea92-778e-4866-8421-496818505fad")
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
    @objid ("3324ace1-8559-4ed7-8734-9a08e614f4fc")
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
    @objid ("5932961c-3d75-4abf-a5c5-66e4b867593d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("b3a14a0e-8924-4cf7-9192-1b5eaa6b4230")
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
    @objid ("eebd2975-32eb-4437-a134-0fa53a878154")
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

    @objid ("b87fc58d-c3a4-40f4-ad12-b4c60df84b64")
    protected SecurityAttribute(final Class elt) {
        super(elt);
    }

    @objid ("6ae49d7c-2a2e-413e-af68-3326e7b2351a")
    public static final class MdaTypes {
        @objid ("ed3192f6-71af-41d4-9fb9-51c228dd3a71")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("82829813-8a19-4c10-ab3e-8e2440aacfd2")
        private static Stereotype MDAASSOCDEP;

        @objid ("cc6b2c03-2a50-483f-a74b-f7eab218875b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e10fb751-53e1-4913-9ecb-85a2c2685297")
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
