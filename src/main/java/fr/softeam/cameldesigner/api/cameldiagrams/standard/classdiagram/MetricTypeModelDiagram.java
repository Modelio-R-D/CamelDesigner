/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("93b43476-3787-4432-90fb-e126984fe4ba")
    public static final String STEREOTYPE_NAME = "MetricTypeModelDiagram";

    /**
     * Tells whether a {@link MetricTypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetricTypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f3521442-d21c-4404-a294-ee7c6323287b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetricTypeModelDiagram >> then instantiate a {@link MetricTypeModelDiagram} proxy.
     * 
     * @return a {@link MetricTypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("be97bd58-fdc1-422f-9f77-5c682768c2e3")
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
    @objid ("deaa8e4c-c3c1-4494-b8ec-40c9b08fd249")
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
    @objid ("18886b55-512d-47a0-b005-ace59f3a026c")
    public static MetricTypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetricTypeModelDiagram.canInstantiate(obj))
        	return new MetricTypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetricTypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5f8375e1-0435-4a72-9892-b7b226e29b79")
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
    @objid ("398dbbd4-793f-4136-be0a-c4f963819662")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("54e506a8-fb31-497c-be09-fe9c3cd55041")
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

    @objid ("3e3d1aeb-41df-4ffc-9a1e-19f5bb001b3f")
    protected MetricTypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("6ae7d73a-b368-4659-bddf-37a608de833c")
    public static final class MdaTypes {
        @objid ("e6c39b6e-caf2-4d9b-882a-21d8c39bc87d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5ec821e7-80cc-4be9-8a36-8c3ff82b0edb")
        private static Stereotype MDAASSOCDEP;

        @objid ("72ede8b8-c069-4832-b5f1-3e031482d8da")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b9291e6e-b005-4060-b878-ba01ba8193e8")
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
