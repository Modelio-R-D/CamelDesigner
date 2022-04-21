/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << TypeModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1573d2fb-b10e-4c0a-bdc5-26ed12c40524")
public class TypeModelDiagram extends AbstractCamelDiagram {
    @objid ("e91d03b4-ac0d-4573-b2b6-4359618b7094")
    public static final String STEREOTYPE_NAME = "TypeModelDiagram";

    /**
     * Tells whether a {@link TypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << TypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("479bd85c-3f2f-4ced-9efb-15f2b841152c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, TypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << TypeModelDiagram >> then instantiate a {@link TypeModelDiagram} proxy.
     * 
     * @return a {@link TypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("ff65ea5c-6305-433b-8e23-5fd56b0fc777")
    public static TypeModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, TypeModelDiagram.STEREOTYPE_NAME);
        return TypeModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link TypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << TypeModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link TypeModelDiagram} proxy or <i>null</i>.
     */
    @objid ("1d29d17f-1e3d-4811-97ce-43c8b97a4117")
    public static TypeModelDiagram instantiate(final ClassDiagram obj) {
        return TypeModelDiagram.canInstantiate(obj) ? new TypeModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << TypeModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link TypeModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cf667a87-fb18-4e44-a539-8d42d7df78b0")
    public static TypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (TypeModelDiagram.canInstantiate(obj))
            return new TypeModelDiagram(obj);
        else
            throw new IllegalArgumentException("TypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c3295c11-98ce-43d2-86f1-44d3e21a6dae")
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
        TypeModelDiagram other = (TypeModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}.
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("6fbe334c-72be-4c1f-b5c7-a610321aef4a")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("80c20f7a-0ec4-4aea-b6c8-06a6cb0ca1de")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a8c56d0d-d911-4a2a-b83f-55619771a65c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("556ca59d-cbb4-4ee6-a65d-2561ffcd81ab")
    protected TypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("be25d91d-24c1-40f8-ab27-4d81ae2fa976")
    public static final class MdaTypes {
        @objid ("d706e11f-8cdb-479b-be72-28e1496f6a0e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("68018cd3-83ea-4ee0-b66d-80de6317ce52")
        private static Stereotype MDAASSOCDEP;

        @objid ("f50e666d-e287-4611-96b7-7ea400aa8e03")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0122adfc-5591-44d2-b225-d10951321734")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e909af8e-708a-490e-886c-55037a9674e1");
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
