/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.0.10

 * This file was generated on 7/24/20 11:19 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link Class} with << AttributeConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ca90a89d-8971-4473-a9ca-e052868fe2a8")
public abstract class AttributeConstraint extends UnaryConstraint {
    @objid ("e8460a72-89aa-4d1f-9051-5ce39aa64dd2")
    public static final String STEREOTYPE_NAME = "AttributeConstraint";

    @objid ("5b91daf3-36d2-4780-b624-8e340240a48b")
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
        AttributeConstraint other = (AttributeConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("811af3eb-a52a-4f10-a25c-b5aac31da816")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("c1dc1a47-d0f8-4d85-a149-9b69cade5f46")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2831addd-f4c9-456a-b23d-ee401a193913")
    protected AttributeConstraint(final Class elt) {
        super(elt);
    }

    @objid ("29959c96-ec2d-4b0c-9c28-c1606b966656")
    public static final class MdaTypes {
        @objid ("0bc663f5-63ff-47c0-a8f0-3bb220c79f3e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9d239f24-043c-4922-b1eb-7818c57ff383")
        private static Stereotype MDAASSOCDEP;

        @objid ("ad57e87e-1c66-4875-9eb3-0694ec5cfea8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("de8a2f31-1f0f-4e72-a1dd-9254da4f82b1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e6739261-9c00-42f5-8f1a-dc59363aef4d");
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
