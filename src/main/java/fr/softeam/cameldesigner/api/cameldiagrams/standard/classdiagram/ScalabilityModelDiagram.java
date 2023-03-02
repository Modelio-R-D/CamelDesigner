/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
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
    @objid ("ed93c6ba-f9ee-4736-8c1b-312fc019fbf6")
    public static final String STEREOTYPE_NAME = "ScalabilityModelDiagram";

    /**
     * Tells whether a {@link ScalabilityModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ScalabilityModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a4993bd4-278b-4d63-a1c3-24430898cba2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << ScalabilityModelDiagram >> then instantiate a {@link ScalabilityModelDiagram} proxy.
     * 
     * @return a {@link ScalabilityModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("7e60c1ce-8fff-488e-a7e0-60680b62c2b7")
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
    @objid ("4309f23b-afdc-4f29-9074-4ce29bb77660")
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
    @objid ("8a4977c5-ef96-4906-9476-02ae4b30f906")
    public static ScalabilityModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ScalabilityModelDiagram.canInstantiate(obj))
        	return new ScalabilityModelDiagram(obj);
        else
        	throw new IllegalArgumentException("ScalabilityModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("44fe3e48-3aaf-4e72-b2d9-9b13ed3fcaa9")
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
    @objid ("5909fe22-0bb6-4e01-8c4b-d3af7775c2fd")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("40103137-4cc4-4ed8-a256-0d604719f618")
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

    @objid ("13b9c658-75ad-4602-b311-ca64b7a20b3a")
    protected ScalabilityModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("60219e4b-13d2-4abf-8e42-424d1c32a3ca")
    public static final class MdaTypes {
        @objid ("ffc58f62-7562-49fd-9cbc-4ecf242b2211")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ab912ca0-75cf-4d91-8179-3e0fcf46dc99")
        private static Stereotype MDAASSOCDEP;

        @objid ("7004786d-52ad-4ba8-a640-58afddb09b92")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3df0b1c1-fa92-4465-b1e2-d10758063346")
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
