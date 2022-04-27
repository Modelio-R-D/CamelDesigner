/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.artifact.FeatureArtifact;
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
 * Proxy class to handle a {@link Artifact} with << Configuration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ff4bc201-76db-4377-a971-521d2953d0c0")
public abstract class Configuration extends FeatureArtifact {
    @objid ("ec06cc32-69ca-428d-8652-ce3bb61b2a00")
    public static final String STEREOTYPE_NAME = "Configuration";

    /**
     * Tells whether a {@link Configuration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << Configuration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4f13c22d-b3c3-42bd-9883-5a6f06a9632b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Configuration.STEREOTYPE_NAME));
    }

    @objid ("90a1af6a-707b-44b0-918a-bfc142b1e836")
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
        Configuration other = (Configuration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("ef737445-f764-4f1d-8bb7-548a553a27b9")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    @objid ("9e292bb2-2fc0-416a-9ed2-ef4f153118b5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c1aff3ed-63aa-43bd-935d-6abf1015ba26")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("adf52d36-8e2b-415c-b729-8e39259fde85")
    protected Configuration(final Artifact elt) {
        super(elt);
    }

    @objid ("58dae9c3-74db-4b4e-9dad-cd23280e68db")
    public static final class MdaTypes {
        @objid ("e569e276-435b-42af-8d6a-77ef6808f32c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3f38f964-0612-4a4a-85c0-7ead032176cd")
        private static Stereotype MDAASSOCDEP;

        @objid ("37b806d6-59f2-462c-915e-c047bfe3ca18")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("618e819f-4e6c-476d-84d6-c319890ca2cb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "24d6edfb-e2bf-4e67-8c56-b051b479f16d");
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
