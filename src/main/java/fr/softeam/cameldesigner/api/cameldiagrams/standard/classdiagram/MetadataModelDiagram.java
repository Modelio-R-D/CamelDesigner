/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("e4c9cc3a-6715-4df0-823f-1917bd245daf")
    public static final String STEREOTYPE_NAME = "MetadataModelDiagram";

    /**
     * Tells whether a {@link MetadataModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetadataModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2d95f8a9-78f4-4d3a-ad90-9897987f76cb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetadataModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetadataModelDiagram >> then instantiate a {@link MetadataModelDiagram} proxy.
     * 
     * @return a {@link MetadataModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("2c84cf01-9492-4cdb-ae74-c6d598667e45")
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
    @objid ("ae5b3dc7-4f1b-45f7-8686-367090c556e7")
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
    @objid ("2a3f414c-9568-44ee-a74e-d7477e3fab73")
    public static MetadataModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetadataModelDiagram.canInstantiate(obj))
        	return new MetadataModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetadataModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b3459b58-c9fd-4422-9657-d13f167f816f")
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
    @objid ("3bde6bce-07bd-4bef-adde-c7cd94e19320")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("03f24172-fe02-4229-b512-2c2a7e24e8ac")
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

    @objid ("bf183ec8-af08-440d-8559-194604e7fef8")
    protected MetadataModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("a698b7a7-3944-403a-99f0-89515053e6c9")
    public static final class MdaTypes {
        @objid ("1a421dcc-625d-49cb-a97d-7e8b05ff3e39")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7c6c9f64-344c-484b-a0cb-d0f0fefd3f43")
        private static Stereotype MDAASSOCDEP;

        @objid ("810a4296-2a96-42a9-8c16-09888fa27aa8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d6eb5e03-8760-400f-8019-e575e5680b65")
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
