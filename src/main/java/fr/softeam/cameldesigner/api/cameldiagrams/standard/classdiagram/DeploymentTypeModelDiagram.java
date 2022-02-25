/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
 * Proxy class to handle a {@link ClassDiagram} with << DeploymentTypeModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("85540842-c7cb-455a-a265-21e99c9177ad")
public class DeploymentTypeModelDiagram extends AbstractCamelDiagram {
    @objid ("93f1b48e-8360-4eed-86e1-9bf9659ea25c")
    public static final String STEREOTYPE_NAME = "DeploymentTypeModelDiagram";

    /**
     * Tells whether a {@link DeploymentTypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("353b61ae-ad83-4f70-afb7-16bea5a91c68")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >> then instantiate a {@link DeploymentTypeModelDiagram} proxy.
     * 
     * @return a {@link DeploymentTypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("fb1331be-2d8e-4fb2-953d-89f562b72a1a")
    public static DeploymentTypeModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModelDiagram.STEREOTYPE_NAME);
        return DeploymentTypeModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DeploymentTypeModelDiagram} proxy or <i>null</i>.
     */
    @objid ("8129765d-ae52-4ba1-871f-387a6275a989")
    public static DeploymentTypeModelDiagram instantiate(final ClassDiagram obj) {
        return DeploymentTypeModelDiagram.canInstantiate(obj) ? new DeploymentTypeModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DeploymentTypeModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3a938937-83bf-4cc8-98eb-ddafb90e5ad0")
    public static DeploymentTypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentTypeModelDiagram.canInstantiate(obj))
        	return new DeploymentTypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DeploymentTypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0545e599-297e-424d-8350-b27cbd3e2b6c")
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
        DeploymentTypeModelDiagram other = (DeploymentTypeModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("8ce285a3-b849-4f95-9928-5676cc54f836")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("e2231870-7706-4fa1-8446-018e820278b0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b3f28108-2455-4167-a3c8-972abb68f87e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("26d237af-355d-4dca-9dd5-30067c2b1227")
    protected DeploymentTypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("e60b30af-a064-499b-bd68-785456b8cd45")
    public static final class MdaTypes {
        @objid ("709447d3-d804-42d5-a170-9616ea61194f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("20809329-097a-4260-b507-5262987160e5")
        private static Stereotype MDAASSOCDEP;

        @objid ("e6a5e577-eaf8-446b-b76e-11c9c6cdb4aa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6df3916d-0c34-449d-852e-12e7e2e0f3a4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b78ff0fe-e31c-4034-ba6a-7a3d0626819e");
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
