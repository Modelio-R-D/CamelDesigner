/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
    @objid ("e93ac999-c90c-465a-92df-129fd25ed66d")
    public static final String STEREOTYPE_NAME = "DataModel";

    /**
     * Tells whether a {@link DataModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bbf2a9bb-3e9e-4ab6-a94b-9f6dccd675fa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataModel.STEREOTYPE_NAME));
    }

    @objid ("9904886d-22f9-415d-a25d-ec635ce4d592")
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
     * @return the Package represented by this proxy, never null.
     */
    @objid ("21564552-05d0-47c5-8580-e31ffe33d349")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("6525879b-3415-4a84-81cf-9f667f28d010")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cabb5eea-777f-40f0-9d23-842c2faa7725")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("4637fb56-812a-4b7c-8a6e-5651f9c9bd37")
    protected DataModel(final Package elt) {
        super(elt);
    }

    @objid ("be9685ad-a9b6-4bba-8516-6e7e03cecdde")
    public static final class MdaTypes {
        @objid ("1cbd8b4a-2bba-4c80-9037-e601b50a64d5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eb45e6fd-9469-4236-afa0-de82968d2946")
        private static Stereotype MDAASSOCDEP;

        @objid ("6091ef18-e34a-4ced-8d88-0944f235706b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9203caf8-b2c5-4653-8467-9b9fb9788664")
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
