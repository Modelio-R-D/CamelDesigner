/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << Entity >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0ddd50cd-81bd-4d73-85c7-ab182d264a9c")
public class Entity extends FeatureClass {
    @objid ("6d2e3a08-e425-49d4-9a55-0194f97ab7ef")
    public static final String STEREOTYPE_NAME = "Entity";

    /**
     * Tells whether a {@link Entity proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Entity >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("15bb6efd-eb07-41ac-ab20-af796e15ff95")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Entity.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Entity >> then instantiate a {@link Entity} proxy.
     * 
     * @return a {@link Entity} proxy on the created {@link Class}.
     */
    @objid ("3fbcc97f-3a66-4eeb-8799-a3d31e766895")
    public static Entity create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Entity.STEREOTYPE_NAME);
        return Entity.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Entity} proxy from a {@link Class} stereotyped << Entity >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Entity} proxy or <i>null</i>.
     */
    @objid ("00011a76-9616-4531-b904-91f1d2c071d1")
    public static Entity instantiate(final Class obj) {
        return Entity.canInstantiate(obj) ? new Entity(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Entity} proxy from a {@link Class} stereotyped << Entity >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Entity} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5b9617fc-6a2a-4ec8-8b3e-9cc2b5a56166")
    public static Entity safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Entity.canInstantiate(obj))
        	return new Entity(obj);
        else
        	throw new IllegalArgumentException("Entity: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("afa01a23-419b-40da-bf9f-141690691d32")
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
        Entity other = (Entity) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1a0b9169-5384-4cde-b93f-4e33f640bb0d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("eebb3c5e-57a8-464c-8f6b-4275b349569e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("02694d86-eab7-45ba-bb2f-c62fb0827c88")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("b71b5e01-52f2-4389-8b5d-818df0e42987")
    protected Entity(final Class elt) {
        super(elt);
    }

    @objid ("261036c6-676a-487a-934e-2dea0ceb0b28")
    public static final class MdaTypes {
        @objid ("38cafafc-0b4e-4014-8742-51afaee5ab8a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f9d6f818-3491-4667-9c0a-3668a05bceb4")
        private static Stereotype MDAASSOCDEP;

        @objid ("2c4e4067-c20c-41e4-a82a-6e941749ef49")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("de89e9ac-6b5c-49cb-a8be-8939abbffac8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8edda027-b2f3-43bb-b101-0058aaa1550f");
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
