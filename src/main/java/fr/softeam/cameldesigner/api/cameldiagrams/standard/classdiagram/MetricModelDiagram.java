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
 * Proxy class to handle a {@link ClassDiagram} with << MetricModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("81ac3cd7-8152-40ff-a197-efdeebea3e78")
public class MetricModelDiagram extends AbstractCamelDiagram {
    @objid ("f8abe57a-428f-41f6-bc8d-ba52a5468c6a")
    public static final String STEREOTYPE_NAME = "MetricModelDiagram";

    /**
     * Tells whether a {@link MetricModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetricModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bae5b53b-0340-4994-bb5a-a8ef30377549")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetricModelDiagram >> then instantiate a {@link MetricModelDiagram} proxy.
     * 
     * @return a {@link MetricModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("d16cc99b-0d64-45af-9424-4b722c629db6")
    public static MetricModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricModelDiagram.STEREOTYPE_NAME);
        return MetricModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link MetricModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetricModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link MetricModelDiagram} proxy or <i>null</i>.
     */
    @objid ("35fa7abe-931f-493c-9693-e3ca0140b45d")
    public static MetricModelDiagram instantiate(final ClassDiagram obj) {
        return MetricModelDiagram.canInstantiate(obj) ? new MetricModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetricModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link MetricModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2d9073be-ee44-4b2d-a073-60b85cad9998")
    public static MetricModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetricModelDiagram.canInstantiate(obj))
            return new MetricModelDiagram(obj);
        else
            throw new IllegalArgumentException("MetricModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("581825ba-a76b-404e-b772-826070ab8e29")
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
        MetricModelDiagram other = (MetricModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}.
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("345fce10-6b75-4601-a94a-2f65dbe0e5f1")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("d5e350de-dcd0-4456-b6a6-fa248cdb991a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("aa755ca9-3bfd-40d6-a6e8-7a40b609ae27")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("a32fcf73-6c01-4e9f-b31a-d350d9e9dcd7")
    protected MetricModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("6ae7d73a-b368-4659-bddf-37a608de833c")
    public static final class MdaTypes {
        @objid ("ab48e1cd-78ee-47c0-98a1-6c26d61827ee")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("48c54d8e-42ea-4872-bf3f-a7d4517a1973")
        private static Stereotype MDAASSOCDEP;

        @objid ("2ec8bfe9-f00d-4731-ac90-3c6bc758cbd7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6f848ac8-cedc-4de4-ac59-a74e7a5d1f6f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "41062298-9e86-4073-b4a8-713719cfcf90");
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
