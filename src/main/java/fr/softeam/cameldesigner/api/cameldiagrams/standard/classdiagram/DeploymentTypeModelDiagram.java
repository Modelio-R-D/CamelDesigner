/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("12fdd5fe-ebdc-4e4d-90e1-13798f0978cd")
    public static final String STEREOTYPE_NAME = "DeploymentTypeModelDiagram";

    /**
     * Tells whether a {@link DeploymentTypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a7f51f1f-59c6-46f7-8099-3e6f48d1c548")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >> then instantiate a {@link DeploymentTypeModelDiagram} proxy.
     * 
     * @return a {@link DeploymentTypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("e32fdb49-88f4-49c6-af9c-ad99dce9e4e0")
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
    @objid ("0ea597d4-a7fe-49ee-bfbd-756ff624f943")
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
    @objid ("d95469aa-4b48-45e6-a278-8d98184e1150")
    public static DeploymentTypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentTypeModelDiagram.canInstantiate(obj))
        	return new DeploymentTypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DeploymentTypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bfa65958-d62f-48cf-b8df-68cd17f76cf5")
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
    @objid ("3f2fa120-9143-441e-884e-6506bf2d8313")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("1d950ed7-582f-47c4-bfd2-0b3fdfe0c776")
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

    @objid ("86f36beb-787f-4fcb-b62b-b92754c01d6d")
    protected DeploymentTypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("e60b30af-a064-499b-bd68-785456b8cd45")
    public static final class MdaTypes {
        @objid ("76be5a28-bdb1-4550-918d-7e43b8a28e8f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("34687ca4-4e53-478d-b0cd-74bb68b66eb3")
        private static Stereotype MDAASSOCDEP;

        @objid ("e9bf1b15-2dba-4181-988b-008d23f335af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3f409605-ca80-4de2-ae4f-24b046b436c9")
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
