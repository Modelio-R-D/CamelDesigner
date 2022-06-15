/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("f3ed47af-ffeb-4467-876c-922c3a5ac29a")
    public static final String STEREOTYPE_NAME = "SecurityDomain";

    @objid ("3a6c3451-e1b6-4a7b-aca0-bd1aa6219ce9")
    public static final String ID_TAGTYPE = "id";

    /**
     * Tells whether a {@link SecurityDomain proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityDomain >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bceed1f9-f947-4eec-a172-c3aa4f00a5a5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityDomain.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityDomain >> then instantiate a {@link SecurityDomain} proxy.
     * 
     * @return a {@link SecurityDomain} proxy on the created {@link Class}.
     */
    @objid ("c02e4389-dba0-43e7-a125-bb0d6adfd1a9")
    public static SecurityDomain create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityDomain.STEREOTYPE_NAME);
        return SecurityDomain.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecurityDomain} proxy from a {@link Class} stereotyped << SecurityDomain >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link SecurityDomain} proxy or <i>null</i>.
     */
    @objid ("a6480ba5-b70a-42c3-8f3a-de54bec5cbf1")
    public static SecurityDomain instantiate(final Class obj) {
        return SecurityDomain.canInstantiate(obj) ? new SecurityDomain(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityDomain} proxy from a {@link Class} stereotyped << SecurityDomain >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link SecurityDomain} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("97ae9dc9-da26-4934-bffb-13d33d3cb850")
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
     */
    @objid ("52b29911-fd65-4918-8e88-42c33925d69a")
    public void addSubDomains(final SecurityDomain obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, SecurityDomain.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(SecurityDomain.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("82cee329-de6d-4d5c-8889-d15775dbacc7")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("cfcc984e-db56-4eed-b21e-31f329e5780a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8609e7a1-f8aa-4a18-81dc-c10f5090f6a2")
    public String getId() {
        return this.elt.getTagValue(SecurityDomain.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'subDomains' role.<p>
     * Role description:
     * null
     */
    @objid ("57a4d1eb-e71f-45e6-93a6-e22d851b6e02")
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

    @objid ("2f987ce9-b7a1-48d1-a791-72f507d0c633")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'subDomains' role.<p>
     * Role description:
     * null
     */
    @objid ("1965b806-1086-44ae-ba72-e6835f6e26f9")
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
    @objid ("a9ff5e48-b2e4-4026-96c0-b912151c617e")
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

    @objid ("38675813-5cf1-4a07-8108-099ca0f095e2")
    protected SecurityDomain(final Class elt) {
        super(elt);
    }

    @objid ("7f4f621d-eb07-4bdf-a3ff-518d7382ce87")
    public static final class MdaTypes {
        @objid ("2588d8cc-5540-4f06-8ff6-ad10c8c7c1a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("92955ec8-337f-48d7-acf3-8ae9f94afe67")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("7414fb72-5d9a-4f3d-b232-849a7bddfbbc")
        private static Stereotype MDAASSOCDEP;

        @objid ("9cd5d796-0ec0-497d-a2cc-8641ca45ba63")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c183dc9c-0779-4334-9c0a-d4c62f7e308c")
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
