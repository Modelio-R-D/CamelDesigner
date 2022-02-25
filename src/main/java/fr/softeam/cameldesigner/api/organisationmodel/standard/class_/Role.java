/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("466f4f55-69e6-4d92-b7ea-9095f56518e2")
    public static final String STEREOTYPE_NAME = "Role";

    /**
     * Tells whether a {@link Role proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Role >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e553e3ea-5fb6-4ef3-a51c-46f814a4fa01")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Role.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Role >> then instantiate a {@link Role} proxy.
     * 
     * @return a {@link Role} proxy on the created {@link Class}.
     */
    @objid ("bd62898d-d40d-4bd1-a0be-0d12c2f14818")
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
    @objid ("72873d55-38fb-4549-bb5b-d16fda1feba3")
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
    @objid ("627f4c6c-27d4-466b-9550-00344cf4ae34")
    public static Role safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Role.canInstantiate(obj))
        	return new Role(obj);
        else
        	throw new IllegalArgumentException("Role: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("86aee0c3-0425-418e-ae60-d484efeb1c1d")
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
    @objid ("3dbc2adc-cf0f-4121-a539-f24d337fde44")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("eab61893-07f2-49ca-97b3-4127c70df6e8")
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

    @objid ("34da6449-9847-4361-8e70-4d8079749896")
    protected Role(final Class elt) {
        super(elt);
    }

    @objid ("6984b739-246a-4151-a962-ff6ba842fc69")
    public static final class MdaTypes {
        @objid ("7572bed9-2dfa-43a9-bd3d-0207e440fdbb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("896d27e0-c77e-46b1-b5ca-f0cf4184eb6c")
        private static Stereotype MDAASSOCDEP;

        @objid ("88abcd15-985c-490c-85fc-cf8deb4dd73d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e49f5e50-75ce-4d5d-b945-7580445ca2bf")
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
