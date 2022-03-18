/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link ClassDiagram} with << CamelViewPoint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a0996f72-f1c0-426f-b6d0-bc09ebb96da4")
public class CamelViewPoint {
    @objid ("3e411e6d-8caa-4765-8fa3-03c72339bd1f")
    public static final String STEREOTYPE_NAME = "CamelViewPoint";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    @objid ("c1698703-841a-459b-a389-a6a0990f3e9b")
    protected final ClassDiagram elt;

    /**
     * Tells whether a {@link CamelViewPoint proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << CamelViewPoint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("61c9a704-6ecf-447a-8517-047cf141e4c5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelViewPoint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << CamelViewPoint >> then instantiate a {@link CamelViewPoint} proxy.
     * 
     * @return a {@link CamelViewPoint} proxy on the created {@link ClassDiagram}.
     */
    @objid ("568b0e85-dd16-4d98-a34f-8f6c30121911")
    public static CamelViewPoint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelViewPoint.STEREOTYPE_NAME);
        return CamelViewPoint.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link CamelViewPoint} proxy from a {@link ClassDiagram} stereotyped << CamelViewPoint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link CamelViewPoint} proxy or <i>null</i>.
     */
    @objid ("3e4aa3bd-49d0-42ea-87b5-1792f53cbb3c")
    public static CamelViewPoint instantiate(final ClassDiagram obj) {
        return CamelViewPoint.canInstantiate(obj) ? new CamelViewPoint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CamelViewPoint} proxy from a {@link ClassDiagram} stereotyped << CamelViewPoint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link CamelViewPoint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bd1453d2-6426-400e-8cb3-d87afb6840bb")
    public static CamelViewPoint safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (CamelViewPoint.canInstantiate(obj))
        	return new CamelViewPoint(obj);
        else
        	throw new IllegalArgumentException("CamelViewPoint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3991f54e-5604-4485-8f5f-a86db8de420a")
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
        CamelViewPoint other = (CamelViewPoint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("6d2ffee6-4b83-42cc-97aa-cc61e672bacb")
    public ClassDiagram getElement() {
        return this.elt;
    }

    @objid ("25d60301-6b70-48dc-80e2-fddac8373ea1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("be6ee8a5-a154-47e1-9c74-8308a8ac1b2e")
    protected CamelViewPoint(final ClassDiagram elt) {
        this.elt = elt;
    }

    @objid ("b97bab2c-d812-455d-9d9d-74777baddf53")
    public static final class MdaTypes {
        @objid ("775a295d-246a-47a6-8106-a3bb2592fe1b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7d7f0d29-7546-49b8-b0e6-8eaddfbea3f9")
        private static Stereotype MDAASSOCDEP;

        @objid ("083ce839-f542-4baa-a080-9fe76568d5ae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("944d494b-14fa-45be-b087-e545abf6f507")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e46b07f3-2bf2-48c1-8218-3a31ce9fa75d");
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
