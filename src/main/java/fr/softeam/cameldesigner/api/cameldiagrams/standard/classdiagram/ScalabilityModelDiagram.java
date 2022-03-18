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
 * Proxy class to handle a {@link ClassDiagram} with << ScalabilityModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1aefa3bd-afe8-4cd0-8d7f-d240cb6f7cff")
public class ScalabilityModelDiagram extends AbstractCamelDiagram {
    @objid ("ed1ad39b-12d2-4503-97b2-e46170c9f75c")
    public static final String STEREOTYPE_NAME = "ScalabilityModelDiagram";

    /**
     * Tells whether a {@link ScalabilityModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ScalabilityModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2602af10-b2f2-46d5-8163-36d5ac422c80")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << ScalabilityModelDiagram >> then instantiate a {@link ScalabilityModelDiagram} proxy.
     * 
     * @return a {@link ScalabilityModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("1e9fb26f-bd2c-420b-84ed-be4582ccb67e")
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
    @objid ("8d47beae-3fe3-4895-91ee-83803fd27394")
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
    @objid ("f19a2cc1-bf84-435c-b8b6-7c718501ecff")
    public static ScalabilityModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ScalabilityModelDiagram.canInstantiate(obj))
        	return new ScalabilityModelDiagram(obj);
        else
        	throw new IllegalArgumentException("ScalabilityModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ffbb788c-c31c-483d-8d3a-f12d24a960f3")
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
    @objid ("30605613-394a-42b5-ac5d-5d730b9b7bb4")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("39e039c4-3031-44dd-af8d-a914c62319e4")
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

    @objid ("5d92e7ae-fa49-445d-b4c8-e5b677ffe6eb")
    protected ScalabilityModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("60219e4b-13d2-4abf-8e42-424d1c32a3ca")
    public static final class MdaTypes {
        @objid ("1326df45-fcfc-44e0-89da-069c1ab9c37f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f0567277-90c3-44c9-8020-0715dbbdeb0a")
        private static Stereotype MDAASSOCDEP;

        @objid ("e3605373-908a-43c4-975c-b7da7a6f8685")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("81c922e6-fb51-4c27-8eff-bc018f1e43d2")
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
