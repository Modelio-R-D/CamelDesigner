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
    @objid ("ed22665f-7a4f-440c-8e12-611dece5239b")
    public static final String STEREOTYPE_NAME = "SecurityDomain";

    @objid ("003aeb8f-1cd0-44f9-a338-78aca27b3ee2")
    public static final String ID_TAGTYPE = "id";

    /**
     * Tells whether a {@link SecurityDomain proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityDomain >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bafd46bf-34e9-40a9-98bd-71be644343d1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityDomain.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityDomain >> then instantiate a {@link SecurityDomain} proxy.
     * 
     * @return a {@link SecurityDomain} proxy on the created {@link Class}.
     */
    @objid ("c5021e84-4815-4987-8780-2e052dbd45db")
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
    @objid ("83f64487-5a69-4d34-9a6f-8693075bac62")
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
    @objid ("bea0d2d0-ae9d-4a89-88c5-a76d84920ff6")
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
    @objid ("1babf56b-0875-4d28-89dd-0551383eaf1b")
    public void addSubDomains(final SecurityDomain obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, SecurityDomain.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(SecurityDomain.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("598d3525-2044-497c-aa2f-b6696234928f")
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
    @objid ("7c6b858c-5f97-4efa-b387-d0116731a378")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("153cdb5a-2993-4196-8af4-15be10c3eda9")
    public String getId() {
        return this.elt.getTagValue(SecurityDomain.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'subDomains' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3433317d-be13-430b-97c4-53ac78327a9a")
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

    @objid ("4228df0d-efcb-4462-941d-5c282f62c1a2")
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
    @objid ("3ec6902c-2fbc-4ab1-a9db-e06dabed9387")
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
    @objid ("d9bd9a5d-2430-4117-9bcb-0ce2f2832a91")
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

    @objid ("3396e83d-c4cc-45f4-b0e9-6baa39084896")
    protected SecurityDomain(final Class elt) {
        super(elt);
    }

    @objid ("7f4f621d-eb07-4bdf-a3ff-518d7382ce87")
    public static final class MdaTypes {
        @objid ("a834876f-d569-4fe3-9290-e3c40e0e8552")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ec33fe16-df37-4abb-9b73-7c5639c01120")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("f39b263e-c96d-4c47-897c-833599edec5a")
        private static Stereotype MDAASSOCDEP;

        @objid ("96abe6fc-9195-4eda-9300-5be0c8e1d8ee")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("90de28de-e720-421d-8440-6fed69ade726")
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
