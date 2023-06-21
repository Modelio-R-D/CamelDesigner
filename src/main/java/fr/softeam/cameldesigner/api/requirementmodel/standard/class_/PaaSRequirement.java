/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("11ca891c-66ef-4ecc-8881-01ef57e86d78")
    public static final String STEREOTYPE_NAME = "PaaSRequirement";

    /**
     * Tells whether a {@link PaaSRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PaaSRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c2fe4b7c-7f5d-44fb-94e4-bdb273cbc5f3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PaaSRequirement >> then instantiate a {@link PaaSRequirement} proxy.
     * 
     * @return a {@link PaaSRequirement} proxy on the created {@link Class}.
     */
    @objid ("07be67a0-b539-4bc5-a43b-1148b84747e5")
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
    @objid ("885c511d-9e12-489d-8ca8-3979d6dba592")
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
    @objid ("2b8dcfab-11c5-4df0-86b5-7ad7dd2d74cf")
    public static PaaSRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PaaSRequirement.canInstantiate(obj))
        	return new PaaSRequirement(obj);
        else
        	throw new IllegalArgumentException("PaaSRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e20e7a19-f9f9-43e0-b1e9-991ff3266599")
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
    @objid ("f5547383-4dc6-4b20-b220-c0bd6fc00f49")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("514a81d6-d169-4188-82bd-e5e5be7c3999")
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

    @objid ("114f2e50-b01b-411a-82ca-d26c16d0540b")
    protected PaaSRequirement(final Class elt) {
        super(elt);
    }

    @objid ("f1ab105f-3a9a-4d24-8c32-5dd406174ad0")
    public static final class MdaTypes {
        @objid ("3f41a880-f068-462f-bbc3-ca734fbe2352")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7973890f-5a88-49cd-b217-ca1c9a328e0c")
        private static Stereotype MDAASSOCDEP;

        @objid ("b12beed2-3eea-4702-944d-a2f589674158")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6fb876ec-c2e8-4752-8129-091b798a3fb6")
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
