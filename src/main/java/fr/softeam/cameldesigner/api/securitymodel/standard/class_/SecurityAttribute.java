/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
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
    @objid ("c62fc4b6-7776-4ead-888e-c7cdef672572")
    public static final String STEREOTYPE_NAME = "SecurityAttribute";

    /**
     * Tells whether a {@link SecurityAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2f603ca5-d393-4cdc-81c6-105f32cf73c8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityAttribute >> then instantiate a {@link SecurityAttribute} proxy.
     * 
     * @return a {@link SecurityAttribute} proxy on the created {@link Class}.
     */
    @objid ("0bf00e4a-2b72-4075-ab2f-94830ff8bf84")
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
    @objid ("36e82f6d-b92b-4fa9-b526-59bd8b5d4a4c")
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
    @objid ("b18a9f92-d057-431f-b669-3cf1fc20691e")
    public static SecurityAttribute safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecurityAttribute.canInstantiate(obj))
        	return new SecurityAttribute(obj);
        else
        	throw new IllegalArgumentException("SecurityAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ec3c5753-5591-4334-ac8b-31e1407a96ba")
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
    @objid ("a5f1c8fb-2719-4203-b1ff-87c6c73ed24b")
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
    @objid ("f277285d-9909-4261-9da6-ca5c078dbb1f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("6995c05c-6dad-49b9-8db3-0e443cde28fb")
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
    @objid ("7cce4c41-cea3-49de-99ef-d5c82081f4b1")
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

    @objid ("5a598518-3d57-4a72-bfb7-9072b276db6a")
    protected SecurityAttribute(final Class elt) {
        super(elt);
    }

    @objid ("6ae49d7c-2a2e-413e-af68-3326e7b2351a")
    public static final class MdaTypes {
        @objid ("1255ac8d-b28d-4487-b1e9-dbd488441651")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c026af06-a693-47eb-b3bf-821b27c905ed")
        private static Stereotype MDAASSOCDEP;

        @objid ("cc412d1f-fcc6-44f5-bf6b-572a35643f61")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("30632373-85d3-452f-a627-a91bbc009124")
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
