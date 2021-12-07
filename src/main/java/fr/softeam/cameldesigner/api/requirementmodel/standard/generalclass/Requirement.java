/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link GeneralClass} with << Requirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cd14264b-97fa-49a6-bb0d-db04d8c66386")
public abstract class Requirement extends Feature {
    @objid ("8d629ca9-090a-4170-8c31-3dff60c77ea8")
    public static final String STEREOTYPE_NAME = "Requirement";

    @objid ("78495f59-1bfd-4d3f-885b-8c8229499f4c")
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
        Requirement other = (Requirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link GeneralClass}.
     * 
     * @return the GeneralClass represented by this proxy, never null.
     */
    @objid ("9d522d17-1a41-4da3-a6a9-0be0309eb9f3")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    @objid ("4d3fd5c3-024a-4708-a36c-8b7cd9d1bf34")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1d973595-19fe-4157-bc85-9f41cee588cd")
    protected Requirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("d168a813-2ca0-4031-921a-6b0cec2ba4ee")
    public static final class MdaTypes {
        @objid ("76dee7fb-e073-417f-814b-bda6a74b3af7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f05ff6f9-2950-476c-b4fa-4e78abc9f781")
        private static Stereotype MDAASSOCDEP;

        @objid ("eff67127-4653-46a0-ae41-8647958034e1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("394c3a97-10cb-481c-8b3d-45bb8b27340e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f14398cc-a1c7-4953-9874-f7819f1ec4f7");
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
