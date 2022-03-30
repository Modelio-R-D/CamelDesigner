/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << Credentials >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bfb6184e-67cd-4b06-ab79-5393ce245f8e")
public abstract class Credentials extends FeatureClass {
    @objid ("da5ea29f-1c9f-4a45-a665-3da08b3cd2d2")
    public static final String STEREOTYPE_NAME = "Credentials";

    /**
     * Tells whether a {@link Credentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Credentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a4c582ea-2d2f-4806-8497-04a810143672")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Credentials.STEREOTYPE_NAME));
    }

    @objid ("74b68735-dab6-4321-8910-35a0a5b64b38")
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
        Credentials other = (Credentials) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("cb4367dc-ed6c-4c0e-b9e4-e03f4e43b8fc")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("36842af1-c421-4285-a6bf-90cfec1312cf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fa0a7c97-f909-4749-9818-0bccef5688c1")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("9d83b0cc-c850-438d-9dc3-3b0835a6888c")
    protected Credentials(final Class elt) {
        super(elt);
    }

    @objid ("3a369440-6a1a-4237-9f5b-26139695cb51")
    public static final class MdaTypes {
        @objid ("3447100c-06a6-43bf-847c-42a29c3c4fb1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("946596e3-6a33-4ace-925a-8455c036d316")
        private static Stereotype MDAASSOCDEP;

        @objid ("cd6c91ed-4398-4118-8320-e62fea975317")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("df7b1ae9-3eb8-4119-8785-fbf5b5f2437c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ff07e549-20c1-4871-863d-c00d48790863");
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
