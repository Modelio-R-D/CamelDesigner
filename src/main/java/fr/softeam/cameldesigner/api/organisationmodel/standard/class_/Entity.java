/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("05f0c98f-cf9c-4ccb-b0ac-76e545127027")
=======
    @objid ("eb8d9783-7bf2-4b17-be94-4fc954a451f5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Entity";

    /**
     * Tells whether a {@link Entity proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Entity >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("efed4146-8dda-4f09-abd1-b09427da7a13")
=======
    @objid ("de353a0e-e17c-402e-a683-c00c5dd77dd5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Entity.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Entity >> then instantiate a {@link Entity} proxy.
     * 
     * @return a {@link Entity} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("8ceaaf4b-b6e7-4a6f-9e1e-cb8c7f634820")
=======
    @objid ("386e610e-3c3f-463e-bd86-14563fb7b4c3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c1a4a800-42f9-4a2e-9e44-020f4e64057b")
=======
    @objid ("9d14d1be-796d-4606-849b-b76ed3b0a710")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("4061e1f4-ed91-4183-bc21-c31504e1020d")
=======
    @objid ("4b15c182-1630-41c6-88a3-3b9829fa13b4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Entity safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Entity.canInstantiate(obj))
        	return new Entity(obj);
        else
        	throw new IllegalArgumentException("Entity: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("5c04cd3b-a1ee-458e-846f-64043b1e4150")
=======
    @objid ("9e03bead-f99b-4c55-a4a3-439f8a52cf86")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("416cfc14-7021-478a-9cf0-0e691b402172")
=======
    @objid ("7d57f27e-1262-43ef-b197-9725b8c73de2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("358f63e1-7931-4ba8-97ee-52fed87aae5c")
=======
    @objid ("1df18ae1-d72b-4403-b1e2-3b76db81f4ea")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("8789cff5-d878-49b7-a256-969994f0b202")
=======
    @objid ("45288b49-0b53-4aa3-8a76-216071fc9ddc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Entity(final Class elt) {
        super(elt);
    }

    @objid ("261036c6-676a-487a-934e-2dea0ceb0b28")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("12016972-85be-443a-920d-7461ac060a37")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f292f010-313d-4046-89d0-82a7f9297d61")
        private static Stereotype MDAASSOCDEP;

        @objid ("7a6afe5e-df21-4202-977e-985845996379")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c38e200b-beb0-4a65-bd07-10d1a3bdece1")
=======
        @objid ("a13c0d8c-6146-4908-8ae9-73a1b2c62cd1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("26789276-1825-4796-b1d2-80c318d17215")
        private static Stereotype MDAASSOCDEP;

        @objid ("b0926b45-79c2-4bf5-87e3-367b81060e9f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1122528a-129e-4492-91f6-0abe475509a9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
