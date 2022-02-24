/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("ebb9e80c-e446-4067-8f77-b37d915423fe")
    public static final String STEREOTYPE_NAME = "MetricInstanceModelDiagram";

    /**
     * Tells whether a {@link MetricInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetricInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6b1f0f7a-b2e9-4a8b-9772-171eeb05d6c0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetricInstanceModelDiagram >> then instantiate a {@link MetricInstanceModelDiagram} proxy.
     * 
     * @return a {@link MetricInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("c46c9925-811f-49c4-883d-067512e766de")
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
    @objid ("bfd5010c-fe40-4cff-bef3-9da5ddc25381")
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
    @objid ("c895ecca-6223-4847-9620-777fe66ec7ee")
    public static MetricInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetricInstanceModelDiagram.canInstantiate(obj))
        	return new MetricInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetricInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1a96b2e0-e567-49a2-8a82-34f86286cbcd")
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
    @objid ("5515e6c0-5d8e-4461-952c-c271a52204d6")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("d815e569-3889-4b16-a9eb-f05c146353a3")
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

    @objid ("617b3202-c6d8-48b7-b5a9-17719ff8cbf7")
    protected MetricInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("fc2c7267-7f74-46f7-b3bd-834db7b8d63d")
    public static final class MdaTypes {
        @objid ("a67afd79-a6dd-4184-a9ae-2167102e4908")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e7463b90-6ecd-42cc-b027-70b4f18f395b")
        private static Stereotype MDAASSOCDEP;

        @objid ("48ed8de2-5533-4d24-aacf-655e2b44546e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3ba9d4e0-df18-4ce5-8697-5c42d974d00d")
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
