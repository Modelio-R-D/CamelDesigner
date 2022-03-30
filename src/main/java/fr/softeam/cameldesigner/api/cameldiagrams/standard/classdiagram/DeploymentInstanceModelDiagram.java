/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram.AbstractCamelDiagram;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << DeploymentInstanceModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f39da6fd-91a2-4ed4-b469-cf9c80c56e9c")
public class DeploymentInstanceModelDiagram extends AbstractCamelDiagram {
    @objid ("ba37e310-852e-435c-a0e5-7e4674250e8d")
    public static final String STEREOTYPE_NAME = "DeploymentInstanceModelDiagram";

    /**
     * Tells whether a {@link DeploymentInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1fbe6b8b-0e55-4a88-98f5-09f5ce5c4440")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >> then instantiate a {@link DeploymentInstanceModelDiagram} proxy.
     * 
     * @return a {@link DeploymentInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("59bfa17d-8990-41cc-b333-4fc6ad789f52")
    public static DeploymentInstanceModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModelDiagram.STEREOTYPE_NAME);
        return DeploymentInstanceModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DeploymentInstanceModelDiagram} proxy or <i>null</i>.
     */
    @objid ("8cf72b44-8b52-41ad-b79e-e67a96b5ecdd")
    public static DeploymentInstanceModelDiagram instantiate(final ClassDiagram obj) {
        return DeploymentInstanceModelDiagram.canInstantiate(obj) ? new DeploymentInstanceModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DeploymentInstanceModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b43493f5-869c-49b6-bb16-d5eb51def1c9")
    public static DeploymentInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentInstanceModelDiagram.canInstantiate(obj))
        	return new DeploymentInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DeploymentInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0072e607-4c1c-467e-9a75-30373609d766")
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
        DeploymentInstanceModelDiagram other = (DeploymentInstanceModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("c4a3f677-ed5d-4f24-aae2-205c242d58a9")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("8d3e65b4-e5c1-4492-a443-b2401b630caf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9518ceef-a097-4cb1-a2a9-7ee50f8f2779")
    protected DeploymentInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("72b3d4f2-38d1-4f0c-84c4-d4774033c64c")
    public static final class MdaTypes {
        @objid ("5f363f78-0c33-4d1b-b126-8e82dcecec46")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ae503a45-1cf6-4886-b70e-d97885257cee")
        private static Stereotype MDAASSOCDEP;

        @objid ("2a244b31-9fd6-4485-ae7d-0f2861d2d8e4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b80ccbe8-5275-4bb3-8d25-729556adff42")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b5ff2f96-fb60-424e-ae18-02b24209d1af");
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
