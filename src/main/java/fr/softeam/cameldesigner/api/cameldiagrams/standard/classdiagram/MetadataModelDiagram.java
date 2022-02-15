/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
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
    @objid ("0fadea79-b8e6-4a84-ad06-e704ca9dd3bf")
    public static final String STEREOTYPE_NAME = "MetadataModelDiagram";

    /**
     * Tells whether a {@link MetadataModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetadataModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d262eef8-a63d-4b47-b129-290ef6d81ea4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetadataModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetadataModelDiagram >> then instantiate a {@link MetadataModelDiagram} proxy.
     * 
     * @return a {@link MetadataModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("ad2fd912-bb1b-4998-b3fe-69444c3d7c9a")
    public static MetadataModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetadataModelDiagram.STEREOTYPE_NAME);
        return MetadataModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link MetadataModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetadataModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link MetadataModelDiagram} proxy or <i>null</i>.
     */
    @objid ("f58eeb73-6025-467e-83dd-a83e873459c5")
    public static MetadataModelDiagram instantiate(final ClassDiagram obj) {
        return MetadataModelDiagram.canInstantiate(obj) ? new MetadataModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetadataModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetadataModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link MetadataModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("42bceeaa-dc41-4f3b-b345-7d45296ee379")
    public static MetadataModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetadataModelDiagram.canInstantiate(obj))
        	return new MetadataModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetadataModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7ce410e3-5fa2-40ba-8e8b-5df04db55f17")
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
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("80d1dd00-5867-4de5-afb6-92186ba83f56")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("6a8c319a-15df-4f31-adc7-f215232696d1")
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

    @objid ("3580314c-f835-4bf2-8395-2e263eab29eb")
    protected MetadataModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("a698b7a7-3944-403a-99f0-89515053e6c9")
    public static final class MdaTypes {
        @objid ("ed31f1af-75ef-4bca-84be-48f034b0d705")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("65ecbcda-063e-47a9-9e9c-5059244eb64d")
        private static Stereotype MDAASSOCDEP;

        @objid ("3dea9c34-6110-4253-9dd1-2676cabcc0a1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f54b354b-84f0-44d6-b60f-ede0a1de82d9")
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
