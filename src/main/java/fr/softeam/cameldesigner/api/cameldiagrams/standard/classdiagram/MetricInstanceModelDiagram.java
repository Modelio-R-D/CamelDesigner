/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("617f8170-db77-4e82-9ce5-57e033943de7")
=======
    @objid ("5a8f83bc-80e9-4104-ad7f-95acd989b2de")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "MetricInstanceModelDiagram";

    /**
     * Tells whether a {@link MetricInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetricInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("5d526b1c-a934-4a61-ad5b-4d8cf3a24722")
=======
    @objid ("5744d5d5-ce4a-4ce5-9430-4fe76c5bcaab")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetricInstanceModelDiagram >> then instantiate a {@link MetricInstanceModelDiagram} proxy.
     * 
     * @return a {@link MetricInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("398ac0c4-3da5-4320-9e54-3127a7dcb298")
=======
    @objid ("989d9026-d8b0-4eb4-a43e-d8c5b7f867cf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("32a74c3b-c8a7-47f8-8675-e227d742dd28")
=======
    @objid ("4e4b8c15-072a-4cb5-8f48-04bc9476a436")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("bf406617-b78a-4aee-baff-ed9f1e2f6778")
=======
    @objid ("b13bb369-a41e-40e7-976b-d5b340bdfb03")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static MetricInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetricInstanceModelDiagram.canInstantiate(obj))
        	return new MetricInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetricInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("18693824-e2fd-4e84-9cf1-c34419b095c0")
=======
    @objid ("c57cda42-f7d4-4295-8277-528e2f5b5981")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f3ce7076-4abe-484c-8684-5baeb2b76af1")
=======
    @objid ("0dc57d36-6ee9-44ee-a1f4-2546c676ec36")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("c331b9c1-87be-495e-ac55-495d6620ec3b")
=======
    @objid ("d62e2a19-ace9-47a0-bd27-3d3209bf6caf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("89c331fc-2adc-4014-84c0-67bcbde96b3b")
=======
    @objid ("238ec270-23fc-43b4-95c1-2a5c6be8b803")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MetricInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("fc2c7267-7f74-46f7-b3bd-834db7b8d63d")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("6ede8709-b56f-4169-8ae1-457b993fe9e9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("15fc913a-c762-45ac-90fe-8e08cf77c50b")
        private static Stereotype MDAASSOCDEP;

        @objid ("336d6303-8342-42bd-93c5-4311fa14791c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ccad3f0f-bcb9-4f1a-9f39-1dc26774fec9")
=======
        @objid ("fd13d474-9d57-4a2f-b9c0-432720de5d3d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4c7d2a0b-e223-4ff3-93c0-b10bf0bfec49")
        private static Stereotype MDAASSOCDEP;

        @objid ("4336dbb4-1725-4a0f-93b1-b3e11ca3fb82")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b7d5c3e6-1af0-4643-a1b1-efe8022fbb25")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
