/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("e102a027-bd68-43e6-9241-8c742e42a723")
    public static final String STEREOTYPE_NAME = "Certifiable";

    /**
     * Tells whether a {@link Certifiable proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Certifiable >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f66d0285-cc9d-470e-a453-162620d00f21")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Certifiable.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Certifiable >> then instantiate a {@link Certifiable} proxy.
     * 
     * @return a {@link Certifiable} proxy on the created {@link Class}.
     */
    @objid ("9617929b-fc68-448a-88cd-0548622ea1e9")
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
    @objid ("9a550af0-2ec6-42ce-b18c-b5dca9cb57c5")
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
    @objid ("6f6e988b-6bed-4f17-9dbd-26d60ffd6464")
    public static Certifiable safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Certifiable.canInstantiate(obj))
        	return new Certifiable(obj);
        else
        	throw new IllegalArgumentException("Certifiable: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2316ca72-4292-4b27-aaa6-545bcad7bc05")
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
    @objid ("dd93dad1-d6bb-40a2-b4fa-6836d81fa8b1")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("2ebfc1ed-d7dc-4638-8a28-a4e23c4fa07f")
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

    @objid ("eb5691d1-1b5b-41c1-b9fb-1e9d404e8f28")
    protected Certifiable(final Class elt) {
        super(elt);
    }

    @objid ("aee63aa1-1b38-46c1-b417-2240fa886307")
    public static final class MdaTypes {
        @objid ("06d8dea0-a957-443d-be86-e62529090f16")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a2f181d5-162d-4164-9845-c9a32fa529c2")
        private static Stereotype MDAASSOCDEP;

        @objid ("70e2d210-064c-4e15-9769-ce4a1f412102")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3bf15a69-f903-4d12-ac45-355a47182c80")
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
