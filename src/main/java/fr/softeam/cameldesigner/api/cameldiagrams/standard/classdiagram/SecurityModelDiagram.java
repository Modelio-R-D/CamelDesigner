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
    @objid ("6986720f-6e82-4f84-ae66-5b6dc3ebb1f5")
    public static final String STEREOTYPE_NAME = "SecurityModelDiagram";

    /**
     * Tells whether a {@link SecurityModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << SecurityModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("13130ec3-6cc1-404e-85b1-a028cb50cf51")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << SecurityModelDiagram >> then instantiate a {@link SecurityModelDiagram} proxy.
     * 
     * @return a {@link SecurityModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("077cce78-a5c0-4aa4-b180-64e5eb709034")
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
    @objid ("4af0c038-2575-4590-8319-c0aa0c9d03b8")
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
    @objid ("7ce24d66-2b48-4d2a-83e9-c67a35c5c393")
    public static SecurityModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (SecurityModelDiagram.canInstantiate(obj))
        	return new SecurityModelDiagram(obj);
        else
        	throw new IllegalArgumentException("SecurityModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("95b710b5-03cd-4394-85d5-c6d307145931")
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
    @objid ("d9c056a8-daab-4f81-8239-3af4385fec12")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("8d617f10-1851-4923-94eb-349b755478fa")
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

    @objid ("bdb05602-0695-4951-9d77-7ef7f9173230")
    protected SecurityModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("868740be-41f1-4107-b65a-5c1c718c6bd6")
    public static final class MdaTypes {
        @objid ("09e24941-0b74-4063-bfc7-793048bbd643")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("01ba4c8f-0c71-4137-abbf-a060d6262c49")
        private static Stereotype MDAASSOCDEP;

        @objid ("23e10491-7a95-4b72-8b80-76cf37ff8417")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("61358986-5d95-40da-94cf-fa1de2af9429")
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
