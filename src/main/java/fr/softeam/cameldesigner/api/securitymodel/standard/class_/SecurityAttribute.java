/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e9e20b83-71c0-40ea-822d-4b6f4ff58867")
=======
    @objid ("73167c3a-44c2-43be-95c7-739a56054f77")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "SecurityAttribute";

    /**
     * Tells whether a {@link SecurityAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("da783003-358e-41ae-9744-d2e6ca3f6a69")
=======
    @objid ("4fdd836f-c513-461c-9ac1-954ce7dcad68")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityAttribute >> then instantiate a {@link SecurityAttribute} proxy.
     * 
     * @return a {@link SecurityAttribute} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("ca332f1e-547e-4e6b-a8cb-466694846c72")
=======
    @objid ("ccecfd70-d132-47fb-a038-7812d2da6e10")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7b12e80c-d0fd-475c-ab27-5b908cdd4303")
=======
    @objid ("c6f3e219-965f-4eac-8197-2443405dcc3a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e96e4ae1-3f6a-4764-a70e-aed784eedbb2")
=======
    @objid ("fa03ae83-a43a-4429-bc14-5637964cc0f3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityAttribute safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecurityAttribute.canInstantiate(obj))
        	return new SecurityAttribute(obj);
        else
        	throw new IllegalArgumentException("SecurityAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("fc6c2ea2-ab33-414c-9938-9c3f02269b34")
=======
    @objid ("98b7313e-f47f-4fec-8c52-697d3d6aa8ec")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6c5ff256-efc8-4069-a85d-4f53695b0610")
=======
    @objid ("29840438-c586-47b0-ba53-d21bc3775ea7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a6ff35b5-604f-4c1e-a64e-b1f194443189")
=======
    @objid ("6273ac61-226b-4e7b-b703-bc1e9559b39b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("a3c8f02a-0804-4aaf-baf5-dfd196368091")
=======
    @objid ("041071ce-7f86-4fb5-b13c-8f115576b70d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5a8b9999-5f8b-49b6-8444-268249a0aac1")
=======
    @objid ("5ad640e4-5179-4d78-a425-250183abb4e0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("1769fb0f-1db4-4183-9cff-2363fcae5894")
=======
    @objid ("a78cd391-6ef4-451e-b3f5-55e42140ea74")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected SecurityAttribute(final Class elt) {
        super(elt);
    }

    @objid ("6ae49d7c-2a2e-413e-af68-3326e7b2351a")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("e1d81b43-b30a-4093-95d0-663fc6100928")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("52e8dc23-3947-48ff-9239-febd9f8f2aac")
        private static Stereotype MDAASSOCDEP;

        @objid ("0b9a58d3-e2f4-48e2-bcf8-9ab895aea429")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8e443021-3fe8-4c03-b126-0b5c501f0542")
=======
        @objid ("0caf7799-45b5-4d37-8137-f1ad748fdf49")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f1532eeb-9d49-47dc-9c03-2fdec15bd4ba")
        private static Stereotype MDAASSOCDEP;

        @objid ("60accc6a-e3f7-485c-931b-90c0cffa47e2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f9f4cf33-6ee2-46d4-8d3b-0a43394ca455")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
