/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("fceae21f-26c7-4db2-b408-38fd800ff036")
    public static final String STEREOTYPE_NAME = "MetricInstanceModelDiagram";

    /**
     * Tells whether a {@link MetricInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetricInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fcde350f-e380-488f-8e2b-61284a5369b3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetricInstanceModelDiagram >> then instantiate a {@link MetricInstanceModelDiagram} proxy.
     * 
     * @return a {@link MetricInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("d0484869-9853-4275-bdc4-41696017666e")
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
    @objid ("82e1b01d-c899-417e-92a7-7b339bc8047c")
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
    @objid ("9e5e7880-f64e-4ad8-9211-99f5319c17bd")
    public static MetricInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetricInstanceModelDiagram.canInstantiate(obj))
        	return new MetricInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetricInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e7502eda-5e51-4dc9-aa28-ac4c21716569")
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
    @objid ("c0a37a15-f8d5-46dc-b50c-c141f2dd216d")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("ae248aab-fe6e-457a-8c48-8fb276c259b4")
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

    @objid ("559286c4-5a9d-4d25-ad4c-a910baa00309")
    protected MetricInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("fc2c7267-7f74-46f7-b3bd-834db7b8d63d")
    public static final class MdaTypes {
        @objid ("ffc8d578-9430-4dac-b598-ab5dd3becd31")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b3eaf36b-9538-48e9-b4ac-9319d20b89a2")
        private static Stereotype MDAASSOCDEP;

        @objid ("75bf558c-5be5-4a07-b92d-563f552df415")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("79e0cdb8-bd3d-4414-bf13-250015107c1a")
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
