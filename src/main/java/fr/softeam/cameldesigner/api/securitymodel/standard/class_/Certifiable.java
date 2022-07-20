/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("9a43aaa7-b081-45c9-9bb9-97452b8452ac")
    public static final String STEREOTYPE_NAME = "Certifiable";

    /**
     * Tells whether a {@link Certifiable proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Certifiable >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c8cab562-386f-4c4f-bd35-b113468263b3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Certifiable.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Certifiable >> then instantiate a {@link Certifiable} proxy.
     * 
     * @return a {@link Certifiable} proxy on the created {@link Class}.
     */
    @objid ("74c3b5b2-8c88-443b-a0e5-79627b2d0829")
    public static Certifiable create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Certifiable.STEREOTYPE_NAME);
        return Certifiable.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Certifiable} proxy from a {@link Class} stereotyped << Certifiable >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Certifiable} proxy or <i>null</i>.
     */
    @objid ("981f2093-706a-45e4-96f1-11ce8b7430cc")
    public static Certifiable instantiate(final Class obj) {
        return Certifiable.canInstantiate(obj) ? new Certifiable(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Certifiable} proxy from a {@link Class} stereotyped << Certifiable >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Certifiable} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("833b5f82-dfcb-49ee-8c6f-a2d31d46cd86")
    public static Certifiable safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Certifiable.canInstantiate(obj))
        	return new Certifiable(obj);
        else
        	throw new IllegalArgumentException("Certifiable: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f0d934d2-f153-4231-86c8-f6cdfbf4f99a")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("896401c3-06ab-4e32-ba08-8327ada46925")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("372c3bb8-c97d-4b62-a668-9b1b002ac92b")
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

    @objid ("286a0e89-5ef0-430d-94aa-2c7f6234eb52")
    protected Certifiable(final Class elt) {
        super(elt);
    }

    @objid ("aee63aa1-1b38-46c1-b417-2240fa886307")
    public static final class MdaTypes {
        @objid ("3cb142b8-85cc-42ca-af9f-6ed86901bb8e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9fbda843-faf5-4ccf-b511-78c092483388")
        private static Stereotype MDAASSOCDEP;

        @objid ("b172aea8-36a2-44f3-a56a-f0accd77d7d7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3223d78f-0687-4a6b-9ca9-c7fab298a766")
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
