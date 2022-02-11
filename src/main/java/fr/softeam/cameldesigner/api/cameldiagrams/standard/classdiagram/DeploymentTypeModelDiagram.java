/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << DeploymentTypeModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("85540842-c7cb-455a-a265-21e99c9177ad")
public class DeploymentTypeModelDiagram extends AbstractCamelDiagram {
    @objid ("4cb3bfae-6e36-4460-8168-e78cea273dbf")
    public static final String STEREOTYPE_NAME = "DeploymentTypeModelDiagram";

    /**
     * Tells whether a {@link DeploymentTypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2a36f8f9-f99a-4dd5-b291-51cc9771e9cb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >> then instantiate a {@link DeploymentTypeModelDiagram} proxy.
     * 
     * @return a {@link DeploymentTypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("6f068cb6-8c3d-4af5-9e99-4eeada67242b")
    public static DeploymentTypeModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModelDiagram.STEREOTYPE_NAME);
        return DeploymentTypeModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link DeploymentTypeModelDiagram} proxy or <i>null</i>.
     */
    @objid ("da380824-f651-4dcb-a82c-b1a344c903ee")
    public static DeploymentTypeModelDiagram instantiate(final ClassDiagram obj) {
        return DeploymentTypeModelDiagram.canInstantiate(obj) ? new DeploymentTypeModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link DeploymentTypeModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c83eee71-515e-4816-bd1e-e8c8acf3c0d4")
    public static DeploymentTypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentTypeModelDiagram.canInstantiate(obj))
            return new DeploymentTypeModelDiagram(obj);
        else
            throw new IllegalArgumentException("DeploymentTypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5ece2ce1-b171-44d8-a6f6-75e398210151")
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
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("abf21106-6c5b-4a9e-814f-6d2ac4b2e09a")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("53243e0a-8d56-443f-9b41-6c21388ff320")
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

    @objid ("69102293-3c9d-48a1-84c0-5dcbde2906a7")
    protected DeploymentTypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("e60b30af-a064-499b-bd68-785456b8cd45")
    public static final class MdaTypes {
        @objid ("b9ee2a13-199f-408f-81bf-8ed63465706d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("48d489ac-9a0a-437d-a0bc-3202fecb6f7e")
        private static Stereotype MDAASSOCDEP;

        @objid ("0d94755f-38c1-4710-ac23-a8a3be944542")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ec0ccde-daec-4ab9-a8d8-0c4e02f35fd0")
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
