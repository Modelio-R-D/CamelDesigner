/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/13/22 11:16 AM by Modelio Studio.
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
@objid ("02a2deb5-9eef-4188-b3b9-1883fa9cb9b5")
public class CamelViewPoint {
    @objid ("46e976d8-5b7b-48f7-ae1d-758f4d33ef52")
    public static final String STEREOTYPE_NAME = "CamelViewPoint";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    @objid ("fffa4dc9-3b3f-4a47-b216-37625bc41acb")
    protected final ClassDiagram elt;

    /**
     * Tells whether a {@link CamelViewPoint proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << CamelViewPoint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1b6be2b3-0284-4b17-be43-4d575c43e3c2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelViewPoint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << CamelViewPoint >> then instantiate a {@link CamelViewPoint} proxy.
     * 
     * @return a {@link CamelViewPoint} proxy on the created {@link ClassDiagram}.
     */
    @objid ("eb0354e9-723c-43ca-b810-fac781f4325e")
    public static CamelViewPoint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelViewPoint.STEREOTYPE_NAME);
        return CamelViewPoint.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link CamelViewPoint} proxy from a {@link ClassDiagram} stereotyped << CamelViewPoint >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link CamelViewPoint} proxy or <i>null</i>.
     */
    @objid ("2d58b093-a391-4391-ba07-3ae95e9f3f07")
    public static CamelViewPoint instantiate(final ClassDiagram obj) {
        return CamelViewPoint.canInstantiate(obj) ? new CamelViewPoint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CamelViewPoint} proxy from a {@link ClassDiagram} stereotyped << CamelViewPoint >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link CamelViewPoint} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ad27fb23-ddd2-414c-ae98-529abe04da73")
    public static CamelViewPoint safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (CamelViewPoint.canInstantiate(obj))
            return new CamelViewPoint(obj);
        else
            throw new IllegalArgumentException("CamelViewPoint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d4299f41-90cb-4552-878f-1d996558b5ed")
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
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("b0f3a629-5c22-4826-a579-0dcff5da142a")
    public ClassDiagram getElement() {
        return this.elt;
    }

    @objid ("915db1fb-c733-4eb6-97d7-7c3f48e3cb5d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3ef7f04a-f942-40fd-94b8-85f76d706d33")
    protected CamelViewPoint(final ClassDiagram elt) {
        this.elt = elt;
    }

    @objid ("754df3e1-6801-4249-bfa4-866c370083e5")
    public static final class MdaTypes {
        @objid ("1e1a5d0c-1cee-4e9a-9396-8122c24f9ae9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3bed574d-39e1-4627-878c-65729d0aa346")
        private static Stereotype MDAASSOCDEP;

        @objid ("2598dffa-a3c7-4da6-8545-4be2bdc1ec5d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f3c66f28-afc2-4402-a5ae-78ccb2d26dd9")
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
