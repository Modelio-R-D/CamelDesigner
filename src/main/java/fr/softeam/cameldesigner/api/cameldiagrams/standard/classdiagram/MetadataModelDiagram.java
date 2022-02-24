/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("138c0606-35d7-4f08-9485-dc1bdc61b33c")
    public static final String STEREOTYPE_NAME = "MetadataModelDiagram";

    /**
     * Tells whether a {@link MetadataModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetadataModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("81e08a8d-7998-4fe8-8ca7-6e858ad68b84")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetadataModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetadataModelDiagram >> then instantiate a {@link MetadataModelDiagram} proxy.
     * 
     * @return a {@link MetadataModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("7ac83fe6-5953-4edf-8280-f350386033c7")
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
    @objid ("43340b1e-ecc6-41c9-b9d3-2d532a425bf7")
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
    @objid ("f911efd9-22a4-4cd7-92eb-890f40a8d9b3")
    public static MetadataModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetadataModelDiagram.canInstantiate(obj))
        	return new MetadataModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetadataModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("69d9ed47-5881-4301-b636-278b5581a12f")
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
    @objid ("534f6937-a057-4b50-bc06-eaa5acf2fef4")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("7b36796f-4de8-4881-bcc5-5954af54ea70")
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

    @objid ("63bd4e6a-45d2-4868-91c3-d0d483ccb031")
    protected MetadataModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("a698b7a7-3944-403a-99f0-89515053e6c9")
    public static final class MdaTypes {
        @objid ("c57cef9d-2cab-40be-98fb-a3a48f8c0b01")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e68812e-f5d1-4d2a-9758-6e25ba938402")
        private static Stereotype MDAASSOCDEP;

        @objid ("cd9f9e46-c3ac-4f7f-9299-d3cc7b51a5e0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0e11b801-c84c-4514-8c2e-c2647cc7fcb9")
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
