/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.class_;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Value >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b2107801-5ebd-4fed-a10f-94070aefa145")
public abstract class Value {
    @objid ("e3004e6a-9ffd-4fc2-a743-8d17eecb27d9")
    public static final String STEREOTYPE_NAME = "Value";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("d852db0c-5133-4e63-84fb-03fb3b40fb74")
    protected final Class elt;

    /**
     * Tells whether a {@link Value proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Value >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8fdec667-afc1-472e-899c-4ebd15c5685c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Value.STEREOTYPE_NAME));
    }

    @objid ("793bff2e-7670-4bdc-8b0c-37ea5fad8845")
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
        Value other = (Value) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ef67fa7d-e28f-4b83-886e-6fbed13d549c")
    public Class getElement() {
        return this.elt;
    }

    @objid ("af9a751c-531b-4b4e-b2df-358bc3ec7c5e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("286f674b-5fad-437b-8764-92b5de2362a2")
    protected Value(final Class elt) {
        this.elt = elt;
    }

    @objid ("98e6e882-3baf-4b4c-b3c1-9b995cb33b84")
    public static final class MdaTypes {
        @objid ("5a83d191-17b3-4250-a08a-8897acc7b046")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1f715df1-4414-4db5-936f-a5547384840e")
        private static Stereotype MDAASSOCDEP;

        @objid ("15edd02f-1a54-46e3-8906-f3f7c23a93bc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4f715717-2037-45d2-a751-3a7fec319e45")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b7cec495-c026-4fde-b42d-496bbcda924b");
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
