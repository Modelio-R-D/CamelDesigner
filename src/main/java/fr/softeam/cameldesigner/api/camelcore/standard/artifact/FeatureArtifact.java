/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("3bcd978e-e31e-4672-a71b-9c23d6e94f49")
    public static final String STEREOTYPE_NAME = "Feature_Artifact";

    /**
     * Tells whether a {@link FeatureArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << Feature_Artifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b335020b-840b-46f1-8f45-96be9becb864")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureArtifact.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << Feature_Artifact >> then instantiate a {@link FeatureArtifact} proxy.
     * 
     * @return a {@link FeatureArtifact} proxy on the created {@link Artifact}.
     */
    @objid ("bda2e92f-10ea-4a8d-99d3-d2e6dce6f9f8")
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
    @objid ("ebc74264-9755-4b93-928c-6c4f151eabb6")
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
    @objid ("224d436c-6072-4fc3-a736-026d92befb0f")
    public static FeatureArtifact safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (FeatureArtifact.canInstantiate(obj))
        	return new FeatureArtifact(obj);
        else
        	throw new IllegalArgumentException("FeatureArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a1282195-0dc9-4bcc-8346-16e9561e89d1")
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
    @objid ("7358c2ab-6830-4870-ac4f-cc4e2ec1ab53")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    @objid ("a1cf40b1-950e-4cce-9b87-109d6086255a")
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

    @objid ("76a9c898-bb0d-4e86-bd9f-4d3079a8c782")
    protected FeatureArtifact(final Artifact elt) {
        super(elt);
    }

    @objid ("144f7a0e-24b5-41da-9329-9fb3109e4640")
    public static final class MdaTypes {
        @objid ("46d477a8-c18c-49d6-a6ed-ca7b34b98ace")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a6760a50-109b-4a08-911a-480b445c3587")
        private static Stereotype MDAASSOCDEP;

        @objid ("016c8f34-b5a6-4a85-be91-e964a2d0bf06")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b8304c88-d3da-4602-91f1-13e62151fac6")
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
