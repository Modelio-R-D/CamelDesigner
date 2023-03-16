/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("464b45c5-c66e-4721-9d8d-e5f76a6ce0a4")
    public static final String STEREOTYPE_NAME = "DeploymentTypeModelDiagram";

    /**
     * Tells whether a {@link DeploymentTypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cd12fd00-95bf-4d06-8493-679407d376c5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >> then instantiate a {@link DeploymentTypeModelDiagram} proxy.
     * 
     * @return a {@link DeploymentTypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("81bedcaf-25d2-456d-b929-62e0fc918e25")
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
    @objid ("8c0f4aba-523c-4cd5-82ff-33c5ad0f4498")
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
    @objid ("af6e3b58-d6f3-4d36-97cd-c2ccf1f34296")
    public static DeploymentTypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentTypeModelDiagram.canInstantiate(obj))
        	return new DeploymentTypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DeploymentTypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("562737d9-6710-450c-b3d2-0c23da7d95b8")
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
    @objid ("63bb4e95-40db-47b6-bc43-121d704f55e7")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("cda6a90c-59bf-41f2-bcd6-e8f0c66e1aec")
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

    @objid ("8e065e37-d263-4b73-a476-7abb4824e8b8")
    protected DeploymentTypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("e60b30af-a064-499b-bd68-785456b8cd45")
    public static final class MdaTypes {
        @objid ("f7a6b567-a790-4ad2-9f5f-eef8d70175e5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d52a8a48-3275-44d0-8492-582718a84283")
        private static Stereotype MDAASSOCDEP;

        @objid ("6e60573e-576e-466f-a2f4-f7d020a3afb9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e7628ebf-2059-4777-968b-74ce9e3f3315")
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
