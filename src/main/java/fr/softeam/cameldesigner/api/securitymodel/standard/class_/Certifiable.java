/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Certifiable >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5a184b7e-9e85-4c9f-a879-89cb31cbcc76")
public class Certifiable extends SecurityAttribute {
    @objid ("50c45fef-dbed-4cec-aa99-8fc5c4860b50")
    public static final String STEREOTYPE_NAME = "Certifiable";

    /**
     * Tells whether a {@link Certifiable proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Certifiable >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a90a3194-e2bf-4150-ac43-7a40e2d968e7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Certifiable.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Certifiable >> then instantiate a {@link Certifiable} proxy.
     * 
     * @return a {@link Certifiable} proxy on the created {@link Class}.
     */
    @objid ("d9f3a8b9-b9fa-4271-85ec-01589c77bfde")
    public static Certifiable create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Certifiable.STEREOTYPE_NAME);
        return Certifiable.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Certifiable} proxy from a {@link Class} stereotyped << Certifiable >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link Certifiable} proxy or <i>null</i>.
     */
    @objid ("c51e5590-7c9f-4cd6-8fea-28ba1442962d")
    public static Certifiable instantiate(final Class obj) {
        return Certifiable.canInstantiate(obj) ? new Certifiable(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Certifiable} proxy from a {@link Class} stereotyped << Certifiable >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link Certifiable} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("869f366e-7475-41e5-b5a3-d74dbd4c3c1f")
    public static Certifiable safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Certifiable.canInstantiate(obj))
            return new Certifiable(obj);
        else
            throw new IllegalArgumentException("Certifiable: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2efc482b-98f3-4428-8d57-67187e3d078b")
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
        Certifiable other = (Certifiable) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("0454ea7a-3181-42e7-b3cd-03248d7e26dd")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("bb07409b-1bd4-4323-a84a-26977937040a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9b31088a-26b0-4575-bd51-87fd613a1c1f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("3df99023-be7d-4aeb-bd8b-68d1a8cc28f1")
    protected Certifiable(final Class elt) {
        super(elt);
    }

    @objid ("aee63aa1-1b38-46c1-b417-2240fa886307")
    public static final class MdaTypes {
        @objid ("dc13833d-ad86-4e72-a199-6c8d9998e47f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a5bef0b-cfc6-4cbc-ab79-f7b69d69bfd3")
        private static Stereotype MDAASSOCDEP;

        @objid ("c4f62f2e-1382-49f7-bc2f-d2a21349a444")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8dfc7fe9-b7ca-4e15-8189-abb47aaaba42")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2ded821f-dd6d-4a25-82d8-46091a835fa0");
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
