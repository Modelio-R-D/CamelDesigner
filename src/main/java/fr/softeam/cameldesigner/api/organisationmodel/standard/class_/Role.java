/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
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
 * Proxy class to handle a {@link Class} with << Role >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5846bcfc-fc98-4f31-b691-21c72a9930b9")
public class Role extends FeatureClass {
    @objid ("0b7a88c5-ad3c-4547-a1f0-b340774a2043")
    public static final String STEREOTYPE_NAME = "Role";

    /**
     * Tells whether a {@link Role proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Role >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1e19e4ad-17fe-4466-890b-bab4adbf03fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Role.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Role >> then instantiate a {@link Role} proxy.
     * 
     * @return a {@link Role} proxy on the created {@link Class}.
     */
    @objid ("d5e3ca86-33d8-49cd-940b-309c8388aad3")
    public static Role create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Role.STEREOTYPE_NAME);
        return Role.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Role} proxy from a {@link Class} stereotyped << Role >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Role} proxy or <i>null</i>.
     */
    @objid ("6c1bea45-6407-41a5-b10f-43e36d8d6719")
    public static Role instantiate(final Class obj) {
        return Role.canInstantiate(obj) ? new Role(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Role} proxy from a {@link Class} stereotyped << Role >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Role} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e8d7071c-e679-4e7a-9d55-5e04149f163a")
    public static Role safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Role.canInstantiate(obj))
        	return new Role(obj);
        else
        	throw new IllegalArgumentException("Role: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("01a4bf24-9b97-43b9-9e2b-887f5ac6012e")
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
        Role other = (Role) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("a16e3b40-47cc-42c2-90bb-c165c9362ff0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("a28eccc1-fec6-45a7-9646-f945c0602193")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3657ba2e-5382-4327-b5bc-5bfe2bd87073")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("38b6ad13-c18d-4712-957a-5d69ca8c4c8d")
    protected Role(final Class elt) {
        super(elt);
    }

    @objid ("6984b739-246a-4151-a962-ff6ba842fc69")
    public static final class MdaTypes {
        @objid ("c33456cd-15e3-4979-b1e7-b2f31d335104")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3be475ed-fa41-40cf-a02c-6b40dea1cef3")
        private static Stereotype MDAASSOCDEP;

        @objid ("012da774-a61c-47d2-a63b-8c40f4f28b6f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("144a7c7a-7696-4a0d-a911-8faf2d367d68")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "858f6212-589e-4b36-9150-2e764f0e91b5");
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
