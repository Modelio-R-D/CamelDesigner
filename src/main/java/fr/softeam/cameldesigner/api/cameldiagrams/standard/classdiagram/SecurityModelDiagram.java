/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << SecurityModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4718a895-acb3-4999-91d8-cabfc0237ba5")
public class SecurityModelDiagram extends AbstractCamelDiagram {
    @objid ("8fe98fdf-66d6-418e-b57d-81943f33f006")
    public static final String STEREOTYPE_NAME = "SecurityModelDiagram";

    /**
     * Tells whether a {@link SecurityModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << SecurityModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7272b38a-fbd4-48e5-b5cc-96e6df7023d0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << SecurityModelDiagram >> then instantiate a {@link SecurityModelDiagram} proxy.
     * 
     * @return a {@link SecurityModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("fc7a15ba-fac9-4f73-aabd-4f1ccb915f23")
    public static SecurityModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityModelDiagram.STEREOTYPE_NAME);
        return SecurityModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link SecurityModelDiagram} proxy from a {@link ClassDiagram} stereotyped << SecurityModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link SecurityModelDiagram} proxy or <i>null</i>.
     */
    @objid ("2d1fe576-05b8-45a1-8abf-d9da320638f2")
    public static SecurityModelDiagram instantiate(final ClassDiagram obj) {
        return SecurityModelDiagram.canInstantiate(obj) ? new SecurityModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityModelDiagram} proxy from a {@link ClassDiagram} stereotyped << SecurityModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link SecurityModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("eef1501f-dd11-40c5-9c78-2909350cd6aa")
    public static SecurityModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (SecurityModelDiagram.canInstantiate(obj))
        	return new SecurityModelDiagram(obj);
        else
        	throw new IllegalArgumentException("SecurityModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e800f52b-f3c4-42fd-ad96-5517a5a4bd12")
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
        SecurityModelDiagram other = (SecurityModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("f5e74bca-9ff3-48af-b648-36494a9a5a5d")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("8d22d75a-15dc-4870-91c7-063ac36c50b6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("78f63251-e877-421f-8907-5a07a2605825")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("e6aee520-49a6-47e2-af5f-a2103e384a90")
    protected SecurityModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("868740be-41f1-4107-b65a-5c1c718c6bd6")
    public static final class MdaTypes {
        @objid ("54363b53-2bfd-4c94-8217-2383bc60ac83")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a7901148-392b-4376-bd37-461841a0a89d")
        private static Stereotype MDAASSOCDEP;

        @objid ("c1f7791c-e1f5-4649-82d5-cb7e275e08d2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ae116855-bf88-45b8-b1a7-bd05063d276a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f7228862-f56b-49a6-a404-f06dcb6a08fa");
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
