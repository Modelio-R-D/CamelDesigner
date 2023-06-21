/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("0a66f418-d009-4c20-a389-a9d6f3ee3cd2")
    public static final String STEREOTYPE_NAME = "DataModel";

    /**
     * Tells whether a {@link DataModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("94b472fd-9dff-4fab-a7d4-98ace9dc0ae1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataModel.STEREOTYPE_NAME));
    }

    @objid ("96ca4e32-cf57-4463-85c7-fc00ad6a6025")
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
    @objid ("332cf464-e68b-4c23-9d23-b1c58d80f3e2")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("dc0dc7db-552d-4275-b974-ecabc23caac5")
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

    @objid ("5f73e7d5-ca73-4fb0-894a-069751a38c61")
    protected DataModel(final Package elt) {
        super(elt);
    }

    @objid ("be9685ad-a9b6-4bba-8516-6e7e03cecdde")
    public static final class MdaTypes {
        @objid ("ba315986-c965-4a9f-843e-8864a91ebc24")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f6afb3f6-3ea7-42c6-bea2-3624b5a6632f")
        private static Stereotype MDAASSOCDEP;

        @objid ("e7798d64-2f94-4842-a8b1-c500ec7f8223")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("53edb18e-5e7e-4dca-bb0b-dfe6e2d52e29")
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
