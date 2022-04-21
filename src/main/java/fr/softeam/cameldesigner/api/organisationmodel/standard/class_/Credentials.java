/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("1d2d52d3-7cd9-47cc-8124-c0aa182a40c7")
    public static final String STEREOTYPE_NAME = "Credentials";

    /**
     * Tells whether a {@link Credentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Credentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("73d5e82c-505f-4694-bba3-1fe75a9de700")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Credentials.STEREOTYPE_NAME));
    }

    @objid ("54830361-fe07-46c8-973b-ab4e61ab670b")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("2ed53f64-6d0d-4a54-9c8b-6e839a18a3ad")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("c3fac1d6-c9c0-431b-842c-16742e8bc70d")
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

    @objid ("a43b455d-14b6-4a90-aa50-46b278895b4d")
    protected Credentials(final Class elt) {
        super(elt);
    }

    @objid ("3a369440-6a1a-4237-9f5b-26139695cb51")
    public static final class MdaTypes {
        @objid ("55717b5e-416c-400b-acdf-d863603e3db2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0f1637e0-ca17-4e90-be06-571358b2baa2")
        private static Stereotype MDAASSOCDEP;

        @objid ("bba46b0a-b4a7-466a-bb52-0ada137c9254")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5bf0610f-06dc-441d-a303-0c91fd7ad485")
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
