/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("22f8c7c3-b24b-4468-9668-89128817b156")
    public static final String STEREOTYPE_NAME = "SingleEvent";

    /**
     * Tells whether a {@link SingleEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SingleEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("af476bc6-9216-41c7-be1d-3099ac30e52a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SingleEvent.STEREOTYPE_NAME));
    }

    @objid ("0b918b2d-37b1-4c12-a4ae-9ad4c0e0e0c3")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b1995b4f-7ad8-4e0e-af11-ff32bb136deb")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("fd3cca4b-b1b2-4379-a12f-0e544139460d")
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

    @objid ("65eaa3ef-3051-4b79-96d7-e2d1b484576c")
    protected SingleEvent(final Class elt) {
        super(elt);
    }

    @objid ("4e5c23d4-7cb6-45fd-804e-c2745676a29b")
    public static final class MdaTypes {
        @objid ("d8cf284d-40f9-480e-93e2-88eb44d0e96a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("419a3a1b-7cfb-478f-95cd-0d1a10541e0b")
        private static Stereotype MDAASSOCDEP;

        @objid ("7e5dbf6c-bd04-4956-ad91-e0f951debe05")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ba697d88-5dcc-48eb-8b23-fbe5d4b192d1")
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
