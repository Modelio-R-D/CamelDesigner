/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << FunctionalEventInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("74739338-3b9c-4079-b95b-413fb9150e97")
public class FunctionalEventInstance extends EventInstance {
    @objid ("6ae699fe-b473-4229-a778-7f462578a6a2")
    public static final String STEREOTYPE_NAME = "FunctionalEventInstance";

    /**
     * Tells whether a {@link FunctionalEventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FunctionalEventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7a8406ad-a274-42e2-befd-7b4bddc3447a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEventInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FunctionalEventInstance >> then instantiate a {@link FunctionalEventInstance} proxy.
     * 
     * @return a {@link FunctionalEventInstance} proxy on the created {@link Class}.
     */
    @objid ("e86b037f-9fa3-4ba4-bd18-4912ef83a2a2")
    public static FunctionalEventInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEventInstance.STEREOTYPE_NAME);
        return FunctionalEventInstance.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FunctionalEventInstance} proxy from a {@link Class} stereotyped << FunctionalEventInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link FunctionalEventInstance} proxy or <i>null</i>.
     */
    @objid ("025ba55e-0138-4ba9-96a3-f17580466658")
    public static FunctionalEventInstance instantiate(final Class obj) {
        return FunctionalEventInstance.canInstantiate(obj) ? new FunctionalEventInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FunctionalEventInstance} proxy from a {@link Class} stereotyped << FunctionalEventInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link FunctionalEventInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("64821bfd-6116-4aa1-ad21-326657793a99")
    public static FunctionalEventInstance safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FunctionalEventInstance.canInstantiate(obj))
            return new FunctionalEventInstance(obj);
        else
            throw new IllegalArgumentException("FunctionalEventInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b17f52c4-2b2b-41f4-8189-add4071fcd61")
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
        FunctionalEventInstance other = (FunctionalEventInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8e4816aa-6b92-4721-b175-687021f52999")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("76d173d3-4c6c-43c1-a807-3a2f2908d44d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c31711ab-b6dc-4ce9-8113-d257c2ef855a")
    protected FunctionalEventInstance(final Class elt) {
        super(elt);
    }

    @objid ("2d2e175c-5a6c-432d-812c-7001f8569e62")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("99d99dad-b26d-400b-aabe-cee2f21ee46c")
    public static final class MdaTypes {
        @objid ("8c41182b-3353-4433-a656-46736078c748")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a2213d32-d58c-4163-bc5c-5cf5193a2ef3")
        private static Stereotype MDAASSOCDEP;

        @objid ("e6efe200-975b-4c4b-a176-0004fd13625c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5a9869c4-3e83-4631-bee9-a560aad3eb7e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b88afca5-ed15-48f1-a81b-29da4a453701");
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
