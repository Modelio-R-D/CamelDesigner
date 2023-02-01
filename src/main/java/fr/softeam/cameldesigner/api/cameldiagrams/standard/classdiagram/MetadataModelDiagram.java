/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("047da75b-a7b5-438f-8a0b-d284bc26bc0a")
=======
    @objid ("1e5e1036-3ccf-4b11-989d-974757268846")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "MetadataModelDiagram";

    /**
     * Tells whether a {@link MetadataModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetadataModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("ade39560-ba9e-4c3d-bce5-82d8e3267264")
=======
    @objid ("24bc2523-ccb4-409b-9969-d222bf379ea3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetadataModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetadataModelDiagram >> then instantiate a {@link MetadataModelDiagram} proxy.
     * 
     * @return a {@link MetadataModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("4875385b-a0a3-4ea6-8467-518dfa0f7686")
=======
    @objid ("76b1affd-d7a0-4671-b870-f2ff6c6e51d1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f7961460-b36e-4b20-9a95-9d4d2914a0ed")
=======
    @objid ("3a9e870f-ab14-4040-b97c-b74b32ec2d09")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e5dbb3d2-6f31-409d-8f6b-4a475d4c5223")
=======
    @objid ("11625870-fe9b-4c38-9808-21e347494a76")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static MetadataModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetadataModelDiagram.canInstantiate(obj))
        	return new MetadataModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetadataModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("071f8bce-1bb7-4219-a67b-90aa0a61c466")
=======
    @objid ("98b33690-d1c0-4b27-aee9-9975eee3aa9a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3e83ba2c-ca9c-4348-9034-221872315f56")
=======
    @objid ("962062b8-dc98-40d5-8b25-09fda99db46f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("ec2572c4-dd39-4ded-b2cc-97172a95cfd7")
=======
    @objid ("131e5a43-1bed-439a-9a06-18767c0bb33e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("d2e538e2-6ffe-42b0-927a-d048844af239")
=======
    @objid ("f3cfd146-3a3c-49e3-9022-dd85e19ce12a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MetadataModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("a698b7a7-3944-403a-99f0-89515053e6c9")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("ccfcfb43-ae8e-440b-b5d8-8e3ee4fa30c5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e93bc095-0ad3-44b6-a95e-b6b7cd33f0a1")
        private static Stereotype MDAASSOCDEP;

        @objid ("49f15e18-66fd-44f1-9726-5ba5373863a7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2e80835a-4720-4aed-aafc-aeae1f569277")
=======
        @objid ("74053bc7-ef99-42bf-98e5-85fec3c4838f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("102a8734-80ff-40ee-aa1f-6d2df6c8cabd")
        private static Stereotype MDAASSOCDEP;

        @objid ("6cc24de6-78d9-409c-8688-ed42acf9b752")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8aaa8263-c415-4ae0-90ca-acb9aa60e54e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
