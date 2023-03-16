/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("2a5e3bee-f18d-441d-a1fd-41cfbed8f113")
    public static final String STEREOTYPE_NAME = "Event";

    /**
     * Tells whether a {@link Event proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Event >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("41de0e3b-f12a-4d64-bca2-81115fcc83af")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Event.STEREOTYPE_NAME));
    }

    @objid ("b26c50b8-9db2-48f3-8e7c-0a748190be47")
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
    @objid ("dd504dc3-ee22-43e2-9600-dd954a8bcc26")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("e91a63ad-96c2-4fb0-9316-727bb0efc210")
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

    @objid ("1581b5b0-13f0-41ea-bad1-5c557cd9497d")
    protected Event(final Class elt) {
        super(elt);
    }

    @objid ("ddf59bec-eaaf-437c-b222-29836ad692ea")
    public static final class MdaTypes {
        @objid ("d97ac647-ba1c-465c-93e1-6da3824db6ba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("aa15b724-eb84-47ff-8fb4-496575bf241a")
        private static Stereotype MDAASSOCDEP;

        @objid ("13c762e1-232d-4380-b9e7-42b8a6e71b07")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eef75f09-fac9-4c67-ab8c-57bdb6d5960c")
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
