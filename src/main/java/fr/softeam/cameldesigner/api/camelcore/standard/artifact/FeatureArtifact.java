/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("83550b35-7496-4d5e-a0c7-3a85b68f33ad")
    public static final String STEREOTYPE_NAME = "Feature_Artifact";

    /**
     * Tells whether a {@link FeatureArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << Feature_Artifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2de2bb29-9826-4482-b3f8-206acc693702")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureArtifact.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << Feature_Artifact >> then instantiate a {@link FeatureArtifact} proxy.
     * 
     * @return a {@link FeatureArtifact} proxy on the created {@link Artifact}.
     */
    @objid ("73f7e51c-5eed-47d1-ab92-e4b4eab376ec")
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
    @objid ("d78bdd1e-e2fd-4c74-ba67-6783b1553c4b")
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
    @objid ("e6c945ba-95c5-472a-91b7-c642798ea68d")
    public static FeatureArtifact safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (FeatureArtifact.canInstantiate(obj))
        	return new FeatureArtifact(obj);
        else
        	throw new IllegalArgumentException("FeatureArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3f24ce41-474b-4b93-9812-2b8d7e1e779b")
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
    @objid ("7ec4188c-c605-46cd-80bb-544c9d4585cc")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    @objid ("912101a7-8d54-4c20-87ea-2288e9a28a77")
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

    @objid ("c50196ee-adb5-4453-907b-bc1f535006b4")
    protected FeatureArtifact(final Artifact elt) {
        super(elt);
    }

    @objid ("144f7a0e-24b5-41da-9329-9fb3109e4640")
    public static final class MdaTypes {
        @objid ("6e08f950-1fbc-4e7a-ab05-dd088aae23d8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2f2dba1e-5e35-4edc-9040-f3b5ae65e1d5")
        private static Stereotype MDAASSOCDEP;

        @objid ("5da702d9-5ef3-4963-b82d-5fe3b14aea80")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e9e60581-6fb7-4b92-95c2-92280316838e")
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
