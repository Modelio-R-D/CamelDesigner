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
 * Proxy class to handle a {@link ClassDiagram} with << MetadataModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9d27b61c-9964-415b-8763-d664a1036a71")
public class MetadataModelDiagram extends AbstractCamelDiagram {
    @objid ("90d9ce27-f44b-4620-b840-6c0c8becd961")
    public static final String STEREOTYPE_NAME = "MetadataModelDiagram";

    /**
     * Tells whether a {@link MetadataModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetadataModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8a42dd15-4535-4d17-93a6-81fbb7d13ddc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetadataModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetadataModelDiagram >> then instantiate a {@link MetadataModelDiagram} proxy.
     * 
     * @return a {@link MetadataModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("15c7d54b-0d2c-4721-aeb9-4cd6816bb31c")
    public static MetadataModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetadataModelDiagram.STEREOTYPE_NAME);
        return MetadataModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link MetadataModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetadataModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link MetadataModelDiagram} proxy or <i>null</i>.
     */
    @objid ("d319d9a0-3840-4be3-8952-280ac38dff61")
    public static MetadataModelDiagram instantiate(final ClassDiagram obj) {
        return MetadataModelDiagram.canInstantiate(obj) ? new MetadataModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetadataModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetadataModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link MetadataModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fa8a2952-0148-46af-a3f0-7f96ed843186")
    public static MetadataModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetadataModelDiagram.canInstantiate(obj))
            return new MetadataModelDiagram(obj);
        else
            throw new IllegalArgumentException("MetadataModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e169a1c8-5481-489f-8fa8-6f836239ddb7")
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
        MetadataModelDiagram other = (MetadataModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}.
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("f18467f1-6b18-46a0-b47e-94f3fa0966fe")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("3419bdbc-60d6-4602-bbd5-4fb47bb6b38f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("df618576-5dc1-4e7b-8402-6c5920cb0936")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("e2504b10-f2eb-4d8d-acd4-f6aa3f0f7cf4")
    protected MetadataModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("a698b7a7-3944-403a-99f0-89515053e6c9")
    public static final class MdaTypes {
        @objid ("123b78d6-f042-4307-a329-e8ab0ee77d3c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("00ff26c9-0ad0-44b0-b520-a36cfb7fa028")
        private static Stereotype MDAASSOCDEP;

        @objid ("fd268b5d-ca4a-4a5b-91e3-e6e8c87033fd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d7327fec-f6af-49e1-881b-f7eed444aba4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "409ebd0d-ecd3-4a8a-95f0-0080c7137e1c");
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
