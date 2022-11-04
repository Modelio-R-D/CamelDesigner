/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

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
 * Proxy class to handle a {@link Class} with << Event >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9aee4d48-70c9-49d9-bc02-2f8e30c209d9")
public abstract class Event extends FeatureClass {
    @objid ("d7cb2bea-cac4-4ac2-9a21-febe45806c97")
    public static final String STEREOTYPE_NAME = "Event";

    /**
     * Tells whether a {@link Event proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Event >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0e57e67e-c4b3-418e-811d-c8d1f7146e9c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Event.STEREOTYPE_NAME));
    }

    @objid ("f995c30d-1e12-4bfc-a599-4270e20830e6")
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
        Event other = (Event) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("be528186-7342-4cf5-8bfe-a5dc50f9c9ff")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("5267d465-54fa-40ef-b7d1-bf4af58005bf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fc896c4f-ef98-4a86-ad3a-071af8beac46")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("1f6d2686-33bc-4646-91c3-786de02041ff")
    protected Event(final Class elt) {
        super(elt);
    }

    @objid ("ddf59bec-eaaf-437c-b222-29836ad692ea")
    public static final class MdaTypes {
        @objid ("7344aa0b-b31b-4342-aeea-bc7fe53dbc13")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1696c0a9-ac4f-4644-b750-740549b86fbb")
        private static Stereotype MDAASSOCDEP;

        @objid ("66c3917f-7912-418e-bccc-6884675a14a0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9b64a7dd-0369-44f5-baab-0b3839439736")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "79c08ab1-4e04-44ee-b88e-ddc638947bfd");
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
