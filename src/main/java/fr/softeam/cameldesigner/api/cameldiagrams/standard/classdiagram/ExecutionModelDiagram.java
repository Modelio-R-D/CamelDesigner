/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("11e982f4-3ea5-4804-95f3-c36ae9af2e5d")
    public static final String STEREOTYPE_NAME = "ExecutionModelDiagram";

    /**
     * Tells whether a {@link ExecutionModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ExecutionModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("334f3bd7-01b5-4121-86f1-9f3baae9ce0c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << ExecutionModelDiagram >> then instantiate a {@link ExecutionModelDiagram} proxy.
     * 
     * @return a {@link ExecutionModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("b2dcf28c-bafd-4de5-bdc1-308e450394d8")
    public static ExecutionModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModelDiagram.STEREOTYPE_NAME);
        return ExecutionModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ExecutionModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ExecutionModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link ExecutionModelDiagram} proxy or <i>null</i>.
     */
    @objid ("88916967-2f5b-4847-954a-0bf12501730b")
    public static ExecutionModelDiagram instantiate(final ClassDiagram obj) {
        return ExecutionModelDiagram.canInstantiate(obj) ? new ExecutionModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExecutionModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ExecutionModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link ExecutionModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d22fca01-2ce5-4e17-9005-c4bb941ddc7d")
    public static ExecutionModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ExecutionModelDiagram.canInstantiate(obj))
            return new ExecutionModelDiagram(obj);
        else
            throw new IllegalArgumentException("ExecutionModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4a344657-d93a-4f25-b01d-6c94ed2eb723")
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
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("0d96eddb-0bdc-4cda-989c-4bee5eae145e")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    /**
     * Get the value of the 'Origin' role.<p>
     * Role description:
     * null
     */
    @objid ("517f3566-4043-4b77-887b-bc88c0c84ae1")
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

    @objid ("a7313237-db32-4953-85d9-16355bc55822")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'Origin' role.<p>
     * Role description:
     * null
     */
    @objid ("41e7982c-1f0f-4cf9-83fd-ab28bd6e1b94")
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

    @objid ("88a06c2a-9d84-45bf-9ddd-f400730dbdb9")
    protected ExecutionModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("ab4c82f7-565e-4087-a077-3c41552a0525")
    public static final class MdaTypes {
        @objid ("09606675-148a-41ab-a3ed-218f0c2a3ca2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ec76c778-60bf-4e2a-8f4c-07c2208dfb12")
        private static Stereotype MDAASSOCDEP;

        @objid ("9ada5ee8-0e66-46ab-82c3-194e47eb5bd2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("99ad3389-714a-4ce7-b835-b3abaa3f4606")
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
