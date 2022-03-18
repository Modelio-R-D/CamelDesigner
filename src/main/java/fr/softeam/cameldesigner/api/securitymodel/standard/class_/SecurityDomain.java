/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
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
 * Proxy class to handle a {@link Class} with << SecurityDomain >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fddf4bb7-1f25-43d5-818c-d7ac3e4418a7")
public class SecurityDomain extends FeatureClass {
    @objid ("0fa83a28-96a8-48bf-afcb-d5cd02ef3074")
    public static final String STEREOTYPE_NAME = "SecurityDomain";

    @objid ("bfaae3eb-b072-43e2-98a8-4a4fa1ec83ce")
    public static final String ID_TAGTYPE = "id";

    /**
     * Tells whether a {@link SecurityDomain proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityDomain >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1697b964-1324-4831-9cfb-d5f233a1aaa9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityDomain.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityDomain >> then instantiate a {@link SecurityDomain} proxy.
     * 
     * @return a {@link SecurityDomain} proxy on the created {@link Class}.
     */
    @objid ("6f271421-7530-43a4-8555-b4d28dfd8732")
    public static SecurityDomain create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityDomain.STEREOTYPE_NAME);
        return SecurityDomain.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecurityDomain} proxy from a {@link Class} stereotyped << SecurityDomain >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SecurityDomain} proxy or <i>null</i>.
     */
    @objid ("828677d4-ebc4-421a-bee9-b6ce73fa0ee9")
    public static SecurityDomain instantiate(final Class obj) {
        return SecurityDomain.canInstantiate(obj) ? new SecurityDomain(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityDomain} proxy from a {@link Class} stereotyped << SecurityDomain >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SecurityDomain} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0a491f08-c2cb-46e1-b43a-880945eb8aad")
    public static SecurityDomain safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecurityDomain.canInstantiate(obj))
        	return new SecurityDomain(obj);
        else
        	throw new IllegalArgumentException("SecurityDomain: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'subDomains' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e6a1eaae-abd1-4adf-b886-4198837678ac")
    public void addSubDomains(final SecurityDomain obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, SecurityDomain.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(SecurityDomain.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("e2da7cc3-5119-4c69-b728-8e3ad82a7f93")
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
        SecurityDomain other = (SecurityDomain) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("0d8ab030-3615-4537-9a3e-8f77e68bcfe7")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2b4421f4-2138-4484-8214-81834cbbb863")
    public String getId() {
        return this.elt.getTagValue(SecurityDomain.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'subDomains' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4d066188-a62b-41af-b086-b53cecee700e")
    public List<SecurityDomain> getSubDomains() {
        List<SecurityDomain> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(SecurityDomain.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SecurityDomain.MdaTypes.MDAASSOCDEP_ROLE), "")
              && SecurityDomain.canInstantiate(d.getImpacted())) {
                 results.add((SecurityDomain)CamelDesignerProxyFactory.instantiate(d.getImpacted(), SecurityDomain.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("604384b4-d1c6-421b-88b2-67f0dad729bb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'subDomains' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("12b435af-c824-4ffd-8837-aceb25da38bc")
    public boolean removeSubDomains(final SecurityDomain obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(SecurityDomain.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityDomain.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7312d7e9-1494-42bc-b01e-4da90914cd56")
    public void setId(final String value) {
        this.elt.putTagValue(SecurityDomain.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    @objid ("c60de530-1a48-4c8d-ab79-a6d2f082e0b0")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("44926400-81f3-4de6-8e61-2da346cd0704")
    protected SecurityDomain(final Class elt) {
        super(elt);
    }

    @objid ("7f4f621d-eb07-4bdf-a3ff-518d7382ce87")
    public static final class MdaTypes {
        @objid ("9807aaaa-7765-4e95-ab94-f243650412f5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f8ccc56c-a60d-4434-a94e-c7ec81543e16")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("5e3f74cd-7dd3-4b1e-83ec-171398e12fd4")
        private static Stereotype MDAASSOCDEP;

        @objid ("6d71bde2-d18f-45ff-a413-b055bac4be3d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3ee1ce2c-7013-4d45-a7ed-edb168baba15")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1487e8d9-e360-40e9-85a2-46b131aa86ef");
            ID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c7e2415a-e07a-4b88-8369-3496216f8174");
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
