/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/23/21 5:02 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
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
 * Proxy class to handle a {@link ClassDiagram} with << ExecutionModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("81054f40-4a19-4bee-8959-d5f552c3e112")
public class ExecutionModelDiagram extends AbstractCamelDiagram {
    @objid ("efe196d7-6329-4033-acfa-fc6e964031e6")
    public static final String STEREOTYPE_NAME = "ExecutionModelDiagram";

    /**
     * Tells whether a {@link ExecutionModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ExecutionModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0c99142a-1fc7-4aa6-8045-325efa4e0941")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << ExecutionModelDiagram >> then instantiate a {@link ExecutionModelDiagram} proxy.
     * 
     * @return a {@link ExecutionModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("aaf86775-d3ab-4211-b9a8-2bd3ba2d4a2b")
    public static ExecutionModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModelDiagram.STEREOTYPE_NAME);
        return ExecutionModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ExecutionModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ExecutionModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link ExecutionModelDiagram} proxy or <i>null</i>.
     */
    @objid ("bf0b0d0f-de47-41b8-b785-d1e5ab41a939")
    public static ExecutionModelDiagram instantiate(final ClassDiagram obj) {
        return ExecutionModelDiagram.canInstantiate(obj) ? new ExecutionModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExecutionModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ExecutionModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link ExecutionModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("11457041-11e1-4f3e-bee4-b4451a75f1fe")
    public static ExecutionModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ExecutionModelDiagram.canInstantiate(obj))
        	return new ExecutionModelDiagram(obj);
        else
        	throw new IllegalArgumentException("ExecutionModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("16cf1c0b-12f6-4391-9903-112578e5cf23")
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
        ExecutionModelDiagram other = (ExecutionModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("9fb21d8d-7e70-41ae-a5ee-6f41148ca453")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    /**
     * Get the value of the 'Origin' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6b430a2d-af96-45cd-a714-f29d0eabd956")
    public ExecutionModel getOrigin() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(ExecutionModelDiagram.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ExecutionModelDiagram.MdaTypes.MDAASSOCDEP_ROLE), "Diagram")
              && ExecutionModel.canInstantiate(d.getImpacted())) {
                  return (ExecutionModel)CamelDesignerProxyFactory.instantiate(d.getImpacted(), ExecutionModel.MdaTypes.STEREOTYPE_ELT.getName());
          }
        }
        return null;
    }

    @objid ("8d088545-5f00-4582-8e30-3f11c73c70d1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'Origin' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d61a787f-e4f2-4cf0-afd1-42a264da6db5")
    public void setOrigin(final ExecutionModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(ExecutionModelDiagram.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ExecutionModelDiagram.MdaTypes.MDAASSOCDEP_ROLE), "Diagram")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(obj.getElement(), this.elt, ExecutionModelDiagram.MdaTypes.MDAASSOCDEP);
              dep.setName("Diagram");
              dep.putTagValue(ExecutionModelDiagram.MdaTypes.MDAASSOCDEP_ROLE, "Diagram");
          }
          dep.setImpacted(obj.getElement());
        }
    }

    @objid ("2f80f04c-df61-48c6-9945-4f635ce676b9")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("8a7a2cc5-50c5-44cf-8446-9d4b3ea1617b")
    protected ExecutionModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("ab4c82f7-565e-4087-a077-3c41552a0525")
    public static final class MdaTypes {
        @objid ("be5310a2-1499-4e67-9806-fdf8a761edea")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("480b5b74-6ced-43b2-8dc1-c0d67f24fcb8")
        private static Stereotype MDAASSOCDEP;

        @objid ("cafd4fb7-1e60-471a-b8fd-fb55fbaf15b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d0d7da6-35c1-4808-bed1-76a8fb4609f2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "40a6ab6a-6df9-40b0-a877-d1de85918a7d");
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
