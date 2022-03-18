/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("6741160e-dcf6-4660-9699-217c2f4fac92")
    public static final String STEREOTYPE_NAME = "ConstraintModelDiagram";

    /**
     * Tells whether a {@link ConstraintModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ConstraintModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0d39aa78-fdc8-416b-afc7-fd5bceb18982")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << ConstraintModelDiagram >> then instantiate a {@link ConstraintModelDiagram} proxy.
     * 
     * @return a {@link ConstraintModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("10bbd3d5-0571-445a-a968-21d40f1e14d1")
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
    @objid ("f37efd27-e164-4a7d-a296-7308587c0611")
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
    @objid ("69b67210-1d0b-4550-b3b8-70adefa531f8")
    public static ConstraintModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ConstraintModelDiagram.canInstantiate(obj))
        	return new ConstraintModelDiagram(obj);
        else
        	throw new IllegalArgumentException("ConstraintModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("12b86c47-93ae-490a-bf32-9da704e8b54a")
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
    @objid ("c1c7d8c5-f981-4d3c-8b2d-0b6d8782a59f")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("c23531e3-5f81-4292-a201-a8ae93da2fd2")
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

    @objid ("9e205792-1d18-4ec2-8fd0-1304468eba0d")
    protected ConstraintModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("f2dc5f5a-e2e0-4d73-94bc-bce60436b972")
    public static final class MdaTypes {
        @objid ("a7d74a43-456d-4576-a252-55f9a0ea9e85")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0bcf77f8-a8d5-4c8a-9981-591f74ef5617")
        private static Stereotype MDAASSOCDEP;

        @objid ("a05c3c1d-045d-4184-bc4f-b95073a7e6c2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("79a62f34-7967-4fbf-894d-6e76e93c06e9")
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
