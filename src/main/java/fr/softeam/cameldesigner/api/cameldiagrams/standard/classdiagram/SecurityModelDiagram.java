/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("10505534-a812-4f69-9d3b-6cecac6e8a11")
    public static final String STEREOTYPE_NAME = "SecurityModelDiagram";

    /**
     * Tells whether a {@link SecurityModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << SecurityModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7b61d2db-3900-4eb2-8780-31e50877c3bf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << SecurityModelDiagram >> then instantiate a {@link SecurityModelDiagram} proxy.
     * 
     * @return a {@link SecurityModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("b90f2ff2-e0bc-470f-bafc-485c6b4c26b8")
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
    @objid ("3a71cafa-767b-43e2-a3d9-f2cc411983dc")
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
    @objid ("9cb6cf38-7ef8-4afe-8548-0018e540d5dc")
    public static SecurityModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (SecurityModelDiagram.canInstantiate(obj))
        	return new SecurityModelDiagram(obj);
        else
        	throw new IllegalArgumentException("SecurityModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9bf5a335-d45f-4721-8a0e-4b33ea9c8f6b")
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
    @objid ("a432466e-d08c-4ba6-8aad-b30c70c31bc9")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("20ad335a-79c2-44b8-b6e7-21198abbff5c")
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

    @objid ("5a6af24e-cd71-4352-912a-162f60dffca9")
    protected SecurityModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("868740be-41f1-4107-b65a-5c1c718c6bd6")
    public static final class MdaTypes {
        @objid ("fd8d0612-ff64-496b-8517-73dc11d91d1e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5e397594-b9b7-4f8d-a81a-a945919a60e4")
        private static Stereotype MDAASSOCDEP;

        @objid ("189eb416-2be7-4f9e-9da1-77d3e6a0ddc2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cf88d4db-c997-4a82-bd9c-5204592af5b3")
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
