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
<<<<<<< HEAD
    @objid ("5dc9a143-a633-49af-9d35-701758cc025c")
    public static final String STEREOTYPE_NAME = "SecurityDomain";

    @objid ("18612092-eb55-4f98-a605-7f93a56cfbab")
=======
    @objid ("6ca4431d-d768-4370-88fb-322b16733b43")
    public static final String STEREOTYPE_NAME = "SecurityDomain";

    @objid ("2f25525b-ff53-40ec-8bb6-48a9a663072f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String ID_TAGTYPE = "id";

    /**
     * Tells whether a {@link SecurityDomain proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityDomain >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("11089588-38f4-4208-8281-5bad030eb1cb")
=======
    @objid ("7ff1ac0b-6f69-4a1d-b662-9dcbc0d96774")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityDomain.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityDomain >> then instantiate a {@link SecurityDomain} proxy.
     * 
     * @return a {@link SecurityDomain} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("8736587c-5e46-42ae-809e-5be67de021ce")
=======
    @objid ("190d018a-55e9-459b-ba67-104c0b6ac4f7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ad3d6abf-4236-427d-95c7-37f6ae780c2d")
=======
    @objid ("6729404b-35ef-4eaf-bb17-e0905b5799e9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("483aa49a-91a3-4b55-9279-0e5f9305f6f1")
=======
    @objid ("08083a07-8431-40a0-8121-9fd74ed4b8b2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0add159e-fcc7-4e8e-b260-f2e194e20970")
=======
    @objid ("a51cc372-fc60-4e17-8c95-07cfa10a6acb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSubDomains(final SecurityDomain obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, SecurityDomain.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(SecurityDomain.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

<<<<<<< HEAD
    @objid ("646f1953-a639-48f8-b24f-299b1f24fedb")
=======
    @objid ("b80a19f4-70f4-4ca0-a995-29f59add0fc1")
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
        SecurityDomain other = (SecurityDomain) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("9c4ba0cc-a65d-4ad3-ab6d-e8efa5f1e1e1")
=======
    @objid ("7f13eb0a-ba2a-4766-94ff-e1bb0dc4b34b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("c50d5673-4b05-47a1-9c08-9b4d19eb708a")
=======
    @objid ("fe198e64-943f-4180-88e2-7fccb650aaf8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getId() {
        return this.elt.getTagValue(SecurityDomain.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'subDomains' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("4806da82-66f7-43fd-be04-71866bdf8ea0")
=======
    @objid ("72ba7075-8d52-481e-94a0-9e3e60f1b5a6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("9f00c893-4bc5-4325-bb33-5a69fb25adf6")
=======
    @objid ("926ee567-267d-4067-bfbd-c42729056dd6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("65d44450-e28a-4b8d-ac98-b291802915cc")
=======
    @objid ("4403a6a8-4d77-4372-9afa-1967e03142b5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d1f632d6-80be-4d9f-9373-974542cb41c1")
=======
    @objid ("84bf8b52-cfe3-4121-ac60-1bf67ab060e1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("d56392b7-5cd8-4e2c-ba27-db44fa802bef")
=======
    @objid ("30ffa7a8-e8c9-4cfe-8946-cafa9ec7bb4b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected SecurityDomain(final Class elt) {
        super(elt);
    }

    @objid ("7f4f621d-eb07-4bdf-a3ff-518d7382ce87")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("97e4e848-41c6-42dd-ab8b-6364e1c19b90")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2ebd9aff-43a8-4ae8-a0f0-b401e25f3d73")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("868d5117-9292-4cbf-99c6-f8fb6dfa6bc3")
        private static Stereotype MDAASSOCDEP;

        @objid ("1bd974a1-957a-490f-ad3d-34f2ff692a5b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2551fdcf-d145-40ba-9a3c-d8a888459668")
=======
        @objid ("fb6b0239-b883-42a6-a9ef-a8ea0b948d95")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d86f7ff0-8443-46ef-a9da-2a80095786fd")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("bea50040-ae65-4676-bcc6-571b47e48d12")
        private static Stereotype MDAASSOCDEP;

        @objid ("1f536652-8e2b-4c76-b8b4-abbff2f79d37")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("401b5022-009b-486a-a57e-8446bf70dd74")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
