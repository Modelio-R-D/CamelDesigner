/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("93fe00a4-274b-4637-a46d-4e853b83fa84")
    public static final String STEREOTYPE_NAME = "CamelViewPoint";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    @objid ("f4556b99-7ed6-418e-907c-70fef31f6f50")
    protected final ClassDiagram elt;

    /**
     * Tells whether a {@link CamelViewPoint proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << CamelViewPoint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("02ee482d-ee6d-4650-839b-4be234ce563b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelViewPoint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << CamelViewPoint >> then instantiate a {@link CamelViewPoint} proxy.
     * 
     * @return a {@link CamelViewPoint} proxy on the created {@link ClassDiagram}.
     */
    @objid ("b0e5e3f9-cf0b-4aa9-914a-ceea2529bd9e")
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
    @objid ("61bbfc67-f26d-438e-93f5-fdc91dd86d32")
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
    @objid ("bd1ef241-c5d6-4c09-ad5b-624604d14773")
    public static CamelViewPoint safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (CamelViewPoint.canInstantiate(obj))
        	return new CamelViewPoint(obj);
        else
        	throw new IllegalArgumentException("CamelViewPoint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fb10afce-ffcd-4fcb-8863-ae1038eeac50")
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
    @objid ("60aef5a9-2f2e-4d56-8c84-8613f27330ae")
    public ClassDiagram getElement() {
        return this.elt;
    }

    @objid ("d4f282f9-794c-4455-bdcc-a57dc81a799f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8d7cf622-c318-47b1-a03f-5e0279dc6b22")
    protected CamelViewPoint(final ClassDiagram elt) {
        this.elt = elt;
    }

    @objid ("b97bab2c-d812-455d-9d9d-74777baddf53")
    public static final class MdaTypes {
        @objid ("070b18a6-3e92-482d-b645-1387b3b7dda2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ee4d4867-1e55-4d75-8192-abb1f2c6ca35")
        private static Stereotype MDAASSOCDEP;

        @objid ("2d26e15c-f715-4b7f-a7de-b3257d14b0d7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d16e0778-c5ef-4874-9136-b41f2ad7a589")
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
