/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("b8f9f8a6-252e-4f2c-8a4e-9daf0f9cb89e")
    public static final String STEREOTYPE_NAME = "DeploymentInstanceModelDiagram";

    /**
     * Tells whether a {@link DeploymentInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("afe0163c-1a52-4345-8e71-7b2273039040")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >> then instantiate a {@link DeploymentInstanceModelDiagram} proxy.
     * 
     * @return a {@link DeploymentInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("325d36bd-2811-45c3-90b3-66e9afd5d360")
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
    @objid ("7d5017ad-f0d5-4fd3-aef1-598228d40a9f")
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
    @objid ("a2b1c6a2-866d-4b76-abd8-3e4cc4f94634")
    public static DeploymentInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentInstanceModelDiagram.canInstantiate(obj))
        	return new DeploymentInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DeploymentInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d9baa158-f946-4905-a6ae-101b487355bb")
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
    @objid ("cf33fe98-0684-4f2b-8bd8-9279163f1a56")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("2fa2eb29-aba9-4993-9834-ef00aedc78a0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("45caf4ad-bf9d-4fbe-82fa-9629ddbfe10c")
    protected DeploymentInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("72b3d4f2-38d1-4f0c-84c4-d4774033c64c")
    public static final class MdaTypes {
        @objid ("fcf740a2-4b9d-4554-9114-5fb0bfe587c2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("83c377e5-5678-4bf5-b7ad-bc29051b9e50")
        private static Stereotype MDAASSOCDEP;

        @objid ("16d9d37a-8da2-4630-ad17-e3d74419bfde")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("10e3f464-4a0f-4b87-aca9-94a4b06fe432")
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
