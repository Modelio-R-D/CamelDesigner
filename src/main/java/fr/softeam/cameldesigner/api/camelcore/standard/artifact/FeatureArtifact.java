/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("d17cfed7-61a3-4347-83a2-7d9cd3e1ab61")
    public static final String STEREOTYPE_NAME = "Feature_Artifact";

    /**
     * Tells whether a {@link FeatureArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << Feature_Artifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d850be35-f926-4b0b-8f85-13a1a316f0b8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureArtifact.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << Feature_Artifact >> then instantiate a {@link FeatureArtifact} proxy.
     * 
     * @return a {@link FeatureArtifact} proxy on the created {@link Artifact}.
     */
    @objid ("42a819df-bc0a-4417-9dbc-51227882dae4")
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
    @objid ("adcc204e-fb5f-427e-bbbd-eece7c0426e4")
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
    @objid ("4d0c3209-6706-4059-8dd4-70750886152d")
    public static FeatureArtifact safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (FeatureArtifact.canInstantiate(obj))
        	return new FeatureArtifact(obj);
        else
        	throw new IllegalArgumentException("FeatureArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("894134d6-ffaa-48ae-b692-829140e3be2e")
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
    @objid ("eef2d8f0-7886-49e4-8647-67c2e0c36754")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    @objid ("9587fbed-af12-4ff5-a691-39b0689f63fe")
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

    @objid ("654bc3cb-696b-4b36-9a0c-4254ad19ce05")
    protected FeatureArtifact(final Artifact elt) {
        super(elt);
    }

    @objid ("144f7a0e-24b5-41da-9329-9fb3109e4640")
    public static final class MdaTypes {
        @objid ("90f9506f-af6d-4703-867b-12bf00ab656a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ca38044d-592e-4987-9866-9bd320161dee")
        private static Stereotype MDAASSOCDEP;

        @objid ("86ffe008-84f6-496c-b4af-2b23d96b3dee")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("18923a25-061b-46db-8a33-cdbadf2e6bc7")
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
