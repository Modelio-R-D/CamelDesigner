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
 * Proxy class to handle a {@link GeneralClass} with << SoftRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("539e2a12-8c48-42f5-9783-5248ca11085c")
public abstract class SoftRequirement extends Requirement {
    @objid ("d9d100fb-8dff-42df-9e86-60eb9a9c569a")
    public static final String STEREOTYPE_NAME = "SoftRequirement";

    @objid ("2396288a-4489-4330-a07e-d80f763fc2e7")
    public static final String PRIORITY_TAGTYPE = "priority";

    @objid ("26c01ae6-82d6-4357-8b28-35243d518804")
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
        SoftRequirement other = (SoftRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link GeneralClass}.
     * 
     * @return the GeneralClass represented by this proxy, never null.
     */
    @objid ("81f86258-ae81-40d5-9810-abf2ae545cf5")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    /**
     * Getter for string property 'priority'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("14c65f87-9a19-45b8-add3-759507d94408")
    public String getPriority() {
        return this.elt.getTagValue(SoftRequirement.MdaTypes.PRIORITY_TAGTYPE_ELT);
    }

    @objid ("3a2b5f29-cfcc-4499-8a66-a27835e99aec")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'priority'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7a95ffc8-e339-46bf-b071-65be29cfdb40")
    public void setPriority(final String value) {
        this.elt.putTagValue(SoftRequirement.MdaTypes.PRIORITY_TAGTYPE_ELT, value);
    }

    @objid ("697b2c16-32b4-49cd-a53f-13ecd6a15540")
    protected SoftRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("e11f1b31-a2cb-4b0a-a55c-c134d2473491")
    public static final class MdaTypes {
        @objid ("e3735f6b-19d6-4847-8fa3-e23b70414297")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("003dbeb4-8cdf-49c3-8466-e304279d35d3")
        public static TagType PRIORITY_TAGTYPE_ELT;

        @objid ("0bfb6afb-a09c-4340-8ef4-9c1b108626a1")
        private static Stereotype MDAASSOCDEP;

        @objid ("5c0d9ddb-7889-44f7-8c90-dd0377ad183f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("946fa47d-59fe-45cd-bbda-8e5c755723c5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fc1abdeb-e2fa-4a04-9253-4e15a223bce2");
            PRIORITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f38e006-1584-4036-8ddc-f39a5b607306");
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
