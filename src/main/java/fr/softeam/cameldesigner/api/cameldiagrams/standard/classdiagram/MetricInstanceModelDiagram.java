/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << MetricInstanceModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9ab01658-74ff-4529-a699-43a56ff85f89")
public class MetricInstanceModelDiagram extends AbstractCamelDiagram {
    @objid ("ed085a72-8531-4af8-be15-694905a5d61f")
    public static final String STEREOTYPE_NAME = "MetricInstanceModelDiagram";

    /**
     * Tells whether a {@link MetricInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetricInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8b2eb246-0087-4d4d-8796-2c2ac7f27f58")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetricInstanceModelDiagram >> then instantiate a {@link MetricInstanceModelDiagram} proxy.
     * 
     * @return a {@link MetricInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("eff0c4d0-1bd7-42fd-b1b3-550d50be1e4a")
    public static MetricInstanceModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModelDiagram.STEREOTYPE_NAME);
        return MetricInstanceModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link MetricInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetricInstanceModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link MetricInstanceModelDiagram} proxy or <i>null</i>.
     */
    @objid ("6eb68495-ee64-4c15-b802-d0428454837d")
    public static MetricInstanceModelDiagram instantiate(final ClassDiagram obj) {
        return MetricInstanceModelDiagram.canInstantiate(obj) ? new MetricInstanceModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetricInstanceModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link MetricInstanceModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("77908ff7-428d-4c7b-925a-dbc8e47d4b91")
    public static MetricInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetricInstanceModelDiagram.canInstantiate(obj))
        	return new MetricInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetricInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5d7d1008-1328-4d79-a531-d848782422ce")
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
        MetricInstanceModelDiagram other = (MetricInstanceModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("748a82a2-b3a8-41ec-be90-75142b162d9a")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("a82df4c5-de04-44a1-a45f-fad62b7498f7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d6ce6c22-48c5-41a9-bbd3-ebfedcc26c00")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("b0df525d-83c2-4385-86d8-763815d462f3")
    protected MetricInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("fc2c7267-7f74-46f7-b3bd-834db7b8d63d")
    public static final class MdaTypes {
        @objid ("09b735e5-d34c-42f0-b238-f8ce90454151")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f7d37524-cc89-4127-93f0-54a9f4bef135")
        private static Stereotype MDAASSOCDEP;

        @objid ("552b4a1c-c534-4883-a426-972470e1f9ac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ef691324-2fe2-4a14-ac73-1673a4484ef3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9acac5e4-9e57-4c77-9274-f1d0aa426dad");
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
