/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("abbb6fd6-7b20-406a-9c9b-8ad37ef1b4ea")
    public static final String STEREOTYPE_NAME = "CamelViewPoint";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    @objid ("31b2fa58-08ae-48cf-a865-be89f9a8ced6")
    protected final ClassDiagram elt;

    /**
     * Tells whether a {@link CamelViewPoint proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << CamelViewPoint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f7beb731-9aee-4ade-8d49-588c0a696c08")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelViewPoint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << CamelViewPoint >> then instantiate a {@link CamelViewPoint} proxy.
     * 
     * @return a {@link CamelViewPoint} proxy on the created {@link ClassDiagram}.
     */
    @objid ("f9b28164-2a7c-422b-8354-a9236bf1b309")
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
    @objid ("320f5b65-d5ed-4db2-8f52-9a4be3e43c87")
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
    @objid ("d63ca0d4-84f6-4485-a5d0-db73fbe76a20")
    public static CamelViewPoint safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (CamelViewPoint.canInstantiate(obj))
        	return new CamelViewPoint(obj);
        else
        	throw new IllegalArgumentException("CamelViewPoint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("12b449e7-d7d4-40ea-8745-188b3c774c24")
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
    @objid ("5db2687f-f357-407f-b278-efb68fbb0061")
    public ClassDiagram getElement() {
        return this.elt;
    }

    @objid ("50f0cf5d-d4b6-40b3-bdd9-5bba5110f7f2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cc4c3f7c-6e5f-4db7-acc6-88a758b670b5")
    protected CamelViewPoint(final ClassDiagram elt) {
        this.elt = elt;
    }

    @objid ("b97bab2c-d812-455d-9d9d-74777baddf53")
    public static final class MdaTypes {
        @objid ("b91e2ddf-11dc-4003-ac02-b01663ac6ed5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7b8714c5-75a9-4f3b-9a78-7a596606e92c")
        private static Stereotype MDAASSOCDEP;

        @objid ("6c749d5a-23d8-431f-a3c4-07670491be80")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3ca91ad5-12bc-412e-a419-fe0ab928de18")
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
