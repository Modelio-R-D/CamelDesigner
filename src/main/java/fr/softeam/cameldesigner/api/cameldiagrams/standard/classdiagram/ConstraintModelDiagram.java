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
 * Proxy class to handle a {@link ClassDiagram} with << ConstraintModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("73ef4e61-0be5-40e6-8c65-2c42095a3cd4")
public class ConstraintModelDiagram extends AbstractCamelDiagram {
    @objid ("c18122d3-a19d-495e-a449-fe3ac01d1199")
    public static final String STEREOTYPE_NAME = "ConstraintModelDiagram";

    /**
     * Tells whether a {@link ConstraintModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ConstraintModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("91b71517-1081-4106-bf9f-e6a48c9c828d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << ConstraintModelDiagram >> then instantiate a {@link ConstraintModelDiagram} proxy.
     * 
     * @return a {@link ConstraintModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("d5c1606a-0e13-41df-b923-1f92d09a39df")
    public static ConstraintModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModelDiagram.STEREOTYPE_NAME);
        return ConstraintModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ConstraintModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ConstraintModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link ConstraintModelDiagram} proxy or <i>null</i>.
     */
    @objid ("0671aad0-93f4-4122-aeb9-78cc9c775065")
    public static ConstraintModelDiagram instantiate(final ClassDiagram obj) {
        return ConstraintModelDiagram.canInstantiate(obj) ? new ConstraintModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConstraintModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ConstraintModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link ConstraintModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a1e21216-b27d-450d-8211-450415848749")
    public static ConstraintModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ConstraintModelDiagram.canInstantiate(obj))
        	return new ConstraintModelDiagram(obj);
        else
        	throw new IllegalArgumentException("ConstraintModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2e3107d4-6030-4382-81a0-40edbe7d28b2")
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
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("35fe66d1-3924-4717-ac56-e021560bddfd")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("03e0a3ea-dfa2-44bd-9b52-fbc2b75cf7a8")
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

    @objid ("87dd7c4f-5167-4f61-8b29-c52df2d6141c")
    protected ConstraintModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("f2dc5f5a-e2e0-4d73-94bc-bce60436b972")
    public static final class MdaTypes {
        @objid ("7243b837-da45-4b2f-ba7d-a04a5ed3fe02")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c9873efe-7a56-4cc4-bc4a-0f0dbfcb2822")
        private static Stereotype MDAASSOCDEP;

        @objid ("97999658-053e-403a-960d-028d8d4a2c3c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6e4a7073-9ed5-45e8-8168-7d6022141f62")
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
