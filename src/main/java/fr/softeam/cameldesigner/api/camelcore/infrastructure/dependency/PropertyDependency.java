/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency;

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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << PropertyDependency >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("66e1dd55-fc1a-4daa-b03e-a10778bf9f73")
public class PropertyDependency extends CamelElement {
<<<<<<< HEAD
    @objid ("b148420b-9198-423c-ac53-4a8fe3f444be")
=======
    @objid ("24da55b7-879c-450d-b9b2-f94205c0c06c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "PropertyDependency";

    /**
     * Tells whether a {@link PropertyDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << PropertyDependency >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("1e1f96f9-4267-45ef-b643-2e730a86a937")
=======
    @objid ("48277089-d6f6-43e6-93fc-f82fbdda7f47")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PropertyDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << PropertyDependency >> then instantiate a {@link PropertyDependency} proxy.
     * 
     * @return a {@link PropertyDependency} proxy on the created {@link Dependency}.
     */
<<<<<<< HEAD
    @objid ("0481bb93-683b-4245-9b2b-5a03faaa51d5")
=======
    @objid ("8ec034cc-a1f1-452a-851b-2ae924dad0a1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PropertyDependency create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PropertyDependency.STEREOTYPE_NAME);
        return PropertyDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link PropertyDependency} proxy from a {@link Dependency} stereotyped << PropertyDependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link PropertyDependency} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("03f9d44b-f632-45f4-b216-039f96a28449")
=======
    @objid ("89025ab8-152f-4795-adb1-167616c08c8d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PropertyDependency instantiate(final Dependency obj) {
        return PropertyDependency.canInstantiate(obj) ? new PropertyDependency(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertyDependency} proxy from a {@link Dependency} stereotyped << PropertyDependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link PropertyDependency} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("339ea49c-520d-403c-832d-65b428f5259f")
=======
    @objid ("86f65568-801d-491d-9595-0bc1db4529e2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PropertyDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (PropertyDependency.canInstantiate(obj))
        	return new PropertyDependency(obj);
        else
        	throw new IllegalArgumentException("PropertyDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("0df0ac20-45ba-4c3d-b68c-fbd0317ed5c7")
=======
    @objid ("2d0cf29a-8298-4987-a100-7f3f6ad30a60")
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
        PropertyDependency other = (PropertyDependency) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("36df797e-0cf9-44af-b698-606e1fd5708f")
=======
    @objid ("72d5ab50-d547-46df-a9b4-5d7172b48580")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

<<<<<<< HEAD
    @objid ("f540928e-0f63-447f-9013-3c872e94c0ee")
=======
    @objid ("8943e336-71f7-4ec3-8752-b385841bc458")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cf3e9910-f949-41ac-bcae-e3a97c13976d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("85184eb6-f811-4643-b779-49df566ecbfe")
=======
    @objid ("5cfa7b2e-4d42-4a80-970b-a4bfe0e23498")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected PropertyDependency(final Dependency elt) {
        super(elt);
    }

    @objid ("ee885f54-f4e7-4fbc-9bb2-acd65bf59695")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("28347eec-12ee-4015-a386-a5d5b2ea6e81")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("599046b9-5003-4cfd-8af5-b684ea9715e4")
        private static Stereotype MDAASSOCDEP;

        @objid ("009d2049-513f-4b85-bcba-85ba46f1228a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dea7e52e-5f00-4285-a57c-5caec28ba719")
=======
        @objid ("fe35a4b3-c5e3-4898-a5e3-39548c8e247e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e431c672-64d2-4a32-bbc5-858be7ca173e")
        private static Stereotype MDAASSOCDEP;

        @objid ("07e30b38-192c-40aa-99d6-fc0bc6e27276")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("170a8693-d034-406a-aa0c-a68a0dbae2f0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "738c4b6c-0cf3-4276-b6d9-7fe4ec31ff01");
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
