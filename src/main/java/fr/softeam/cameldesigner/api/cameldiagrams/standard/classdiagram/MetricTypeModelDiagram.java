/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << MetricTypeModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("81ac3cd7-8152-40ff-a197-efdeebea3e78")
public class MetricTypeModelDiagram extends AbstractCamelDiagram {
    @objid ("f9c5c079-4f6c-43ed-aef2-d57e593b04ef")
    public static final String STEREOTYPE_NAME = "MetricTypeModelDiagram";

    /**
     * Tells whether a {@link MetricTypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetricTypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3df4204b-9483-4668-9656-ceaf57dd9354")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetricTypeModelDiagram >> then instantiate a {@link MetricTypeModelDiagram} proxy.
     * 
     * @return a {@link MetricTypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("5ada21ea-5b5f-4a90-9ded-5a3c6ff70d1f")
    public static MetricTypeModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModelDiagram.STEREOTYPE_NAME);
        return MetricTypeModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link MetricTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetricTypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link MetricTypeModelDiagram} proxy or <i>null</i>.
     */
    @objid ("5a960145-f1ad-4413-8fdb-9077f814de78")
    public static MetricTypeModelDiagram instantiate(final ClassDiagram obj) {
        return MetricTypeModelDiagram.canInstantiate(obj) ? new MetricTypeModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetricTypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link MetricTypeModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6c17b3e4-4a74-4cc8-8e0f-3458b51daece")
    public static MetricTypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetricTypeModelDiagram.canInstantiate(obj))
        	return new MetricTypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetricTypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0239f7d1-62fd-424e-893d-4996854b0c1b")
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
        MetricTypeModelDiagram other = (MetricTypeModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("116f9810-be5a-4ed0-aa40-3c487a34441b")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("7dacfd55-6159-47d8-856e-f31c6efe4c73")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("aa755ca9-3bfd-40d6-a6e8-7a40b609ae27")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("4868a2ac-a626-4472-85f9-22afa81d78f8")
    protected MetricTypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("6ae7d73a-b368-4659-bddf-37a608de833c")
    public static final class MdaTypes {
        @objid ("fb84f866-4791-47ea-bb4c-c544636ad9b6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cbb41194-5be4-4aab-9f91-a9e74335623e")
        private static Stereotype MDAASSOCDEP;

        @objid ("5ffb01f4-8e46-45d6-a91d-329dabfe54e3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("168ab975-0195-49b7-84c8-8b79f4283017")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "41062298-9e86-4073-b4a8-713719cfcf90");
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
