/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << CamelModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2c59f838-a1e2-4ac9-bf6c-e229175cc354")
public class CamelModelDiagram extends AbstractCamelDiagram {
    @objid ("e18b94ff-daee-4ebd-a305-ad40c252639a")
    public static final String STEREOTYPE_NAME = "CamelModelDiagram";

    /**
     * Tells whether a {@link CamelModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << CamelModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("97426f5b-4acb-48c0-8f7c-929d93232091")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << CamelModelDiagram >> then instantiate a {@link CamelModelDiagram} proxy.
     * 
     * @return a {@link CamelModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("cdf69721-b82f-4e30-8fcc-3293270be0c5")
    public static CamelModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelModelDiagram.STEREOTYPE_NAME);
        return CamelModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link CamelModelDiagram} proxy from a {@link ClassDiagram} stereotyped << CamelModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link CamelModelDiagram} proxy or <i>null</i>.
     */
    @objid ("fecbb203-86a5-4ad5-9fa4-2b1e130142c6")
    public static CamelModelDiagram instantiate(final ClassDiagram obj) {
        return CamelModelDiagram.canInstantiate(obj) ? new CamelModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CamelModelDiagram} proxy from a {@link ClassDiagram} stereotyped << CamelModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link CamelModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6287bb6a-d44a-4ad5-9bf0-320929b0e727")
    public static CamelModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (CamelModelDiagram.canInstantiate(obj))
        	return new CamelModelDiagram(obj);
        else
        	throw new IllegalArgumentException("CamelModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7932bd55-a9ba-4839-8bf3-0921cd8bddef")
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
        CamelModelDiagram other = (CamelModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("cba082a1-46f3-456e-baee-b84ffe4cb4c8")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("9372e486-cf98-492f-8f13-162a0890d8ad")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5b21fb26-6961-4938-af13-561334ff9a3d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("7bd821af-f248-4938-afd3-71b332661ada")
    protected CamelModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("4c4f1d52-c636-4b3b-a84c-7e0d2ad342f4")
    public static final class MdaTypes {
        @objid ("dd6ff8ab-acf0-4249-a568-c5487d2f7635")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a65103f7-931f-43e5-a535-fa0ce3ccdc99")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c26b8a4-458c-4368-bf78-f15465b3156c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e042f226-3329-4873-9b43-35e3debf6ec8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eec7381e-4c61-4f7c-9a1c-210f2fe38377");
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
