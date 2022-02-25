/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("e6440e32-b8fb-458a-a4c7-e60dfbcf6694")
    public static final String STEREOTYPE_NAME = "ExecutionModelDiagram";

    /**
     * Tells whether a {@link ExecutionModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ExecutionModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6e1e93f1-c9f4-4078-aad2-d027608a9e7a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << ExecutionModelDiagram >> then instantiate a {@link ExecutionModelDiagram} proxy.
     * 
     * @return a {@link ExecutionModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("a692b62f-1eae-4901-8bc6-3c411c1d7f33")
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
    @objid ("c8f74728-226d-4d86-9fbe-dd690812d52f")
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
    @objid ("c3b68bf2-1a89-4ea9-9ced-d15ef94a5b90")
    public static ExecutionModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ExecutionModelDiagram.canInstantiate(obj))
        	return new ExecutionModelDiagram(obj);
        else
        	throw new IllegalArgumentException("ExecutionModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c0bebd33-5b1e-4494-9cfa-4e5aaeb6eba6")
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
    @objid ("97e91c0b-0b69-45a4-a3ed-d9d82d7861b8")
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
    @objid ("ed77f546-f4ba-42e2-82fe-99be230c2ebe")
    public ExecutionModel getOrigin() {
        return (ExecutionModel)CamelDesignerProxyFactory.instantiate(((ClassDiagram) this.elt).getOrigin(), ExecutionModel.STEREOTYPE_NAME);
    }

    @objid ("f37aecb7-f831-446b-87ce-02ed6e97539f")
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
    @objid ("1927091d-3300-4306-803e-db4f8e1e3f91")
    public void setOrigin(final ExecutionModel obj) {
        ((ClassDiagram) this.elt).setOrigin((obj != null) ? obj.getElement() : null);
    }

    @objid ("2f80f04c-df61-48c6-9945-4f635ce676b9")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("01d3b4cc-e197-485f-98b8-ce9ee2211f59")
    protected ExecutionModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("ab4c82f7-565e-4087-a077-3c41552a0525")
    public static final class MdaTypes {
        @objid ("55c0c42a-1e18-4cf2-9380-66282bf0291b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8cbd8a71-2dd9-4991-b2f0-a5d62358d23a")
        private static Stereotype MDAASSOCDEP;

        @objid ("905520ab-875b-433d-9a7b-dcde14527a93")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("57255b83-0721-4c8b-a7ff-5a6937864650")
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
