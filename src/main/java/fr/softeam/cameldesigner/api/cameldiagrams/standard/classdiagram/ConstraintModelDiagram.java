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
 * Proxy class to handle a {@link ClassDiagram} with << ConstraintModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("73ef4e61-0be5-40e6-8c65-2c42095a3cd4")
public class ConstraintModelDiagram extends AbstractCamelDiagram {
    @objid ("a5af14bd-0bde-4c87-8e03-de5d721395fc")
    public static final String STEREOTYPE_NAME = "ConstraintModelDiagram";

    /**
     * Tells whether a {@link ConstraintModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ConstraintModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b6d786d5-3511-496f-9b8e-5dedcc2b2179")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << ConstraintModelDiagram >> then instantiate a {@link ConstraintModelDiagram} proxy.
     * 
     * @return a {@link ConstraintModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("bbe5a4cc-deea-4341-b3ef-baacafe481e9")
    public static ConstraintModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModelDiagram.STEREOTYPE_NAME);
        return ConstraintModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ConstraintModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ConstraintModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link ConstraintModelDiagram} proxy or <i>null</i>.
     */
    @objid ("e89d6bce-7bff-4d3a-8b08-3295f75c161f")
    public static ConstraintModelDiagram instantiate(final ClassDiagram obj) {
        return ConstraintModelDiagram.canInstantiate(obj) ? new ConstraintModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConstraintModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ConstraintModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link ConstraintModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f03ca48b-ef0d-4d79-8675-02f3035b57e5")
    public static ConstraintModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ConstraintModelDiagram.canInstantiate(obj))
            return new ConstraintModelDiagram(obj);
        else
            throw new IllegalArgumentException("ConstraintModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("80ffb53d-31e6-4354-b855-725c604a86ac")
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
        ConstraintModelDiagram other = (ConstraintModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}.
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("f0e87be4-9d09-4232-ad84-7305f6a0a0ce")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("b8322edb-4c0c-4eb1-807f-a9a0eecf0c53")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("33fa4d4c-9389-4a86-94bf-0a9a3fdf92f5")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("152bec3e-23ae-4250-b4db-c032d42f1ecc")
    protected ConstraintModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("f2dc5f5a-e2e0-4d73-94bc-bce60436b972")
    public static final class MdaTypes {
        @objid ("27813096-82dc-434d-b4d5-978c3be74d65")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0a22dee7-7de0-4573-bd02-ab27438abc8c")
        private static Stereotype MDAASSOCDEP;

        @objid ("c6f5fbe6-522c-488e-8add-4c2365badf12")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1cab539b-1884-46ad-9f34-ea20978bd413")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "62499a4d-4037-4aef-bb40-8b5495465a22");
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
