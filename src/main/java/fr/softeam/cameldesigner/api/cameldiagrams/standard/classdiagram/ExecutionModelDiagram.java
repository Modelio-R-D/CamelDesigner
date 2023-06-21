/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("abd9fbb0-6600-456a-b839-99694cf5d67e")
    public static final String STEREOTYPE_NAME = "ExecutionModelDiagram";

    /**
     * Tells whether a {@link ExecutionModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ExecutionModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("71d70717-c266-471f-a11e-8a8eae70488f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << ExecutionModelDiagram >> then instantiate a {@link ExecutionModelDiagram} proxy.
     * 
     * @return a {@link ExecutionModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("e6d0e0e4-ca52-4dcf-963c-0068e00e1afa")
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
    @objid ("6eeb5431-8be5-4b95-a1a5-42ae1ffe1f24")
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
    @objid ("f14a7cbd-5f74-405a-acdd-a92dd8124365")
    public static ExecutionModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ExecutionModelDiagram.canInstantiate(obj))
        	return new ExecutionModelDiagram(obj);
        else
        	throw new IllegalArgumentException("ExecutionModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("810b658d-fb1b-407a-8324-a9cde1e49d35")
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
    @objid ("3103caeb-785e-4a17-86d8-1b5de475e3ac")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    /**
     * Get the value to the 'Origin' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0828996f-e69b-4576-a92f-5f4fb7edce5f")
    public ExecutionModel getOrigin() {
        return (ExecutionModel)CamelDesignerProxyFactory.instantiate(((ClassDiagram) this.elt).getOrigin(), ExecutionModel.STEREOTYPE_NAME);
    }

    @objid ("64cbe3d6-9808-4b58-91c3-6c82de395a02")
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
    @objid ("33635641-da72-4df5-90e2-4d12bbda1df8")
    public void setOrigin(final ExecutionModel obj) {
        ((ClassDiagram) this.elt).setOrigin((obj != null) ? obj.getElement() : null);
    }

    @objid ("2f80f04c-df61-48c6-9945-4f635ce676b9")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("59a546b0-1dc1-4fba-a16f-2e1602f1c417")
    protected ExecutionModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("ab4c82f7-565e-4087-a077-3c41552a0525")
    public static final class MdaTypes {
        @objid ("f48e318c-d430-412a-adc5-dfbefa6d0849")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("83aae1df-36d2-48cb-a00b-d07cfbf4154b")
        private static Stereotype MDAASSOCDEP;

        @objid ("6929950d-09e0-4534-ab58-7fd9a22fd0a7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2d629e3f-d4af-4861-ae82-c94c1b4604de")
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
