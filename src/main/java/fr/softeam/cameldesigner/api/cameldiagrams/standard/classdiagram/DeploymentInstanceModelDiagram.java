/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("5339af0a-bae7-4839-99e0-e5b1e2240e50")
    public static final String STEREOTYPE_NAME = "DeploymentInstanceModelDiagram";

    /**
     * Tells whether a {@link DeploymentInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ab25262e-5419-4691-9221-e4c7ccfea2f8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >> then instantiate a {@link DeploymentInstanceModelDiagram} proxy.
     * 
     * @return a {@link DeploymentInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("e73718f1-6276-4b78-b5c4-22d0fc93eee6")
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
    @objid ("b7349962-1259-4aad-9da2-6d591bb39652")
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
    @objid ("ed0ef9a5-9eb8-43dc-8270-fc6327d2ae53")
    public static DeploymentInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentInstanceModelDiagram.canInstantiate(obj))
        	return new DeploymentInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DeploymentInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b77c0668-ae9a-401e-9350-28ae8e7e75bd")
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
    @objid ("c4c4f6c4-c646-45b3-83af-d03714306eff")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("f7b0bab2-3df1-457e-924b-fb9c944518ce")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("25cf7ca5-0dc6-4236-8397-f5799db93171")
    protected DeploymentInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("72b3d4f2-38d1-4f0c-84c4-d4774033c64c")
    public static final class MdaTypes {
        @objid ("6a552fe2-ab57-4134-8495-4c8c7003d251")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("343ad575-9d7b-4a47-8f70-cf34d46c5182")
        private static Stereotype MDAASSOCDEP;

        @objid ("9935f22e-09ff-438c-aaaa-90ee337b3c27")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("65387081-b011-4b3f-817f-8d70f3c002ed")
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
