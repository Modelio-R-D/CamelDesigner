/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
public abstract class ConstraintModelDiagram extends AbstractCamelDiagram {
    @objid ("b3bafa6c-e0b0-42fc-9fc0-47bd07ea8bdd")
    public static final String STEREOTYPE_NAME = "ConstraintModelDiagram";

    /**
     * Tells whether a {@link ConstraintModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ConstraintModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("339779dc-ade8-4913-8bcc-815d9b2f838c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModelDiagram.STEREOTYPE_NAME));
    }

    @objid ("cc1f249c-9c9e-4a4f-8af8-9d8c4bd2e11a")
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
    @objid ("39504c0c-c97e-49d0-b8a1-2939e770ee80")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("debcbdfb-1c7f-43bf-9803-c1fdfd5daee6")
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

    @objid ("a0e9a15a-783b-40d3-916d-18917232d55a")
    protected ConstraintModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("f2dc5f5a-e2e0-4d73-94bc-bce60436b972")
    public static final class MdaTypes {
        @objid ("acd3bb15-751e-452e-9ff8-7c22a30cb057")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("31e921fe-ff19-4362-b778-fb7101340887")
        private static Stereotype MDAASSOCDEP;

        @objid ("7c26028e-0212-4782-9108-2f2fc63e64d7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ead2ff80-addd-4fe1-a8f6-9b3e5b4430db")
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
