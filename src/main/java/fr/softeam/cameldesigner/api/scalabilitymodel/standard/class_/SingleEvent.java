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
 * Proxy class to handle a {@link Class} with << SingleEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b740d58f-0acd-4aba-bdc8-6394a8467e6c")
public abstract class SingleEvent extends Event {
    @objid ("d2438f3a-1315-461d-a18f-f2ffd61ac4a3")
    public static final String STEREOTYPE_NAME = "SingleEvent";

    /**
     * Tells whether a {@link SingleEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SingleEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("56dc1d14-262f-47d1-961c-3b45505a1d82")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SingleEvent.STEREOTYPE_NAME));
    }

    @objid ("3c523397-4329-4d01-8e7d-59d5d8495005")
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
        SingleEvent other = (SingleEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b60f42ba-bb2b-4244-b6b5-461418154285")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("370250e3-26a7-47cc-a6d0-c06bc586c1dd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3d554f2b-0199-4de0-8fad-bb0325273c1f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("9a1f4282-6ebb-4b90-8294-4088627a7a51")
    protected SingleEvent(final Class elt) {
        super(elt);
    }

    @objid ("4e5c23d4-7cb6-45fd-804e-c2745676a29b")
    public static final class MdaTypes {
        @objid ("0ef11bc3-2fde-4ab8-a92b-7007108a8f86")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("64c9324c-ed9b-474d-ba84-334f7ffd34b1")
        private static Stereotype MDAASSOCDEP;

        @objid ("85531e05-199a-46ef-be06-74707279050f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a2b04844-6945-4da7-bb8e-83a6739f9cef")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "40acd9bb-daad-41f6-96cd-d9267430eabf");
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
