/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e08f861e-385b-4bd4-8c8b-909219bd8fe0")
=======
    @objid ("ae92cb33-0459-4ae1-903b-f323d5ee6cc7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "SecurityRequirement";

    /**
     * Tells whether a {@link SecurityRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("c3034bdc-ead7-443f-ae8f-cfe454e0426c")
=======
    @objid ("0de59245-8f7e-4e65-b85d-eb61b75f5e6f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityRequirement >> then instantiate a {@link SecurityRequirement} proxy.
     * 
     * @return a {@link SecurityRequirement} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("bfb97878-d44d-4d30-bcff-8b23d72ac9a1")
=======
    @objid ("faf84d4a-3d65-40de-b9ff-30d1043579a2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityRequirement.STEREOTYPE_NAME);
        return SecurityRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecurityRequirement} proxy from a {@link Class} stereotyped << SecurityRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SecurityRequirement} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("02da0a49-6e78-411e-a8ae-74f82c53fe29")
=======
    @objid ("ba64552b-b784-4db5-b158-26a28db68625")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityRequirement instantiate(final Class obj) {
        return SecurityRequirement.canInstantiate(obj) ? new SecurityRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityRequirement} proxy from a {@link Class} stereotyped << SecurityRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SecurityRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("398ca98c-ca62-4771-b2aa-f7390eae6a0c")
=======
    @objid ("fcbcbf72-9cf4-486b-bf26-e7aaa0e7a447")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
     * 
     */
<<<<<<< HEAD
    @objid ("d4f67c60-6d20-49b7-abad-aec3ee9013ac")
=======
    @objid ("9b1636eb-4079-4430-8aca-71d26560dd12")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSecurityControls(final SecurityControl obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityRequirement.MdaTypes.MDAASSOCDEP);
            d.setName("securityControls");
            d.putTagValue(SecurityRequirement.MdaTypes.MDAASSOCDEP_ROLE, "securityControls");
        }
    }

<<<<<<< HEAD
    @objid ("430157d7-1042-456d-9dbb-00f428ce3618")
=======
    @objid ("9e4e0b03-ecb0-4d0c-a524-cae44ba7ac6a")
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
        SecurityRequirement other = (SecurityRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("fc15806a-fb84-4334-a3a1-18b521d1a396")
=======
    @objid ("26f2bbf6-df22-434f-92d5-541dc742d0a6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("22a1ff4a-6f11-4466-ae23-8f8b273d5865")
=======
    @objid ("44f90bc9-253f-4e00-acab-78a990b9a4a6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("5d1a32c1-64eb-4d2b-a622-dd5f2c5fbaaa")
=======
    @objid ("f36cef16-5c77-4b53-a900-d81a2f4cd1dd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("117e1903-4b3a-40f5-b9d6-1d6810d950de")
=======
    @objid ("330caf63-8524-400b-a4a2-1e06286520d4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("18760a5c-95a9-40fb-86e4-cd9bc876e667")
=======
    @objid ("60342baa-58f3-4db4-b0f4-d7bf524bfc91")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected SecurityRequirement(final Class elt) {
        super(elt);
    }

    @objid ("9b57abca-226e-4023-b549-3dc9186ae82b")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("7a4b3b7a-ed7a-4cd4-a44c-cde2b2567525")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cbda3474-74e7-45e4-a79b-7f6542db2cf8")
        private static Stereotype MDAASSOCDEP;

        @objid ("4099323b-0d72-4ab3-8022-cd8ca3e762f8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8f7c8160-bf21-4f5f-98c0-9f18a7c1a1bb")
=======
        @objid ("a5011d12-76b9-46ec-b066-6f1f8ff51166")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("428869c3-a26e-460e-b352-32eb33f9fc2d")
        private static Stereotype MDAASSOCDEP;

        @objid ("27e98c02-162e-43ac-9ae2-e071863a1a64")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0a1ca3fd-22dc-485b-9207-8d9cc0a36e14")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
