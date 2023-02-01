/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.camelcore.standard.artifact;

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
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << Feature_Artifact >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c53cf713-fc4f-4cff-9d81-f11d85440927")
public class FeatureArtifact extends FeatureClassifier {
<<<<<<< HEAD
    @objid ("5da430e0-4557-4cd2-b164-3c6c96caeb9e")
=======
    @objid ("e2efc961-aff4-4e98-a723-9767ba5c2417")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Feature_Artifact";

    /**
     * Tells whether a {@link FeatureArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << Feature_Artifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("7d7663a0-883d-4d87-9592-99458571bf34")
=======
    @objid ("29029932-b31f-4f18-b232-c1c53916e624")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureArtifact.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << Feature_Artifact >> then instantiate a {@link FeatureArtifact} proxy.
     * 
     * @return a {@link FeatureArtifact} proxy on the created {@link Artifact}.
     */
<<<<<<< HEAD
    @objid ("a1753c64-ba25-4bbd-8969-73c67130c3c4")
=======
    @objid ("df122f53-c685-401f-a193-ed792b89e329")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureArtifact create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureArtifact.STEREOTYPE_NAME);
        return FeatureArtifact.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link FeatureArtifact} proxy from a {@link Artifact} stereotyped << Feature_Artifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link FeatureArtifact} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("d14288e4-95a1-4a38-a902-f251d0cf954e")
=======
    @objid ("bfd913ee-a0fd-414a-b53f-e651351abb9c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureArtifact instantiate(final Artifact obj) {
        return FeatureArtifact.canInstantiate(obj) ? new FeatureArtifact(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureArtifact} proxy from a {@link Artifact} stereotyped << Feature_Artifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link FeatureArtifact} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("ed999288-e971-4fa0-b36b-325961c67199")
=======
    @objid ("4f797d7a-3c0e-49fd-99d9-56808c27c7b3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureArtifact safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (FeatureArtifact.canInstantiate(obj))
        	return new FeatureArtifact(obj);
        else
        	throw new IllegalArgumentException("FeatureArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("47b5d9df-38ca-4a7f-886d-e5b7753135ea")
=======
    @objid ("b8d4e97a-4865-4239-a037-bbe142626936")
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
        FeatureArtifact other = (FeatureArtifact) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("02233444-c8b8-4db1-91d8-40409ee6ff8a")
=======
    @objid ("76ee2f40-017b-4bd6-a468-6dae870ccc49")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

<<<<<<< HEAD
    @objid ("d042596d-2fbe-4393-ba71-ab64f1c57f49")
=======
    @objid ("0fd68402-a768-4ad7-8106-59d03b027d99")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("56fb0bed-1fd3-4fb0-9dd7-fccb576d5224")
    @Override
    public List<CamelElement> getChilds() {
        java.util.List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("bd38ee5b-a84e-4f88-a27d-a91ae8a1d460")
=======
    @objid ("afd33cc7-88fa-425c-98a4-55aea1c6e943")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected FeatureArtifact(final Artifact elt) {
        super(elt);
    }

    @objid ("144f7a0e-24b5-41da-9329-9fb3109e4640")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("93c11669-5594-4f59-be32-011d4148b3db")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ea8ca495-c477-48fb-865d-9fb74715707e")
        private static Stereotype MDAASSOCDEP;

        @objid ("a4cc6482-6a54-4558-8eec-9162421c2b3b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("71780517-8728-4dbb-83ec-d0c60594d728")
=======
        @objid ("c37fa9f0-9c64-40ec-b0b4-a01fdfbc40e7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("155ebe01-d246-4ecb-8d8f-86175682b573")
        private static Stereotype MDAASSOCDEP;

        @objid ("50287c78-1c81-4acf-b067-97565d8beb25")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a32739d4-c498-4850-ac05-ac1d5e6e0d90")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4fc85f6a-6ece-4e79-b662-e20cb7f28cea");
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
