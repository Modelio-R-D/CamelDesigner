/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram.AbstractCamelDiagram;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << DeploymentModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("521b0969-4165-486f-b27c-bc7f8ca18689")
public class DeploymentModelDiagram extends AbstractCamelDiagram {
    @objid ("06ea6384-3e36-435b-944f-17fade2d7578")
    public static final String STEREOTYPE_NAME = "DeploymentModelDiagram";

    /**
     * Tells whether a {@link DeploymentModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("18550c8f-209e-44a9-874d-c4948d50cbca")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentModelDiagram >> then instantiate a {@link DeploymentModelDiagram} proxy.
     * 
     * @return a {@link DeploymentModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("53f4b923-623e-4613-b676-f5d131c27a11")
    public static DeploymentModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModelDiagram.STEREOTYPE_NAME);
        return DeploymentModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link DeploymentModelDiagram} proxy or <i>null</i>.
     */
    @objid ("55d6e7fe-5a92-4061-8e57-549b37edccf0")
    public static DeploymentModelDiagram instantiate(final ClassDiagram obj) {
        return DeploymentModelDiagram.canInstantiate(obj) ? new DeploymentModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link DeploymentModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7b7053c5-02d6-473e-971e-746efdeae5fa")
    public static DeploymentModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentModelDiagram.canInstantiate(obj))
            return new DeploymentModelDiagram(obj);
        else
            throw new IllegalArgumentException("DeploymentModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a8f2fc57-a715-4bd0-b073-afbca007e5bb")
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
        DeploymentModelDiagram other = (DeploymentModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}.
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("e217ef71-4e9b-487b-bb89-f76f42019e43")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("a648ad61-a0c6-434d-ab38-cb69cfdbc427")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ce08e29f-84f8-4f07-8ad7-178c2397f4a9")
    protected DeploymentModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("b6a47337-27b1-460b-a2a6-9ecfdcd6d483")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("5eb9fee6-fdcc-4cde-980d-62efa3176e66")
    public static final class MdaTypes {
        @objid ("21535c11-0e93-46f9-ae2b-c9ca35b0b1c8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e4f8cb0-f805-45f2-bde2-e326d2739c54")
        private static Stereotype MDAASSOCDEP;

        @objid ("96be8766-80ea-460e-ab9b-b1fea5dbbd8b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7c8fed6d-ab2e-404b-97a8-136627328af7")
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
