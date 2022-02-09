/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
public class FeatureArtifact extends Feature {
    @objid ("0311a16b-832a-4f8f-b641-1f6f053237ac")
    public static final String STEREOTYPE_NAME = "Feature_Artifact";

    /**
     * Tells whether a {@link FeatureArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << Feature_Artifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("29712664-a093-44de-b047-e429dbe27e64")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureArtifact.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << Feature_Artifact >> then instantiate a {@link FeatureArtifact} proxy.
     * 
     * @return a {@link FeatureArtifact} proxy on the created {@link Artifact}.
     */
    @objid ("f8086f20-b49f-4c7e-a2df-9dfb8476c6d0")
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
    @objid ("fed90b37-3e37-4367-9aa9-ebd4a24c6fbc")
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
    @objid ("c2af281b-52a5-4b7a-a12c-23e5b392fd42")
    public static FeatureArtifact safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (FeatureArtifact.canInstantiate(obj))
        	return new FeatureArtifact(obj);
        else
        	throw new IllegalArgumentException("FeatureArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("23d8bd9c-bf50-43c9-a973-0e705880f820")
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
    @objid ("a033d805-d5bd-44a3-8239-3ebe76094200")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    @objid ("d4f888d3-5103-4f71-95a5-d248cad758ba")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("56fb0bed-1fd3-4fb0-9dd7-fccb576d5224")
    @Override
    public List<CamelElement> getChilds() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("c3750cf8-6d85-4830-bd02-ea1c287f07a3")
    protected FeatureArtifact(final Artifact elt) {
        super(elt);
    }

    @objid ("144f7a0e-24b5-41da-9329-9fb3109e4640")
    public static final class MdaTypes {
        @objid ("8b9d60b2-f6fa-401c-919d-632f3574fe3b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e7c0457b-45d5-49eb-b1fc-2025a3d5799e")
        private static Stereotype MDAASSOCDEP;

        @objid ("7217a0fc-1dbd-4fb8-9206-942c2f841b5f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0217a270-a507-4e63-9bc8-befd87e42335")
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
