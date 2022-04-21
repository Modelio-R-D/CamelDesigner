/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("a0d1d918-0828-4e20-ba80-726e7053d6b7")
    public static final String STEREOTYPE_NAME = "Configuration";

    /**
     * Tells whether a {@link Configuration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << Configuration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5f8977c7-591f-4863-ad59-0a17f6a2750e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Configuration.STEREOTYPE_NAME));
    }

    @objid ("14af6b7e-1882-4e93-89e5-b17e9045cf45")
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
     * 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("72392efa-83eb-4009-9902-378e634894ec")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    @objid ("9f0d216d-5102-4544-8695-b24225a12fa5")
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

    @objid ("927cfae3-d343-4f19-99c2-5789dc86587c")
    protected Configuration(final Artifact elt) {
        super(elt);
    }

    @objid ("58dae9c3-74db-4b4e-9dad-cd23280e68db")
    public static final class MdaTypes {
        @objid ("025acd8b-8e5a-4c4c-9729-4583965d9872")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4065b4ba-99ec-4c9a-a371-25d4f6c1f7cd")
        private static Stereotype MDAASSOCDEP;

        @objid ("d8aa5f5f-1e1f-4b44-9855-53d1eae06af2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a16bbe60-74a9-4935-aa0b-a13e6eff7974")
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
