/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("7003cf5e-ed8b-4d65-b170-0a6bea484305")
    public static final String STEREOTYPE_NAME = "Configuration";

    /**
     * Tells whether a {@link Configuration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << Configuration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d80a2759-d877-4417-9ac3-2d3ad590edc4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Configuration.STEREOTYPE_NAME));
    }

    @objid ("dcf83a0a-deed-4237-af8a-8c38c37a3e1c")
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
    @objid ("d978d367-b7ca-46ba-91c2-871ba7f3d78e")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    @objid ("222bf351-fae0-4634-ae99-1eaf3d829a99")
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

    @objid ("16d32133-6ade-474b-a447-6cc996f9be28")
    protected Configuration(final Artifact elt) {
        super(elt);
    }

    @objid ("58dae9c3-74db-4b4e-9dad-cd23280e68db")
    public static final class MdaTypes {
        @objid ("aeeffa49-9888-4d2d-a020-23e1da3862d6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("23e477cd-cecb-4c55-9cba-cb235db1adb0")
        private static Stereotype MDAASSOCDEP;

        @objid ("68d44af3-bb04-4d00-9b27-5813a7da5ef9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f02f1e9d-dedb-4557-a9b5-e057e2b55c08")
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
