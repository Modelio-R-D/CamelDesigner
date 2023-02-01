/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.classifier.FeatureClassifier;
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
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link GeneralClass} with << Requirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cd14264b-97fa-49a6-bb0d-db04d8c66386")
public abstract class Requirement extends FeatureClassifier {
<<<<<<< HEAD
    @objid ("f18a481d-f48f-4299-8222-5521f3f04b48")
=======
    @objid ("1497240b-9fa3-4466-a759-84d2e410241f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Requirement";

    /**
     * Tells whether a {@link Requirement proxy} can be instantiated from a {@link MObject} checking it is a {@link GeneralClass} stereotyped << Requirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("bd9125d7-a83c-48ec-852a-16e50186a1c8")
=======
    @objid ("7ab72ca0-517d-49e4-ae24-a1c12de47075")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof GeneralClass) && ((GeneralClass) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Requirement.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("b39572ae-61cf-425a-a51c-03a1632418ce")
=======
    @objid ("372a0e0d-5b12-47d7-843f-3d2b950c7781")
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
        Requirement other = (Requirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link GeneralClass}. 
     * @return the GeneralClass represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("20ba80b4-6a4b-42cb-abf2-0de2b4b782b8")
=======
    @objid ("45dfaa1b-35a0-4bb5-b455-c5f9bfcb36d5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

<<<<<<< HEAD
    @objid ("08744f45-1e75-45c7-86e3-cb1b58b5dd14")
=======
    @objid ("74ee9e17-f27e-49c8-a5e3-b662dc90ec02")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("64b5d0d5-2198-4b77-947e-424962858e5a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("37566d1a-001e-40e1-9a11-8de8917dcf00")
=======
    @objid ("b6737d4e-58bd-44a6-9cc9-9c24742f77bb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Requirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("d168a813-2ca0-4031-921a-6b0cec2ba4ee")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("eb0b260e-452e-421f-b41e-d3d2a6591020")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6b088fda-46db-4621-9a27-f81099b7f31b")
        private static Stereotype MDAASSOCDEP;

        @objid ("830dcd8a-0173-4691-a06f-4e5cb2885ecc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("019ea4f0-064c-45fd-9f35-d7259fb2be47")
=======
        @objid ("335f84d3-fc29-4ed3-b9d7-6a62817232fb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3d434eac-102f-44b9-8616-24b5bfed3c6a")
        private static Stereotype MDAASSOCDEP;

        @objid ("06ee7bb2-5421-4293-a7e1-9e6c6654aa13")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ed8b2234-f3fc-472d-85f4-843b7f8ef991")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f14398cc-a1c7-4953-9874-f7819f1ec4f7");
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
