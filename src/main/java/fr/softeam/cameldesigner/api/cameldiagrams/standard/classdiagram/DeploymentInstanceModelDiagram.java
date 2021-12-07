/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << DeploymentInstanceModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6fd7b5a7-b73c-415c-ab39-55c9e11e486f")
public class DeploymentInstanceModelDiagram extends AbstractCamelDiagram {
    @objid ("51501ac2-d87c-4c62-9055-1db50d14577a")
    public static final String STEREOTYPE_NAME = "DeploymentInstanceModelDiagram";

    /**
     * Tells whether a {@link DeploymentInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f84ff4c3-b74e-4ee3-b8e1-1077a08fdb8b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >> then instantiate a {@link DeploymentInstanceModelDiagram} proxy.
     * 
     * @return a {@link DeploymentInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("b7d16069-5586-49fa-8c8a-9a3004d8b6d2")
    public static DeploymentInstanceModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModelDiagram.STEREOTYPE_NAME);
        return DeploymentInstanceModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link DeploymentInstanceModelDiagram} proxy or <i>null</i>.
     */
    @objid ("e3b65112-98bf-4cf8-86ed-f6c5c97b23ad")
    public static DeploymentInstanceModelDiagram instantiate(final ClassDiagram obj) {
        return DeploymentInstanceModelDiagram.canInstantiate(obj) ? new DeploymentInstanceModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link DeploymentInstanceModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6eb05de1-5681-4303-887f-5429eed9e2ba")
    public static DeploymentInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentInstanceModelDiagram.canInstantiate(obj))
            return new DeploymentInstanceModelDiagram(obj);
        else
            throw new IllegalArgumentException("DeploymentInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("da54fbe6-67de-4ad7-8a83-74d506af3656")
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
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("35a01adf-3aa3-4970-a9a6-1af802f620f0")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("16143e91-b35c-4c47-8a11-db2f48eb64f9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f8a39abb-9b66-44f8-8fd6-486243af16a6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("84038fad-eb42-4408-a7c3-1aa624034273")
    protected DeploymentInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("0bfc75d0-b76a-457e-97ed-fdd6345d2858")
    public static final class MdaTypes {
        @objid ("897ea5fb-82df-4895-87bd-7fb1cea72c41")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9203a633-18d8-4f91-b120-804a663d47a5")
        private static Stereotype MDAASSOCDEP;

        @objid ("89f55957-918c-4573-a2bd-7cb0d898db99")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("37f35716-4053-43f8-a49b-a402905c97da")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a10a5950-4d32-42b8-8ee7-f596192afb1d");
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
