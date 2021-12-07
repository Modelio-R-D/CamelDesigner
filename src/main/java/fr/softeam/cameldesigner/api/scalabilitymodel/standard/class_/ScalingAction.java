/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.Action;
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
 * Proxy class to handle a {@link Class} with << ScalingAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ec5cda5f-f4dc-4224-8dbe-fcc933166d0c")
public abstract class ScalingAction extends Action {
    @objid ("f4b63c16-3191-4a62-9eef-dd66659f5d27")
    public static final String STEREOTYPE_NAME = "ScalingAction";

    @objid ("6e5db26a-6adf-4114-8bbe-53a52db1570f")
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
        ScalingAction other = (ScalingAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ffcaa28f-2d3a-4c4c-a6ae-a74644cd1456")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("0cfd0bf3-e40c-4b9d-a947-6f2ce958863f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("66437f7c-ed9d-4e04-b87a-df72e8b14acc")
    protected ScalingAction(final Class elt) {
        super(elt);
    }

    @objid ("f9caad23-0bab-41b8-ac92-3cfcff664909")
    public static final class MdaTypes {
        @objid ("85d011ec-2625-41bf-86b0-cfc86e16264b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("833d9643-d175-4d26-b510-6a13e1294371")
        private static Stereotype MDAASSOCDEP;

        @objid ("c9bc6f9d-4e85-423b-bc9c-898eefb282d2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("30ce654d-9563-4ce9-8797-5f9b9bc58ee7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "25bf81ac-b13e-4716-b766-42a9b7e05150");
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
