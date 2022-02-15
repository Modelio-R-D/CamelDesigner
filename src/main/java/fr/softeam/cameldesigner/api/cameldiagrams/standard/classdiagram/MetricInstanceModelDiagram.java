/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
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
    @objid ("a84a6e97-3f8c-410a-b8b5-db633911561d")
    public static final String STEREOTYPE_NAME = "MetricInstanceModelDiagram";

    /**
     * Tells whether a {@link MetricInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetricInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d75f60c0-60f2-4d44-b4f4-e1b94038bf7c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetricInstanceModelDiagram >> then instantiate a {@link MetricInstanceModelDiagram} proxy.
     * 
     * @return a {@link MetricInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("8a5b263b-5415-47f7-a01a-d37f4f2e3a5c")
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
    @objid ("21db2fc1-fe6e-47f4-93f8-ecc8297d7f7f")
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
    @objid ("f8482e0d-ec1a-4ef1-a06f-a76c5a83888c")
    public static MetricInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetricInstanceModelDiagram.canInstantiate(obj))
        	return new MetricInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetricInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("97035a05-d1f8-4203-affe-29353a689e04")
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
    @objid ("c8bcd508-9d88-4aac-81a9-dc246c3fa585")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("97a03ea4-ab52-4e92-b99f-8d9b390fa469")
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

    @objid ("8046b175-c492-4e00-b0d9-df0c368db4ea")
    protected MetricInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("fc2c7267-7f74-46f7-b3bd-834db7b8d63d")
    public static final class MdaTypes {
        @objid ("b3cbdcb6-af1f-419b-bcd7-059c6ccce1c4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f428b261-ba04-4148-8f5a-4bc208a95741")
        private static Stereotype MDAASSOCDEP;

        @objid ("2c5c773d-e750-4e09-9ca0-81f58dc83607")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("96e27fbd-b76d-4e75-93ea-f1ff36ad954a")
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
