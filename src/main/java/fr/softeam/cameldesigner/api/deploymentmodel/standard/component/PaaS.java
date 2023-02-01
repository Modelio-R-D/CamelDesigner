/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << PaaS >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("de5fbae9-da70-4f9b-a638-28a7fd9062a1")
public class PaaS extends CamelComponent {
<<<<<<< HEAD
    @objid ("d7e8c82b-c70a-4a33-890e-52c9ee748eb0")
=======
    @objid ("b5b0015a-f05f-4d81-8fc4-54f520678528")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "PaaS";

    /**
     * Tells whether a {@link PaaS proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << PaaS >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("207a5001-c437-423f-8f30-b8f9e51bb933")
=======
    @objid ("993c2984-1fc1-4731-bf0d-33a8238076f7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaS.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << PaaS >> then instantiate a {@link PaaS} proxy.
     * 
     * @return a {@link PaaS} proxy on the created {@link Component}.
     */
<<<<<<< HEAD
    @objid ("8c0faa80-f911-4dee-a241-04c097e4652b")
=======
    @objid ("7252a91e-e832-45de-9d46-e87e72507b71")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PaaS create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Component");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaS.STEREOTYPE_NAME);
        return PaaS.instantiate((Component)e);
    }

    /**
     * Tries to instantiate a {@link PaaS} proxy from a {@link Component} stereotyped << PaaS >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Component
     * @return a {@link PaaS} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("5429bc6b-bfdb-4bef-afca-f97cdf7c1ff8")
=======
    @objid ("fadb7bcc-95e0-4bc8-9fad-b9deb8304e12")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PaaS instantiate(final Component obj) {
        return PaaS.canInstantiate(obj) ? new PaaS(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaS} proxy from a {@link Component} stereotyped << PaaS >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Component}
     * @return a {@link PaaS} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("140acb9f-2f9c-4374-9a11-39486d1e3a61")
=======
    @objid ("c8abe320-9208-4826-8e99-cf31c151e235")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PaaS safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (PaaS.canInstantiate(obj))
        	return new PaaS(obj);
        else
        	throw new IllegalArgumentException("PaaS: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("0e073e7d-b2d5-4b94-bcf7-77ddb0b50457")
=======
    @objid ("ed0c4e46-074d-4696-8a1a-e4bbaa8ce05e")
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
        PaaS other = (PaaS) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("3eb76f07-0c92-4094-a958-4ea81ebe0309")
=======
    @objid ("c1f99b3f-fe1c-4d97-859c-2459bd6af8be")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

<<<<<<< HEAD
    @objid ("83a3b9cf-b733-4906-8193-6790b6a6b218")
=======
    @objid ("b62e454d-8347-45f9-b7c0-769ec776cd51")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("03d17871-a8e1-4349-b0c5-dc57ec7631d3")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("d8381716-cd54-4b51-9100-50c321d0cb16")
=======
    @objid ("610e751c-299c-4d3d-8817-8877654d01b3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected PaaS(final Component elt) {
        super(elt);
    }

    @objid ("ebb4dcf9-28ac-415f-b6ab-19e64a2fd1da")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("31626ddc-673b-487a-b86b-767116ea8a39")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("df38847d-1b6f-49a3-80b2-9df966519ea9")
        private static Stereotype MDAASSOCDEP;

        @objid ("9aa833e1-13e7-490c-80d7-6d7253297219")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("78983bf3-511d-4fdb-8b2f-25a62ef26ede")
=======
        @objid ("dbe771b5-a606-48f1-901e-562a3c09184a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ac66742d-822b-4c25-998f-a5636b872663")
        private static Stereotype MDAASSOCDEP;

        @objid ("2e9b28e5-5cac-4dc8-876f-e8aa0393c5bc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("66c398ef-e1ca-4213-8a32-d622d006268d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d0c33c39-75b6-489b-be58-97166b99012b");
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
