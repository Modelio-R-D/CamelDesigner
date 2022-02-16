/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("85a0edc0-2b50-4681-a842-6317e130e7fd")
    public static final String STEREOTYPE_NAME = "CamelViewPoint";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    @objid ("9f72508a-e517-4a17-b0ee-cdf3c539585e")
    protected final ClassDiagram elt;

    /**
     * Tells whether a {@link CamelViewPoint proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << CamelViewPoint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("286d39f0-0aec-4097-a0f8-4204b763a2f1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelViewPoint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << CamelViewPoint >> then instantiate a {@link CamelViewPoint} proxy.
     * 
     * @return a {@link CamelViewPoint} proxy on the created {@link ClassDiagram}.
     */
    @objid ("514464ce-4961-47cc-9c3e-73017b82876b")
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
    @objid ("4beb3cab-e018-43ec-928e-a9aa32ddcd3c")
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
    @objid ("57da7823-9445-4320-89ec-3f436d62309b")
    public static CamelViewPoint safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (CamelViewPoint.canInstantiate(obj))
        	return new CamelViewPoint(obj);
        else
        	throw new IllegalArgumentException("CamelViewPoint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6ff6eb87-2f22-4920-ba1e-904f183a907a")
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
    @objid ("affe3f96-30e7-4464-9e7f-81e66d366e45")
    public ClassDiagram getElement() {
        return this.elt;
    }

    @objid ("432740d9-dfa6-4768-9427-7717a8437957")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ab46f31d-6cdf-48c7-a12e-210bc7b0e555")
    protected CamelViewPoint(final ClassDiagram elt) {
        this.elt = elt;
    }

    @objid ("b97bab2c-d812-455d-9d9d-74777baddf53")
    public static final class MdaTypes {
        @objid ("c5aa5d85-4350-452a-bebd-e968fd2789b6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("84b3c233-155c-4edb-bee3-a852118f7738")
        private static Stereotype MDAASSOCDEP;

        @objid ("79b08f48-2b30-4ce3-9a20-6cbe8ab204f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d779d75b-076a-4268-93d6-3f41719ebfda")
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
