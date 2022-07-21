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
 * Proxy class to handle a {@link Class} with << Entity >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0ddd50cd-81bd-4d73-85c7-ab182d264a9c")
public class Entity extends FeatureClass {
    @objid ("a922c055-9b02-41bd-9b87-218d8eff4c08")
    public static final String STEREOTYPE_NAME = "Entity";

    /**
     * Tells whether a {@link Entity proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Entity >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ed626b9e-7fca-4e5c-9848-efb654322a0c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Entity.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Entity >> then instantiate a {@link Entity} proxy.
     * 
     * @return a {@link Entity} proxy on the created {@link Class}.
     */
    @objid ("c7e33ab5-d359-4383-95e5-cab8e912d7be")
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
    @objid ("4e808d40-ccf4-4e3d-9ebc-1b88468bf927")
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
    @objid ("2048a715-7a28-405a-a8f8-2a5e5f88b7ae")
    public static Entity safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Entity.canInstantiate(obj))
        	return new Entity(obj);
        else
        	throw new IllegalArgumentException("Entity: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1bf9eef3-6b79-4f80-afa9-9ce7086f288a")
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
    @objid ("16263086-8638-4d77-bca5-da669160c22f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("bb45e6fa-52a2-48d6-94ba-4a4696df4196")
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

    @objid ("11d90c12-8d2b-4c07-b493-eb274049bc8d")
    protected Entity(final Class elt) {
        super(elt);
    }

    @objid ("261036c6-676a-487a-934e-2dea0ceb0b28")
    public static final class MdaTypes {
        @objid ("184224e9-2d58-430e-aa7c-593fedaf436c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c84953c-f8e3-492e-91e5-12374eef2f1a")
        private static Stereotype MDAASSOCDEP;

        @objid ("884fd3f8-99f7-47be-9dc7-3ff8de246d82")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3be7a29a-8b23-4912-a712-c95fcbbbc778")
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
