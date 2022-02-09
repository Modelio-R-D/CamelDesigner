/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("410d14ac-aafc-4fb3-81bc-d67100ed4c6c")
    public static final String STEREOTYPE_NAME = "DataModel";

    /**
     * Tells whether a {@link DataModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fb08dda2-8bfb-45b0-952a-73305107528e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataModel.STEREOTYPE_NAME));
    }

    @objid ("8494cb43-224c-4066-a97f-67d165c12e58")
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
    @objid ("3323bd5b-e768-49e3-8cb1-0a2091c88f28")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("fe6ea89f-861e-444a-a7b5-1f1a5fb0f65d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5a921068-f17a-4395-833e-f7d7ba0693a4")
    protected DataModel(final Package elt) {
        super(elt);
    }

    @objid ("be9685ad-a9b6-4bba-8516-6e7e03cecdde")
    public static final class MdaTypes {
        @objid ("96ac61dd-c11c-4d21-8c2a-f3a1f241525c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c8aeda72-1215-4eaa-badf-4752bcb208a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("a13448c1-302c-4064-bd6f-e084a25fb32a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8ab8c9dc-cf32-437e-92eb-cdfff6e12a7c")
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
