/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << ScalabilityModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1aefa3bd-afe8-4cd0-8d7f-d240cb6f7cff")
public class ScalabilityModelDiagram extends AbstractCamelDiagram {
    @objid ("cfb6bd45-3188-4d64-8445-41afc4df2774")
    public static final String STEREOTYPE_NAME = "ScalabilityModelDiagram";

    /**
     * Tells whether a {@link ScalabilityModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ScalabilityModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5d428ddc-3124-425f-85a6-e395a8bdc213")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << ScalabilityModelDiagram >> then instantiate a {@link ScalabilityModelDiagram} proxy.
     * 
     * @return a {@link ScalabilityModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("105b7e0e-2493-4b12-8c58-6af4929326bb")
    public static ScalabilityModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModelDiagram.STEREOTYPE_NAME);
        return ScalabilityModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ScalabilityModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ScalabilityModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link ScalabilityModelDiagram} proxy or <i>null</i>.
     */
    @objid ("3db0e0c5-989c-45ef-be61-97cbc841844a")
    public static ScalabilityModelDiagram instantiate(final ClassDiagram obj) {
        return ScalabilityModelDiagram.canInstantiate(obj) ? new ScalabilityModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ScalabilityModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ScalabilityModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link ScalabilityModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7cb393b3-ec94-4120-a32e-76f2aa218024")
    public static ScalabilityModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ScalabilityModelDiagram.canInstantiate(obj))
        	return new ScalabilityModelDiagram(obj);
        else
        	throw new IllegalArgumentException("ScalabilityModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b2037cb5-e3e4-44b6-a752-a6a55f9c6805")
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
        ScalabilityModelDiagram other = (ScalabilityModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("2812e4b2-ae84-47d8-b2b7-ea26bcfd4dde")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("b6ae9220-83c0-4fe9-b3df-9523b2e409a2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b3f2a943-56cf-4715-8563-7eb2ecddfa8c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("20f5cc6b-fb84-471b-8588-48f6a0e3e3d1")
    protected ScalabilityModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("60219e4b-13d2-4abf-8e42-424d1c32a3ca")
    public static final class MdaTypes {
        @objid ("3beb9d2d-a414-4dd3-aa00-1acbf170f2a1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("96b595d1-ffeb-47c9-8a05-3c3b4944028a")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ad52d37-e48f-48c0-95fa-002ccde5d490")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ba524463-2564-4e55-9dbf-4aa72cc7d7b8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7f111587-b577-4533-9e55-41832442bd71");
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
