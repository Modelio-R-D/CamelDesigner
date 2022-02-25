/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("f4dbed4a-6c22-4cef-b77f-4ab9598676b4")
    public static final String STEREOTYPE_NAME = "Event";

    /**
     * Tells whether a {@link Event proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Event >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5b678468-e604-46e5-bf8f-3048449544ea")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Event.STEREOTYPE_NAME));
    }

    @objid ("17435c66-7493-488c-b5ab-ac5f92254074")
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
    @objid ("77540574-0634-4dcc-a961-427949056ddd")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("f245ee23-da4b-4742-8979-d41bf38a22cb")
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

    @objid ("24a1b2c1-29ac-4e2c-83ba-590f75b9e7e5")
    protected Event(final Class elt) {
        super(elt);
    }

    @objid ("ddf59bec-eaaf-437c-b222-29836ad692ea")
    public static final class MdaTypes {
        @objid ("054f22a2-2a5d-464d-8cea-2ecdf7844a15")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8592016f-2208-431e-afdf-9e6a261bd4e6")
        private static Stereotype MDAASSOCDEP;

        @objid ("1bd11c9b-d6c8-469f-9eed-79df04cdba61")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0273e8be-1456-4348-a0f9-5a8700329566")
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
