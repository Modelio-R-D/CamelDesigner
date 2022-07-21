/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("8d56ca8f-dfd4-4c8c-adc0-0d076f66fefa")
    public static final String STEREOTYPE_NAME = "Credentials";

    /**
     * Tells whether a {@link Credentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Credentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d1718475-3efb-4b58-bbf8-8bba8291a8ca")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Credentials.STEREOTYPE_NAME));
    }

    @objid ("18c1655a-040e-49fa-b8cd-217712673f24")
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
    @objid ("fba66ff2-71d0-4b38-9ebc-da0256f2e254")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("c779316a-f5b4-437e-a254-a4c91239e81f")
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

    @objid ("d17fcb15-d934-46d5-b7ce-186271c1317e")
    protected Credentials(final Class elt) {
        super(elt);
    }

    @objid ("3a369440-6a1a-4237-9f5b-26139695cb51")
    public static final class MdaTypes {
        @objid ("dd0fc286-21dd-409b-a52b-bf10bb835aad")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("81c5f1ff-d569-4dad-ac40-327d5a627a3c")
        private static Stereotype MDAASSOCDEP;

        @objid ("7f1d72f4-946b-4124-967b-27187115b8db")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9e8c580d-fa14-41fe-a337-5a1017c17ea1")
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
