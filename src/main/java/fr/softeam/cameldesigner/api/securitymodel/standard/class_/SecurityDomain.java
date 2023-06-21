/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("f6f1720a-d1c9-444d-ad94-548ac9db4358")
    public static final String STEREOTYPE_NAME = "SecurityDomain";

    @objid ("b581382c-18d4-4712-9ecc-fea889d25fe0")
    public static final String ID_TAGTYPE = "id";

    /**
     * Tells whether a {@link SecurityDomain proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityDomain >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("44ae8127-2d55-4477-87e9-f60e95b6760c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityDomain.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityDomain >> then instantiate a {@link SecurityDomain} proxy.
     * 
     * @return a {@link SecurityDomain} proxy on the created {@link Class}.
     */
    @objid ("007696ff-d0cc-42bf-bc58-676a8fb80d70")
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
    @objid ("1c2521e1-26d4-4bdf-93bc-795761c9174d")
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
    @objid ("1963e878-b01a-4f1b-bc56-aab67d056172")
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
    @objid ("35d4df23-cc04-493d-8305-cad0fd372d92")
    public void addSubDomains(final SecurityDomain obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, SecurityDomain.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(SecurityDomain.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("52693052-28bd-4f62-9f12-b0f1b885ceff")
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
    @objid ("7d1ed662-a818-4d65-b9e3-3631339fa41f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("24803513-4e81-435d-83db-33e4b8bd77fd")
    public String getId() {
        return this.elt.getTagValue(SecurityDomain.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'subDomains' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("004610d3-5aab-4c7f-82de-1027bbe2c005")
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

    @objid ("311db7f2-06e0-453a-a9a7-783a3e9594e5")
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
    @objid ("c9ba043a-1dd7-4934-a69d-57f5f3282854")
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
    @objid ("65fa2193-dd25-4c99-bb11-0200aa2d4cd6")
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

    @objid ("1e457910-73e1-49c3-a99d-39391d08882d")
    protected SecurityDomain(final Class elt) {
        super(elt);
    }

    @objid ("7f4f621d-eb07-4bdf-a3ff-518d7382ce87")
    public static final class MdaTypes {
        @objid ("41cab57a-9043-4195-83f9-307132c11fb0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("63ebfb5a-e9da-4bd8-bafd-d888b659b6f7")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("6114045b-a29f-494b-82f5-94eff7a4ae14")
        private static Stereotype MDAASSOCDEP;

        @objid ("7dee5509-23a1-4ccd-8d66-1f36608766e2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3b8651ba-c94b-4bb8-a593-b2e546ef22d4")
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
