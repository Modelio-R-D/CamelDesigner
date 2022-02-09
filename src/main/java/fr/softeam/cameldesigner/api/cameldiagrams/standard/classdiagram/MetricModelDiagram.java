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
 * Proxy class to handle a {@link ClassDiagram} with << MetricModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("81ac3cd7-8152-40ff-a197-efdeebea3e78")
public class MetricModelDiagram extends AbstractCamelDiagram {
    @objid ("b423c7c0-e7eb-4167-bcdc-260e0277b9a6")
    public static final String STEREOTYPE_NAME = "MetricModelDiagram";

    /**
     * Tells whether a {@link MetricModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetricModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("904dd71e-2eb6-48dd-92f0-f6c2d8313dde")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetricModelDiagram >> then instantiate a {@link MetricModelDiagram} proxy.
     * 
     * @return a {@link MetricModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("2b67f064-0cda-4747-a192-b6950c078510")
    public static MetricModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricModelDiagram.STEREOTYPE_NAME);
        return MetricModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link MetricModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetricModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link MetricModelDiagram} proxy or <i>null</i>.
     */
    @objid ("ca6092e6-fad9-42d8-8054-fdf9e5e0499a")
    public static MetricModelDiagram instantiate(final ClassDiagram obj) {
        return MetricModelDiagram.canInstantiate(obj) ? new MetricModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetricModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link MetricModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c7eae212-3144-4a69-ae58-cdaa6aaad816")
    public static MetricModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetricModelDiagram.canInstantiate(obj))
        	return new MetricModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetricModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e85ed149-562b-464b-b80b-572dc64ac289")
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
        MetricModelDiagram other = (MetricModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("1cbe652c-6c09-46cf-aa8d-467c397c5e59")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("f1531a02-842c-4d9a-af96-eab7fa40956b")
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

    @objid ("a2f72ea3-6aa9-4d50-9008-f593e20b795b")
    protected MetricModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("6ae7d73a-b368-4659-bddf-37a608de833c")
    public static final class MdaTypes {
        @objid ("e3ec19a3-2948-4570-bcd1-d2465b3003a9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("39896eef-80bf-4eed-b129-07f83633087c")
        private static Stereotype MDAASSOCDEP;

        @objid ("a95f8d6c-fd41-4c36-b170-383b29261767")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d54bfb9b-90a0-47f7-996d-7720eb121783")
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
