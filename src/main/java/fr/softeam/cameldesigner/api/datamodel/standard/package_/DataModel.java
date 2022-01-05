/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << DataModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("de455c3b-3874-4127-a7ee-cf93060c1056")
public abstract class DataModel extends SubModel {
    @objid ("edee43bc-562d-481b-a52a-da540d1e6b11")
    public static final String STEREOTYPE_NAME = "DataModel";

    @objid ("b0db7fbb-c730-4393-95fd-425568603e17")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) &&
                ((DataInstanceModel.canInstantiate(elt)) ||
                        (DataTypeModel.canInstantiate(elt))));
    }

    @objid ("e5f182d7-e9d8-4ba8-aa55-31f4a5a004e4")
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
        DataModel other = (DataModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("0784fd0a-61a1-4ab3-8b4f-d8c707bee03e")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("257ddebb-92ad-40bb-b646-77523983041b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c80813e3-9963-4d95-9300-f91baffa41dc")
    protected DataModel(final Package elt) {
        super(elt);
    }

    @objid ("be9685ad-a9b6-4bba-8516-6e7e03cecdde")
    public static final class MdaTypes {
        @objid ("f3c94a26-6dc1-4976-8b84-b4b6f1614081")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4033f35d-f8ed-4a62-a9ce-a4916b395f16")
        private static Stereotype MDAASSOCDEP;

        @objid ("addd747e-2736-4131-b4b6-af7e2709caca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c624dc92-0d64-476c-bab4-1b1f77e679ec")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "69b59850-29a3-4354-afc2-617679c2ef73");
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
