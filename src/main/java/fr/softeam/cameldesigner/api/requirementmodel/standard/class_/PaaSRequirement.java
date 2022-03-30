/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
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
 * Proxy class to handle a {@link Class} with << PaaSRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f5103c3d-e058-41f9-b48b-a3555f8f176c")
public class PaaSRequirement extends HardRequirement {
    @objid ("76473dd0-d6a1-4231-a5d6-6506ce99f2c5")
    public static final String STEREOTYPE_NAME = "PaaSRequirement";

    /**
     * Tells whether a {@link PaaSRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PaaSRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("55508a4d-71e9-479b-88b9-020304a1ccb4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PaaSRequirement >> then instantiate a {@link PaaSRequirement} proxy.
     * 
     * @return a {@link PaaSRequirement} proxy on the created {@link Class}.
     */
    @objid ("b32e6632-4c59-4661-8dec-fbf14a654dd4")
    public static PaaSRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaSRequirement.STEREOTYPE_NAME);
        return PaaSRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PaaSRequirement} proxy from a {@link Class} stereotyped << PaaSRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link PaaSRequirement} proxy or <i>null</i>.
     */
    @objid ("93d63362-4721-4976-b445-b33e3176bb61")
    public static PaaSRequirement instantiate(final Class obj) {
        return PaaSRequirement.canInstantiate(obj) ? new PaaSRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaSRequirement} proxy from a {@link Class} stereotyped << PaaSRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link PaaSRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("82837263-1f26-4ab6-b2ab-e4abd34c3b39")
    public static PaaSRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PaaSRequirement.canInstantiate(obj))
        	return new PaaSRequirement(obj);
        else
        	throw new IllegalArgumentException("PaaSRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("53fb2b65-764c-4b29-919a-b1eef073b5f0")
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
        PaaSRequirement other = (PaaSRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("df7a1a26-c25e-41f9-b5cc-60660f0d3790")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("536d01b3-cbbe-46c8-9642-276a52afbb12")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("030e0731-9e44-4472-baad-c615462b1d25")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c043a169-efaf-4485-825a-27905465512f")
    protected PaaSRequirement(final Class elt) {
        super(elt);
    }

    @objid ("f1ab105f-3a9a-4d24-8c32-5dd406174ad0")
    public static final class MdaTypes {
        @objid ("60fe5303-9626-4fd4-a578-58dbc43e241f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("68e3df80-9019-44e7-a3e3-6dd70fec61be")
        private static Stereotype MDAASSOCDEP;

        @objid ("abbb6244-a878-41d7-a0e7-8d649633a556")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a79966e9-e168-44ee-bf87-49dbde222708")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1b4b9489-ad62-4a1b-be52-900e21e7f441");
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
